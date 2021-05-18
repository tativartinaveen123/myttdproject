package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the LOCATION_MASTER database table.
 * 
 */
@Entity
@Table(name="LOCATION_MASTER")
@NamedQuery(name="LocationMaster.findAll", query="SELECT l FROM LocationMaster l")
public class LocationMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOCATION_ID")
	private long locationId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="LOCATION_DETAILS")
	private String locationDetails;

	@Column(name="LOCATION_NAME")
	private String locationName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to GuestHouseMaster
	@OneToMany(mappedBy="locationMaster")
	private List<GuestHouseMaster> guestHouseMasters;

	public LocationMaster() {
	}

	public long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
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

	public String getLocationDetails() {
		return this.locationDetails;
	}

	public void setLocationDetails(String locationDetails) {
		this.locationDetails = locationDetails;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
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

	public List<GuestHouseMaster> getGuestHouseMasters() {
		return this.guestHouseMasters;
	}

	public void setGuestHouseMasters(List<GuestHouseMaster> guestHouseMasters) {
		this.guestHouseMasters = guestHouseMasters;
	}

	public GuestHouseMaster addGuestHouseMaster(GuestHouseMaster guestHouseMaster) {
		getGuestHouseMasters().add(guestHouseMaster);
		guestHouseMaster.setLocationMaster(this);

		return guestHouseMaster;
	}

	public GuestHouseMaster removeGuestHouseMaster(GuestHouseMaster guestHouseMaster) {
		getGuestHouseMasters().remove(guestHouseMaster);
		guestHouseMaster.setLocationMaster(null);

		return guestHouseMaster;
	}

}