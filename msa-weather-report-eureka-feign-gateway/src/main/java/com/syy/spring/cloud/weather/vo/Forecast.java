package com.syy.spring.cloud.weather.vo;

import java.io.Serializable;

/**
 * 未来天气
 * 
 * @author 作者：shenyuanyuan E-mail:
 * @version 创建时间：2018年3月6日 上午11:17:05 类说明
 */
public class Forecast implements Serializable {

	private static final long serialVersionUID = 1L;
	private String date;
	private String high;
	private String low;
	private String sunrise;
	private String sunset;
	private Integer aqi;
	private String fx;
	private String fl;
	private String type;
	private String notice;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getSunrise() {
		return sunrise;
	}
	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}
	public String getSunset() {
		return sunset;
	}
	public void setSunset(String sunset) {
		this.sunset = sunset;
	}
	public Integer getAqi() {
		return aqi;
	}
	public void setAqi(Integer aqi) {
		this.aqi = aqi;
	}
	public String getFx() {
		return fx;
	}
	public void setFx(String fx) {
		this.fx = fx;
	}
	public String getFl() {
		return fl;
	}
	public void setFl(String fl) {
		this.fl = fl;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
