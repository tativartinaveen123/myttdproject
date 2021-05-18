package com.ttd.common.model;

public class GlobalExceptionInfo {
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	} 
	
	public GlobalExceptionInfo(String errorMessage) {
		this.errorMessage = errorMessage;
	}
    public GlobalExceptionInfo() {
    	
    }
}
