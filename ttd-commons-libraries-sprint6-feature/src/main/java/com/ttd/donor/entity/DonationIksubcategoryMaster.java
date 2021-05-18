package com.ttd.donor.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the DONATION_IKCATEGORY_MASTER database table.
 * 
 */
@Entity
@Table(name="DONATION_IKSUBCATEGORY_MASTER")
@NamedQuery(name="DonationIksubcategoryMaster.findAll", query="SELECT p FROM DonationIksubcategoryMaster p")
public class DonationIksubcategoryMaster {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DONATION_IKSUBCATEGORY_ID")
	private long donationIksubcategoryId;

	@Column(name="IKSUBCATEGORY_NAME")
	private String iksubcategoryName;
	
	@Column(name="IKSUBCATEGORY_DESCRIPTION")
	private String iksubcategoryDescription;
	
	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;
	
	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	//bi-directional many-to-one association to DonorPrivRedeem
	@ManyToOne
	@JoinColumn(name="DONATION_IKCATEGORY_ID")
	private DonationIkcategoryMaster donationIkcategoryMaster;

	public long getDonationIksubcategoryId() {
		return donationIksubcategoryId;
	}

	public void setDonationIksubcategoryId(long donationIksubcategoryId) {
		this.donationIksubcategoryId = donationIksubcategoryId;
	}

	public String getIksubcategoryName() {
		return iksubcategoryName;
	}

	public void setIksubcategoryName(String iksubcategoryName) {
		this.iksubcategoryName = iksubcategoryName;
	}

	public String getIksubcategoryDescription() {
		return iksubcategoryDescription;
	}

	public void setIksubcategoryDescription(String iksubcategoryDescription) {
		this.iksubcategoryDescription = iksubcategoryDescription;
	}

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public DonationIkcategoryMaster getDonationIkcategoryMaster() {
		return donationIkcategoryMaster;
	}

	public void setDonationIkcategoryMaster(
			DonationIkcategoryMaster donationIkcategoryMaster) {
		this.donationIkcategoryMaster = donationIkcategoryMaster;
	}
	
	
}
