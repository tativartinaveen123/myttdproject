package com.ttd.common.model;

import java.math.BigDecimal;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class MasterDetails {

	@Pattern(regexp = "(^[A-Za-z ]*$)")
	@Size(max = 20)
	@NotNull
	private String firstName;

	@Pattern(regexp = "(^$|[0-9]{0,15})")
	@Size(min = 0, max = 15)
	@NotNull
	private String mobile;

	@NotNull
	@Size(min = 1, max = 1)
	private String gender;

	@NotNull
	@Min(1)
	@Max(150)
	private BigDecimal age;

	@Pattern(regexp="^([a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*[a-zA-Z0-9]+"
			+"[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*)@[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]"
			+"*(\\.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~.-]*)$")
	@NotNull
	private String emailId;

	@Size(max = 100)
	private String address;

	@NotNull
	private long idProofType;

	@NotNull
	private Long userId;

	private byte[] userImage;

	private long familyPersonId;

	private Boolean isUserExists;
	
	@Pattern(regexp="(^[A-Za-z]{5}[0-9]{4}[A-Za-z]{1}$)")
	@Size(min = 10, max = 10)
	private String userPanNumber;
	
	@Size(max=20)
	private String userRationcardNumber;
	
	@Size(max=10)
	private String userPassportNumber;

	@Size(max=40)
	private String userDrivinglicenseNumber;

	@Size(min=12,max=14)
	private String userAadharNumber;
	
	@Size(min=07, max=20)
	private String userVoterIdNumber;
	
	public String getUserPanNumber() {
		return userPanNumber;
	}

	public void setUserPanNumber(String userPanNumber) {
		this.userPanNumber = userPanNumber;
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

	public String getUserVoterIdNumber() {
		return userVoterIdNumber;
	}

	public void setUserVoterIdNumber(String userVoterIdNumber) {
		this.userVoterIdNumber = userVoterIdNumber;
	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public long getFamilyPersonId() {
		return familyPersonId;
	}

	public void setFamilyPersonId(long familyPersonId) {
		this.familyPersonId = familyPersonId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getIdProofType() {
		return idProofType;
	}

	public void setIdProofType(long idProofType) {
		this.idProofType = idProofType;
	}


	public Boolean getIsUserExists() {
		return isUserExists;
	}

	public void setIsUserExists(Boolean isUserExists) {
		this.isUserExists = isUserExists;
	}

	public BigDecimal getAge() {
		return age;
	}

	public void setAge(BigDecimal age) {
		this.age = age;
	}

	public byte[] getUserImage() {
		return userImage;
	}

	public void setUserImage(byte[] userImage) {
		this.userImage = userImage;
	}

}
