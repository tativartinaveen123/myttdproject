package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the WATCH_LIST database table.
 * 
 */
@Entity
@Table(name="WATCH_LIST")
@NamedQuery(name="WatchList.findAll", query="SELECT w FROM WatchList w")
public class WatchList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="WATCH_LIST_WATCH_LIST_ID_GENERATOR", sequenceName="WATCH_LIST_WATCH_LIST_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="WATCH_LIST_WATCH_LIST_ID_GENERATOR") 
	@Column(name="WATCH_LIST_ID")
	private long watchListId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="WATCH_LIST_COUNT")
	private BigDecimal watchListCount;

	public WatchList() {
	}

	public long getWatchListId() {
		return this.watchListId;
	}

	public void setWatchListId(long watchListId) {
		this.watchListId = watchListId;
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

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
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

	public BigDecimal getWatchListCount() {
		return this.watchListCount;
	}

	public void setWatchListCount(BigDecimal watchListCount) {
		this.watchListCount = watchListCount;
	}

}