package com.syy.spring.cloud.weather.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.syy.spring.cloud.weather.vo.City;
import com.syy.spring.cloud.weather.vo.WeatherResponse;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月23日 上午11:00:34
* 类说明
*/
@Component
public class DataClientFallback implements DataClient {

	@Override
	public List<City> getCityList() {
		// TODO Auto-generated method stub
		List<City> cityList = null;
		cityList = new ArrayList<>();
		
		City city = new City();
		city.setCityName("深圳");
		cityList.add(city);
		
		city = new City();
		city.setCityName("惠州");
		cityList.add(city);
		
		return cityList;
	}

	@Override
	public WeatherResponse getWeatherDataByCityName(String cityName) {
		// TODO Auto-generated method stub
		return null;
	}

}
