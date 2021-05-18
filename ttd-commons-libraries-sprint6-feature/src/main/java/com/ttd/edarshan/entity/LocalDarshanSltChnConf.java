package com.ttd.edarshan.entity;

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

import com.ttd.common.entity.ChannelMaster;
import com.ttd.eseva.entity.RequestWorkflow;

/**
* The persistent class for the LocalDarshanSltChnConf database table.
* 
*/
@Entity
@Table(name = "LOCAL_DARSHAN_SLT_CHN_CONF")
@NamedQuery(name = "LocalDarshanSltChnConf.findAll", query = "SELECT d FROM LocalDarshanSltChnConf d")
public class LocalDarshanSltChnConf implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "DARSHAN_SLT_CHN_CONFID")
	private long darshanSltChnConfid;

	@Column(name = "ACTIVE_FLAG")
	private BigDecimal activeFlag;

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

	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name = "REPORTING_TIME")
	private String reportingTime;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_FREQUENCY")
	private BigDecimal slotFrequency;

	@Column(name = "SLOT_NAME")
	private String slotName;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;
	
	
	// bi-directional many-to-one association to DarshanSlotBlock
		@OneToMany(mappedBy = "darshanSltChnConf")
		private List<DarshanSlotBlock> darshanSlotBlocks;

		// bi-directional many-to-one association to DarshanSlotBlockArchive
		@OneToMany(mappedBy = "darshanSltChnConf")
		private List<DarshanSlotBlockArchive> darshanSlotBlockArchives;

		// bi-directional many-to-one association to DarshanSlotBlockPending
		@OneToMany(mappedBy = "darshanSltChnConf")
		private List<DarshanSlotBlockPending> darshanSlotBlockPendings;

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


	public LocalDarshanSltChnConf() {
		
	}

	public long getDarshanSltChnConfid() {
		return darshanSltChnConfid;
	}

	public void setDarshanSltChnConfid(long darshanSltChnConfid) {
		this.darshanSltChnConfid = darshanSltChnConfid;
	}

	public BigDecimal getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
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

	public Date getDarshanDate() {
		return darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	public String getDarshanDay() {
		return darshanDay;
	}

	public void setDarshanDay(String darshanDay) {
		this.darshanDay = darshanDay;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getReportingTime() {
		return reportingTime;
	}

	public void setReportingTime(String reportingTime) {
		this.reportingTime = reportingTime;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getSlotFrequency() {
		return slotFrequency;
	}

	public void setSlotFrequency(BigDecimal slotFrequency) {
		this.slotFrequency = slotFrequency;
	}

	public String getSlotName() {
		return slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
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

	public List<DarshanSlotBlock> getDarshanSlotBlocks() {
		return darshanSlotBlocks;
	}

	public void setDarshanSlotBlocks(List<DarshanSlotBlock> darshanSlotBlocks) {
		this.darshanSlotBlocks = darshanSlotBlocks;
	}

	public List<DarshanSlotBlockArchive> getDarshanSlotBlockArchives() {
		return darshanSlotBlockArchives;
	}

	public void setDarshanSlotBlockArchives(List<DarshanSlotBlockArchive> darshanSlotBlockArchives) {
		this.darshanSlotBlockArchives = darshanSlotBlockArchives;
	}

	public List<DarshanSlotBlockPending> getDarshanSlotBlockPendings() {
		return darshanSlotBlockPendings;
	}

	public void setDarshanSlotBlockPendings(List<DarshanSlotBlockPending> darshanSlotBlockPendings) {
		this.darshanSlotBlockPendings = darshanSlotBlockPendings;
	}

	public ChannelMaster getChannelMaster() {
		return channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
	}

	public DarshanMaster getDarshanMaster() {
		return darshanMaster;
	}

	public void setDarshanMaster(DarshanMaster darshanMaster) {
		this.darshanMaster = darshanMaster;
	}

	public RequestWorkflow getRequestWorkflow() {
		return requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public SlotsMaster getSlotsMaster() {
		return slotsMaster;
	}

	public void setSlotsMaster(SlotsMaster slotsMaster) {
		this.slotsMaster = slotsMaster;
	}
	
	
	
	
	

}
