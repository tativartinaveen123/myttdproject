package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USER_FEEDBACK database table.
 * 
 */
@Entity
@Table(name="USER_FEEDBACK")
@NamedQuery(name="UserFeedback.findAll", query="SELECT u FROM UserFeedback u")
public class UserFeedback implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USER_FEEDBACK_SEQ_ID_GENERATOR", sequenceName="USER_FEEDBACK_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_FEEDBACK_SEQ_ID_GENERATOR") 
	@Column(name="USER_FEEDBACK_ID")
	private long userFeedbackId;

	@Column(name="BOOKING_PROCESSRATING")
	private BigDecimal bookingProcessrating;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="OVERALL_WEBSITERATING")
	private BigDecimal overallWebsiterating;

	@Column(name="PAYMENT_GATEWAYRATING")
	private BigDecimal paymentGatewayrating;

	@Column(name="REGISTRATION_PROCESSRATING")
	private BigDecimal registrationProcessrating;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	private String suggestions;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	

	public UserFeedback() {
	}

	public long getUserFeedbackId() {
		return this.userFeedbackId;
	}

	public void setUserFeedbackId(long userFeedbackId) {
		this.userFeedbackId = userFeedbackId;
	}

	public BigDecimal getBookingProcessrating() {
		return this.bookingProcessrating;
	}

	public void setBookingProcessrating(BigDecimal bookingProcessrating) {
		this.bookingProcessrating = bookingProcessrating;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getOverallWebsiterating() {
		return this.overallWebsiterating;
	}

	public void setOverallWebsiterating(BigDecimal overallWebsiterating) {
		this.overallWebsiterating = overallWebsiterating;
	}

	public BigDecimal getPaymentGatewayrating() {
		return this.paymentGatewayrating;
	}

	public void setPaymentGatewayrating(BigDecimal paymentGatewayrating) {
		this.paymentGatewayrating = paymentGatewayrating;
	}

	public BigDecimal getRegistrationProcessrating() {
		return this.registrationProcessrating;
	}

	public void setRegistrationProcessrating(BigDecimal registrationProcessrating) {
		this.registrationProcessrating = registrationProcessrating;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSuggestions() {
		return this.suggestions;
	}

	public void setSuggestions(String suggestions) {
		this.suggestions = suggestions;
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