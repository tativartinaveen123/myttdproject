package com.ttd.common.model;

import java.util.Date;

public class ResetPasswordInfo {

	private long userId;
	
	private String userFirstName;
	
	private String userEmail;
	
	private String userPhoneMobile;
	
	private Date updatedTime;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhoneMobile() {
		return userPhoneMobile;
	}

	public void setUserPhoneMobile(String userPhoneMobile) {
		this.userPhoneMobile = userPhoneMobile;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	
	
}
