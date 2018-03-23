package com.syy.spring.cloud.weather.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月22日 下午3:12:30
* 类说明
*/
@RestController
public class HelloWorld {

	@Value("${auther}")
    private String auther;
    
    @Value("${port}")
    private String port;

    @RequestMapping("/message")
    String getMessage() {
        return this.auther + this.port;
    }
}
