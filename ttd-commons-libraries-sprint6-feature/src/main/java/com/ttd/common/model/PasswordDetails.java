package com.ttd.common.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class PasswordDetails {
	
	int flag;
	@Pattern(regexp="(^$|[0-9]{10,12})")
	@Size(min=10,max=12)
	String mobileNumber;
	@Pattern(regexp="^([a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*[a-zA-Z0-9]+"
			+"[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*)@[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]"
			+"*(\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*)$")
	String userName;
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
