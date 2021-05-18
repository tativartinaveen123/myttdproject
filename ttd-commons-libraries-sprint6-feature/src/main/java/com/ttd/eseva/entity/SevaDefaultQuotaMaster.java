package com.ttd.eseva.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ChannelMaster;


/**
 * The persistent class for the SEVA_DEFAULT_QUOTA_MASTER database table.
 * 
 */
@Entity
@Table(name="SEVA_DEFAULT_QUOTA_MASTER")
@NamedQuery(name="SevaDefaultQuotaMaster.findAll", query="SELECT s FROM SevaDefaultQuotaMaster s")
public class SevaDefaultQuotaMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEVA_ID")
	private long sevaId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="NO_OF_SEVAS")
	private BigDecimal noOfSevas;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SEVA_DAY_OF_WEEK")
	private String sevaDayOfWeek;

	@Temporal(TemporalType.DATE)
	@Column(name="SEVA_RELEASE_DATE")
	private Date sevaReleaseDate;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	//bi-directional one-to-one association to SevaMaster
	@OneToOne
	@JoinColumn(name="SEVA_ID")
	private SevaMaster sevaMaster;

	public SevaDefaultQuotaMaster() {
	}

	public long getSevaId() {
		return this.sevaId;
	}

	public void setSevaId(long sevaId) {
		this.sevaId = sevaId;
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

	public BigDecimal getNoOfSevas() {
		return this.noOfSevas;
	}

	public void setNoOfSevas(BigDecimal noOfSevas) {
		this.noOfSevas = noOfSevas;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSevaDayOfWeek() {
		return this.sevaDayOfWeek;
	}

	public void setSevaDayOfWeek(String sevaDayOfWeek) {
		this.sevaDayOfWeek = sevaDayOfWeek;
	}

	public Date getSevaReleaseDate() {
		return this.sevaReleaseDate;
	}

	public void setSevaReleaseDate(Date sevaReleaseDate) {
		this.sevaReleaseDate = sevaReleaseDate;
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

	public ChannelMaster getChannelMaster() {
		return this.channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
	}

	public SevaMaster getSevaMaster() {
		return this.sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

}