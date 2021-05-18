package com.ttd.common.entity;

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

import com.ttd.eseva.entity.RequestTypeMaster;
import com.ttd.eseva.entity.RequestWorkflow;
import com.ttd.eseva.entity.RulesMaster;


/**
 * The persistent class for the SERVICE_NOTES database table.
 * 
 */
@Entity
@Table(name="SERVICE_NOTES")
@NamedQuery(name="ServiceNote.findAll", query="SELECT s FROM ServiceNote s")
public class ServiceNote implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SERVICE_NOTES_ID_GENERATOR", sequenceName="SERVICE_NOTE_NOTE_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SERVICE_NOTES_ID_GENERATOR")
	private long id;

	@Column(name="\"ACTION\"")
	private Long action;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="NOTES_DESCRIPTION")
	private String notesDescription;

	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	private long status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to CommonValueMaster
	@ManyToOne
	@JoinColumn(name="SERVICE_SUBTYPE")
	private CommonValueMaster commonValueMaster1;

	//bi-directional many-to-one association to CommonValueMaster
	@ManyToOne
	@JoinColumn(name="NOTES_TYPE")
	private CommonValueMaster commonValueMaster2;

	//bi-directional many-to-one association to RequestTypeMaster
	@ManyToOne
	@JoinColumn(name="REQUEST_TYPE_ID")
	private RequestTypeMaster requestTypeMaster;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to RulesMaster
	@ManyToOne
	@JoinColumn(name="RULE_ID")
	private RulesMaster rulesMaster;

	//bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	public ServiceNote() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getAction() {
		return this.action;
	}

	public void setAction(Long action) {
		
		this.action = action;
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

	public String getNotesDescription() {
		return this.notesDescription;
	}

	public void setNotesDescription(String notesDescription) {
		this.notesDescription = notesDescription;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public long getStatus() {
		return this.status;
	}

	public void setStatus(long status) {
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

	public CommonValueMaster getCommonValueMaster1() {
		return this.commonValueMaster1;
	}

	public void setCommonValueMaster1(CommonValueMaster commonValueMaster1) {
		this.commonValueMaster1 = commonValueMaster1;
	}

	public CommonValueMaster getCommonValueMaster2() {
		return this.commonValueMaster2;
	}

	public void setCommonValueMaster2(CommonValueMaster commonValueMaster2) {
		this.commonValueMaster2 = commonValueMaster2;
	}

	public RequestTypeMaster getRequestTypeMaster() {
		return this.requestTypeMaster;
	}

	public void setRequestTypeMaster(RequestTypeMaster requestTypeMaster) {
		this.requestTypeMaster = requestTypeMaster;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public RulesMaster getRulesMaster() {
		return this.rulesMaster;
	}

	public void setRulesMaster(RulesMaster rulesMaster) {
		this.rulesMaster = rulesMaster;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

}