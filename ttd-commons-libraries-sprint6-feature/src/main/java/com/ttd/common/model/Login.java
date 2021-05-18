package com.ttd.common.model;

public class Login {
	
	private String userName;
	private String userPassword;
	private String captchaResponse;
	private String sessionId;
	private String requestChannel;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getCaptchaResponse() {
		return captchaResponse;
	}
	public void setCaptchaResponse(String captchaResponse) {
		this.captchaResponse = captchaResponse;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getRequestChannel() {
		return requestChannel;
	}
	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}
	
	
	
}
