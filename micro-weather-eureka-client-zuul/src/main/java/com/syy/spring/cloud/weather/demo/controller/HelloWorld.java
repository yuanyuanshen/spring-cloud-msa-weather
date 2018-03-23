package com.syy.spring.cloud.weather.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月21日 下午3:08:32
* 类说明
*/
@RestController
public class HelloWorld {
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello syy";
	}
}
