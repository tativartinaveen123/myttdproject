package com.ttd.edonation.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the DONOR_JOINT_USER database table.
 * 
 */
@Entity
@Table(name="DONOR_JOINT_USER")
@NamedQuery(name="DonorJointUser.findAll", query="SELECT d FROM DonorJointUser d")
public class DonorJointUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DONOR_JOINT_USER_USERID_GENERATOR", sequenceName="DONOR_JOINT_USER_USER_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DONOR_JOINT_USER_USERID_GENERATOR")
	@Column(name="USER_ID")
	private long userId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_AADHAR_ID")
	private String userAadharId;

	@Column(name="USER_ADDRESS_LINE1")
	private String userAddressLine1;

	@Column(name="USER_ADDRESS_LINE2")
	private String userAddressLine2;

	@Column(name="USER_CITY")
	private String userCity;

	@Column(name="USER_COUNTRY")
	private String userCountry;

	@Temporal(TemporalType.DATE)
	@Column(name="USER_DOB")
	private Date userDob;

	@Column(name="USER_FIRST_NAME")
	private String userFirstName;

	@Column(name="USER_GENDER")
	private String userGender;

	@Column(name="USER_LAST_NAME")
	private String userLastName;

	@Column(name="USER_MIDDLE_NAME")
	private String userMiddleName;

	@Column(name="USER_PAN_ID")
	private String userPanId;

	@Column(name="USER_PHONE_MOBILE")
	private String userPhoneMobile;

	@Column(name="USER_PHONE_OTHER")
	private String userPhoneOther;

	@Column(name="USER_STATE")
	private String userState;

	@Column(name="USER_TITLE")
	private String userTitle;

	@Column(name="USER_ZIP_CODE")
	private String userZipCode;
	
	@Column(name="USER_EMAIL_ADDRESS")
	private String userEmailAddress;
	
	@Column(name="IMG_PATH")
	private String userImage;

	//bi-directional many-to-one association to DonationOffering
	@OneToMany(mappedBy="donorJointUser",cascade = CascadeType.ALL)
	private List<DonationOffering> donationOfferings;

	//bi-directional many-to-one association to DonationOffering
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="OFFERING_ID")
	private DonationOffering donationOffering;
	
	
	@Column(name="COUNTRY_CODE")
	private String countryCode;
	


	public DonorJointUser() {
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

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUserAadharId() {
		return this.userAadharId;
	}

	public void setUserAadharId(String userAadharId) {
		this.userAadharId = userAadharId;
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

	public String getUserFirstName() {
		return this.userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserGender() {
		return this.userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
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

	public String getUserPanId() {
		return this.userPanId;
	}

	public void setUserPanId(String userPanId) {
		this.userPanId = userPanId;
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

	public List<DonationOffering> getDonationOfferings() {
		return this.donationOfferings;
	}

	public void setDonationOfferings(List<DonationOffering> donationOfferings) {
		this.donationOfferings = donationOfferings;
	}

	public DonationOffering addDonationOffering(DonationOffering donationOffering) {
		getDonationOfferings().add(donationOffering);
		donationOffering.setDonorJointUser(this);

		return donationOffering;
	}

	public DonationOffering removeDonationOffering(DonationOffering donationOffering) {
		getDonationOfferings().remove(donationOffering);
		donationOffering.setDonorJointUser(null);

		return donationOffering;
	}

	public DonationOffering getDonationOffering() {
		return this.donationOffering;
	}

	public void setDonationOffering(DonationOffering donationOffering) {
		this.donationOffering = donationOffering;
	}

	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	

}