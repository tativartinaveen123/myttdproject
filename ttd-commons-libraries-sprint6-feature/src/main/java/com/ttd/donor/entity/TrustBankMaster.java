package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TRUST_BANK_MASTER")
@NamedQuery(name = "TrustBankMaster.findAll", query = "SELECT tm FROM TrustBankMaster tm")
public class TrustBankMaster implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEQ_GEN", sequenceName = "TBM_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	@Column(name = "TRUST_BANK_MASTER_ID")
	private long trustBankId;
	
	@Column(name = "TRUST_ID")
	private long trustId;

	@Column(name = "TRUST_NAME")
	private String trustName;
	
	@Column(name = "BANK_NAME")	
	private String bankName;
	
	@Column(name = "BANK_IFSC_CODE")	
	private String bankIFScode;
	
	@Column(name = "BRANCH_NAME")	
	private String branchName;

	@Column(name = "BANK_ID")	
	private String bankId;

	@Column(name = "CURRENCY_TYPE")
	private String currencyType;

	@Column(name = "TRUST_ACCOUNT_NUMBER")
	private String trustAccNum;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME")
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name = "ACTIVE_FLAG")
	private long activeFlag;

	@Column(name = "DONATION_FOR")
	private String donationFor;
	
	public long getTrustBankId() {
		return trustBankId;
	}

	public void setTrustBankId(long trustBankId) {
		this.trustBankId = trustBankId;
	}

	public long getTrustId() {
		return trustId;
	}

	public void setTrustId(long trustId) {
		this.trustId = trustId;
	}

	public String getTrustName() {
		return trustName;
	}

	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankIFScode() {
		return bankIFScode;
	}

	public void setBankIFScode(String bankIFScode) {
		this.bankIFScode = bankIFScode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBankId() {
		return bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	public String getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}

	public String getTrustAccNum() {
		return trustAccNum;
	}

	public void setTrustAccNum(String trustAccNum) {
		this.trustAccNum = trustAccNum;
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

	public long getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(long activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getDonationFor() {
		return donationFor;
	}

	public void setDonationFor(String donationFor) {
		this.donationFor = donationFor;
	}

}
