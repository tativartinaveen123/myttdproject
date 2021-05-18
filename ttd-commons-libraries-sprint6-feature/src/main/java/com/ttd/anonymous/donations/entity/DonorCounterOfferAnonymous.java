package com.ttd.anonymous.donations.entity;

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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.donor.entity.ModeOfPayment;
import com.ttd.anonymous.donations.entity.DonationOfferingsAnonymous;


/**
 * The persistent class for the DONOR_COUNTER_OFFERINGS database table.
 * 
 */
@Entity
@Table(name="DONOR_COUNTER_OFFER_ANONYMOUS")
@NamedQuery(name="DonorCounterOfferAnonymous.findAll", query="SELECT d FROM DonorCounterOfferAnonymous d")
public class DonorCounterOfferAnonymous implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DONOR_COUNT_OFF_ANONYMOUS_ID_GENERATOR", sequenceName="DONOR_COUNT_OFF_ANONYMOUS_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DONOR_COUNT_OFF_ANONYMOUS_ID_GENERATOR")
	@Column(name="DONOR_COUNTER_OFFERINGS_ID")
	private long donorCounterOfferingsId;

	
	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	

	@Column(name="DONOR_COUNTER_TYPE")
	private String donorCounterType;

	@Column(name="INSTR_BANK")
	private String instrBank;
	
	
	
	@Column(name="TRUST_BANK")
	private String trustbank;

	@Column(name="INSTR_BRANCH")
	private String instrBranch;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_DATE")
	private Date instrDate;

	@Column(name="INSTR_NUMBER")
	private String instrNumber;

	@Column(name="INSTR_PAYBLE_AT")
	private String instrPaybleAt;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_REALIZE_RECV_DT")
	private Date instrRealizeRecvDt;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_REALIZE_SENT_DT")
	private Date instrRealizeSentDt;

	@Column(name="INSTR_REALIZE_STATUS")
	private String instrRealizeStatus;

	@Column(name="INSTR_REALIZE_VALUE")
	private BigDecimal instrRealizeValue;

	@ManyToOne
	@JoinColumn(name="PAYMENT_MODE")
	private ModeOfPayment paymentMode;

	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	
	@Column(name="DONATION_TYPE")
	private String donationType;
	
	
	@Column(name="CURRENCY_ID")
	private BigDecimal currencyId;
	
	@Column(name="INSTR_AMOUNT")
	private BigDecimal instrAmount;
	
	@Column(name="CONVERSION_AMOUNT")
	private BigDecimal conversionAmount;
	
	@Column(name="ACCOUNT_NO")
	private String accountNo;
	

	@Column(name="COMMENTS")
		private String comments;
	
	
	
	//bi-directional one-to-one association to DonationProductMaster


//	@OneToOne(mappedBy="donorCounterOfferAnonymous")
	//private ModeOfPayment modeOfPayment;
	
	//bi-directional many-to-one association to DonationOffering
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ANONYMOUS_ID")
	private DonationOfferingsAnonymous donationOfferingsAnonymous;

	public DonorCounterOfferAnonymous() {
	}
	

	

	public long getDonorCounterOfferingsId() {
		return this.donorCounterOfferingsId;
	}

	public void setDonorCounterOfferingsId(long donorCounterOfferingsId) {
		this.donorCounterOfferingsId = donorCounterOfferingsId;
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

	
	

	public String getDonorCounterType() {
		return this.donorCounterType;
	}

	public void setDonorCounterType(String donorCounterType) {
		this.donorCounterType = donorCounterType;
	}

	public String getInstrBank() {
		return this.instrBank;
	}

	public void setInstrBank(String instrBank) {
		this.instrBank = instrBank;
	}

	public String getInstrBranch() {
		return this.instrBranch;
	}

	public void setInstrBranch(String instrBranch) {
		this.instrBranch = instrBranch;
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

	public String getInstrPaybleAt() {
		return this.instrPaybleAt;
	}

	public void setInstrPaybleAt(String instrPaybleAt) {
		this.instrPaybleAt = instrPaybleAt;
	}

	public Date getInstrRealizeRecvDt() {
		return this.instrRealizeRecvDt;
	}

	public void setInstrRealizeRecvDt(Date instrRealizeRecvDt) {
		this.instrRealizeRecvDt = instrRealizeRecvDt;
	}

	public Date getInstrRealizeSentDt() {
		return this.instrRealizeSentDt;
	}

	public void setInstrRealizeSentDt(Date instrRealizeSentDt) {
		this.instrRealizeSentDt = instrRealizeSentDt;
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
	
	public ModeOfPayment getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(ModeOfPayment paymentMode) {
		this.paymentMode = paymentMode;
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

	
//	public ModeOfPayment getModeOfPayment() {
//		return this.modeOfPayment;
//	}
//
//	public void setModeOfPayment(ModeOfPayment modeOfPayment) {
//		this.modeOfPayment = modeOfPayment;
//	}



	public String getDonationType() {
		return donationType;
	}

	public DonationOfferingsAnonymous getDonationOfferingsAnonymous() {
		return donationOfferingsAnonymous;
	}

	public void setDonationOfferingsAnonymous(DonationOfferingsAnonymous donationOfferingsAnonymous) {
		this.donationOfferingsAnonymous = donationOfferingsAnonymous;
	}

	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}


	public BigDecimal getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(BigDecimal currencyId) {
		this.currencyId = currencyId;
	}

	public BigDecimal getInstrAmount() {
		return instrAmount;
	}

	public void setInstrAmount(BigDecimal instrAmount) {
		this.instrAmount = instrAmount;
	}

	public BigDecimal getConversionAmount() {
		return conversionAmount;
	}

	public void setConversionAmount(BigDecimal conversionAmount) {
		this.conversionAmount = conversionAmount;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}
	
	
	public String getTrustbank() {
		return trustbank;
	}

	public void setTrustbank(String trustbank) {
		this.trustbank = trustbank;
	}

	

}