package com.ttd.publications.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.ehundi.entity.PgTransaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PUBLICATIONS_BOOKING database table.
 * 
 */
@Entity
@Table(name="PUBLICATIONS_BOOKING")
@NamedQuery(name="PublicationsBooking.findAll", query="SELECT p FROM PublicationsBooking p")
public class PublicationsBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="P_BOOKING_ID")
	private String pBookingId;

	@Column(name="BOOKING_FOR_SELF")
	private String bookingForSelf;

	@Column(name="BOOKING_STATUS")
	private String bookingStatus;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME" , insertable = false , updatable = false)
	private Date createdTime;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;

	@Column(name="OTHER_USER_AGE")
	private BigDecimal otherUserAge;

	@Column(name="OTHER_USER_GENDER")
	private String otherUserGender;

	@Column(name="PAYMENT_RECEIPT")
	private String paymentReceipt;

	@Column(name="PAYMENT_RECEIPT_STATUS")
	private String paymentReceiptStatus;

	@Column(name="PAYMENT_REFERENCE")
	private String paymentReference;

	@Column(name="REQ_CHANNEL")
	private String reqChannel;

	@Column(name="ROW_STATUS" , insertable = false , updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SESSION_ID")
	private String sessionId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;

	@Column(name="TOTAL_BOOKING_AMOUNT")
	private BigDecimal totalBookingAmount;

	@Column(name="TOTAL_BOOKING_QUANTITY")
	private BigDecimal totalBookingQuantity;

	@Column(name="TOTAL_PACKING_PRICE")
	private BigDecimal totalPackingPrice;

	@Column(name="TOTAL_SHIPPING_PRICE")
	private BigDecimal totalShippingPrice;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_CITY")
	private String userCity;

	@Column(name="USER_COUNTRY")
	private String userCountry;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;

	@Column(name="USER_MOBILE")
	private String userMobile;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_SHIPPING_ADDR1")
	private String userShippingAddr1;

	@Column(name="USER_SHIPPING_ADDR2")
	private String userShippingAddr2;

	@Column(name="USER_STATE")
	private String userState;

	@Column(name="USER_ZIP_CODE")
	private String userZipCode;
	@Column(name="STOCK_POINT_NAME")
	private String stockPointName;
	
	@Column(name="SHIPMENT_GATEWAY")
	private String shipmentGatway;
	
	@Column(name="POSTAL_SEQ_NUMBER")
	private String postalSequenceNumber;

	//bi-directional many-to-one association to PgTransaction
	@ManyToOne
	@JoinColumn(name="PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;

	//bi-directional many-to-one association to PublicationsBookingDtl
	@OneToMany(mappedBy="publicationsBooking", cascade = CascadeType.ALL)
	private List<PublicationsBookingDtl> publicationsBookingDtls;

	

	@Column(name="BASE_PRICE")
	private BigDecimal basePrice;
	
	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmount;
	
	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmount;
	
	@Column(name="IGST_AMOUNT")
	private BigDecimal igstAmount;
	
	@Column(name="IGST_RATE")
	private BigDecimal igstRate;
	
	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;
	
	@Column(name="SGST_RATE")
	private BigDecimal sgstRate;
	
	
	@Column(name="GSTIN_NO")
	private String gstINNo;
	
	@Column(name="INVOICE_NO")
	private String invoiceNo;
	
	
	
	
	
	public String getGstINNo() {
		return gstINNo;
	}

	public void setGstINNo(String gstINNo) {
		this.gstINNo = gstINNo;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getpBookingId() {
		return pBookingId;
	}

	public void setpBookingId(String pBookingId) {
		this.pBookingId = pBookingId;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public BigDecimal getSgstAmount() {
		return sgstAmount;
	}

	public void setSgstAmount(BigDecimal sgstAmount) {
		this.sgstAmount = sgstAmount;
	}

	public BigDecimal getCgstAmount() {
		return cgstAmount;
	}

	public void setCgstAmount(BigDecimal cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	public BigDecimal getIgstAmount() {
		return igstAmount;
	}

	public void setIgstAmount(BigDecimal igstAmount) {
		this.igstAmount = igstAmount;
	}

	public BigDecimal getIgstRate() {
		return igstRate;
	}

	public void setIgstRate(BigDecimal igstRate) {
		this.igstRate = igstRate;
	}

	public BigDecimal getCgstRate() {
		return cgstRate;
	}

	public void setCgstRate(BigDecimal cgstRate) {
		this.cgstRate = cgstRate;
	}

	public BigDecimal getSgstRate() {
		return sgstRate;
	}

	public void setSgstRate(BigDecimal sgstRate) {
		this.sgstRate = sgstRate;
	}

	public String getShipmentGatway() {
		return shipmentGatway;
	}

	public void setShipmentGatway(String shipmentGatway) {
		this.shipmentGatway = shipmentGatway;
	}

	public String getStockPointName() {
		return stockPointName;
	}

	public void setStockPointName(String stockPointName) {
		this.stockPointName = stockPointName;
	}

	public PublicationsBooking() {
	}

	public String getPBookingId() {
		return this.pBookingId;
	}

	public void setPBookingId(String pBookingId) {
		this.pBookingId = pBookingId;
	}

	public String getBookingForSelf() {
		return this.bookingForSelf;
	}

	public void setBookingForSelf(String bookingForSelf) {
		this.bookingForSelf = bookingForSelf;
	}

	public String getBookingStatus() {
		return this.bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
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

	
	public BigDecimal getOtherUserAge() {
		return this.otherUserAge;
	}

	public void setOtherUserAge(BigDecimal otherUserAge) {
		this.otherUserAge = otherUserAge;
	}

	public String getOtherUserGender() {
		return this.otherUserGender;
	}

	public void setOtherUserGender(String otherUserGender) {
		this.otherUserGender = otherUserGender;
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

	public String getPaymentReference() {
		return this.paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

	public String getReqChannel() {
		return this.reqChannel;
	}

	public void setReqChannel(String reqChannel) {
		this.reqChannel = reqChannel;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	
	public BigDecimal getTotalBookingAmount() {
		return this.totalBookingAmount;
	}

	public void setTotalBookingAmount(BigDecimal totalBookingAmount) {
		this.totalBookingAmount = totalBookingAmount;
	}

	public BigDecimal getTotalBookingQuantity() {
		return this.totalBookingQuantity;
	}

	public void setTotalBookingQuantity(BigDecimal totalBookingQuantity) {
		this.totalBookingQuantity = totalBookingQuantity;
	}

	public BigDecimal getTotalPackingPrice() {
		return this.totalPackingPrice;
	}

	public void setTotalPackingPrice(BigDecimal totalPackingPrice) {
		this.totalPackingPrice = totalPackingPrice;
	}

	public BigDecimal getTotalShippingPrice() {
		return this.totalShippingPrice;
	}

	public void setTotalShippingPrice(BigDecimal totalShippingPrice) {
		this.totalShippingPrice = totalShippingPrice;
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

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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
	
	
	public EmailNotification getEmailNotifcation() {
		return emailNotifcation;
	}

	public void setEmailNotifcation(EmailNotification emailNotifcation) {
		this.emailNotifcation = emailNotifcation;
	}

	public SmsNotification getSmsNotification() {
		return smsNotification;
	}

	public void setSmsNotification(SmsNotification smsNotification) {
		this.smsNotification = smsNotification;
	}

	public PgTransaction getPgTransaction() {
		return this.pgTransaction;
	}

	public void setPgTransaction(PgTransaction pgTransaction) {
		this.pgTransaction = pgTransaction;
	}

	public List<PublicationsBookingDtl> getPublicationsBookingDtls() {
		return this.publicationsBookingDtls;
	}

	public void setPublicationsBookingDtls(List<PublicationsBookingDtl> publicationsBookingDtls) {
		this.publicationsBookingDtls = publicationsBookingDtls;
	}

	public PublicationsBookingDtl addPublicationsBookingDtl(PublicationsBookingDtl publicationsBookingDtl) {
		getPublicationsBookingDtls().add(publicationsBookingDtl);
		publicationsBookingDtl.setPublicationsBooking(this);

		return publicationsBookingDtl;
	}

	public PublicationsBookingDtl removePublicationsBookingDtl(PublicationsBookingDtl publicationsBookingDtl) {
		getPublicationsBookingDtls().remove(publicationsBookingDtl);
		publicationsBookingDtl.setPublicationsBooking(null);

		return publicationsBookingDtl;
	}

	public String getPostalSequenceNumber() {
		return postalSequenceNumber;
	}

	public void setPostalSequenceNumber(String postalSequenceNumber) {
		this.postalSequenceNumber = postalSequenceNumber;
	}
}