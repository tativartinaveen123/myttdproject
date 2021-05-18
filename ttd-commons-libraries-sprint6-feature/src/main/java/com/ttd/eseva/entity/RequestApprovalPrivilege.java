package com.ttd.eseva.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.common.entity.User;


/**
 * The persistent class for the REQUEST_APPROVAL_PRIVILEGES database table.
 * 
 */
@Entity
@Table(name="REQUEST_APPROVAL_PRIVILEGES")
@NamedQuery(name="RequestApprovalPrivilege.findAll", query="SELECT r FROM RequestApprovalPrivilege r")
public class RequestApprovalPrivilege implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REQUEST_APPROVAL_PRIVILEGES_ID")
	private long requestApprovalPrivilegesId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to RequestTypeMaster
	@ManyToOne
	@JoinColumn(name="REQUEST_TYPE_ID")
	private RequestTypeMaster requestTypeMaster;

	//bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public RequestApprovalPrivilege() {
	}

	public long getRequestApprovalPrivilegesId() {
		return this.requestApprovalPrivilegesId;
	}

	public void setRequestApprovalPrivilegesId(long requestApprovalPrivilegesId) {
		this.requestApprovalPrivilegesId = requestApprovalPrivilegesId;
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

	public RequestTypeMaster getRequestTypeMaster() {
		return this.requestTypeMaster;
	}

	public void setRequestTypeMaster(RequestTypeMaster requestTypeMaster) {
		this.requestTypeMaster = requestTypeMaster;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}