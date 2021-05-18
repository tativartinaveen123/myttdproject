package com.ttd.publications.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PUBLICATIONS_BOOKING_DTLS database table.
 * 
 */
@Entity
@Table(name="PUBLICATIONS_BOOKING_DTLS")
@NamedQuery(name="PublicationsBookingDtl.findAll", query="SELECT p FROM PublicationsBookingDtl p")
public class PublicationsBookingDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PUBLICATION_ID_SEQ_GENERATOR", sequenceName="PUBLICATION_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PUBLICATION_ID_SEQ_GENERATOR")
	@Column(name="PUBLICATION_ID")
	private long publicationId;

	@Column(name="BOOKING_AMOUNT")
	private BigDecimal bookingAmount;

	@Column(name="BOOKING_QUANTITY")
	private BigDecimal bookingQuantity;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME" , insertable = false , updatable = false)
	private Date createdTime;

	@Column(name="LANGUAGE_ID")
	private BigDecimal languageId;

	@Column(name="PACKING_PRICE")
	private BigDecimal packingPrice;

	@Column(name="ROW_STATUS" , insertable = false , updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SHIPPING_PRICE")
	private BigDecimal shippingPrice;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to PublicationsBooking
	@ManyToOne
	@JoinColumn(name="BOOKING_ID")
	private PublicationsBooking publicationsBooking;

	//bi-directional many-to-one association to PublicationsCategoryMaster
	@ManyToOne
	@JoinColumn(name="PCM_ID")
	private PublicationsCategoryMaster publicationsCategoryMaster;

	//bi-directional many-to-one association to PublicationsSubcateMaster
	@ManyToOne
	@JoinColumn(name="PSCM_ID")
	private PublicationsSubcateMaster publicationsSubcateMaster;
	
	
	@Column(name="POSTAL_SEQ_NUMBER")
	private String postalSequenceNumber;
	
	@Column(name="BASE_PRICE")
	private BigDecimal basePrice; //woGST
	
	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmount;
	
	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmount;
	
	@Column(name="IGST_AMOUNT")
	private BigDecimal igstAmount;
	
	@Column(name="IGST_RATE")
	private BigDecimal igstRate;
	
	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;
	
	@Column(name="SGST_RATE")
	private BigDecimal sgstRate;
	
	@Column(name="BASE_PRICE_PER_UNIT")
	private BigDecimal basePerUnit;

	
	@Column(name="PKG_SHIP_IGST_AMOUNT")
	private BigDecimal pkgShIgst;
	

	@Column(name="PKG_SHIP_CGST_AMOUNT")
	private BigDecimal pkgShCgst;
	

	@Column(name="PKG_SHIP_SGST_AMOUNT")
	private BigDecimal pkgShSgst;
	
	@Column(name="PKG_SHIP_SGST_RATE")
	private BigDecimal pkgShSgstRate;
	

	@Column(name="PKG_SHIP_CGST_RATE")
	private BigDecimal pkgShCgstRate;
	

	@Column(name="PKG_SHIP_IGST_RATE")
	private BigDecimal pkgShIgstRate;


	public BigDecimal getPkgShSgstRate() {
		return pkgShSgstRate;
	}

	public void setPkgShSgstRate(BigDecimal pkgShSgstRate) {
		this.pkgShSgstRate = pkgShSgstRate;
	}

	public BigDecimal getPkgShCgstRate() {
		return pkgShCgstRate;
	}

	public void setPkgShCgstRate(BigDecimal pkgShCgstRate) {
		this.pkgShCgstRate = pkgShCgstRate;
	}

	public BigDecimal getPkgShIgstRate() {
		return pkgShIgstRate;
	}

	public void setPkgShIgstRate(BigDecimal pkgShIgstRate) {
		this.pkgShIgstRate = pkgShIgstRate;
	}

	public BigDecimal getPkgShIgst() {
		return pkgShIgst;
	}

	public void setPkgShIgst(BigDecimal pkgShIgst) {
		this.pkgShIgst = pkgShIgst;
	}

	public BigDecimal getPkgShCgst() {
		return pkgShCgst;
	}

	public void setPkgShCgst(BigDecimal pkgShCgst) {
		this.pkgShCgst = pkgShCgst;
	}

	public BigDecimal getPkgShSgst() {
		return pkgShSgst;
	}

	public void setPkgShSgst(BigDecimal pkgShSgst) {
		this.pkgShSgst = pkgShSgst;
	}

	public BigDecimal getBasePerUnit() {
		return basePerUnit;
	}

	public void setBasePerUnit(BigDecimal basePerUnit) {
		this.basePerUnit = basePerUnit;
	}

	public BigDecimal getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(BigDecimal basePrice) {
		this.basePrice = basePrice;
	}

	public BigDecimal getSgstAmount() {
		return sgstAmount;
	}

	public void setSgstAmount(BigDecimal sgstAmount) {
		this.sgstAmount = sgstAmount;
	}

	public BigDecimal getCgstAmount() {
		return cgstAmount;
	}

	public void setCgstAmount(BigDecimal cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	public BigDecimal getIgstAmount() {
		return igstAmount;
	}

	public void setIgstAmount(BigDecimal igstAmount) {
		this.igstAmount = igstAmount;
	}

	public BigDecimal getIgstRate() {
		return igstRate;
	}

	public void setIgstRate(BigDecimal igstRate) {
		this.igstRate = igstRate;
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

	public PublicationsBookingDtl() {
	}

	public long getPublicationId() {
		return this.publicationId;
	}

	public void setPublicationId(long publicationId) {
		this.publicationId = publicationId;
	}

	public BigDecimal getBookingAmount() {
		return this.bookingAmount;
	}

	public void setBookingAmount(BigDecimal bookingAmount) {
		this.bookingAmount = bookingAmount;
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

	public BigDecimal getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(BigDecimal languageId) {
		this.languageId = languageId;
	}

	public BigDecimal getPackingPrice() {
		return this.packingPrice;
	}

	public void setPackingPrice(BigDecimal packingPrice) {
		this.packingPrice = packingPrice;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getShippingPrice() {
		return this.shippingPrice;
	}

	public void setShippingPrice(BigDecimal shippingPrice) {
		this.shippingPrice = shippingPrice;
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

	public PublicationsBooking getPublicationsBooking() {
		return this.publicationsBooking;
	}

	public void setPublicationsBooking(PublicationsBooking publicationsBooking) {
		this.publicationsBooking = publicationsBooking;
	}

	public PublicationsCategoryMaster getPublicationsCategoryMaster() {
		return this.publicationsCategoryMaster;
	}

	public void setPublicationsCategoryMaster(PublicationsCategoryMaster publicationsCategoryMaster) {
		this.publicationsCategoryMaster = publicationsCategoryMaster;
	}

	public PublicationsSubcateMaster getPublicationsSubcateMaster() {
		return this.publicationsSubcateMaster;
	}

	public void setPublicationsSubcateMaster(PublicationsSubcateMaster publicationsSubcateMaster) {
		this.publicationsSubcateMaster = publicationsSubcateMaster;
	}

	public String getPostalSequenceNumber() {
		return postalSequenceNumber;
	}

	public void setPostalSequenceNumber(String postalSequenceNumber) {
		this.postalSequenceNumber = postalSequenceNumber;
	}
	
	

}