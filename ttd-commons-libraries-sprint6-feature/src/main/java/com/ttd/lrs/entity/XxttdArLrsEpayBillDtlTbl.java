package com.ttd.lrs.entity;

import java.io.Serializable;
import javax.persistence.*;


import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the XXTTD_AR_LRS_EPAY_BILL_DTL_TBL database table.
 * 
 */
@Entity
@Table(name="XXTTD_AR_LRS_EPAY_BILL_DTL_TBL")
@NamedQuery(name="XxttdArLrsEpayBillDtlTbl.findAll", query="SELECT x FROM XxttdArLrsEpayBillDtlTbl x")
public class XxttdArLrsEpayBillDtlTbl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DEMAND_NUMBER")
	private String demandNumber;

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

	@Column(name="CGST_AMOUNT_PER_MONTH")
	private BigDecimal cgstAmountPerMonth;

	@Column(name="CGST_RATE_PER_MONTH")
	private BigDecimal cgstRatePerMonth;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	@Temporal(TemporalType.DATE)
	@Column(name="DEMAND_DATE")
	private Date demandDate;

	@Column(name="FAN_CHARGES_PER_MONTH")
	private BigDecimal fanChargesPerMonth;

	@Column(name="HRR_CHARGES_PER_MONTH")
	private BigDecimal hrrChargesPerMonth;

	@Column(name="IGST_AMOUNT_PER_MONTH")
	private BigDecimal igstAmountPerMonth;

	@Column(name="IGST_RATE_PER_MONTH")
	private BigDecimal igstRatePerMonth;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LAST_UPDATE_LOGIN")
	private BigDecimal lastUpdateLogin;

	@Column(name="LAST_UPDATED_BY")
	private BigDecimal lastUpdatedBy;

	@Column(name="LATE_FEE_PER_MONTH")
	private BigDecimal lateFeePerMonth;

	@Column(name="LFCGST_AMOUNT_PER_MONTH")
	private BigDecimal lfcgstAmountPerMonth;

	@Column(name="LFCGST_RATE_PER_MONTH")
	private BigDecimal lfcgstRatePerMonth;

	@Column(name="LFIGST_AMOUNT_PER_MONTH")
	private BigDecimal lfigstAmountPerMonth;

	@Column(name="LFIGST_RATE_PER_MONTH")
	private BigDecimal lfigstRatePerMonth;

	@Column(name="LFSGST_AMOUNT_PER_MONTH")
	private BigDecimal lfsgstAmountPerMonth;

	@Column(name="LFSGST_RATE_PER_MONTH")
	private BigDecimal lfsgstRatePerMonth;

	@Column(name="LICENSE_FEE_PER_MONTH")
	private BigDecimal licenseFeePerMonth;

	private String remarks;

	@Column(name="SGST_AMOUNT_PER_MONTH")
	private BigDecimal sgstAmountPerMonth;

	@Column(name="SGST_RATE_PER_MONTH")
	private BigDecimal sgstRatePerMonth;

	@Column(name="TOTAL_DEMAND_PER_MONTH")
	private BigDecimal totalDemandPerMonth;
	
	@ManyToOne
	@JoinColumn(name="BILL_ID")
	private XxttdArLrsEpayBillHdrTbl xxttdArLrsEpayBillHdrTbl;

	public XxttdArLrsEpayBillDtlTbl() {
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

	public BigDecimal getCgstAmountPerMonth() {
		return this.cgstAmountPerMonth;
	}

	public void setCgstAmountPerMonth(BigDecimal cgstAmountPerMonth) {
		this.cgstAmountPerMonth = cgstAmountPerMonth;
	}

	public BigDecimal getCgstRatePerMonth() {
		return this.cgstRatePerMonth;
	}

	public void setCgstRatePerMonth(BigDecimal cgstRatePerMonth) {
		this.cgstRatePerMonth = cgstRatePerMonth;
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

	public BigDecimal getFanChargesPerMonth() {
		return this.fanChargesPerMonth;
	}

	public void setFanChargesPerMonth(BigDecimal fanChargesPerMonth) {
		this.fanChargesPerMonth = fanChargesPerMonth;
	}

	public BigDecimal getHrrChargesPerMonth() {
		return this.hrrChargesPerMonth;
	}

	public void setHrrChargesPerMonth(BigDecimal hrrChargesPerMonth) {
		this.hrrChargesPerMonth = hrrChargesPerMonth;
	}

	public BigDecimal getIgstAmountPerMonth() {
		return this.igstAmountPerMonth;
	}

	public void setIgstAmountPerMonth(BigDecimal igstAmountPerMonth) {
		this.igstAmountPerMonth = igstAmountPerMonth;
	}

	public BigDecimal getIgstRatePerMonth() {
		return this.igstRatePerMonth;
	}

	public void setIgstRatePerMonth(BigDecimal igstRatePerMonth) {
		this.igstRatePerMonth = igstRatePerMonth;
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

	public BigDecimal getLateFeePerMonth() {
		return this.lateFeePerMonth;
	}

	public void setLateFeePerMonth(BigDecimal lateFeePerMonth) {
		this.lateFeePerMonth = lateFeePerMonth;
	}

	public BigDecimal getLfcgstAmountPerMonth() {
		return this.lfcgstAmountPerMonth;
	}

	public void setLfcgstAmountPerMonth(BigDecimal lfcgstAmountPerMonth) {
		this.lfcgstAmountPerMonth = lfcgstAmountPerMonth;
	}

	public BigDecimal getLfcgstRatePerMonth() {
		return this.lfcgstRatePerMonth;
	}

	public void setLfcgstRatePerMonth(BigDecimal lfcgstRatePerMonth) {
		this.lfcgstRatePerMonth = lfcgstRatePerMonth;
	}

	public BigDecimal getLfigstAmountPerMonth() {
		return this.lfigstAmountPerMonth;
	}

	public void setLfigstAmountPerMonth(BigDecimal lfigstAmountPerMonth) {
		this.lfigstAmountPerMonth = lfigstAmountPerMonth;
	}

	public BigDecimal getLfigstRatePerMonth() {
		return this.lfigstRatePerMonth;
	}

	public void setLfigstRatePerMonth(BigDecimal lfigstRatePerMonth) {
		this.lfigstRatePerMonth = lfigstRatePerMonth;
	}

	public BigDecimal getLfsgstAmountPerMonth() {
		return this.lfsgstAmountPerMonth;
	}

	public void setLfsgstAmountPerMonth(BigDecimal lfsgstAmountPerMonth) {
		this.lfsgstAmountPerMonth = lfsgstAmountPerMonth;
	}

	public BigDecimal getLfsgstRatePerMonth() {
		return this.lfsgstRatePerMonth;
	}

	public void setLfsgstRatePerMonth(BigDecimal lfsgstRatePerMonth) {
		this.lfsgstRatePerMonth = lfsgstRatePerMonth;
	}

	public BigDecimal getLicenseFeePerMonth() {
		return this.licenseFeePerMonth;
	}

	public void setLicenseFeePerMonth(BigDecimal licenseFeePerMonth) {
		this.licenseFeePerMonth = licenseFeePerMonth;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getSgstAmountPerMonth() {
		return this.sgstAmountPerMonth;
	}

	public void setSgstAmountPerMonth(BigDecimal sgstAmountPerMonth) {
		this.sgstAmountPerMonth = sgstAmountPerMonth;
	}

	public BigDecimal getSgstRatePerMonth() {
		return this.sgstRatePerMonth;
	}

	public void setSgstRatePerMonth(BigDecimal sgstRatePerMonth) {
		this.sgstRatePerMonth = sgstRatePerMonth;
	}

	public BigDecimal getTotalDemandPerMonth() {
		return this.totalDemandPerMonth;
	}

	public void setTotalDemandPerMonth(BigDecimal totalDemandPerMonth) {
		this.totalDemandPerMonth = totalDemandPerMonth;
	}

	public String getDemandNumber() {
		return demandNumber;
	}

	public void setDemandNumber(String demandNumber) {
		this.demandNumber = demandNumber;
	}

	public XxttdArLrsEpayBillHdrTbl getXxttdArLrsEpayBillHdrTbl() {
		return xxttdArLrsEpayBillHdrTbl;
	}

	public void setXxttdArLrsEpayBillHdrTbl(XxttdArLrsEpayBillHdrTbl xxttdArLrsEpayBillHdrTbl) {
		this.xxttdArLrsEpayBillHdrTbl = xxttdArLrsEpayBillHdrTbl;
	}

	
}