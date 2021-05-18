package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.donor.entity.DollarBooking;
import com.ttd.ehundi.entity.HundiOffering;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SMS_NOTIFICATION database table.
 * 
 */
@Entity
@Table(name="SMS_NOTIFICATION")
//@NamedQuery(name="SmsNotification.findAll", query="SELECT s FROM SmsNotification s")
public class SmsNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SMS_NOTIFICATION_ID")
	@SequenceGenerator(name="SMS_NOTIFCATION_GENERATOR", sequenceName="sms_notifcation_sms_notifi", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SMS_NOTIFCATION_GENERATOR")
	private long smsNotificationId;

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
	

	@Column(name="TEMPLATE_ID")
	private String templateId;
	

	@Column(name="ENTITY_ID")
	private String entityId;

	//bi-directional many-to-one association to HundiOffering
	@OneToMany(mappedBy="smsNotification")
	private List<HundiOffering> hundiOfferings;
	
	//bi-directional many-to-one association to DollarBooking
			@OneToMany(mappedBy="smsNotification")
			private List<DollarBooking> dollarBookings;
			
			

			public List<DollarBooking> getDollarBookings() {
				return dollarBookings;
			}

			public void setDollarBookings(List<DollarBooking> dollarBookings) {
				this.dollarBookings = dollarBookings;
			}


	public SmsNotification() {
	}

	public long getSmsNotificationId() {
		return this.smsNotificationId;
	}

	public void setSmsNotificationId(long smsNotificationId) {
		this.smsNotificationId = smsNotificationId;
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

	public List<HundiOffering> getHundiOfferings() {
		return this.hundiOfferings;
	}

	public void setHundiOfferings(List<HundiOffering> hundiOfferings) {
		this.hundiOfferings = hundiOfferings;
	}

	public HundiOffering addHundiOffering(HundiOffering hundiOffering) {
		getHundiOfferings().add(hundiOffering);
		hundiOffering.setSmsNotification(this);

		return hundiOffering;
	}

	public HundiOffering removeHundiOffering(HundiOffering hundiOffering) {
		getHundiOfferings().remove(hundiOffering);
		hundiOffering.setSmsNotification(null);

		return hundiOffering;
	}



	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	

}