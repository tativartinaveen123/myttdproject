package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TEMP_USER_PWD database table.
 * 
 */
@Entity
@Table(name="TEMP_USER_PWD")
@NamedQuery(name="TempUserPwd.findAll", query="SELECT t FROM TempUserPwd t")
public class TempUserPwd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TEMP_MIG_PWD_SEQUENCE_GENERATOR", sequenceName = "TEMP_MIG_PWD_SEQUENCE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEMP_MIG_PWD_SEQUENCE_GENERATOR")
	private long id;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_PASS")
	private String userPass;
	
	@Column(name="USRSYNK_STATUS")
	private String usrsynkStatus;
	
	@Column(name="CONN_LOG_REMARKS")
	private String connLogRemarks;

	//bi-directional many-to-one association to User
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;

	public TempUserPwd() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
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

	public String getUserPass() {
		return this.userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUsrsynkStatus() {
		return usrsynkStatus;
	}

	public void setUsrsynkStatus(String usrsynkStatus) {
		this.usrsynkStatus = usrsynkStatus;
	}

	public String getConnLogRemarks() {
		return connLogRemarks;
	}

	public void setConnLogRemarks(String connLogRemarks) {
		this.connLogRemarks = connLogRemarks;
	}

}