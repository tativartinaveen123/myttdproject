package com.ttd.donor.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.publications.entity.PublicationsBooking;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DOLLAR_BOOKING_DTLS database table.
 * 
 */
@Entity
@Table(name="DOLLAR_BOOKING_DTLS")
@NamedQuery(name="DollarBookingDtl.findAll", query="SELECT d FROM DollarBookingDtl d")
public class DollarBookingDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DOLLAR_ID_SEQ_GENERATOR", sequenceName="DOLLAR_BOOKING_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOLLAR_ID_SEQ_GENERATOR")
	@Column(name="BOOKING_DTLS_ID")
	private long bookingDtlsId;

	@Column(name="BOOKING_QUANTITY")
	private BigDecimal bookingQuantity;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="DOLLAR_CATEGORY_ID")
	private BigDecimal dollarCategoryId;

	@Column(name="DOLLAR_CODE")
	private String dollarCode;

	@Column(name="PRICE_PER_DOLLAR")
	private BigDecimal pricePerDollar;

	@Column(name="DOLLAR_WEIGHT")
	private BigDecimal dollarWeight;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to DollarBooking
	@ManyToOne
	@JoinColumn(name="BOOKING_ID")
	private DollarBooking dollarBooking;
	

	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmountCum;
	

	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmountCum;
	
	@Column(name="SGST_RATE")
	private BigDecimal sgstAmountPerDollar;
	

	@Column(name="CGST_RATE")
	private BigDecimal cgstAmountPerDollar;
	
	@Column(name="ROUNDING_AMOUNT")
	private BigDecimal roundingAmount;
	
	public BigDecimal getSgstAmountPerDollar() {
		return sgstAmountPerDollar;
	}

	public void setSgstAmountPerDollar(BigDecimal sgstAmountPerDollar) {
		this.sgstAmountPerDollar = sgstAmountPerDollar;
	}

	public BigDecimal getCgstAmountPerDollar() {
		return cgstAmountPerDollar;
	}

	public void setCgstAmountPerDollar(BigDecimal cgstAmountPerDollar) {
		this.cgstAmountPerDollar = cgstAmountPerDollar;
	}

	public BigDecimal getRoundingAmount() {
		return roundingAmount;
	}

	public void setRoundingAmount(BigDecimal roundingAmount) {
		this.roundingAmount = roundingAmount;
	}

	public BigDecimal getSgstAmountCum() {
		return sgstAmountCum;
	}

	public void setSgstAmountCum(BigDecimal sgstAmountCum) {
		this.sgstAmountCum = sgstAmountCum;
	}

	public BigDecimal getCgstAmountCum() {
		return cgstAmountCum;
	}

	public void setCgstAmountCum(BigDecimal cgstAmountCum) {
		this.cgstAmountCum = cgstAmountCum;
	}

	public DollarBookingDtl() {
	}

	public long getBookingDtlsId() {
		return this.bookingDtlsId;
	}

	public void setBookingDtlsId(long bookingDtlsId) {
		this.bookingDtlsId = bookingDtlsId;
	}

	public BigDecimal getBookingQuantity() {
		return this.bookingQuantity;
	}

	public void setBookingQuantity(BigDecimal bookingQuantity) {
		this.bookingQuantity = bookingQuantity;
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

	public BigDecimal getDollarCategoryId() {
		return this.dollarCategoryId;
	}

	public void setDollarCategoryId(BigDecimal dollarCategoryId) {
		this.dollarCategoryId = dollarCategoryId;
	}

	public String getDollarCode() {
		return this.dollarCode;
	}

	public void setDollarCode(String dollarCode) {
		this.dollarCode = dollarCode;
	}


	public BigDecimal getPricePerDollar() {
		return pricePerDollar;
	}

	public void setPricePerDollar(BigDecimal pricePerDollar) {
		this.pricePerDollar = pricePerDollar;
	}

	public BigDecimal getDollarWeight() {
		return this.dollarWeight;
	}

	public void setDollarWeight(BigDecimal dollarWeight) {
		this.dollarWeight = dollarWeight;
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

	public DollarBooking getDollarBooking() {
		return this.dollarBooking;
	}

	public void setDollarBooking(DollarBooking dollarBooking) {
		this.dollarBooking = dollarBooking;
	}

}