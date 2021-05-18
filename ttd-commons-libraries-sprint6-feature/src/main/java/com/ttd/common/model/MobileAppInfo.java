package com.ttd.common.model;

import java.math.BigDecimal;

public class MobileAppInfo {

	private BigDecimal userId;
	
	private String deviceToken;
	
	private String osType;

	public BigDecimal getUserId() {
		return userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public String getDeviceToken() {
		return deviceToken;
	}

	public void setDeviceToken(String deviceToken) {
		this.deviceToken = deviceToken;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
	
}
