package com.ttd.donor.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the DONATION_MERGE database table.
 * 
 */
@Entity
@Table(name="DONATION_MERGE")
@NamedQuery(name="DonationMerge.findAll", query="SELECT d FROM DonationMerge d")
public class DonationMerge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DONATION_MERGE_DONATIONMERGEID_GENERATOR", sequenceName="DONATION_MERGE_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DONATION_MERGE_DONATIONMERGEID_GENERATOR")
	@Column(name="DONATION_MERGE_ID")
	private long donationMergeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME" , insertable = false , updatable = false)
	private Date createdTime;

	@Column(name="DESTINATION_USER_ID")
	private BigDecimal destinationUserId;

	@Column(name="PROFILE_UPDATE_USER_ID")
	private BigDecimal profileUpdateUserId;



	@Column(name="ROW_STATUS" , insertable = false , updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SOURCE_USER_ID")
	private String sourceUserId;

	
	@Column(name="REQUESTOR_COMMENTS")
	private String requestorComments;
	
	@Column(name="APPROVER_COMMENTS")
	private String approverComments;
	
	private BigDecimal status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name = "DOC_PATH")
	private String docPath;

	public DonationMerge() {
	}

	public long getDonationMergeId() {
		return this.donationMergeId;
	}

	public void setDonationMergeId(long donationMergeId) {
		this.donationMergeId = donationMergeId;
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

	public BigDecimal getDestinationUserId() {
		return this.destinationUserId;
	}

	public void setDestinationUserId(BigDecimal destinationUserId) {
		this.destinationUserId = destinationUserId;
	}

	public BigDecimal getProfileUpdateUserId() {
		return this.profileUpdateUserId;
	}

	public void setProfileUpdateUserId(BigDecimal profileUpdateUserId) {
		this.profileUpdateUserId = profileUpdateUserId;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSourceUserId() {
		return this.sourceUserId;
	}

	public void setSourceUserId(String sourceUserId) {
		this.sourceUserId = sourceUserId;
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

	public String getRequestorComments() {
		return requestorComments;
	}

	public void setRequestorComments(String requestorComments) {
		this.requestorComments = requestorComments;
	}

	public String getApproverComments() {
		return approverComments;
	}

	public void setApproverComments(String approverComments) {
		this.approverComments = approverComments;
	}

	public String getDocPath() {
		return docPath;
	}

	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}

	
}