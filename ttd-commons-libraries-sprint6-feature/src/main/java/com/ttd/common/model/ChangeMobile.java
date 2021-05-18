package com.ttd.common.model;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class ChangeMobile {

	@Pattern(regexp = "(^$|[0-9]{0,15})")
	@Size(min = 0, max = 15)
	String mobileNumber;

	@Pattern(regexp="^([a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*[a-zA-Z0-9]+"
			+"[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*)@[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]"
			+"*(\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*)$")
	String userName;

	String countryCode;
	

	
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

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	
	
}
