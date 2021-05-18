package com.ttd.lrs.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the lrs_otp database table.
 * 
 */
@Entity
@Table(name="lrs_otp")
@NamedQuery(name="LrsOtp.findAll", query="SELECT l FROM LrsOtp l")
public class LrsOtp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="OTP_CODE")
	private BigDecimal otpCode;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OTP_EXPIRETIME")
	private Date otpExpiretime;

	@Id
	@SequenceGenerator(name="LRS_OTP_SEQ", sequenceName="LRS_OTP_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LRS_OTP_SEQ")
	@Column(name="OTP_ID")
	private int otpId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OTP_TIME")
	private Date otpTime;

	@Column(name="OTP_TYPE")
	private String otpType;

	@Column(name="PARTY_ID")
	private long partyNumber;
	
	@Column(name="RESET")
	private BigDecimal reset;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	public LrsOtp() {
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

	public int getOtpId() {
		return this.otpId;
	}

	public void setOtpId(int otpId) {
		this.otpId = otpId;
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

	
	public long getPartyNumber() {
		return partyNumber;
	}

	public void setPartyNumber(long partyNumber) {
		this.partyNumber = partyNumber;
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

}