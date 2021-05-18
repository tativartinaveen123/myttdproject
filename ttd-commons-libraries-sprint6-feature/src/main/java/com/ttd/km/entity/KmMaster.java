package com.ttd.km.entity;

import java.io.Serializable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the KM_MASTER database table.
 * 
 */
@Entity
@Table(name="KM_MASTER")
@NamedQuery(name="KmMaster.findAll", query="SELECT k FROM KmMaster k")
public class KmMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="KM_ID")
	private long kmId;

	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;

	@Column(name="CHECK_IN_TIME")
	private String checkInTime;

	@Column(name="CHECK_OUT_TIME")
	private String checkOutTime;

	@Column(name="COUNTRY_ID")
	private BigDecimal countryId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="GST_RATE")
	private BigDecimal gstRate;

	@Column(name="KM_ADDR")
	private String kmAddr;

	@Column(name="KM_DESCRIPTION")
	private String kmDescription;

	@Column(name="KM_DISTRICT_ID")
	private BigDecimal kmDistrictId;

	@Column(name="KM_DISTRICT_NAME")
	private String kmDistrictName;

	@Column(name="KM_LOCATION_ID")
	private BigDecimal kmLocationId;

	@Column(name="KM_LOCATION_NAME")
	private String kmLocationName;

	@Column(name="KM_MAX_BOOKING_DAYS")
	private BigDecimal kmMaxBookingDays;

	@Column(name="KM_MAX_DAYS_MANAGER")
	private BigDecimal kmMaxDaysManager;

	@Column(name="KM_MIN_BOOKING_DAYS")
	private BigDecimal kmMinBookingDays;

	@Column(name="KM_NAME")
	private String kmName;

	@Column(name="KM_SECURITY_DEPOSIT")
	private BigDecimal kmSecurityDeposit;

	@Column(name="KM_TARIFF_PERDAY")
	private BigDecimal kmTariffPerday;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="STATE_ID")
	private BigDecimal stateId;

	@Column(name="STATE_NAME")
	private String stateName;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="WATER_CHARGE")
	private BigDecimal waterCharge;	

	@Column(name="WATER_CGST_RATE")
	private BigDecimal waterCgstRate;

	@Column(name="WATER_SGST_RATE")
	private BigDecimal waterSgstRate;
	
	@Column(name="ELECTRICITY_BREAK_CGST_RATE")
	private BigDecimal electricityBreakCgstRate;

	@Column(name="ELECTRICITY_BREAK_SGST_RATE")
	private BigDecimal electricityBreakSgstRate;

	@Column(name="ELECTRICITY_CGST_RATE")
	private BigDecimal electricityCgstRate;

	@Column(name="ELECTRICITY_SGST_RATE")
	private BigDecimal electricitySgstRate;

	public KmMaster() {
	}

	public long getKmId() {
		return this.kmId;
	}

	public void setKmId(long kmId) {
		this.kmId = kmId;
	}

	public BigDecimal getCgstRate() {
		return this.cgstRate;
	}

	public void setCgstRate(BigDecimal cgstRate) {
		this.cgstRate = cgstRate;
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

	public BigDecimal getCountryId() {
		return this.countryId;
	}

	public void setCountryId(BigDecimal countryId) {
		this.countryId = countryId;
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

	public BigDecimal getGstRate() {
		return this.gstRate;
	}

	public void setGstRate(BigDecimal gstRate) {
		this.gstRate = gstRate;
	}

	public String getKmAddr() {
		return this.kmAddr;
	}

	public void setKmAddr(String kmAddr) {
		this.kmAddr = kmAddr;
	}

	public String getKmDescription() {
		return this.kmDescription;
	}

	public void setKmDescription(String kmDescription) {
		this.kmDescription = kmDescription;
	}

	public BigDecimal getKmDistrictId() {
		return this.kmDistrictId;
	}

	public void setKmDistrictId(BigDecimal kmDistrictId) {
		this.kmDistrictId = kmDistrictId;
	}

	public String getKmDistrictName() {
		return this.kmDistrictName;
	}

	public void setKmDistrictName(String kmDistrictName) {
		this.kmDistrictName = kmDistrictName;
	}

	public BigDecimal getKmLocationId() {
		return this.kmLocationId;
	}

	public void setKmLocationId(BigDecimal kmLocationId) {
		this.kmLocationId = kmLocationId;
	}

	public String getKmLocationName() {
		return this.kmLocationName;
	}

	public void setKmLocationName(String kmLocationName) {
		this.kmLocationName = kmLocationName;
	}

	public BigDecimal getKmMaxBookingDays() {
		return this.kmMaxBookingDays;
	}

	public void setKmMaxBookingDays(BigDecimal kmMaxBookingDays) {
		this.kmMaxBookingDays = kmMaxBookingDays;
	}

	public BigDecimal getKmMaxDaysManager() {
		return this.kmMaxDaysManager;
	}

	public void setKmMaxDaysManager(BigDecimal kmMaxDaysManager) {
		this.kmMaxDaysManager = kmMaxDaysManager;
	}

	public BigDecimal getKmMinBookingDays() {
		return this.kmMinBookingDays;
	}

	public void setKmMinBookingDays(BigDecimal kmMinBookingDays) {
		this.kmMinBookingDays = kmMinBookingDays;
	}

	public String getKmName() {
		return this.kmName;
	}

	public void setKmName(String kmName) {
		this.kmName = kmName;
	}

	public BigDecimal getKmSecurityDeposit() {
		return this.kmSecurityDeposit;
	}

	public void setKmSecurityDeposit(BigDecimal kmSecurityDeposit) {
		this.kmSecurityDeposit = kmSecurityDeposit;
	}

	public BigDecimal getKmTariffPerday() {
		return this.kmTariffPerday;
	}

	public void setKmTariffPerday(BigDecimal kmTariffPerday) {
		this.kmTariffPerday = kmTariffPerday;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getStateId() {
		return this.stateId;
	}

	public void setStateId(BigDecimal stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return this.stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
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

	public BigDecimal getWaterCharge() {
		return this.waterCharge;
	}

	public void setWaterCharge(BigDecimal waterCharge) {
		this.waterCharge = waterCharge;
	}

	public BigDecimal getWaterCgstRate() {
		return waterCgstRate;
	}

	public void setWaterCgstRate(BigDecimal waterCgstRate) {
		this.waterCgstRate = waterCgstRate;
	}

	public BigDecimal getWaterSgstRate() {
		return waterSgstRate;
	}

	public void setWaterSgstRate(BigDecimal waterSgstRate) {
		this.waterSgstRate = waterSgstRate;
	}

	public BigDecimal getElectricityBreakCgstRate() {
		return electricityBreakCgstRate;
	}

	public void setElectricityBreakCgstRate(BigDecimal electricityBreakCgstRate) {
		this.electricityBreakCgstRate = electricityBreakCgstRate;
	}

	public BigDecimal getElectricityBreakSgstRate() {
		return electricityBreakSgstRate;
	}

	public void setElectricityBreakSgstRate(BigDecimal electricityBreakSgstRate) {
		this.electricityBreakSgstRate = electricityBreakSgstRate;
	}

	public BigDecimal getElectricityCgstRate() {
		return electricityCgstRate;
	}

	public void setElectricityCgstRate(BigDecimal electricityCgstRate) {
		this.electricityCgstRate = electricityCgstRate;
	}

	public BigDecimal getElectricitySgstRate() {
		return electricitySgstRate;
	}

	public void setElectricitySgstRate(BigDecimal electricitySgstRate) {
		this.electricitySgstRate = electricitySgstRate;
	}
	

}