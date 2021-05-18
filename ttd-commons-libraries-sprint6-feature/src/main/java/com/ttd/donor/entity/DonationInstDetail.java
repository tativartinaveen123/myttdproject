package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * The persistent class for the DONATION_INST_DETAILS database table.
 * 
 */
@Entity
@Table(name = "DONATION_INST_DETAILS")
@NamedQuery(name = "DonationInstDetail.findAll", query = "SELECT d FROM DonationInstDetail d")
public class DonationInstDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DONATION_INST_DETAILS_DONATIONINSTDETAILSID_GENERATOR", sequenceName = "DONATION_INST_DETAILS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DONATION_INST_DETAILS_DONATIONINSTDETAILSID_GENERATOR")
	@Column(name = "DONATION_INST_DETAILS_ID")
	private long donationInstDetailsId;

	@Column(name = "DONOR_COUNTER_OFFERING_ID")
	private BigDecimal counterOfferingId;
	
	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME")
	private Date createdTime;

	@Column(name = "NEW_CONVERSION_AMOUNT")
	private BigDecimal newConversionAmount;

	@Column(name = "NEW_CURRENCY_ID")
	private BigDecimal newCurrencyId;

	@Column(name = "NEW_INSTR_AMOUNT")
	private BigDecimal newInstrAmount;

	@Column(name = "NEW_INSTR_BANK")
	private String newInstrBank;

	@Column(name = "NEW_INSTR_BRANCH")
	private String newInstrBranch;

	@Temporal(TemporalType.DATE)
	@Column(name = "NEW_INSTR_DATE")
	private Date newInstrDate;

	@Column(name = "NEW_INSTR_NUMBER")
	private String newInstrNumber;

	@Column(name = "NEW_INSTR_PAYBLE_AT")
	private String newInstrPaybleAt;

	@Column(name = "NEW_PAYMENT_MODE")
	private BigDecimal newPaymentMode;

	@Column(name = "NEW_TRUST_ID")
	private BigDecimal newTrustId;

	@Column(name = "OLD_CONVERSION_AMOUNT")
	private BigDecimal oldConversionAmount;

	@Column(name = "OLD_CURRENCY_ID")
	private BigDecimal oldCurrencyId;

	@Column(name = "OLD_INSTR_AMOUNT")
	private BigDecimal oldInstrAmount;

	@Column(name = "OLD_INSTR_BANK")
	private String oldInstrBank;

	@Column(name = "OLD_INSTR_BRANCH")
	private String oldInstrBranch;

	@Temporal(TemporalType.DATE)
	@Column(name = "OLD_INSTR_DATE")
	private Date oldInstrDate;

	@Column(name = "OLD_INSTR_NUMBER")
	private String oldInstrNumber;

	@Column(name = "OLD_INSTR_PAYBLE_AT")
	private String oldInstrPaybleAt;

	@Column(name = "OLD_PAYMENT_MODE")
	private BigDecimal oldPaymentMode;

	@Column(name = "OLD_TRUST_ID")
	private BigDecimal oldTrustId;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	// bi-directional many-to-one association to DonationDetailsWorkflow
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DONATION_REQUEST_ID")
	private DonationDetailsWorkflow donationDetailsWorkflow;
	
	public DonationInstDetail() {
	}

	public long getDonationInstDetailsId() {
		return this.donationInstDetailsId;
	}

	public void setDonationInstDetailsId(long donationInstDetailsId) {
		this.donationInstDetailsId = donationInstDetailsId;
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

	public BigDecimal getNewConversionAmount() {
		return this.newConversionAmount;
	}

	public void setNewConversionAmount(BigDecimal newConversionAmount) {
		this.newConversionAmount = newConversionAmount;
	}

	public BigDecimal getNewCurrencyId() {
		return this.newCurrencyId;
	}

	public void setNewCurrencyId(BigDecimal newCurrencyId) {
		this.newCurrencyId = newCurrencyId;
	}

	public BigDecimal getNewInstrAmount() {
		return this.newInstrAmount;
	}

	public void setNewInstrAmount(BigDecimal newInstrAmount) {
		this.newInstrAmount = newInstrAmount;
	}

	public String getNewInstrBank() {
		return this.newInstrBank;
	}

	public void setNewInstrBank(String newInstrBank) {
		this.newInstrBank = newInstrBank;
	}

	public String getNewInstrBranch() {
		return this.newInstrBranch;
	}

	public void setNewInstrBranch(String newInstrBranch) {
		this.newInstrBranch = newInstrBranch;
	}

	public Date getNewInstrDate() {
		return this.newInstrDate;
	}

	public void setNewInstrDate(Date newInstrDate) {
		this.newInstrDate = newInstrDate;
	}

	public String getNewInstrNumber() {
		return this.newInstrNumber;
	}

	public void setNewInstrNumber(String newInstrNumber) {
		this.newInstrNumber = newInstrNumber;
	}

	public String getNewInstrPaybleAt() {
		return this.newInstrPaybleAt;
	}

	public void setNewInstrPaybleAt(String newInstrPaybleAt) {
		this.newInstrPaybleAt = newInstrPaybleAt;
	}

	public BigDecimal getNewPaymentMode() {
		return this.newPaymentMode;
	}

	public void setNewPaymentMode(BigDecimal newPaymentMode) {
		this.newPaymentMode = newPaymentMode;
	}

	public BigDecimal getNewTrustId() {
		return this.newTrustId;
	}

	public void setNewTrustId(BigDecimal newTrustId) {
		this.newTrustId = newTrustId;
	}

	public BigDecimal getOldConversionAmount() {
		return this.oldConversionAmount;
	}

	public void setOldConversionAmount(BigDecimal oldConversionAmount) {
		this.oldConversionAmount = oldConversionAmount;
	}

	public BigDecimal getOldCurrencyId() {
		return this.oldCurrencyId;
	}

	public void setOldCurrencyId(BigDecimal oldCurrencyId) {
		this.oldCurrencyId = oldCurrencyId;
	}

	public BigDecimal getOldInstrAmount() {
		return this.oldInstrAmount;
	}

	public void setOldInstrAmount(BigDecimal oldInstrAmount) {
		this.oldInstrAmount = oldInstrAmount;
	}

	public String getOldInstrBank() {
		return this.oldInstrBank;
	}

	public void setOldInstrBank(String oldInstrBank) {
		this.oldInstrBank = oldInstrBank;
	}

	public String getOldInstrBranch() {
		return this.oldInstrBranch;
	}

	public void setOldInstrBranch(String oldInstrBranch) {
		this.oldInstrBranch = oldInstrBranch;
	}

	public Date getOldInstrDate() {
		return this.oldInstrDate;
	}

	public void setOldInstrDate(Date oldInstrDate) {
		this.oldInstrDate = oldInstrDate;
	}

	public String getOldInstrNumber() {
		return this.oldInstrNumber;
	}

	public void setOldInstrNumber(String oldInstrNumber) {
		this.oldInstrNumber = oldInstrNumber;
	}

	public String getOldInstrPaybleAt() {
		return this.oldInstrPaybleAt;
	}

	public void setOldInstrPaybleAt(String oldInstrPaybleAt) {
		this.oldInstrPaybleAt = oldInstrPaybleAt;
	}

	public BigDecimal getOldPaymentMode() {
		return this.oldPaymentMode;
	}

	public void setOldPaymentMode(BigDecimal oldPaymentMode) {
		this.oldPaymentMode = oldPaymentMode;
	}

	public BigDecimal getOldTrustId() {
		return this.oldTrustId;
	}

	public void setOldTrustId(BigDecimal oldTrustId) {
		this.oldTrustId = oldTrustId;
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

	public DonationDetailsWorkflow getDonationDetailsWorkflow() {
		return this.donationDetailsWorkflow;
	}

	public void setDonationDetailsWorkflow(
			DonationDetailsWorkflow donationDetailsWorkflow) {
		this.donationDetailsWorkflow = donationDetailsWorkflow;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getCounterOfferingId() {
		return counterOfferingId;
	}

	public void setCounterOfferingId(BigDecimal counterOfferingId) {
		this.counterOfferingId = counterOfferingId;
	}
	
	

}