package com.ttd.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the ROLES_MASTER database table.
 * 
 */
@Entity
@Table(name="ROLES_MASTER")
@NamedQuery(name="RolesMaster.findAll", query="SELECT r FROM RolesMaster r")
public class RolesMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ROLE_ID")
	private long roleId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="ROLE_NAME")
	private String roleName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to RolesPrivilige
	@OneToMany(mappedBy="rolesMaster")
	private List<RolesPrivilige> rolesPriviliges;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="rolesMaster")
	private List<User> users;

	public RolesMaster() {
	}

	public long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public List<RolesPrivilige> getRolesPriviliges() {
		return this.rolesPriviliges;
	}

	public void setRolesPriviliges(List<RolesPrivilige> rolesPriviliges) {
		this.rolesPriviliges = rolesPriviliges;
	}

	public RolesPrivilige addRolesPrivilige(RolesPrivilige rolesPrivilige) {
		getRolesPriviliges().add(rolesPrivilige);
		rolesPrivilige.setRolesMaster(this);

		return rolesPrivilige;
	}

	public RolesPrivilige removeRolesPrivilige(RolesPrivilige rolesPrivilige) {
		getRolesPriviliges().remove(rolesPrivilige);
		rolesPrivilige.setRolesMaster(null);

		return rolesPrivilige;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setRolesMaster(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setRolesMaster(null);

		return user;
	}

}