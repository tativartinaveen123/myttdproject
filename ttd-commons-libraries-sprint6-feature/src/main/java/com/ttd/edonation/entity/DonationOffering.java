package com.ttd.edonation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.CascadeType;

import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.donor.entity.DonationProductMaster;
import com.ttd.donor.entity.DonorCounterOffering;
import com.ttd.donor.entity.OneDayDonationDtls;
import com.ttd.ehundi.entity.PgTransaction;


/**
 * The persistent class for the DONATION_OFFERINGS database table.
 * 
 */
@Entity
@Table(name="DONATION_OFFERINGS")
@NamedQuery(name="DonationOffering.findAll", query="SELECT d FROM DonationOffering d")
public class DonationOffering implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="OFFERING_ID")
	private String offeringId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME",insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="CURRENCY_ID")
	private BigDecimal currencyId;

	@Column(name="DONATION_STATUS")
	private String donationStatus;
	
	@Column(name="EXPIRY_STATUS")
	private String expiryStatus;

	@Column(name="PAYMENT_RECEIPT")
	private String paymentReceipt;	

	@Column(name="OFFERING_AMOUNT")
	private BigDecimal offeringAmount;

	@Column(name="OFFERING_ON_BEHALF")
	private String offeringOnBehalf;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SCHEME_ID")
	private BigDecimal schemeId;

	@Column(name="TRUST_ID")
	private BigDecimal trustId;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="DONATION_ACCESS_FROM")
	private String donationAccessFrom;
	
	@Column(name="DONOR_TYPE")
	private String donorType;
	
	@Column(name="DONOR_TYPE_ID")
	private String donorTypeId;
	
	@Column(name="DONOR_TYPE_NAME")
	private String donorTypeName;
	
	@Column(name="DONOR_NEWID")
	private String donorNewId;
	
	@Column(name="DONOR_OLDID")
	private String donorOldId;
	
	@Column(name="FILEROC_NO")
	private String fileRocNo;
	
	@Column(name="FILE_DATE")
	private Date fileDate;
	
	@Column(name="ISDONOR_NRI")
	private Date isDonorNri;
	
	@Column(name="ISDONOR_ACTIVE")
	private Date isDonorActive;
	
	@Column(name="OLD_OFFERING_ID")
	private String oldOfferingId;
	
	@Column(name="DONATION_FOR")
	private String donationFor;
	
	@Column(name="DONATION_TYPE_ISMTVAC")
	private String donationTypeIsMtvac;
	
	
	@Column(name="CORPUS_PERCENTAGE")
	private BigDecimal corpusPercentage;
	

	@Column(name="GENERAL_PERCENTAGE")
	private BigDecimal generalPercentage;
	
	@Column(name="GENERAL_AMOUNT")
	private BigDecimal generalAmount;
	
	@Column(name="CORPUS_AMOUNT")
	private BigDecimal corpusAmount;
	
	
	
	
	public BigDecimal getCorpusPercentage() {
		return corpusPercentage;
	}

	public void setCorpusPercentage(BigDecimal corpusPercentage) {
		this.corpusPercentage = corpusPercentage;
	}

	public BigDecimal getGeneralPercentage() {
		return generalPercentage;
	}

	public void setGeneralPercentage(BigDecimal generalPercentage) {
		this.generalPercentage = generalPercentage;
	}

	public BigDecimal getGeneralAmount() {
		return generalAmount;
	}

	public void setGeneralAmount(BigDecimal generalAmount) {
		this.generalAmount = generalAmount;
	}

	public BigDecimal getCorpusAmount() {
		return corpusAmount;
	}

	public void setCorpusAmount(BigDecimal corpusAmount) {
		this.corpusAmount = corpusAmount;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setEmailNotifcation(EmailNotification emailNotifcation) {
		this.emailNotifcation = emailNotifcation;
	}

	public String getDonationTypeIsMtvac() {
		return donationTypeIsMtvac;
	}

	public void setDonationTypeIsMtvac(String donationTypeIsMtvac) {
		this.donationTypeIsMtvac = donationTypeIsMtvac;
	}

	public String getOldOfferingId() {
		return oldOfferingId;
	}

	public void setOldOfferingId(String oldOfferingId) {
		this.oldOfferingId = oldOfferingId;
	}

	@OneToMany(mappedBy="donationOffering", cascade = CascadeType.ALL)
	private List<DonorCounterOffering> donorCounterOfferings;
	
	
	//ODD
	/*@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL,mappedBy="donationOffering")
	private OneDayDonationDtls oneDayDonationDtls;
	
	public OneDayDonationDtls getOneDayDonationDtls() {
		return oneDayDonationDtls;
	}

	public void setOneDayDonationDtls(OneDayDonationDtls oneDayDonationDtls) {
		this.oneDayDonationDtls = oneDayDonationDtls;
	}
*/
	public String getDonorNewId() {
		return donorNewId;
	}

	public void setDonorNewId(String donorNewId) {
		this.donorNewId = donorNewId;
	}

	public String getDonorOldId() {
		return donorOldId;
	}

	public void setDonorOldId(String donorOldId) {
		this.donorOldId = donorOldId;
	}

	public String getFileRocNo() {
		return fileRocNo;
	}

	public void setFileRocNo(String fileRocNo) {
		this.fileRocNo = fileRocNo;
	}

	public Date getFileDate() {
		return fileDate;
	}

	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	public Date getIsDonorNri() {
		return isDonorNri;
	}

	public void setIsDonorNri(Date isDonorNri) {
		this.isDonorNri = isDonorNri;
	}

	public Date getIsDonorActive() {
		return isDonorActive;
	}

	public void setIsDonorActive(Date isDonorActive) {
		this.isDonorActive = isDonorActive;
	}

	public String getDonationAccessFrom() {
		return donationAccessFrom;
	}

	public void setDonationAccessFrom(String donationAccessFrom) {
		this.donationAccessFrom = donationAccessFrom;
	}

	public String getDonorPassbookNo() {
		return donorPassbookNo;
	}
	
	public String getOlddonorPassbookNo() {
		return olddonorPassbookNo;
	}

	public void setOlddonorPassbookNo(String olddonorPassbookNo) {
		this.olddonorPassbookNo = olddonorPassbookNo;
	}


	public void setDonorPassbookNo(String donorPassbookNo) {
		this.donorPassbookNo = donorPassbookNo;
	}

	public Date getDonorPassbookIssueDate() {
		return donorPassbookIssueDate;
	}

	public void setDonorPassbookIssueDate(Date donorPassbookIssueDate) {
		this.donorPassbookIssueDate = donorPassbookIssueDate;
	}

	public String getItReceipt() {
		return itReceipt;
	}

	public void setItReceipt(String itReceipt) {
		this.itReceipt = itReceipt;
	}

	@Column(name="DONOR_PASSBOOK_NO")
	private String donorPassbookNo;
	
	@Column(name="OLD_DONOR_PASSBOOK_NO")
	private String olddonorPassbookNo;
	
	@Column(name="DONOR_PASSBOOK_ISSUE_DT")
	private Date donorPassbookIssueDate;
	
	@Column(name="IT_RECEIPT")
	private String itReceipt;

	@Column(name="PAYMENT_RECEIPT_STATUS")
	private String receiptStatus;

	//bi-directional many-to-one association to DonorJointUser
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="DONOR_JOINT_USER_ID")
	private DonorJointUser donorJointUser;

	//bi-directional many-to-one association to EmailNotifcation
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;

	//bi-directional many-to-one association to PgTransaction
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="PG_TRANSACTION_ID")
	private PgTransaction pgTransaction;

	//bi-directional many-to-one association to SmsNotification
	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="SMS_NOTIFICATION_ID")
	
	private SmsNotification smsNotification;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	//bi-directional many-to-one association to DonorFamilyDetail
	@OneToMany(mappedBy="donationOffering")
	private List<DonorFamilyDetail> donorFamilyDetails;

	//bi-directional many-to-one association to DonorJointUser
	@OneToMany(mappedBy="donationOffering", cascade = CascadeType.ALL)
	private List<DonorJointUser> donorJointUsers;

	@Column(name = "SESSION_ID")
	private String sessionId;

	@Column(name = "REQ_CHANNEL")
	private String requestChannel;
	
	public DonationOffering() {
	}

	public String getPaymentReceipt() {
		return paymentReceipt;
	}

	public void setPaymentReceipt(String paymentReceipt) {
		this.paymentReceipt = paymentReceipt;
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

	public String getDonationStatus() {
		return this.donationStatus;
	}

	public void setDonationStatus(String donationStatus) {
		this.donationStatus = donationStatus;
	}

	public BigDecimal getOfferingAmount() {
		return this.offeringAmount;
	}

	public void setOfferingAmount(BigDecimal offeringAmount) {
		this.offeringAmount = offeringAmount;
	}

	public String getOfferingOnBehalf() {
		return this.offeringOnBehalf;
	}

	public void setOfferingOnBehalf(String offeringOnBehalf) {
		this.offeringOnBehalf = offeringOnBehalf;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getSchemeId() {
		return this.schemeId;
	}

	public void setSchemeId(BigDecimal schemeId) {
		this.schemeId = schemeId;
	}

	public BigDecimal getTrustId() {
		return this.trustId;
	}

	public void setTrustId(BigDecimal trustId) {
		this.trustId = trustId;
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

	public DonorJointUser getDonorJointUser() {
		return this.donorJointUser;
	}

	public void setDonorJointUser(DonorJointUser donorJointUser) {
		this.donorJointUser = donorJointUser;
	}

	public EmailNotification getEmailNotifcation() {
		return this.emailNotifcation;
	}	

	public void setEmailNotification(EmailNotification emailNotifcation) {
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

	public List<DonorFamilyDetail> getDonorFamilyDetails() {
		return this.donorFamilyDetails;
	}

	public void setDonorFamilyDetails(List<DonorFamilyDetail> donorFamilyDetails) {
		this.donorFamilyDetails = donorFamilyDetails;
	}

	public DonorFamilyDetail addDonorFamilyDetail(DonorFamilyDetail donorFamilyDetail) {
		getDonorFamilyDetails().add(donorFamilyDetail);
		donorFamilyDetail.setDonationOffering(this);

		return donorFamilyDetail;
	}

	public DonorFamilyDetail removeDonorFamilyDetail(DonorFamilyDetail donorFamilyDetail) {
		getDonorFamilyDetails().remove(donorFamilyDetail);
		donorFamilyDetail.setDonationOffering(null);

		return donorFamilyDetail;
	}

	public List<DonorJointUser> getDonorJointUsers() {
		return this.donorJointUsers;
	}

	public void setDonorJointUsers(List<DonorJointUser> donorJointUsers) {
		this.donorJointUsers = donorJointUsers;
	}

	public DonorJointUser addDonorJointUser(DonorJointUser donorJointUser) {
		getDonorJointUsers().add(donorJointUser);
		donorJointUser.setDonationOffering(this);

		return donorJointUser;
	}

	public DonorJointUser removeDonorJointUser(DonorJointUser donorJointUser) {
		getDonorJointUsers().remove(donorJointUser);
		donorJointUser.setDonationOffering(null);

		return donorJointUser;
	}
	public String getReceiptStatus() {
		return receiptStatus;
	}

	public void setReceiptStatus(String receiptStatus) {
		this.receiptStatus = receiptStatus;
	}

	public List<DonorCounterOffering> getDonorCounterOfferings() {
		return donorCounterOfferings;
	}

	public void setDonorCounterOfferings(
			List<DonorCounterOffering> donorCounterOfferings) {
		this.donorCounterOfferings = donorCounterOfferings;
	}
	
	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public String getDonorTypeId() {
		return donorTypeId;
	}

	public void setDonorTypeId(String donorTypeId) {
		this.donorTypeId = donorTypeId;
	}

	public String getDonorTypeName() {
		return donorTypeName;
	}

	public void setDonorTypeName(String donorTypeName) {
		this.donorTypeName = donorTypeName;
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

	public String getExpiryStatus() {
		return expiryStatus;
	}

	public void setExpiryStatus(String expiryStatus) {
		this.expiryStatus = expiryStatus;
	}

	public String getDonationFor() {
		return donationFor;
	}

	public void setDonationFor(String donationFor) {
		this.donationFor = donationFor;
	}
	
	
}