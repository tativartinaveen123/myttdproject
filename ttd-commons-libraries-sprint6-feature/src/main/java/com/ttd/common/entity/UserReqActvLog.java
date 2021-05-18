package com.ttd.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="USER_REQUEST_ACTIVITIES_LOG")
@NamedQuery(name="UserReqActvLog.findAll", query="SELECT a FROM UserReqActvLog a")

public class UserReqActvLog implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name="USER_REQUEST_ACTIVITIES_LOG_REQUEST_ID_GENERATOR", sequenceName="USER_REQUEST_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_REQUEST_ACTIVITIES_LOG_REQUEST_ID_GENERATOR")
	@Column(name="REQUEST_ID")
	private long RequestId;
	
	@Column(name="USER_ID")
	private long userId;
	
	@Column(name="REQUEST_TYPE")
	private String requestType;
	
	@Column(name="COMMENTS")
	private String comments;
	
	@Column(name="UPDATED_BY")
	private long updatedBy;
	
	@Column(name="CREATED_BY")
	private long createdBy;
	
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name="REQUESTER_OLDMAILID")
	private String reqoldmailid;
	
	
	

	@Column(name="REUESTER_NEWMAILID")
	private String reqnewmailid;
	
	
	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	
	
	public long getRequestId() {
		return RequestId;
	}

	public void setRequestId(long requestId) {
		RequestId = requestId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getReqoldmailid() {
		return reqoldmailid;
	}

	public void setReqoldmailid(String reqoldmailid) {
		this.reqoldmailid = reqoldmailid;
	}

	public String getReqnewmailid() {
		return reqnewmailid;
	}

	public void setReqnewmailid(String reqnewmailid) {
		this.reqnewmailid = reqnewmailid;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	
	
	

	
	
	
}
