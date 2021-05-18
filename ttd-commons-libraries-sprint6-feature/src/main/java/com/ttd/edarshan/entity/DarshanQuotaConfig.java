package com.ttd.edarshan.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.eseva.entity.RequestWorkflow;

/**
 * The persistent class for the DARSHAN_QUOTA_CONFIG database table.
 * 
 */
@Entity
@Table(name = "DARSHAN_QUOTA_CONFIG")
@NamedQuery(name = "DarshanQuotaConfig.findAll", query = "SELECT d FROM DarshanQuotaConfig d")
public class DarshanQuotaConfig implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "DARSHAN_QUOTA_CONFIG_ID_SEQ_GENERATOR", sequenceName = "DARSHAN_QUOTA_CONFIG_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DARSHAN_QUOTA_CONFIG_ID_SEQ_GENERATOR")
	@Column(name = "DARSHAN_QUOTA_CONFIG_ID")
	private long darshanQuotaConfigId;

	@Column(name = "CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "DARSHAN_DATE")
	private Date darshanDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DARSHAN_RELEASE_DATE")
	private Date darshanReleaseDate;

	@Column(name = "DARSHAN_RELEASE_STATUS")
	private BigDecimal darshanReleaseStatus;

	@Column(name = "DARSHAN_RELEASE_TYPE")
	private BigDecimal darshanReleaseType;

	@Column(name = "DARSHAN_TYPE_ID")
	private BigDecimal darshanTypeId;

	@Column(name = "NO_OF_DARSHANS")
	private BigDecimal noOfDarshans;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_ID")
	private BigDecimal slotId;

	@Column(name = "SLOT_NAME")
	private String slotName;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to DarshanAvailability
	@OneToMany(mappedBy = "darshanQuotaConfig")
	private List<DarshanAvailability> darshanAvailabilities;


	// bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name = "REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	public DarshanQuotaConfig() {
	}

	public long getDarshanQuotaConfigId() {
		return this.darshanQuotaConfigId;
	}

	public void setDarshanQuotaConfigId(long darshanQuotaConfigId) {
		this.darshanQuotaConfigId = darshanQuotaConfigId;
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

	public Date getDarshanDate() {
		return this.darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	public Date getDarshanReleaseDate() {
		return this.darshanReleaseDate;
	}

	public void setDarshanReleaseDate(Date darshanReleaseDate) {
		this.darshanReleaseDate = darshanReleaseDate;
	}

	public BigDecimal getDarshanReleaseStatus() {
		return this.darshanReleaseStatus;
	}

	public void setDarshanReleaseStatus(BigDecimal darshanReleaseStatus) {
		this.darshanReleaseStatus = darshanReleaseStatus;
	}

	public BigDecimal getDarshanReleaseType() {
		return this.darshanReleaseType;
	}

	public void setDarshanReleaseType(BigDecimal darshanReleaseType) {
		this.darshanReleaseType = darshanReleaseType;
	}

	public BigDecimal getDarshanTypeId() {
		return this.darshanTypeId;
	}

	public void setDarshanTypeId(BigDecimal darshanTypeId) {
		this.darshanTypeId = darshanTypeId;
	}

	public BigDecimal getNoOfDarshans() {
		return this.noOfDarshans;
	}

	public void setNoOfDarshans(BigDecimal noOfDarshans) {
		this.noOfDarshans = noOfDarshans;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getSlotId() {
		return this.slotId;
	}

	public void setSlotId(BigDecimal slotId) {
		this.slotId = slotId;
	}

	public String getSlotName() {
		return this.slotName;
	}

	public void setSlotName(String slotName) {
		this.slotName = slotName;
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

	public List<DarshanAvailability> getDarshanAvailabilities() {
		return this.darshanAvailabilities;
	}

	public void setDarshanAvailabilities(
			List<DarshanAvailability> darshanAvailabilities) {
		this.darshanAvailabilities = darshanAvailabilities;
	}

	public DarshanAvailability addDarshanAvailability(
			DarshanAvailability darshanAvailability) {
		getDarshanAvailabilities().add(darshanAvailability);
		darshanAvailability.setDarshanQuotaConfig(this);

		return darshanAvailability;
	}

	public DarshanAvailability removeDarshanAvailability(
			DarshanAvailability darshanAvailability) {
		getDarshanAvailabilities().remove(darshanAvailability);
		darshanAvailability.setDarshanQuotaConfig(null);

		return darshanAvailability;
	}


	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

}