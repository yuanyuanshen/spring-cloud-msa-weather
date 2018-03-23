package com.syy.spring.cloud.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.syy.spring.cloud.weather.service.CityDataService;
import com.syy.spring.cloud.weather.vo.City;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月19日 下午3:16:28
* 类说明
*/
@RestController
@RequestMapping("/cities")
public class CityController {
	@Autowired
	private CityDataService cityDataService;
	
	@GetMapping
	public List<City> listCity() throws Exception {
		return cityDataService.getCityList();
	}
}
