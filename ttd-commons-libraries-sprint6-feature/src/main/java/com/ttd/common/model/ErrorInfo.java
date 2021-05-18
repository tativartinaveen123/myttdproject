package com.ttd.common.model;

public class ErrorInfo {

	private String errorURL;

	public String getErrorURL() {
		return errorURL;
	}

	public void setErrorURL(String errorURL) {
		this.errorURL = errorURL;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	private String errorMessage;

	public ErrorInfo(String errorURL, String errorMessage) {
		this.errorURL = errorURL;
		this.errorMessage = errorMessage;
	}

	public ErrorInfo() {
		
	}

}
