package com.syy.spring.cloud.weather.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syy.spring.cloud.weather.service.DataClient;
import com.syy.spring.cloud.weather.service.WeatherDataClient;
import com.syy.spring.cloud.weather.service.WeatherReporterService;
import com.syy.spring.cloud.weather.vo.Forecast;
import com.syy.spring.cloud.weather.vo.Weather;
import com.syy.spring.cloud.weather.vo.WeatherResponse;

/**
 * @author 作者：shenyuanyuan E-mail:
 * @version 创建时间：2018年3月15日 上午10:27:33 类说明 天气预报接口实现
 */
@Service
public class WeatherReporterServiceImpl implements WeatherReporterService {

	@Autowired
	private DataClient dataClient;

	@Override
	public Weather getDataByCityName(String cityName) {
		// 改为由天气数据API微服务来提供
		WeatherResponse resp = dataClient.getWeatherDataByCityName(cityName);
		Weather data = resp.getData();
		return data;
	}

}
