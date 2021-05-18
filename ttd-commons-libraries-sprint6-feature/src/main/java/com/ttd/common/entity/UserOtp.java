package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the USER_OTP database table.
 * 
 */
@Entity
@Table(name="USER_OTP")
@NamedQuery(name="UserOtp.findAll", query="SELECT u FROM UserOtp u")
public class UserOtp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USER_OTP_OTPID_GENERATOR", sequenceName="USER_OTP_USER_OTPSEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USER_OTP_OTPID_GENERATOR")
	@Column(name="OTP_ID")
	private long otpId;

	@Column(name="OTP_CODE")
	private BigDecimal otpCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OTP_EXPIRETIME")
	private Date otpExpiretime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OTP_TIME")
	private Date otpTime;

	@Column(name="OTP_TYPE")
	private String otpType;

	@Column(name="\"RESET\"")
	private BigDecimal reset;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	public UserOtp() {
	}

	public long getOtpId() {
		return this.otpId;
	}

	public void setOtpId(long otpId) {
		this.otpId = otpId;
	}

	public BigDecimal getOtpCode() {
		return this.otpCode;
	}

	public void setOtpCode(BigDecimal otpCode) {
		this.otpCode = otpCode;
	}

	public Date getOtpExpiretime() {
		return this.otpExpiretime;
	}

	public void setOtpExpiretime(Date otpExpiretime) {
		this.otpExpiretime = otpExpiretime;
	}

	public Date getOtpTime() {
		return this.otpTime;
	}

	public void setOtpTime(Date otpTime) {
		this.otpTime = otpTime;
	}

	public String getOtpType() {
		return this.otpType;
	}

	public void setOtpType(String otpType) {
		this.otpType = otpType;
	}

	public BigDecimal getReset() {
		return this.reset;
	}

	public void setReset(BigDecimal reset) {
		this.reset = reset;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}