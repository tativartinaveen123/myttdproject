package com.ttd.lrs.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.ehundi.entity.PgTransaction;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LRS_EPAY_TXN_TBL database table.
 * 
 */
@Entity
@Table(name="XXTTD_AR_LRS_EPAY_TXN_TBL")
@NamedQuery(name="LrsEpayTxnTbl.findAll", query="SELECT l FROM LrsEpayTxnTbl l")
public class LrsEpayTxnTbl implements Serializable {
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

	@Column(name="ATTRIBUTE16")
	private BigDecimal tenantNumber;

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

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Column(name="CREATION_DATE", insertable=false, updatable=false)
	private Date creationDate;

	@Column(name="DEPARTMENT_ID")
	private BigDecimal departmentId;

	@Column(name="DUE_AMOUNT")
	private BigDecimal dueAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="LAST_UPDATE_LOGIN")
	private BigDecimal lastUpdateLogin;

	@Column(name="LAST_UPDATED_BY")
	private BigDecimal lastUpdatedBy;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="PARTY_ID")
	private BigDecimal partyId;
	
	@Column(name="PARTY_NAME")
	private String partyName;

	@Column(name="PROPERTY_ID")
	private BigDecimal propertyId;
	
	@Column(name="PROPERTY_NAME")
	private String propertyName;

	private String remarks;

	@Column(name="TXN_AMOUNT")
	private BigDecimal txnAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="TXN_DATE")
	private Date txnDate;

	@Column(name="TXN_MODE")
	private String txnMode;
	
	@Id
	@Column(name="TXN_NUMBER")
	private String txnNumber;
	
	@Column(name = "TXN_STATUS")
	private String bookingStatus;

	@Column(name = "LRS_PROCESS_FLAG", insertable=false, updatable=false)
	private String lrsProcessFlag;
	
	@Column(name = "STATUS_FLAG")
	private String statusFlag;
	
	@Column(name = "ERROR_MESSAGE")
	private String errorMessage;
	
	@Column(name = "PROPERTY_LOCATION")
	private String propertyLocation;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;
	
	
	public String getStatusFlag() {
		return statusFlag;
	}

	public void setStatusFlag(String statusFlag) {
		this.statusFlag = statusFlag;
	}
	

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public PgTransaction getPgTransaction() {
		return pgTransaction;
	}

	public void setPgTransaction(PgTransaction pgTransaction) {
		this.pgTransaction = pgTransaction;
	}

	public LrsEpayTxnTbl() {
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



	public BigDecimal getTenantNumber() {
		return tenantNumber;
	}

	public void setTenantNumber(BigDecimal tenantNumber) {
		this.tenantNumber = tenantNumber;
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

	public BigDecimal getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(BigDecimal departmentId) {
		this.departmentId = departmentId;
	}

	public BigDecimal getDueAmount() {
		return this.dueAmount;
	}

	public void setDueAmount(BigDecimal dueAmount) {
		this.dueAmount = dueAmount;
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

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public BigDecimal getTxnAmount() {
		return this.txnAmount;
	}

	public void setTxnAmount(BigDecimal txnAmount) {
		this.txnAmount = txnAmount;
	}

	public Date getTxnDate() {
		return this.txnDate;
	}

	public void setTxnDate(Date txnDate) {
		this.txnDate = txnDate;
	}

	public String getTxnNumber() {
		return this.txnNumber;
	}

	public void setTxnNumber(String txnNumber) {
		this.txnNumber = txnNumber;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getTxnMode() {
		return txnMode;
	}

	public void setTxnMode(String txnMode) {
		this.txnMode = txnMode;
	}

	public String getLrsProcessFlag() {
		return lrsProcessFlag;
	}

	public void setLrsProcessFlag(String lrsProcessFlag) {
		this.lrsProcessFlag = lrsProcessFlag;
	}

}