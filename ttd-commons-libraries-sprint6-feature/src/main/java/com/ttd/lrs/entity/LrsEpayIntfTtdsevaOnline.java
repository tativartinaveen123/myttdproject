package com.ttd.lrs.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LRS_EPAY_INTF_TTDSEVA_ONLINE database table.
 * 
 */
@Entity
@Table(name="XXTTD_AR_LRS_EPAY_INTF_HDR_TBL")
@NamedQuery(name="LrsEpayIntfTtdsevaOnline.findAll", query="SELECT l FROM LrsEpayIntfTtdsevaOnline l")
public class LrsEpayIntfTtdsevaOnline implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attribute1;

	private String attribute10;

	@Temporal(TemporalType.DATE)
	private Date attribute11;

	@Temporal(TemporalType.DATE)
	private Date attribute12;

	@Temporal(TemporalType.DATE)
	private Date attribute13;

	@Temporal(TemporalType.DATE)
	private Date attribute14;

	@Temporal(TemporalType.DATE)
	private Date attribute15;

	private BigDecimal attribute16;

	private BigDecimal attribute17;

	private BigDecimal attribute18;

	private BigDecimal attribute19;

	private String attribute2;

	private BigDecimal attribute20;

	private String attribute3;

	private String attribute4;

	private String attribute5;

	private String attribute6;

	private String attribute7;

	private String attribute8;

	private String attribute9;

	@Column(name="CGST_ON_PENALTY")
	private BigDecimal cgstOnPenalty;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DEMAND_DATE")
	private Date demandDate;

	@Id
	@Column(name="DEMAND_ID")
	private BigDecimal demandId;

	@Column(name="DEMAND_NUMBER")
	private String demandNumber;

	@Column(name="DEPARTMENT_ID")
	private BigDecimal departmentId;
	
	@Column(name="DEPARTMENT_NAME")
	private String departmentName;

	@Column(name="FAN_CHARGES")
	private BigDecimal fanCharges;

	@Column(name="GST_ON_PENALTY")
	private BigDecimal gstOnPenalty;

	@Column(name="HRR_CHARGES")
	private BigDecimal hrrCharges;

	@Column(name="IGST_ON_PENALTY")
	private BigDecimal igstOnPenalty;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LAST_UPDATE_LOGIN")
	private BigDecimal lastUpdateLogin;

	@Column(name="LAST_UPDATED_BY")
	private BigDecimal lastUpdatedBy;

	@Column(name="LICENSE_FEE")
	private BigDecimal licenseFee;

	@Column(name="MONTHLY_CGST_ON_DEMAND")
	private BigDecimal monthlyCgstOnDemand;

	@Column(name="MONTHLY_DEMAND_AMOUNT")
	private BigDecimal monthlyDemandAmount;

	@Column(name="MONTHLY_GST_ON_DEMAND")
	private BigDecimal monthlyGstOnDemand;

	@Column(name="MONTHLY_IGST_ON_DEMAND")
	private BigDecimal monthlyIgstOnDemand;

	@Column(name="MONTHLY_SGST_ON_DEMAND")
	private BigDecimal monthlySgstOnDemand;

	@Column(name="PARTY_ID")
	private BigDecimal partyId;
	
	@Column(name="TENANT_NUMBER")
	private BigDecimal tenantNumber;
	
	@Column(name="PARTY_NAME")
	private String partyName;

	@Column(name="PENALTY_ON_DEMAND")
	private BigDecimal penaltyOnDemand;

	
	@Column(name="PROPERTY_ID")
	private BigDecimal propertyId;
	
	@Column(name="PROPERTY_LOCATION")
	private String propertyLocation;
	
	@Column(name="PROPERTY_TYPE")
	private String propertyType;
	
    @Column(name="PROPERTY_EXTENT")
    private String propertyExtent;
    
    @Column(name="MOBILE_NUMBER")
    private String mobileNumber;
	
    @Column(name="EMAIL_ID")
    private String email;
    
    @Column(name="PROPERTY_NAME")
	private String propertyName;

	private String remarks;

	@Column(name="SGST_ON_PENALTY")
	private BigDecimal sgstOnPenalty;

	@Column(name="TOTAL_DEMAND_AMOUNT")
	private BigDecimal totalDemandAmount;

	@Column(name="TXN_MONTH")
	private BigDecimal txnMonth;

	@Column(name="TXN_YEAR")
	private BigDecimal txnYear;
	
	@Column(name="TOTAL_DEMAND_2B_PAID")
	private BigDecimal totalDemandToBePaid;
	
	@Column(name="AMOUNT_COLLECTED")
	private String amountCollected;
	
	@Column(name="TOTAL_AMOUNT_2B_PAID")
	private BigDecimal totalAmountToBePaid;
	
	
    
	public BigDecimal getTotalAmountToBePaid() {
		return totalAmountToBePaid;
	}

	public void setTotalAmountToBePaid(BigDecimal totalAmountToBePaid) {
		this.totalAmountToBePaid = totalAmountToBePaid;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getPropertyExtent() {
		return propertyExtent;
	}

	public void setPropertyExtent(String propertyExtent) {
		this.propertyExtent = propertyExtent;
	}

	public LrsEpayIntfTtdsevaOnline() {
	}

	
	public BigDecimal getTxnMonth() {
		return txnMonth;
	}

	public void setTxnMonth(BigDecimal txnMonth) {
		this.txnMonth = txnMonth;
	}

	public BigDecimal getTxnYear() {
		return txnYear;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute10() {
		return this.attribute10;
	}

	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
	}

	public Date getAttribute11() {
		return this.attribute11;
	}

	public void setAttribute11(Date attribute11) {
		this.attribute11 = attribute11;
	}

	public Date getAttribute12() {
		return this.attribute12;
	}

	public void setAttribute12(Date attribute12) {
		this.attribute12 = attribute12;
	}

	public Date getAttribute13() {
		return this.attribute13;
	}

	public void setAttribute13(Date attribute13) {
		this.attribute13 = attribute13;
	}

	public Date getAttribute14() {
		return this.attribute14;
	}

	public void setAttribute14(Date attribute14) {
		this.attribute14 = attribute14;
	}

	public Date getAttribute15() {
		return this.attribute15;
	}

	public void setAttribute15(Date attribute15) {
		this.attribute15 = attribute15;
	}

	public BigDecimal getAttribute16() {
		return this.attribute16;
	}

	public void setAttribute16(BigDecimal attribute16) {
		this.attribute16 = attribute16;
	}

	public BigDecimal getAttribute17() {
		return this.attribute17;
	}

	public void setAttribute17(BigDecimal attribute17) {
		this.attribute17 = attribute17;
	}

	public BigDecimal getAttribute18() {
		return this.attribute18;
	}

	public void setAttribute18(BigDecimal attribute18) {
		this.attribute18 = attribute18;
	}

	public BigDecimal getAttribute19() {
		return this.attribute19;
	}

	public void setAttribute19(BigDecimal attribute19) {
		this.attribute19 = attribute19;
	}

	public String getAttribute2() {
		return this.attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public BigDecimal getAttribute20() {
		return this.attribute20;
	}

	public void setAttribute20(BigDecimal attribute20) {
		this.attribute20 = attribute20;
	}

	public String getAttribute3() {
		return this.attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return this.attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return this.attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return this.attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getAttribute7() {
		return this.attribute7;
	}

	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}

	public String getAttribute8() {
		return this.attribute8;
	}

	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
	}

	public String getAttribute9() {
		return this.attribute9;
	}

	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
	}

	public BigDecimal getCgstOnPenalty() {
		return this.cgstOnPenalty;
	}

	public void setCgstOnPenalty(BigDecimal cgstOnPenalty) {
		this.cgstOnPenalty = cgstOnPenalty;
	}

	public BigDecimal getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getDemandDate() {
		return this.demandDate;
	}

	public void setDemandDate(Date demandDate) {
		this.demandDate = demandDate;
	}

	public BigDecimal getDemandId() {
		return this.demandId;
	}

	public void setDemandId(BigDecimal demandId) {
		this.demandId = demandId;
	}

	public String getDemandNumber() {
		return this.demandNumber;
	}

	public void setDemandNumber(String demandNumber) {
		this.demandNumber = demandNumber;
	}

	public BigDecimal getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(BigDecimal departmentId) {
		this.departmentId = departmentId;
	}

	public BigDecimal getFanCharges() {
		return this.fanCharges;
	}

	public void setFanCharges(BigDecimal fanCharges) {
		this.fanCharges = fanCharges;
	}

	public BigDecimal getGstOnPenalty() {
		return this.gstOnPenalty;
	}

	public void setGstOnPenalty(BigDecimal gstOnPenalty) {
		this.gstOnPenalty = gstOnPenalty;
	}

	public BigDecimal getHrrCharges() {
		return this.hrrCharges;
	}

	public void setHrrCharges(BigDecimal hrrCharges) {
		this.hrrCharges = hrrCharges;
	}

	public BigDecimal getIgstOnPenalty() {
		return this.igstOnPenalty;
	}

	public void setIgstOnPenalty(BigDecimal igstOnPenalty) {
		this.igstOnPenalty = igstOnPenalty;
	}

	public Date getLastUpdateDate() {
		return this.lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public BigDecimal getLastUpdateLogin() {
		return this.lastUpdateLogin;
	}

	public void setLastUpdateLogin(BigDecimal lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}

	public BigDecimal getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public BigDecimal getLicenseFee() {
		return this.licenseFee;
	}

	public void setLicenseFee(BigDecimal licenseFee) {
		this.licenseFee = licenseFee;
	}

	public BigDecimal getMonthlyCgstOnDemand() {
		return this.monthlyCgstOnDemand;
	}

	public void setMonthlyCgstOnDemand(BigDecimal monthlyCgstOnDemand) {
		this.monthlyCgstOnDemand = monthlyCgstOnDemand;
	}

	public BigDecimal getMonthlyDemandAmount() {
		return this.monthlyDemandAmount;
	}

	public void setMonthlyDemandAmount(BigDecimal monthlyDemandAmount) {
		this.monthlyDemandAmount = monthlyDemandAmount;
	}

	public BigDecimal getMonthlyGstOnDemand() {
		return this.monthlyGstOnDemand;
	}

	public void setMonthlyGstOnDemand(BigDecimal monthlyGstOnDemand) {
		this.monthlyGstOnDemand = monthlyGstOnDemand;
	}

	public BigDecimal getMonthlyIgstOnDemand() {
		return this.monthlyIgstOnDemand;
	}

	public void setMonthlyIgstOnDemand(BigDecimal monthlyIgstOnDemand) {
		this.monthlyIgstOnDemand = monthlyIgstOnDemand;
	}

	public BigDecimal getMonthlySgstOnDemand() {
		return this.monthlySgstOnDemand;
	}

	public void setMonthlySgstOnDemand(BigDecimal monthlySgstOnDemand) {
		this.monthlySgstOnDemand = monthlySgstOnDemand;
	}

	public BigDecimal getPartyId() {
		return this.partyId;
	}

	public void setPartyId(BigDecimal partyId) {
		this.partyId = partyId;
	}

	public BigDecimal getPenaltyOnDemand() {
		return this.penaltyOnDemand;
	}

	public void setPenaltyOnDemand(BigDecimal penaltyOnDemand) {
		this.penaltyOnDemand = penaltyOnDemand;
	}

	public BigDecimal getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(BigDecimal propertyId) {
		this.propertyId = propertyId;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getSgstOnPenalty() {
		return this.sgstOnPenalty;
	}

	public void setSgstOnPenalty(BigDecimal sgstOnPenalty) {
		this.sgstOnPenalty = sgstOnPenalty;
	}

	public BigDecimal getTotalDemandAmount() {
		return this.totalDemandAmount;
	}

	public void setTotalDemandAmount(BigDecimal totalDemandAmount) {
		this.totalDemandAmount = totalDemandAmount;
	}

	public void setTxnYear(BigDecimal txnYear) {
		this.txnYear = txnYear;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public String getPartyName() {
		return partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigDecimal getTotalDemandToBePaid() {
		return totalDemandToBePaid;
	}

	public void setTotalDemandToBePaid(BigDecimal totalDemandToBePaid) {
		this.totalDemandToBePaid = totalDemandToBePaid;
	}

	public String getAmountCollected() {
		return amountCollected;
	}

	public void setAmountCollected(String amountCollected) {
		this.amountCollected = amountCollected;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public BigDecimal getTenantNumber() {
		return tenantNumber;
	}

	public void setTenantNumber(BigDecimal tenantNumber) {
		this.tenantNumber = tenantNumber;
	}
	
}