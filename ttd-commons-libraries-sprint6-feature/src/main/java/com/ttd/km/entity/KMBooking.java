package com.ttd.km.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.ehundi.entity.PgTransaction;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the KM_BOOKING database table.
 * 
 */
@Entity
@Table(name="KM_BOOKING")
@NamedQuery(name="KMBooking.findAll", query="SELECT k FROM KMBooking k")
public class KMBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="KM_BOOKING_ID")
	private String kmBookingId;

	@Column(name="BOOKING_CATEGORY")
	private String bookingCategory;

	@Column(name="BOOKING_SELF_OTHER")
	private String bookingSelfOther;

	@Column(name="BOOKING_STATUS")
	private String bookingStatus;

	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmount;

	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;

	

	@Temporal(TemporalType.DATE)
	@Column(name="CHALLAN_DATE")
	private Date challanDate;

	@Column(name="CHALLAN_FLAG")
	private String challanFlag;
	
	@Column(name="MANAGER_FLAG")
	private String managerFlag;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CHECK_IN_TIME")
	private String checkInTime;

	@Column(name="CHECK_OUT_TIME")
	private String checkOutTime;

	@Column(name="CNCELLED_BY")
	private BigDecimal cncelledBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CNCELLED_DATE")
	private Date cncelledDate;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME", insertable = false , updatable = false)
	private Date createdTime;


	@Temporal(TemporalType.DATE)
	@Column(name="END_DATE")
	private Date endDate;

	@Column(name="INSTR_AMOUNT")
	private BigDecimal instrAmount;

	@Column(name="INSTR_BANK_NAME")
	private String instrBankName;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_DATE")
	private Date instrDate;

	@Column(name="INSTR_NUMBER")
	private String instrNumber;
	
	
	@Column(name="INVOICE_NO")
	private String invoiceNo;
	
	@Column(name="KM_RENT")
	private BigDecimal kmRent;
	

	@Column(name="KM_AVAILABILITY_ID")
	private BigDecimal kmAvailabilityId;

	@Column(name="KM_AVAILABILITY_STATUS")
	private String kmAvailabilityStatus;

	@Column(name="KM_ID")
	private BigDecimal kmId;

	@Column(name="KM_TARIFF_PERDAY")
	private BigDecimal kmTariffPerday;

	@Column(name="KMCANCEL_INVOICE_NO")
	private String kmcancelInvoiceNo;

	@Column(name="NUMBER_OF_DAYS")
	private String numberOfDays;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;

	@Column(name="PAYMENT_REFERENCE")
	private String paymentReference;



	@Column(name="RECEIPT_NAME")
	private String receiptName;

	@Column(name="RECEIPT_STATUS")
	private String receiptStatus;

	@Column(name="REFUND_AMOUNT")
	private BigDecimal refundAmount;

	@Column(name="REQ_CHANNEL")
	private String reqChannel;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SESSION_ID")
	private String sessionId;

	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmount;

	@Column(name="SGST_RATE")
	private BigDecimal sgstRate;



	@Temporal(TemporalType.DATE)
	@Column(name="START_DATE")
	private Date startDate;

	@Column(name="TOTAL_AMOUNT")
	private BigDecimal totalAmount;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;



	@Column(name="WATER_TARIFF")
	private BigDecimal waterTariff;
	
	@Column(name="WATER_CGST_RATE")
	private BigDecimal waterCgstRate;
	
	@Column(name="WATER_CGST_AMOUNT")
	private BigDecimal waterCgstAmt;
	
	@Column(name="WATER_SGST_RATE")
	private BigDecimal waterSgstRate;
	
	@Column(name="WATER_SGST_AMOUNT")
	private BigDecimal wateSgstAmt;

	//bi-directional one-to-one association to KmBookingDetail
	@OneToOne(mappedBy="kmBooking",cascade = CascadeType.ALL)
	private KMBookingDetails kmBookingDetail;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;
	
	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	public KMBookingDetails getKmBookingDetail() {
		return kmBookingDetail;
	}

	public void setKmBookingDetail(KMBookingDetails kmBookingDetail) {
		this.kmBookingDetail = kmBookingDetail;
	}

	public PgTransaction getPgTransaction() {
		return pgTransaction;
	}

	public void setPgTransaction(PgTransaction pgTransaction) {
		this.pgTransaction = pgTransaction;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getKmBookingId() {
		return this.kmBookingId;
	}

	public void setKmBookingId(String kmBookingId) {
		this.kmBookingId = kmBookingId;
	}

	public String getBookingCategory() {
		return this.bookingCategory;
	}

	public void setBookingCategory(String bookingCategory) {
		this.bookingCategory = bookingCategory;
	}

	public String getBookingSelfOther() {
		return this.bookingSelfOther;
	}

	public void setBookingSelfOther(String bookingSelfOther) {
		this.bookingSelfOther = bookingSelfOther;
	}

	public String getBookingStatus() {
		return this.bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public BigDecimal getCgstAmount() {
		return this.cgstAmount;
	}

	public void setCgstAmount(BigDecimal cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	public BigDecimal getCgstRate() {
		return this.cgstRate;
	}

	public void setCgstRate(BigDecimal cgstRate) {
		this.cgstRate = cgstRate;
	}

	public Date getChallanDate() {
		return this.challanDate;
	}

	public void setChallanDate(Date challanDate) {
		this.challanDate = challanDate;
	}

	public String getChallanFlag() {
		return this.challanFlag;
	}

	public void setChallanFlag(String challanFlag) {
		this.challanFlag = challanFlag;
	}

	public BigDecimal getChannelTypeId() {
		return this.channelTypeId;
	}

	public void setChannelTypeId(BigDecimal channelTypeId) {
		this.channelTypeId = channelTypeId;
	}

	public String getCheckInTime() {
		return this.checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return this.checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public BigDecimal getCncelledBy() {
		return this.cncelledBy;
	}

	public void setCncelledBy(BigDecimal cncelledBy) {
		this.cncelledBy = cncelledBy;
	}

	public Date getCncelledDate() {
		return this.cncelledDate;
	}

	public void setCncelledDate(Date cncelledDate) {
		this.cncelledDate = cncelledDate;
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



	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public BigDecimal getInstrAmount() {
		return this.instrAmount;
	}

	public void setInstrAmount(BigDecimal instrAmount) {
		this.instrAmount = instrAmount;
	}

	public String getInstrBankName() {
		return this.instrBankName;
	}

	public void setInstrBankName(String instrBankName) {
		this.instrBankName = instrBankName;
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

	public BigDecimal getKmAvailabilityId() {
		return this.kmAvailabilityId;
	}

	public void setKmAvailabilityId(BigDecimal kmAvailabilityId) {
		this.kmAvailabilityId = kmAvailabilityId;
	}

	public String getKmAvailabilityStatus() {
		return this.kmAvailabilityStatus;
	}

	public void setKmAvailabilityStatus(String kmAvailabilityStatus) {
		this.kmAvailabilityStatus = kmAvailabilityStatus;
	}

	public BigDecimal getKmId() {
		return this.kmId;
	}

	public void setKmId(BigDecimal kmId) {
		this.kmId = kmId;
	}

	public BigDecimal getKmTariffPerday() {
		return this.kmTariffPerday;
	}

	public void setKmTariffPerday(BigDecimal kmTariffPerday) {
		this.kmTariffPerday = kmTariffPerday;
	}

	public String getKmcancelInvoiceNo() {
		return this.kmcancelInvoiceNo;
	}

	public void setKmcancelInvoiceNo(String kmcancelInvoiceNo) {
		this.kmcancelInvoiceNo = kmcancelInvoiceNo;
	}

	public String getNumberOfDays() {
		return this.numberOfDays;
	}

	public void setNumberOfDays(String numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPaymentReference() {
		return this.paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}



	public String getReceiptName() {
		return this.receiptName;
	}

	public void setReceiptName(String receiptName) {
		this.receiptName = receiptName;
	}

	public String getReceiptStatus() {
		return this.receiptStatus;
	}

	public void setReceiptStatus(String receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	public BigDecimal getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
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

	public BigDecimal getSgstAmount() {
		return this.sgstAmount;
	}

	public void setSgstAmount(BigDecimal sgstAmount) {
		this.sgstAmount = sgstAmount;
	}

	public BigDecimal getSgstRate() {
		return this.sgstRate;
	}

	public void setSgstRate(BigDecimal sgstRate) {
		this.sgstRate = sgstRate;
	}

	
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
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

	

	public BigDecimal getWaterTariff() {
		return this.waterTariff;
	}

	public void setWaterTariff(BigDecimal waterTariff) {
		this.waterTariff = waterTariff;
	}

	public KMBookingDetails getKMBookingDetail() {
		return this.kmBookingDetail;
	}

	public void setKMBookingDetail(KMBookingDetails kmBookingDetail) {
		this.kmBookingDetail = kmBookingDetail;
	}

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public BigDecimal getKmRent() {
		return kmRent;
	}

	public void setKmRent(BigDecimal kmRent) {
		this.kmRent = kmRent;
	}

	public BigDecimal getWaterCgstRate() {
		return waterCgstRate;
	}

	public void setWaterCgstRate(BigDecimal waterCgstRate) {
		this.waterCgstRate = waterCgstRate;
	}

	public BigDecimal getWaterCgstAmt() {
		return waterCgstAmt;
	}

	public void setWaterCgstAmt(BigDecimal waterCgstAmt) {
		this.waterCgstAmt = waterCgstAmt;
	}

	public BigDecimal getWaterSgstRate() {
		return waterSgstRate;
	}

	public void setWaterSgstRate(BigDecimal waterSgstRate) {
		this.waterSgstRate = waterSgstRate;
	}

	public BigDecimal getWateSgstAmt() {
		return wateSgstAmt;
	}

	public void setWateSgstAmt(BigDecimal wateSgstAmt) {
		this.wateSgstAmt = wateSgstAmt;
	}

	public String getManagerFlag() {
		return managerFlag;
	}

	public void setManagerFlag(String managerFlag) {
		this.managerFlag = managerFlag;
	}
}