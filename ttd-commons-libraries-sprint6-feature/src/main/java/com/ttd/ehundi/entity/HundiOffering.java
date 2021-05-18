package com.ttd.ehundi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.CurrencyMaster;
import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;


/**
 * The persistent class for the HUNDI_OFFERINGS database table.
 * 
 */
@Entity
@Table(name="HUNDI_OFFERINGS")
@NamedQuery(name="HundiOffering.findAll", query="SELECT h FROM HundiOffering h")
public class HundiOffering implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="OFFERING_ID")
	private String offeringId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME",insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="OFFERING_AMOUNT")
	private BigDecimal offeringAmount;

	@Column(name="PAYMENT_GATEWAY_ID")
	private BigDecimal paymentGatewayId;

	@Column(name="PAYMENT_RECEIPT")
	private String paymentReceipt;
	
	@Column(name="PAYMENT_RECEIPT_STATUS")
	private String receiptStatus;

	@Column(name="PAYMENT_REFERENCE")
	private String paymentReference;

	@Column(name="PAYMENT_STATUS")
	private String paymentStatus;

	@Column(name="PAYMENT_TYPE")
	private String paymentType;

	@Column(name="PILIGRIM_ADDRESS_LINE1")
	private String piligrimAddressLine1;
	
	@Column(name="PILIGRIM_ADDRESS_LINE2")
	private String piligrimAddressLine2;

	@Column(name="PILIGRIM_CITY")
	private String piligrimCity;

	@Column(name="PILIGRIM_COUNTRY")
	private String piligrimCountry;

	@Temporal(TemporalType.DATE)
	@Column(name="PILIGRIM_DOB")
	private Date piligrimDob;

	@Column(name="PILIGRIM_EMAIL")
	private String piligrimEmail;

	@Column(name="PILIGRIM_FIRST_NAME")
	private String piligrimFirstName;

	@Column(name="PILIGRIM_LAST_NAME")
	private String piligrimLastName;

	@Column(name="PILIGRIM_PHONE_MOBILE")
	private String piligrimPhoneMobile;

	@Column(name="PILIGRIM_STATE")
	private String piligrimState;

	@Column(name="PILIGRIM_TITLE")
	private String piligrimTitle;

	@Column(name="PILIGRIM_ZIP_CODE")
	private String piligrimZipCode;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;	

	@Column(name="PILIGRIM_ON_BEHALF_OF")
	private String onBehalfOf;	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name = "ON_OCCASION_OF")
	private String onOccasionOf;
	
	@Temporal(TemporalType.DATE)
	@Column(name="OCCASION_DATE")
	private Date occasionDate;

	//bi-directional many-to-one association to CurrencyMaster
	@ManyToOne
	@JoinColumn(name="CURRENCY_ID")
	private CurrencyMaster currencyMaster;

	//bi-directional many-to-one association to EmailNotifcation
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;

	//bi-directional many-to-one association to PgTransaction
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;

	//bi-directional many-to-one association to SmsNotification
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;

	//bi-directional many-to-one association to User
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;
	
	@Column(name = "SESSION_ID")
	private String sessionId;

	@Column(name = "REQ_CHANNEL")
	private String requestChannel;
	

	@Column(name = "HUNDI_TYPE")
	private String hundiType;

	public String getHundiType() {
		return hundiType;
	}

	public void setHundiType(String hundiType) {
		this.hundiType = hundiType;
	}

	public HundiOffering() {
	}

	public String getOfferingId() {
		return this.offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
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
		return this.offeringAmount;
	}

	public void setOfferingAmount(BigDecimal offeringAmount) {
		this.offeringAmount = offeringAmount;
	}

	public BigDecimal getPaymentGatewayId() {
		return this.paymentGatewayId;
	}

	public void setPaymentGatewayId(BigDecimal paymentGatewayId) {
		this.paymentGatewayId = paymentGatewayId;
	}

	public String getPaymentReceipt() {
		return this.paymentReceipt;
	}

	public void setPaymentReceipt(String paymentReceipt) {
		this.paymentReceipt = paymentReceipt;
	}

	public String getPaymentReference() {
		return this.paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

	public String getPaymentStatus() {
		return this.paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPiligrimAddressLine1() {
		return this.piligrimAddressLine1;
	}

	public void setPiligrimAddressLine1(String piligrimAddressLine1) {
		this.piligrimAddressLine1 = piligrimAddressLine1;
	}

	public String getPiligrimCity() {
		return this.piligrimCity;
	}

	public void setPiligrimCity(String piligrimCity) {
		this.piligrimCity = piligrimCity;
	}

	public String getPiligrimCountry() {
		return this.piligrimCountry;
	}

	public void setPiligrimCountry(String piligrimCountry) {
		this.piligrimCountry = piligrimCountry;
	}

	public Date getPiligrimDob() {
		return this.piligrimDob;
	}

	public void setPiligrimDob(Date piligrimDob) {
		this.piligrimDob = piligrimDob;
	}

	public String getPiligrimEmail() {
		return this.piligrimEmail;
	}

	public void setPiligrimEmail(String piligrimEmail) {
		this.piligrimEmail = piligrimEmail;
	}

	public String getPiligrimFirstName() {
		return this.piligrimFirstName;
	}

	public void setPiligrimFirstName(String piligrimFirstName) {
		this.piligrimFirstName = piligrimFirstName;
	}

	public String getPiligrimLastName() {
		return this.piligrimLastName;
	}

	public void setPiligrimLastName(String piligrimLastName) {
		this.piligrimLastName = piligrimLastName;
	}

	public String getPiligrimPhoneMobile() {
		return this.piligrimPhoneMobile;
	}

	public void setPiligrimPhoneMobile(String piligrimPhoneMobile) {
		this.piligrimPhoneMobile = piligrimPhoneMobile;
	}


	public Date getOccasionDate() {
		return occasionDate;
	}

	public void setOccasionDate(Date occasionDate) {
		this.occasionDate = occasionDate;
	}

	public String getPiligrimState() {
		return this.piligrimState;
	}

	public void setPiligrimState(String piligrimState) {
		this.piligrimState = piligrimState;
	}
	
	public String getPiligrimAddressLine2() {
		return piligrimAddressLine2;
	}

	public void setPiligrimAddressLine2(String piligrimAddressLine2) {
		this.piligrimAddressLine2 = piligrimAddressLine2;
	}

	public String getPiligrimTitle() {
		return this.piligrimTitle;
	}

	public void setPiligrimTitle(String piligrimTitle) {
		this.piligrimTitle = piligrimTitle;
	}

	public String getPiligrimZipCode() {
		return this.piligrimZipCode;
	}

	public void setPiligrimZipCode(String piligrimZipCode) {
		this.piligrimZipCode = piligrimZipCode;
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

	public CurrencyMaster getCurrencyMaster() {
		return this.currencyMaster;
	}

	public void setCurrencyMaster(CurrencyMaster currencyMaster) {
		this.currencyMaster = currencyMaster;
	}

	public EmailNotification getEmailNotifcation() {
		return this.emailNotifcation;
	}

	public void setEmailNotifcation(EmailNotification emailNotifcation) {
		this.emailNotifcation = emailNotifcation;
	}

	public PgTransaction getPgTransaction() {
		return this.pgTransaction;
	}

	public void setPgTransaction(PgTransaction pgTransaction) {
		this.pgTransaction = pgTransaction;
	}

	public SmsNotification getSmsNotification() {
		return this.smsNotification;
	}

	public void setSmsNotification(SmsNotification smsNotification) {
		this.smsNotification = smsNotification;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getOnBehalfOf() {
		return onBehalfOf;
	}

	public void setOnBehalfOf(String onBehalfOf) {
		this.onBehalfOf = onBehalfOf;
	}

	public String getReceiptStatus() {
		return receiptStatus;
	}

	public void setReceiptStatus(String receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	public String getOnOccasionOf() {
		return onOccasionOf;
	}

	public void setOnOccasionOf(String onOccasionOf) {
		this.onOccasionOf = onOccasionOf;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getRequestChannel() {
		return requestChannel;
	}

	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}
	
}