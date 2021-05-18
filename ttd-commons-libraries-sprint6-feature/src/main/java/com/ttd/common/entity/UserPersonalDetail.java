package com.ttd.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * The persistent class for the USER_PERSONAL_DETAILS database table.
 * 
 */
@Entity
@Table(name = "USER_PERSONAL_DETAILS")
// @NamedQuery(name="UserPersonalDetail.findAll",
// query="SELECT u FROM UserPersonalDetail u")
public class UserPersonalDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "USER_ID", unique = true, nullable = false)
	@GeneratedValue(generator = "USERS_USER_ID_GENERATOR")
	@GenericGenerator(name = "USERS_USER_ID_GENERATOR", strategy = "foreign", parameters = @Parameter(name = "property", value = "user"))
	private long userId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name = "ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "USER_ADDRESS_LINE1")
	private String userAddressLine1;

	@Column(name = "USER_ADDRESS_LINE2")
	private String userAddressLine2;

	@Column(name = "USER_CITY")
	private String userCity;

	@Column(name = "USER_COUNTRY")
	private String userCountry;

	@Temporal(TemporalType.DATE)
	@Column(name = "USER_DOB")
	private Date userDob;

	@Column(name = "USER_EMAIL")
	private String userEmail;

	@Column(name = "USER_FIRST_NAME")
	private String userFirstName;

	@Column(name = "IMG_PATH")
	private String userImage;

	@Column(name = "USER_LAST_NAME")
	private String userLastName;

	@Column(name = "USER_MIDDLE_NAME")
	private String userMiddleName;

	@Column(name = "USER_PANNUMBER")
	private String userPannumber;

	@Column(name = "USER_RATIONCARD_NUMBER")
	private String userRationcardNumber;

	@Column(name = "USER_PASSPORT_NUMBER")
	private String userPassportNumber;

	@Column(name = "USER_DRIVINGLICENSE_NUMBER")
	private String userDrivinglicenseNumber;

	@Column(name = "USER_AADHAR_NUMBER")
	private String userAadharNumber;

	@Column(name = "USER_VOTERID_NUMBER")
	private String userVoteridNumber;

	@Column(name = "USER_PHONE_MOBILE")
	private String userPhoneMobile;

	@Column(name = "USER_PHONE_OTHER")
	private String userPhoneOther;

	@Column(name = "USER_STATE")
	private String userState;

	@Column(name = "USER_TITLE")
	private String userTitle;

	@Column(name = "USER_ZIP_CODE")
	private String userZipCode;

	@Column(name = "USER_GENDER")
	private String userGender;

	// bi-directional one-to-one association to User
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;

	public UserPersonalDetail() {
	}

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUserAddressLine1() {
		return this.userAddressLine1;
	}

	public void setUserAddressLine1(String userAddressLine1) {
		this.userAddressLine1 = userAddressLine1;
	}

	public String getUserAddressLine2() {
		return this.userAddressLine2;
	}

	public void setUserAddressLine2(String userAddressLine2) {
		this.userAddressLine2 = userAddressLine2;
	}

	public String getUserCity() {
		return this.userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserCountry() {
		return this.userCountry;
	}

	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}

	public Date getUserDob() {
		return this.userDob;
	}

	public void setUserDob(Date userDob) {
		this.userDob = userDob;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserImage() {
		return this.userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getUserLastName() {
		return this.userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserMiddleName() {
		return this.userMiddleName;
	}

	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}

	public String getUserPannumber() {
		return this.userPannumber;
	}

	public void setUserPannumber(String userPannumber) {
		this.userPannumber = userPannumber;
	}

	public String getUserRationcardNumber() {
		return userRationcardNumber;
	}

	public void setUserRationcardNumber(String userRationcardNumber) {
		this.userRationcardNumber = userRationcardNumber;
	}

	public String getUserPassportNumber() {
		return userPassportNumber;
	}

	public void setUserPassportNumber(String userPassportNumber) {
		this.userPassportNumber = userPassportNumber;
	}

	public String getUserDrivinglicenseNumber() {
		return userDrivinglicenseNumber;
	}

	public void setUserDrivinglicenseNumber(String userDrivinglicenseNumber) {
		this.userDrivinglicenseNumber = userDrivinglicenseNumber;
	}

	public String getUserAadharNumber() {
		return userAadharNumber;
	}

	public void setUserAadharNumber(String userAadharNumber) {
		this.userAadharNumber = userAadharNumber;
	}

	public String getUserVoteridNumber() {
		return userVoteridNumber;
	}

	public void setUserVoteridNumber(String userVoteridNumber) {
		this.userVoteridNumber = userVoteridNumber;
	}

	public String getUserPhoneMobile() {
		return this.userPhoneMobile;
	}

	public void setUserPhoneMobile(String userPhoneMobile) {
		this.userPhoneMobile = userPhoneMobile;
	}

	public String getUserPhoneOther() {
		return this.userPhoneOther;
	}

	public void setUserPhoneOther(String userPhoneOther) {
		this.userPhoneOther = userPhoneOther;
	}

	public String getUserState() {
		return this.userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserTitle() {
		return this.userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public String getUserZipCode() {
		return this.userZipCode;
	}

	public void setUserZipCode(String userZipCode) {
		this.userZipCode = userZipCode;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}