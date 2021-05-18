package com.ttd.edarshan.entity;

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
 * The persistent class for the DARSHAN_MASTER database table.
 * 
 */
@Entity
@Table(name = "DARSHAN_MASTER")
@NamedQuery(name = "DarshanMaster.findAll", query = "SELECT d FROM DarshanMaster d")
public class DarshanMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DARSHAN_TYPE_ID")
	private long darshanTypeId;

	@Column(name = "ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name = "ADDITIONAL_LADDUS_PILGRIM")
	private BigDecimal additionalLaddusPilgrim;

	@Column(name = "ADDITIONAL_LADDUS_PRICE")
	private BigDecimal additionalLaddusPrice;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "DARSHAN_DETAILS")
	private String darshanDetails;

	@Column(name = "DARSHAN_NAME")
	private String darshanName;

	@Column(name = "DARSHAN_PRICE_PILGRIM")
	private BigDecimal darshanPricePilgrim;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name = "MAX_HUNDI_OFFERING")
	private BigDecimal maxHundiOffering;

	@Column(name = "MAX_NO_OF_LADDUS")
	private BigDecimal maxNoOfLaddus;

	@Column(name = "MAX_PERSONS")
	private String maxPersons;

	@Column(name = "MIN_HUNDI_OFFERING")
	private BigDecimal minHundiOffering;

	@Column(name = "MIN_PERSONS")
	private String minPersons;

	@Column(name = "NO_OF_LADDUS_PILGRIM")
	private BigDecimal noOfLaddusPilgrim;

	private String remarks;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name = "REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	// bi-directional many-to-one association to DarshanMasterArchive
	@OneToMany(mappedBy = "darshanMaster")
	private List<DarshanMasterArchive> darshanMasterArchives;

	// bi-directional many-to-one association to DarshanMasterPending
	@OneToMany(mappedBy = "darshanMaster")
	private List<DarshanMasterPending> darshanMasterPendings;

	// bi-directional many-to-one association to DarshanQuotaConfigArchive
	@OneToMany(mappedBy = "darshanMaster")
	private List<DarshanQuotaConfigArchive> darshanQuotaConfigArchives;

	// bi-directional many-to-one association to DarshanQuotaConfigPending
	@OneToMany(mappedBy = "darshanMaster")
	private List<DarshanQuotaConfigPending> darshanQuotaConfigPendings;

	// bi-directional many-to-one association to DarshanSltChnConf
	@OneToMany(mappedBy = "darshanMaster")
	private List<DarshanSltChnConf> darshanSltChnConfs;

	// bi-directional many-to-one association to DarshanSltChnConfArchive
	@OneToMany(mappedBy = "darshanMaster")
	private List<DarshanSltChnConfArchive> darshanSltChnConfArchives;

	// bi-directional many-to-one association to DarshanSltChnConfPending
	@OneToMany(mappedBy = "darshanMaster")
	private List<DarshanSltChnConfPending> darshanSltChnConfPendings;

	public DarshanMaster() {
	}

	public long getDarshanTypeId() {
		return this.darshanTypeId;
	}

	public void setDarshanTypeId(long darshanTypeId) {
		this.darshanTypeId = darshanTypeId;
	}

	public BigDecimal getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
	}

	public BigDecimal getAdditionalLaddusPilgrim() {
		return this.additionalLaddusPilgrim;
	}

	public void setAdditionalLaddusPilgrim(BigDecimal additionalLaddusPilgrim) {
		this.additionalLaddusPilgrim = additionalLaddusPilgrim;
	}

	public BigDecimal getAdditionalLaddusPrice() {
		return this.additionalLaddusPrice;
	}

	public void setAdditionalLaddusPrice(BigDecimal additionalLaddusPrice) {
		this.additionalLaddusPrice = additionalLaddusPrice;
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

	public String getDarshanDetails() {
		return this.darshanDetails;
	}

	public void setDarshanDetails(String darshanDetails) {
		this.darshanDetails = darshanDetails;
	}

	public String getDarshanName() {
		return this.darshanName;
	}

	public void setDarshanName(String darshanName) {
		this.darshanName = darshanName;
	}

	public BigDecimal getDarshanPricePilgrim() {
		return this.darshanPricePilgrim;
	}

	public void setDarshanPricePilgrim(BigDecimal darshanPricePilgrim) {
		this.darshanPricePilgrim = darshanPricePilgrim;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public BigDecimal getMaxHundiOffering() {
		return this.maxHundiOffering;
	}

	public void setMaxHundiOffering(BigDecimal maxHundiOffering) {
		this.maxHundiOffering = maxHundiOffering;
	}

	public BigDecimal getMaxNoOfLaddus() {
		return this.maxNoOfLaddus;
	}

	public void setMaxNoOfLaddus(BigDecimal maxNoOfLaddus) {
		this.maxNoOfLaddus = maxNoOfLaddus;
	}

	public String getMaxPersons() {
		return this.maxPersons;
	}

	public void setMaxPersons(String maxPersons) {
		this.maxPersons = maxPersons;
	}

	public BigDecimal getMinHundiOffering() {
		return this.minHundiOffering;
	}

	public void setMinHundiOffering(BigDecimal minHundiOffering) {
		this.minHundiOffering = minHundiOffering;
	}

	public String getMinPersons() {
		return this.minPersons;
	}

	public void setMinPersons(String minPersons) {
		this.minPersons = minPersons;
	}

	public BigDecimal getNoOfLaddusPilgrim() {
		return this.noOfLaddusPilgrim;
	}

	public void setNoOfLaddusPilgrim(BigDecimal noOfLaddusPilgrim) {
		this.noOfLaddusPilgrim = noOfLaddusPilgrim;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public List<DarshanMasterArchive> getDarshanMasterArchives() {
		return this.darshanMasterArchives;
	}

	public void setDarshanMasterArchives(
			List<DarshanMasterArchive> darshanMasterArchives) {
		this.darshanMasterArchives = darshanMasterArchives;
	}

	public DarshanMasterArchive addDarshanMasterArchive(
			DarshanMasterArchive darshanMasterArchive) {
		getDarshanMasterArchives().add(darshanMasterArchive);
		darshanMasterArchive.setDarshanMaster(this);

		return darshanMasterArchive;
	}

	public DarshanMasterArchive removeDarshanMasterArchive(
			DarshanMasterArchive darshanMasterArchive) {
		getDarshanMasterArchives().remove(darshanMasterArchive);
		darshanMasterArchive.setDarshanMaster(null);

		return darshanMasterArchive;
	}

	public List<DarshanMasterPending> getDarshanMasterPendings() {
		return this.darshanMasterPendings;
	}

	public void setDarshanMasterPendings(
			List<DarshanMasterPending> darshanMasterPendings) {
		this.darshanMasterPendings = darshanMasterPendings;
	}

	public DarshanMasterPending addDarshanMasterPending(
			DarshanMasterPending darshanMasterPending) {
		getDarshanMasterPendings().add(darshanMasterPending);
		darshanMasterPending.setDarshanMaster(this);

		return darshanMasterPending;
	}

	public DarshanMasterPending removeDarshanMasterPending(
			DarshanMasterPending darshanMasterPending) {
		getDarshanMasterPendings().remove(darshanMasterPending);
		darshanMasterPending.setDarshanMaster(null);

		return darshanMasterPending;
	}

	public List<DarshanQuotaConfigArchive> getDarshanQuotaConfigArchives() {
		return this.darshanQuotaConfigArchives;
	}

	public void setDarshanQuotaConfigArchives(
			List<DarshanQuotaConfigArchive> darshanQuotaConfigArchives) {
		this.darshanQuotaConfigArchives = darshanQuotaConfigArchives;
	}

	public DarshanQuotaConfigArchive addDarshanQuotaConfigArchive(
			DarshanQuotaConfigArchive darshanQuotaConfigArchive) {
		getDarshanQuotaConfigArchives().add(darshanQuotaConfigArchive);
		darshanQuotaConfigArchive.setDarshanMaster(this);

		return darshanQuotaConfigArchive;
	}

	public DarshanQuotaConfigArchive removeDarshanQuotaConfigArchive(
			DarshanQuotaConfigArchive darshanQuotaConfigArchive) {
		getDarshanQuotaConfigArchives().remove(darshanQuotaConfigArchive);
		darshanQuotaConfigArchive.setDarshanMaster(null);

		return darshanQuotaConfigArchive;
	}

	public List<DarshanQuotaConfigPending> getDarshanQuotaConfigPendings() {
		return this.darshanQuotaConfigPendings;
	}

	public void setDarshanQuotaConfigPendings(
			List<DarshanQuotaConfigPending> darshanQuotaConfigPendings) {
		this.darshanQuotaConfigPendings = darshanQuotaConfigPendings;
	}

	public DarshanQuotaConfigPending addDarshanQuotaConfigPending(
			DarshanQuotaConfigPending darshanQuotaConfigPending) {
		getDarshanQuotaConfigPendings().add(darshanQuotaConfigPending);
		darshanQuotaConfigPending.setDarshanMaster(this);

		return darshanQuotaConfigPending;
	}

	public DarshanQuotaConfigPending removeDarshanQuotaConfigPending(
			DarshanQuotaConfigPending darshanQuotaConfigPending) {
		getDarshanQuotaConfigPendings().remove(darshanQuotaConfigPending);
		darshanQuotaConfigPending.setDarshanMaster(null);

		return darshanQuotaConfigPending;
	}

	public List<DarshanSltChnConf> getDarshanSltChnConfs() {
		return this.darshanSltChnConfs;
	}

	public void setDarshanSltChnConfs(List<DarshanSltChnConf> darshanSltChnConfs) {
		this.darshanSltChnConfs = darshanSltChnConfs;
	}

	public DarshanSltChnConf addDarshanSltChnConf(
			DarshanSltChnConf darshanSltChnConf) {
		getDarshanSltChnConfs().add(darshanSltChnConf);
		darshanSltChnConf.setDarshanMaster(this);

		return darshanSltChnConf;
	}

	public DarshanSltChnConf removeDarshanSltChnConf(
			DarshanSltChnConf darshanSltChnConf) {
		getDarshanSltChnConfs().remove(darshanSltChnConf);
		darshanSltChnConf.setDarshanMaster(null);

		return darshanSltChnConf;
	}

	public List<DarshanSltChnConfArchive> getDarshanSltChnConfArchives() {
		return this.darshanSltChnConfArchives;
	}

	public void setDarshanSltChnConfArchives(
			List<DarshanSltChnConfArchive> darshanSltChnConfArchives) {
		this.darshanSltChnConfArchives = darshanSltChnConfArchives;
	}

	public DarshanSltChnConfArchive addDarshanSltChnConfArchive(
			DarshanSltChnConfArchive darshanSltChnConfArchive) {
		getDarshanSltChnConfArchives().add(darshanSltChnConfArchive);
		darshanSltChnConfArchive.setDarshanMaster(this);

		return darshanSltChnConfArchive;
	}

	public DarshanSltChnConfArchive removeDarshanSltChnConfArchive(
			DarshanSltChnConfArchive darshanSltChnConfArchive) {
		getDarshanSltChnConfArchives().remove(darshanSltChnConfArchive);
		darshanSltChnConfArchive.setDarshanMaster(null);

		return darshanSltChnConfArchive;
	}

	public List<DarshanSltChnConfPending> getDarshanSltChnConfPendings() {
		return this.darshanSltChnConfPendings;
	}

	public void setDarshanSltChnConfPendings(
			List<DarshanSltChnConfPending> darshanSltChnConfPendings) {
		this.darshanSltChnConfPendings = darshanSltChnConfPendings;
	}

	public DarshanSltChnConfPending addDarshanSltChnConfPending(
			DarshanSltChnConfPending darshanSltChnConfPending) {
		getDarshanSltChnConfPendings().add(darshanSltChnConfPending);
		darshanSltChnConfPending.setDarshanMaster(this);

		return darshanSltChnConfPending;
	}

	public DarshanSltChnConfPending removeDarshanSltChnConfPending(
			DarshanSltChnConfPending darshanSltChnConfPending) {
		getDarshanSltChnConfPendings().remove(darshanSltChnConfPending);
		darshanSltChnConfPending.setDarshanMaster(null);

		return darshanSltChnConfPending;
	}

}