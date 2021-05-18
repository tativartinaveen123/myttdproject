package com.ttd.donor.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.ehundi.entity.PgTransaction;
import com.ttd.publications.entity.PublicationsBookingDtl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="DOLLAR_BOOKING")
@NamedQuery(name="DollarBooking.findAll", query="SELECT d FROM DollarBooking d")
public class DollarBooking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="P_BOOKING_ID")
	private String pBookingId;

	@Column(name="BOOKING_STATUS")
	private String bookingStatus;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="DARSHAN_REDEEM_ID")
	private String darshanRedeemId;

	@Column(name="ID_PROOF_NUMBER")
	private String idProofNumber;

	@Column(name="ID_PROOF_TYPE")
	private String idProofType;

	@Column(name="PAYMENT_RECEIPT")
	private String paymentReceipt;

	@Column(name="PAYMENT_RECEIPT_STATUS")
	private String paymentReceiptStatus;

	@Column(name="PAYMENT_REFERENCE")
	private String paymentReference;
	
	@Column(name="OPERATOR_USER_ID")
	private BigDecimal operatorUserId;
	
	
	@Column(name="PILGRIM_NAME")
	private String piligrimname;

	@Column(name="REQ_CHANNEL")
	private String reqChannel;
	
	@Column(name="COLLECTION_DATE")
	private Date collectionDate;
	
	@Column(name="COLLECTED_DATE")
	private Date collectedDate;
	
	@Column(name="COLLECTION_STATUS")
	private String colletionStas;


	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SESSION_ID")
	private String sessionId;

	@Column(name="TOTAL_BOOKING_AMOUNT")
	private BigDecimal totalBookingAmount;

	@Column(name="TOTAL_BOOKING_QUANTITY")
	private BigDecimal totalBookingQuantity;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_MOBILE")
	private String userMobile;
	
	@Column(name="BOOKED_AS")
	private String bookedAS;
	
	
	@Column(name="PANCARD")
	private String panCard;
	
	
	@Column(name="COLLECTION_POINT")
	private String collectionPoint;
	
	
	
	
	@Column(name="DOLLAR_AVAILAIBILITY_STATUS")
	private String dollarAvailabilityStatus;
	
	@Column(name="pilgrim_image")
	private String pilgrimImage;
	
	@Column(name="pilgrim_image_id_proof")
	private String pilgrimImageIdProof;
	
	
	@Column(name="pilgrim_age")
	private long pilgrimAge;
	
	
	@Column(name="pilgrim_gender")
	private String pilgrimGender;
	
	
	@Column(name="CGST_AMOUNT")
	private BigDecimal cgst;
	
	@Column(name="SGST_AMOUNT")
	private BigDecimal sgst;
	
	@Column(name="ROUNDING_AMOUNT")
	private BigDecimal roundingAmount;
	
	
	

	public BigDecimal getRoundingAmount() {
		return roundingAmount;
	}

	public void setRoundingAmount(BigDecimal roundingAmount) {
		this.roundingAmount = roundingAmount;
	}

	public BigDecimal getCgst() {
		return cgst;
	}

	public void setCgst(BigDecimal cgst) {
		this.cgst = cgst;
	}

	public BigDecimal getSgst() {
		return sgst;
	}

	public void setSgst(BigDecimal sgst) {
		this.sgst = sgst;
	}

	public long getPilgrimAge() {
		return pilgrimAge;
	}

	public void setPilgrimAge(long pilgrimAge) {
		this.pilgrimAge = pilgrimAge;
	}

	public String getPilgrimGender() {
		return pilgrimGender;
	}

	public void setPilgrimGender(String pilgrimGender) {
		this.pilgrimGender = pilgrimGender;
	}

	public String getPilgrimImage() {
		return pilgrimImage;
	}

	public void setPilgrimImage(String pilgrimImage) {
		this.pilgrimImage = pilgrimImage;
	}

	public String getPilgrimImageIdProof() {
		return pilgrimImageIdProof;
	}

	public void setPilgrimImageIdProof(String pilgrimImageIdProof) {
		this.pilgrimImageIdProof = pilgrimImageIdProof;
	}

	public String getCollectionPoint() {
		return collectionPoint;
	}

	public void setCollectionPoint(String collectionPoint) {
		this.collectionPoint = collectionPoint;
	}


	public String getPanCard() {
		return panCard;
	}

	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}

	//bi-directional many-to-one association to DollarOtp
	@OneToMany(mappedBy="dollarBooking",cascade = CascadeType.ALL)
	private List<DollarOtp> dollarOtps;

	//bi-directional many-to-one association to DollarBookingDtl
	@OneToMany(mappedBy="dollarBooking", cascade = CascadeType.ALL)
	private List<DollarBookingDtl> dollarBookingDtls;

	//bi-directional many-to-one association to EmailNotifcation
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;

	//bi-directional 	@OneToOne association to PgTransaction
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;

	//bi-directional many-to-one association to SmsNotification
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	
	
	public List<DollarOtp> getDollarOtps() {
		return dollarOtps;
	}

	public void setDollarOtps(List<DollarOtp> dollarOtps) {
		this.dollarOtps = dollarOtps;
	}

	public DollarBooking() {
	}

	public String getpBookingId() {
		return pBookingId;
	}

	public void setpBookingId(String pBookingId) {
		this.pBookingId = pBookingId;
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

	public String getDarshanRedeemId() {
		return this.darshanRedeemId;
	}

	public void setDarshanRedeemId(String darshanRedeemId) {
		this.darshanRedeemId = darshanRedeemId;
	}

	public String getIdProofNumber() {
		return this.idProofNumber;
	}

	public void setIdProofNumber(String idProofNumber) {
		this.idProofNumber = idProofNumber;
	}

	public String getIdProofType() {
		return this.idProofType;
	}

	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
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
	
	




	public Date getCollectionDate() {
		return collectionDate;
	}

	public void setCollectionDate(Date collectionDate) {
		this.collectionDate = collectionDate;
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

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public List<DollarBookingDtl> getDollarBookingDtls() {
		return this.dollarBookingDtls;
	}

	public void setDollarBookingDtls(List<DollarBookingDtl> dollarBookingDtls) {
		this.dollarBookingDtls = dollarBookingDtls;
	}

	public DollarBookingDtl addDollarBookingDtl(DollarBookingDtl dollarBookingDtl) {
		getDollarBookingDtls().add(dollarBookingDtl);
		dollarBookingDtl.setDollarBooking(this);

		return dollarBookingDtl;
	}

	public DollarBookingDtl removeDollarBookingDtl(DollarBookingDtl dollarBookingDtl) {
		getDollarBookingDtls().remove(dollarBookingDtl);
		dollarBookingDtl.setDollarBooking(null);

		return dollarBookingDtl;
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

	public String getPiligrimname() {
		return piligrimname;
	}

	public void setPiligrimname(String piligrimname) {
		this.piligrimname = piligrimname;
	}

	public BigDecimal getOperatorUserId() {
		return operatorUserId;
	}

	public void setOperatorUserId(BigDecimal operatorUserId) {
		this.operatorUserId = operatorUserId;
	}

	public Date getCollectedDate() {
		return collectedDate;
	}

	public void setCollectedDate(Date collectedDate) {
		this.collectedDate = collectedDate;
	}

	public String getColletionStas() {
		return colletionStas;
	}

	public void setColletionStas(String colletionStas) {
		this.colletionStas = colletionStas;
	}

	public String getBookedAS() {
		return bookedAS;
	}

	public void setBookedAS(String bookedAS) {
		this.bookedAS = bookedAS;
	}

	public String getDollarAvailabilityStatus() {
		return dollarAvailabilityStatus;
	}

	public void setDollarAvailabilityStatus(String dollarAvailabilityStatus) {
		this.dollarAvailabilityStatus = dollarAvailabilityStatus;
	}
	
	

}