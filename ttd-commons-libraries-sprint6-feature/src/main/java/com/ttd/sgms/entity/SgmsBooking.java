package com.ttd.sgms.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.ehundi.entity.PgTransaction;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SGMS_BOOKING database table.
 * 
 */
@Entity
@Table(name="SGMS_BOOKING")
@NamedQuery(name="SgmsBooking.findAll", query="SELECT s FROM SgmsBooking s")
public class SgmsBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SGMS_BOOKING_ID")
	private String sgmsBookingId;

	@Column(name="BOOKING_AMOUNT")
	private BigDecimal bookingAmount;
	
	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME",insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="PAYMENT_RECEIPT")
	private String paymentReceipt;

	@Column(name="PAYMENT_RECEIPT_STATUS")
	private String paymentReceiptStatus;

	@Column(name="ROW_STATUS", insertable = false )
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_CITY")
	private String userCity;

	@Column(name="USER_COUNTRY")
	private String userCountry;

	@Column(name="USER_SHIPPING_ADDR1")
	private String userShippingAddr1;

	@Column(name="USER_SHIPPING_ADDR2")
	private String userShippingAddr2;

	@Column(name="USER_STATE")
	private String userState;

	@Column(name="USER_ZIP_CODE")
	private String userZipCode;
	
	@Column(name="BOOKING_STATUS")
	private String bookingStatus;
	
	@Column(name="SUBSCRIBE_START_DATE")
	private Date subscribeStartDate;
	
	@Column(name="SUBSCRIBE_END_DATE")
	private Date subscribeEndDate;
	
	@Column(name="PAYMENT_REFERENCE")
	private String paymentReference;
	
	@Column(name="LANGUAGE_ID")
	private long languageId;
	
	// bi-directional many-to-one association to EmailNotifcation
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;

	// bi-directional many-to-one association to PgTransaction
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;

	// bi-directional many-to-one association to SmsNotification
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="SGMS_SUBSCRIBE_ID")
	private SgmsSubscribeMaster sgmsSubscribeMaster;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_MOBILE")
	private String userMobile;
	
	@Column(name="OTHER_USER_GENDER")
	private String otherUserGender;
	
	@Column(name="OTHER_USER_AGE")
	private String otherUserAge;
	
	@Column(name="IS_RENEWAL")
	private String isRenewal;
	
	@Column(name = "SESSION_ID")
	private String sessionId;
	
	@Column(name="REQ_CHANNEL")
	private String requestChannel;
	
	public SgmsBooking() {
	}
	
	public String getIsRenewal() {
		return isRenewal;
	}

	public void setIsRenewal(String isRenewal) {
		this.isRenewal = isRenewal;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMobile() {
		return userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getOtherUserGender() {
		return otherUserGender;
	}

	public void setOtherUserGender(String otherUserGender) {
		this.otherUserGender = otherUserGender;
	}

	public String getOtherUserAge() {
		return otherUserAge;
	}

	public void setOtherUserAge(String otherUserAge) {
		this.otherUserAge = otherUserAge;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public SgmsSubscribeMaster getSgmsSubscribeMaster() {
		return sgmsSubscribeMaster;
	}

	public void setSgmsSubscribeMaster(SgmsSubscribeMaster sgmsSubscribeMaster) {
		this.sgmsSubscribeMaster = sgmsSubscribeMaster;
	}

	public EmailNotification getEmailNotifcation() {
		return emailNotifcation;
	}

	public void setEmailNotifcation(EmailNotification emailNotifcation) {
		this.emailNotifcation = emailNotifcation;
	}

	public PgTransaction getPgTransaction() {
		return pgTransaction;
	}

	public void setPgTransaction(PgTransaction pgTransaction) {
		this.pgTransaction = pgTransaction;
	}

	public SmsNotification getSmsNotification() {
		return smsNotification;
	}

	public void setSmsNotification(SmsNotification smsNotification) {
		this.smsNotification = smsNotification;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSgmsBookingId() {
		return this.sgmsBookingId;
	}

	public void setSgmsBookingId(String sgmsBookingId) {
		this.sgmsBookingId = sgmsBookingId;
	}

	public BigDecimal getBookingAmount() {
		return this.bookingAmount;
	}

	public void setBookingAmount(BigDecimal bookingAmount) {
		this.bookingAmount = bookingAmount;
	}

	public BigDecimal getChannelTypeId() {
		return this.channelTypeId;
	}

	public void setChannelTypeId(BigDecimal channelTypeId) {
		this.channelTypeId = channelTypeId;
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

	public String getPaymentReceipt() {
		return this.paymentReceipt;
	}

	public void setPaymentReceipt(String paymentReceipt) {
		this.paymentReceipt = paymentReceipt;
	}

	public String getPaymentReceiptStatus() {
		return this.paymentReceiptStatus;
	}

	public void setPaymentReceiptStatus(String paymentReceiptStatus) {
		this.paymentReceiptStatus = paymentReceiptStatus;
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

	public String getUserCity() {
		return this.userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserCountry() {
		return this.userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public String getUserShippingAddr1() {
		return this.userShippingAddr1;
	}

	public void setUserShippingAddr1(String userShippingAddr1) {
		this.userShippingAddr1 = userShippingAddr1;
	}

	public String getUserShippingAddr2() {
		return this.userShippingAddr2;
	}

	public void setUserShippingAddr2(String userShippingAddr2) {
		this.userShippingAddr2 = userShippingAddr2;
	}

	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserZipCode() {
		return this.userZipCode;
	}

	public void setUserZipCode(String userZipCode) {
		this.userZipCode = userZipCode;
	}

	public Date getSubscribeStartDate() {
		return subscribeStartDate;
	}

	public void setSubscribeStartDate(Date subscribeStartDate) {
		this.subscribeStartDate = subscribeStartDate;
	}

	public Date getSubscribeEndDate() {
		return subscribeEndDate;
	}

	public void setSubscribeEndDate(Date subscribeEndDate) {
		this.subscribeEndDate = subscribeEndDate;
	}

	public String getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

	public long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(long languageId) {
		this.languageId = languageId;
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