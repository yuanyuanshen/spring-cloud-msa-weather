package com.syy.spring.cloud.weather.service;
/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月19日 下午1:52:24
* 类说明
*/
public interface WeatherDataCollectionService {
	void syncDateByCityName(String cityName);
}
