package com.ttd.eseva.entity;

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

import com.ttd.common.entity.ChannelMaster;


/**
 * The persistent class for the SEVA_QUOTA_CONFIG_PENDING database table.
 * 
 */
@Entity
@Table(name="SEVA_QUOTA_CONFIG_PENDING")
@NamedQuery(name="SevaQuotaConfigPending.findAll", query="SELECT s FROM SevaQuotaConfigPending s")
public class SevaQuotaConfigPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEVA_QUOTA_CONFIG_PENDING_ID_GENERATOR", sequenceName="SEVA_QUOTA_CONFIG_PENDING_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEVA_QUOTA_CONFIG_PENDING_ID_GENERATOR")
	@Column(name="SEVA_QUOTACONFIG_PENDING_ID")
	private long sevaQuotaconfigPendingId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="NO_OF_SEVAS")
	private BigDecimal noOfSevas;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="SEVA_DATE")
	private Date sevaDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="SEVA_RELEASE_DATE")
	private Date sevaReleaseDate;

	private BigDecimal status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name="SEVA_ID")
	private SevaMaster sevaMaster;

	public SevaQuotaConfigPending() {
	}

	public long getSevaQuotaconfigPendingId() {
		return this.sevaQuotaconfigPendingId;
	}

	public void setSevaQuotaconfigPendingId(long sevaQuotaconfigPendingId) {
		this.sevaQuotaconfigPendingId = sevaQuotaconfigPendingId;
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

	public Date getSevaDate() {
		return this.sevaDate;
	}

	public void setSevaDate(Date sevaDate) {
		this.sevaDate = sevaDate;
	}

	public Date getSevaReleaseDate() {
		return this.sevaReleaseDate;
	}

	public void setSevaReleaseDate(Date sevaReleaseDate) {
		this.sevaReleaseDate = sevaReleaseDate;
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

	public ChannelMaster getChannelMaster() {
		return this.channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public SevaMaster getSevaMaster() {
		return this.sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

}