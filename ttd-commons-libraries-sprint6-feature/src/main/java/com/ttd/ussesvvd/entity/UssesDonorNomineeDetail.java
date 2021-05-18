package com.ttd.ussesvvd.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USSES_DONOR_NOMINEE_DETAILS database table.
 * 
 */
@Entity
@Table(name="USSES_DONOR_NOMINEE_DETAILS")
@NamedQuery(name="UssesDonorNomineeDetail.findAll", query="SELECT u FROM UssesDonorNomineeDetail u")
public class UssesDonorNomineeDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DONOR_NOMINEE_DTLS_ID", sequenceName = "USSES_DONOR_NOMINEE_DTLSID_SEQ", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DONOR_NOMINEE_DTLS_ID")
	@Column(name="DONOR_NOMINEE_DTLS_ID")
	private long donorNomineeDtlsId;

	@Column(name="COUNTRY_CODE")
	private String countryCode;

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

	@Column(name="NOMINEE_ID_PROOF_NUMBER")
	private String nomineeIdProofNumber;

	@Column(name="NOMINEE_ID_PROOF_TYPE")
	private BigDecimal nomineeIdProofType;

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

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="ACTUAL_FLAG")
	private String actualFlag;

	//bi-directional many-to-one association to UssesVvdOffering
	@ManyToOne
	@JoinColumn(name="OFFERING_ID")
	private UssesVvdOffering ussesVvdOffering;

	public UssesDonorNomineeDetail() {
	}

	public long getDonorNomineeDtlsId() {
		return this.donorNomineeDtlsId;
	}

	public void setDonorNomineeDtlsId(long donorNomineeDtlsId) {
		this.donorNomineeDtlsId = donorNomineeDtlsId;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public String getNomineeIdProofNumber() {
		return this.nomineeIdProofNumber;
	}

	public void setNomineeIdProofNumber(String nomineeIdProofNumber) {
		this.nomineeIdProofNumber = nomineeIdProofNumber;
	}

	public BigDecimal getNomineeIdProofType() {
		return this.nomineeIdProofType;
	}

	public void setNomineeIdProofType(BigDecimal nomineeIdProofType) {
		this.nomineeIdProofType = nomineeIdProofType;
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

	public UssesVvdOffering getUssesVvdOffering() {
		return this.ussesVvdOffering;
	}

	public void setUssesVvdOffering(UssesVvdOffering ussesVvdOffering) {
		this.ussesVvdOffering = ussesVvdOffering;
	}

	public String getActualFlag() {
		return actualFlag;
	}

	public void setActualFlag(String actualFlag) {
		this.actualFlag = actualFlag;
	}

}