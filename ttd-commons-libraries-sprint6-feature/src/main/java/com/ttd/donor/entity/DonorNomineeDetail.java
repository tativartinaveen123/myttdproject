package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.edonation.entity.DonationOffering;


/**
 * The persistent class for the DONOR_NOMINEE_DETAILS database table.
 * 
 */
@Entity
@Table(name="DONOR_NOMINEE_DETAILS")
@NamedQuery(name="DonorNomineeDetail.findAll", query="SELECT d FROM DonorNomineeDetail d")
public class DonorNomineeDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DONOR_NOMINEE_DTLS_ID", sequenceName = "DONOR_NOMIN_DETAILS_NOMIN_SEQ", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DONOR_NOMINEE_DTLS_ID")
	@Column(name="DONOR_NOMINEE_DTLS_ID")
	private long donorNomineeDtlsId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name="NOMINEE_DOB")
	private Date nomineeDob;

	@Column(name="NOMINEE_FIRST_NAME")
	private String nomineeFirstName;

	@Column(name="NOMINEE_GENDER")
	private String nomineeGender;
	@Column(name="SRIVANI_FLAG")
	private String srivaniFlag;

	@Column(name="NOMINEE_IMAGE")
	private String nomineeImage;

	@Column(name="NOMINEE_LAST_NAME")
	private String nomineeLastName;

	@Column(name="NOMINEE_MIDDLE_NAME")
	private String nomineeMiddleName;

	@Column(name="NOMINEE_PHONE_MOBILE")
	private String nomineePhoneMobile;

	@Column(name="NOMINEE_RELATIONSHIP")
	private String nomineeRelationship;

	@Column(name="ROW_STATUS", insertable = false )
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;
	@Column(name="AGE")
	private String age;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	

	@Column(name="NOMINEE_ID_PROOF_TYPE")
	private BigDecimal nomineeIdProofType;

	@Column(name="NOMINEE_ID_PROOF_NUMBER")
	private String nomineeIdProofNumber;
	
	@Column(name="COUNTRY_CODE")
	private String countryCode;

	public BigDecimal getNomineeIdProofType() {
		return nomineeIdProofType;
	}

	public void setNomineeIdProofType(BigDecimal nomineeIdProofType) {
		this.nomineeIdProofType = nomineeIdProofType;
	}

	public String getNomineeIdProofNumber() {
		return nomineeIdProofNumber;
	}

	public void setNomineeIdProofNumber(String nomineeIdProofNumber) {
		this.nomineeIdProofNumber = nomineeIdProofNumber;
	}

	//bi-directional many-to-one association to DonationOffering
	@ManyToOne
	@JoinColumn(name="OFFERING_ID")
	private DonationOffering donationOffering;

	public DonorNomineeDetail() {
	}

	public long getDonorNomineeDtlsId() {
		return this.donorNomineeDtlsId;
	}

	public void setDonorNomineeDtlsId(long donorNomineeDtlsId) {
		this.donorNomineeDtlsId = donorNomineeDtlsId;
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

	public Date getNomineeDob() {
		return this.nomineeDob;
	}

	public void setNomineeDob(Date nomineeDob) {
		this.nomineeDob = nomineeDob;
	}

	public String getNomineeFirstName() {
		return this.nomineeFirstName;
	}

	public void setNomineeFirstName(String nomineeFirstName) {
		this.nomineeFirstName = nomineeFirstName;
	}

	public String getNomineeGender() {
		return this.nomineeGender;
	}

	public void setNomineeGender(String nomineeGender) {
		this.nomineeGender = nomineeGender;
	}

	public String getNomineeImage() {
		return this.nomineeImage;
	}

	public void setNomineeImage(String nomineeImage) {
		this.nomineeImage = nomineeImage;
	}

	public String getNomineeLastName() {
		return this.nomineeLastName;
	}

	public void setNomineeLastName(String nomineeLastName) {
		this.nomineeLastName = nomineeLastName;
	}

	public String getNomineeMiddleName() {
		return this.nomineeMiddleName;
	}

	public void setNomineeMiddleName(String nomineeMiddleName) {
		this.nomineeMiddleName = nomineeMiddleName;
	}

	public String getNomineePhoneMobile() {
		return this.nomineePhoneMobile;
	}

	public void setNomineePhoneMobile(String nomineePhoneMobile) {
		this.nomineePhoneMobile = nomineePhoneMobile;
	}

	public String getNomineeRelationship() {
		return this.nomineeRelationship;
	}

	public void setNomineeRelationship(String nomineeRelationship) {
		this.nomineeRelationship = nomineeRelationship;
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

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSrivaniFlag() {
		return srivaniFlag;
	}

	public void setSrivaniFlag(String srivaniFlag) {
		this.srivaniFlag = srivaniFlag;
	}
	
	

}