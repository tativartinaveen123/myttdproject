package com.ttd.edarshan.dip.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SED_DIP_SELECTION_PROCESS database table.
 * 
 */
@Entity
@Table(name="SED_DIP_SELECTION_PROCESS")
@NamedQuery(name="SedDipSelectionProcess.findAll", query="SELECT s FROM SedDipSelectionProcess s")
public class SedDipSelectionProcess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SED_DIP_SELECTION_PROCESS_SEQ_GENERATOR", sequenceName = "SED_DIP_SELECTION_PROCESS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SED_DIP_SELECTION_PROCESS_SEQ_GENERATOR")
	@Column(name="SEDDIP_SELECT_PROCESS_ID")
	private long seddipSelectProcessId;

	@Column(name="CHANNEL_TYPE_ID")
	private BigDecimal channelTypeId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="IS_SELECTED")
	private String isSelected;

	@Column(name="NO_OF_PERSONS")
	private BigDecimal noOfPersons;

	@Column(name="NO_OF_TICKETS")
	private BigDecimal noOfTickets;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Temporal(TemporalType.DATE)
	@Column(name="DARSHAN_DATE")
	private Date darshanDate;

	@Column(name="SED_DIP_FORM_ID")
	private String sedDipFormId;

	@Column(name="SED_DIP_SCHEDULE_ID")
	private BigDecimal sedDipScheduleId;

	@Column(name="SERVICE_TYPE_ID")
	private BigDecimal serviceTypeId;

	@Column(name="SLOT_ID")
	private BigDecimal slotId;

	@Column(name="TICKET_PRICE")
	private BigDecimal ticketPrice;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="USER_ID")
	private BigDecimal userId;

	//bi-directional many-to-one association to SedDipAuditProcess
	@OneToMany(mappedBy="sedDipSelectionProcess")
	private List<SedDipAuditProcess> sedDipAuditProcesses;

	//bi-directional many-to-one association to SedDipRegistration
	@ManyToOne
	@JoinColumn(name="SED_DIP_REG_ID")
	private SedDipRegistration sedDipRegistration;

	public SedDipSelectionProcess() {
	}

	public long getSeddipSelectProcessId() {
		return this.seddipSelectProcessId;
	}

	public void setSeddipSelectProcessId(long seddipSelectProcessId) {
		this.seddipSelectProcessId = seddipSelectProcessId;
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

	public String getIsSelected() {
		return this.isSelected;
	}

	public void setIsSelected(String isSelected) {
		this.isSelected = isSelected;
	}

	public BigDecimal getNoOfPersons() {
		return this.noOfPersons;
	}

	public void setNoOfPersons(BigDecimal noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public BigDecimal getNoOfTickets() {
		return this.noOfTickets;
	}

	public void setNoOfTickets(BigDecimal noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public Date getDarshanDate() {
		return darshanDate;
	}

	public void setDarshanDate(Date darshanDate) {
		this.darshanDate = darshanDate;
	}

	public String getSedDipFormId() {
		return this.sedDipFormId;
	}

	public void setSedDipFormId(String sedDipFormId) {
		this.sedDipFormId = sedDipFormId;
	}

	public BigDecimal getSedDipScheduleId() {
		return this.sedDipScheduleId;
	}

	public void setSedDipScheduleId(BigDecimal sedDipScheduleId) {
		this.sedDipScheduleId = sedDipScheduleId;
	}

	public BigDecimal getServiceTypeId() {
		return this.serviceTypeId;
	}

	public void setServiceTypeId(BigDecimal serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public BigDecimal getSlotId() {
		return this.slotId;
	}

	public void setSlotId(BigDecimal slotId) {
		this.slotId = slotId;
	}

	public BigDecimal getTicketPrice() {
		return this.ticketPrice;
	}

	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
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

	public BigDecimal getUserId() {
		return this.userId;
	}

	public void setUserId(BigDecimal userId) {
		this.userId = userId;
	}

	public List<SedDipAuditProcess> getSedDipAuditProcesses() {
		return this.sedDipAuditProcesses;
	}

	public void setSedDipAuditProcesses(List<SedDipAuditProcess> sedDipAuditProcesses) {
		this.sedDipAuditProcesses = sedDipAuditProcesses;
	}

	public SedDipAuditProcess addSedDipAuditProcess(SedDipAuditProcess sedDipAuditProcess) {
		getSedDipAuditProcesses().add(sedDipAuditProcess);
		sedDipAuditProcess.setSedDipSelectionProcess(this);

		return sedDipAuditProcess;
	}

	public SedDipAuditProcess removeSedDipAuditProcess(SedDipAuditProcess sedDipAuditProcess) {
		getSedDipAuditProcesses().remove(sedDipAuditProcess);
		sedDipAuditProcess.setSedDipSelectionProcess(null);

		return sedDipAuditProcess;
	}

	public SedDipRegistration getSedDipRegistration() {
		return this.sedDipRegistration;
	}

	public void setSedDipRegistration(SedDipRegistration sedDipRegistration) {
		this.sedDipRegistration = sedDipRegistration;
	}

}