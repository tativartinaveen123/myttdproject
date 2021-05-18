package com.ttd.km.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the KM_CHALLAN database table.
 * 
 */
@Entity
@Table(name="KM_CHALLAN")
@NamedQuery(name="KmChallan.findAll", query="SELECT k FROM KmChallan k")
public class KmChallan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CHALLAN_NO")
	private String challanNo;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false , updatable = false)
	private Date createdTime;

	@Column(name="DEPOSIT_AMOUNT")
	private BigDecimal depositAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="DEPOSIT_DATE")
	private Date depositDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DEPOSIT_ENTRY_DATE")
	private Date depositEntryDate;

	@Column(name="KM_ID")
	private BigDecimal kmId;

	private String remarks;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SERVICE_TYPE")
	private String serviceType;

	@Column(name="TOTAL_AMOUNT")
	private BigDecimal totalAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="TRANSACTION_DATE")
	private Date transactionDate;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_ID")
	private BigDecimal userId;
	
	@Column(name="ACCOUNT_NO")
	private String bankAccountNo;

	
	
	
	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public KmChallan() {
	}

	public String getChallanNo() {
		return this.challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
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

	public BigDecimal getDepositAmount() {
		return this.depositAmount;
	}

	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Date getDepositDate() {
		return this.depositDate;
	}

	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}

	public Date getDepositEntryDate() {
		return this.depositEntryDate;
	}

	public void setDepositEntryDate(Date depositEntryDate) {
		this.depositEntryDate = depositEntryDate;
	}

	public BigDecimal getKmId() {
		return this.kmId;
	}

	public void setKmId(BigDecimal kmId) {
		this.kmId = kmId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
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