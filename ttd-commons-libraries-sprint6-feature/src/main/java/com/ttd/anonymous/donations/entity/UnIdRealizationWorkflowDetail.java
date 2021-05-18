package com.ttd.anonymous.donations.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the REALIZATION_WORKFLOW_DETAILS database table.
 * 
 */
@Entity
@Table(name="UNID_REALIZATION_WORKFLOW_DTLS")
@NamedQuery(name="UnIdRealizationWorkflowDetail.findAll", query="SELECT r FROM UnIdRealizationWorkflowDetail r")
public class UnIdRealizationWorkflowDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "REALIZATION_WORKFLOW_REQUEST_ID_GENERATOR", sequenceName = "REALIZATION_WORKFLOW_DTLS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REALIZATION_WORKFLOW_REQUEST_ID_GENERATOR")
	@Column(name="COUNTER_OFFERINGS_ID")
	private long counterOfferingsId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME" , insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="OFFERING_AMOUNT")
	private BigDecimal offeringAmount;

	@Column(name="INSTR_BANK")
	private String instrBank;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_DATE")
	private Date instrDate;

	@Column(name="INSTR_NUMBER")
	private String instrNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_REALIZE_RECV_DT")
	private Date instrRealizeRecvDt;

	@Column(name="INSTR_REALIZE_STATUS")
	private String instrRealizeStatus;

	@Column(name="INSTR_REALIZE_VALUE")
	private BigDecimal instrRealizeValue;

	@Column(name="OFFERING_ID")
	private String offeringId;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_ID")
	private BigDecimal userId;
	
	@Column(name="ANONYMOUS_ID")
	private BigDecimal anonymousID;

	public UnIdRealizationWorkflowDetail() {
	}

	public long getCounterOfferingsId() {
		return this.counterOfferingsId;
	}
	
	

	public BigDecimal getAnonymousID() {
		return anonymousID;
	}

	public void setAnonymousID(BigDecimal anonymousID) {
		this.anonymousID = anonymousID;
	}

	public void setCounterOfferingsId(long counterOfferingsId) {
		this.counterOfferingsId = counterOfferingsId;
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

	

	public BigDecimal getOfferingAmount() {
		return offeringAmount;
	}

	public void setOfferingAmount(BigDecimal offeringAmount) {
		this.offeringAmount = offeringAmount;
	}

	public String getInstrBank() {
		return this.instrBank;
	}

	public void setInstrBank(String instrBank) {
		this.instrBank = instrBank;
	}

	public Date getInstrDate() {
		return this.instrDate;
	}

	public void setInstrDate(Date instrDate) {
		this.instrDate = instrDate;
	}

	public String getInstrNumber() {
		return this.instrNumber;
	}

	public void setInstrNumber(String instrNumber) {
		this.instrNumber = instrNumber;
	}

	public Date getInstrRealizeRecvDt() {
		return this.instrRealizeRecvDt;
	}

	public void setInstrRealizeRecvDt(Date instrRealizeRecvDt) {
		this.instrRealizeRecvDt = instrRealizeRecvDt;
	}

	public String getInstrRealizeStatus() {
		return this.instrRealizeStatus;
	}

	public void setInstrRealizeStatus(String instrRealizeStatus) {
		this.instrRealizeStatus = instrRealizeStatus;
	}

	public BigDecimal getInstrRealizeValue() {
		return this.instrRealizeValue;
	}

	public void setInstrRealizeValue(BigDecimal instrRealizeValue) {
		this.instrRealizeValue = instrRealizeValue;
	}

	public String getOfferingId() {
		return this.offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
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

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

}