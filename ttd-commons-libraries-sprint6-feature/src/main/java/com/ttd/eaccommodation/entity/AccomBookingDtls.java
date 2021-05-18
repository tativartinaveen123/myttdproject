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
@Table(name="ACCOM_BOOKING_DTLS")
@NamedQuery(name="AccomBookingDtls.findAll", query="SELECT a FROM AccomBookingDtls a")
public class AccomBookingDtls implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "ACCOM_DTLS_ID_SEQ_GENERATOR", sequenceName = "ACCOM_DTLS_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOM_DTLS_ID_SEQ_GENERATOR")
	@Column(name="ACCOM_DTLS_ID")
	private long acommDtlsId;
	
	@Column(name="ROOM_RENT")
	private BigDecimal roomRent;
	
	@Column(name="NO_OF_DAYS")
	private BigDecimal noOfDays;
	
	
	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmount;
	
	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmount;
	
	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;
	
	@Column(name="SGST_RATE")
	private BigDecimal sgstRate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false , updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	
	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to AccomBooking
	@ManyToOne
	@JoinColumn(name="ACCOM_BOOKING_ID")
	private AccomBooking accomBooking;

	public AccomBookingDtls() {
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

	

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
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

	

	public AccomBooking getAccomBooking() {
		return this.accomBooking;
	}

	public void setAccomBooking(AccomBooking accomBooking) {
		this.accomBooking = accomBooking;
	}



	public long getAcommDtlsId() {
		return acommDtlsId;
	}



	public void setAcommDtlsId(long acommDtlsId) {
		this.acommDtlsId = acommDtlsId;
	}



	public BigDecimal getRoomRent() {
		return roomRent;
	}



	public void setRoomRent(BigDecimal roomRent) {
		this.roomRent = roomRent;
	}



	public BigDecimal getNoOfDays() {
		return noOfDays;
	}



	public void setNoOfDays(BigDecimal noOfDays) {
		this.noOfDays = noOfDays;
	}



	public BigDecimal getCgstAmount() {
		return cgstAmount;
	}



	public void setCgstAmount(BigDecimal cgstAmount) {
		this.cgstAmount = cgstAmount;
	}



	public BigDecimal getSgstAmount() {
		return sgstAmount;
	}



	public void setSgstAmount(BigDecimal sgstAmount) {
		this.sgstAmount = sgstAmount;
	}



	public BigDecimal getCgstRate() {
		return cgstRate;
	}



	public void setCgstRate(BigDecimal cgstRate) {
		this.cgstRate = cgstRate;
	}



	public BigDecimal getSgstRate() {
		return sgstRate;
	}



	public void setSgstRate(BigDecimal sgstRate) {
		this.sgstRate = sgstRate;
	}

	


	
	

}