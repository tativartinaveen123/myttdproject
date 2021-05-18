package com.ttd.publications.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PUBLICATIONS_SHIPCHAR_MASTER database table.
 * 
 */
@Entity
@Table(name="PUBLICATIONS_SHIPCHAR_MASTER")
@NamedQuery(name="PublicationsShipcharMaster.findAll", query="SELECT p FROM PublicationsShipcharMaster p")
public class PublicationsShipcharMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PSPM_ID")
	private long pspmId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="POSTAL_TARIFF")
	private BigDecimal postalTariff;

	@Column(name="PSCM_ID")
	private BigDecimal pscmId;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="SHIPPING_PRICE")
	private BigDecimal shippingPrice;

	@Column(name="SHIPPING_QUANTITY")
	private BigDecimal shippingQuantity;

	@Column(name="STATE_ID")
	private BigDecimal stateId;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public PublicationsShipcharMaster() {
	}

	public long getPspmId() {
		return this.pspmId;
	}

	public void setPspmId(long pspmId) {
		this.pspmId = pspmId;
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

	public BigDecimal getPostalTariff() {
		return this.postalTariff;
	}

	public void setPostalTariff(BigDecimal postalTariff) {
		this.postalTariff = postalTariff;
	}

	public BigDecimal getPscmId() {
		return this.pscmId;
	}

	public void setPscmId(BigDecimal pscmId) {
		this.pscmId = pscmId;
	}

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
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

	public BigDecimal getShippingQuantity() {
		return this.shippingQuantity;
	}

	public void setShippingQuantity(BigDecimal shippingQuantity) {
		this.shippingQuantity = shippingQuantity;
	}

	public BigDecimal getStateId() {
		return this.stateId;
	}

	public void setStateId(BigDecimal stateId) {
		this.stateId = stateId;
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