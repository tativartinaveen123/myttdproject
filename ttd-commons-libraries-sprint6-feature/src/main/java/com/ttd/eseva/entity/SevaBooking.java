package com.ttd.eseva.entity;

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

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.ehundi.entity.PgTransaction;


/**
 * The persistent class for the SEVA_BOOKING database table.
 * 
 */
@Entity
@Table(name="SEVA_BOOKING")
@NamedQuery(name="SevaBooking.findAll", query="SELECT s FROM SevaBooking s")
public class SevaBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEVA_BOOKING_ID")
	private String sevaBookingId;

	@Column(name="BOOKING_STATUS")
	private String bookingStatus;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME" , insertable = false , updatable = false)
	private Date createdTime;

	@Column(name="NO_OF_PERSONS")
	private BigDecimal noOfPersons;

	@Column(name="NO_OF_TICKETS")
	private BigDecimal noOfTickets;

	@Column(name="RECEIPT_NAME")
	private String receiptName;

	@Column(name="RECEIPT_STATUS")
	private String receiptStatus;

	@Column(name="ROW_STATUS",insertable = false ,updatable = false)
	private BigDecimal rowStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="SEVA_DATE")
	private Date sevaDate;

	@Column(name="TICKET_AVAILABILITY_STATUS")
	private String ticketAvailabilityStatus;

	@Column(name="TICKET_PRICE")
	private BigDecimal ticketPrice;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="PAYMENT_REFERENCE")
	private String paymentReference;
	
	@Column(name = "IS_ECOUNTER")
	private String isEcounter;
	
	@Column(name = "CHALLAN_FLAG")
	private String challanFlag;
	
	@Column(name = "SESSION_ID")
	private String sessionId;
	
	@Column(name="REQ_CHANNEL")
	private String requestChannel;
	
	@Temporal(TemporalType.DATE)
	@Column(name="REFUND_DATE")
	private Date refundDate;
	
	@Column(name="REFUND_STATUS")
	private String refundStatus;
	
	@Column(name="REFUND_AMOUNT")
	private BigDecimal refundAmount;
	
	@Column(name="SLOT_ID")
	private BigDecimal slotId;

	@Column(name="DARSHAN_TYPE_ID")
	private BigDecimal darshanTypeId;



	//bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	//bi-directional many-to-one association to EmailNotifcation
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;

	//bi-directional many-to-one association to PgTransaction
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;

	//bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name="SEVA_ID")
	private SevaMaster sevaMaster;

	//bi-directional many-to-one association to SmsNotification
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	//bi-directional many-to-one association to SevaBookingDetail
	@OneToMany(mappedBy="sevaBooking",cascade = CascadeType.ALL)
	private List<SevaBookingDetail> sevaBookingDetails;
	
	
	@Column(name="LOCATION_ID")
	private BigDecimal locationId;
	
	
	@Column(name="SLOT_NAME")
	private String slotName;
	
	@Column(name="DARSHAN_DATE")
	private Date darshanDate;
	
	@Column(name="DARSHAN_PRICE")
	private BigDecimal darshanPrice;
	
	@Column(name="NO_OF_LADDUS")
	private BigDecimal noOfLaddus;
	
	@Column(name="NO_OF_ADDITIONAL_LADDUS")
	private BigDecimal noOfAdditionalLaddus;
	
	@Column(name="ADDITIONAL_LADDUS_PRICE")
	private BigDecimal additionalLaddusPrice;
	
	
	@Column(name="HUNDI_AMOUNT")
	private BigDecimal hundiAmount;
	

	@Column(name="DARSHAN_OPTED")
	private String darshanOpted;
	

	@Column(name="NO_OF_DARSHAN_PERSONS")
	private BigDecimal noOfDarshanPersons;
	
	
	public BigDecimal getSlotId() {
		return slotId;
	}

	public void setSlotId(BigDecimal slotId) {
		this.slotId = slotId;
	}

	public BigDecimal getDarshanTypeId() {
		return darshanTypeId;
	}

	public void setDarshanTypeId(BigDecimal darshanTypeId) {
		this.darshanTypeId = darshanTypeId;
	}

	public String getPostalSeqNumber() {
		return postalSeqNumber;
	}

	public void setPostalSeqNumber(String postalSeqNumber) {
		this.postalSeqNumber = postalSeqNumber;
	}

	@Column(name="POSTAL_SEQ_NUMBER")
	private String postalSeqNumber;
	
	
	public SevaBooking() {
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

	public String getSevaBookingId() {
		return this.sevaBookingId;
	}

	public void setSevaBookingId(String sevaBookingId) {
		this.sevaBookingId = sevaBookingId;
	}

	public String getBookingStatus() {
		return this.bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
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

	public BigDecimal getNoOfPersons() {
		return this.noOfPersons;
	}

	public void setNoOfPersons(BigDecimal noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public BigDecimal getNoOfTickets() {
		return this.noOfTickets;
	}

	public void setNoOfTickets(BigDecimal noOfTickets) {
		this.noOfTickets = noOfTickets;
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

	public Date getSevaDate() {
		return this.sevaDate;
	}

	public void setSevaDate(Date sevaDate) {
		this.sevaDate = sevaDate;
	}

	public String getTicketAvailabilityStatus() {
		return this.ticketAvailabilityStatus;
	}

	public void setTicketAvailabilityStatus(String ticketAvailabilityStatus) {
		this.ticketAvailabilityStatus = ticketAvailabilityStatus;
	}

	public BigDecimal getTicketPrice() {
		return this.ticketPrice;
	}

	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
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

	public ChannelMaster getChannelMaster() {
		return this.channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
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

	public SevaMaster getSevaMaster() {
		return this.sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
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

	public List<SevaBookingDetail> getSevaBookingDetails() {
		return this.sevaBookingDetails;
	}

	public void setSevaBookingDetails(List<SevaBookingDetail> sevaBookingDetails) {
		this.sevaBookingDetails = sevaBookingDetails;
	}

	public SevaBookingDetail addSevaBookingDetail(SevaBookingDetail sevaBookingDetail) {
		getSevaBookingDetails().add(sevaBookingDetail);
		sevaBookingDetail.setSevaBooking(this);

		return sevaBookingDetail;
	}

	public SevaBookingDetail removeSevaBookingDetail(SevaBookingDetail sevaBookingDetail) {
		getSevaBookingDetails().remove(sevaBookingDetail);
		sevaBookingDetail.setSevaBooking(null);

		return sevaBookingDetail;
	}

	public String getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
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

	public BigDecimal getLocationId() {
		return locationId;
	}

	public void setLocationId(BigDecimal locationId) {
		this.locationId = locationId;
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

	public BigDecimal getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(BigDecimal refundAmount) {
		this.refundAmount = refundAmount;
	}

	public String getSlotName() {
		return slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	public Date getDarshanDate() {
		return darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	public BigDecimal getDarshanPrice() {
		return darshanPrice;
	}

	public void setDarshanPrice(BigDecimal darshanPrice) {
		this.darshanPrice = darshanPrice;
	}

	public BigDecimal getNoOfLaddus() {
		return noOfLaddus;
	}

	public void setNoOfLaddus(BigDecimal noOfLaddus) {
		this.noOfLaddus = noOfLaddus;
	}

	public BigDecimal getNoOfAdditionalLaddus() {
		return noOfAdditionalLaddus;
	}

	public void setNoOfAdditionalLaddus(BigDecimal noOfAdditionalLaddus) {
		this.noOfAdditionalLaddus = noOfAdditionalLaddus;
	}

	public BigDecimal getAdditionalLaddusPrice() {
		return additionalLaddusPrice;
	}

	public void setAdditionalLaddusPrice(BigDecimal additionalLaddusPrice) {
		this.additionalLaddusPrice = additionalLaddusPrice;
	}

	public BigDecimal getHundiAmount() {
		return hundiAmount;
	}

	public void setHundiAmount(BigDecimal hundiAmount) {
		this.hundiAmount = hundiAmount;
	}

	public String getDarshanOpted() {
		return darshanOpted;
	}

	public void setDarshanOpted(String darshanOpted) {
		this.darshanOpted = darshanOpted;
	}

	public BigDecimal getNoOfDarshanPersons() {
		return noOfDarshanPersons;
	}

	public void setNoOfDarshanPersons(BigDecimal noOfDarshanPersons) {
		this.noOfDarshanPersons = noOfDarshanPersons;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}