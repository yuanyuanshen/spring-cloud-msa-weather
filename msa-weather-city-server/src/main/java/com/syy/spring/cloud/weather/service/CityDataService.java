package com.syy.spring.cloud.weather.service;

import java.util.List;

import javax.xml.bind.JAXBException;

import com.syy.spring.cloud.weather.vo.City;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月14日 下午2:44:42
* 类说明
*/
public interface CityDataService {
	List<City> getCityList() throws JAXBException;
}
