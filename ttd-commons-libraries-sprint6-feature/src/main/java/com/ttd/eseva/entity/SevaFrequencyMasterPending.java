package com.ttd.eseva.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SEVA_FREQUENCY_MASTER_PENDING database table.
 * 
 */
@Entity
@Table(name="SEVA_FREQUENCY_MASTER_PENDING")
@NamedQuery(name="SevaFrequencyMasterPending.findAll", query="SELECT s FROM SevaFrequencyMasterPending s")
public class SevaFrequencyMasterPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEVAFRQ_PENDING_SMID_SEQ_GENERATOR", sequenceName="SEVAFRQ_PENDING_SMID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEVAFRQ_PENDING_SMID_SEQ_GENERATOR")
	@Column(name="SEVA_FRQ_MASTER_ID")
	private long sevaFrqMasterId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="REPORTING_TIME")
	private String reportingTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="SEVA_DATE")
	private Date sevaDate;

	@Column(name="SEVA_DAY")
	private String sevaDay;

	@Column(name="SEVA_TIME")
	private String sevaTime;

	private BigDecimal status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name="SEVA_ID")
	private SevaMaster sevaMaster;

	//bi-directional many-to-one association to SevaMasterPending
	@ManyToOne
	@JoinColumn(name="SEVA_MASTER_ID")
	private SevaMasterPending sevaMasterPending;

	public SevaFrequencyMasterPending() {
	}

	public long getSevaFrqMasterId() {
		return this.sevaFrqMasterId;
	}

	public void setSevaFrqMasterId(long sevaFrqMasterId) {
		this.sevaFrqMasterId = sevaFrqMasterId;
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

	public Date getSevaDate() {
		return this.sevaDate;
	}

	public void setSevaDate(Date sevaDate) {
		this.sevaDate = sevaDate;
	}

	public String getSevaDay() {
		return this.sevaDay;
	}

	public void setSevaDay(String sevaDay) {
		this.sevaDay = sevaDay;
	}

	public String getSevaTime() {
		return this.sevaTime;
	}

	public void setSevaTime(String sevaTime) {
		this.sevaTime = sevaTime;
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

	public SevaMaster getSevaMaster() {
		return this.sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

	public SevaMasterPending getSevaMasterPending() {
		return this.sevaMasterPending;
	}

	public void setSevaMasterPending(SevaMasterPending sevaMasterPending) {
		this.sevaMasterPending = sevaMasterPending;
	}

}