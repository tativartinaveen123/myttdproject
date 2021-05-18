package com.ttd.common.model;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.ttd.common.entity.State;

public class CountryModel{
	
	
	private int id;
	private String country_name;
	private BigDecimal dialCode;
	private String countryCode;
	private String country3DigitCode;
	private BigDecimal createdBy;
	private Date createdTime;
	private BigDecimal rowStatus;
	private BigDecimal updatedBy;
	private Date updatedTime;
	private List<State> states;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public BigDecimal getDialCode() {
		return dialCode;
	}
	public void setDialCode(BigDecimal dialCode) {
		this.dialCode = dialCode;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountry3DigitCode() {
		return country3DigitCode;
	}
	public void setCountry3DigitCode(String country3DigitCode) {
		this.country3DigitCode = country3DigitCode;
	}
	public BigDecimal getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public BigDecimal getRowStatus() {
		return rowStatus;
	}
	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}
	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedTime() {
		return updatedTime;
	}
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	public List<State> getStates() {
		return states;
	}
	public void setStates(List<State> states) {
		this.states = states;
	}

}
