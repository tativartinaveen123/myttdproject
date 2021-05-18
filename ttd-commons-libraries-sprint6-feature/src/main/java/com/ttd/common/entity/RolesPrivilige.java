package com.ttd.common.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the ROLES_PRIVILIGES database table.
 * 
 */
@Entity
@Table(name="ROLES_PRIVILIGES")
@NamedQuery(name="RolesPrivilige.findAll", query="SELECT r FROM RolesPrivilige r")
public class RolesPrivilige implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RolesPriviligePK id;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to PriviligesMaster
	@ManyToOne
	@JoinColumn(name="PRIVILIGE_ID", insertable=false, updatable=false)
	private PriviligesMaster priviligesMaster;

	//bi-directional many-to-one association to RolesMaster
	@ManyToOne
	@JoinColumn(name="ROLE_ID" , insertable=false, updatable=false)
	private RolesMaster rolesMaster;

	public RolesPrivilige() {
	}

	public RolesPriviligePK getId() {
		return this.id;
	}

	public void setId(RolesPriviligePK id) {
		this.id = id;
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

	public PriviligesMaster getPriviligesMaster() {
		return this.priviligesMaster;
	}

	public void setPriviligesMaster(PriviligesMaster priviligesMaster) {
		this.priviligesMaster = priviligesMaster;
	}

	public RolesMaster getRolesMaster() {
		return this.rolesMaster;
	}

	public void setRolesMaster(RolesMaster rolesMaster) {
		this.rolesMaster = rolesMaster;
	}

}