package com.ttd.donor.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the DONATION_IKCATEGORY_MASTER database table.
 * 
 */
@Entity
@Table(name="DONATION_IKCATEGORY_MASTER")
@NamedQuery(name="DonationIkcategoryMaster.findAll", query="SELECT p FROM DonationIkcategoryMaster p")
public class DonationIkcategoryMaster {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="DONATION_IKCATEGORY_ID")
	private long donationIkcategoryId;

	@Column(name="IKCATEGORY_NAME")
	private String ikcategoryName;
	
	@Column(name="IKCATEGORY_DESCRIPTION")
	private String ikcategoryDescription;
	
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
	
	@OneToMany(mappedBy="donationIkcategoryMaster")
	private  List<DonationIksubcategoryMaster> donationIksubcategoryMasters;

	public DonationIkcategoryMaster() {
		
	}


	public long getDonationIkcategoryId() {
		return donationIkcategoryId;
	}


	public void setDonationIkcategoryId(long donationIkcategoryId) {
		this.donationIkcategoryId = donationIkcategoryId;
	}


	public String getIkcategoryName() {
		return ikcategoryName;
	}

	public void setIkcategoryName(String ikcategoryName) {
		this.ikcategoryName = ikcategoryName;
	}

	public String getIkcategoryDescription() {
		return ikcategoryDescription;
	}

	public void setIkcategoryDescription(String ikcategoryDescription) {
		this.ikcategoryDescription = ikcategoryDescription;
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


	public List<DonationIksubcategoryMaster> getDonationIksubcategoryMasters() {
		return donationIksubcategoryMasters;
	}


	public void setDonationIksubcategoryMasters(
			List<DonationIksubcategoryMaster> donationIksubcategoryMasters) {
		this.donationIksubcategoryMasters = donationIksubcategoryMasters;
	}

	
	
	
}
