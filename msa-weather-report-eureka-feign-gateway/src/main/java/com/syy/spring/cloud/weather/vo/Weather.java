/**
 * 2018年3月6日
 */
package com.syy.spring.cloud.weather.vo;

import java.io.Serializable;
import java.util.List;

/**
 * 天气类
 * 
 * @author 作者：shenyuanyuan E-mail:
 * @version 创建时间：2018年3月6日 上午11:17:05 类说明
 */
public class Weather implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String shidu;
	private String ganmao;
	private String wendu;
	private String quality;
	private Integer pm25;
	private Integer pm10;
	private Yesterday yesterday;
	private List<Forecast> forecast;
	public String getShidu() {
		return shidu;
	}
	public void setShidu(String shidu) {
		this.shidu = shidu;
	}
	public String getGanmao() {
		return ganmao;
	}
	public void setGanmao(String ganmao) {
		this.ganmao = ganmao;
	}
	public String getWendu() {
		return wendu;
	}
	public void setWendu(String wendu) {
		this.wendu = wendu;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	public Integer getPm25() {
		return pm25;
	}
	public void setPm25(Integer pm25) {
		this.pm25 = pm25;
	}
	public Integer getPm10() {
		return pm10;
	}
	public void setPm10(Integer pm10) {
		this.pm10 = pm10;
	}
	public Yesterday getYesterday() {
		return yesterday;
	}
	public void setYesterday(Yesterday yesterday) {
		this.yesterday = yesterday;
	}
	public List<Forecast> getForecast() {
		return forecast;
	}
	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}