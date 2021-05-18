package com.ttd.publications.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PUBLICATIONS_PACK_CHARG_MASTER database table.
 * 
 */
@Entity
@Table(name="PUBLICATIONS_PACK_CHARG_MASTER")
@NamedQuery(name="PublicationsPackChargMaster.findAll", query="SELECT p FROM PublicationsPackChargMaster p")
public class PublicationsPackChargMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PPC_ID")
	private long ppcId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="PACKING_PRICE")
	private BigDecimal packingPrice;

	@Column(name="PACKING_QUANTITY")
	private BigDecimal packingQuantity;

	@Column(name="PPC_DESCRIPTION")
	private String ppcDescription;

	@Column(name="PPC_NAME")
	private String ppcName;

	@Column(name="PSCM_ID")
	private BigDecimal pscmId;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="IS_INDIA")
	private String isIndia;

	public PublicationsPackChargMaster() {
	}

	public long getPpcId() {
		return this.ppcId;
	}

	public void setPpcId(long ppcId) {
		this.ppcId = ppcId;
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

	public BigDecimal getPackingPrice() {
		return this.packingPrice;
	}

	public void setPackingPrice(BigDecimal packingPrice) {
		this.packingPrice = packingPrice;
	}

	public BigDecimal getPackingQuantity() {
		return this.packingQuantity;
	}

	public void setPackingQuantity(BigDecimal packingQuantity) {
		this.packingQuantity = packingQuantity;
	}

	public String getPpcDescription() {
		return this.ppcDescription;
	}

	public void setPpcDescription(String ppcDescription) {
		this.ppcDescription = ppcDescription;
	}

	public String getPpcName() {
		return this.ppcName;
	}

	public void setPpcName(String ppcName) {
		this.ppcName = ppcName;
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

	public String getIsIndia() {
		return isIndia;
	}

	public void setIsIndia(String isIndia) {
		this.isIndia = isIndia;
	}

}