package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USERS_FRIENDS_AND_FAMILY database table.
 * 
 */
@Entity
@Table(name="USERS_FRIENDS_AND_FAMILY")
@NamedQuery(name="UsersFriendsAndFamily.findAll", query="SELECT u FROM UsersFriendsAndFamily u")
public class UsersFriendsAndFamily implements Serializable {
	private static final long serialVersionUID = 1L;

	/*@Id
	@Column(name="FAMILY_PERSON_ID")*/
	@Id
	@SequenceGenerator(name="USERS_FRIENDS_SEQ_GENERATOR", sequenceName="USERS_FRIENDS_SEQ ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERS_FRIENDS_SEQ_GENERATOR")
	@Column(name="FAMILY_PERSON_ID", nullable=false, precision=8)
	private long familyPersonId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="FAMILY_PERSON_ADDRESS_LINE1")
	private String familyPersonAddressLine1;

	@Column(name="FAMILY_PERSON_ADDRESS_LINE2")
	private String familyPersonAddressLine2;

	@Column(name="FAMILY_PERSON_AGE")
	private BigDecimal familyPersonAge;

	@Column(name="FAMILY_PERSON_CITY")
	private String familyPersonCity;

	@Column(name="FAMILY_PERSON_COUNTRY")
	private BigDecimal familyPersonCountry;

	@Temporal(TemporalType.DATE)
	@Column(name="FAMILY_PERSON_DOB")
	private Date familyPersonDob;

	@Column(name="FAMILY_PERSON_EMAILID")
	private String familyPersonEmailid;

	@Column(name="FAMILY_PERSON_FIRST_NAME")
	private String familyPersonFirstName;

	@Column(name="FAMILY_PERSON_GENDER")
	private String familyPersonGender;

	@Column(name="FAMILY_PERSON_IDPROOF_NUMBER")
	private String familyPersonIdproofNumber;

	@Column(name="FAMILY_PERSON_LAST_NAME")
	private String familyPersonLastName;

	@Column(name="FAMILY_PERSON_MIDDLE_NAME")
	private String familyPersonMiddleName;

	@Column(name="FAMILY_PERSON_PHONE_MOBILE")
	private String familyPersonPhoneMobile;

	@Column(name="FAMILY_PERSON_PHONE_OTHER")
	private String familyPersonPhoneOther;

	@Column(name="FAMILY_PERSON_STATE")
	private String familyPersonState;

	@Column(name="FAMILY_PERSON_TITLE")
	private String familyPersonTitle;

	@Column(name="FAMILY_PERSON_ZIP_CODE")
	private String familyPersonZipCode;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to CommonValueMaster
	@ManyToOne
	@JoinColumn(name="FAMILY_PERSON_IDPROOF_TYPE")
	private CommonValueMaster commonValueMaster;

	//bi-directional many-to-one association to ImagesStore
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="IMAGE_ID")
	private ImagesStore imagesStore;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public UsersFriendsAndFamily() {
	}

	public long getFamilyPersonId() {
		return this.familyPersonId;
	}

	public void setFamilyPersonId(long familyPersonId) {
		this.familyPersonId = familyPersonId;
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

	public String getFamilyPersonAddressLine1() {
		return this.familyPersonAddressLine1;
	}

	public void setFamilyPersonAddressLine1(String familyPersonAddressLine1) {
		this.familyPersonAddressLine1 = familyPersonAddressLine1;
	}

	public String getFamilyPersonAddressLine2() {
		return this.familyPersonAddressLine2;
	}

	public void setFamilyPersonAddressLine2(String familyPersonAddressLine2) {
		this.familyPersonAddressLine2 = familyPersonAddressLine2;
	}

	public BigDecimal getFamilyPersonAge() {
		return this.familyPersonAge;
	}

	public void setFamilyPersonAge(BigDecimal familyPersonAge) {
		this.familyPersonAge = familyPersonAge;
	}

	public String getFamilyPersonCity() {
		return this.familyPersonCity;
	}

	public void setFamilyPersonCity(String familyPersonCity) {
		this.familyPersonCity = familyPersonCity;
	}

	public BigDecimal getFamilyPersonCountry() {
		return this.familyPersonCountry;
	}

	public void setFamilyPersonCountry(BigDecimal familyPersonCountry) {
		this.familyPersonCountry = familyPersonCountry;
	}

	public Date getFamilyPersonDob() {
		return this.familyPersonDob;
	}

	public void setFamilyPersonDob(Date familyPersonDob) {
		this.familyPersonDob = familyPersonDob;
	}

	public String getFamilyPersonEmailid() {
		return this.familyPersonEmailid;
	}

	public void setFamilyPersonEmailid(String familyPersonEmailid) {
		this.familyPersonEmailid = familyPersonEmailid;
	}

	public String getFamilyPersonFirstName() {
		return this.familyPersonFirstName;
	}

	public void setFamilyPersonFirstName(String familyPersonFirstName) {
		this.familyPersonFirstName = familyPersonFirstName;
	}

	public String getFamilyPersonGender() {
		return this.familyPersonGender;
	}

	public void setFamilyPersonGender(String familyPersonGender) {
		this.familyPersonGender = familyPersonGender;
	}

	public String getFamilyPersonIdproofNumber() {
		return this.familyPersonIdproofNumber;
	}

	public void setFamilyPersonIdproofNumber(String familyPersonIdproofNumber) {
		this.familyPersonIdproofNumber = familyPersonIdproofNumber;
	}

	public String getFamilyPersonLastName() {
		return this.familyPersonLastName;
	}

	public void setFamilyPersonLastName(String familyPersonLastName) {
		this.familyPersonLastName = familyPersonLastName;
	}

	public String getFamilyPersonMiddleName() {
		return this.familyPersonMiddleName;
	}

	public void setFamilyPersonMiddleName(String familyPersonMiddleName) {
		this.familyPersonMiddleName = familyPersonMiddleName;
	}

	public String getFamilyPersonPhoneMobile() {
		return this.familyPersonPhoneMobile;
	}

	public void setFamilyPersonPhoneMobile(String familyPersonPhoneMobile) {
		this.familyPersonPhoneMobile = familyPersonPhoneMobile;
	}

	public String getFamilyPersonPhoneOther() {
		return this.familyPersonPhoneOther;
	}

	public void setFamilyPersonPhoneOther(String familyPersonPhoneOther) {
		this.familyPersonPhoneOther = familyPersonPhoneOther;
	}

	public String getFamilyPersonState() {
		return this.familyPersonState;
	}

	public void setFamilyPersonState(String familyPersonState) {
		this.familyPersonState = familyPersonState;
	}

	public String getFamilyPersonTitle() {
		return this.familyPersonTitle;
	}

	public void setFamilyPersonTitle(String familyPersonTitle) {
		this.familyPersonTitle = familyPersonTitle;
	}

	public String getFamilyPersonZipCode() {
		return this.familyPersonZipCode;
	}

	public void setFamilyPersonZipCode(String familyPersonZipCode) {
		this.familyPersonZipCode = familyPersonZipCode;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
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

	public CommonValueMaster getCommonValueMaster() {
		return this.commonValueMaster;
	}

	public void setCommonValueMaster(CommonValueMaster commonValueMaster) {
		this.commonValueMaster = commonValueMaster;
	}

	public ImagesStore getImagesStore() {
		return this.imagesStore;
	}

	public void setImagesStore(ImagesStore imagesStore) {
		this.imagesStore = imagesStore;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}