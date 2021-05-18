package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.edonation.entity.DonationOffering;


/**
 * The persistent class for the DONOR_JOINT_DETAILS database table.
 * 
 */
@Entity
@Table(name="DONOR_JOINT_DETAILS")
@NamedQuery(name="DonorJointDetail.findAll", query="SELECT d FROM DonorJointDetail d")
public class DonorJointDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DONOR_JOINT_DETAILS_ID")
	private long donorJointDetailsId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="JOINT_FP_IMAGE")
	private String jointFpImage;

	@Column(name="JOINT_PERSON_AADHAR")
	private String jointPersonAadhar;

	@Column(name="JOINT_PERSON_ADDRESS_LINE1")
	private String jointPersonAddressLine1;

	@Column(name="JOINT_PERSON_ADDRESS_LINE2")
	private String jointPersonAddressLine2;

	@Column(name="JOINT_PERSON_CITY")
	private String jointPersonCity;

	@Column(name="JOINT_PERSON_COUNTRY")
	private String jointPersonCountry;

	@Temporal(TemporalType.DATE)
	@Column(name="JOINT_PERSON_DOB")
	private Date jointPersonDob;

	@Column(name="JOINT_PERSON_EMAIL")
	private String jointPersonEmail;

	@Column(name="JOINT_PERSON_FIRST_NAME")
	private String jointPersonFirstName;

	@Column(name="JOINT_PERSON_GENDER")
	private String jointPersonGender;

	@Column(name="JOINT_PERSON_IMAGE")
	private String jointPersonImage;

	@Column(name="JOINT_PERSON_LAST_NAME")
	private String jointPersonLastName;

	@Column(name="JOINT_PERSON_MIDDLE_NAME")
	private String jointPersonMiddleName;

	@Column(name="JOINT_PERSON_PAN")
	private String jointPersonPan;

	@Column(name="JOINT_PERSON_PHONE_MOBILE")
	private String jointPersonPhoneMobile;

	@Column(name="JOINT_PERSON_STATE")
	private String jointPersonState;

	@Column(name="JOINT_PERSON_ZIP_CODE")
	private String jointPersonZipCode;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to DonationOffering
	@ManyToOne
	@JoinColumn(name="OFFERING_ID")
	private DonationOffering donationOffering;

	public DonorJointDetail() {
	}

	public long getDonorJointDetailsId() {
		return this.donorJointDetailsId;
	}

	public void setDonorJointDetailsId(long donorJointDetailsId) {
		this.donorJointDetailsId = donorJointDetailsId;
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

	public String getJointFpImage() {
		return this.jointFpImage;
	}

	public void setJointFpImage(String jointFpImage) {
		this.jointFpImage = jointFpImage;
	}

	public String getJointPersonAadhar() {
		return this.jointPersonAadhar;
	}

	public void setJointPersonAadhar(String jointPersonAadhar) {
		this.jointPersonAadhar = jointPersonAadhar;
	}

	public String getJointPersonAddressLine1() {
		return this.jointPersonAddressLine1;
	}

	public void setJointPersonAddressLine1(String jointPersonAddressLine1) {
		this.jointPersonAddressLine1 = jointPersonAddressLine1;
	}

	public String getJointPersonAddressLine2() {
		return this.jointPersonAddressLine2;
	}

	public void setJointPersonAddressLine2(String jointPersonAddressLine2) {
		this.jointPersonAddressLine2 = jointPersonAddressLine2;
	}

	public String getJointPersonCity() {
		return this.jointPersonCity;
	}

	public void setJointPersonCity(String jointPersonCity) {
		this.jointPersonCity = jointPersonCity;
	}

	public String getJointPersonCountry() {
		return this.jointPersonCountry;
	}

	public void setJointPersonCountry(String jointPersonCountry) {
		this.jointPersonCountry = jointPersonCountry;
	}

	public Date getJointPersonDob() {
		return this.jointPersonDob;
	}

	public void setJointPersonDob(Date jointPersonDob) {
		this.jointPersonDob = jointPersonDob;
	}

	public String getJointPersonEmail() {
		return this.jointPersonEmail;
	}

	public void setJointPersonEmail(String jointPersonEmail) {
		this.jointPersonEmail = jointPersonEmail;
	}

	public String getJointPersonFirstName() {
		return this.jointPersonFirstName;
	}

	public void setJointPersonFirstName(String jointPersonFirstName) {
		this.jointPersonFirstName = jointPersonFirstName;
	}

	public String getJointPersonGender() {
		return this.jointPersonGender;
	}

	public void setJointPersonGender(String jointPersonGender) {
		this.jointPersonGender = jointPersonGender;
	}

	public String getJointPersonImage() {
		return this.jointPersonImage;
	}

	public void setJointPersonImage(String jointPersonImage) {
		this.jointPersonImage = jointPersonImage;
	}

	public String getJointPersonLastName() {
		return this.jointPersonLastName;
	}

	public void setJointPersonLastName(String jointPersonLastName) {
		this.jointPersonLastName = jointPersonLastName;
	}

	public String getJointPersonMiddleName() {
		return this.jointPersonMiddleName;
	}

	public void setJointPersonMiddleName(String jointPersonMiddleName) {
		this.jointPersonMiddleName = jointPersonMiddleName;
	}

	public String getJointPersonPan() {
		return this.jointPersonPan;
	}

	public void setJointPersonPan(String jointPersonPan) {
		this.jointPersonPan = jointPersonPan;
	}

	public String getJointPersonPhoneMobile() {
		return this.jointPersonPhoneMobile;
	}

	public void setJointPersonPhoneMobile(String jointPersonPhoneMobile) {
		this.jointPersonPhoneMobile = jointPersonPhoneMobile;
	}

	public String getJointPersonState() {
		return this.jointPersonState;
	}

	public void setJointPersonState(String jointPersonState) {
		this.jointPersonState = jointPersonState;
	}

	public String getJointPersonZipCode() {
		return this.jointPersonZipCode;
	}

	public void setJointPersonZipCode(String jointPersonZipCode) {
		this.jointPersonZipCode = jointPersonZipCode;
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

	public DonationOffering getDonationOffering() {
		return this.donationOffering;
	}

	public void setDonationOffering(DonationOffering donationOffering) {
		this.donationOffering = donationOffering;
	}

}