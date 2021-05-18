package com.ttd.donor.entity;

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

import com.ttd.anonymous.donations.entity.DonorCounterOfferAnonymous;


/**
 * The persistent class for the PG_MASTER database table.
 * 
 */
@Entity
@Table(name="MODE_OF_PAYMENT")
@NamedQuery(name="ModeOfPayment.findAll", query="SELECT p FROM ModeOfPayment p")
public class ModeOfPayment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MODE_OF_PAYMENT_ID")
	private long modeOfPaymentId;

	@Column(name="MODEOFPAY")
	private String modeOfPay;;
	
	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;
	
	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional one-to-one association to DonorCounterOffering
	@OneToMany(mappedBy="paymentMode")
	private  List<DonorCounterOffering> donorCounterOfferings;
	
	@OneToMany(mappedBy="paymentMode")
	private List<DonorCounterOfferAnonymous> donorCounterOfferAnonymous;
	
	public ModeOfPayment() {
	}


	public List<DonorCounterOfferAnonymous> getDonorCounterOfferAnonymous() {
		return donorCounterOfferAnonymous;
	}


	public void setDonorCounterOfferAnonymous(List<DonorCounterOfferAnonymous> donorCounterOfferAnonymous) {
		this.donorCounterOfferAnonymous = donorCounterOfferAnonymous;
	}


	public void setDonorCounterOfferings(List<DonorCounterOffering> donorCounterOfferings) {
		this.donorCounterOfferings = donorCounterOfferings;
	}


	public long getModeOfPaymentId() {
		return modeOfPaymentId;
	}


	public void setModeOfPaymentId(long modeOfPaymentId) {
		this.modeOfPaymentId = modeOfPaymentId;
	}


	public String getModeOfPay() {
		return modeOfPay;
	}


	public void setModeOfPay(String modeOfPay) {
		this.modeOfPay = modeOfPay;
	}


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


	public List<DonorCounterOffering> getDonorCounterOfferings() {
		return donorCounterOfferings;
	}


	public void setDonorCounterOffering(List<DonorCounterOffering> donorCounterOfferings) {
		this.donorCounterOfferings = donorCounterOfferings;
	}
	

}