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

import com.ttd.eseva.entity.RequestWorkflow;

/**
 * The persistent class for the DARSHAN_SLOT_BLOCK_PENDING database table.
 * 
 */
@Entity
@Table(name = "DARSHAN_SLOT_BLOCK_PENDING")
@NamedQuery(name = "DarshanSlotBlockPending.findAll", query = "SELECT d FROM DarshanSlotBlockPending d")
public class DarshanSlotBlockPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DARSHAN_SLOT_BLOCK_PPID_SEQ_GENERATOR", sequenceName = "DARSHAN_SLOT_BLOCK_PPID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DARSHAN_SLOT_BLOCK_PPID_SEQ_GENERATOR")
	@Column(name = "DARSHAN_SLOT_BLOCK_PID")
	private long darshanSlotBlockPid;

	@Column(name = "BLOCK_REASON")
	private String blockReason;

	@Column(name = "CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "DARSHAN_DATE")
	private Date darshanDate;

	@Column(name = "DARSHAN_SLOT_BLOCK_ID")
	private BigDecimal darshanSlotBlockId;

	@Column(name = "DARSHAN_TYPE_ID")
	private BigDecimal darshanTypeId;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_ID")
	private BigDecimal slotId;

	@Column(name = "SLOT_NAME")
	private String slotName;

	private BigDecimal status;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to DarshanSltChnConf
	@ManyToOne
	@JoinColumn(name = "DARSHAN_SLT_CHN_CONFID")
	private DarshanSltChnConf darshanSltChnConf;

	// bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name = "REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	public DarshanSlotBlockPending() {
	}

	public long getDarshanSlotBlockPid() {
		return this.darshanSlotBlockPid;
	}

	public void setDarshanSlotBlockPid(long darshanSlotBlockPid) {
		this.darshanSlotBlockPid = darshanSlotBlockPid;
	}

	public String getBlockReason() {
		return this.blockReason;
	}

	public void setBlockReason(String blockReason) {
		this.blockReason = blockReason;
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

	public Date getDarshanDate() {
		return this.darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	public BigDecimal getDarshanSlotBlockId() {
		return this.darshanSlotBlockId;
	}

	public void setDarshanSlotBlockId(BigDecimal darshanSlotBlockId) {
		this.darshanSlotBlockId = darshanSlotBlockId;
	}

	public BigDecimal getDarshanTypeId() {
		return this.darshanTypeId;
	}

	public void setDarshanTypeId(BigDecimal darshanTypeId) {
		this.darshanTypeId = darshanTypeId;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getSlotId() {
		return this.slotId;
	}

	public void setSlotId(BigDecimal slotId) {
		this.slotId = slotId;
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

	public DarshanSltChnConf getDarshanSltChnConf() {
		return this.darshanSltChnConf;
	}

	public void setDarshanSltChnConf(DarshanSltChnConf darshanSltChnConf) {
		this.darshanSltChnConf = darshanSltChnConf;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

}