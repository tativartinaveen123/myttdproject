package com.ttd.km.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="KM_BOOKING_OPERATOR_MASTER")
@NamedQuery(name="KmOperatorMaster.findAll", query="SELECT a FROM KmOperatorMaster a")
public class KmOperatorMaster implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="KM_BOOKING_OPERATOR_ID")
	private Long kmOperatorId;
	
	@Column(name="KM_ID")
	private Long kmId;
	
	@Column(name="USER_ID")
	private Long userId;
	
	@Column(name="ROLE_ID")
	private Long roleId;
	
	@Column(name="CREATED_BY")
	private Long createdBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;
	
	@Column(name="UPDATED_BY")
	private Long updatedBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="ROW_STATUS")
	private Long rowStatus;

	public Long getKmOperatorId() {
		return kmOperatorId;
	}

	public void setKmOperatorId(Long kmOperatorId) {
		this.kmOperatorId = kmOperatorId;
	}

	public Long getKmId() {
		return kmId;
	}

	public void setKmId(Long kmId) {
		this.kmId = kmId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Long getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(Long rowStatus) {
		this.rowStatus = rowStatus;
	}
}
