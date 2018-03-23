package com.syy.spring.cloud.weather.config;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.syy.spring.cloud.weather.job.WeatherDataSyncJob;

/**
* @author 作者：shenyuanyuan E-mail:
* @version 创建时间：2018年3月13日 下午3:17:43
* 类说明 Quartz配置类
*/
@Configuration
public class QuartzConfiguration {
	
	private static final int TIME = 259200000; // 更新频率
	// Jobdetail
	// Triger
	@Bean
	public JobDetail weatherDataSyncJobDetail() {
		return  JobBuilder.newJob(WeatherDataSyncJob.class).withIdentity("weatherSyncJob").storeDurably().build();
	}
	
	@Bean
	public Trigger weatherDataSyncTrigger() {
		SimpleScheduleBuilder schedBuilder = SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(259200000).repeatForever();
		return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobDetail()).withIdentity("weatherDataSyncTrigger").withSchedule(schedBuilder).build();
	}
	
}
