package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the DONATION_DETAILS_WORKFLOW database table.
 * 
 */
@Entity
@Table(name = "DONATION_DETAILS_WORKFLOW")
@NamedQuery(name = "DonationDetailsWorkflow.findAll", query = "SELECT d FROM DonationDetailsWorkflow d")
public class DonationDetailsWorkflow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DONATION_DETAILS_WORKFLOW_DONATION_REQUEST_ID_GENERATOR", sequenceName = "DONATION_DETAILS_WORKFLOW_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DONATION_DETAILS_WORKFLOW_DONATION_REQUEST_ID_GENERATOR")
	@Column(name = "DONATION_REQUEST_ID")
	private long donationRequestId;

	@Column(name = "APPROVAR_COMMENTS")
	private String approvarComments;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;
	
	@Column(name = "JOINT_ID_PROOF_TYPE")
	private BigDecimal jointIdProofType;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name = "JOINT_USER_ID")
	private BigDecimal jointUserId;

	@Column(name = "NEW_TYPE")
	private String newType;

	@Column(name = "OLD_TYPE")
	private String oldType;

	@Column(name = "REQUESTER_COMMENTS")
	private String requesterComments;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "USER_ID")
	private BigDecimal userId;

	@Column(name = "OFFERING_ID")
	private String offeringId;

	@Column(name = "OLD_JOINT_USER_ID")
	private String oldJointUserId;
	
	@Column(name="OFFERING_AMOUNT")
	private BigDecimal offeringAmount;
	
	@Column(name = "SERVICE_TYPE")
	private String serviceType;
	
	@Column(name = "DOC_PATH")
	private String docPath;


	public BigDecimal getOfferingAmount() {
		return offeringAmount;
	}

	public void setOfferingAmount(BigDecimal offeringAmount) {
		this.offeringAmount = offeringAmount;
	}

	public DonationDetailsWorkflow() {
	}

	@OneToMany(mappedBy = "donationDetailsWorkflow", cascade = CascadeType.ALL)
	private List<DonationInstDetail> donationInstDetails;

	public long getDonationRequestId() {
		return this.donationRequestId;
	}

	public void setDonationRequestId(long donationRequestId) {
		this.donationRequestId = donationRequestId;
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

	public BigDecimal getJointUserId() {
		return this.jointUserId;
	}

	public void setJointUserId(BigDecimal jointUserId) {
		this.jointUserId = jointUserId;
	}

	public String getNewType() {
		return this.newType;
	}

	public void setNewType(String newType) {
		this.newType = newType;
	}

	public String getOldType() {
		return this.oldType;
	}

	public void setOldType(String oldType) {
		this.oldType = oldType;
	}

	public String getRequesterComments() {
		return this.requesterComments;
	}

	public void setRequesterComments(String requesterComments) {
		this.requesterComments = requesterComments;
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

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOfferingId() {
		return offeringId;
	}

	public void setOfferingId(String offeringId) {
		this.offeringId = offeringId;
	}

	public String getOldJointUserId() {
		return oldJointUserId;
	}

	public void setOldJointUserId(String oldJointUserId) {
		this.oldJointUserId = oldJointUserId;
	}

	public List<DonationInstDetail> getDonationInstDetails() {
		return this.donationInstDetails;
	}

	public void setDonationInstDetails(
			List<DonationInstDetail> donationInstDetails) {
		this.donationInstDetails = donationInstDetails;
	}
	
	public BigDecimal getJointIdProofType() {
		return jointIdProofType;
	}

	public void setJointIdProofType(BigDecimal jointIdProofType) {
		this.jointIdProofType = jointIdProofType;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public String getDocPath() {
		return docPath;
	}

	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}
}