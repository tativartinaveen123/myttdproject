package com.ttd.eseva.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SEVA_BAHUMANAMS_PENDING database table.
 * 
 */
@Entity
@Table(name="SEVA_BAHUMANAMS_PENDING")
@NamedQuery(name="SevaBahumanamsPending.findAll", query="SELECT s FROM SevaBahumanamsPending s")
public class SevaBahumanamsPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEVABAHUM_PENDING_SMID_SEQ_GENERATOR", sequenceName="SEVABAHUM_PENDING_SMID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEVABAHUM_PENDING_SMID_SEQ_GENERATOR")
	@Column(name="SEVA_BAHUMANAMS_ID")
	private long sevaBahumanamsId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SEVA_ID")
	private long sevaId;

	private BigDecimal status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="VALUE_1")
	private String value1;

	//bi-directional many-to-one association to BahumanamMaster
	@ManyToOne
	@JoinColumn(name="BAHUMANAMS_ID")
	private BahumanamMaster bahumanamMaster;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to SevaMasterPending
	@ManyToOne
	@JoinColumn(name="SEVA_MASTER_ID")
	private SevaMasterPending sevaMasterPending;

	public SevaBahumanamsPending() {
	}

	public long getSevaBahumanamsId() {
		return this.sevaBahumanamsId;
	}

	public void setSevaBahumanamsId(long sevaBahumanamsId) {
		this.sevaBahumanamsId = sevaBahumanamsId;
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

	public long getSevaId() {
		return this.sevaId;
	}

	public void setSevaId(long sevaId) {
		this.sevaId = sevaId;
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

	public String getValue1() {
		return this.value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public BahumanamMaster getBahumanamMaster() {
		return this.bahumanamMaster;
	}

	public void setBahumanamMaster(BahumanamMaster bahumanamMaster) {
		this.bahumanamMaster = bahumanamMaster;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public SevaMasterPending getSevaMasterPending() {
		return this.sevaMasterPending;
	}

	public void setSevaMasterPending(SevaMasterPending sevaMasterPending) {
		this.sevaMasterPending = sevaMasterPending;
	}

}