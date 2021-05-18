package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the DONATION_PRODUCT_MASTER database table.
 * 
 */
@Entity
@Table(name="DONATION_PRODUCT_MASTER")
@NamedQuery(name="DonationProductMaster.findAll", query="SELECT d FROM DonationProductMaster d")
public class DonationProductMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DONATION_PRODUCT_ID")
	private long donationProductId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="PRODUCT_DESCRIPTION")
	private String productDescription;

	@Column(name="PRODUCT_NAME")
	private String productName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional one-to-one association to DonorCounterOffering
	@OneToOne
	@JoinColumn(name="DONATION_PRODUCT_ID")
	private DonorCounterOffering donorCounterOffering;

	public DonationProductMaster() {
	}

	public long getDonationProductId() {
		return this.donationProductId;
	}

	public void setDonationProductId(long donationProductId) {
		this.donationProductId = donationProductId;
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

	public String getProductDescription() {
		return this.productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public DonorCounterOffering getDonorCounterOffering() {
		return this.donorCounterOffering;
	}

	public void setDonorCounterOffering(DonorCounterOffering donorCounterOffering) {
		this.donorCounterOffering = donorCounterOffering;
	}

}