package com.ttd.common.entity;

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
 * The persistent class for the USER_FEEDBACK database table.
 * 
 */
@Entity
@Table(name = "DONOR_SELF_SERVICE")
@NamedQuery(name = "DonorSelfService.findAll", query = "SELECT d FROM DonorSelfService d")
public class DonorSelfService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DONOR_SELF_SERVICE_SEQ_GENERATOR", sequenceName = "DONOR_SELF_SERVICE_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DONOR_SELF_SERVICE_SEQ_GENERATOR")
	@Column(name = "DONOR_SELF_SERVICE_ID")
	private long donorSelfServiceId;

	@Column(name = "DONOR_NAME")
	private String donorName;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "DONOR_ID")
	private String donorId;

	@Column(name = "TRUST_NAME")
	private String trustName;

	@Column(name = "DONOR_EMAIL")
	private String donorEmail;

	@Column(name = "DONOR_MOBILE_NO")
	private String donorMobileNo;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "DONOR_PANCARD_NO")
	private String donorPancardNo;

	@Column(name = "DONOR_AADHAR_CARD")
	private String donorAadharCard;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name = "REMARKS")
	private String remarks;

	@Column(name = "TRUST_ID")
	private long trustId;

	@Column(name = "ENTITY_REG_NO")
	private String entityRegNo;

	@Column(name = "ROW_STATUS")
	private long rowStatus;

	@Column(name = "DONOR_PASSBOOK_NO")
	private String donorPassbookNo;

	@Column(name = "DONOR_VOTERID_NUMBER")
	private String donorVoteridNumber;

	@Column(name = "DONOR_DRIVINGLICENSE_NUMBER")
	private String donorDrivinglicenseNumber;

	@Column(name = "DONOR_PASSPORT_NUMBER")
	private String donorPassportNumber;
	
	@Column(name="COUNTRY_CODE")
	private String countryCode;

	public String getDonorPassbookNo() {
		return donorPassbookNo;
	}

	public void setDonorPassbookNo(String donorPassbookNo) {
		this.donorPassbookNo = donorPassbookNo;
	}

	public DonorSelfService() {
	}

	public long getDonorSelfServiceId() {
		return donorSelfServiceId;
	}

	public void setDonorSelfServiceId(long donorSelfServiceId) {
		this.donorSelfServiceId = donorSelfServiceId;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDonorId() {
		return donorId;
	}

	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}

	public String getTrustName() {
		return trustName;
	}

	public void setTrustName(String trustName) {
		this.trustName = trustName;
	}

	public String getDonorEmail() {
		return donorEmail;
	}

	public void setDonorEmail(String donorEmail) {
		this.donorEmail = donorEmail;
	}

	public String getDonorMobileNo() {
		return donorMobileNo;
	}

	public void setDonorMobileNo(String donorMobileNo) {
		this.donorMobileNo = donorMobileNo;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getDonorPancardNo() {
		return donorPancardNo;
	}

	public void setDonorPancardNo(String donorPancardNo) {
		this.donorPancardNo = donorPancardNo;
	}

	public String getDonorAadharCard() {
		return donorAadharCard;
	}

	public void setDonorAadharCard(String donorAadharCard) {
		this.donorAadharCard = donorAadharCard;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public long getTrustId() {
		return trustId;
	}

	public void setTrustId(long trustId) {
		this.trustId = trustId;
	}

	public String getEntityRegNo() {
		return entityRegNo;
	}

	public void setEntityRegNo(String entityRegNo) {
		this.entityRegNo = entityRegNo;
	}

	public long getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(long rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getDonorVoteridNumber() {
		return donorVoteridNumber;
	}

	public void setDonorVoteridNumber(String donorVoteridNumber) {
		this.donorVoteridNumber = donorVoteridNumber;
	}

	public String getDonorDrivinglicenseNumber() {
		return donorDrivinglicenseNumber;
	}

	public void setDonorDrivinglicenseNumber(String donorDrivinglicenseNumber) {
		this.donorDrivinglicenseNumber = donorDrivinglicenseNumber;
	}

	public String getDonorPassportNumber() {
		return donorPassportNumber;
	}

	public void setDonorPassportNumber(String donorPassportNumber) {
		this.donorPassportNumber = donorPassportNumber;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}