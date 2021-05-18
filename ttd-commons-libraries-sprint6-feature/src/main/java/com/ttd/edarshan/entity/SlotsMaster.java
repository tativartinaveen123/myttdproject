package com.ttd.edarshan.entity;

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

import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.edarshan.dip.entity.SedDip;
import com.ttd.eseva.entity.RequestWorkflow;

/**
 * The persistent class for the SLOTS_MASTER database table.
 * 
 */
@Entity
@Table(name = "SLOTS_MASTER")
@NamedQuery(name = "SlotsMaster.findAll", query = "SELECT s FROM SlotsMaster s")
public class SlotsMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SLOT_ID")
	private long slotId;

	@Column(name = "ACTIVE_FLAG")
	private BigDecimal activeFlag;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name = "LEGACY_SLOT_ID")
	private BigDecimal legacySlotId;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "SLOT_BEGIN_TIME")
	private String slotBeginTime;

	@Column(name = "SLOT_END_TIME")
	private String slotEndTime;

	@Column(name = "SLOT_NAME")
	private String slotName;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	// bi-directional many-to-one association to DarshanSltChnConf
	@OneToMany(mappedBy = "slotsMaster")
	private List<DarshanSltChnConf> darshanSltChnConfs;

	// bi-directional many-to-one association to DarshanSltChnConfArchive
	@OneToMany(mappedBy = "slotsMaster")
	private List<DarshanSltChnConfArchive> darshanSltChnConfArchives;

	// bi-directional many-to-one association to DarshanSltChnConfPending
	@OneToMany(mappedBy = "slotsMaster")
	private List<DarshanSltChnConfPending> darshanSltChnConfPendings;

	// bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name = "REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	// bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name = "SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	// bi-directional many-to-one association to SlotsMasterArchive
	@OneToMany(mappedBy = "slotsMaster")
	private List<SlotsMasterArchive> slotsMasterArchives;

	// bi-directional many-to-one association to SlotsMasterPending
//	@OneToMany(mappedBy = "slotsMaster")
//	private List<SlotsMasterPending> slotsMasterPendings;
	
	//bi-directional many-to-one association to SedDip
	@OneToMany(mappedBy="slotsMaster")
	private List<SedDip> sedDips;

	public SlotsMaster() {
	}

	public long getSlotId() {
		return this.slotId;
	}

	public void setSlotId(long slotId) {
		this.slotId = slotId;
	}

	public BigDecimal getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(BigDecimal activeFlag) {
		this.activeFlag = activeFlag;
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

	public BigDecimal getLegacySlotId() {
		return this.legacySlotId;
	}

	public void setLegacySlotId(BigDecimal legacySlotId) {
		this.legacySlotId = legacySlotId;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public String getSlotBeginTime() {
		return this.slotBeginTime;
	}

	public void setSlotBeginTime(String slotBeginTime) {
		this.slotBeginTime = slotBeginTime;
	}

	public String getSlotEndTime() {
		return this.slotEndTime;
	}

	public void setSlotEndTime(String slotEndTime) {
		this.slotEndTime = slotEndTime;
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

	public List<DarshanSltChnConf> getDarshanSltChnConfs() {
		return this.darshanSltChnConfs;
	}

	public void setDarshanSltChnConfs(List<DarshanSltChnConf> darshanSltChnConfs) {
		this.darshanSltChnConfs = darshanSltChnConfs;
	}

	public DarshanSltChnConf addDarshanSltChnConf(
			DarshanSltChnConf darshanSltChnConf) {
		getDarshanSltChnConfs().add(darshanSltChnConf);
		darshanSltChnConf.setSlotsMaster(this);

		return darshanSltChnConf;
	}

	public DarshanSltChnConf removeDarshanSltChnConf(
			DarshanSltChnConf darshanSltChnConf) {
		getDarshanSltChnConfs().remove(darshanSltChnConf);
		darshanSltChnConf.setSlotsMaster(null);

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
		darshanSltChnConfArchive.setSlotsMaster(this);

		return darshanSltChnConfArchive;
	}

	public DarshanSltChnConfArchive removeDarshanSltChnConfArchive(
			DarshanSltChnConfArchive darshanSltChnConfArchive) {
		getDarshanSltChnConfArchives().remove(darshanSltChnConfArchive);
		darshanSltChnConfArchive.setSlotsMaster(null);

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
		darshanSltChnConfPending.setSlotsMaster(this);

		return darshanSltChnConfPending;
	}

	public DarshanSltChnConfPending removeDarshanSltChnConfPending(
			DarshanSltChnConfPending darshanSltChnConfPending) {
		getDarshanSltChnConfPendings().remove(darshanSltChnConfPending);
		darshanSltChnConfPending.setSlotsMaster(null);

		return darshanSltChnConfPending;
	}

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
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
		slotsMasterArchive.setSlotsMaster(this);

		return slotsMasterArchive;
	}

	public SlotsMasterArchive removeSlotsMasterArchive(
			SlotsMasterArchive slotsMasterArchive) {
		getSlotsMasterArchives().remove(slotsMasterArchive);
		slotsMasterArchive.setSlotsMaster(null);

		return slotsMasterArchive;
	}

	public List<SedDip> getSedDips() {
		return this.sedDips;
	}

	public void setSedDips(List<SedDip> sedDips) {
		this.sedDips = sedDips;
	}

	public SedDip addSedDip(SedDip sedDip) {
		getSedDips().add(sedDip);
		sedDip.setSlotsMaster(this);

		return sedDip;
	}

	public SedDip removeSedDip(SedDip sedDip) {
		getSedDips().remove(sedDip);
		sedDip.setSlotsMaster(null);

		return sedDip;
	}
	
//	public List<SlotsMasterPending> getSlotsMasterPendings() {
//		return this.slotsMasterPendings;
//	}
//
//	public void setSlotsMasterPendings(
//			List<SlotsMasterPending> slotsMasterPendings) {
//		this.slotsMasterPendings = slotsMasterPendings;
//	}

//	public SlotsMasterPending addSlotsMasterPending(
//			SlotsMasterPending slotsMasterPending) {
//		getSlotsMasterPendings().add(slotsMasterPending);
//		slotsMasterPending.setSlotsMaster(this);
//
//		return slotsMasterPending;
//	}
//
//	public SlotsMasterPending removeSlotsMasterPending(
//			SlotsMasterPending slotsMasterPending) {
//		getSlotsMasterPendings().remove(slotsMasterPending);
//		slotsMasterPending.setSlotsMaster(null);
//
//		return slotsMasterPending;
//	}
	
}