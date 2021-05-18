package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ACCOM_LOCATION_MASTER database table.
 * 
 */
@Entity
@Table(name="ACCOM_LOCATION_MASTER")
@NamedQuery(name="AccomLocationMaster.findAll", query="SELECT a FROM AccomLocationMaster a")
public class AccomLocationMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="LOCATION_ID")
	private long locationId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="LOCATION_NAME")
	private String locationName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to AccomGuesthouseMaster
	@OneToMany(mappedBy="accomLocationMaster")
	private List<AccomGuesthouseMaster> accomGuesthouseMasters;

	//bi-directional many-to-one association to AccomMaster
	@OneToMany(mappedBy="accomLocationMaster")
	private List<AccomMaster> accomMasters;

	public AccomLocationMaster() {
	}

	public long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(long locationId) {
		this.locationId = locationId;
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

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
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

	public List<AccomGuesthouseMaster> getAccomGuesthouseMasters() {
		return this.accomGuesthouseMasters;
	}

	public void setAccomGuesthouseMasters(List<AccomGuesthouseMaster> accomGuesthouseMasters) {
		this.accomGuesthouseMasters = accomGuesthouseMasters;
	}

	public AccomGuesthouseMaster addAccomGuesthouseMaster(AccomGuesthouseMaster accomGuesthouseMaster) {
		getAccomGuesthouseMasters().add(accomGuesthouseMaster);
		accomGuesthouseMaster.setAccomLocationMaster(this);

		return accomGuesthouseMaster;
	}

	public AccomGuesthouseMaster removeAccomGuesthouseMaster(AccomGuesthouseMaster accomGuesthouseMaster) {
		getAccomGuesthouseMasters().remove(accomGuesthouseMaster);
		accomGuesthouseMaster.setAccomLocationMaster(null);

		return accomGuesthouseMaster;
	}

	public List<AccomMaster> getAccomMasters() {
		return this.accomMasters;
	}

	public void setAccomMasters(List<AccomMaster> accomMasters) {
		this.accomMasters = accomMasters;
	}

	public AccomMaster addAccomMaster(AccomMaster accomMaster) {
		getAccomMasters().add(accomMaster);
		accomMaster.setAccomLocationMaster(this);

		return accomMaster;
	}

	public AccomMaster removeAccomMaster(AccomMaster accomMaster) {
		getAccomMasters().remove(accomMaster);
		accomMaster.setAccomLocationMaster(null);

		return accomMaster;
	}

}