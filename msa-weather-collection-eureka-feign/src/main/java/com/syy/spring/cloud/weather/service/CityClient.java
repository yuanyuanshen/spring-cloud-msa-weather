package com.syy.spring.cloud.weather.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.syy.spring.cloud.weather.vo.City;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月21日 上午11:03:52
* 类说明
*/
@FeignClient("MSA-WEATHER-CITY-EUREKA")
public interface CityClient {
	@GetMapping("/cities")
	List<City> getCityList();
}
