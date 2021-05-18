package com.ttd.sgms.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SGMS_SUBSCRIBE_MASTER database table.
 * 
 */
@Entity
@Table(name="SGMS_SUBSCRIBE_MASTER")
@NamedQuery(name="SgmsSubscribeMaster.findAll", query="SELECT s FROM SgmsSubscribeMaster s")
public class SgmsSubscribeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SGMS_SUBSCRIBE_ID")
	private long sgmsSubscribeId;

	@Column(name="SUBSCRIBE_PRICE")
	private BigDecimal subscribePrice;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="SGMS_SUBSCRIBE_DESCRIPTION")
	private String sgmsSubscribeDesc;

	@Column(name="PERCOPY_PRICE")
	private BigDecimal percopyPrice;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@OneToMany(mappedBy="sgmsSubscribeMaster", cascade = CascadeType.ALL)
	private List<SgmsBooking> sgmsBookings;
	
	
	public SgmsSubscribeMaster() {
	}
	
	

	public List<SgmsBooking> getSgmsBookings() {
		return sgmsBookings;
	}


	public void setSgmsBookings(List<SgmsBooking> sgmsBookings) {
		this.sgmsBookings = sgmsBookings;
	}

	public long getSgmsSubscribeId() {
		return this.sgmsSubscribeId;
	}

	public void setSgmsSubscribeId(long sgmsSubscribeId) {
		this.sgmsSubscribeId = sgmsSubscribeId;
	}

	public BigDecimal getSubscribePrice() {
		return this.subscribePrice;
	}

	public void setSubscribePrice(BigDecimal subscribePrice) {
		this.subscribePrice = subscribePrice;
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

	public String getSgmsSubscribeDesc() {
		return sgmsSubscribeDesc;
	}

	public void setSgmsSubscribeDesc(String sgmsSubscribeDesc) {
		this.sgmsSubscribeDesc = sgmsSubscribeDesc;
	}

	public BigDecimal getPercopyPrice() {
		return this.percopyPrice;
	}

	public void setPercopyPrice(BigDecimal percopyPrice) {
		this.percopyPrice = percopyPrice;
	}

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
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

}