package com.ttd.km.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.eaccommodation.entity.AccomBooking;
import com.ttd.eaccommodation.entity.AccomQuotaConfig;

@Entity
@Table(name="KM_AVAILABILITY")
@NamedQuery(name="KmAvailability.findAll", query="SELECT a FROM KmAvailability a")
public class KmAvailability implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="KM_AVAILABILITY_ID")
	private long kmAvailabilityId;

	@Column(name="KM_ID")
	private BigDecimal kmId;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="KM_DATE")
	private Date kmDate;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="NO_OF_KMS_AVAILABLE")
	private BigDecimal noOfKm;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	
	@Column(name="KM_AVAILABILITY_STATUS")
	private BigDecimal kmAvailabilityStatus;
	
	public BigDecimal getKmAvailabilityStatus() {
		return kmAvailabilityStatus;
	}

	public void setKmAvailabilityStatus(BigDecimal kmAvailabilityStatus) {
		this.kmAvailabilityStatus = kmAvailabilityStatus;
	}

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@ManyToOne
	@JoinColumn(name="KM_QUOTA_CONFIG_ID ")
	private KmQuotaConfig kmQuotaConfig;

	public KmAvailability(){}

	public long getKmAvailabilityId() {
		return kmAvailabilityId;
	}

	public void setKmAvailabilityId(long kmAvailabilityId) {
		this.kmAvailabilityId = kmAvailabilityId;
	}

	public BigDecimal getKmId() {
		return kmId;
	}

	public void setKmId(BigDecimal kmId) {
		this.kmId = kmId;
	}

	public BigDecimal getChannelTypeId() {
		return channelTypeId;
	}

	public void setChannelTypeId(BigDecimal channelTypeId) {
		this.channelTypeId = channelTypeId;
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

	public BigDecimal getNoOfKm() {
		return noOfKm;
	}

	public void setNoOfKm(BigDecimal noOfKm) {
		this.noOfKm = noOfKm;
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

	public KmQuotaConfig getKmQuotaConfig() {
		return kmQuotaConfig;
	}

	public void setKmQuotaConfig(KmQuotaConfig kmQuotaConfig) {
		this.kmQuotaConfig = kmQuotaConfig;
	}

	public Date getKmDate() {
		return kmDate;
	}

	public void setKmDate(Date kmDate) {
		this.kmDate = kmDate;
	}


}
 
