package com.ttd.edarshan.dip.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SED_DIP_AVAILABILITY database table.
 * 
 */
@Entity
@Table(name="SED_DIP_AVAILABILITY")
@NamedQuery(name="SedDipAvailability.findAll", query="SELECT s FROM SedDipAvailability s")
public class SedDipAvailability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SED_DIP_AVAILABILITY_ID")
	private long sedDipAvailabilityId;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="NO_OF_DARSHANS")
	private BigDecimal noOfDarshans;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="DARSHAN_DATE")
	private Date darshanDate;

	@ManyToOne
	@JoinColumn(name="SED_DIP_ID", insertable=false, updatable=false)
	private SedDip sedDip;

	@Column(name="SED_DIP_SCHEDULE_ID")
	private Long sedDipScheduleId;

	@Column(name="SLOT_ID")
	private BigDecimal slotId;

	@Column(name="SLOT_NAME")
	private String slotName;

	@Column(name="SERVICE_TYPE_ID")
	private BigDecimal serviceTypeId;

	private BigDecimal status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public SedDipAvailability() {
	}

	public long getSedDipAvailabilityId() {
		return this.sedDipAvailabilityId;
	}

	public void setSedDipAvailabilityId(long sedDipAvailabilityId) {
		this.sedDipAvailabilityId = sedDipAvailabilityId;
	}

	public BigDecimal getChannelTypeId() {
		return this.channelTypeId;
	}

	public void setChannelTypeId(BigDecimal channelTypeId) {
		this.channelTypeId = channelTypeId;
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

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public Date getDarshanDate() {
		return darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	
	public SedDip getSedDip() {
		return sedDip;
	}

	public void setSedDip(SedDip sedDip) {
		this.sedDip = sedDip;
	}

	public Long getSedDipScheduleId() {
		return sedDipScheduleId;
	}

	public void setSedDipScheduleId(Long sedDipScheduleId) {
		this.sedDipScheduleId = sedDipScheduleId;
	}

	public BigDecimal getServiceTypeId() {
		return this.serviceTypeId;
	}

	public void setServiceTypeId(BigDecimal serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
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

	public BigDecimal getNoOfDarshans() {
		return noOfDarshans;
	}

	public void setNoOfDarshans(BigDecimal noOfDarshans) {
		this.noOfDarshans = noOfDarshans;
	}

	public BigDecimal getSlotId() {
		return slotId;
	}

	public void setSlotId(BigDecimal slotId) {
		this.slotId = slotId;
	}

	public String getSlotName() {
		return slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

}