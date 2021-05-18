package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ACCOM_AVAILABILITY database table.
 * 
 */
@Entity
@Table(name="ACCOM_AVAILABILITY")
@NamedQuery(name="AccomAvailability.findAll", query="SELECT a FROM AccomAvailability a")
public class AccomAvailability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCOM_AVAILABILITY_ID")
	private long accomAvailabilityId;

	@Column(name="ACCOM_CODE")
	private String accomCode;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOM_DATE")
	private Date accomDate;

	@Column(name="ACCOM_ID")
	private BigDecimal accomId;

	@Column(name="AVAILABILITY_STATUS")
	private BigDecimal availabilityStatus;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="NO_OF_ACCOMMODATIONS")
	private BigDecimal noOfAccommodations;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to AccomQuotaConfig
	@ManyToOne
	@JoinColumn(name="ACCOM_QUOTA_CONFIG_ID")
	private AccomQuotaConfig accomQuotaConfig;

	//bi-directional many-to-one association to AccomBooking
	@OneToMany(mappedBy="accomAvailability")
	private List<AccomBooking> accomBookings;

	public AccomAvailability() {
	}

	public long getAccomAvailabilityId() {
		return this.accomAvailabilityId;
	}

	public void setAccomAvailabilityId(long accomAvailabilityId) {
		this.accomAvailabilityId = accomAvailabilityId;
	}

	public String getAccomCode() {
		return this.accomCode;
	}

	public void setAccomCode(String accomCode) {
		this.accomCode = accomCode;
	}

	public Date getAccomDate() {
		return this.accomDate;
	}

	public void setAccomDate(Date accomDate) {
		this.accomDate = accomDate;
	}

	public BigDecimal getAccomId() {
		return this.accomId;
	}

	public void setAccomId(BigDecimal accomId) {
		this.accomId = accomId;
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

	public BigDecimal getNoOfAccommodations() {
		return this.noOfAccommodations;
	}

	public void setNoOfAccommodations(BigDecimal noOfAccommodations) {
		this.noOfAccommodations = noOfAccommodations;
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

	public AccomQuotaConfig getAccomQuotaConfig() {
		return this.accomQuotaConfig;
	}

	public void setAccomQuotaConfig(AccomQuotaConfig accomQuotaConfig) {
		this.accomQuotaConfig = accomQuotaConfig;
	}

	public List<AccomBooking> getAccomBookings() {
		return this.accomBookings;
	}

	public void setAccomBookings(List<AccomBooking> accomBookings) {
		this.accomBookings = accomBookings;
	}

	public AccomBooking addAccomBooking(AccomBooking accomBooking) {
		getAccomBookings().add(accomBooking);
		accomBooking.setAccomAvailability(this);

		return accomBooking;
	}

	public AccomBooking removeAccomBooking(AccomBooking accomBooking) {
		getAccomBookings().remove(accomBooking);
		accomBooking.setAccomAvailability(null);

		return accomBooking;
	}

}