package com.syy.spring.cloud.weather.util;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月14日 下午2:35:40
* 类说明 将xmlstr转化成object
*/
public class XmlBuilder {
	public static Object xmlStrToObject(Class<?> clazz,String xmlStr) throws JAXBException, IOException {
		Object xmlObject = null;
		JAXBContext context = JAXBContext.newInstance(clazz);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Reader reader = null;
		reader = new StringReader(xmlStr);
		xmlObject = unmarshaller.unmarshal(reader);
		if (reader != null) {
			reader.close();
		}
		return xmlObject;
	}
}
