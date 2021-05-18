package com.ttd.km.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import com.ttd.eseva.entity.RequestWorkflow;

@Entity
@Table(name="KM_CHN_CONF")
@NamedQuery(name="KmChnConf.findAll", query="SELECT a FROM KmChnConf a")
public class KmChnConf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="KM_CHNL_CONFIG_ID")
	private long kmChnlConfigId;


	@Column(name="KM_ID ")
	private BigDecimal kmId;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to AccomQuotaConfig
	/*@OneToMany(mappedBy="KmChnConf")
	private List<KmQuotaConfig> kmQuotaConfigs;
	public KmChnConf() {
	}*/

	public BigDecimal getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
	}
	public BigDecimal getChannelTypeId() {
		return channelTypeId;
	}
	public void setChannelTypeId(BigDecimal channelTypeId) {
		this.channelTypeId = channelTypeId;
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
	public Date getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
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
	public RequestWorkflow getRequestWorkflow() {
		return requestWorkflow;
	}
	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}
	/*public List<KmQuotaConfig> getKmQuotaConfigs() {
		return kmQuotaConfigs;
	}
	public void setKmQuotaConfigs(List<KmQuotaConfig> kmQuotaConfigs) {
		this.kmQuotaConfigs = kmQuotaConfigs;
	}*/

	public long getKmChnlConfigId() {
		return kmChnlConfigId;
	}

	public void setKmChnlConfigId(long kmChnlConfigId) {
		this.kmChnlConfigId = kmChnlConfigId;
	}

	public BigDecimal getKmId() {
		return kmId;
	}

	public void setKmId(BigDecimal kmId) {
		this.kmId = kmId;
	}



}
