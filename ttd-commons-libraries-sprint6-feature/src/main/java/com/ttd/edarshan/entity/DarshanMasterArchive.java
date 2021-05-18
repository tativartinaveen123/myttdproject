package com.ttd.edarshan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.eseva.entity.RequestWorkflow;

/**
 * The persistent class for the DARSHAN_MASTER_ARCHIVE database table.
 * 
 */
@Entity
@Table(name = "DARSHAN_MASTER_ARCHIVE")
@NamedQuery(name = "DarshanMasterArchive.findAll", query = "SELECT d FROM DarshanMasterArchive d")
public class DarshanMasterArchive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "DARSHAN_MASTER_AID")
	private long darshanMasterAid;

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

	// bi-directional many-to-one association to DarshanMaster
	@ManyToOne
	@JoinColumn(name = "DARSHAN_TYPE_ID")
	private DarshanMaster darshanMaster;

	// bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name = "REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	public DarshanMasterArchive() {
	}

	public long getDarshanMasterAid() {
		return this.darshanMasterAid;
	}

	public void setDarshanMasterAid(long darshanMasterAid) {
		this.darshanMasterAid = darshanMasterAid;
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

	public DarshanMaster getDarshanMaster() {
		return this.darshanMaster;
	}

	public void setDarshanMaster(DarshanMaster darshanMaster) {
		this.darshanMaster = darshanMaster;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

}