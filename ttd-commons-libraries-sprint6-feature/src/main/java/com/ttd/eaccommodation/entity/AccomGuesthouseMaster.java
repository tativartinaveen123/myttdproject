package com.ttd.eaccommodation.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ACCOM_GUESTHOUSE_MASTER database table.
 * 
 */
@Entity
@Table(name="ACCOM_GUESTHOUSE_MASTER")
@NamedQuery(name="AccomGuesthouseMaster.findAll", query="SELECT a FROM AccomGuesthouseMaster a")
public class AccomGuesthouseMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="GUESTHOUSE_ID")
	private long guesthouseId;

	private String address1;

	private String address2;

	private String city;

	private String country;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="GUESTHOUSE_NAME")
	private String guesthouseName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="\"STATE\"")
	private String state;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="ZIP_CODE")
	private String zipCode;

	//bi-directional many-to-one association to AccomLocationMaster
	@ManyToOne
	@JoinColumn(name="LOCATION_ID")
	private AccomLocationMaster accomLocationMaster;

	//bi-directional many-to-one association to AccomMaster
	@OneToMany(mappedBy="accomGuesthouseMaster")
	private List<AccomMaster> accomMasters;

	public AccomGuesthouseMaster() {
	}

	public long getGuesthouseId() {
		return this.guesthouseId;
	}

	public void setGuesthouseId(long guesthouseId) {
		this.guesthouseId = guesthouseId;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getGuesthouseName() {
		return this.guesthouseName;
	}

	public void setGuesthouseName(String guesthouseName) {
		this.guesthouseName = guesthouseName;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public AccomLocationMaster getAccomLocationMaster() {
		return this.accomLocationMaster;
	}

	public void setAccomLocationMaster(AccomLocationMaster accomLocationMaster) {
		this.accomLocationMaster = accomLocationMaster;
	}

	public List<AccomMaster> getAccomMasters() {
		return this.accomMasters;
	}

	public void setAccomMasters(List<AccomMaster> accomMasters) {
		this.accomMasters = accomMasters;
	}

	public AccomMaster addAccomMaster(AccomMaster accomMaster) {
		getAccomMasters().add(accomMaster);
		accomMaster.setAccomGuesthouseMaster(this);

		return accomMaster;
	}

	public AccomMaster removeAccomMaster(AccomMaster accomMaster) {
		getAccomMasters().remove(accomMaster);
		accomMaster.setAccomGuesthouseMaster(null);

		return accomMaster;
	}

}