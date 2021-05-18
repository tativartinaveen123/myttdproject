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

import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.eseva.entity.RequestWorkflow;

/**
 * The persistent class for the SLOTS_MASTER_PENDING database table.
 * 
 */
@Entity
@Table(name = "SLOTS_MASTER_PENDING")
@NamedQuery(name = "SlotsMasterPending.findAll", query = "SELECT s FROM SlotsMasterPending s")
public class SlotsMasterPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SLOTS_MASTER_PPID_SEQ_GENERATOR", sequenceName = "SLOTS_MASTER_PPID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SLOTS_MASTER_PPID_SEQ_GENERATOR")
	@Column(name = "SLOTS_MASTER_PID")
	private long slotsMasterPid;

	@Id
	@SequenceGenerator(name = "SLOT_MASTER_SLOT_ID_SEQ_GENERATOR", sequenceName = "SLOT_MASTER_SLOT_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SLOT_MASTER_SLOT_ID_SEQ_GENERATOR")
	@Column(name= "SLOT_ID")
	private long slotId;
	
	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_BEGIN_TIME")
	private String slotBeginTime;

	@Column(name = "SLOT_END_TIME")
	private String slotEndTime;

	@Column(name = "SLOT_NAME")
	private String slotName;

	private BigDecimal status;

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
//	@ManyToOne
//	@JoinColumn(name = "SLOT_ID")
//	private SlotsMaster slotsMaster;

	public SlotsMasterPending() {
	}

	public long getSlotsMasterPid() {
		return this.slotsMasterPid;
	}

	public void setSlotsMasterPid(long slotsMasterPid) {
		this.slotsMasterPid = slotsMasterPid;
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

//	public SlotsMaster getSlotsMaster() {
//		return this.slotsMaster;
//	}
//
//	public void setSlotsMaster(SlotsMaster slotsMaster) {
//		this.slotsMaster = slotsMaster;
//	}

	public long getSlotId() {
		return slotId;
	}

	public void setSlotId(long slotId) {
		this.slotId = slotId;
	}
	

}