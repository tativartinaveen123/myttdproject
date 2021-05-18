package com.ttd.km.entity;

import java.io.Serializable;

import javax.persistence.*;


import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the KM_ALLOTMENT database table.
 * 
 */
@Entity
@Table(name="KM_ALLOTMENT")
@NamedQuery(name="KmAllotment.findAll", query="SELECT k FROM KmAllotment k")
public class KmAllotment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "KM_ALLOTMENT_ID_SEQ_GENERATOR", sequenceName = "KM_ALLOTMENT_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KM_ALLOTMENT_ID_SEQ_GENERATOR")
	@Column(name="KM_ALLOTMENT_ID")
	private long kmAllotmentId;

	@Column(name="ALLOTMENT_STATUS")
	private String allotmentStatus;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="ELECTRICITY_CGST_AMOUNT")
	private BigDecimal electricityCgstAmount;

	@Column(name="ELECTRICITY_END_READING")
	private BigDecimal electricityEndReading;

	@Column(name="ELECTRICITY_SGST_AMOUNT")
	private BigDecimal electricitySgstAmount;

	@Column(name="ELECTRICITY_START_READING")
	private BigDecimal electricityStartReading;

	@Column(name="ELECTRICITY_TOTAL_COST")
	private BigDecimal electricityTotalCost;

	@Column(name="ELECTRICITY_TOTAL_UNITS")
	private BigDecimal electricityTotalUnits;

	@Column(name="ELECTRICITY_UNIT_COST")
	private BigDecimal electricityUnitCost;

	@Column(name="EXTINCTION_HOURS")
	private BigDecimal extinctionHours;

	@Column(name="EXTINCTION_STATUS")
	private String extinctionStatus;

	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="BREAKUP_CGST_AMOUNT")
	private BigDecimal breakupCgstAmount;

	@Column(name="BREAKUP_CHARGES_AMOUNT")
	private BigDecimal breakupChargesAmount;

	@Column(name="BREAKUP_SGST_AMOUNT")
	private BigDecimal breakupSgstAmount;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SECURITY_DEPOSIT_AMOUNT")
	private BigDecimal securityDepositAmount;

	@Column(name="TOTAL_EXTINCTION_AMOUNT")
	private BigDecimal totalExtinctionAmount;

	@Column(name="TOTAL_REMAINING_AMOUNT")
	private BigDecimal totalRemainingAmount;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="VACATION_STATUS")
	private String vacationStatus;

	@Column(name="WATER_CGST_AMOUNT")
	private BigDecimal waterCgstAmount;

	@Column(name="WATER_END_READING")
	private BigDecimal waterEndReading;

	@Column(name="WATER_SGST_AMOUNT")
	private BigDecimal waterSgstAmount;

	@Column(name="WATER_START_READING")
	private BigDecimal waterStartReading;

	@Column(name="WATER_TOTAL_COST")
	private BigDecimal waterTotalCost;

	@Column(name="WATER_TOTAL_UNITS")
	private BigDecimal waterTotalUnits;

	@Column(name="WATER_UNIT_COST")
	private BigDecimal waterUnitCost;
	
	@Column(name="SERVICE_CGST_AMOUNT")
	private BigDecimal serviceCgstAmount;

	@Column(name="SERVICE_SGST_AMOUNT")
	private BigDecimal serviceSgstAmount;

	@Column(name="SERVICE_TOTAL_COST")
	private BigDecimal serviceTotalCost;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CHALLAN_DATE")
	private Date challanDate;

	@Column(name="CHALLAN_FLAG")
	private String challanFlag;
	
	@Column(name="KM_ID")
	private BigDecimal kmId;
	
	@Column(name="TOTAL_AMOUNT")
	private BigDecimal totalAmount;
	
	@Column(name="TOTAL_PREALLOTMENT_AMOUNT")
	private BigDecimal totalpreAllotmentAmount;
	
	
	@Column(name="PREALLOTMENT_HOURS")
	private BigDecimal preAllotmentHours;
	
	@Column(name="COMMENTS")
	private String comments;
	
	


	
	
	@Column(name="PREALLOT_SERVICE_CGST_AMOUNT")
	private BigDecimal preAllotserviceCgstAmount;



	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}



	@Column(name="PREALLOT_SERVICE_SGST_AMOUNT")
	private BigDecimal preAllotserviceSgstAmount;
	
	@Column(name="PREALLOTMENT_SERVICE_TOTAL")
	private BigDecimal preAllotserviceTotalCost;
	
	
	@Column(name="PREALLOT_WATER_CGST_AMOUNT")
	private BigDecimal preAllotwaterCgstAmount;

	
	@Column(name="PREALLOT_WATER_SGST_AMOUNT")
	private BigDecimal preAllotwaterSgstAmount;

	

	@Column(name="PREALLOT_WATER_TOTAL_COST")
	private BigDecimal preAllotwaterTotalCost;
	
	@Column(name="ACTUAL_WATERTOTAL_COST")
	private BigDecimal actualWaterTotal;
	
	
	@Column(name="ACTUAL_WATERCGST_TOTAL")
	private BigDecimal actualWaterCgstTotal;
	
	
	@Column(name="ACTUAL_WATERSGST_TOTAL")
	private BigDecimal actualWaterSgstTotal;
	
	
	
	

	

	public BigDecimal getActualWaterTotal() {
		return actualWaterTotal;
	}

	public void setActualWaterTotal(BigDecimal actualWaterTotal) {
		this.actualWaterTotal = actualWaterTotal;
	}

	public BigDecimal getActualWaterCgstTotal() {
		return actualWaterCgstTotal;
	}

	public void setActualWaterCgstTotal(BigDecimal actualWaterCgstTotal) {
		this.actualWaterCgstTotal = actualWaterCgstTotal;
	}

	public BigDecimal getActualWaterSgstTotal() {
		return actualWaterSgstTotal;
	}

	public void setActualWaterSgstTotal(BigDecimal actualWaterSgstTotal) {
		this.actualWaterSgstTotal = actualWaterSgstTotal;
	}

	public BigDecimal getPreAllotserviceCgstAmount() {
		return preAllotserviceCgstAmount;
	}

	public void setPreAllotserviceCgstAmount(BigDecimal preAllotserviceCgstAmount) {
		this.preAllotserviceCgstAmount = preAllotserviceCgstAmount;
	}

	public BigDecimal getPreAllotserviceSgstAmount() {
		return preAllotserviceSgstAmount;
	}

	public void setPreAllotserviceSgstAmount(BigDecimal preAllotserviceSgstAmount) {
		this.preAllotserviceSgstAmount = preAllotserviceSgstAmount;
	}

	public BigDecimal getPreAllotserviceTotalCost() {
		return preAllotserviceTotalCost;
	}

	public void setPreAllotserviceTotalCost(BigDecimal preAllotserviceTotalCost) {
		this.preAllotserviceTotalCost = preAllotserviceTotalCost;
	}

	public BigDecimal getPreAllotwaterCgstAmount() {
		return preAllotwaterCgstAmount;
	}

	public void setPreAllotwaterCgstAmount(BigDecimal preAllotwaterCgstAmount) {
		this.preAllotwaterCgstAmount = preAllotwaterCgstAmount;
	}

	public BigDecimal getPreAllotwaterSgstAmount() {
		return preAllotwaterSgstAmount;
	}

	public void setPreAllotwaterSgstAmount(BigDecimal preAllotwaterSgstAmount) {
		this.preAllotwaterSgstAmount = preAllotwaterSgstAmount;
	}

	public BigDecimal getPreAllotwaterTotalCost() {
		return preAllotwaterTotalCost;
	}

	public void setPreAllotwaterTotalCost(BigDecimal preAllotwaterTotalCost) {
		this.preAllotwaterTotalCost = preAllotwaterTotalCost;
	}


	public BigDecimal getPreAllotmentHours() {
		return preAllotmentHours;
	}

	public void setPreAllotmentHours(BigDecimal preAllotmentHours) {
		this.preAllotmentHours = preAllotmentHours;
	}

	//bi-directional many-to-one association to KmBooking
	@ManyToOne
	@JoinColumn(name="KM_BOOKING_ID")
	private KMBooking kmBooking;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ALLOTMENT_EMAIL_ID")
	private EmailNotification emailNotifcationAllotment;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "VACATION_EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcationVacation;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ALLOTMENT_SMS_NOTIFICATION_ID")
	private SmsNotification smsNotificationAllotment;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "VACATION_SMS_NOTIFICATION_ID")
	private SmsNotification smsNotificationVacation;

	

	public KmAllotment() {
	}

	public long getKmAllotmentId() {
		return this.kmAllotmentId;
	}

	public void setKmAllotmentId(long kmAllotmentId) {
		this.kmAllotmentId = kmAllotmentId;
	}

	public String getAllotmentStatus() {
		return this.allotmentStatus;
	}

	public void setAllotmentStatus(String allotmentStatus) {
		this.allotmentStatus = allotmentStatus;
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

	public BigDecimal getElectricityCgstAmount() {
		return this.electricityCgstAmount;
	}

	public void setElectricityCgstAmount(BigDecimal electricityCgstAmount) {
		this.electricityCgstAmount = electricityCgstAmount;
	}

	public BigDecimal getElectricityEndReading() {
		return this.electricityEndReading;
	}

	public void setElectricityEndReading(BigDecimal electricityEndReading) {
		this.electricityEndReading = electricityEndReading;
	}

	public BigDecimal getElectricitySgstAmount() {
		return this.electricitySgstAmount;
	}

	public void setElectricitySgstAmount(BigDecimal electricitySgstAmount) {
		this.electricitySgstAmount = electricitySgstAmount;
	}

	public BigDecimal getElectricityStartReading() {
		return this.electricityStartReading;
	}

	public void setElectricityStartReading(BigDecimal electricityStartReading) {
		this.electricityStartReading = electricityStartReading;
	}

	public BigDecimal getElectricityTotalCost() {
		return this.electricityTotalCost;
	}

	public void setElectricityTotalCost(BigDecimal electricityTotalCost) {
		this.electricityTotalCost = electricityTotalCost;
	}

	public BigDecimal getElectricityTotalUnits() {
		return this.electricityTotalUnits;
	}

	public void setElectricityTotalUnits(BigDecimal electricityTotalUnits) {
		this.electricityTotalUnits = electricityTotalUnits;
	}

	public BigDecimal getElectricityUnitCost() {
		return this.electricityUnitCost;
	}

	public void setElectricityUnitCost(BigDecimal electricityUnitCost) {
		this.electricityUnitCost = electricityUnitCost;
	}

	public BigDecimal getExtinctionHours() {
		return this.extinctionHours;
	}

	public void setExtinctionHours(BigDecimal extinctionHours) {
		this.extinctionHours = extinctionHours;
	}

	public String getExtinctionStatus() {
		return this.extinctionStatus;
	}

	public void setExtinctionStatus(String extinctionStatus) {
		this.extinctionStatus = extinctionStatus;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getSecurityDepositAmount() {
		return this.securityDepositAmount;
	}

	public void setSecurityDepositAmount(BigDecimal securityDepositAmount) {
		this.securityDepositAmount = securityDepositAmount;
	}

	public BigDecimal getTotalExtinctionAmount() {
		return this.totalExtinctionAmount;
	}

	public void setTotalExtinctionAmount(BigDecimal totalExtinctionAmount) {
		this.totalExtinctionAmount = totalExtinctionAmount;
	}

	public BigDecimal getTotalRemainingAmount() {
		return this.totalRemainingAmount;
	}

	public void setTotalRemainingAmount(BigDecimal totalRemainingAmount) {
		this.totalRemainingAmount = totalRemainingAmount;
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

	public String getVacationStatus() {
		return this.vacationStatus;
	}

	public void setVacationStatus(String vacationStatus) {
		this.vacationStatus = vacationStatus;
	}

	public BigDecimal getWaterCgstAmount() {
		return this.waterCgstAmount;
	}

	public void setWaterCgstAmount(BigDecimal waterCgstAmount) {
		this.waterCgstAmount = waterCgstAmount;
	}

	public BigDecimal getWaterEndReading() {
		return this.waterEndReading;
	}

	public void setWaterEndReading(BigDecimal waterEndReading) {
		this.waterEndReading = waterEndReading;
	}

	public BigDecimal getWaterSgstAmount() {
		return this.waterSgstAmount;
	}

	public void setWaterSgstAmount(BigDecimal waterSgstAmount) {
		this.waterSgstAmount = waterSgstAmount;
	}

	public BigDecimal getWaterStartReading() {
		return this.waterStartReading;
	}

	public void setWaterStartReading(BigDecimal waterStartReading) {
		this.waterStartReading = waterStartReading;
	}

	public BigDecimal getWaterTotalCost() {
		return this.waterTotalCost;
	}

	public void setWaterTotalCost(BigDecimal waterTotalCost) {
		this.waterTotalCost = waterTotalCost;
	}

	public BigDecimal getWaterTotalUnits() {
		return this.waterTotalUnits;
	}

	public void setWaterTotalUnits(BigDecimal waterTotalUnits) {
		this.waterTotalUnits = waterTotalUnits;
	}

	public BigDecimal getWaterUnitCost() {
		return this.waterUnitCost;
	}

	public void setWaterUnitCost(BigDecimal waterUnitCost) {
		this.waterUnitCost = waterUnitCost;
	}

	public KMBooking getKmBooking() {
		return this.kmBooking;
	}

	public void setKmBooking(KMBooking kmBooking) {
		this.kmBooking = kmBooking;
	}

	public EmailNotification getEmailNotifcationAllotment() {
		return emailNotifcationAllotment;
	}

	public void setEmailNotifcationAllotment(
			EmailNotification emailNotifcationAllotment) {
		this.emailNotifcationAllotment = emailNotifcationAllotment;
	}

	public EmailNotification getEmailNotifcationVacation() {
		return emailNotifcationVacation;
	}

	public void setEmailNotifcationVacation(
			EmailNotification emailNotifcationVacation) {
		this.emailNotifcationVacation = emailNotifcationVacation;
	}

	public SmsNotification getSmsNotificationAllotment() {
		return smsNotificationAllotment;
	}

	public void setSmsNotificationAllotment(SmsNotification smsNotificationAllotment) {
		this.smsNotificationAllotment = smsNotificationAllotment;
	}

	public SmsNotification getSmsNotificationVacation() {
		return smsNotificationVacation;
	}

	public void setSmsNotificationVacation(SmsNotification smsNotificationVacation) {
		this.smsNotificationVacation = smsNotificationVacation;
	}


	public BigDecimal getBreakupCgstAmount() {
		return breakupCgstAmount;
	}

	public void setBreakupCgstAmount(BigDecimal breakupCgstAmount) {
		this.breakupCgstAmount = breakupCgstAmount;
	}

	public BigDecimal getBreakupChargesAmount() {
		return breakupChargesAmount;
	}

	public void setBreakupChargesAmount(BigDecimal breakupChargesAmount) {
		this.breakupChargesAmount = breakupChargesAmount;
	}

	public BigDecimal getBreakupSgstAmount() {
		return breakupSgstAmount;
	}

	public void setBreakupSgstAmount(BigDecimal breakupSgstAmount) {
		this.breakupSgstAmount = breakupSgstAmount;
	}

	public BigDecimal getServiceCgstAmount() {
		return serviceCgstAmount;
	}

	public void setServiceCgstAmount(BigDecimal serviceCgstAmount) {
		this.serviceCgstAmount = serviceCgstAmount;
	}

	public BigDecimal getServiceSgstAmount() {
		return serviceSgstAmount;
	}

	public void setServiceSgstAmount(BigDecimal serviceSgstAmount) {
		this.serviceSgstAmount = serviceSgstAmount;
	}

	public BigDecimal getServiceTotalCost() {
		return serviceTotalCost;
	}

	public void setServiceTotalCost(BigDecimal serviceTotalCost) {
		this.serviceTotalCost = serviceTotalCost;
	}

	public Date getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(Date challanDate) {
		this.challanDate = challanDate;
	}

	public String getChallanFlag() {
		return challanFlag;
	}

	public void setChallanFlag(String challanFlag) {
		this.challanFlag = challanFlag;
	}

	public BigDecimal getKmId() {
		return kmId;
	}

	public void setKmId(BigDecimal kmId) {
		this.kmId = kmId;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public BigDecimal getTotalpreAllotmentAmount() {
		return totalpreAllotmentAmount;
	}

	public void setTotalpreAllotmentAmount(BigDecimal totalpreAllotmentAmount) {
		this.totalpreAllotmentAmount = totalpreAllotmentAmount;
	}

	

}