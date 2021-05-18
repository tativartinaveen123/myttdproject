package com.ttd.common.model;

import java.math.BigDecimal;
import java.util.Date;

public class SmsNotificationDetails {

	private long smsNotificationId;

	private BigDecimal createdBy;

	private Date createdTime;

	private BigDecimal rowStatus;

	private String smsMessage;

	private String smsMobileNumber;

	private String smsStatus;

	private BigDecimal updatedBy;

	private Date updatedTime;
	
	private String offeringId;
	
	private boolean vacateFlag;
	
	private String templateId;
	
	

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public boolean isVacateFlag() {
		return vacateFlag;
	}

	public void setVacateFlag(boolean vacateFlag) {
		this.vacateFlag = vacateFlag;
	}

	public long getSmsNotificationId() {
		return smsNotificationId;
	}

	public void setSmsNotificationId(long smsNotificationId) {
		this.smsNotificationId = smsNotificationId;
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

	public String getSmsMessage() {
		return smsMessage;
	}

	public void setSmsMessage(String smsMessage) {
		this.smsMessage = smsMessage;
	}

	public String getSmsMobileNumber() {
		return smsMobileNumber;
	}

	public void setSmsMobileNumber(String smsMobileNumber) {
		this.smsMobileNumber = smsMobileNumber;
	}

	public String getSmsStatus() {
		return smsStatus;
	}

	public void setSmsStatus(String smsStatus) {
		this.smsStatus = smsStatus;
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

	public String getOfferingId() {
		return offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

}
