package com.ttd.common.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the USER_PRIVILIGES database table.
 * 
 */
@Embeddable
public class UserPriviligePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="USER_ID", insertable=false, updatable=false)
	private long userId;

	@Column(name="PRIVILIGE_ID", insertable=false, updatable=false)
	private long priviligeId;

	public UserPriviligePK() {
	}
	public long getUserId() {
		return this.userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getPriviligeId() {
		return this.priviligeId;
	}
	public void setPriviligeId(long priviligeId) {
		this.priviligeId = priviligeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserPriviligePK)) {
			return false;
		}
		UserPriviligePK castOther = (UserPriviligePK)other;
		return 
			(this.userId == castOther.userId)
			&& (this.priviligeId == castOther.priviligeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.userId ^ (this.userId >>> 32)));
		hash = hash * prime + ((int) (this.priviligeId ^ (this.priviligeId >>> 32)));
		
		return hash;
	}
}