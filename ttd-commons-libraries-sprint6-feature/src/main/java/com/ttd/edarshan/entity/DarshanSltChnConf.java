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
 * The persistent class for the DARSHAN_SLT_CHN_CONF database table.
 * 
 */
@Entity
@Table(name = "DARSHAN_SLT_CHN_CONF")
@NamedQuery(name = "DarshanSltChnConf.findAll", query = "SELECT d FROM DarshanSltChnConf d")
public class DarshanSltChnConf implements Serializable {
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

/*	// bi-directional many-to-one association to DarshanQuotaConfig
	@OneToMany(mappedBy = "darshanSltChnConf")
	private List<DarshanQuotaConfig> darshanQuotaConfigs;*/

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

	public DarshanSltChnConf() {
	}

	public long getDarshanSltChnConfid() {
		return this.darshanSltChnConfid;
	}

	public void setDarshanSltChnConfid(long darshanSltChnConfid) {
		this.darshanSltChnConfid = darshanSltChnConfid;
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

//	public List<DarshanQuotaConfig> getDarshanQuotaConfigs() {
//		return this.darshanQuotaConfigs;
//	}
//
//	public void setDarshanQuotaConfigs(
//			List<DarshanQuotaConfig> darshanQuotaConfigs) {
//		this.darshanQuotaConfigs = darshanQuotaConfigs;
//	}

	/*public DarshanQuotaConfig addDarshanQuotaConfig(
			DarshanQuotaConfig darshanQuotaConfig) {
		getDarshanQuotaConfigs().add(darshanQuotaConfig);
		darshanQuotaConfig.setDarshanSltChnConf(this);

		return darshanQuotaConfig;
	}

	public DarshanQuotaConfig removeDarshanQuotaConfig(
			DarshanQuotaConfig darshanQuotaConfig) {
		getDarshanQuotaConfigs().remove(darshanQuotaConfig);
		darshanQuotaConfig.setDarshanSltChnConf(null);

		return darshanQuotaConfig;
	}*/

	public List<DarshanSlotBlock> getDarshanSlotBlocks() {
		return this.darshanSlotBlocks;
	}

	public void setDarshanSlotBlocks(List<DarshanSlotBlock> darshanSlotBlocks) {
		this.darshanSlotBlocks = darshanSlotBlocks;
	}

	public DarshanSlotBlock addDarshanSlotBlock(
			DarshanSlotBlock darshanSlotBlock) {
		getDarshanSlotBlocks().add(darshanSlotBlock);
		darshanSlotBlock.setDarshanSltChnConf(this);

		return darshanSlotBlock;
	}

	public DarshanSlotBlock removeDarshanSlotBlock(
			DarshanSlotBlock darshanSlotBlock) {
		getDarshanSlotBlocks().remove(darshanSlotBlock);
		darshanSlotBlock.setDarshanSltChnConf(null);

		return darshanSlotBlock;
	}

	public List<DarshanSlotBlockArchive> getDarshanSlotBlockArchives() {
		return this.darshanSlotBlockArchives;
	}

	public void setDarshanSlotBlockArchives(
			List<DarshanSlotBlockArchive> darshanSlotBlockArchives) {
		this.darshanSlotBlockArchives = darshanSlotBlockArchives;
	}

	public DarshanSlotBlockArchive addDarshanSlotBlockArchive(
			DarshanSlotBlockArchive darshanSlotBlockArchive) {
		getDarshanSlotBlockArchives().add(darshanSlotBlockArchive);
		darshanSlotBlockArchive.setDarshanSltChnConf(this);

		return darshanSlotBlockArchive;
	}

	public DarshanSlotBlockArchive removeDarshanSlotBlockArchive(
			DarshanSlotBlockArchive darshanSlotBlockArchive) {
		getDarshanSlotBlockArchives().remove(darshanSlotBlockArchive);
		darshanSlotBlockArchive.setDarshanSltChnConf(null);

		return darshanSlotBlockArchive;
	}

	public List<DarshanSlotBlockPending> getDarshanSlotBlockPendings() {
		return this.darshanSlotBlockPendings;
	}

	public void setDarshanSlotBlockPendings(
			List<DarshanSlotBlockPending> darshanSlotBlockPendings) {
		this.darshanSlotBlockPendings = darshanSlotBlockPendings;
	}

	public DarshanSlotBlockPending addDarshanSlotBlockPending(
			DarshanSlotBlockPending darshanSlotBlockPending) {
		getDarshanSlotBlockPendings().add(darshanSlotBlockPending);
		darshanSlotBlockPending.setDarshanSltChnConf(this);

		return darshanSlotBlockPending;
	}

	public DarshanSlotBlockPending removeDarshanSlotBlockPending(
			DarshanSlotBlockPending darshanSlotBlockPending) {
		getDarshanSlotBlockPendings().remove(darshanSlotBlockPending);
		darshanSlotBlockPending.setDarshanSltChnConf(null);

		return darshanSlotBlockPending;
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