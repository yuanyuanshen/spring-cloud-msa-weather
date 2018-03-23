package com.syy.spring.cloud.weather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WeatherDataServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherDataServerApplication.class, args);
	}
}
