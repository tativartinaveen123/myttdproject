package com.ttd.eseva.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SEVA_MASTER database table.
 * 
 */
@Entity
@Table(name="SEVA_MASTER")
@NamedQuery(name="SevaMaster.findAll", query="SELECT s FROM SevaMaster s")
public class SevaMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SEVA_ID")
	private long sevaId;

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

	//bi-directional many-to-one association to SevaAvailability
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaAvailability> sevaAvailabilities;

	//bi-directional many-to-one association to SevaBahumanam
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaBahumanam> sevaBahumanams;

	//bi-directional many-to-one association to SevaBahumanamsArchive
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaBahumanamsArchive> sevaBahumanamsArchives;

	//bi-directional many-to-one association to SevaBlockedDate
//	@OneToMany(mappedBy="sevaMaster")
//	private List<SevaBlockedDate> sevaBlockedDates;

	//bi-directional many-to-one association to SevaBooking
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaBooking> sevaBookings;

	//bi-directional many-to-one association to SevaChannelMaster
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaChannelMaster> sevaChannelMasters;

	//bi-directional many-to-one association to SevaChannelMasterArchive
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaChannelMasterArchive> sevaChannelMasterArchives;

	//bi-directional many-to-one association to SevaChannelMasterPending
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaChannelMasterPending> sevaChannelMasterPendings;

	//bi-directional many-to-one association to SevaChannelRulesConfig
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaChannelRulesConfig> sevaChannelRulesConfigs;

	//bi-directional one-to-one association to SevaDefaultQuotaMaster
	@OneToOne(mappedBy="sevaMaster")
	private SevaDefaultQuotaMaster sevaDefaultQuotaMaster;

	//bi-directional many-to-one association to SevaFrequencyMaster
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaFrequencyMaster> sevaFrequencyMasters;

	//bi-directional many-to-one association to SevaFrequencyMasterArchive
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaFrequencyMasterArchive> sevaFrequencyMasterArchives;

	//bi-directional many-to-one association to SevaFrequencyMasterPending
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaFrequencyMasterPending> sevaFrequencyMasterPendings;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to SevaMasterArchive
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaMasterArchive> sevaMasterArchives;

	//bi-directional many-to-one association to SevaQuotaConfig
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaQuotaConfig> sevaQuotaConfigs;

	//bi-directional many-to-one association to SevaQuotaConfigPending
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaQuotaConfigPending> sevaQuotaConfigPendings;

	//bi-directional many-to-one association to SevaQuotaMaster
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaQuotaMaster> sevaQuotaMasters;

	//bi-directional many-to-one association to SevaTempleCalendar
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaTempleCalendar> sevaTempleCalendars;

	//bi-directional many-to-one association to SevaTempleCalendarPending
	@OneToMany(mappedBy="sevaMaster")
	private List<SevaTempleCalendarPending> sevaTempleCalendarPendings;

	public SevaMaster() {
	}

	public long getSevaId() {
		return this.sevaId;
	}

	public void setSevaId(long sevaId) {
		this.sevaId = sevaId;
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

	public List<SevaAvailability> getSevaAvailabilities() {
		return this.sevaAvailabilities;
	}

	public void setSevaAvailabilities(List<SevaAvailability> sevaAvailabilities) {
		this.sevaAvailabilities = sevaAvailabilities;
	}

	public SevaAvailability addSevaAvailability(SevaAvailability sevaAvailability) {
		getSevaAvailabilities().add(sevaAvailability);
		sevaAvailability.setSevaMaster(this);

		return sevaAvailability;
	}

	public SevaAvailability removeSevaAvailability(SevaAvailability sevaAvailability) {
		getSevaAvailabilities().remove(sevaAvailability);
		sevaAvailability.setSevaMaster(null);

		return sevaAvailability;
	}

	public List<SevaBahumanam> getSevaBahumanams() {
		return this.sevaBahumanams;
	}

	public void setSevaBahumanams(List<SevaBahumanam> sevaBahumanams) {
		this.sevaBahumanams = sevaBahumanams;
	}

	public SevaBahumanam addSevaBahumanam(SevaBahumanam sevaBahumanam) {
		getSevaBahumanams().add(sevaBahumanam);
		sevaBahumanam.setSevaMaster(this);

		return sevaBahumanam;
	}

	public SevaBahumanam removeSevaBahumanam(SevaBahumanam sevaBahumanam) {
		getSevaBahumanams().remove(sevaBahumanam);
		sevaBahumanam.setSevaMaster(null);

		return sevaBahumanam;
	}

	public List<SevaBahumanamsArchive> getSevaBahumanamsArchives() {
		return this.sevaBahumanamsArchives;
	}

	public void setSevaBahumanamsArchives(List<SevaBahumanamsArchive> sevaBahumanamsArchives) {
		this.sevaBahumanamsArchives = sevaBahumanamsArchives;
	}

	public SevaBahumanamsArchive addSevaBahumanamsArchive(SevaBahumanamsArchive sevaBahumanamsArchive) {
		getSevaBahumanamsArchives().add(sevaBahumanamsArchive);
		sevaBahumanamsArchive.setSevaMaster(this);

		return sevaBahumanamsArchive;
	}

	public SevaBahumanamsArchive removeSevaBahumanamsArchive(SevaBahumanamsArchive sevaBahumanamsArchive) {
		getSevaBahumanamsArchives().remove(sevaBahumanamsArchive);
		sevaBahumanamsArchive.setSevaMaster(null);

		return sevaBahumanamsArchive;
	}

//	public List<SevaBlockedDate> getSevaBlockedDates() {
//		return this.sevaBlockedDates;
//	}
//
//	public void setSevaBlockedDates(List<SevaBlockedDate> sevaBlockedDates) {
//		this.sevaBlockedDates = sevaBlockedDates;
//	}
//
//	public SevaBlockedDate addSevaBlockedDate(SevaBlockedDate sevaBlockedDate) {
//		getSevaBlockedDates().add(sevaBlockedDate);
//		sevaBlockedDate.setSevaMaster(this);
//
//		return sevaBlockedDate;
//	}
//
//	public SevaBlockedDate removeSevaBlockedDate(SevaBlockedDate sevaBlockedDate) {
//		getSevaBlockedDates().remove(sevaBlockedDate);
//		sevaBlockedDate.setSevaMaster(null);
//
//		return sevaBlockedDate;
//	}

	public List<SevaBooking> getSevaBookings() {
		return this.sevaBookings;
	}

	public void setSevaBookings(List<SevaBooking> sevaBookings) {
		this.sevaBookings = sevaBookings;
	}

	public SevaBooking addSevaBooking(SevaBooking sevaBooking) {
		getSevaBookings().add(sevaBooking);
		sevaBooking.setSevaMaster(this);

		return sevaBooking;
	}

	public SevaBooking removeSevaBooking(SevaBooking sevaBooking) {
		getSevaBookings().remove(sevaBooking);
		sevaBooking.setSevaMaster(null);

		return sevaBooking;
	}

	public List<SevaChannelMaster> getSevaChannelMasters() {
		return this.sevaChannelMasters;
	}

	public void setSevaChannelMasters(List<SevaChannelMaster> sevaChannelMasters) {
		this.sevaChannelMasters = sevaChannelMasters;
	}

	public SevaChannelMaster addSevaChannelMaster(SevaChannelMaster sevaChannelMaster) {
		getSevaChannelMasters().add(sevaChannelMaster);
		sevaChannelMaster.setSevaMaster(this);

		return sevaChannelMaster;
	}

	public SevaChannelMaster removeSevaChannelMaster(SevaChannelMaster sevaChannelMaster) {
		getSevaChannelMasters().remove(sevaChannelMaster);
		sevaChannelMaster.setSevaMaster(null);

		return sevaChannelMaster;
	}

	public List<SevaChannelMasterArchive> getSevaChannelMasterArchives() {
		return this.sevaChannelMasterArchives;
	}

	public void setSevaChannelMasterArchives(List<SevaChannelMasterArchive> sevaChannelMasterArchives) {
		this.sevaChannelMasterArchives = sevaChannelMasterArchives;
	}

	public SevaChannelMasterArchive addSevaChannelMasterArchive(SevaChannelMasterArchive sevaChannelMasterArchive) {
		getSevaChannelMasterArchives().add(sevaChannelMasterArchive);
		sevaChannelMasterArchive.setSevaMaster(this);

		return sevaChannelMasterArchive;
	}

	public SevaChannelMasterArchive removeSevaChannelMasterArchive(SevaChannelMasterArchive sevaChannelMasterArchive) {
		getSevaChannelMasterArchives().remove(sevaChannelMasterArchive);
		sevaChannelMasterArchive.setSevaMaster(null);

		return sevaChannelMasterArchive;
	}

	public List<SevaChannelMasterPending> getSevaChannelMasterPendings() {
		return this.sevaChannelMasterPendings;
	}

	public void setSevaChannelMasterPendings(List<SevaChannelMasterPending> sevaChannelMasterPendings) {
		this.sevaChannelMasterPendings = sevaChannelMasterPendings;
	}

	public SevaChannelMasterPending addSevaChannelMasterPending(SevaChannelMasterPending sevaChannelMasterPending) {
		getSevaChannelMasterPendings().add(sevaChannelMasterPending);
		sevaChannelMasterPending.setSevaMaster(this);

		return sevaChannelMasterPending;
	}

	public SevaChannelMasterPending removeSevaChannelMasterPending(SevaChannelMasterPending sevaChannelMasterPending) {
		getSevaChannelMasterPendings().remove(sevaChannelMasterPending);
		sevaChannelMasterPending.setSevaMaster(null);

		return sevaChannelMasterPending;
	}

	public List<SevaChannelRulesConfig> getSevaChannelRulesConfigs() {
		return this.sevaChannelRulesConfigs;
	}

	public void setSevaChannelRulesConfigs(List<SevaChannelRulesConfig> sevaChannelRulesConfigs) {
		this.sevaChannelRulesConfigs = sevaChannelRulesConfigs;
	}

	public SevaChannelRulesConfig addSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().add(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setSevaMaster(this);

		return sevaChannelRulesConfig;
	}

	public SevaChannelRulesConfig removeSevaChannelRulesConfig(SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().remove(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setSevaMaster(null);

		return sevaChannelRulesConfig;
	}

	public SevaDefaultQuotaMaster getSevaDefaultQuotaMaster() {
		return this.sevaDefaultQuotaMaster;
	}

	public void setSevaDefaultQuotaMaster(SevaDefaultQuotaMaster sevaDefaultQuotaMaster) {
		this.sevaDefaultQuotaMaster = sevaDefaultQuotaMaster;
	}

	public List<SevaFrequencyMaster> getSevaFrequencyMasters() {
		return this.sevaFrequencyMasters;
	}

	public void setSevaFrequencyMasters(List<SevaFrequencyMaster> sevaFrequencyMasters) {
		this.sevaFrequencyMasters = sevaFrequencyMasters;
	}

	public SevaFrequencyMaster addSevaFrequencyMaster(SevaFrequencyMaster sevaFrequencyMaster) {
		getSevaFrequencyMasters().add(sevaFrequencyMaster);
		sevaFrequencyMaster.setSevaMaster(this);

		return sevaFrequencyMaster;
	}

	public SevaFrequencyMaster removeSevaFrequencyMaster(SevaFrequencyMaster sevaFrequencyMaster) {
		getSevaFrequencyMasters().remove(sevaFrequencyMaster);
		sevaFrequencyMaster.setSevaMaster(null);

		return sevaFrequencyMaster;
	}

	public List<SevaFrequencyMasterArchive> getSevaFrequencyMasterArchives() {
		return this.sevaFrequencyMasterArchives;
	}

	public void setSevaFrequencyMasterArchives(List<SevaFrequencyMasterArchive> sevaFrequencyMasterArchives) {
		this.sevaFrequencyMasterArchives = sevaFrequencyMasterArchives;
	}

	public SevaFrequencyMasterArchive addSevaFrequencyMasterArchive(SevaFrequencyMasterArchive sevaFrequencyMasterArchive) {
		getSevaFrequencyMasterArchives().add(sevaFrequencyMasterArchive);
		sevaFrequencyMasterArchive.setSevaMaster(this);

		return sevaFrequencyMasterArchive;
	}

	public SevaFrequencyMasterArchive removeSevaFrequencyMasterArchive(SevaFrequencyMasterArchive sevaFrequencyMasterArchive) {
		getSevaFrequencyMasterArchives().remove(sevaFrequencyMasterArchive);
		sevaFrequencyMasterArchive.setSevaMaster(null);

		return sevaFrequencyMasterArchive;
	}

	public List<SevaFrequencyMasterPending> getSevaFrequencyMasterPendings() {
		return this.sevaFrequencyMasterPendings;
	}

	public void setSevaFrequencyMasterPendings(List<SevaFrequencyMasterPending> sevaFrequencyMasterPendings) {
		this.sevaFrequencyMasterPendings = sevaFrequencyMasterPendings;
	}

	public SevaFrequencyMasterPending addSevaFrequencyMasterPending(SevaFrequencyMasterPending sevaFrequencyMasterPending) {
		getSevaFrequencyMasterPendings().add(sevaFrequencyMasterPending);
		sevaFrequencyMasterPending.setSevaMaster(this);

		return sevaFrequencyMasterPending;
	}

	public SevaFrequencyMasterPending removeSevaFrequencyMasterPending(SevaFrequencyMasterPending sevaFrequencyMasterPending) {
		getSevaFrequencyMasterPendings().remove(sevaFrequencyMasterPending);
		sevaFrequencyMasterPending.setSevaMaster(null);

		return sevaFrequencyMasterPending;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public List<SevaMasterArchive> getSevaMasterArchives() {
		return this.sevaMasterArchives;
	}

	public void setSevaMasterArchives(List<SevaMasterArchive> sevaMasterArchives) {
		this.sevaMasterArchives = sevaMasterArchives;
	}

	public SevaMasterArchive addSevaMasterArchive(SevaMasterArchive sevaMasterArchive) {
		getSevaMasterArchives().add(sevaMasterArchive);
		sevaMasterArchive.setSevaMaster(this);

		return sevaMasterArchive;
	}

	public SevaMasterArchive removeSevaMasterArchive(SevaMasterArchive sevaMasterArchive) {
		getSevaMasterArchives().remove(sevaMasterArchive);
		sevaMasterArchive.setSevaMaster(null);

		return sevaMasterArchive;
	}

	public List<SevaQuotaConfig> getSevaQuotaConfigs() {
		return this.sevaQuotaConfigs;
	}

	public void setSevaQuotaConfigs(List<SevaQuotaConfig> sevaQuotaConfigs) {
		this.sevaQuotaConfigs = sevaQuotaConfigs;
	}

	public SevaQuotaConfig addSevaQuotaConfig(SevaQuotaConfig sevaQuotaConfig) {
		getSevaQuotaConfigs().add(sevaQuotaConfig);
		sevaQuotaConfig.setSevaMaster(this);

		return sevaQuotaConfig;
	}

	public SevaQuotaConfig removeSevaQuotaConfig(SevaQuotaConfig sevaQuotaConfig) {
		getSevaQuotaConfigs().remove(sevaQuotaConfig);
		sevaQuotaConfig.setSevaMaster(null);

		return sevaQuotaConfig;
	}

	public List<SevaQuotaConfigPending> getSevaQuotaConfigPendings() {
		return this.sevaQuotaConfigPendings;
	}

	public void setSevaQuotaConfigPendings(List<SevaQuotaConfigPending> sevaQuotaConfigPendings) {
		this.sevaQuotaConfigPendings = sevaQuotaConfigPendings;
	}

	public SevaQuotaConfigPending addSevaQuotaConfigPending(SevaQuotaConfigPending sevaQuotaConfigPending) {
		getSevaQuotaConfigPendings().add(sevaQuotaConfigPending);
		sevaQuotaConfigPending.setSevaMaster(this);

		return sevaQuotaConfigPending;
	}

	public SevaQuotaConfigPending removeSevaQuotaConfigPending(SevaQuotaConfigPending sevaQuotaConfigPending) {
		getSevaQuotaConfigPendings().remove(sevaQuotaConfigPending);
		sevaQuotaConfigPending.setSevaMaster(null);

		return sevaQuotaConfigPending;
	}

	public List<SevaQuotaMaster> getSevaQuotaMasters() {
		return this.sevaQuotaMasters;
	}

	public void setSevaQuotaMasters(List<SevaQuotaMaster> sevaQuotaMasters) {
		this.sevaQuotaMasters = sevaQuotaMasters;
	}

	public SevaQuotaMaster addSevaQuotaMaster(SevaQuotaMaster sevaQuotaMaster) {
		getSevaQuotaMasters().add(sevaQuotaMaster);
		sevaQuotaMaster.setSevaMaster(this);

		return sevaQuotaMaster;
	}

	public SevaQuotaMaster removeSevaQuotaMaster(SevaQuotaMaster sevaQuotaMaster) {
		getSevaQuotaMasters().remove(sevaQuotaMaster);
		sevaQuotaMaster.setSevaMaster(null);

		return sevaQuotaMaster;
	}

	public List<SevaTempleCalendar> getSevaTempleCalendars() {
		return this.sevaTempleCalendars;
	}

	public void setSevaTempleCalendars(List<SevaTempleCalendar> sevaTempleCalendars) {
		this.sevaTempleCalendars = sevaTempleCalendars;
	}

	public SevaTempleCalendar addSevaTempleCalendar(SevaTempleCalendar sevaTempleCalendar) {
		getSevaTempleCalendars().add(sevaTempleCalendar);
		sevaTempleCalendar.setSevaMaster(this);

		return sevaTempleCalendar;
	}

	public SevaTempleCalendar removeSevaTempleCalendar(SevaTempleCalendar sevaTempleCalendar) {
		getSevaTempleCalendars().remove(sevaTempleCalendar);
		sevaTempleCalendar.setSevaMaster(null);

		return sevaTempleCalendar;
	}

	public List<SevaTempleCalendarPending> getSevaTempleCalendarPendings() {
		return this.sevaTempleCalendarPendings;
	}

	public void setSevaTempleCalendarPendings(List<SevaTempleCalendarPending> sevaTempleCalendarPendings) {
		this.sevaTempleCalendarPendings = sevaTempleCalendarPendings;
	}

	public SevaTempleCalendarPending addSevaTempleCalendarPending(SevaTempleCalendarPending sevaTempleCalendarPending) {
		getSevaTempleCalendarPendings().add(sevaTempleCalendarPending);
		sevaTempleCalendarPending.setSevaMaster(this);

		return sevaTempleCalendarPending;
	}

	public SevaTempleCalendarPending removeSevaTempleCalendarPending(SevaTempleCalendarPending sevaTempleCalendarPending) {
		getSevaTempleCalendarPendings().remove(sevaTempleCalendarPending);
		sevaTempleCalendarPending.setSevaMaster(null);

		return sevaTempleCalendarPending;
	}

}