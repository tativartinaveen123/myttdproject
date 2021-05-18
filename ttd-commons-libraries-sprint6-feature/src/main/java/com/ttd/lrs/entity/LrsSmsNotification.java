package com.ttd.lrs.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.ehundi.entity.HundiOffering;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SMS_NOTIFICATION database table.
 * 
 */
@Entity
@Table(name="LRS_SMS_NOTIFICATION")
//@NamedQuery(name="SmsNotification.findAll", query="SELECT s FROM SmsNotification s")
public class LrsSmsNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LRS_SMS_NOTIFICATION_ID")
	@SequenceGenerator(name="LRS_SMS_NOTIFCATION_GENERATOR", sequenceName="LRS_SMS_NOTIFICATION_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LRS_SMS_NOTIFCATION_GENERATOR")
	private long lrsSmsNotificationId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SMS_MESSAGE")
	private String smsMessage;

	@Column(name="SMS_MOBILE_NUMBER")
	private String smsMobileNumber;

	@Column(name="SMS_STATUS")
	private String smsStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public LrsSmsNotification() {
	}

	public long getLrsSmsNotificationId() {
		return lrsSmsNotificationId;
	}

	public void setLrsSmsNotificationId(long lrsSmsNotificationId) {
		this.lrsSmsNotificationId = lrsSmsNotificationId;
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