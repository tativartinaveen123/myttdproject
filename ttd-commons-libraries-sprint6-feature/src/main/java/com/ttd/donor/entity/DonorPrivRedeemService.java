package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.edonation.entity.DonationOffering;


/**
 * The persistent class for the DONOR_PRIV_REDEEM_SERVICE database table.
 * 
 */
@Entity
@Table(name="DONOR_PRIV_REDEEM_SERVICE")
@NamedQuery(name="DonorPrivRedeemService.findAll", query="SELECT d FROM DonorPrivRedeemService d")

public class DonorPrivRedeemService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DONOR_PRIV_REDEEM_SERVICE_SEQ_GENERATER", sequenceName = "DONOR_PRIV_REDEEM_SERVICE_SEQ", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DONOR_PRIV_REDEEM_SERVICE_SEQ_GENERATER")

	@Column(name="DONOR_REDEEM_SERVICE_ID")
	private long donorRedeemServiceId;

	@Column(name="AVAILED_DATE")
	private String availedDate;

	private String comments;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="PLANNED_ARRIVE_DATE")
	private String plannedArriveDate;

	@Column(name="PLANNED_ARRIVE_TIME")
	private String plannedArriveTime;

	private BigDecimal quantity;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SERVICE_REFFERENCE")
	private String serviceRefference;

	@Column(name="SERVICE_SUB_TYPE_ID")
	private BigDecimal serviceSubTypeId;

	@Column(name="SERVICE_TYPE_ID")
	private BigDecimal serviceTypeId;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_ID")
	private long userId;
	
	@Column(name = "PRIV_REDEEM_ID")
	private String privRedeemId;
	
	@Column(name="LADDU_QUANTITY")
	private BigDecimal ladduQuantity;
	
	@Column(name="VEDA_ASHIRVACHANAM")
	private BigDecimal ashirvachanamCount;
	
	@Column(name="NO_OF_DAYS")
	private BigDecimal noOfDays;
	
	@Column(name = "REDEEMED_FROM")
	private String redeedmedFrom;
	
	//bi-directional many-to-one association to DonationOffering
	@ManyToOne
	@JoinColumn(name="OFFERING_ID")
	private DonationOffering donationOffering;

	//bi-directional many-to-one association to DonorPrivRedeem
	@ManyToOne
	@JoinColumn(name="DONOR_REDEEM_ID")
	private DonorPrivRedeem donorPrivRedeem;
	
	@Column(name="AMOUNT")
	private BigDecimal amount;
	
	@Column(name="ADDITIONAL_LADDUS")
	private BigDecimal additionalLaddus;
	
	@Column(name="SLOT_ID")
	private BigDecimal slotId;
	
	@Column(name = "SLOT_NAME")
	private String slotName;
	
	@Column(name = "BOOKING_STATUS")
	private String bookingStatus;
	
	@Column(name="DARSHAN_AMOUNT")
	private BigDecimal darshanAmount;
	
	@Column(name="ACCOM_AMOUNT")
	private BigDecimal accomAmount;
	
	@Column(name="CAUTION_DEPOSIT")
	private BigDecimal cautionDeposit;
	
	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;
	
	@Column(name="SGST_RATE")
	private BigDecimal sgstRate;
	
	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmount;
	
	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmount;
	
	@Column(name="INVOICE_NO")
	private String invoiceNo;
	
	@Column(name="REQ_CHANNEL")
	private String reqChnnel;
	
	@Column(name="DOLLAR_REDEEM_ID")
	private String dollarRedeemId;
	
	@Column(name ="DOLLAR_AMOUNT")
	private BigDecimal dollarAmount;
	
	
	
	

	public String getDollarRedeemId() {
		return dollarRedeemId;
	}

	public void setDollarRedeemId(String dollarRedeemId) {
		this.dollarRedeemId = dollarRedeemId;
	}

	public BigDecimal getDollarAmount() {
		return dollarAmount;
	}

	public void setDollarAmount(BigDecimal dollarAmount) {
		this.dollarAmount = dollarAmount;
	}

	public String getReqChnnel() {
		return reqChnnel;
	}

	public void setReqChnnel(String reqChnnel) {
		this.reqChnnel = reqChnnel;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public DonorPrivRedeemService() {
	}

	public long getDonorRedeemServiceId() {
		return this.donorRedeemServiceId;
	}

	public void setDonorRedeemServiceId(long donorRedeemServiceId) {
		this.donorRedeemServiceId = donorRedeemServiceId;
	}

	public String getAvailedDate() {
		return this.availedDate;
	}

	public void setAvailedDate(String availedDate) {
		this.availedDate = availedDate;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
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

	public String getPlannedArriveDate() {
		return this.plannedArriveDate;
	}

	public void setPlannedArriveDate(String plannedArriveDate) {
		this.plannedArriveDate = plannedArriveDate;
	}

	public String getPlannedArriveTime() {
		return this.plannedArriveTime;
	}

	public void setPlannedArriveTime(String plannedArriveTime) {
		this.plannedArriveTime = plannedArriveTime;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getServiceRefference() {
		return this.serviceRefference;
	}

	public void setServiceRefference(String serviceRefference) {
		this.serviceRefference = serviceRefference;
	}

	public BigDecimal getServiceSubTypeId() {
		return this.serviceSubTypeId;
	}

	public void setServiceSubTypeId(BigDecimal serviceSubTypeId) {
		this.serviceSubTypeId = serviceSubTypeId;
	}

	public BigDecimal getServiceTypeId() {
		return this.serviceTypeId;
	}

	public void setServiceTypeId(BigDecimal serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
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

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public DonationOffering getDonationOffering() {
		return this.donationOffering;
	}

	public void setDonationOffering(DonationOffering donationOffering) {
		this.donationOffering = donationOffering;
	}

	public DonorPrivRedeem getDonorPrivRedeem() {
		return this.donorPrivRedeem;
	}

	public void setDonorPrivRedeem(DonorPrivRedeem donorPrivRedeem) {
		this.donorPrivRedeem = donorPrivRedeem;
	}

	public String getPrivRedeemId() {
		return privRedeemId;
	}

	public void setPrivRedeemId(String privRedeemId) {
		this.privRedeemId = privRedeemId;
	}

	public BigDecimal getLadduQuantity() {
		return ladduQuantity;
	}

	public void setLadduQuantity(BigDecimal ladduQuantity) {
		this.ladduQuantity = ladduQuantity;
	}

	public BigDecimal getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(BigDecimal noOfDays) {
		this.noOfDays = noOfDays;
	}

	public BigDecimal getAshirvachanamCount() {
		return ashirvachanamCount;
	}

	public void setAshirvachanamCount(BigDecimal ashirvachanamCount) {
		this.ashirvachanamCount = ashirvachanamCount;
	}	
	
	public String getRedeedmedFrom() {
		return redeedmedFrom;
	}

	public void setRedeedmedFrom(String redeedmedFrom) {
		this.redeedmedFrom = redeedmedFrom;
	}

	public BigDecimal getAdditionalLaddus() {
		return additionalLaddus;
	}

	public void setAdditionalLaddus(BigDecimal additionalLaddus) {
		this.additionalLaddus = additionalLaddus;
	}

	public BigDecimal getSlotId() {
		return slotId;
	}

	public void setSlotId(BigDecimal slotId) {
		this.slotId = slotId;
	}

	public String getSlotName() {
		return slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public BigDecimal getDarshanAmount() {
		return darshanAmount;
	}

	public void setDarshanAmount(BigDecimal darshanAmount) {
		this.darshanAmount = darshanAmount;
	}
	public BigDecimal getAccomAmount() {
		return accomAmount;
	}

	public void setAccomAmount(BigDecimal accomAmount) {
		this.accomAmount = accomAmount;
	}

	public BigDecimal getCautionDeposit() {
		return cautionDeposit;
	}

	public void setCautionDeposit(BigDecimal cautionDeposit) {
		this.cautionDeposit = cautionDeposit;
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

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}	
	
	
	

}