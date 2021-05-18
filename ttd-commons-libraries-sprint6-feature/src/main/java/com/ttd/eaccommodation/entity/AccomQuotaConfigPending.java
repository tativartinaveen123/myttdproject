package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
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

import com.ttd.eseva.entity.RequestWorkflow;


/**
 * The persistent class for the ACCOM_QUOTA_CONFIG_PENDING database table.
 * 
 */
@Entity
@Table(name="ACCOM_QUOTA_CONFIG_PENDING")
@NamedQuery(name="AccomQuotaConfigPending.findAll", query="SELECT a FROM AccomQuotaConfigPending a")
public class AccomQuotaConfigPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "ACCOM_QUOTA_CONFIG_PENDING_SEQ_GENERATOR", sequenceName = "ACCOM_QUOTA_CONFIG_PENDING_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACCOM_QUOTA_CONFIG_PENDING_SEQ_GENERATOR")
	@Column(name="ACCOM_QUOTA_CONFIG_ID")
	private long accomQuotaConfigId;

	@Column(name="ACCOM_CODE")
	private String accomCode;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOM_DATE")
	private Date accomDate;

	@Column(name="ACCOM_ID")
	private BigDecimal accomId;

	@Temporal(TemporalType.DATE)
	@Column(name="ACCOM_RELEASE_DATE")
	private Date accomReleaseDate;

	@Column(name="ACCOM_RELEASE_STATUS")
	private BigDecimal accomReleaseStatus;

	@Column(name="ACCOM_RELEASE_TYPE")
	private BigDecimal accomReleaseType;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="NO_OF_ACCOMMODATIONS")
	private BigDecimal noOfAccommodations;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="STATUS")
	private BigDecimal status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to AccomChnConf
	@ManyToOne
	@JoinColumn(name="ACCOM_CHNL_CONFIG_ID")
	private AccomChnConf accomChnConf;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	public AccomQuotaConfigPending() {
	}

	public long getAccomQuotaConfigId() {
		return this.accomQuotaConfigId;
	}

	public void setAccomQuotaConfigId(long accomQuotaConfigId) {
		this.accomQuotaConfigId = accomQuotaConfigId;
	}

	public String getAccomCode() {
		return this.accomCode;
	}

	public void setAccomCode(String accomCode) {
		this.accomCode = accomCode;
	}

	public Date getAccomDate() {
		return this.accomDate;
	}

	public void setAccomDate(Date accomDate) {
		this.accomDate = accomDate;
	}

	public BigDecimal getAccomId() {
		return this.accomId;
	}

	public void setAccomId(BigDecimal accomId) {
		this.accomId = accomId;
	}

	public Date getAccomReleaseDate() {
		return this.accomReleaseDate;
	}

	public void setAccomReleaseDate(Date accomReleaseDate) {
		this.accomReleaseDate = accomReleaseDate;
	}

	public BigDecimal getAccomReleaseStatus() {
		return this.accomReleaseStatus;
	}

	public void setAccomReleaseStatus(BigDecimal accomReleaseStatus) {
		this.accomReleaseStatus = accomReleaseStatus;
	}

	public BigDecimal getAccomReleaseType() {
		return this.accomReleaseType;
	}

	public void setAccomReleaseType(BigDecimal accomReleaseType) {
		this.accomReleaseType = accomReleaseType;
	}

	public BigDecimal getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
	}

	public BigDecimal getChannelTypeId() {
		return this.channelTypeId;
	}

	public void setChannelTypeId(BigDecimal channelTypeId) {
		this.channelTypeId = channelTypeId;
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

	public BigDecimal getNoOfAccommodations() {
		return this.noOfAccommodations;
	}

	public void setNoOfAccommodations(BigDecimal noOfAccommodations) {
		this.noOfAccommodations = noOfAccommodations;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
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

	public AccomChnConf getAccomChnConf() {
		return this.accomChnConf;
	}

	public void setAccomChnConf(AccomChnConf accomChnConf) {
		this.accomChnConf = accomChnConf;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

}