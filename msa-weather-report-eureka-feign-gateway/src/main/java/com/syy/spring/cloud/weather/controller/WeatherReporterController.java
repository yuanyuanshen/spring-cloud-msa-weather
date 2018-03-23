package com.syy.spring.cloud.weather.controller;

import java.util.List;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.syy.spring.cloud.weather.service.CityClient;
import com.syy.spring.cloud.weather.service.DataClient;
import com.syy.spring.cloud.weather.service.WeatherReporterService;
import com.syy.spring.cloud.weather.vo.City;

/**
 * @author 作者：shenyuanyuan E-mail:
 * @version 创建时间：2018年3月15日 上午10:32:48 类说明
 */
@RestController
@RequestMapping(value = "/reporter")
public class WeatherReporterController {

	private final static Logger logger = LoggerFactory.getLogger(WeatherReporterController.class);
	
	@Autowired
	private WeatherReporterService weatherReporterService;// 获取城市天气预报
	
	@Autowired
	private DataClient dataClient;

	@GetMapping("/cityName/{cityName}")
	public ModelAndView getReporterByCityName(@PathVariable("cityName") String cityName, Model model)
			throws JAXBException {
		List<City> cityList = null;

		try {

			// TODO 改为由城市数据API微服务提供数据
			cityList = dataClient.getCityList();

		} catch (Exception e) {
			logger.error("Exception!", e);
		}

		model.addAttribute("title", "媛媛的天气预报");
		model.addAttribute("cityName", cityName);
		model.addAttribute("cityList", cityList);
		model.addAttribute("report", weatherReporterService.getDataByCityName(cityName));
		return new ModelAndView("weather/report", "reportModel", model);
	}
}
