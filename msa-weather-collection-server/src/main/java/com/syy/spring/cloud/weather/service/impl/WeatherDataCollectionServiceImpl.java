package com.syy.spring.cloud.weather.service.impl;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.syy.spring.cloud.weather.service.WeatherDataCollectionService;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月19日 下午1:53:41
* 类说明
*/
@Service
public class WeatherDataCollectionServiceImpl implements WeatherDataCollectionService {

	private final static Logger logger = LoggerFactory.getLogger(WeatherDataCollectionServiceImpl.class);
	private static final String WEATHER_URI = "https://www.sojson.com/open/api/weather/json.shtml?city=";

	private static final Long TIME_OUT = 1800L;

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Override
	public void syncDateByCityName(String cityName) {
		// TODO Auto-generated method stub
		String uri = WEATHER_URI + cityName;
		this.saveWeatherData(uri);
	}
	
	private void saveWeatherData(String uri) {
		// TODO Auto-generated method stub
		String key = uri;
		String strBody = null;
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		// 缓存中没有数据就发送请求
		ResponseEntity<String> respString = restTemplate.getForEntity(uri, String.class);

		if (respString.getStatusCodeValue() == 200) {
			strBody = respString.getBody();
		}
		logger.info("redis 添加缓存 ，key={}",uri);
		// 写入缓存数据
		ops.set(key, strBody, TIME_OUT, TimeUnit.SECONDS);

	}

}
