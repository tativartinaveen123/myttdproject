package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the DONOR_NAME_CHNG_WRKFLW database table.
 * 
 */
@Entity
@Table(name = "DONOR_NAME_CHNG_WRKFLW")
@NamedQuery(name = "DonorNameChngWrkflw.findAll", query = "SELECT d FROM DonorNameChngWrkflw d")
public class DonorNameChngWrkflw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DONOR_NAME_CHNG_WRKFLW_REQUEST_ID_GENERATOR", sequenceName = "DONOR_NAME_CHNG_WRKFLW_SEQ", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DONOR_NAME_CHNG_WRKFLW_REQUEST_ID_GENERATOR")
	@Column(name = "REQUEST_ID")
	private long requestId;

	@Column(name = "APPROVAR_COMMENTS")
	private String approvarComments;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "NEW_FIRST_NAME")
	private String newFirstName;

	@Column(name = "NEW_INST_NAME")
	private String newInstName;

	@Column(name = "NEW_INST_TYPE")
	private String newInstType;

	@Column(name = "NEW_LAST_NAME")
	private String newLastName;

	@Column(name = "NEW_USER_ADDRESS_LINE1")
	private String newUserAddressLine1;

	@Column(name = "NEW_USER_ADDRESS_LINE2")
	private String newUserAddressLine2;

	@Column(name = "NEW_USER_CITY")
	private String newUserCity;

	@Column(name = "NEW_USER_COUNTRY")
	private String newUserCountry;

	@Temporal(TemporalType.DATE)
	@Column(name = "NEW_USER_DOB")
	private Date newUserDob;

	@Column(name = "NEW_USER_EMAIL")
	private String newUserEmail;

	@Column(name = "NEW_USER_GENDER")
	private String newUserGender;

	@Column(name = "NEW_USER_IDPROOF_NUMBER")
	private String newUserIdproofNumber;

	@Column(name = "NEW_USER_IDPROOF_TYPE")
	private BigDecimal newUserIdproofType;

	@Column(name = "NEW_USER_PHONE_MOBILE")
	private String newUserPhoneMobile;

	@Column(name = "NEW_USER_STATE")
	private String newUserState;

	@Column(name = "NEW_USER_ZIP_CODE")
	private String newUserZipCode;

	@Column(name = "OLD_FIRST_NAME")
	private String oldFirstName;

	@Column(name = "OLD_INST_NAME")
	private String oldInstName;

	@Column(name = "OLD_INST_TYPE")
	private String oldInstType;

	@Column(name = "OLD_LAST_NAME")
	private String oldLastName;

	@Column(name = "OLD_USER_ADDRESS_LINE1")
	private String oldUserAddressLine1;

	@Column(name = "OLD_USER_ADDRESS_LINE2")
	private String oldUserAddressLine2;

	@Column(name = "OLD_USER_CITY")
	private String oldUserCity;

	@Column(name = "OLD_USER_COUNTRY")
	private String oldUserCountry;

	@Column(name = "OLD_USER_DOB")
	private Date oldUserDob;

	@Column(name = "OLD_USER_EMAIL")
	private String oldUserEmail;

	@Column(name = "OLD_USER_GENDER")
	private String oldUserGender;

	@Column(name = "OLD_USER_IDPROOF_NUMBER")
	private String oldUserIdproofNumber;

	@Column(name = "OLD_USER_IDPROOF_TYPE")
	private BigDecimal oldUserIdproofType;

	@Column(name = "OLD_USER_PHONE_MOBILE")
	private String oldUserPhoneMobile;

	@Column(name = "OLD_USER_STATE")
	private String oldUserState;

	@Column(name = "OLD_USER_ZIP_CODE")
	private String oldUserZipCode;

	@Column(name = "REQUESTER_COMMENTS")
	private String requesterComments;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SERVICE_TYPE")
	private String serviceType;

	private String status;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "USER_ID")
	private BigDecimal userId;

	@Column(name = "NOMINEE_DETAILS_ID")
	private BigDecimal nomineeDetailsId;

	@Column(name = "NEW_USER_IMAGE")
	private String newUserImage;

	@Column(name = "OLD_USER_IMAGE")
	private String oldUserImage;

	@Column(name = "NEW_USER_RELATIONSHIP")
	private String newUserRelationship;

	@Column(name = "Old_USER_RELATIONSHIP")
	private String oldUserRelationship;

	@Column(name = "OFFERING_ID")
	private String offeringId;

	@Column(name = "DOC_PATH")
	private String docPath;

	@Column(name = "DONOR_ID")
	private String donorId;
	
	@Column(name = "OLD_COUNTRY_CODE")
	private String oldCountryCode;

	@Column(name = "NEW_COUNTRY_CODE")
	private String newCountryCode;
	
	public String getDocPath() {
		return docPath;
	}

	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}

	public String getOfferingId() {
		return offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

	public String getNewUserRelationship() {
		return newUserRelationship;
	}

	public void setNewUserRelationship(String newUserRelationship) {
		this.newUserRelationship = newUserRelationship;
	}

	public String getOldUserRelationship() {
		return oldUserRelationship;
	}

	public void setOldUserRelationship(String oldUserRelationship) {
		this.oldUserRelationship = oldUserRelationship;
	}

	public String getNewUserImage() {
		return newUserImage;
	}

	public void setNewUserImage(String newUserImage) {
		this.newUserImage = newUserImage;
	}

	public String getOldUserImage() {
		return oldUserImage;
	}

	public void setOldUserImage(String oldUserImage) {
		this.oldUserImage = oldUserImage;
	}

	public DonorNameChngWrkflw() {
	}

	public long getRequestId() {
		return this.requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public String getApprovarComments() {
		return this.approvarComments;
	}

	public void setApprovarComments(String approvarComments) {
		this.approvarComments = approvarComments;
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

	public String getNewFirstName() {
		return this.newFirstName;
	}

	public void setNewFirstName(String newFirstName) {
		this.newFirstName = newFirstName;
	}

	public String getNewInstName() {
		return this.newInstName;
	}

	public void setNewInstName(String newInstName) {
		this.newInstName = newInstName;
	}

	public String getNewInstType() {
		return this.newInstType;
	}

	public void setNewInstType(String newInstType) {
		this.newInstType = newInstType;
	}

	public String getNewLastName() {
		return this.newLastName;
	}

	public void setNewLastName(String newLastName) {
		this.newLastName = newLastName;
	}

	public String getNewUserAddressLine1() {
		return this.newUserAddressLine1;
	}

	public void setNewUserAddressLine1(String newUserAddressLine1) {
		this.newUserAddressLine1 = newUserAddressLine1;
	}

	public String getNewUserAddressLine2() {
		return this.newUserAddressLine2;
	}

	public void setNewUserAddressLine2(String newUserAddressLine2) {
		this.newUserAddressLine2 = newUserAddressLine2;
	}

	public String getNewUserCity() {
		return this.newUserCity;
	}

	public void setNewUserCity(String newUserCity) {
		this.newUserCity = newUserCity;
	}

	public String getNewUserCountry() {
		return this.newUserCountry;
	}

	public void setNewUserCountry(String newUserCountry) {
		this.newUserCountry = newUserCountry;
	}

	public Date getNewUserDob() {
		return this.newUserDob;
	}

	public void setNewUserDob(Date newUserDob) {
		this.newUserDob = newUserDob;
	}

	public String getNewUserEmail() {
		return this.newUserEmail;
	}

	public void setNewUserEmail(String newUserEmail) {
		this.newUserEmail = newUserEmail;
	}

	public String getNewUserGender() {
		return this.newUserGender;
	}

	public void setNewUserGender(String newUserGender) {
		this.newUserGender = newUserGender;
	}

	public String getNewUserIdproofNumber() {
		return this.newUserIdproofNumber;
	}

	public void setNewUserIdproofNumber(String newUserIdproofNumber) {
		this.newUserIdproofNumber = newUserIdproofNumber;
	}

	public BigDecimal getNewUserIdproofType() {
		return this.newUserIdproofType;
	}

	public void setNewUserIdproofType(BigDecimal newUserIdproofType) {
		this.newUserIdproofType = newUserIdproofType;
	}

	public String getNewUserPhoneMobile() {
		return this.newUserPhoneMobile;
	}

	public void setNewUserPhoneMobile(String newUserPhoneMobile) {
		this.newUserPhoneMobile = newUserPhoneMobile;
	}

	public String getNewUserState() {
		return this.newUserState;
	}

	public void setNewUserState(String newUserState) {
		this.newUserState = newUserState;
	}

	public String getNewUserZipCode() {
		return this.newUserZipCode;
	}

	public void setNewUserZipCode(String newUserZipCode) {
		this.newUserZipCode = newUserZipCode;
	}

	public String getOldFirstName() {
		return this.oldFirstName;
	}

	public void setOldFirstName(String oldFirstName) {
		this.oldFirstName = oldFirstName;
	}

	public String getOldInstName() {
		return this.oldInstName;
	}

	public void setOldInstName(String oldInstName) {
		this.oldInstName = oldInstName;
	}

	public String getOldInstType() {
		return this.oldInstType;
	}

	public void setOldInstType(String oldInstType) {
		this.oldInstType = oldInstType;
	}

	public String getOldLastName() {
		return this.oldLastName;
	}

	public void setOldLastName(String oldLastName) {
		this.oldLastName = oldLastName;
	}

	public String getOldUserAddressLine1() {
		return this.oldUserAddressLine1;
	}

	public void setOldUserAddressLine1(String oldUserAddressLine1) {
		this.oldUserAddressLine1 = oldUserAddressLine1;
	}

	public String getOldUserAddressLine2() {
		return this.oldUserAddressLine2;
	}

	public void setOldUserAddressLine2(String oldUserAddressLine2) {
		this.oldUserAddressLine2 = oldUserAddressLine2;
	}

	public String getOldUserCity() {
		return this.oldUserCity;
	}

	public void setOldUserCity(String oldUserCity) {
		this.oldUserCity = oldUserCity;
	}

	public String getOldUserCountry() {
		return this.oldUserCountry;
	}

	public void setOldUserCountry(String oldUserCountry) {
		this.oldUserCountry = oldUserCountry;
	}

	public Date getOldUserDob() {
		return this.oldUserDob;
	}

	public void setOldUserDob(Date oldUserDob) {
		this.oldUserDob = oldUserDob;
	}

	public String getOldUserEmail() {
		return this.oldUserEmail;
	}

	public void setOldUserEmail(String oldUserEmail) {
		this.oldUserEmail = oldUserEmail;
	}

	public String getOldUserGender() {
		return this.oldUserGender;
	}

	public void setOldUserGender(String oldUserGender) {
		this.oldUserGender = oldUserGender;
	}

	public String getOldUserIdproofNumber() {
		return this.oldUserIdproofNumber;
	}

	public void setOldUserIdproofNumber(String oldUserIdproofNumber) {
		this.oldUserIdproofNumber = oldUserIdproofNumber;
	}

	public BigDecimal getOldUserIdproofType() {
		return this.oldUserIdproofType;
	}

	public void setOldUserIdproofType(BigDecimal oldUserIdproofType) {
		this.oldUserIdproofType = oldUserIdproofType;
	}

	public String getOldUserPhoneMobile() {
		return this.oldUserPhoneMobile;
	}

	public void setOldUserPhoneMobile(String oldUserPhoneMobile) {
		this.oldUserPhoneMobile = oldUserPhoneMobile;
	}

	public String getOldUserState() {
		return this.oldUserState;
	}

	public void setOldUserState(String oldUserState) {
		this.oldUserState = oldUserState;
	}

	public String getOldUserZipCode() {
		return this.oldUserZipCode;
	}

	public void setOldUserZipCode(String oldUserZipCode) {
		this.oldUserZipCode = oldUserZipCode;
	}

	public String getRequesterComments() {
		return this.requesterComments;
	}

	public void setRequesterComments(String requesterComments) {
		this.requesterComments = requesterComments;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public BigDecimal getNomineeDetailsId() {
		return nomineeDetailsId;
	}

	public void setNomineeDetailsId(BigDecimal nomineeDetailsId) {
		this.nomineeDetailsId = nomineeDetailsId;
	}

	public String getDonorId() {
		return donorId;
	}

	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}

	public String getOldCountryCode() {
		return oldCountryCode;
	}

	public void setOldCountryCode(String oldCountryCode) {
		this.oldCountryCode = oldCountryCode;
	}

	public String getNewCountryCode() {
		return newCountryCode;
	}

	public void setNewCountryCode(String newCountryCode) {
		this.newCountryCode = newCountryCode;
	}
	
	

}