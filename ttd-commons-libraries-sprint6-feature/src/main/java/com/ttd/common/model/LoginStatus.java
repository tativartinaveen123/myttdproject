package com.ttd.common.model;

public class LoginStatus {

	private boolean isLoginSuccess;
	private boolean emailVerfyFailed;
	private boolean smsVerfyFailed;
	private String mobileNumber;
	private String userId;
	private String userRole;
	private String watchListFlag;
	private String accountStatus;
	private String GlobalPropertyValue;
	private String dipStatus;
	private String darshanDipStatus;
	private String lastLogin;
	private String mobilCheck;
	private String isUserLoggedIn;

	

	public String getIsUserLoggedIn() {
		return isUserLoggedIn;
	}

	public void setIsUserLoggedIn(String isUserLoggedIn) {
		this.isUserLoggedIn = isUserLoggedIn;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public boolean isLoginSuccess() {
		return isLoginSuccess;
	}

	public void setLoginSuccess(boolean isLoginSuccess) {
		this.isLoginSuccess = isLoginSuccess;
	}

	public boolean isEmailVerfyFailed() {
		return emailVerfyFailed;
	}

	public void setEmailVerfyFailed(boolean emailVerfyFailed) {
		this.emailVerfyFailed = emailVerfyFailed;
	}

	public boolean isSmsVerfyFailed() {
		return smsVerfyFailed;
	}

	public void setSmsVerfyFailed(boolean smsVerfyFailed) {
		this.smsVerfyFailed = smsVerfyFailed;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getWatchListFlag() {
		return watchListFlag;
	}

	public void setWatchListFlag(String watchListFlag) {
		this.watchListFlag = watchListFlag;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getGlobalPropertyValue() {
		return GlobalPropertyValue;
	}

	public void setGlobalPropertyValue(String globalPropertyValue) {
		GlobalPropertyValue = globalPropertyValue;
	}

	public String getDipStatus() {
		return dipStatus;
	}

	public void setDipStatus(String dipStatus) {
		this.dipStatus = dipStatus;
	}

	public String getDarshanDipStatus() {
		return darshanDipStatus;
	}

	public void setDarshanDipStatus(String darshanDipStatus) {
		this.darshanDipStatus = darshanDipStatus;
	}

	public String getMobilCheck() {
		return mobilCheck;
	}

	public void setMobilCheck(String mobilCheck) {
		this.mobilCheck = mobilCheck;
	}
	
	

}
