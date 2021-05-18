package com.ttd.eseva.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ServiceNote;
import com.ttd.common.entity.ServiceTypeMaster;


/**
 * The persistent class for the REQUEST_TYPE_MASTER database table.
 * 
 */
@Entity
@Table(name="REQUEST_TYPE_MASTER")
@NamedQuery(name="RequestTypeMaster.findAll", query="SELECT r FROM RequestTypeMaster r")
public class RequestTypeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="REQUEST_TYPE_ID")
	private long requestTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="REQUEST_TYPE_NAME")
	private String requestTypeName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to RequestApprovalPrivilege
	@OneToMany(mappedBy="requestTypeMaster")
	private List<RequestApprovalPrivilege> requestApprovalPrivileges;

	//bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name="SERVICE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	//bi-directional many-to-one association to RequestWorkflow
	@OneToMany(mappedBy="requestTypeMaster")
	private List<RequestWorkflow> requestWorkflows;

	//bi-directional many-to-one association to ServiceChannelRulesConfig
	@OneToMany(mappedBy="requestTypeMaster")
	private List<ServiceChannelRulesConfig> serviceChannelRulesConfigs;

	//bi-directional many-to-one association to ServiceNote
	@OneToMany(mappedBy="requestTypeMaster")
	private List<ServiceNote> serviceNotes;

	//bi-directional many-to-one association to SevaChannelRulesConfig
	@OneToMany(mappedBy="requestTypeMaster")
	private List<SevaChannelRulesConfig> sevaChannelRulesConfigs;

	public RequestTypeMaster() {
	}

	public long getRequestTypeId() {
		return this.requestTypeId;
	}

	public void setRequestTypeId(long requestTypeId) {
		this.requestTypeId = requestTypeId;
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

	public String getRequestTypeName() {
		return this.requestTypeName;
	}

	public void setRequestTypeName(String requestTypeName) {
		this.requestTypeName = requestTypeName;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
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

	public List<RequestApprovalPrivilege> getRequestApprovalPrivileges() {
		return this.requestApprovalPrivileges;
	}

	public void setRequestApprovalPrivileges(List<RequestApprovalPrivilege> requestApprovalPrivileges) {
		this.requestApprovalPrivileges = requestApprovalPrivileges;
	}

	public RequestApprovalPrivilege addRequestApprovalPrivilege(RequestApprovalPrivilege requestApprovalPrivilege) {
		getRequestApprovalPrivileges().add(requestApprovalPrivilege);
		requestApprovalPrivilege.setRequestTypeMaster(this);

		return requestApprovalPrivilege;
	}

	public RequestApprovalPrivilege removeRequestApprovalPrivilege(RequestApprovalPrivilege requestApprovalPrivilege) {
		getRequestApprovalPrivileges().remove(requestApprovalPrivilege);
		requestApprovalPrivilege.setRequestTypeMaster(null);

		return requestApprovalPrivilege;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public List<RequestWorkflow> getRequestWorkflows() {
		return this.requestWorkflows;
	}

	public void setRequestWorkflows(List<RequestWorkflow> requestWorkflows) {
		this.requestWorkflows = requestWorkflows;
	}

	public RequestWorkflow addRequestWorkflow(RequestWorkflow requestWorkflow) {
		getRequestWorkflows().add(requestWorkflow);
		requestWorkflow.setRequestTypeMaster(this);

		return requestWorkflow;
	}

	public RequestWorkflow removeRequestWorkflow(RequestWorkflow requestWorkflow) {
		getRequestWorkflows().remove(requestWorkflow);
		requestWorkflow.setRequestTypeMaster(null);

		return requestWorkflow;
	}

	public List<ServiceChannelRulesConfig> getServiceChannelRulesConfigs() {
		return this.serviceChannelRulesConfigs;
	}

	public void setServiceChannelRulesConfigs(List<ServiceChannelRulesConfig> serviceChannelRulesConfigs) {
		this.serviceChannelRulesConfigs = serviceChannelRulesConfigs;
	}

	public ServiceChannelRulesConfig addServiceChannelRulesConfig(ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().add(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setRequestTypeMaster(this);

		return serviceChannelRulesConfig;
	}

	public ServiceChannelRulesConfig removeServiceChannelRulesConfig(ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().remove(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setRequestTypeMaster(null);

		return serviceChannelRulesConfig;
	}

	public List<ServiceNote> getServiceNotes() {
		return this.serviceNotes;
	}

	public void setServiceNotes(List<ServiceNote> serviceNotes) {
		this.serviceNotes = serviceNotes;
	}

	public ServiceNote addServiceNote(ServiceNote serviceNote) {
		getServiceNotes().add(serviceNote);
		serviceNote.setRequestTypeMaster(this);

		return serviceNote;
	}

	public ServiceNote removeServiceNote(ServiceNote serviceNote) {
		getServiceNotes().remove(serviceNote);
		serviceNote.setRequestTypeMaster(null);

		return serviceNote;
	}

	public List<SevaChannelRulesConfig> getSevaChannelRulesConfigs() {
		return this.sevaChannelRulesConfigs;
	}

	public void setSevaChannelRulesConfigs(List<SevaChannelRulesConfig> sevaChannelRulesConfigs) {
		this.sevaChannelRulesConfigs = sevaChannelRulesConfigs;
	}

	public SevaChannelRulesConfig addSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().add(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setRequestTypeMaster(this);

		return sevaChannelRulesConfig;
	}

	public SevaChannelRulesConfig removeSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().remove(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setRequestTypeMaster(null);

		return sevaChannelRulesConfig;
	}

}