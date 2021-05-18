package com.ttd.eseva.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ServiceNote;
import com.ttd.common.entity.User;
import com.ttd.eaccommodation.entity.AccomQuotaConfig;
import com.ttd.eaccommodation.entity.AccomQuotaConfigPending;
import com.ttd.edarshan.entity.DarshanMaster;
import com.ttd.edarshan.entity.DarshanMasterArchive;
import com.ttd.edarshan.entity.DarshanMasterPending;
import com.ttd.edarshan.entity.DarshanQuotaConfig;
import com.ttd.edarshan.entity.DarshanQuotaConfigArchive;
import com.ttd.edarshan.entity.DarshanQuotaConfigPending;
import com.ttd.edarshan.entity.DarshanSlotBlock;
import com.ttd.edarshan.entity.DarshanSlotBlockArchive;
import com.ttd.edarshan.entity.DarshanSlotBlockPending;
import com.ttd.edarshan.entity.DarshanSltChnConf;
import com.ttd.edarshan.entity.DarshanSltChnConfArchive;
import com.ttd.edarshan.entity.DarshanSltChnConfPending;
import com.ttd.edarshan.entity.SlotsMaster;
import com.ttd.edarshan.entity.SlotsMasterArchive;
import com.ttd.edarshan.entity.SlotsMasterPending;
import com.ttd.ussesvvd.entity.UssesPrePostTransaction;

/**
 * The persistent class for the REQUEST_WORKFLOW database table.
 * 
 */
