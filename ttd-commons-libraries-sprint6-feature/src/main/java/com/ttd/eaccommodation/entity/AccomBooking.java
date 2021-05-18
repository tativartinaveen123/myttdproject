package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.ehundi.entity.PgTransaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ACCOM_BOOKING database table.
 * 
 */
@Entity
@Table(name="ACCOM_BOOKING")
@NamedQuery(name="AccomBooking.findAll", query="SELECT a FROM AccomBooking a")
public class AccomBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCOM_BOOKING_ID")
	private String accomBookingId;

	@Column(name="ACCOM_CODE")
	private String accomCode;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOM_DATE")
	private Date accomDate;

	@Column(name="ACCOM_ID")
	private BigDecimal accomId;

	@Column(name="BOOKING_SELF_OTHER")
	private String bookingSelfOther;

	@Column(name="BOOKING_STATUS")
	private String bookingStatus;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CHECKIN_TIME_SLOT")
	private String checkinTimeSlot;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false , updatable = false)
	private Date createdTime;

//	@Column(name="EMAIL_NOTIFICATION_ID")
//	private BigDecimal emailNotificationId;

	@Column(name="NO_OF_PERSONS")
	private BigDecimal noOfPersons;

	@Column(name="PAYMENT_REFERENCE")
	private String paymentReference;

//	@Column(name="PG_TRANSACTION_ID")
//	private BigDecimal pgTransactionId;

	@Column(name="RECEIPT_NAME")
	private String receiptName;

	@Column(name="RECEIPT_STATUS")
	private String receiptStatus;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;
	
	@Column(name = "IS_ECOUNTER")
	private String isEcounter;
	
	@Column(name = "CHALLAN_FLAG")
	private String challanFlag;

