package com.ttd.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the LOGIN_AUDIT database table.
 * 
 */
@Entity
@Table(name="LOGIN_AUDIT")
//@NamedQuery(name="LoginAudit.findAll", query="SELECT l FROM LoginAudit l")
public class LoginAudit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LOGIN_AUDIT_SEQ_GENERATOR", sequenceName="LOGIN_AUDIT_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOGIN_AUDIT_SEQ_GENERATOR")
	@Column(name="AUDIT_ID")
	private long auditId;

	@Column(name="LOGIN_STATUS")
	private String loginStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOGIN_TIME")
	private Date loginTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="LOGOUT_TIME")
	private Date logoutTime;

	@Column(name="NO_OF_FAILURE_ATTEMPTS")
	private BigDecimal noOfFailureAttempts;
	
	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;
	
	

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name = "SESSION_ID")
	private String sessionId;
	
	@Column(name = "IS_USER_LOGGED_IN")	
	private String isUserLoggedIn;

	//bi-directional many-to-one association to User
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="USER_ID") private User user;
	 */
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name="USER_ID")
	private long userId;

	@Column(name = "REQ_CHANNEL")
	private String requestChannel;
	
	public LoginAudit() {
	}

	public long getAuditId() {
		return this.auditId;
	}

	public void setAuditId(long auditId) {
		this.auditId = auditId;
	}

	public String getLoginStatus() {
		return this.loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getLogoutTime() {
		return this.logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	public BigDecimal getNoOfFailureAttempts() {
		return this.noOfFailureAttempts;
	}

	public void setNoOfFailureAttempts(BigDecimal noOfFailureAttempts) {
		this.noOfFailureAttempts = noOfFailureAttempts;
	}

	/*
	 * public User getUser() { return this.user; }
	 * 
	 * public void setUser(User user) { this.user = user; }
	 */

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getIsUserLoggedIn() {
		return isUserLoggedIn;
	}

	public void setIsUserLoggedIn(String isUserLoggedIn) {
		this.isUserLoggedIn = isUserLoggedIn;
	}

	public String getRequestChannel() {
		return requestChannel;
	}

	public void setRequestChannel(String requestChannel) {
		this.requestChannel = requestChannel;
	}

}