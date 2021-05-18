package com.ttd.lrs.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the XXTTD_AR_LRS_EPAY_BILL_HDR_TBL database table.
 * 
 */
@Entity
@Table(name="XXTTD_AR_LRS_EPAY_BILL_HDR_TBL")
@NamedQuery(name="XxttdArLrsEpayBillHdrTbl.findAll", query="SELECT x FROM XxttdArLrsEpayBillHdrTbl x")
public class XxttdArLrsEpayBillHdrTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BILL_ID")
	private long billId;

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

	@Temporal(TemporalType.DATE)
	@Column(name="BILL_DATE")
	private Date billDate;

	@Temporal(TemporalType.DATE)
	@Column(name="BILL_FROM_DATE")
	private Date billFromDate;

	@Temporal(TemporalType.DATE)
	@Column(name="BILL_TILL_DATE")
	private Date billTillDate;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Column(name="LANDLORD_ADDRESS")
	private String landlordAddress;

	@Column(name="LANDLORD_GSTN#")
	private String landlordGstn_;

	@Column(name="LANDLORD_NAME")
	private String landlordName;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LAST_UPDATE_LOGIN")
	private BigDecimal lastUpdateLogin;

	@Column(name="LAST_UPDATED_BY")
	private BigDecimal lastUpdatedBy;

	@Column(name="PARTY_ADDRESS")
	private String partyAddress;

	@Column(name="PARTY_GSTN#")
	private String partyGstn_;

	@Column(name="PARTY_ID")
	private BigDecimal partyId;

	@Column(name="PARTY_NAME")
	private String partyName;
	
    @Column(name="MOBILE_NUMBER")
    private String mobileNumber;
	
    @Column(name="EMAIL_ID")
    private String email;

	@Column(name="PAYMENT_TERMS")
	private String paymentTerms;

	@Column(name="PROPERTY_ADDRESS")
	private String propertyAddress;

	@Column(name="PROPERTY_ID")
	private BigDecimal propertyId;

	@Column(name="PROPERTY_NAME")
	private String propertyName;

	private String remarks;

	@Column(name="TENANT_NUMBER")
	private BigDecimal tenantNumber;

	@Column(name="TOTAL_ADVANCE_PAID")
	private BigDecimal totalAdvancePaid;

	@Column(name="TOTAL_BILL_AMOUNT")
	private BigDecimal totalBillAmount;

	@Column(name="TOTAL_DEMAND_PAID")
	private BigDecimal totalDemandPaid;

	@Column(name="TOTAL_GST_ON_DEMAND")
	private BigDecimal totalGstOnDemand;

	@Column(name="TOTAL_GST_ON_PENALTY")
	private BigDecimal totalPenaltyOnDemand;

	@Column(name="TOTAL_PENALTY_PAID")
	private BigDecimal totalPenaltyPaid;

	@Column(name="TXN_NUMBER")
	private String txnNumber;
	
	@Column(name="TOTAL_AMOUNT_2B_PAID")
	private BigDecimal totalAmountToBePaid;
	
	@OneToMany(mappedBy = "xxttdArLrsEpayBillHdrTbl", cascade = CascadeType.ALL)
	private List<XxttdArLrsEpayBillDtlTbl> xxttdArLrsEpayBillDtlTbl;
	

	public XxttdArLrsEpayBillHdrTbl() {
	}

	public long getBillId() {
		return this.billId;
	}

	public void setBillId(long billId) {
		this.billId = billId;
	}

	public String getAttribute1() {
		return this.attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	
	public BigDecimal getTotalAmountToBePaid() {
		return totalAmountToBePaid;
	}

	public void setTotalAmountToBePaid(BigDecimal totalAmountToBePaid) {
		this.totalAmountToBePaid = totalAmountToBePaid;
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

	public Date getBillDate() {
		return this.billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public Date getBillFromDate() {
		return this.billFromDate;
	}

	public void setBillFromDate(Date billFromDate) {
		this.billFromDate = billFromDate;
	}

	public Date getBillTillDate() {
		return this.billTillDate;
	}

	public void setBillTillDate(Date billTillDate) {
		this.billTillDate = billTillDate;
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

	public String getLandlordAddress() {
		return this.landlordAddress;
	}

	public void setLandlordAddress(String landlordAddress) {
		this.landlordAddress = landlordAddress;
	}

	public String getLandlordGstn_() {
		return this.landlordGstn_;
	}

	public void setLandlordGstn_(String landlordGstn_) {
		this.landlordGstn_ = landlordGstn_;
	}

	public String getLandlordName() {
		return this.landlordName;
	}

	public void setLandlordName(String landlordName) {
		this.landlordName = landlordName;
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

	public String getPartyAddress() {
		return this.partyAddress;
	}

	public void setPartyAddress(String partyAddress) {
		this.partyAddress = partyAddress;
	}

	public String getPartyGstn_() {
		return this.partyGstn_;
	}

	public void setPartyGstn_(String partyGstn_) {
		this.partyGstn_ = partyGstn_;
	}

	public BigDecimal getPartyId() {
		return this.partyId;
	}

	public void setPartyId(BigDecimal partyId) {
		this.partyId = partyId;
	}

	public String getPartyName() {
		return this.partyName;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public String getPaymentTerms() {
		return this.paymentTerms;
	}

	public void setPaymentTerms(String paymentTerms) {
		this.paymentTerms = paymentTerms;
	}

	public String getPropertyAddress() {
		return this.propertyAddress;
	}

	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}

	public BigDecimal getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(BigDecimal propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getTenantNumber() {
		return this.tenantNumber;
	}

	public void setTenantNumber(BigDecimal tenantNumber) {
		this.tenantNumber = tenantNumber;
	}

	public BigDecimal getTotalAdvancePaid() {
		return this.totalAdvancePaid;
	}

	public void setTotalAdvancePaid(BigDecimal totalAdvancePaid) {
		this.totalAdvancePaid = totalAdvancePaid;
	}

	public BigDecimal getTotalBillAmount() {
		return this.totalBillAmount;
	}

	public void setTotalBillAmount(BigDecimal totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public BigDecimal getTotalDemandPaid() {
		return this.totalDemandPaid;
	}

	public void setTotalDemandPaid(BigDecimal totalDemandPaid) {
		this.totalDemandPaid = totalDemandPaid;
	}

	public BigDecimal getTotalGstOnDemand() {
		return this.totalGstOnDemand;
	}

	public void setTotalGstOnDemand(BigDecimal totalGstOnDemand) {
		this.totalGstOnDemand = totalGstOnDemand;
	}

	public BigDecimal getTotalPenaltyOnDemand() {
		return this.totalPenaltyOnDemand;
	}

	public void setTotalPenaltyOnDemand(BigDecimal totalPenaltyOnDemand) {
		this.totalPenaltyOnDemand = totalPenaltyOnDemand;
	}

	public BigDecimal getTotalPenaltyPaid() {
		return this.totalPenaltyPaid;
	}

	public void setTotalPenaltyPaid(BigDecimal totalPenaltyPaid) {
		this.totalPenaltyPaid = totalPenaltyPaid;
	}

	public String getTxnNumber() {
		return this.txnNumber;
	}

	public void setTxnNumber(String txnNumber) {
		this.txnNumber = txnNumber;
	}

	public List<XxttdArLrsEpayBillDtlTbl> getXxttdArLrsEpayBillDtlTbl() {
		return xxttdArLrsEpayBillDtlTbl;
	}

	public void setXxttdArLrsEpayBillDtlTbl(List<XxttdArLrsEpayBillDtlTbl> xxttdArLrsEpayBillDtlTbl) {
		this.xxttdArLrsEpayBillDtlTbl = xxttdArLrsEpayBillDtlTbl;
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
	

}