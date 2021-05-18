package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ttd.ehundi.entity.HundiOffering;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CURRENCY_MASTER database table.
 * 
 */
@Entity
@Table(name="CURRENCY_MASTER")
@NamedQuery(name="CurrencyMaster.findAll", query="SELECT c FROM CurrencyMaster c")
public class CurrencyMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CURRENCY_ID")
	private long currencyId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="CURRENCY_NAME")
	private String currencyName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to HundiOffering
	@OneToMany(mappedBy="currencyMaster")
	@JsonIgnore
	private List<HundiOffering> hundiOfferings;

	public CurrencyMaster() {
	}

	public long getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(long currencyId) {
		this.currencyId = currencyId;
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

	public String getCurrencyName() {
		return this.currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
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

	public List<HundiOffering> getHundiOfferings() {
		return this.hundiOfferings;
	}

	public void setHundiOfferings(List<HundiOffering> hundiOfferings) {
		this.hundiOfferings = hundiOfferings;
	}

	public HundiOffering addHundiOffering(HundiOffering hundiOffering) {
		getHundiOfferings().add(hundiOffering);
		hundiOffering.setCurrencyMaster(this);

		return hundiOffering;
	}

	public HundiOffering removeHundiOffering(HundiOffering hundiOffering) {
		getHundiOfferings().remove(hundiOffering);
		hundiOffering.setCurrencyMaster(null);

		return hundiOffering;
	}

}