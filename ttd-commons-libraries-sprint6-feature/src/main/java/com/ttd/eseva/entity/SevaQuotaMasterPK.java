package com.ttd.eseva.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the SEVA_QUOTA_MASTER database table.
 * 
 */
@Embeddable
public class SevaQuotaMasterPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="SEVA_QUOTA_ID")
	private long sevaQuotaId;

	@Column(name="SEVA_ID", insertable=false, updatable=false)
	private long sevaId;

	public SevaQuotaMasterPK() {
	}
	public long getSevaQuotaId() {
		return this.sevaQuotaId;
	}
	public void setSevaQuotaId(long sevaQuotaId) {
		this.sevaQuotaId = sevaQuotaId;
	}
	public long getSevaId() {
		return this.sevaId;
	}
	public void setSevaId(long sevaId) {
		this.sevaId = sevaId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SevaQuotaMasterPK)) {
			return false;
		}
		SevaQuotaMasterPK castOther = (SevaQuotaMasterPK)other;
		return 
			(this.sevaQuotaId == castOther.sevaQuotaId)
			&& (this.sevaId == castOther.sevaId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.sevaQuotaId ^ (this.sevaQuotaId >>> 32)));
		hash = hash * prime + ((int) (this.sevaId ^ (this.sevaId >>> 32)));
		
		return hash;
	}
}