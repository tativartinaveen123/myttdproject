package com.ttd.edarshan.dip.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SEDDIP_SELE_SMS_NOTIFICATION database table.
 * 
 */
@Entity
@Table(name="SEDDIP_SELE_SMS_NOTIFICATION")
@NamedQuery(name="SeddipSeleSmsNotification.findAll", query="SELECT s FROM SeddipSeleSmsNotification s")
public class SeddipSeleSmsNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SMS_MESSAGE")
	private String smsMessage;

	@Column(name="SMS_MOBILE_NUMBER")
	private String smsMobileNumber;
	
	@Id
	@Column(name="SMS_NOTIFICATION_ID")
	private String smsNotificationId;

	@Column(name="SMS_STATUS")
	private String smsStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public SeddipSeleSmsNotification() {
	}

	public BigDecimal getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSmsMessage() {
		return this.smsMessage;
	}

	public void setSmsMessage(String smsMessage) {
		this.smsMessage = smsMessage;
	}

	public String getSmsMobileNumber() {
		return this.smsMobileNumber;
	}

	public void setSmsMobileNumber(String smsMobileNumber) {
		this.smsMobileNumber = smsMobileNumber;
	}

	public String getSmsNotificationId() {
		return this.smsNotificationId;
	}

	public void setSmsNotificationId(String smsNotificationId) {
		this.smsNotificationId = smsNotificationId;
	}

	public String getSmsStatus() {
		return this.smsStatus;
	}

	public void setSmsStatus(String smsStatus) {
		this.smsStatus = smsStatus;
	}

	public BigDecimal getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

}