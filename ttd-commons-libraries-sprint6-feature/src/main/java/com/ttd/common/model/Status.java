package com.ttd.common.model;

import com.ttd.common.security.model.UserInformation;

public class Status {

	private long userId;
	private boolean smsVerification;
	private boolean emailVerification;
	private boolean userStatus;
	private String registrationEmailLink;
	private String otpType;
	private boolean isEmail;
	private boolean isUserVerified;
	private boolean isPasswordVerified;
	private String password;
	private String watchListFlag;
	private String mobileNumber;
	private boolean isLogout;
	private boolean isSessionOut;
	private boolean isLoginSuccess;
	private String errorMessage;
	
	private UserInformation userInformation;

	public String getWatchListFlag() {
		return watchListFlag;
	}

	public void setWatchListFlag(String watchListFlag) {
		this.watchListFlag = watchListFlag;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getUserId() {
		return userId;
	}

	public boolean isUserVerified() {
		return isUserVerified;
	}

	public void setUserVerified(boolean isUserVerified) {
		this.isUserVerified = isUserVerified;
	}

	public boolean isPasswordVerified() {
		return isPasswordVerified;
	}

	public void setPasswordVerified(boolean isPasswordVerified) {
		this.isPasswordVerified = isPasswordVerified;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public boolean getSmsVerification() {
		return smsVerification;
	}

	public void setSmsVerification(boolean smsVerification) {
		this.smsVerification = smsVerification;
	}

	public boolean getEmailVerification() {
		return emailVerification;
	}

	public void setEmailVerification(boolean emailVerification) {
		this.emailVerification = emailVerification;
	}

	public boolean getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(boolean userStatus) {
		this.userStatus = userStatus;
	}

	public String getRegistrationEmailLink() {
		return registrationEmailLink;
	}

	public void setRegistrationEmailLink(String registrationEmailLink) {
		this.registrationEmailLink = registrationEmailLink;
	}

	public String getOtpType() {
		return otpType;
	}

	public void setOtpType(String otpType) {
		this.otpType = otpType;
	}

	public boolean getIsEmail() {
		return isEmail;
	}

	public void setIsEmail(boolean isEmail) {
		this.isEmail = isEmail;
	}

	public boolean isLogout() {
		return isLogout;
	}

	public void setLogout(boolean isLogout) {
		this.isLogout = isLogout;
	}

	public boolean isSessionOut() {
		return isSessionOut;
	}

	public void setSessionOut(boolean isSessionOut) {
		this.isSessionOut = isSessionOut;
	}

	public boolean isLoginSuccess() {
		return isLoginSuccess;
	}

	public void setLoginSuccess(boolean isLoginSuccess) {
		this.isLoginSuccess = isLoginSuccess;
	}

	public UserInformation getUserInformation() {
		return userInformation;
	}

	public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
