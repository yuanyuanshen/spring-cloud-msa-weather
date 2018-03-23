package com.syy.spring.cloud.weather.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import com.syy.spring.cloud.weather.service.CityDataService;
import com.syy.spring.cloud.weather.util.XmlBuilder;
import com.syy.spring.cloud.weather.vo.City;
import com.syy.spring.cloud.weather.vo.CityList;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月14日 下午2:46:16
* 类说明
*/
@Service
public class CityDataServiceImpl implements CityDataService {

	@Override
	public List<City> getCityList() throws JAXBException {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("citylist.xml");
		BufferedReader br = null;
		StringBuffer sb = null;
		CityList cityList = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
			sb = new StringBuffer();
			String line = "";
			while((line = br.readLine()) != null){
				sb.append(line);
			}
			br.close();
			cityList = (CityList)XmlBuilder.xmlStrToObject(CityList.class, sb.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return cityList.getCityList();
	}

}
