package com.ttd.eseva.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ChannelMaster;


/**
 * The persistent class for the SEVA_QUOTA_MASTER database table.
 * 
 */
@Entity
@Table(name="SEVA_QUOTA_MASTER")
@NamedQuery(name="SevaQuotaMaster.findAll", query="SELECT s FROM SevaQuotaMaster s")
public class SevaQuotaMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SevaQuotaMasterPK id;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="SEVA_FROM_DATE")
	private Date sevaFromDate;

	@Temporal(TemporalType.DATE)
	@Column(name="SEVA_TO_DATE")
	private Date sevaToDate;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID", insertable=false, updatable=false)
	private ChannelMaster channelMaster;

	//bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name="SEVA_ID", insertable=false, updatable=false)
	private SevaMaster sevaMaster;

	public SevaQuotaMaster() {
	}

	public SevaQuotaMasterPK getId() {
		return this.id;
	}

	public void setId(SevaQuotaMasterPK id) {
		this.id = id;
	}

	public BigDecimal getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
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

	public Date getSevaFromDate() {
		return this.sevaFromDate;
	}

	public void setSevaFromDate(Date sevaFromDate) {
		this.sevaFromDate = sevaFromDate;
	}

	public Date getSevaToDate() {
		return this.sevaToDate;
	}

	public void setSevaToDate(Date sevaToDate) {
		this.sevaToDate = sevaToDate;
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