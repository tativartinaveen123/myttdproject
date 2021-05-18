package com.ttd.donor.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PRIVILEGE_PRIVILEGESUBTYPE database table.
 * 
 */
@Entity
@Table(name="PRIVILEGE_PRIVILEGESUBTYPE")
@NamedQuery(name="PrivilegePrivilegesubtype.findAll", query="SELECT p FROM PrivilegePrivilegesubtype p")
public class PrivilegePrivilegesubtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PRIVILEGE_PRIVILEGESUBTYPE_ID")
	private long privilegePrivilegesubtypeId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="PRIVILEGE_ID")
	private BigDecimal privilegeId;

	@Column(name="ROLE_ID")
	private BigDecimal roleId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="TRUST_ID")
	private BigDecimal trustId;

	@Column(name="UPDATED_BY")
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_DATE")
	private Date updatedDate;

	@Column(name="USER_ID")
	private BigDecimal userId;

	public PrivilegePrivilegesubtype() {
	}

	public long getPrivilegePrivilegesubtypeId() {
		return this.privilegePrivilegesubtypeId;
	}

	public void setPrivilegePrivilegesubtypeId(long privilegePrivilegesubtypeId) {
		this.privilegePrivilegesubtypeId = privilegePrivilegesubtypeId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public BigDecimal getPrivilegeId() {
		return this.privilegeId;
	}

	public void setPrivilegeId(BigDecimal privilegeId) {
		this.privilegeId = privilegeId;
	}

	public BigDecimal getRoleId() {
		return this.roleId;
	}

	public void setRoleId(BigDecimal roleId) {
		this.roleId = roleId;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getTrustId() {
		return this.trustId;
	}

	public void setTrustId(BigDecimal trustId) {
		this.trustId = trustId;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedDate() {
		return this.updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

}