//	@Column(name="SMS_NOTIFICATION_ID")
//	private BigDecimal smsNotificationId;

	@Column(name="TICKET_AVAILABILITY_STATUS")
	private String ticketAvailabilityStatus;

	@Column(name="TICKET_PRICE_TOTAL")
	private BigDecimal ticketPriceTotal;

	@Column(name="TICKET_PRICE_TOTAL_CD")
	private BigDecimal ticketPriceTotalCD;
	
	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;
	
	@Column(name = "SESSION_ID")
	private String sessionId;
	
	@Column(name="REQ_CHANNEL")
	private String requestChannel;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "ADV_BOOKING_DEPOSIT")
	private BigDecimal advBookingDeposit;

	@Column(name = "REFUND_AMOUNT")
	private BigDecimal refundAmount;
	
	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmount;
	
	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmount;
	
	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;
	
	@Column(name="SGST_RATE")
	private BigDecimal sgstRate;
	
	@Column(name="INVOICE_NO")
	private String invoiceNo;
	
	@Column(name="CANCEL_INVOICE_NO")
	private String cancelInvoiceNo;
	@Column(name="NO_OF_DAYS")
	private BigDecimal noOfDays;
	
	@Temporal(TemporalType.DATE)
	@Column(name="REFUND_DATE")
	private Date refundDate;
	
	@Column(name="REFUND_STATUS")
	private String refundStatus;
		
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	//bi-directional many-to-one association to AccomAvailability
	@ManyToOne
	@JoinColumn(name="ACCOM_AVAILABILITY_ID")
	private AccomAvailability accomAvailability;

	//bi-directional many-to-one association to AccomBookingPilgrim
	@OneToMany(mappedBy="accomBooking", cascade = CascadeType.ALL)
	private List<AccomBookingPilgrim> accomBookingPilgrims;
	
	@OneToMany(mappedBy="accomBooking", cascade = CascadeType.ALL)
	private List<AccomBookingDtls> accomBookingDtls;
	
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;

	public AccomBooking() {
	}

	public String getAccomBookingId() {
		return this.accomBookingId;
	}

	public void setAccomBookingId(String accomBookingId) {
		this.accomBookingId = accomBookingId;
	}

	public String getAccomCode() {
		return this.accomCode;
	}

	public void setAccomCode(String accomCode) {
		this.accomCode = accomCode;
	}

	public Date getAccomDate() {
		return this.accomDate;
	}

	public void setAccomDate(Date accomDate) {
		this.accomDate = accomDate;
	}

	public BigDecimal getAccomId() {
		return this.accomId;
	}

	public void setAccomId(BigDecimal accomId) {
		this.accomId = accomId;
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

	public BigDecimal getChannelTypeId() {
		return this.channelTypeId;
	}

	public void setChannelTypeId(BigDecimal channelTypeId) {
		this.channelTypeId = channelTypeId;
	}

	public String getCheckinTimeSlot() {
		return this.checkinTimeSlot;
	}

	public void setCheckinTimeSlot(String checkinTimeSlot) {
		this.checkinTimeSlot = checkinTimeSlot;
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

//	public BigDecimal getEmailNotificationId() {
//		return this.emailNotificationId;
//	}
//
//	public void setEmailNotificationId(BigDecimal emailNotificationId) {
//		this.emailNotificationId = emailNotificationId;
//	}

	public BigDecimal getNoOfPersons() {
		return this.noOfPersons;
	}

	public void setNoOfPersons(BigDecimal noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public String getPaymentReference() {
		return this.paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

//	public BigDecimal getPgTransactionId() {
//		return this.pgTransactionId;
//	}
//
//	public void setPgTransactionId(BigDecimal pgTransactionId) {
//		this.pgTransactionId = pgTransactionId;
//	}

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

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

//	public BigDecimal getSmsNotificationId() {
//		return this.smsNotificationId;
//	}
//
//	public void setSmsNotificationId(BigDecimal smsNotificationId) {
//		this.smsNotificationId = smsNotificationId;
//	}

	public String getTicketAvailabilityStatus() {
		return this.ticketAvailabilityStatus;
	}

	public void setTicketAvailabilityStatus(String ticketAvailabilityStatus) {
		this.ticketAvailabilityStatus = ticketAvailabilityStatus;
	}

	public BigDecimal getTicketPriceTotal() {
		return this.ticketPriceTotal;
	}

	public void setTicketPriceTotal(BigDecimal ticketPriceTotal) {
		this.ticketPriceTotal = ticketPriceTotal;
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
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public AccomAvailability getAccomAvailability() {
		return this.accomAvailability;
	}

	public void setAccomAvailability(AccomAvailability accomAvailability) {
		this.accomAvailability = accomAvailability;
	}

	public BigDecimal getTicketPriceTotalCD() {
		return ticketPriceTotalCD;
	}

	public void setTicketPriceTotalCD(BigDecimal ticketPriceTotalCD) {
		this.ticketPriceTotalCD = ticketPriceTotalCD;
	}

	public List<AccomBookingPilgrim> getAccomBookingPilgrims() {
		return this.accomBookingPilgrims;
	}

	public void setAccomBookingPilgrims(List<AccomBookingPilgrim> accomBookingPilgrims) {
		this.accomBookingPilgrims = accomBookingPilgrims;
	}

	public AccomBookingPilgrim addAccomBookingPilgrim(AccomBookingPilgrim accomBookingPilgrim) {
		getAccomBookingPilgrims().add(accomBookingPilgrim);
		accomBookingPilgrim.setAccomBooking(this);

		return accomBookingPilgrim;
	}

	public AccomBookingPilgrim removeAccomBookingPilgrim(AccomBookingPilgrim accomBookingPilgrim) {
		getAccomBookingPilgrims().remove(accomBookingPilgrim);
		accomBookingPilgrim.setAccomBooking(null);

		return accomBookingPilgrim;
	}

	public PgTransaction getPgTransaction() {
		return this.pgTransaction;
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

	public void setSmsNotification(SmsNotification smsNotifcation) {
		this.smsNotification = smsNotifcation;
	}

	public String getIsEcounter() {
		return isEcounter;
	}

	public void setIsEcounter(String isEcounter) {
		this.isEcounter = isEcounter;
	}

	public String getChallanFlag() {
		return challanFlag;
	}

	public void setChallanFlag(String challanFlag) {
		this.challanFlag = challanFlag;
	}

	public BigDecimal getAdvBookingDeposit() {
		return advBookingDeposit;
	}

	public void setAdvBookingDeposit(BigDecimal advBookingDeposit) {
		this.advBookingDeposit = advBookingDeposit;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
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

	public BigDecimal getCgstAmount() {
		return cgstAmount;
	}

	public void setCgstAmount(BigDecimal cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	public BigDecimal getSgstAmount() {
		return sgstAmount;
	}

	public void setSgstAmount(BigDecimal sgstAmount) {
		this.sgstAmount = sgstAmount;
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

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getCancelInvoiceNo() {
		return cancelInvoiceNo;
	}

	public void setCancelInvoiceNo(String cancelInvoiceNo) {
		this.cancelInvoiceNo = cancelInvoiceNo;
	}

	public BigDecimal getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(BigDecimal noOfDays) {
		this.noOfDays = noOfDays;
	}

	public List<AccomBookingDtls> getAccomBookingDtls() {
		return accomBookingDtls;
	}

	public void setAccomBookingDtls(List<AccomBookingDtls> accomBookingDtls) {
		this.accomBookingDtls = accomBookingDtls;
	}

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public String getRefundStatus() {
		return refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	
	
}