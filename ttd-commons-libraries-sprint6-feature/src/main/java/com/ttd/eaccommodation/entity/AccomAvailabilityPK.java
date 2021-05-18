package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ACCOM_AVAILABILITY database table.
 * 
 */
@Embeddable
public class AccomAvailabilityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOM_TYPE_ID", insertable=false, updatable=false)
	private long accomTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOM_DATE")
	private java.util.Date accomDate;

	@Column(name="CHANNEL_TYPE_ID", insertable=false, updatable=false)
	private long channelTypeId;

	@Column(name="LOCATION_ID", insertable=false, updatable=false)
	private long locationId;

	public AccomAvailabilityPK() {
	}
	public long getAccomTypeId() {
		return this.accomTypeId;
	}
	public void setAccomTypeId(long accomTypeId) {
		this.accomTypeId = accomTypeId;
	}
	public java.util.Date getAccomDate() {
		return this.accomDate;
	}
	public void setAccomDate(java.util.Date accomDate) {
		this.accomDate = accomDate;
	}
	public long getChannelTypeId() {
		return this.channelTypeId;
	}
	public void setChannelTypeId(long channelTypeId) {
		this.channelTypeId = channelTypeId;
	}
	public long getLocationId() {
		return this.locationId;
	}
	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccomAvailabilityPK)) {
			return false;
		}
		AccomAvailabilityPK castOther = (AccomAvailabilityPK)other;
		return 
			(this.accomTypeId == castOther.accomTypeId)
			&& this.accomDate.equals(castOther.accomDate)
			&& (this.channelTypeId == castOther.channelTypeId)
			&& (this.locationId == castOther.locationId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.accomTypeId ^ (this.accomTypeId >>> 32)));
		hash = hash * prime + this.accomDate.hashCode();
		hash = hash * prime + ((int) (this.channelTypeId ^ (this.channelTypeId >>> 32)));
		hash = hash * prime + ((int) (this.locationId ^ (this.locationId >>> 32)));
		
		return hash;
	}
}