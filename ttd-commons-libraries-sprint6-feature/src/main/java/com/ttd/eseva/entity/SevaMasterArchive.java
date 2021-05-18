package com.ttd.eseva.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SEVA_MASTER_ARCHIVE database table.
 * 
 */
@Entity
@Table(name="SEVA_MASTER_ARCHIVE")
@NamedQuery(name="SevaMasterArchive.findAll", query="SELECT s FROM SevaMasterArchive s")
public class SevaMasterArchive implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEVAMASTER_ARCHIVE_SMID_SEQ_GENERATOR", sequenceName="SEVAMASTER_ARCHIVE_SMID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEVAMASTER_ARCHIVE_SMID_SEQ_GENERATOR")
	@Column(name="SEVA_MASTER_ID")
	private long sevaMasterId;

	@Column(name="ACTIVE_FLAG")
	private BigDecimal activeFlag;

	private BigDecimal couple;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="MAX_PERSONS")
	private BigDecimal maxPersons;

	@Column(name="MIN_PERSONS")
	private BigDecimal minPersons;

	@Column(name="NO_OF_SEVA")
	private BigDecimal noOfSeva;

	@Column(name="REPORTING_TIME")
	private String reportingTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SEVA_DETAILS")
	private String sevaDetails;

	@Column(name="SEVA_END_TIME")
	private String sevaEndTime;

	@Column(name="SEVA_FREQUENCY")
	private BigDecimal sevaFrequency;

	@Column(name="SEVA_NAME")
	private String sevaName;

	@Column(name="SEVA_PRICE")
	private BigDecimal sevaPrice;

	@Column(name="SEVA_START_TIME")
	private String sevaStartTime;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to SevaBahumanamsArchive
	@OneToMany(mappedBy="sevaMasterArchive")
	private List<SevaBahumanamsArchive> sevaBahumanamsArchives;

	//bi-directional many-to-one association to SevaChannelMasterArchive
	@OneToMany(mappedBy="sevaMasterArchive")
	private List<SevaChannelMasterArchive> sevaChannelMasterArchives;

	//bi-directional many-to-one association to SevaFrequencyMasterArchive
	@OneToMany(mappedBy="sevaMasterArchive")
	private List<SevaFrequencyMasterArchive> sevaFrequencyMasterArchives;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name="SEVA_ID")
	private SevaMaster sevaMaster;

	public SevaMasterArchive() {
	}

	public long getSevaMasterId() {
		return this.sevaMasterId;
	}

	public void setSevaMasterId(long sevaMasterId) {
		this.sevaMasterId = sevaMasterId;
	}

	public BigDecimal getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
	}

	public BigDecimal getCouple() {
		return this.couple;
	}

	public void setCouple(BigDecimal couple) {
		this.couple = couple;
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

	public BigDecimal getMaxPersons() {
		return this.maxPersons;
	}

	public void setMaxPersons(BigDecimal maxPersons) {
		this.maxPersons = maxPersons;
	}

	public BigDecimal getMinPersons() {
		return this.minPersons;
	}

	public void setMinPersons(BigDecimal minPersons) {
		this.minPersons = minPersons;
	}

	public BigDecimal getNoOfSeva() {
		return this.noOfSeva;
	}

	public void setNoOfSeva(BigDecimal noOfSeva) {
		this.noOfSeva = noOfSeva;
	}

	public String getReportingTime() {
		return this.reportingTime;
	}

	public void setReportingTime(String reportingTime) {
		this.reportingTime = reportingTime;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSevaDetails() {
		return this.sevaDetails;
	}

	public void setSevaDetails(String sevaDetails) {
		this.sevaDetails = sevaDetails;
	}

	public String getSevaEndTime() {
		return this.sevaEndTime;
	}

	public void setSevaEndTime(String sevaEndTime) {
		this.sevaEndTime = sevaEndTime;
	}

	public BigDecimal getSevaFrequency() {
		return this.sevaFrequency;
	}

	public void setSevaFrequency(BigDecimal sevaFrequency) {
		this.sevaFrequency = sevaFrequency;
	}

	public String getSevaName() {
		return this.sevaName;
	}

	public void setSevaName(String sevaName) {
		this.sevaName = sevaName;
	}

	public BigDecimal getSevaPrice() {
		return this.sevaPrice;
	}

	public void setSevaPrice(BigDecimal sevaPrice) {
		this.sevaPrice = sevaPrice;
	}

	public String getSevaStartTime() {
		return this.sevaStartTime;
	}

	public void setSevaStartTime(String sevaStartTime) {
		this.sevaStartTime = sevaStartTime;
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

	public List<SevaBahumanamsArchive> getSevaBahumanamsArchives() {
		return this.sevaBahumanamsArchives;
	}

	public void setSevaBahumanamsArchives(List<SevaBahumanamsArchive> sevaBahumanamsArchives) {
		this.sevaBahumanamsArchives = sevaBahumanamsArchives;
	}

	public SevaBahumanamsArchive addSevaBahumanamsArchive(SevaBahumanamsArchive sevaBahumanamsArchive) {
		getSevaBahumanamsArchives().add(sevaBahumanamsArchive);
		sevaBahumanamsArchive.setSevaMasterArchive(this);

		return sevaBahumanamsArchive;
	}

	public SevaBahumanamsArchive removeSevaBahumanamsArchive(SevaBahumanamsArchive sevaBahumanamsArchive) {
		getSevaBahumanamsArchives().remove(sevaBahumanamsArchive);
		sevaBahumanamsArchive.setSevaMasterArchive(null);

		return sevaBahumanamsArchive;
	}

	public List<SevaChannelMasterArchive> getSevaChannelMasterArchives() {
		return this.sevaChannelMasterArchives;
	}

	public void setSevaChannelMasterArchives(List<SevaChannelMasterArchive> sevaChannelMasterArchives) {
		this.sevaChannelMasterArchives = sevaChannelMasterArchives;
	}

	public SevaChannelMasterArchive addSevaChannelMasterArchive(SevaChannelMasterArchive sevaChannelMasterArchive) {
		getSevaChannelMasterArchives().add(sevaChannelMasterArchive);
		sevaChannelMasterArchive.setSevaMasterArchive(this);

		return sevaChannelMasterArchive;
	}

	public SevaChannelMasterArchive removeSevaChannelMasterArchive(SevaChannelMasterArchive sevaChannelMasterArchive) {
		getSevaChannelMasterArchives().remove(sevaChannelMasterArchive);
		sevaChannelMasterArchive.setSevaMasterArchive(null);

		return sevaChannelMasterArchive;
	}

	public List<SevaFrequencyMasterArchive> getSevaFrequencyMasterArchives() {
		return this.sevaFrequencyMasterArchives;
	}

	public void setSevaFrequencyMasterArchives(List<SevaFrequencyMasterArchive> sevaFrequencyMasterArchives) {
		this.sevaFrequencyMasterArchives = sevaFrequencyMasterArchives;
	}

	public SevaFrequencyMasterArchive addSevaFrequencyMasterArchive(SevaFrequencyMasterArchive sevaFrequencyMasterArchive) {
		getSevaFrequencyMasterArchives().add(sevaFrequencyMasterArchive);
		sevaFrequencyMasterArchive.setSevaMasterArchive(this);

		return sevaFrequencyMasterArchive;
	}

	public SevaFrequencyMasterArchive removeSevaFrequencyMasterArchive(SevaFrequencyMasterArchive sevaFrequencyMasterArchive) {
		getSevaFrequencyMasterArchives().remove(sevaFrequencyMasterArchive);
		sevaFrequencyMasterArchive.setSevaMasterArchive(null);

		return sevaFrequencyMasterArchive;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public SevaMaster getSevaMaster() {
		return this.sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

}