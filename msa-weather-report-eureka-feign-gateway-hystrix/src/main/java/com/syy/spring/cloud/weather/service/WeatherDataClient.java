package com.syy.spring.cloud.weather.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.syy.spring.cloud.weather.vo.WeatherResponse;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月21日 上午11:11:10
* 类说明
*/
@FeignClient("MSA-WEATHER-DATA-EUREKA")
public interface WeatherDataClient {
	@GetMapping("/weather/cityName/{cityName}")
	public WeatherResponse getWeatherDataByCityName(@PathVariable("cityName") String cityName);
}
