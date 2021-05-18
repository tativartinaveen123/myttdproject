package com.ttd.edarshan.entity;

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

import com.ttd.common.entity.ChannelMaster;
import com.ttd.eseva.entity.RequestWorkflow;

/**
 * The persistent class for the DARSHAN_SLT_CHN_CONF_PENDING database table.
 * 
 */
@Entity
@Table(name = "DARSHAN_SLT_CHN_CONF_PENDING")
@NamedQuery(name = "DarshanSltChnConfPending.findAll", query = "SELECT d FROM DarshanSltChnConfPending d")
public class DarshanSltChnConfPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DARSHAN_SLT_CHN_CONF_PPID_SEQ_GENERATOR", sequenceName = "DARSHAN_SLT_CHN_CONF_PPID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DARSHAN_SLT_CHN_CONF_PPID_SEQ_GENERATOR")
	@Column(name = "DARSHAN_SLT_CHN_CONF_PID")
	private long darshanSltChnConfPid;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "DARSHAN_DATE")
	private Date darshanDate;

	@Column(name = "DARSHAN_DAY")
	private String darshanDay;

	@Column(name = "DARSHAN_SLT_CHN_CONFID")
	private BigDecimal darshanSltChnConfid;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name = "REPORTING_TIME")
	private String reportingTime;

	@Column(name = "ROW_STATUS", insertable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_FREQUENCY")
	private BigDecimal slotFrequency;

	@Column(name = "SLOT_NAME")
	private String slotName;

	private BigDecimal status;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name = "CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	// bi-directional many-to-one association to DarshanMaster
	@ManyToOne
	@JoinColumn(name = "DARSHAN_TYPE_ID")
	private DarshanMaster darshanMaster;

	// bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name = "REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	// bi-directional many-to-one association to SlotsMaster
	@ManyToOne
	@JoinColumn(name = "SLOT_ID")
	private SlotsMaster slotsMaster;

	public DarshanSltChnConfPending() {
	}

	public long getDarshanSltChnConfPid() {
		return this.darshanSltChnConfPid;
	}

	public void setDarshanSltChnConfPid(long darshanSltChnConfPid) {
		this.darshanSltChnConfPid = darshanSltChnConfPid;
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

	public Date getDarshanDate() {
		return this.darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	public String getDarshanDay() {
		return this.darshanDay;
	}

	public void setDarshanDay(String darshanDay) {
		this.darshanDay = darshanDay;
	}

	public BigDecimal getDarshanSltChnConfid() {
		return this.darshanSltChnConfid;
	}

	public void setDarshanSltChnConfid(BigDecimal darshanSltChnConfid) {
		this.darshanSltChnConfid = darshanSltChnConfid;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getReportingTime() {
		return this.reportingTime;
	}

	public void setReportingTime(String reportingTime) {
		this.reportingTime = reportingTime;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getSlotFrequency() {
		return this.slotFrequency;
	}

	public void setSlotFrequency(BigDecimal slotFrequency) {
		this.slotFrequency = slotFrequency;
	}

	public String getSlotName() {
		return this.slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
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

	public DarshanMaster getDarshanMaster() {
		return this.darshanMaster;
	}

	public void setDarshanMaster(DarshanMaster darshanMaster) {
		this.darshanMaster = darshanMaster;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public SlotsMaster getSlotsMaster() {
		return this.slotsMaster;
	}

	public void setSlotsMaster(SlotsMaster slotsMaster) {
		this.slotsMaster = slotsMaster;
	}

}