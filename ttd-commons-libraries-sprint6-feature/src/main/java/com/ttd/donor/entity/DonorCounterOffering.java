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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.edonation.entity.DonationOffering;


/**
 * The persistent class for the DONOR_COUNTER_OFFERINGS database table.
 * 
 */
@Entity
@Table(name="DONOR_COUNTER_OFFERINGS")
@NamedQuery(name="DonorCounterOffering.findAll", query="SELECT d FROM DonorCounterOffering d")
public class DonorCounterOffering implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DONOR_COUNTER_OFFER_PAYMEN_SEQ_GENERATOR", sequenceName="DONOR_COUNTER_OFFER_PAYMEN_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DONOR_COUNTER_OFFER_PAYMEN_SEQ_GENERATOR")
	@Column(name="DONOR_COUNTER_OFFERINGS_ID")
	private long donorCounterOfferingsId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="DONATION_PRODUCT_APPAISE_VALUE")
	private BigDecimal donationProductAppaiseValue;

	@Column(name="DONATION_PRODUCT_ID")
	private BigDecimal donationProductId;

	@Column(name="DONATION_PRODUCT_INVOICE")
	private String donationProductInvoice;

	@Column(name="DONATION_PRODUCT_NAME")
	private String donationProductName;

	@Column(name="DONATION_PRODUCT_QTY")
	private BigDecimal donationProductQty;

	@Column(name="DONATION_PRODUCT_QUOTE_VALUE")
	private BigDecimal donationProductQuoteValue;

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

	@Column(name="PG_ID")
	private BigDecimal pgId;

	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_ID")
	private BigDecimal userId;
	
	@Column(name="DONATION_TYPE")
	private String donationType;
	
	@Column(name="DONATION_PRODUCT_DOCUMENT")
	private String donationProductDocument;
	
	@Column(name="CURRENCY_ID")
	private BigDecimal currencyId;
	
	@Column(name="INSTR_AMOUNT")
	private BigDecimal instrAmount;
	
	@Column(name="CONVERSION_AMOUNT")
	private BigDecimal conversionAmount;
	
	@Column(name="ACCOUNT_NO")
	private String accountNo;
	
	@Column(name="DONATION_FOR")
	private String donationFor;
	

	@Column(name="CHALLAN_FLAG")
	private String challanFlag;
	

	@Column(name="CHALLAN_NUMBER")
	private String challanNo;
	
	
	//bi-directional one-to-one association to DonationProductMaster
	@OneToOne(mappedBy="donorCounterOffering")
	private DonationProductMaster donationProductMaster;

//	@OneToOne(mappedBy="donorCounterOffering")
//	private ModeOfPayment modeOfPayment;
	
	//bi-directional many-to-one association to DonationOffering
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="OFFERING_ID")
	private DonationOffering donationOffering;

	public DonorCounterOffering() {
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

	public BigDecimal getDonationProductAppaiseValue() {
		return this.donationProductAppaiseValue;
	}

	public void setDonationProductAppaiseValue(BigDecimal donationProductAppaiseValue) {
		this.donationProductAppaiseValue = donationProductAppaiseValue;
	}

	public BigDecimal getDonationProductId() {
		return this.donationProductId;
	}

	public void setDonationProductId(BigDecimal donationProductId) {
		this.donationProductId = donationProductId;
	}

	public String getDonationProductInvoice() {
		return this.donationProductInvoice;
	}

	public void setDonationProductInvoice(String donationProductInvoice) {
		this.donationProductInvoice = donationProductInvoice;
	}

	public String getDonationProductName() {
		return this.donationProductName;
	}

	public void setDonationProductName(String donationProductName) {
		this.donationProductName = donationProductName;
	}

	public BigDecimal getDonationProductQty() {
		return this.donationProductQty;
	}

	public void setDonationProductQty(BigDecimal donationProductQty) {
		this.donationProductQty = donationProductQty;
	}

	public BigDecimal getDonationProductQuoteValue() {
		return this.donationProductQuoteValue;
	}

	public void setDonationProductQuoteValue(BigDecimal donationProductQuoteValue) {
		this.donationProductQuoteValue = donationProductQuoteValue;
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

	public BigDecimal getPgId() {
		return this.pgId;
	}

	public void setPgId(BigDecimal pgId) {
		this.pgId = pgId;
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

	public DonationProductMaster getDonationProductMaster() {
		return this.donationProductMaster;
	}

	public void setDonationProductMaster(DonationProductMaster donationProductMaster) {
		this.donationProductMaster = donationProductMaster;
	}
	
//	public ModeOfPayment getModeOfPayment() {
//		return this.modeOfPayment;
//	}
//
//	public void setModeOfPayment(ModeOfPayment modeOfPayment) {
//		this.modeOfPayment = modeOfPayment;
//	}

	public DonationOffering getDonationOffering() {
		return this.donationOffering;
	}

	public void setDonationOffering(DonationOffering donationOffering) {
		this.donationOffering = donationOffering;
	}

	public String getDonationType() {
		return donationType;
	}

	public void setDonationType(String donationType) {
		this.donationType = donationType;
	}

	public String getDonationProductDocument() {
		return donationProductDocument;
	}

	public void setDonationProductDocument(String donationProductDocument) {
		this.donationProductDocument = donationProductDocument;
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

	public String getTrustbank() {
		return trustbank;
	}

	public void setTrustbank(String trustbank) {
		this.trustbank = trustbank;
	}

	public String getDonationFor() {
		return donationFor;
	}

	public void setDonationFor(String donationFor) {
		this.donationFor = donationFor;
	}

	public String getChallanFlag() {
		return challanFlag;
	}

	public void setChallanFlag(String challanFlag) {
		this.challanFlag = challanFlag;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}
	

	

}