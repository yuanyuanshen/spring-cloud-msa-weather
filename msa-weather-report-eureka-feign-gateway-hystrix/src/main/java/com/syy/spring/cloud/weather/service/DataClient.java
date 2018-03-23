package com.syy.spring.cloud.weather.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.syy.spring.cloud.weather.vo.City;
import com.syy.spring.cloud.weather.vo.WeatherResponse;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月21日 上午11:03:52
* 类说明
*/
@FeignClient(name="MSA-WEATHER-EUREKA-CLIENT-ZUUL",fallback=DataClientFallback.class)
public interface DataClient {
	
	@GetMapping("/city/cities")
	List<City> getCityList();
	
	@GetMapping("/data/weather/cityName/{cityName}")
	WeatherResponse getWeatherDataByCityName(@PathVariable("cityName") String cityName);
}
