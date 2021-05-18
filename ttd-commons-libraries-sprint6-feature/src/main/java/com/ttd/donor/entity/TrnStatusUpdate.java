package com.ttd.donor.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="TRN_STATUS_UPDATE")
@NamedQuery(name="TrnStatusUpdate.findAll", query="SELECT t FROM TrnStatusUpdate t")
public class TrnStatusUpdate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRN_STATUS_UPDATE_TRNSTATUSUPDATEID_GENERATOR", sequenceName="TRN_STATUS_UPDATE_ID_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRN_STATUS_UPDATE_TRNSTATUSUPDATEID_GENERATOR")
	@Column(name="TRN_STATUS_UPDATE_ID")
	private long trnStatusUpdateId;

	@Column(name="APPROVAR_COMMENTS")
	private String approvarComments;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="OFFERING_ID")
	private String offeringId;

	@Column(name="REQUESTER_COMMENTS")
	private String requesterComments;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SERVICE_TYPE")
	private String serviceType;

	private String status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public TrnStatusUpdate() {
	}

	public long getTrnStatusUpdateId() {
		return this.trnStatusUpdateId;
	}

	public void setTrnStatusUpdateId(long trnStatusUpdateId) {
		this.trnStatusUpdateId = trnStatusUpdateId;
	}

	public String getApprovarComments() {
		return this.approvarComments;
	}

	public void setApprovarComments(String approvarComments) {
		this.approvarComments = approvarComments;
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

	public String getOfferingId() {
		return this.offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

	public String getRequesterComments() {
		return this.requesterComments;
	}

	public void setRequesterComments(String requesterComments) {
		this.requesterComments = requesterComments;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getServiceType() {
		return this.serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
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

}