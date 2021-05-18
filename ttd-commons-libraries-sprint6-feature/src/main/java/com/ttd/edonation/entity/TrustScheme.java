package com.ttd.edonation.entity;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the TRUST_SCHEMES database table.
 * 
 */
@Entity
@Table(name = "TRUST_SCHEMES")
@NamedQuery(name = "TrustScheme.findAll", query = "SELECT t FROM TrustScheme t")
public class TrustScheme implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "TRUST_SCHEMES_TRUSTSCHEMEID_GENERATOR", sequenceName = "TRUST_SCHEMES_TRUST_SCHEME_ID", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRUST_SCHEMES_TRUSTSCHEMEID_GENERATOR")
	@Column(name = "TRUST_SCHEME_ID")
	private long trustSchemeId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME")
	private Date createdTime;

	@Column(name = "ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name = "TRUST_SCHEME_NAME")
	private String trustSchemeName;

	@Column(name = "TRUST_SCHEME_OBJECTS")
	private String trustSchemeObjects;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to TrustMaster
//	@ManyToOne
//	@JoinColumn(name = "TRUST_ID", nullable = true)
//	@JsonIgnore
//	private TrustMaster trustMaster;

	public TrustScheme() {
	}

	public long getTrustSchemeId() {
		return this.trustSchemeId;
	}

	public void setTrustSchemeId(long trustSchemeId) {
		this.trustSchemeId = trustSchemeId;
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

	public String getTrustSchemeName() {
		return this.trustSchemeName;
	}

	public void setTrustSchemeName(String trustSchemeName) {
		this.trustSchemeName = trustSchemeName;
	}

	public String getTrustSchemeObjects() {
		return this.trustSchemeObjects;
	}

	public void setTrustSchemeObjects(String trustSchemeObjects) {
		this.trustSchemeObjects = trustSchemeObjects;
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

//	public TrustMaster getTrustMaster() {
//		return this.trustMaster;
//	}
//
//	public void setTrustMaster(TrustMaster trustMaster) {
//		this.trustMaster = trustMaster;
//	}

	@Override
	public String toString() {
		return "id=" + trustSchemeId + ", TRUST_SCHEME=" + trustSchemeName;
	}
}
