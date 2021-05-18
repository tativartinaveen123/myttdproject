package com.ttd.edarshan.entity;

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

/**
 * The persistent class for the DARSHAN_AVAILABILITY database table.
 * 
 */
@Entity
@Table(name = "DARSHAN_AVAILABILITY")
@NamedQuery(name = "DarshanAvailability.findAll", query = "SELECT d FROM DarshanAvailability d")
public class DarshanAvailability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DARSHAN_AVAILABILITY_ID")
	private long darshanAvailabilityId;

	@Column(name = "AVAILABILITY_STATUS")
	private BigDecimal availabilityStatus;

	@Column(name = "CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "DARSHAN_DATE")
	private Date darshanDate;

	@Column(name = "DARSHAN_TYPE_ID")
	private BigDecimal darshanTypeId;

	@Column(name = "NO_OF_DARSHANS")
	private BigDecimal noOfDarshans;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_ID")
	private BigDecimal slotId;

	@Column(name = "SLOT_NAME")
	private String slotName;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to DarshanQuotaConfig
	@ManyToOne
	@JoinColumn(name = "DARSHAN_QUOTA_CONFIG_ID")
	private DarshanQuotaConfig darshanQuotaConfig;

	// bi-directional many-to-one association to DarshanBooking
	@OneToMany(mappedBy = "darshanAvailability")
	private List<DarshanBooking> darshanBookings;

	public DarshanAvailability() {
	}

	public long getDarshanAvailabilityId() {
		return this.darshanAvailabilityId;
	}

	public void setDarshanAvailabilityId(long darshanAvailabilityId) {
		this.darshanAvailabilityId = darshanAvailabilityId;
	}

	public BigDecimal getAvailabilityStatus() {
		return this.availabilityStatus;
	}

	public void setAvailabilityStatus(BigDecimal availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
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

	public Date getDarshanDate() {
		return this.darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	public BigDecimal getDarshanTypeId() {
		return this.darshanTypeId;
	}

	public void setDarshanTypeId(BigDecimal darshanTypeId) {
		this.darshanTypeId = darshanTypeId;
	}

	public BigDecimal getNoOfDarshans() {
		return this.noOfDarshans;
	}

	public void setNoOfDarshans(BigDecimal noOfDarshans) {
		this.noOfDarshans = noOfDarshans;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getSlotId() {
		return this.slotId;
	}

	public void setSlotId(BigDecimal slotId) {
		this.slotId = slotId;
	}

	public String getSlotName() {
		return this.slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
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

	public DarshanQuotaConfig getDarshanQuotaConfig() {
		return this.darshanQuotaConfig;
	}

	public void setDarshanQuotaConfig(DarshanQuotaConfig darshanQuotaConfig) {
		this.darshanQuotaConfig = darshanQuotaConfig;
	}

	public List<DarshanBooking> getDarshanBookings() {
		return this.darshanBookings;
	}

	public void setDarshanBookings(List<DarshanBooking> darshanBookings) {
		this.darshanBookings = darshanBookings;
	}

	public DarshanBooking addDarshanBooking(DarshanBooking darshanBooking) {
		getDarshanBookings().add(darshanBooking);
		darshanBooking.setDarshanAvailability(this);

		return darshanBooking;
	}

	public DarshanBooking removeDarshanBooking(DarshanBooking darshanBooking) {
		getDarshanBookings().remove(darshanBooking);
		darshanBooking.setDarshanAvailability(null);

		return darshanBooking;
	}

}