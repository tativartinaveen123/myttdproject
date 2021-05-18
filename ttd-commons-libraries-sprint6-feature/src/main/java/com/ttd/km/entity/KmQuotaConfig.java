package com.ttd.km.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.eaccommodation.entity.AccomChnConf;
import com.ttd.eseva.entity.RequestWorkflow;

@Entity
@Table(name="KM_QUOTA_CONFIG")
@NamedQuery(name="kmQuotaConfig.findAll", query="SELECT a FROM KmQuotaConfig a")
public class KmQuotaConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "KM_QUOTA_CONFIG_ID_SEQ_GENERATOR", sequenceName = "KM_QUOTA_CONFIG_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "KM_QUOTA_CONFIG_ID_SEQ_GENERATOR")
	@Column(name="KM_QUOTA_CONFIG_ID")
	private long kmQuotaConfigId;


	@Temporal(TemporalType.DATE)
	@Column(name="KM_DATE")
	private Date kmDate;

	@Column(name="KM_ID")
	private BigDecimal accomId;

	@Temporal(TemporalType.DATE)
	@Column(name="KM_RELEASE_DATE")
	private Date kmReleaseDate;

	@Column(name="KM_RELEASE_STATUS")
	private BigDecimal kmReleaseStatus;

	@Column(name="KM_RELEASE_TYPE")
	private BigDecimal kmReleaseType;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="NO_OF_KM")
	private BigDecimal noOfKms;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to AccomChnConf
	/*@ManyToOne
	@JoinColumn(name="KM_CHNL_CONFIG_ID")
	private KmChnConf kmChnConf;*/

	@Column(name="KM_CHNL_CONFIG_ID")
	private BigDecimal kmChnlConfigId;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;
	public KmQuotaConfig() {
	}


	public long getKmQuotaConfigId() {
		return kmQuotaConfigId;
	}

	public void setKmQuotaConfigId(long kmQuotaConfigId) {
		this.kmQuotaConfigId = kmQuotaConfigId;
	}

	public Date getKmDate() {
		return kmDate;
	}

	public void setKmDate(Date kmDate) {
		this.kmDate = kmDate;
	}

	public BigDecimal getAccomId() {
		return accomId;
	}

	public void setAccomId(BigDecimal accomId) {
		this.accomId = accomId;
	}

	public Date getKmReleaseDate() {
		return kmReleaseDate;
	}

	public void setKmReleaseDate(Date kmReleaseDate) {
		this.kmReleaseDate = kmReleaseDate;
	}

	public BigDecimal getKmReleaseStatus() {
		return kmReleaseStatus;
	}

	public void setKmReleaseStatus(BigDecimal kmReleaseStatus) {
		this.kmReleaseStatus = kmReleaseStatus;
	}

	public BigDecimal getKmReleaseType() {
		return kmReleaseType;
	}

	public void setKmReleaseType(BigDecimal kmReleaseType) {
		this.kmReleaseType = kmReleaseType;
	}

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

	public BigDecimal getNoOfKms() {
		return noOfKms;
	}

	public void setNoOfKms(BigDecimal noOfKms) {
		this.noOfKms = noOfKms;
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


	public BigDecimal getKmChnlConfigId() {
		return kmChnlConfigId;
	}


	public void setKmChnlConfigId(BigDecimal kmChnlConfigId) {
		this.kmChnlConfigId = kmChnlConfigId;
	}


	/*public KmChnConf getKmChnConf() {
		return kmChnConf;
	}


	public void setKmChnConf(KmChnConf kmChnConf) {
		this.kmChnConf = kmChnConf;
	}*/

}
