package com.ttd.eseva.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
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

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.ServiceTypeMaster;


/**
 * The persistent class for the SEVA_CHANNEL_RULES_CONFIG database table.
 * 
 */
@Entity
@Table(name="SEVA_CHANNEL_RULES_CONFIG")
@NamedQuery(name="SevaChannelRulesConfig.findAll", query="SELECT s FROM SevaChannelRulesConfig s")
public class SevaChannelRulesConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEVA_CHANNEL_CONFIG_ID_GENERATOR", sequenceName="SEVA_CHANNEL_CONFIG_SEVA_CHANN", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEVA_CHANNEL_CONFIG_ID_GENERATOR")
	@Column(name="SEVA_CHANNEL_CONFIG_ID")
	private long sevaChannelConfigId;

	@Column(name="\"ACTION\"")
	private BigDecimal action;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	private long status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="VALUE_1")
	private String value1;

	@Column(name="VALUE_2")
	private String value2;

	//bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	//bi-directional many-to-one association to RequestTypeMaster
	@ManyToOne
	@JoinColumn(name="REQUEST_TYPE_ID")
	private RequestTypeMaster requestTypeMaster;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne(cascade = CascadeType.ALL)
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

	//bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name="SEVA_ID")
	private SevaMaster sevaMaster;

	public SevaChannelRulesConfig() {
	}

	public long getSevaChannelConfigId() {
		return this.sevaChannelConfigId;
	}

	public void setSevaChannelConfigId(long sevaChannelConfigId) {
		this.sevaChannelConfigId = sevaChannelConfigId;
	}

	public BigDecimal getAction() {
		return this.action;
	}

	public void setAction(BigDecimal action) {
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

	public String getValue1() {
		return this.value1;
	}

	public void setValue1(String value1) {
		this.value1 = value1;
	}

	public String getValue2() {
		return this.value2;
	}

	public void setValue2(String value2) {
		this.value2 = value2;
	}

	public ChannelMaster getChannelMaster() {
		return this.channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
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

	public SevaMaster getSevaMaster() {
		return this.sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

}