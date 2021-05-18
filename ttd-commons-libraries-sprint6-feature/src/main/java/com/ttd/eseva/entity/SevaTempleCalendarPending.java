package com.ttd.eseva.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SEVA_TEMPLE_CALENDAR_PENDING database table.
 * 
 */
@Entity
@Table(name="SEVA_TEMPLE_CALENDAR_PENDING")
@NamedQuery(name="SevaTempleCalendarPending.findAll", query="SELECT s FROM SevaTempleCalendarPending s")
public class SevaTempleCalendarPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEVATEMP_CALEPENDING_SEQ_GENERATOR", sequenceName = "SEVATEMP_CALEPENDING_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEVATEMP_CALEPENDING_SEQ_GENERATOR")
	@Column(name="SEVA_TEMPCAL_PENDING_ID")
	private long sevaTempcalPendingId;

	@Temporal(TemporalType.DATE)
	@Column(name="BLOCKED_DATE")
	private Date blockedDate;

	@Column(name="BLOCKED_REASON")
	private String blockedReason;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS",insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="TEMPCAL_STATUS")
	private BigDecimal tempcalStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name="SEVA_ID")
	private SevaMaster sevaMaster;

	public SevaTempleCalendarPending() {
	}

	public long getSevaTempcalPendingId() {
		return this.sevaTempcalPendingId;
	}

	public void setSevaTempcalPendingId(long sevaTempcalPendingId) {
		this.sevaTempcalPendingId = sevaTempcalPendingId;
	}

	public Date getBlockedDate() {
		return this.blockedDate;
	}

	public void setBlockedDate(Date blockedDate) {
		this.blockedDate = blockedDate;
	}

	public String getBlockedReason() {
		return this.blockedReason;
	}

	public void setBlockedReason(String blockedReason) {
		this.blockedReason = blockedReason;
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

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getTempcalStatus() {
		return this.tempcalStatus;
	}

	public void setTempcalStatus(BigDecimal tempcalStatus) {
		this.tempcalStatus = tempcalStatus;
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

	public SevaMaster getSevaMaster() {
		return this.sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

}