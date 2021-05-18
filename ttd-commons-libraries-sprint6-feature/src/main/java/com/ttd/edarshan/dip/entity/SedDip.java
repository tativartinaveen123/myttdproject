package com.ttd.edarshan.dip.entity;

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

import com.ttd.edarshan.entity.SlotsMaster;


/**
 * The persistent class for the SED_DIP database table.
 * 
 */
@Entity
@Table(name="SED_DIP")
@NamedQuery(name="SedDip.findAll", query="SELECT s FROM SedDip s")
public class SedDip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SED_DIP_ID")
	private long sedDipId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="DARSHAN_DETAILS")
	private String darshanDetails;

	@Column(name="DARSHAN_NAME")
	private String darshanName;

	@Column(name="DARSHAN_PRICE_PILGRIM")
	private BigDecimal darshanPricePilgrim;

	@Column(name="SLOT_NAME")
	private String slotName;

	@Column(name="MAX_PERSONS")
	private String maxPersons;

	@Column(name="MIN_PERSONS")
	private String minPersons;

	@Column(name="NO_OF_LADDUS_PILGRIM")
	private BigDecimal noOfLaddusPilgrim;

	@Column(name="REQUEST_ID")
	private BigDecimal requestId;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@ManyToOne
	@JoinColumn(name="SED_DIP_SCHEDULE_ID")
	private SedDipSchedule sedDipSchedule;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to SlotsMaster
	@ManyToOne
	@JoinColumn(name="SLOT_ID")
	private SlotsMaster slotsMaster;
	
	@OneToMany(mappedBy="sedDip")
	private List<SedDipAvailability> sedDipAvailabilities;

	public SedDip() {
	}

	public long getSedDipId() {
		return this.sedDipId;
	}

	public void setSedDipId(long sedDipId) {
		this.sedDipId = sedDipId;
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

	

	public String getSlotName() {
		return slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
	}

	public String getMaxPersons() {
		return this.maxPersons;
	}

	public void setMaxPersons(String maxPersons) {
		this.maxPersons = maxPersons;
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

	public BigDecimal getRequestId() {
		return this.requestId;
	}

	public void setRequestId(BigDecimal requestId) {
		this.requestId = requestId;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public SedDipSchedule getSedDipSchedule() {
		return sedDipSchedule;
	}

	public void setSedDipSchedule(SedDipSchedule sedDipSchedule) {
		this.sedDipSchedule = sedDipSchedule;
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

	public SlotsMaster getSlotsMaster() {
		return this.slotsMaster;
	}

	public void setSlotsMaster(SlotsMaster slotsMaster) {
		this.slotsMaster = slotsMaster;
	}

	public List<SedDipAvailability> getSedDipAvailabilities() {
		return sedDipAvailabilities;
	}

	public void setSedDipAvailabilities(
			List<SedDipAvailability> sedDipAvailabilities) {
		this.sedDipAvailabilities = sedDipAvailabilities;
	}

}