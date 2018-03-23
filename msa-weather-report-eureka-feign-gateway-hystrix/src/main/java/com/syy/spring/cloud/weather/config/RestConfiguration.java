package com.syy.spring.cloud.weather.config;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * @author 作者：shenyuanyuan E-mail:
 * @version 创建时间：2018年3月7日 下午3:01:09 类说明
 */

@Configuration
public class RestConfiguration {

	@Bean
	public RestTemplate restTemplate() {
//		StringHttpMessageConverter m = new StringHttpMessageConverter(Charset.forName("UTF-8"));
//		RestTemplateBuilder restTemplateBuilder = new RestTemplateBuilder();
//		return restTemplateBuilder.additionalMessageConverters(m).build();
		
		RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));

        return restTemplate;
	}
}
