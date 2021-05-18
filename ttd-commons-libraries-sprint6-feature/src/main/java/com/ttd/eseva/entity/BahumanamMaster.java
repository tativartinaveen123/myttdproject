package com.ttd.eseva.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the BAHUMANAM_MASTER database table.
 * 
 */
@Entity
@Table(name="BAHUMANAM_MASTER")
@NamedQuery(name="BahumanamMaster.findAll", query="SELECT b FROM BahumanamMaster b")
public class BahumanamMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BAHUMANAM_ID")
	private long bahumanamId;

	@Column(name="BAHUMANAM_DESCRIPTION")
	private String bahumanamDescription;

	@Column(name="BAHUMANAM_NAME")
	private String bahumanamName;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to SevaBahumanam
	@OneToMany(mappedBy="bahumanamMaster")
	private List<SevaBahumanam> sevaBahumanams;

	public BahumanamMaster() {
	}

	public long getBahumanamId() {
		return this.bahumanamId;
	}

	public void setBahumanamId(long bahumanamId) {
		this.bahumanamId = bahumanamId;
	}

	public String getBahumanamDescription() {
		return this.bahumanamDescription;
	}

	public void setBahumanamDescription(String bahumanamDescription) {
		this.bahumanamDescription = bahumanamDescription;
	}

	public String getBahumanamName() {
		return this.bahumanamName;
	}

	public void setBahumanamName(String bahumanamName) {
		this.bahumanamName = bahumanamName;
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

	public List<SevaBahumanam> getSevaBahumanams() {
		return this.sevaBahumanams;
	}

	public void setSevaBahumanams(List<SevaBahumanam> sevaBahumanams) {
		this.sevaBahumanams = sevaBahumanams;
	}

	public SevaBahumanam addSevaBahumanam(SevaBahumanam sevaBahumanam) {
		getSevaBahumanams().add(sevaBahumanam);
		sevaBahumanam.setBahumanamMaster(this);

		return sevaBahumanam;
	}

	public SevaBahumanam removeSevaBahumanam(SevaBahumanam sevaBahumanam) {
		getSevaBahumanams().remove(sevaBahumanam);
		sevaBahumanam.setBahumanamMaster(null);

		return sevaBahumanam;
	}

}