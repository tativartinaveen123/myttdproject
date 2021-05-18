package com.ttd.eseva.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SEVA_MASTER_PENDING database table.
 * 
 */
@Entity
@Table(name="SEVA_MASTER_PENDING")
@NamedQuery(name="SevaMasterPending.findAll", query="SELECT s FROM SevaMasterPending s")
public class SevaMasterPending implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEVA_MASTER_PENDING_ID_SEQ_GENERATOR", sequenceName="SEVA_MASTER_PENDING_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEVA_MASTER_PENDING_ID_SEQ_GENERATOR")
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

	@Column(name="REQUEST_FOR")
	private String requestFor;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="SEVA_DETAILS")
	private String sevaDetails;

	@Column(name="SEVA_END_TIME")
	private String sevaEndTime;

	@Column(name="SEVA_FREQUENCY")
	private BigDecimal sevaFrequency;

	@Column(name="SEVA_ID")
	private long sevaId;

	@Column(name="SEVA_NAME")
	private String sevaName;

	@Column(name="SEVA_PRICE")
	private BigDecimal sevaPrice;

	@Column(name="SEVA_START_TIME")
	private String sevaStartTime;

	private BigDecimal status;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to SevaBahumanamsPending
	@OneToMany(mappedBy="sevaMasterPending", cascade = CascadeType.ALL) 
	private List<SevaBahumanamsPending> sevaBahumanamsPendings;

	//bi-directional many-to-one association to SevaChannelMasterPending
	@OneToMany(mappedBy="sevaMasterPending", cascade = CascadeType.ALL) 
	private List<SevaChannelMasterPending> sevaChannelMasterPendings;

	//bi-directional many-to-one association to SevaFrequencyMasterPending
	@OneToMany(mappedBy="sevaMasterPending", cascade = CascadeType.ALL) 
	private List<SevaFrequencyMasterPending> sevaFrequencyMasterPendings;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	public SevaMasterPending() {
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

	public String getRequestFor() {
		return this.requestFor;
	}

	public void setRequestFor(String requestFor) {
		this.requestFor = requestFor;
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

	public long getSevaId() {
		return this.sevaId;
	}

	public void setSevaId(long sevaId) {
		this.sevaId = sevaId;
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

	public BigDecimal getStatus() {
		return this.status;
	}

	public void setStatus(BigDecimal status) {
		this.status = status;
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

	public List<SevaBahumanamsPending> getSevaBahumanamsPendings() {
		return this.sevaBahumanamsPendings;
	}

	public void setSevaBahumanamsPendings(List<SevaBahumanamsPending> sevaBahumanamsPendings) {
		this.sevaBahumanamsPendings = sevaBahumanamsPendings;
	}

	public SevaBahumanamsPending addSevaBahumanamsPending(SevaBahumanamsPending sevaBahumanamsPending) {
		getSevaBahumanamsPendings().add(sevaBahumanamsPending);
		sevaBahumanamsPending.setSevaMasterPending(this);

		return sevaBahumanamsPending;
	}

	public SevaBahumanamsPending removeSevaBahumanamsPending(SevaBahumanamsPending sevaBahumanamsPending) {
		getSevaBahumanamsPendings().remove(sevaBahumanamsPending);
		sevaBahumanamsPending.setSevaMasterPending(null);

		return sevaBahumanamsPending;
	}

	public List<SevaChannelMasterPending> getSevaChannelMasterPendings() {
		return this.sevaChannelMasterPendings;
	}

	public void setSevaChannelMasterPendings(List<SevaChannelMasterPending> sevaChannelMasterPendings) {
		this.sevaChannelMasterPendings = sevaChannelMasterPendings;
	}

	public SevaChannelMasterPending addSevaChannelMasterPending(SevaChannelMasterPending sevaChannelMasterPending) {
		getSevaChannelMasterPendings().add(sevaChannelMasterPending);
		sevaChannelMasterPending.setSevaMasterPending(this);

		return sevaChannelMasterPending;
	}

	public SevaChannelMasterPending removeSevaChannelMasterPending(SevaChannelMasterPending sevaChannelMasterPending) {
		getSevaChannelMasterPendings().remove(sevaChannelMasterPending);
		sevaChannelMasterPending.setSevaMasterPending(null);

		return sevaChannelMasterPending;
	}

	public List<SevaFrequencyMasterPending> getSevaFrequencyMasterPendings() {
		return this.sevaFrequencyMasterPendings;
	}

	public void setSevaFrequencyMasterPendings(List<SevaFrequencyMasterPending> sevaFrequencyMasterPendings) {
		this.sevaFrequencyMasterPendings = sevaFrequencyMasterPendings;
	}

	public SevaFrequencyMasterPending addSevaFrequencyMasterPending(SevaFrequencyMasterPending sevaFrequencyMasterPending) {
		getSevaFrequencyMasterPendings().add(sevaFrequencyMasterPending);
		sevaFrequencyMasterPending.setSevaMasterPending(this);

		return sevaFrequencyMasterPending;
	}

	public SevaFrequencyMasterPending removeSevaFrequencyMasterPending(SevaFrequencyMasterPending sevaFrequencyMasterPending) {
		getSevaFrequencyMasterPendings().remove(sevaFrequencyMasterPending);
		sevaFrequencyMasterPending.setSevaMasterPending(null);

		return sevaFrequencyMasterPending;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

}