package com.ttd.ussesvvd.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USSESS_DONOR_BOOKING_PILGRIM database table.
 * 
 */
@Entity
@Table(name="USSESS_DONOR_BOOKING_PILGRIM")
@NamedQuery(name="UssessDonorBookingPilgrim.findAll", query="SELECT u FROM UssessDonorBookingPilgrim u")
public class UssessDonorBookingPilgrim implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USSES_DONOR_BOOKING_ID_SEQ_GENERATOR", sequenceName="USSES_DONOR_BOOKING_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USSES_DONOR_BOOKING_ID_SEQ_GENERATOR")
	@Column(name="DONOR_BOOKING_ID")
	private long donorBookingId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="PILGRIM_AGE")
	private BigDecimal pilgrimAge;

	@Column(name="PILGRIM_GENDER")
	private String pilgrimGender;

	@Column(name="PILGRIM_ID")
	private BigDecimal pilgrimId;

	@Column(name="PILGRIM_MOBILE")
	private String pilgrimMobile;

	@Column(name="PILGRIM_NAME")
	private String pilgrimName;

	@Column(name="PILIGRIM_ID_PROOF_NUMBER")
	private String piligrimIdProofNumber;

	@Column(name="PILIGRIM_ID_PROOF_TYPE")
	private BigDecimal piligrimIdProofType;

	@Column(name="PILIGRIM_IMAGE")
	private String piligrimImage;

	@Column(name="PILIGRIM_TYPE")
	private String piligrimType;

	@Column(name="PRIV_REDEEM_ID")
	private String privRedeemId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SERVICE_TYPE_ID")
	private BigDecimal serviceTypeId;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public UssessDonorBookingPilgrim() {
	}

	public long getDonorBookingId() {
		return this.donorBookingId;
	}

	public void setDonorBookingId(long donorBookingId) {
		this.donorBookingId = donorBookingId;
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

	public BigDecimal getPilgrimId() {
		return this.pilgrimId;
	}

	public void setPilgrimId(BigDecimal pilgrimId) {
		this.pilgrimId = pilgrimId;
	}

	public String getPilgrimMobile() {
		return this.pilgrimMobile;
	}

	public void setPilgrimMobile(String pilgrimMobile) {
		this.pilgrimMobile = pilgrimMobile;
	}

	public String getPilgrimName() {
		return this.pilgrimName;
	}

	public void setPilgrimName(String pilgrimName) {
		this.pilgrimName = pilgrimName;
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

	public String getPiligrimImage() {
		return this.piligrimImage;
	}

	public void setPiligrimImage(String piligrimImage) {
		this.piligrimImage = piligrimImage;
	}

	public String getPiligrimType() {
		return this.piligrimType;
	}

	public void setPiligrimType(String piligrimType) {
		this.piligrimType = piligrimType;
	}

	public String getPrivRedeemId() {
		return this.privRedeemId;
	}

	public void setPrivRedeemId(String privRedeemId) {
		this.privRedeemId = privRedeemId;
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

}