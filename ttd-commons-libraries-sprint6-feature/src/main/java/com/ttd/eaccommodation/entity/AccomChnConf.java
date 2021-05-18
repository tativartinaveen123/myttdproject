package com.ttd.eaccommodation.entity;

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

import com.ttd.eseva.entity.RequestWorkflow;


/**
 * The persistent class for the ACCOM_CHN_CONF database table.
 * 
 */
@Entity
@Table(name="ACCOM_CHN_CONF")
@NamedQuery(name="AccomChnConf.findAll", query="SELECT a FROM AccomChnConf a")
public class AccomChnConf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCOM_CHNL_CONFIG_ID")
	private long accomChnlConfigId;

	@Column(name="ACCOM_CODE")
	private String accomCode;

	@Column(name="ACCOM_ID")
	private BigDecimal accomId;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to AccomQuotaConfig
	@OneToMany(mappedBy="accomChnConf")
	private List<AccomQuotaConfig> accomQuotaConfigs;

	//bi-directional many-to-one association to AccomQuotaConfigPending
	@OneToMany(mappedBy="accomChnConf")
	private List<AccomQuotaConfigPending> accomQuotaConfigPendings;

	public AccomChnConf() {
	}

	public long getAccomChnlConfigId() {
		return this.accomChnlConfigId;
	}

	public void setAccomChnlConfigId(long accomChnlConfigId) {
		this.accomChnlConfigId = accomChnlConfigId;
	}

	public String getAccomCode() {
		return this.accomCode;
	}

	public void setAccomCode(String accomCode) {
		this.accomCode = accomCode;
	}

	public BigDecimal getAccomId() {
		return this.accomId;
	}

	public void setAccomId(BigDecimal accomId) {
		this.accomId = accomId;
	}

	public BigDecimal getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
	}

	public BigDecimal getChannelTypeId() {
		return this.channelTypeId;
	}

	public void setChannelTypeId(BigDecimal channelTypeId) {
		this.channelTypeId = channelTypeId;
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

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
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

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public List<AccomQuotaConfig> getAccomQuotaConfigs() {
		return this.accomQuotaConfigs;
	}

	public void setAccomQuotaConfigs(List<AccomQuotaConfig> accomQuotaConfigs) {
		this.accomQuotaConfigs = accomQuotaConfigs;
	}

	public AccomQuotaConfig addAccomQuotaConfig(AccomQuotaConfig accomQuotaConfig) {
		getAccomQuotaConfigs().add(accomQuotaConfig);
		accomQuotaConfig.setAccomChnConf(this);

		return accomQuotaConfig;
	}

	public AccomQuotaConfig removeAccomQuotaConfig(AccomQuotaConfig accomQuotaConfig) {
		getAccomQuotaConfigs().remove(accomQuotaConfig);
		accomQuotaConfig.setAccomChnConf(null);

		return accomQuotaConfig;
	}

	public List<AccomQuotaConfigPending> getAccomQuotaConfigPendings() {
		return this.accomQuotaConfigPendings;
	}

	public void setAccomQuotaConfigPendings(List<AccomQuotaConfigPending> accomQuotaConfigPendings) {
		this.accomQuotaConfigPendings = accomQuotaConfigPendings;
	}

	public AccomQuotaConfigPending addAccomQuotaConfigPending(AccomQuotaConfigPending accomQuotaConfigPending) {
		getAccomQuotaConfigPendings().add(accomQuotaConfigPending);
		accomQuotaConfigPending.setAccomChnConf(this);

		return accomQuotaConfigPending;
	}

	public AccomQuotaConfigPending removeAccomQuotaConfigPending(AccomQuotaConfigPending accomQuotaConfigPending) {
		getAccomQuotaConfigPendings().remove(accomQuotaConfigPending);
		accomQuotaConfigPending.setAccomChnConf(null);

		return accomQuotaConfigPending;
	}

}