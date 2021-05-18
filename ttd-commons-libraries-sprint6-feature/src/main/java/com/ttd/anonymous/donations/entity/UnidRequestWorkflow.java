package com.ttd.anonymous.donations.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.User;
import com.ttd.eseva.entity.RequestTypeMaster;
import com.ttd.eseva.entity.RequestWorkflow;


@Entity
@Table(name = "UNID_REQUEST_WORKFLOW")
@NamedQuery(name = "UnidRequestWorkflow.findAll", query = "SELECT r FROM UnidRequestWorkflow r")
public class UnidRequestWorkflow implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id																						
	@SequenceGenerator(name = "REQUEST_WORKFLOW_REQUEST_ID_GENERATOR", sequenceName = "REQUEST_WORKFLOW_REQUEST_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REQUEST_WORKFLOW_REQUEST_ID_GENERATOR")
	@Column(name = "REQUEST_ID")
	private long requestId;

	@Temporal(TemporalType.DATE)
	@Column(name = "ACTION_DATE")
	private Date actionDate;

	@Column(name = "APPROVAR_COMMENTS")
	private String approvarComments;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUESTED_DATE", insertable = false)
	private Date requestedDate;

	@Column(name = "REQUESTER_COMMENTS")
	private String requesterComments;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "STATUS_CODE")
	private BigDecimal statusCode;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;
	
	@ManyToOne
	@JoinColumn(name = "REQUEST_TYPE_ID")
	private RequestTypeMaster requestTypeMaster;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "REQUESTER_USER_ID")
	private User user2;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "APPORVER_USER_ID")
	private User user1;
	
	
	//bi-directional many-to-one association to unidRequestWorkflows
	/*@OneToMany(mappedBy="requestTypeMaster")
	private List<UnidRequestWorkflow> unidRequestWorkflows;*/
	
	
	
	public UnidRequestWorkflow() {
	}

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public Date getActionDate() {
		return actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	public String getApprovarComments() {
		return approvarComments;
	}

	public void setApprovarComments(String approvarComments) {
		this.approvarComments = approvarComments;
	}

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getRequestedDate() {
		return requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public String getRequesterComments() {
		return requesterComments;
	}

	public void setRequesterComments(String requesterComments) {
		this.requesterComments = requesterComments;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(BigDecimal statusCode) {
		this.statusCode = statusCode;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}
	
	// bi-directional many-to-one association to RequestTypeMaster
	

		public RequestTypeMaster getRequestTypeMaster() {
			return requestTypeMaster;
		}

		public void setRequestTypeMaster(RequestTypeMaster requestTypeMaster) {
			this.requestTypeMaster = requestTypeMaster;
		}

		public User getUser2() {
			return user2;
		}

		public void setUser2(User user2) {
			this.user2 = user2;
		}

		public User getUser1() {
			return user1;
		}

		public void setUser1(User user1) {
			this.user1 = user1;
		}

		/*public List<UnidRequestWorkflow> getUnidRequestWorkflows() {
			return unidRequestWorkflows;
		}

		public void setUnidRequestWorkflows(List<UnidRequestWorkflow> unidRequestWorkflows) {
			this.unidRequestWorkflows = unidRequestWorkflows;
		}
		*/
		
		
		

}
