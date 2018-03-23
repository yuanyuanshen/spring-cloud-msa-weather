package com.syy.spring.cloud.weather.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.syy.spring.cloud.weather.service.WeatherReporterService;
import com.syy.spring.cloud.weather.vo.Forecast;
import com.syy.spring.cloud.weather.vo.Weather;
import com.syy.spring.cloud.weather.vo.WeatherResponse;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月15日 上午10:27:33
* 类说明  天气预报接口实现
*/
@Service
public class WeatherReporterServiceImpl implements WeatherReporterService {

	@Override
	public Weather getDataByCityName(String cityName) {
		// TODO 改为由天气数据API微服务来提供
				Weather data = new Weather();
				data.setShidu("81");
				data.setGanmao("容易感冒！多穿衣");
				data.setWendu("22");
				
				List<Forecast> forecastList = new ArrayList<>();
				
				Forecast forecast = new Forecast();
				forecast.setDate("25日星期天");
				forecast.setType("晴");
				forecast.setFl("无风");
				forecast.setHigh("高温 11度");
				forecast.setLow("低温 1度");
				forecastList.add(forecast);
				
				forecast = new Forecast();
				forecast.setDate("26日星期天");
				forecast.setType("晴");
				forecast.setFl("无风");
				forecast.setHigh("高温 11度");
				forecast.setLow("低温 1度");
				forecastList.add(forecast);
				
				forecast = new Forecast();
				forecast.setDate("27日星期天");
				forecast.setType("晴");
				forecast.setFl("无风");
				forecast.setHigh("高温 11度");
				forecast.setLow("低温 1度");
				forecastList.add(forecast);
				
				forecast = new Forecast();
				forecast.setDate("28日星期天");
				forecast.setType("晴");
				forecast.setFl("无风");
				forecast.setHigh("高温 11度");
				forecast.setLow("低温 1度");
				forecastList.add(forecast);
				
				forecast = new Forecast();
				forecast.setDate("29日星期天");
				forecast.setType("晴");
				forecast.setFl("无风");
				forecast.setHigh("高温 11度");
				forecast.setLow("低温 1度");
				forecastList.add(forecast);
				
				data.setForecast(forecastList);
				return data;
	}

}
