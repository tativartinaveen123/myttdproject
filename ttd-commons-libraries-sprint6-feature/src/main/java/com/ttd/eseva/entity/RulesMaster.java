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
 * The persistent class for the RULES_MASTER database table.
 * 
 */
@Entity
@Table(name="RULES_MASTER")
@NamedQuery(name="RulesMaster.findAll", query="SELECT r FROM RulesMaster r")
public class RulesMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RULE_ID")
	private long ruleId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="RULE_APPLICABLE")
	private String ruleApplicable;

	@Column(name="RULE_DESCRIPTION")
	private String ruleDescription;

	@Column(name="RULE_NAME")
	private String ruleName;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	//bi-directional many-to-one association to ServiceChannelRulesConfig
	@OneToMany(mappedBy="rulesMaster")
	private List<ServiceChannelRulesConfig> serviceChannelRulesConfigs;

	//bi-directional many-to-one association to ServiceNote
	@OneToMany(mappedBy="rulesMaster")
	private List<ServiceNote> serviceNotes;

	//bi-directional many-to-one association to SevaChannelRulesConfig
	@OneToMany(mappedBy="rulesMaster")
	private List<SevaChannelRulesConfig> sevaChannelRulesConfigs;

	public RulesMaster() {
	}

	public long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(long ruleId) {
		this.ruleId = ruleId;
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

	public String getRuleApplicable() {
		return this.ruleApplicable;
	}

	public void setRuleApplicable(String ruleApplicable) {
		this.ruleApplicable = ruleApplicable;
	}

	public String getRuleDescription() {
		return this.ruleDescription;
	}

	public void setRuleDescription(String ruleDescription) {
		this.ruleDescription = ruleDescription;
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
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

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public List<ServiceChannelRulesConfig> getServiceChannelRulesConfigs() {
		return this.serviceChannelRulesConfigs;
	}

	public void setServiceChannelRulesConfigs(List<ServiceChannelRulesConfig> serviceChannelRulesConfigs) {
		this.serviceChannelRulesConfigs = serviceChannelRulesConfigs;
	}

	public ServiceChannelRulesConfig addServiceChannelRulesConfig(ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().add(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setRulesMaster(this);

		return serviceChannelRulesConfig;
	}

	public ServiceChannelRulesConfig removeServiceChannelRulesConfig(ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().remove(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setRulesMaster(null);

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
		serviceNote.setRulesMaster(this);

		return serviceNote;
	}

	public ServiceNote removeServiceNote(ServiceNote serviceNote) {
		getServiceNotes().remove(serviceNote);
		serviceNote.setRulesMaster(null);

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
		sevaChannelRulesConfig.setRulesMaster(this);

		return sevaChannelRulesConfig;
	}

	public SevaChannelRulesConfig removeSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().remove(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setRulesMaster(null);

		return sevaChannelRulesConfig;
	}

}