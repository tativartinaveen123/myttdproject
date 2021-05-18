package com.ttd.common.entity;
import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USER_NEWFEEDBACK database table.
 * 
 */
@Entity
@Table(name="USER_NEWFEEDBACK")
@NamedQuery(name="UserNewfeedback.findAll", query="SELECT u FROM UserNewfeedback u")
public class UserNewfeedback implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USER_NEWFEEDBACK_SEQ_ID_GENERATOR", sequenceName="USER_NEWFEEDBACK_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_NEWFEEDBACK_SEQ_ID_GENERATOR") 
	@Column(name="USER_NEWFEEDBACK_ID")
	private long userNewfeedbackId;

	@Column(name="COMMUNICATION_CHANLS")
	private BigDecimal communicationChanls;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="OVERALL_WEBSITERATING")
	private BigDecimal overallWebsiterating;

	@Column(name="PAYMENT_GATEWAYRATING")
	private BigDecimal paymentGatewayrating;

	@Column(name="REGISTRATION_PROCRATING")
	private BigDecimal registrationProcrating;

	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_IMPNOTES")
	private String userImpnotes;

	@Column(name="USER_REMARKS")
	private String userRemarks;

	@Column(name="USER_SUGGESTIONS")
	private String userSuggestions;
	
	@Column(name="PRIVILEGE_REDEMTIONRATING")
	private BigDecimal privilegeRedemptionRating;

	public UserNewfeedback() {
	}

	public long getUserNewfeedbackId() {
		return this.userNewfeedbackId;
	}

	public void setUserNewfeedbackId(long userNewfeedbackId) {
		this.userNewfeedbackId = userNewfeedbackId;
	}

	public BigDecimal getCommunicationChanls() {
		return this.communicationChanls;
	}

	public void setCommunicationChanls(BigDecimal communicationChanls) {
		this.communicationChanls = communicationChanls;
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

	public BigDecimal getRegistrationProcrating() {
		return this.registrationProcrating;
	}

	public void setRegistrationProcrating(BigDecimal registrationProcrating) {
		this.registrationProcrating = registrationProcrating;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
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

	public String getUserImpnotes() {
		return this.userImpnotes;
	}

	public void setUserImpnotes(String userImpnotes) {
		this.userImpnotes = userImpnotes;
	}

	public String getUserRemarks() {
		return this.userRemarks;
	}

	public void setUserRemarks(String userRemarks) {
		this.userRemarks = userRemarks;
	}

	public String getUserSuggestions() {
		return this.userSuggestions;
	}

	public void setUserSuggestions(String userSuggestions) {
		this.userSuggestions = userSuggestions;
	}

	public BigDecimal getPrivilegeRedemptionRating() {
		return privilegeRedemptionRating;
	}

	public void setPrivilegeRedemptionRating(BigDecimal privilegeRedemptionRating) {
		this.privilegeRedemptionRating = privilegeRedemptionRating;
	}
	
	
}