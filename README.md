# spring-cloud-msa-weather
基于SpringCloud的天气预报微服务

## 所涉及到的技术及相关版本如下

* MAC OS 11.0
* JDK 8
* Eclipse 
* Gradle 4.6
* Spring Boot 2.0.0.
* Spring Boot Web Starter 2.0.0.RELEASE
* Apache HttpClient 4.5.3
* Spring Boot Data Redis Starter 2.0.0.RELEASE
* Redis 4.0.8
* Spring Boot Quartz Starter 2.0.0.RELEASE
* Quartz Scheduler 2.0.0.RELEASE
* Spring Boot Thymeleaf Starter 2.0.0.RELEASE
* Thymeleaf 2.0.0.RELEASE
* Bootstrap 4.0.0-beta.2
* Spring Boot 2.0.0.RELEASE
* Spring Cloud Starter Netflix Eureka Server Finchley.M8
* Spring Cloud Starter Netflix Eureka Client Finchley.M8
* Spring Cloud Starter Netflix Ribbon Finchley.M8
* Spring Cloud Starter OpenFeign Finchley.M8
* Spring Cloud Starter Netflix Zuul Finchley.M8
* Spring Cloud Config Server Finchley.M8
* Spring Cloud Config Client Finchley.M8
* Spring Cloud Starter Netflix Hystrix Finchley.M8


## 关于技术的相关版本

* Spring Boot 和 Spring Cloud 的版本需要对应，否则程序运行会出问题
* 以上相关版本，直接使用Spring Cloud 官方代码Gradle配置会报错，所以都是去https://start/spring/io进行下载的


## 关于天气预报接口

* 开始不知道，国家天气预报网一直访问不到，所以需要自己去百度网上靠谱的天气预报接口，自己实现pojo类
* 代码中使用的天气预报接口是https://www.sojson.com/api/weather.html 有具体要求，比如不能频繁的调用啥的
* 建议去靠谱天气预报API 注册一个账号 就不用担心测试问题

## 代码学习顺序

* 天气数据采集微服务的实现`msa-weather-collection-server`
* 天气数据API微服务的实现`msa-weather-data-server`
* 天气预报微服务的实现`msa-weather-report-server`
* 城市数据API微服务的实现`msa-weather-city-server`
* 如何集成 Eureka Server`micro-weather-eureka-server`
* 如何集成 Eureka Client`micro-weather-eureka-client`
* 实现服务的注册与发现`msa-weather-collection-eureka`、`msa-weather-data-eureka`、`msa-weather-city-eureka`、`msa-weather-report-eureka`
* 常见微服务的消费者`micro-weather-eureka-client-feign`
* 使用 Feign 实现服务的消费者`msa-weather-collection-eureka-feign`、`msa-weather-report-eureka-feign`
* 如何集成Zuul`micro-weather-eureka-client-zuul`
* 实现 API 网关`msa-weather-report-eureka-feign-gateway`、`msa-weather-eureka-client-zuul`
* 使用 Config 实现的配置中心`micro-weather-config-server`、`micro-weather-config-client`
* 如何集成 Hystrix`micro-weather-eureka-client-feign-hystrix`
* 实现微服务的熔断机制`msa-weather-report-eureka-feign-gateway-hystrix`


## 采坑

* 版本匹配问题，去https://start/spring/io 获取gradle配置文件基本不会出现问题
* 代码中 比如 天气预报接口返回乱码等问题  代码中已解决
* Eureka 服务有缓存，获取数据不对 ，可以通过更换客户端端口解决，目前不知道更好的解决办法。
* 还有很多坑 ，如果遇到可以给我留言探讨 

## 源码地址：https://github.com/yuanyuanshen/spring-cloud-msa-weather






