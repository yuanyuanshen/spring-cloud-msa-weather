package com.syy.spring.cloud.weather.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	
	@Value("${auther}")
	private String auther;
	
	@Value("${port}")
	private String port;
	
	@Test
	public void contextLoads() {
		assertEquals("syy", auther);
	}

}
