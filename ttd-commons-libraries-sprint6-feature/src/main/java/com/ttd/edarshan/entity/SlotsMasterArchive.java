package com.ttd.edarshan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.eseva.entity.RequestWorkflow;

/**
 * The persistent class for the SLOTS_MASTER_ARCHIVE database table.
 * 
 */
@Entity
@Table(name = "SLOTS_MASTER_ARCHIVE")
@NamedQuery(name = "SlotsMasterArchive.findAll", query = "SELECT s FROM SlotsMasterArchive s")
public class SlotsMasterArchive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SLOTS_MASTER_AID")
	private long slotsMasterAid;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name = "LEGACY_SLOT_ID")
	private BigDecimal legacySlotId;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_BEGIN_TIME")
	private String slotBeginTime;

	@Column(name = "SLOT_END_TIME")
	private String slotEndTime;

	@Column(name = "SLOT_NAME")
	private String slotName;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name = "REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	// bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name = "SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	// bi-directional many-to-one association to SlotsMaster
	@ManyToOne
	@JoinColumn(name = "SLOT_ID")
	private SlotsMaster slotsMaster;

	public SlotsMasterArchive() {
	}

	public long getSlotsMasterAid() {
		return this.slotsMasterAid;
	}

	public void setSlotsMasterAid(long slotsMasterAid) {
		this.slotsMasterAid = slotsMasterAid;
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

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public BigDecimal getLegacySlotId() {
		return this.legacySlotId;
	}

	public void setLegacySlotId(BigDecimal legacySlotId) {
		this.legacySlotId = legacySlotId;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSlotBeginTime() {
		return this.slotBeginTime;
	}

	public void setSlotBeginTime(String slotBeginTime) {
		this.slotBeginTime = slotBeginTime;
	}

	public String getSlotEndTime() {
		return this.slotEndTime;
	}

	public void setSlotEndTime(String slotEndTime) {
		this.slotEndTime = slotEndTime;
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

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public SlotsMaster getSlotsMaster() {
		return this.slotsMaster;
	}

	public void setSlotsMaster(SlotsMaster slotsMaster) {
		this.slotsMaster = slotsMaster;
	}

}