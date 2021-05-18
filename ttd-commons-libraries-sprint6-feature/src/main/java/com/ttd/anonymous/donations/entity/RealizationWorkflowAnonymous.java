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
@Table(name="Realization_Workflow_Anonymous")
@NamedQuery(name="Realization_Workflow_Anonymous.findAll", query="SELECT r FROM RealizationWorkflowAnonymous r")
public class RealizationWorkflowAnonymous implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "REALIZATION_WORK_ANONYMOUS_SEQ_GENERATOR", sequenceName = "REALIZATION_WORK_ANONYMOUS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REALIZATION_WORK_ANONYMOUS_SEQ_GENERATOR")
	@Column(name="COUNTER_OFFERINGS_ID")
	private long counterOfferingsId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME" , insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="INSTR_AMOUNT")
	private BigDecimal instrAmount;

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

	@Column(name="ANONYMOUS_ID")
	private String anonymousId;
	
	
	
	@Column(name="ACCOUNT_NUMBER")
	private String accNumber;
	
	@Column(name="TRUST_BANK")
	private String trustBank;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	

	public RealizationWorkflowAnonymous() {
	}

	public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public long getCounterOfferingsId() {
		return this.counterOfferingsId;
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

	public BigDecimal getInstrAmount() {
		return this.instrAmount;
	}

	public void setInstrAmount(BigDecimal instrAmount) {
		this.instrAmount = instrAmount;
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

	public String getAnonymousId() {
		return this.anonymousId;
	}

	public void setAnonymousId(String anonymousId) {
		this.anonymousId = anonymousId;
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



	public String getTrustBank() {
		return trustBank;
	}

	public void setTrustBank(String trustBank) {
		this.trustBank = trustBank;
	}
	

}
