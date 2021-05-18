package com.ttd.common.model;

import java.math.BigDecimal;

public class PGDetails {

	private String firstName;
	private String lastName;
	private BigDecimal amount;
	private String userId;
	private String behalf;
	private String trustName;
	private String schemeName;
	private String occasionOf;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBehalf() {
		return behalf;
	}
	public void setBehalf(String behalf) {
		this.behalf = behalf;
	}
	public String getTrustName() {
		return trustName;
	}
	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}
	public String getSchemeName() {
		return schemeName;
	}
	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}
	public String getOccasionOf() {
		return occasionOf;
	}
	public void setOccasionOf(String occasionOf) {
		this.occasionOf = occasionOf;
	}
	
	
}
