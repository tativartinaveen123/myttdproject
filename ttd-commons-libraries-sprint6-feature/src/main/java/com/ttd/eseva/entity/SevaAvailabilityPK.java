package com.ttd.eseva.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SEVA_AVAILABILITY database table.
 * 
 */
@Embeddable
public class SevaAvailabilityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="CHANNEL_TYPE_ID")
	private long channelTypeId;

	@Column(name="SEVA_ID")
	private long sevaId;

	@Temporal(TemporalType.DATE)
	@Column(name="SEVA_DATE")
	private java.util.Date sevaDate;

	public SevaAvailabilityPK() {
	}
	public long getChannelTypeId() {
		return this.channelTypeId;
	}
	public void setChannelTypeId(long channelTypeId) {
		this.channelTypeId = channelTypeId;
	}
	public long getSevaId() {
		return this.sevaId;
	}
	public void setSevaId(long sevaId) {
		this.sevaId = sevaId;
	}
	public java.util.Date getSevaDate() {
		return this.sevaDate;
	}
	public void setSevaDate(java.util.Date sevaDate) {
		this.sevaDate = sevaDate;
	}
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SevaAvailabilityPK)) {
			return false;
		}
		SevaAvailabilityPK castOther = (SevaAvailabilityPK)other;
		return 
			(this.channelTypeId == castOther.channelTypeId)
			&& (this.sevaId == castOther.sevaId)
			&& this.sevaDate.equals(castOther.sevaDate);
	}
@Override
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.channelTypeId ^ (this.channelTypeId >>> 32)));
		hash = hash * prime + ((int) (this.sevaId ^ (this.sevaId >>> 32)));
		//hash = hash * prime + this.sevaDate.hashCode();
		
		return hash;
	}
}