@Entity
@Table(name = "REQUEST_WORKFLOW")
@NamedQuery(name = "RequestWorkflow.findAll", query = "SELECT r FROM RequestWorkflow r")
public class RequestWorkflow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "REQUEST_WORKFLOW_REQUEST_ID_GENERATOR", sequenceName = "REQUEST_WORKFLOW_REQUEST_ID", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REQUEST_WORKFLOW_REQUEST_ID_GENERATOR")
	@Column(name = "REQUEST_ID")
	private long requestId;

	@Temporal(TemporalType.DATE)
	@Column(name = "ACTION_DATE")
	private Date actionDate;

	@Column(name = "APPROVAR_COMMENTS")
	private String approvarComments;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REQUESTED_DATE", insertable = false)
	private Date requestedDate;

	@Column(name = "REQUESTER_COMMENTS")
	private String requesterComments;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "STATUS_CODE")
	private BigDecimal statusCode;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to DarshanMaster
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanMaster> darshanMasters;

	// bi-directional many-to-one association to DarshanMasterArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanMasterArchive> darshanMasterArchives;

	// bi-directional many-to-one association to DarshanMasterPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanMasterPending> darshanMasterPendings;

	// bi-directional many-to-one association to DarshanQuotaConfig
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanQuotaConfig> darshanQuotaConfigs;

	// bi-directional many-to-one association to DarshanQuotaConfigArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanQuotaConfigArchive> darshanQuotaConfigArchives;

	// bi-directional many-to-one association to DarshanQuotaConfigPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanQuotaConfigPending> darshanQuotaConfigPendings;

	// bi-directional many-to-one association to DarshanSlotBlock
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanSlotBlock> darshanSlotBlocks;

	// bi-directional many-to-one association to DarshanSlotBlockArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanSlotBlockArchive> darshanSlotBlockArchives;

	// bi-directional many-to-one association to DarshanSlotBlockPending
	@OrderBy("slotId")
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanSlotBlockPending> darshanSlotBlockPendings;

	// bi-directional many-to-one association to DarshanSltChnConf
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanSltChnConf> darshanSltChnConfs;

	// bi-directional many-to-one association to DarshanSltChnConfArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanSltChnConfArchive> darshanSltChnConfArchives;

	// bi-directional many-to-one association to DarshanSltChnConfPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<DarshanSltChnConfPending> darshanSltChnConfPendings;

	// bi-directional many-to-one association to RequestTypeMaster
	@ManyToOne
	@JoinColumn(name = "REQUEST_TYPE_ID")
	private RequestTypeMaster requestTypeMaster;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "REQUESTER_USER_ID")
	private User user2;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "APPORVER_USER_ID")
	private User user1;

	// bi-directional many-to-one association to ServiceChannelRulesConfig
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<ServiceChannelRulesConfig> serviceChannelRulesConfigs;

	// bi-directional many-to-one association to ServiceNote
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<ServiceNote> serviceNotes;

	// bi-directional many-to-one association to SevaBahumanam
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaBahumanam> sevaBahumanams;

	// bi-directional many-to-one association to SevaBahumanamsArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaBahumanamsArchive> sevaBahumanamsArchives;

	// bi-directional many-to-one association to SevaBahumanamsPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaBahumanamsPending> sevaBahumanamsPendings;

	// bi-directional many-to-one association to SevaChannelMaster
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaChannelMaster> sevaChannelMasters;

	// bi-directional many-to-one association to SevaChannelMasterArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaChannelMasterArchive> sevaChannelMasterArchives;

	// bi-directional many-to-one association to SevaChannelMasterPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaChannelMasterPending> sevaChannelMasterPendings;

	// bi-directional many-to-one association to SevaChannelRulesConfig
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaChannelRulesConfig> sevaChannelRulesConfigs;

	// bi-directional many-to-one association to SevaFrequencyMaster
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaFrequencyMaster> sevaFrequencyMasters;

	// bi-directional many-to-one association to SevaFrequencyMasterArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaFrequencyMasterArchive> sevaFrequencyMasterArchives;

	// bi-directional many-to-one association to SevaFrequencyMasterPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaFrequencyMasterPending> sevaFrequencyMasterPendings;

	// bi-directional many-to-one association to SevaMaster
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaMaster> sevaMasters;

	// bi-directional many-to-one association to SevaMasterArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaMasterArchive> sevaMasterArchives;

	// bi-directional many-to-one association to SevaMasterPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaMasterPending> sevaMasterPendings;

	// bi-directional many-to-one association to SevaQuotaConfig
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaQuotaConfig> sevaQuotaConfigs;

	// bi-directional many-to-one association to SevaQuotaConfigPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaQuotaConfigPending> sevaQuotaConfigPendings;
	
	// bi-directional many-to-one association to SevaQuotaConfig
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<AccomQuotaConfig> accomQuotaConfigs;

	// bi-directional many-to-one association to SevaQuotaConfigPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<AccomQuotaConfigPending> accomQuotaConfigPendings;

	// bi-directional many-to-one association to SevaTempleCalendar
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaTempleCalendar> sevaTempleCalendars;

	// bi-directional many-to-one association to SevaTempleCalendarPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SevaTempleCalendarPending> sevaTempleCalendarPendings;

	// bi-directional many-to-one association to SlotsMaster
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SlotsMaster> slotsMasters;

	// bi-directional many-to-one association to SlotsMasterArchive
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SlotsMasterArchive> slotsMasterArchives;

	// bi-directional many-to-one association to SlotsMasterPending
	@OneToMany(mappedBy = "requestWorkflow", cascade = CascadeType.ALL)
	private List<SlotsMasterPending> slotsMasterPendings;

	// bi-directional many-to-one association to UssesPrePostTransaction
	@OneToMany(mappedBy = "requestWorkflow")
	private List<UssesPrePostTransaction> ussesPrePostTransactions;

	public RequestWorkflow() {
	}

	public long getRequestId() {
		return this.requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public Date getActionDate() {
		return this.actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	public String getApprovarComments() {
		return this.approvarComments;
	}

	public void setApprovarComments(String approvarComments) {
		this.approvarComments = approvarComments;
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

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Date getRequestedDate() {
		return this.requestedDate;
	}

	public void setRequestedDate(Date requestedDate) {
		this.requestedDate = requestedDate;
	}

	public String getRequesterComments() {
		return this.requesterComments;
	}

	public void setRequesterComments(String requesterComments) {
		this.requesterComments = requesterComments;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(BigDecimal statusCode) {
		this.statusCode = statusCode;
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

	public List<DarshanMaster> getDarshanMasters() {
		return this.darshanMasters;
	}

	public void setDarshanMasters(List<DarshanMaster> darshanMasters) {
		this.darshanMasters = darshanMasters;
	}

	public DarshanMaster addDarshanMaster(DarshanMaster darshanMaster) {
		getDarshanMasters().add(darshanMaster);
		darshanMaster.setRequestWorkflow(this);

		return darshanMaster;
	}

	public DarshanMaster removeDarshanMaster(DarshanMaster darshanMaster) {
		getDarshanMasters().remove(darshanMaster);
		darshanMaster.setRequestWorkflow(null);

		return darshanMaster;
	}

	public List<DarshanMasterArchive> getDarshanMasterArchives() {
		return this.darshanMasterArchives;
	}

	public void setDarshanMasterArchives(
			List<DarshanMasterArchive> darshanMasterArchives) {
		this.darshanMasterArchives = darshanMasterArchives;
	}

	public DarshanMasterArchive addDarshanMasterArchive(
			DarshanMasterArchive darshanMasterArchive) {
		getDarshanMasterArchives().add(darshanMasterArchive);
		darshanMasterArchive.setRequestWorkflow(this);

		return darshanMasterArchive;
	}

	public DarshanMasterArchive removeDarshanMasterArchive(
			DarshanMasterArchive darshanMasterArchive) {
		getDarshanMasterArchives().remove(darshanMasterArchive);
		darshanMasterArchive.setRequestWorkflow(null);

		return darshanMasterArchive;
	}

	public List<AccomQuotaConfig> getAccomQuotaConfigs() {
		return accomQuotaConfigs;
	}

	public void setAccomQuotaConfigs(List<AccomQuotaConfig> accomQuotaConfigs) {
		this.accomQuotaConfigs = accomQuotaConfigs;
	}

	public List<AccomQuotaConfigPending> getAccomQuotaConfigPendings() {
		return accomQuotaConfigPendings;
	}

	public void setAccomQuotaConfigPendings(
			List<AccomQuotaConfigPending> accomQuotaConfigPendings) {
		this.accomQuotaConfigPendings = accomQuotaConfigPendings;
	}

	public List<DarshanMasterPending> getDarshanMasterPendings() {
		return this.darshanMasterPendings;
	}

	public void setDarshanMasterPendings(
			List<DarshanMasterPending> darshanMasterPendings) {
		this.darshanMasterPendings = darshanMasterPendings;
	}

	public DarshanMasterPending addDarshanMasterPending(
			DarshanMasterPending darshanMasterPending) {
		getDarshanMasterPendings().add(darshanMasterPending);
		darshanMasterPending.setRequestWorkflow(this);

		return darshanMasterPending;
	}

	public DarshanMasterPending removeDarshanMasterPending(
			DarshanMasterPending darshanMasterPending) {
		getDarshanMasterPendings().remove(darshanMasterPending);
		darshanMasterPending.setRequestWorkflow(null);

		return darshanMasterPending;
	}

	public List<DarshanQuotaConfig> getDarshanQuotaConfigs() {
		return this.darshanQuotaConfigs;
	}

	public void setDarshanQuotaConfigs(
			List<DarshanQuotaConfig> darshanQuotaConfigs) {
		this.darshanQuotaConfigs = darshanQuotaConfigs;
	}

	public DarshanQuotaConfig addDarshanQuotaConfig(
			DarshanQuotaConfig darshanQuotaConfig) {
		getDarshanQuotaConfigs().add(darshanQuotaConfig);
		darshanQuotaConfig.setRequestWorkflow(this);

		return darshanQuotaConfig;
	}

	public DarshanQuotaConfig removeDarshanQuotaConfig(
			DarshanQuotaConfig darshanQuotaConfig) {
		getDarshanQuotaConfigs().remove(darshanQuotaConfig);
		darshanQuotaConfig.setRequestWorkflow(null);

		return darshanQuotaConfig;
	}

	public List<DarshanQuotaConfigArchive> getDarshanQuotaConfigArchives() {
		return this.darshanQuotaConfigArchives;
	}

	public void setDarshanQuotaConfigArchives(
			List<DarshanQuotaConfigArchive> darshanQuotaConfigArchives) {
		this.darshanQuotaConfigArchives = darshanQuotaConfigArchives;
	}

	public DarshanQuotaConfigArchive addDarshanQuotaConfigArchive(
			DarshanQuotaConfigArchive darshanQuotaConfigArchive) {
		getDarshanQuotaConfigArchives().add(darshanQuotaConfigArchive);
		darshanQuotaConfigArchive.setRequestWorkflow(this);

		return darshanQuotaConfigArchive;
	}

	public DarshanQuotaConfigArchive removeDarshanQuotaConfigArchive(
			DarshanQuotaConfigArchive darshanQuotaConfigArchive) {
		getDarshanQuotaConfigArchives().remove(darshanQuotaConfigArchive);
		darshanQuotaConfigArchive.setRequestWorkflow(null);

		return darshanQuotaConfigArchive;
	}

	public List<DarshanQuotaConfigPending> getDarshanQuotaConfigPendings() {
		return this.darshanQuotaConfigPendings;
	}

	public void setDarshanQuotaConfigPendings(
			List<DarshanQuotaConfigPending> darshanQuotaConfigPendings) {
		this.darshanQuotaConfigPendings = darshanQuotaConfigPendings;
	}

	public DarshanQuotaConfigPending addDarshanQuotaConfigPending(
			DarshanQuotaConfigPending darshanQuotaConfigPending) {
		getDarshanQuotaConfigPendings().add(darshanQuotaConfigPending);
		darshanQuotaConfigPending.setRequestWorkflow(this);

		return darshanQuotaConfigPending;
	}

	public DarshanQuotaConfigPending removeDarshanQuotaConfigPending(
			DarshanQuotaConfigPending darshanQuotaConfigPending) {
		getDarshanQuotaConfigPendings().remove(darshanQuotaConfigPending);
		darshanQuotaConfigPending.setRequestWorkflow(null);

		return darshanQuotaConfigPending;
	}

	public List<DarshanSlotBlock> getDarshanSlotBlocks() {
		return this.darshanSlotBlocks;
	}

	public void setDarshanSlotBlocks(List<DarshanSlotBlock> darshanSlotBlocks) {
		this.darshanSlotBlocks = darshanSlotBlocks;
	}

	public DarshanSlotBlock addDarshanSlotBlock(
			DarshanSlotBlock darshanSlotBlock) {
		getDarshanSlotBlocks().add(darshanSlotBlock);
		darshanSlotBlock.setRequestWorkflow(this);

		return darshanSlotBlock;
	}

	public DarshanSlotBlock removeDarshanSlotBlock(
			DarshanSlotBlock darshanSlotBlock) {
		getDarshanSlotBlocks().remove(darshanSlotBlock);
		darshanSlotBlock.setRequestWorkflow(null);

		return darshanSlotBlock;
	}

	public List<DarshanSlotBlockArchive> getDarshanSlotBlockArchives() {
		return this.darshanSlotBlockArchives;
	}

	public void setDarshanSlotBlockArchives(
			List<DarshanSlotBlockArchive> darshanSlotBlockArchives) {
		this.darshanSlotBlockArchives = darshanSlotBlockArchives;
	}

	public DarshanSlotBlockArchive addDarshanSlotBlockArchive(
			DarshanSlotBlockArchive darshanSlotBlockArchive) {
		getDarshanSlotBlockArchives().add(darshanSlotBlockArchive);
		darshanSlotBlockArchive.setRequestWorkflow(this);

		return darshanSlotBlockArchive;
	}

	public DarshanSlotBlockArchive removeDarshanSlotBlockArchive(
			DarshanSlotBlockArchive darshanSlotBlockArchive) {
		getDarshanSlotBlockArchives().remove(darshanSlotBlockArchive);
		darshanSlotBlockArchive.setRequestWorkflow(null);

		return darshanSlotBlockArchive;
	}

	public List<DarshanSlotBlockPending> getDarshanSlotBlockPendings() {
		return this.darshanSlotBlockPendings;
	}

	public void setDarshanSlotBlockPendings(
			List<DarshanSlotBlockPending> darshanSlotBlockPendings) {
		this.darshanSlotBlockPendings = darshanSlotBlockPendings;
	}

	public DarshanSlotBlockPending addDarshanSlotBlockPending(
			DarshanSlotBlockPending darshanSlotBlockPending) {
		getDarshanSlotBlockPendings().add(darshanSlotBlockPending);
		darshanSlotBlockPending.setRequestWorkflow(this);

		return darshanSlotBlockPending;
	}

	public DarshanSlotBlockPending removeDarshanSlotBlockPending(
			DarshanSlotBlockPending darshanSlotBlockPending) {
		getDarshanSlotBlockPendings().remove(darshanSlotBlockPending);
		darshanSlotBlockPending.setRequestWorkflow(null);

		return darshanSlotBlockPending;
	}

	public List<DarshanSltChnConf> getDarshanSltChnConfs() {
		return this.darshanSltChnConfs;
	}

	public void setDarshanSltChnConfs(List<DarshanSltChnConf> darshanSltChnConfs) {
		this.darshanSltChnConfs = darshanSltChnConfs;
	}

	public DarshanSltChnConf addDarshanSltChnConf(
			DarshanSltChnConf darshanSltChnConf) {
		getDarshanSltChnConfs().add(darshanSltChnConf);
		darshanSltChnConf.setRequestWorkflow(this);

		return darshanSltChnConf;
	}

	public DarshanSltChnConf removeDarshanSltChnConf(
			DarshanSltChnConf darshanSltChnConf) {
		getDarshanSltChnConfs().remove(darshanSltChnConf);
		darshanSltChnConf.setRequestWorkflow(null);

		return darshanSltChnConf;
	}

	public List<DarshanSltChnConfArchive> getDarshanSltChnConfArchives() {
		return this.darshanSltChnConfArchives;
	}

	public void setDarshanSltChnConfArchives(
			List<DarshanSltChnConfArchive> darshanSltChnConfArchives) {
		this.darshanSltChnConfArchives = darshanSltChnConfArchives;
	}

	public DarshanSltChnConfArchive addDarshanSltChnConfArchive(
			DarshanSltChnConfArchive darshanSltChnConfArchive) {
		getDarshanSltChnConfArchives().add(darshanSltChnConfArchive);
		darshanSltChnConfArchive.setRequestWorkflow(this);

		return darshanSltChnConfArchive;
	}

	public DarshanSltChnConfArchive removeDarshanSltChnConfArchive(
			DarshanSltChnConfArchive darshanSltChnConfArchive) {
		getDarshanSltChnConfArchives().remove(darshanSltChnConfArchive);
		darshanSltChnConfArchive.setRequestWorkflow(null);

		return darshanSltChnConfArchive;
	}

	public List<DarshanSltChnConfPending> getDarshanSltChnConfPendings() {
		return this.darshanSltChnConfPendings;
	}

	public void setDarshanSltChnConfPendings(
			List<DarshanSltChnConfPending> darshanSltChnConfPendings) {
		this.darshanSltChnConfPendings = darshanSltChnConfPendings;
	}

	public DarshanSltChnConfPending addDarshanSltChnConfPending(
			DarshanSltChnConfPending darshanSltChnConfPending) {
		getDarshanSltChnConfPendings().add(darshanSltChnConfPending);
		darshanSltChnConfPending.setRequestWorkflow(this);

		return darshanSltChnConfPending;
	}

	public DarshanSltChnConfPending removeDarshanSltChnConfPending(
			DarshanSltChnConfPending darshanSltChnConfPending) {
		getDarshanSltChnConfPendings().remove(darshanSltChnConfPending);
		darshanSltChnConfPending.setRequestWorkflow(null);

		return darshanSltChnConfPending;
	}

	public RequestTypeMaster getRequestTypeMaster() {
		return this.requestTypeMaster;
	}

	public void setRequestTypeMaster(RequestTypeMaster requestTypeMaster) {
		this.requestTypeMaster = requestTypeMaster;
	}

	public List<ServiceChannelRulesConfig> getServiceChannelRulesConfigs() {
		return this.serviceChannelRulesConfigs;
	}

	public void setServiceChannelRulesConfigs(
			List<ServiceChannelRulesConfig> serviceChannelRulesConfigs) {
		this.serviceChannelRulesConfigs = serviceChannelRulesConfigs;
	}

	public ServiceChannelRulesConfig addServiceChannelRulesConfig(
			ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().add(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setRequestWorkflow(this);

		return serviceChannelRulesConfig;
	}

	public ServiceChannelRulesConfig removeServiceChannelRulesConfig(
			ServiceChannelRulesConfig serviceChannelRulesConfig) {
		getServiceChannelRulesConfigs().remove(serviceChannelRulesConfig);
		serviceChannelRulesConfig.setRequestWorkflow(null);

		return serviceChannelRulesConfig;
	}

	public List<ServiceNote> getServiceNotes() {
		return this.serviceNotes;
	}

	public void setServiceNotes(List<ServiceNote> serviceNotes) {
		this.serviceNotes = serviceNotes;
	}

	public ServiceNote addServiceNote(ServiceNote serviceNote) {
		getServiceNotes().add(serviceNote);
		serviceNote.setRequestWorkflow(this);

		return serviceNote;
	}

	public ServiceNote removeServiceNote(ServiceNote serviceNote) {
		getServiceNotes().remove(serviceNote);
		serviceNote.setRequestWorkflow(null);

		return serviceNote;
	}

	public List<SevaBahumanam> getSevaBahumanams() {
		return this.sevaBahumanams;
	}

	public void setSevaBahumanams(List<SevaBahumanam> sevaBahumanams) {
		this.sevaBahumanams = sevaBahumanams;
	}

	public SevaBahumanam addSevaBahumanam(SevaBahumanam sevaBahumanam) {
		getSevaBahumanams().add(sevaBahumanam);
		sevaBahumanam.setRequestWorkflow(this);

		return sevaBahumanam;
	}

	public SevaBahumanam removeSevaBahumanam(SevaBahumanam sevaBahumanam) {
		getSevaBahumanams().remove(sevaBahumanam);
		sevaBahumanam.setRequestWorkflow(null);

		return sevaBahumanam;
	}

	public List<SevaBahumanamsArchive> getSevaBahumanamsArchives() {
		return this.sevaBahumanamsArchives;
	}

	public void setSevaBahumanamsArchives(
			List<SevaBahumanamsArchive> sevaBahumanamsArchives) {
		this.sevaBahumanamsArchives = sevaBahumanamsArchives;
	}

	public SevaBahumanamsArchive addSevaBahumanamsArchive(
			SevaBahumanamsArchive sevaBahumanamsArchive) {
		getSevaBahumanamsArchives().add(sevaBahumanamsArchive);
		sevaBahumanamsArchive.setRequestWorkflow(this);

		return sevaBahumanamsArchive;
	}

	public SevaBahumanamsArchive removeSevaBahumanamsArchive(
			SevaBahumanamsArchive sevaBahumanamsArchive) {
		getSevaBahumanamsArchives().remove(sevaBahumanamsArchive);
		sevaBahumanamsArchive.setRequestWorkflow(null);

		return sevaBahumanamsArchive;
	}

	public List<SevaBahumanamsPending> getSevaBahumanamsPendings() {
		return this.sevaBahumanamsPendings;
	}

	public void setSevaBahumanamsPendings(
			List<SevaBahumanamsPending> sevaBahumanamsPendings) {
		this.sevaBahumanamsPendings = sevaBahumanamsPendings;
	}

	public SevaBahumanamsPending addSevaBahumanamsPending(
			SevaBahumanamsPending sevaBahumanamsPending) {
		getSevaBahumanamsPendings().add(sevaBahumanamsPending);
		sevaBahumanamsPending.setRequestWorkflow(this);

		return sevaBahumanamsPending;
	}

	public SevaBahumanamsPending removeSevaBahumanamsPending(
			SevaBahumanamsPending sevaBahumanamsPending) {
		getSevaBahumanamsPendings().remove(sevaBahumanamsPending);
		sevaBahumanamsPending.setRequestWorkflow(null);

		return sevaBahumanamsPending;
	}

	public List<SevaChannelMaster> getSevaChannelMasters() {
		return this.sevaChannelMasters;
	}

	public void setSevaChannelMasters(List<SevaChannelMaster> sevaChannelMasters) {
		this.sevaChannelMasters = sevaChannelMasters;
	}

	public SevaChannelMaster addSevaChannelMaster(
			SevaChannelMaster sevaChannelMaster) {
		getSevaChannelMasters().add(sevaChannelMaster);
		sevaChannelMaster.setRequestWorkflow(this);

		return sevaChannelMaster;
	}

	public SevaChannelMaster removeSevaChannelMaster(
			SevaChannelMaster sevaChannelMaster) {
		getSevaChannelMasters().remove(sevaChannelMaster);
		sevaChannelMaster.setRequestWorkflow(null);

		return sevaChannelMaster;
	}

	public List<SevaChannelMasterArchive> getSevaChannelMasterArchives() {
		return this.sevaChannelMasterArchives;
	}

	public void setSevaChannelMasterArchives(
			List<SevaChannelMasterArchive> sevaChannelMasterArchives) {
		this.sevaChannelMasterArchives = sevaChannelMasterArchives;
	}

	public SevaChannelMasterArchive addSevaChannelMasterArchive(
			SevaChannelMasterArchive sevaChannelMasterArchive) {
		getSevaChannelMasterArchives().add(sevaChannelMasterArchive);
		sevaChannelMasterArchive.setRequestWorkflow(this);

		return sevaChannelMasterArchive;
	}

	public SevaChannelMasterArchive removeSevaChannelMasterArchive(
			SevaChannelMasterArchive sevaChannelMasterArchive) {
		getSevaChannelMasterArchives().remove(sevaChannelMasterArchive);
		sevaChannelMasterArchive.setRequestWorkflow(null);

		return sevaChannelMasterArchive;
	}

	public List<SevaChannelMasterPending> getSevaChannelMasterPendings() {
		return this.sevaChannelMasterPendings;
	}

	public void setSevaChannelMasterPendings(
			List<SevaChannelMasterPending> sevaChannelMasterPendings) {
		this.sevaChannelMasterPendings = sevaChannelMasterPendings;
	}

	public SevaChannelMasterPending addSevaChannelMasterPending(
			SevaChannelMasterPending sevaChannelMasterPending) {
		getSevaChannelMasterPendings().add(sevaChannelMasterPending);
		sevaChannelMasterPending.setRequestWorkflow(this);

		return sevaChannelMasterPending;
	}

	public SevaChannelMasterPending removeSevaChannelMasterPending(
			SevaChannelMasterPending sevaChannelMasterPending) {
		getSevaChannelMasterPendings().remove(sevaChannelMasterPending);
		sevaChannelMasterPending.setRequestWorkflow(null);

		return sevaChannelMasterPending;
	}

	public List<SevaChannelRulesConfig> getSevaChannelRulesConfigs() {
		return this.sevaChannelRulesConfigs;
	}

	public void setSevaChannelRulesConfigs(
			List<SevaChannelRulesConfig> sevaChannelRulesConfigs) {
		this.sevaChannelRulesConfigs = sevaChannelRulesConfigs;
	}

	public SevaChannelRulesConfig addSevaChannelRulesConfig(
			SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().add(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setRequestWorkflow(this);

		return sevaChannelRulesConfig;
	}

	public SevaChannelRulesConfig removeSevaChannelRulesConfig(
			SevaChannelRulesConfig sevaChannelRulesConfig) {
		getSevaChannelRulesConfigs().remove(sevaChannelRulesConfig);
		sevaChannelRulesConfig.setRequestWorkflow(null);

		return sevaChannelRulesConfig;
	}

	public List<SevaFrequencyMaster> getSevaFrequencyMasters() {
		return this.sevaFrequencyMasters;
	}

	public void setSevaFrequencyMasters(
			List<SevaFrequencyMaster> sevaFrequencyMasters) {
		this.sevaFrequencyMasters = sevaFrequencyMasters;
	}

	public SevaFrequencyMaster addSevaFrequencyMaster(
			SevaFrequencyMaster sevaFrequencyMaster) {
		getSevaFrequencyMasters().add(sevaFrequencyMaster);
		sevaFrequencyMaster.setRequestWorkflow(this);

		return sevaFrequencyMaster;
	}

	public SevaFrequencyMaster removeSevaFrequencyMaster(
			SevaFrequencyMaster sevaFrequencyMaster) {
		getSevaFrequencyMasters().remove(sevaFrequencyMaster);
		sevaFrequencyMaster.setRequestWorkflow(null);

		return sevaFrequencyMaster;
	}

	public List<SevaFrequencyMasterArchive> getSevaFrequencyMasterArchives() {
		return this.sevaFrequencyMasterArchives;
	}

	public void setSevaFrequencyMasterArchives(
			List<SevaFrequencyMasterArchive> sevaFrequencyMasterArchives) {
		this.sevaFrequencyMasterArchives = sevaFrequencyMasterArchives;
	}

	public SevaFrequencyMasterArchive addSevaFrequencyMasterArchive(
			SevaFrequencyMasterArchive sevaFrequencyMasterArchive) {
		getSevaFrequencyMasterArchives().add(sevaFrequencyMasterArchive);
		sevaFrequencyMasterArchive.setRequestWorkflow(this);

		return sevaFrequencyMasterArchive;
	}

	public SevaFrequencyMasterArchive removeSevaFrequencyMasterArchive(
			SevaFrequencyMasterArchive sevaFrequencyMasterArchive) {
		getSevaFrequencyMasterArchives().remove(sevaFrequencyMasterArchive);
		sevaFrequencyMasterArchive.setRequestWorkflow(null);

		return sevaFrequencyMasterArchive;
	}

	public List<SevaFrequencyMasterPending> getSevaFrequencyMasterPendings() {
		return this.sevaFrequencyMasterPendings;
	}

	public void setSevaFrequencyMasterPendings(
			List<SevaFrequencyMasterPending> sevaFrequencyMasterPendings) {
		this.sevaFrequencyMasterPendings = sevaFrequencyMasterPendings;
	}

	public SevaFrequencyMasterPending addSevaFrequencyMasterPending(
			SevaFrequencyMasterPending sevaFrequencyMasterPending) {
		getSevaFrequencyMasterPendings().add(sevaFrequencyMasterPending);
		sevaFrequencyMasterPending.setRequestWorkflow(this);

		return sevaFrequencyMasterPending;
	}

	public SevaFrequencyMasterPending removeSevaFrequencyMasterPending(
			SevaFrequencyMasterPending sevaFrequencyMasterPending) {
		getSevaFrequencyMasterPendings().remove(sevaFrequencyMasterPending);
		sevaFrequencyMasterPending.setRequestWorkflow(null);

		return sevaFrequencyMasterPending;
	}

	public List<SevaMaster> getSevaMasters() {
		return this.sevaMasters;
	}

	public void setSevaMasters(List<SevaMaster> sevaMasters) {
		this.sevaMasters = sevaMasters;
	}

	public SevaMaster addSevaMaster(SevaMaster sevaMaster) {
		getSevaMasters().add(sevaMaster);
		sevaMaster.setRequestWorkflow(this);

		return sevaMaster;
	}

	public SevaMaster removeSevaMaster(SevaMaster sevaMaster) {
		getSevaMasters().remove(sevaMaster);
		sevaMaster.setRequestWorkflow(null);

		return sevaMaster;
	}

	public List<SevaMasterArchive> getSevaMasterArchives() {
		return this.sevaMasterArchives;
	}

	public void setSevaMasterArchives(List<SevaMasterArchive> sevaMasterArchives) {
		this.sevaMasterArchives = sevaMasterArchives;
	}

	public SevaMasterArchive addSevaMasterArchive(
			SevaMasterArchive sevaMasterArchive) {
		getSevaMasterArchives().add(sevaMasterArchive);
		sevaMasterArchive.setRequestWorkflow(this);

		return sevaMasterArchive;
	}

	public SevaMasterArchive removeSevaMasterArchive(
			SevaMasterArchive sevaMasterArchive) {
		getSevaMasterArchives().remove(sevaMasterArchive);
		sevaMasterArchive.setRequestWorkflow(null);

		return sevaMasterArchive;
	}

	public List<SevaMasterPending> getSevaMasterPendings() {
		return this.sevaMasterPendings;
	}

	public void setSevaMasterPendings(List<SevaMasterPending> sevaMasterPendings) {
		this.sevaMasterPendings = sevaMasterPendings;
	}

	public SevaMasterPending addSevaMasterPending(
			SevaMasterPending sevaMasterPending) {
		getSevaMasterPendings().add(sevaMasterPending);
		sevaMasterPending.setRequestWorkflow(this);

		return sevaMasterPending;
	}

	public SevaMasterPending removeSevaMasterPending(
			SevaMasterPending sevaMasterPending) {
		getSevaMasterPendings().remove(sevaMasterPending);
		sevaMasterPending.setRequestWorkflow(null);

		return sevaMasterPending;
	}

	public List<SevaQuotaConfig> getSevaQuotaConfigs() {
		return this.sevaQuotaConfigs;
	}

	public void setSevaQuotaConfigs(List<SevaQuotaConfig> sevaQuotaConfigs) {
		this.sevaQuotaConfigs = sevaQuotaConfigs;
	}

	public SevaQuotaConfig addSevaQuotaConfig(SevaQuotaConfig sevaQuotaConfig) {
		getSevaQuotaConfigs().add(sevaQuotaConfig);
		sevaQuotaConfig.setRequestWorkflow(this);

		return sevaQuotaConfig;
	}

	public SevaQuotaConfig removeSevaQuotaConfig(SevaQuotaConfig sevaQuotaConfig) {
		getSevaQuotaConfigs().remove(sevaQuotaConfig);
		sevaQuotaConfig.setRequestWorkflow(null);

		return sevaQuotaConfig;
	}

	public List<SevaQuotaConfigPending> getSevaQuotaConfigPendings() {
		return this.sevaQuotaConfigPendings;
	}

	public void setSevaQuotaConfigPendings(
			List<SevaQuotaConfigPending> sevaQuotaConfigPendings) {
		this.sevaQuotaConfigPendings = sevaQuotaConfigPendings;
	}

	public SevaQuotaConfigPending addSevaQuotaConfigPending(
			SevaQuotaConfigPending sevaQuotaConfigPending) {
		getSevaQuotaConfigPendings().add(sevaQuotaConfigPending);
		sevaQuotaConfigPending.setRequestWorkflow(this);

		return sevaQuotaConfigPending;
	}

	public SevaQuotaConfigPending removeSevaQuotaConfigPending(
			SevaQuotaConfigPending sevaQuotaConfigPending) {
		getSevaQuotaConfigPendings().remove(sevaQuotaConfigPending);
		sevaQuotaConfigPending.setRequestWorkflow(null);

		return sevaQuotaConfigPending;
	}

	public List<SevaTempleCalendar> getSevaTempleCalendars() {
		return this.sevaTempleCalendars;
	}

	public void setSevaTempleCalendars(
			List<SevaTempleCalendar> sevaTempleCalendars) {
		this.sevaTempleCalendars = sevaTempleCalendars;
	}

	public SevaTempleCalendar addSevaTempleCalendar(
			SevaTempleCalendar sevaTempleCalendar) {
		getSevaTempleCalendars().add(sevaTempleCalendar);
		sevaTempleCalendar.setRequestWorkflow(this);

		return sevaTempleCalendar;
	}

	public SevaTempleCalendar removeSevaTempleCalendar(
			SevaTempleCalendar sevaTempleCalendar) {
		getSevaTempleCalendars().remove(sevaTempleCalendar);
		sevaTempleCalendar.setRequestWorkflow(null);

		return sevaTempleCalendar;
	}

	public List<SevaTempleCalendarPending> getSevaTempleCalendarPendings() {
		return this.sevaTempleCalendarPendings;
	}

	public void setSevaTempleCalendarPendings(
			List<SevaTempleCalendarPending> sevaTempleCalendarPendings) {
		this.sevaTempleCalendarPendings = sevaTempleCalendarPendings;
	}

	public SevaTempleCalendarPending addSevaTempleCalendarPending(
			SevaTempleCalendarPending sevaTempleCalendarPending) {
		getSevaTempleCalendarPendings().add(sevaTempleCalendarPending);
		sevaTempleCalendarPending.setRequestWorkflow(this);

		return sevaTempleCalendarPending;
	}

	public SevaTempleCalendarPending removeSevaTempleCalendarPending(
			SevaTempleCalendarPending sevaTempleCalendarPending) {
		getSevaTempleCalendarPendings().remove(sevaTempleCalendarPending);
		sevaTempleCalendarPending.setRequestWorkflow(null);

		return sevaTempleCalendarPending;
	}

	public List<SlotsMaster> getSlotsMasters() {
		return this.slotsMasters;
	}

	public void setSlotsMasters(List<SlotsMaster> slotsMasters) {
		this.slotsMasters = slotsMasters;
	}

	public SlotsMaster addSlotsMaster(SlotsMaster slotsMaster) {
		getSlotsMasters().add(slotsMaster);
		slotsMaster.setRequestWorkflow(this);

		return slotsMaster;
	}

	public SlotsMaster removeSlotsMaster(SlotsMaster slotsMaster) {
		getSlotsMasters().remove(slotsMaster);
		slotsMaster.setRequestWorkflow(null);

		return slotsMaster;
	}

	public List<SlotsMasterArchive> getSlotsMasterArchives() {
		return this.slotsMasterArchives;
	}

	public void setSlotsMasterArchives(
			List<SlotsMasterArchive> slotsMasterArchives) {
		this.slotsMasterArchives = slotsMasterArchives;
	}

	public SlotsMasterArchive addSlotsMasterArchive(
			SlotsMasterArchive slotsMasterArchive) {
		getSlotsMasterArchives().add(slotsMasterArchive);
		slotsMasterArchive.setRequestWorkflow(this);

		return slotsMasterArchive;
	}

	public SlotsMasterArchive removeSlotsMasterArchive(
			SlotsMasterArchive slotsMasterArchive) {
		getSlotsMasterArchives().remove(slotsMasterArchive);
		slotsMasterArchive.setRequestWorkflow(null);

		return slotsMasterArchive;
	}

	public List<SlotsMasterPending> getSlotsMasterPendings() {
		return this.slotsMasterPendings;
	}

	public void setSlotsMasterPendings(
			List<SlotsMasterPending> slotsMasterPendings) {
		this.slotsMasterPendings = slotsMasterPendings;
	}

	public SlotsMasterPending addSlotsMasterPending(
			SlotsMasterPending slotsMasterPending) {
		getSlotsMasterPendings().add(slotsMasterPending);
		slotsMasterPending.setRequestWorkflow(this);

		return slotsMasterPending;
	}

	public SlotsMasterPending removeSlotsMasterPending(
			SlotsMasterPending slotsMasterPending) {
		getSlotsMasterPendings().remove(slotsMasterPending);
		slotsMasterPending.setRequestWorkflow(null);

		return slotsMasterPending;
	}

	public User getUser2() {
		return user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}
	

	public List<UssesPrePostTransaction> getUssesPrePostTransactions() {
		return this.ussesPrePostTransactions;
	}

	public void setUssesPrePostTransactions(List<UssesPrePostTransaction> ussesPrePostTransactions) {
		this.ussesPrePostTransactions = ussesPrePostTransactions;
	}

	public UssesPrePostTransaction addUssesPrePostTransaction(UssesPrePostTransaction ussesPrePostTransaction) {
		getUssesPrePostTransactions().add(ussesPrePostTransaction);
		ussesPrePostTransaction.setRequestWorkflow(this);

		return ussesPrePostTransaction;
	}

	public UssesPrePostTransaction removeUssesPrePostTransaction(UssesPrePostTransaction ussesPrePostTransaction) {
		getUssesPrePostTransactions().remove(ussesPrePostTransaction);
		ussesPrePostTransaction.setRequestWorkflow(null);

		return ussesPrePostTransaction;
	}

}