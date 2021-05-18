package com.ttd.donor.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DOLLAR_OTP database table.
 * 
 */
@Entity
@Table(name="DOLLAR_OTP")
@NamedQuery(name="DollarOtp.findAll", query="SELECT d FROM DollarOtp d")
public class DollarOtp implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@SequenceGenerator(name="DOLLAR_OTP_OTPID_GENERATOR", sequenceName="DOLLAR_OTPSEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DOLLAR_OTP_OTPID_GENERATOR")
	@Column(name="OTP_ID", nullable=false, precision=8)
	private BigDecimal otpId;
	
	
	@Column(name="OTP_CODE", precision=16)
	private BigDecimal otpCode;


	@Column(name="MOBILE_NUMBER", length=25)
	private String mobileNumber;

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OTP_EXPIRETIME")
	private Date otpExpiretime;

	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="OTP_TIME")
	private Date otpTime;

	@Column(name="OTP_TYPE", length=20)
	private String otpType;

	@Column(name="\"RESET\"", precision=1)
	private BigDecimal reset;

	@Column(name="ROW_STATUS", precision=1)
	private BigDecimal rowStatus;

	@Column(name="USER_ID", precision=20)
	private BigDecimal userId;

	//bi-directional many-to-one association to DollarBooking
	@ManyToOne
	@JoinColumn(name="P_BOOKING_ID")
	private DollarBooking dollarBooking;
	
	

	public DollarOtp() {
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public BigDecimal getOtpId() {
		return this.otpId;
	}

	public void setOtpId(BigDecimal otpId) {
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

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public DollarBooking getDollarBooking() {
		return this.dollarBooking;
	}

	public void setDollarBooking(DollarBooking dollarBooking) {
		this.dollarBooking = dollarBooking;
	}

}
