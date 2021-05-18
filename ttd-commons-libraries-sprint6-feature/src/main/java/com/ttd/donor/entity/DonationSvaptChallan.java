package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="DONATION_SVAPT_CHALLAN")
@NamedQuery(name="DonationSvaptChallan.findAll", query="SELECT k FROM DonationSvaptChallan k")
public class DonationSvaptChallan implements Serializable  {
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name="CHALLAN_NO")
	private String challanNo;
	

	@Column(name="USER_ID")
	private BigDecimal userId;
	
	@Temporal(TemporalType.DATE)
	@Column(name="TRANSACTION_DATE")
	private Date transactionDate;
	
	
	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	
	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;



	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false , updatable = false)
	private Date createdTime;
	
	

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;
	
	

	@Column(name="TOTAL_AMOUNT")
	private BigDecimal totalAmount;

	
	@Column(name="DEPOSIT_AMOUNT")
	private BigDecimal depositAmount;

	

	@Temporal(TemporalType.DATE)
	@Column(name="DEPOSIT_DATE")
	private Date depositDate;
	
	
	@Column(name="REMARKS")
	private String remarks;

	@Temporal(TemporalType.DATE)
	@Column(name="DEPOSIT_ENTRY_DATE")
	private Date depositEntryDate;
	
	@Column(name="ACCOUNT_NO")
	private String accountNo;
	
	@Column(name="CHALLAN_BANK")
	private String challanBank;
	
	@Column(name="CHALLAN_BRANCH")
	private String challanBranch;

	
	@Column(name="DONATION_FOR")
	private String donationFor;

		
	
	public String getDonationFor() {
		return donationFor;
	}

	public void setDonationFor(String donationFor) {
		this.donationFor = donationFor;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getChallanBank() {
		return challanBank;
	}

	public void setChallanBank(String challanBank) {
		this.challanBank = challanBank;
	}

	public String getChallanBranch() {
		return challanBranch;
	}

	public void setChallanBranch(String challanBranch) {
		this.challanBranch = challanBranch;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public BigDecimal getUserId() {
		return userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}

	public Date getDepositDate() {
		return depositDate;
	}

	public void setDepositDate(Date depositDate) {
		this.depositDate = depositDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getDepositEntryDate() {
		return depositEntryDate;
	}

	public void setDepositEntryDate(Date depositEntryDate) {
		this.depositEntryDate = depositEntryDate;
	}
	
	
	
	
	

}
