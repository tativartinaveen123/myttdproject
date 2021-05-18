package com.ttd.common.entity;


import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the QUOTA_UPLOAD_LOG database table.
 * 
 */
@Entity
@Table(name="QUOTA_UPLOAD_LOG")
@NamedQuery(name="QuotaUploadLog.findAll", query="SELECT q FROM QuotaUploadLog q")
public class QuotaUploadLog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(name="QUOTA_UPLOAD_LOG_LOG_ID_GENERATOR", sequenceName="QUOTA_UPLOAD_LOG_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="QUOTA_UPLOAD_LOG_LOG_ID_GENERATOR")
	@Column(name="LOG_ID", precision=16)
	private BigDecimal logId;

	@Column(length=300)
	private String comments;

	@Column(name="CREATED_BY", length=100)
	private long createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	

	@Column(name="NEW_QUOTA", length=60)
	private String newQuota;

	@Column(name="OLD_QUOTA", length=60)
	private String oldQuota;

	@Column(name="REQUEST_TYPE", length=100)
	private String requestType;

	@Column(name="ROLE_ID", precision=16)
	private BigDecimal roleId;

	@Column(name="UPDATED_BY", length=50)
	private long updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME", insertable=false, updatable=false)
	private Date updatedTime;

	public QuotaUploadLog() {
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getLogId() {
		return this.logId;
	}

	public void setLogId(BigDecimal logId) {
		this.logId = logId;
	}

	public String getNewQuota() {
		return this.newQuota;
	}

	public void setNewQuota(String newQuota) {
		this.newQuota = newQuota;
	}

	public String getOldQuota() {
		return this.oldQuota;
	}

	public void setOldQuota(String oldQuota) {
		this.oldQuota = oldQuota;
	}

	public String getRequestType() {
		return this.requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public BigDecimal getRoleId() {
		return this.roleId;
	}

	public void setRoleId(BigDecimal roleId) {
		this.roleId = roleId;
	}

	

	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}
	

}