package com.ttd.ussesvvd.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.User;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the USSES_VVD_OFFERINGS database table.
 * 
 */
@Entity
@Table(name="USSES_VVD_OFFERINGS")
@NamedQuery(name="UssesVvdOffering.findAll", query="SELECT u FROM UssesVvdOffering u")
public class UssesVvdOffering implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="OFFERING_ID")
	private String offeringId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="CURRENCY_ID")
	private BigDecimal currencyId;

	@Column(name="CURRENT_PRIV_AVAILED")
	private String currentPrivAvailed;

	@Column(name="DONATION_ACCESS_FROM")
	private String donationAccessFrom;

	@Column(name="DONATION_STATUS")
	private String donationStatus;

	@Column(name="DONOR_ID")
	private String donorId;

	@Temporal(TemporalType.DATE)
	@Column(name="DONOR_PASSBOOK_ISSUE_DT")
	private Date donorPassbookIssueDt;

	@Column(name="DONOR_PASSBOOK_NO")
	private String donorPassbookNo;

	@Column(name="DONOR_TYPE")
	private String donorType;

	@Column(name="DONOR_TYPE_ID")
	private String donorTypeId;

	@Column(name="DONOR_TYPE_NAME")
	private String donorTypeName;

	@Temporal(TemporalType.DATE)
	@Column(name="FDR_DATE")
	private Date fdrDate;

	@Column(name="FDR_NO")
	private String fdrNo;

	@Column(name="INSTR_BANK")
	private String instrBank;

	@Column(name="INSTR_BRANCH")
	private String instrBranch;

	@Temporal(TemporalType.DATE)
	@Column(name="INSTR_DATE")
	private Date instrDate;

	@Column(name="INSTR_NUMBER")
	private String instrNumber;

	@Column(name="INSTR_PAYBLE_AT")
	private String instrPaybleAt;

	@Column(name="ISDONOR_ACTIVE")
	private String isdonorActive;

	@Column(name="ISDONOR_NRI")
	private String isdonorNri;

	@Column(name="NEXT_PRIV_AVAILED")
	private String nextPrivAvailed;

	@Column(name="OFFERING_AMOUNT")
	private BigDecimal offeringAmount;

	@Temporal(TemporalType.DATE)
	@Column(name="OLD_DONOR_PASSBOOK_ISSUE_DT")
	private Date oldDonorPassbookIssueDt;

	@Column(name="OLD_DONOR_PASSBOOK_NO")
	private String oldDonorPassbookNo;

	@Column(name="OLD_OFFERING_ID")
	private String oldOfferingId;

	@Column(name="PAYMENT_MODE")
	private BigDecimal paymentMode;

	@Column(name="PAYMENT_RECEIPT")
	private String paymentReceipt;

	@Column(name="PAYMENT_RECEIPT_STATUS")
	private String paymentReceiptStatus;

	@Column(name="REMAINING_VALIDITY")
	private BigDecimal remainingValidity;

	private String remarks;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SCHEME_NAME")
	private String schemeName;

	@Temporal(TemporalType.DATE)
	@Column(name="SEVA_DATE")
	private Date sevaDate;

	@Column(name="SEVA_DAY")
	private String sevaDay;

	@Column(name="SEVA_MONTH")
	private String sevaMonth;

	@Column(name="SEVA_WEEK")
	private String sevaWeek;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	@Column(name="USSR_NO")
	private String ussrNo;
	
	@Column(name="VALIDITY_YEARS")
	private BigDecimal validityYears;
	
	@Column(name="PRIVILEGE_START_YEAR")
	private BigDecimal privilegeStartYear;
	
	@Temporal(TemporalType.DATE)
	@Column(name="OFFERING_DATE")
	private Date offeringDate;

	//bi-directional many-to-one association to UssesDonorNomineeDetail
	@OneToMany(mappedBy="ussesVvdOffering")
	private List<UssesDonorNomineeDetail> ussesDonorNomineeDetails;

	//bi-directional many-to-one association to UssesPrePostTransaction
	@OneToMany(mappedBy="ussesVvdOffering")
	private List<UssesPrePostTransaction> ussesPrePostTransactions;
	
	@OneToMany(mappedBy="ussesVvdOffering")
	private List<UssesDonorPrivRedemService> UssesDonorPrivRedemServices;

	public UssesVvdOffering() {
	}

	public String getOfferingId() {
		return this.offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
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

	public BigDecimal getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(BigDecimal currencyId) {
		this.currencyId = currencyId;
	}

	public String getCurrentPrivAvailed() {
		return this.currentPrivAvailed;
	}

	public void setCurrentPrivAvailed(String currentPrivAvailed) {
		this.currentPrivAvailed = currentPrivAvailed;
	}

	public String getDonationAccessFrom() {
		return this.donationAccessFrom;
	}

	public void setDonationAccessFrom(String donationAccessFrom) {
		this.donationAccessFrom = donationAccessFrom;
	}

	public String getDonationStatus() {
		return this.donationStatus;
	}

	public void setDonationStatus(String donationStatus) {
		this.donationStatus = donationStatus;
	}

	public String getDonorId() {
		return this.donorId;
	}

	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}

	public Date getDonorPassbookIssueDt() {
		return this.donorPassbookIssueDt;
	}

	public void setDonorPassbookIssueDt(Date donorPassbookIssueDt) {
		this.donorPassbookIssueDt = donorPassbookIssueDt;
	}

	public String getDonorPassbookNo() {
		return this.donorPassbookNo;
	}

	public void setDonorPassbookNo(String donorPassbookNo) {
		this.donorPassbookNo = donorPassbookNo;
	}

	public String getDonorType() {
		return this.donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public String getDonorTypeId() {
		return this.donorTypeId;
	}

	public void setDonorTypeId(String donorTypeId) {
		this.donorTypeId = donorTypeId;
	}

	public String getDonorTypeName() {
		return this.donorTypeName;
	}

	public void setDonorTypeName(String donorTypeName) {
		this.donorTypeName = donorTypeName;
	}

	public Date getFdrDate() {
		return this.fdrDate;
	}

	public void setFdrDate(Date fdrDate) {
		this.fdrDate = fdrDate;
	}

	public String getFdrNo() {
		return this.fdrNo;
	}

	public void setFdrNo(String fdrNo) {
		this.fdrNo = fdrNo;
	}

	public String getInstrBank() {
		return this.instrBank;
	}

	public void setInstrBank(String instrBank) {
		this.instrBank = instrBank;
	}

	public String getInstrBranch() {
		return this.instrBranch;
	}

	public void setInstrBranch(String instrBranch) {
		this.instrBranch = instrBranch;
	}

	public Date getInstrDate() {
		return this.instrDate;
	}

	public void setInstrDate(Date instrDate) {
		this.instrDate = instrDate;
	}

	public String getInstrNumber() {
		return this.instrNumber;
	}

	public void setInstrNumber(String instrNumber) {
		this.instrNumber = instrNumber;
	}

	public String getInstrPaybleAt() {
		return this.instrPaybleAt;
	}

	public void setInstrPaybleAt(String instrPaybleAt) {
		this.instrPaybleAt = instrPaybleAt;
	}

	public String getIsdonorActive() {
		return this.isdonorActive;
	}

	public void setIsdonorActive(String isdonorActive) {
		this.isdonorActive = isdonorActive;
	}

	public String getIsdonorNri() {
		return this.isdonorNri;
	}

	public void setIsdonorNri(String isdonorNri) {
		this.isdonorNri = isdonorNri;
	}

	public String getNextPrivAvailed() {
		return this.nextPrivAvailed;
	}

	public void setNextPrivAvailed(String nextPrivAvailed) {
		this.nextPrivAvailed = nextPrivAvailed;
	}

	public BigDecimal getOfferingAmount() {
		return this.offeringAmount;
	}

	public void setOfferingAmount(BigDecimal offeringAmount) {
		this.offeringAmount = offeringAmount;
	}

	public Date getOldDonorPassbookIssueDt() {
		return this.oldDonorPassbookIssueDt;
	}

	public void setOldDonorPassbookIssueDt(Date oldDonorPassbookIssueDt) {
		this.oldDonorPassbookIssueDt = oldDonorPassbookIssueDt;
	}

	public String getOldDonorPassbookNo() {
		return this.oldDonorPassbookNo;
	}

	public void setOldDonorPassbookNo(String oldDonorPassbookNo) {
		this.oldDonorPassbookNo = oldDonorPassbookNo;
	}

	public String getOldOfferingId() {
		return this.oldOfferingId;
	}

	public void setOldOfferingId(String oldOfferingId) {
		this.oldOfferingId = oldOfferingId;
	}

	public BigDecimal getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(BigDecimal paymentMode) {
		this.paymentMode = paymentMode;
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

	public BigDecimal getRemainingValidity() {
		return this.remainingValidity;
	}

	public void setRemainingValidity(BigDecimal remainingValidity) {
		this.remainingValidity = remainingValidity;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public Date getSevaDate() {
		return this.sevaDate;
	}

	public void setSevaDate(Date sevaDate) {
		this.sevaDate = sevaDate;
	}

	public String getSevaDay() {
		return this.sevaDay;
	}

	public void setSevaDay(String sevaDay) {
		this.sevaDay = sevaDay;
	}

	public String getSevaMonth() {
		return this.sevaMonth;
	}

	public void setSevaMonth(String sevaMonth) {
		this.sevaMonth = sevaMonth;
	}

	public String getSevaWeek() {
		return this.sevaWeek;
	}

	public void setSevaWeek(String sevaWeek) {
		this.sevaWeek = sevaWeek;
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
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUssrNo() {
		return this.ussrNo;
	}

	public void setUssrNo(String ussrNo) {
		this.ussrNo = ussrNo;
	}

	public BigDecimal getValidityYears() {
		return this.validityYears;
	}

	public void setValidityYears(BigDecimal validityYears) {
		this.validityYears = validityYears;
	}

	public List<UssesDonorNomineeDetail> getUssesDonorNomineeDetails() {
		return this.ussesDonorNomineeDetails;
	}

	public void setUssesDonorNomineeDetails(List<UssesDonorNomineeDetail> ussesDonorNomineeDetails) {
		this.ussesDonorNomineeDetails = ussesDonorNomineeDetails;
	}

	public UssesDonorNomineeDetail addUssesDonorNomineeDetail(UssesDonorNomineeDetail ussesDonorNomineeDetail) {
		getUssesDonorNomineeDetails().add(ussesDonorNomineeDetail);
		ussesDonorNomineeDetail.setUssesVvdOffering(this);

		return ussesDonorNomineeDetail;
	}

	public UssesDonorNomineeDetail removeUssesDonorNomineeDetail(UssesDonorNomineeDetail ussesDonorNomineeDetail) {
		getUssesDonorNomineeDetails().remove(ussesDonorNomineeDetail);
		ussesDonorNomineeDetail.setUssesVvdOffering(null);

		return ussesDonorNomineeDetail;
	}

	public List<UssesPrePostTransaction> getUssesPrePostTransactions() {
		return this.ussesPrePostTransactions;
	}

	public void setUssesPrePostTransactions(List<UssesPrePostTransaction> ussesPrePostTransactions) {
		this.ussesPrePostTransactions = ussesPrePostTransactions;
	}

	public UssesPrePostTransaction addUssesPrePostTransaction(UssesPrePostTransaction ussesPrePostTransaction) {
		getUssesPrePostTransactions().add(ussesPrePostTransaction);
		ussesPrePostTransaction.setUssesVvdOffering(this);

		return ussesPrePostTransaction;
	}

	public UssesPrePostTransaction removeUssesPrePostTransaction(UssesPrePostTransaction ussesPrePostTransaction) {
		getUssesPrePostTransactions().remove(ussesPrePostTransaction);
		ussesPrePostTransaction.setUssesVvdOffering(null);

		return ussesPrePostTransaction;
	}

	public List<UssesDonorPrivRedemService> getUssesDonorPrivRedemServices() {
		return UssesDonorPrivRedemServices;
	}

	public void setUssesDonorPrivRedemServices(
			List<UssesDonorPrivRedemService> ussesDonorPrivRedemServices) {
		UssesDonorPrivRedemServices = ussesDonorPrivRedemServices;
	}

	public Date getOfferingDate() {
		return offeringDate;
	}

	public void setOfferingDate(Date offeringDate) {
		this.offeringDate = offeringDate;
	}

	public BigDecimal getPrivilegeStartYear() {
		return privilegeStartYear;
	}

	public void setPrivilegeStartYear(BigDecimal privilegeStartYear) {
		this.privilegeStartYear = privilegeStartYear;
	}
	
	
	
}