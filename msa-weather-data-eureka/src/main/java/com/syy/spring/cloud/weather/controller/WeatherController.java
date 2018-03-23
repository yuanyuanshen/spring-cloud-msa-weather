package com.syy.spring.cloud.weather.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syy.spring.cloud.weather.service.WeatherDataService;
import com.syy.spring.cloud.weather.vo.WeatherResponse;

/**
 * @author 作者：shenyuanyuan E-mail:
 * @version 创建时间：2018年3月6日 下午2:37:44 类说明
 */
@RestController
@RequestMapping(value = "/weather")
public class WeatherController {
	@Autowired
	private WeatherDataService weatherDataService;

	@GetMapping("/cityId/{cityId}")
	public WeatherResponse getWeatherByCityId(@PathVariable("cityId") String cityId) {
		return weatherDataService.getDataByCityId(cityId);
	}

	@GetMapping("/cityName/{cityName}")
	public WeatherResponse getWeatherByCityName(@PathVariable("cityName") String cityName) {
		System.out.println(cityName);
		return weatherDataService.getDataByCityName(cityName);
	}

}
