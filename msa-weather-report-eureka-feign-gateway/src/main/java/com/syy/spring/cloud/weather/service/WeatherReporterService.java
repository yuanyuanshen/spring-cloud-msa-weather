package com.syy.spring.cloud.weather.service;

import com.syy.spring.cloud.weather.vo.Weather;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月15日 上午10:24:32
* 类说明 天气预报接口
*/
public interface WeatherReporterService {
	Weather  getDataByCityName(String cityName);
}
