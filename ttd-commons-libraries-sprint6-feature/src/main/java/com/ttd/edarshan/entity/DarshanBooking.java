package com.ttd.edarshan.entity;

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
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.eaccommodation.entity.BookingPilgrim;
import com.ttd.ehundi.entity.PgTransaction;
import com.ttd.eseva.entity.SevaBookingDetail;

/**
 * The persistent class for the DARSHAN_BOOKING database table.
 * 
 */
@Entity
@Table(name = "DARSHAN_BOOKING")
@NamedQuery(name = "DarshanBooking.findAll", query = "SELECT d FROM DarshanBooking d")
public class DarshanBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DARSHAN_BOOKING_ID")
	private String darshanBookingId;

	@Column(name = "ADDITIONAL_LADDUS_PRICE")
	private BigDecimal additionalLaddusPrice;

	@Column(name = "BOOKING_SELF_OTHER")
	private String bookingSelfOther;

	@Column(name = "BOOKING_STATUS")
	private String bookingStatus;

	@Column(name = "CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;
	
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CANCELLED_DATE", insertable = false, updatable = false)
	private Date cancelledDate;

	@Temporal(TemporalType.DATE)
	@Column(name = "DARSHAN_DATE")
	private Date darshanDate;

	@Column(name = "DARSHAN_TYPE_ID")
	private BigDecimal darshanTypeId;

	@Column(name = "HUNDI_AMOUNT")
	private BigDecimal hundiAmount;

	@Column(name = "NO_OF_ADDITIONAL_LADDUS")
	private BigDecimal noOfAdditionalLaddus;

	@Column(name = "NO_OF_LADDUS")
	private BigDecimal noOfLaddus;

	@Column(name = "NO_OF_PERSONS")
	private BigDecimal noOfPersons;

	@Column(name = "PAYMENT_REFERENCE")
	private String paymentReference;

	@Column(name = "RECEIPT_NAME")
	private String receiptName;

	@Column(name = "RECEIPT_STATUS")
	private String receiptStatus;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_ID")
	private BigDecimal slotId;

	@Column(name = "SLOT_NAME")
	private String slotName;

	@Column(name = "TICKET_AVAILABILITY_STATUS")
	private String ticketAvailabilityStatus;

	@Column(name = "TICKET_PRICE_TOTAL")
	private BigDecimal ticketPriceTotal;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name = "REFUND_AMOUNT ")
	private BigDecimal refundAmount;
	
	@Column(name = "REPORTING_TIME")
	private String reportingTime;

	// bi-directional many-to-one association to DarshanAvailability
	@ManyToOne
	@JoinColumn(name = "DARSHAN_AVAILABILITY_ID")
	private DarshanAvailability darshanAvailability;

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

	// bi-directional many-to-one association to DarshanBookingPilgrim
	@OneToMany(mappedBy = "darshanBooking", cascade = CascadeType.ALL)
	@OrderBy("pilgrimId ASC")
	private List<DarshanBookingPilgrim> darshanBookingPilgrims;
	
	@Column(name = "SESSION_ID")
	private String sessionId;
	
	@Column(name="REQ_CHANNEL")
	private String requestChannel;
	
	@Column(name = "HUNDI_RECEIPT")
	private String hundiReceipt;
	
	@Column(name = "IS_ECOUNTER")
	private String isEcounter;
	
	@Column(name = "CHALLAN_FLAG")
	private String challanFlag;
	
	@Column(name = "ACCOM_BOOKING_ID")
	private String accomBookingId;

	@Column(name = "DONATION_RECEIPT")
	private String donationReceipt;
	
	@Column(name = "DONATION_AMOUNT")
	private BigDecimal donationAmount;
	
	@Column(name = "TRUST_ID")
	private long trustId;
	
	@Column(name = "OFFERING_ID")
	private String offeringId;
	
	public DarshanBooking() {
	}

	public String getDarshanBookingId() {
		return this.darshanBookingId;
	}

	public void setDarshanBookingId(String darshanBookingId) {
		this.darshanBookingId = darshanBookingId;
	}

	public BigDecimal getAdditionalLaddusPrice() {
		return this.additionalLaddusPrice;
	}

	public void setAdditionalLaddusPrice(BigDecimal additionalLaddusPrice) {
		this.additionalLaddusPrice = additionalLaddusPrice;
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

	public Date getDarshanDate() {
		return this.darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	public BigDecimal getDarshanTypeId() {
		return this.darshanTypeId;
	}

	public void setDarshanTypeId(BigDecimal darshanTypeId) {
		this.darshanTypeId = darshanTypeId;
	}

	public BigDecimal getHundiAmount() {
		return this.hundiAmount;
	}

	public void setHundiAmount(BigDecimal hundiAmount) {
		this.hundiAmount = hundiAmount;
	}

	public BigDecimal getNoOfAdditionalLaddus() {
		return this.noOfAdditionalLaddus;
	}

	public void setNoOfAdditionalLaddus(BigDecimal noOfAdditionalLaddus) {
		this.noOfAdditionalLaddus = noOfAdditionalLaddus;
	}

	public BigDecimal getNoOfLaddus() {
		return this.noOfLaddus;
	}

	public void setNoOfLaddus(BigDecimal noOfLaddus) {
		this.noOfLaddus = noOfLaddus;
	}

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

	public BigDecimal getSlotId() {
		return this.slotId;
	}

	public void setSlotId(BigDecimal slotId) {
		this.slotId = slotId;
	}

	public String getSlotName() {
		return this.slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

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

	public DarshanAvailability getDarshanAvailability() {
		return this.darshanAvailability;
	}

	public void setDarshanAvailability(DarshanAvailability darshanAvailability) {
		this.darshanAvailability = darshanAvailability;
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

	public List<DarshanBookingPilgrim> getDarshanBookingPilgrims() {
		return darshanBookingPilgrims;
	}

	public void setDarshanBookingPilgrims(
			List<DarshanBookingPilgrim> darshanBookingPilgrims) {
		this.darshanBookingPilgrims = darshanBookingPilgrims;
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
	
	public String getHundiReceipt() {
		return hundiReceipt;
	}

	public void setHundiReceipt(String hundiReceipt) {
		this.hundiReceipt = hundiReceipt;
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

	public String getAccomBookingId() {
		return accomBookingId;
	}

	public void setAccomBookingId(String accomBookingId) {
		this.accomBookingId = accomBookingId;
	}

	public String getDonationReceipt() {
		return donationReceipt;
	}

	public void setDonationReceipt(String donationReceipt) {
		this.donationReceipt = donationReceipt;
	}

	public BigDecimal getDonationAmount() {
		return donationAmount;
	}

	public void setDonationAmount(BigDecimal donationAmount) {
		this.donationAmount = donationAmount;
	}

	public long getTrustId() {
		return trustId;
	}

	public void setTrustId(long trustId) {
		this.trustId = trustId;
	}

	public String getOfferingId() {
		return offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public Date getCancelledDate() {
		return cancelledDate;
	}

	public void setCancelledDate(Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}

	public String getReportingTime() {
		return reportingTime;
	}

	public void setReportingTime(String reportingTime) {
		this.reportingTime = reportingTime;
	}


	
	
	
	
}