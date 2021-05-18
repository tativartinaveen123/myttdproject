package com.ttd.common.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the ROLES_PRIVILIGES database table.
 * 
 */
@Embeddable
public class RolesPriviligePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ROLE_ID", insertable=false, updatable=false)
	private long roleId;

	@Column(name="PRIVILIGE_ID", insertable=false, updatable=false)
	private long priviligeId;

	public RolesPriviligePK() {
	}
	public long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(long roleId) {
		this.roleId = roleId;
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
		if (!(other instanceof RolesPriviligePK)) {
			return false;
		}
		RolesPriviligePK castOther = (RolesPriviligePK)other;
		return 
			(this.roleId == castOther.roleId)
			&& (this.priviligeId == castOther.priviligeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.roleId ^ (this.roleId >>> 32)));
		hash = hash * prime + ((int) (this.priviligeId ^ (this.priviligeId >>> 32)));
		
		return hash;
	}
}