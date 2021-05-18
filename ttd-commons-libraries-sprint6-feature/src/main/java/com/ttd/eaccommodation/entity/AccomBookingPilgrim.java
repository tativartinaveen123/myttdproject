package com.ttd.eaccommodation.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ACCOM_BOOKING_PILGRIM database table.
 * 
 */
@Entity
@Table(name="ACCOM_BOOKING_PILGRIM")
@NamedQuery(name="AccomBookingPilgrim.findAll", query="SELECT a FROM AccomBookingPilgrim a")
public class AccomBookingPilgrim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "BOOKING_PILGRIM_ACCOM_PID_SEQ_GENERATOR", sequenceName = "BOOKING_PILGRIM_ACCOM_PID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOKING_PILGRIM_ACCOM_PID_SEQ_GENERATOR")
	@Column(name="PILGRIM_ID")
	private long pilgrimId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="IMAGE_ID")
	private BigDecimal imageId;

	@Column(name="PILGRIM_AGE")
	private BigDecimal pilgrimAge;

	@Column(name="PILGRIM_GENDER")
	private String pilgrimGender;

	@Column(name="PILIGRIM_ID_PROOF_NUMBER")
	private String piligrimIdProofNumber;

	@Column(name="PILIGRIM_ID_PROOF_TYPE")
	private BigDecimal piligrimIdProofType;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SERVICE_TYPE_ID")
	private BigDecimal serviceTypeId;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_ADDR1")
	private String userAddr1;

	@Column(name="USER_EMAIL")
	private String userEmail;

	@Column(name="USER_IMAGE")
	private String userImage;

	@Column(name="USER_MOBILE")
	private String userMobile;

	@Column(name="USER_NAME")
	private String userName;

	@Column(name="USER_TYPE")
	private String userType;
	
	@Column(name="IMAGE_NAME")
	private String imageName;
	
	//bi-directional many-to-one association to AccomBooking
	@ManyToOne
	@JoinColumn(name="BOOKING_ID")
	private AccomBooking accomBooking;

	public AccomBookingPilgrim() {
	}

	public long getPilgrimId() {
		return this.pilgrimId;
	}

	public void setPilgrimId(long pilgrimId) {
		this.pilgrimId = pilgrimId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getImageId() {
		return this.imageId;
	}

	public void setImageId(BigDecimal imageId) {
		this.imageId = imageId;
	}

	public BigDecimal getPilgrimAge() {
		return this.pilgrimAge;
	}

	public void setPilgrimAge(BigDecimal pilgrimAge) {
		this.pilgrimAge = pilgrimAge;
	}

	public String getPilgrimGender() {
		return this.pilgrimGender;
	}

	public void setPilgrimGender(String pilgrimGender) {
		this.pilgrimGender = pilgrimGender;
	}

	public String getPiligrimIdProofNumber() {
		return this.piligrimIdProofNumber;
	}

	public void setPiligrimIdProofNumber(String piligrimIdProofNumber) {
		this.piligrimIdProofNumber = piligrimIdProofNumber;
	}

	public BigDecimal getPiligrimIdProofType() {
		return this.piligrimIdProofType;
	}

	public void setPiligrimIdProofType(BigDecimal piligrimIdProofType) {
		this.piligrimIdProofType = piligrimIdProofType;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getServiceTypeId() {
		return this.serviceTypeId;
	}

	public void setServiceTypeId(BigDecimal serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getUserAddr1() {
		return this.userAddr1;
	}

	public void setUserAddr1(String userAddr1) {
		this.userAddr1 = userAddr1;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserImage() {
		return this.userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getUserMobile() {
		return this.userMobile;
	}

	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public AccomBooking getAccomBooking() {
		return this.accomBooking;
	}

	public void setAccomBooking(AccomBooking accomBooking) {
		this.accomBooking = accomBooking;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}


	
	

}