package com.ttd.edarshan.dip.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.common.entity.User;
import com.ttd.edarshan.entity.SlotsMaster;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SED_DIP_AUDIT_PROCESS database table.
 * 
 */
@Entity
@Table(name="SED_DIP_AUDIT_PROCESS")
@NamedQuery(name="SedDipAuditProcess.findAll", query="SELECT s FROM SedDipAuditProcess s")
public class SedDipAuditProcess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SED_DIP_AUDIT_PROCESS_SEQ_GENERATOR", sequenceName = "SED_DIP_AUDIT_PROCESS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SED_DIP_AUDIT_PROCESS_SEQ_GENERATOR")
	@Column(name="SEDDIP_AUDIT_PROCESS_ID")
	private long seddipAuditProcessId;

	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

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

	@Column(name="SED_DIP_REG_ID")
	private BigDecimal sedDipRegId;

	@Column(name="SED_DIP_SCHEDULE_ID")
	private BigDecimal sedDipScheduleId;


	@Column(name="SEDDIP_CHECKSUM")
	private String seddipChecksum;

	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	@ManyToOne
	@JoinColumn(name="SLOT_ID")
	private SlotsMaster slotMaster;

	@Column(name="TICKET_PRICE")
	private BigDecimal ticketPrice;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	//bi-directional many-to-one association to SedDipSelectionProcess
	@ManyToOne
	@JoinColumn(name="SEDDIP_SELECT_PROCESS_ID")
	private SedDipSelectionProcess sedDipSelectionProcess;

	public SedDipAuditProcess() {
	}

	public long getSeddipAuditProcessId() {
		return this.seddipAuditProcessId;
	}

	public void setSeddipAuditProcessId(long seddipAuditProcessId) {
		this.seddipAuditProcessId = seddipAuditProcessId;
	}

	
	public ChannelMaster getChannelMaster() {
		return channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
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

	public BigDecimal getSedDipRegId() {
		return this.sedDipRegId;
	}

	public void setSedDipRegId(BigDecimal sedDipRegId) {
		this.sedDipRegId = sedDipRegId;
	}

	public BigDecimal getSedDipScheduleId() {
		return this.sedDipScheduleId;
	}

	public void setSedDipScheduleId(BigDecimal sedDipScheduleId) {
		this.sedDipScheduleId = sedDipScheduleId;
	}

	public String getSeddipChecksum() {
		return this.seddipChecksum;
	}

	public void setSeddipChecksum(String seddipChecksum) {
		this.seddipChecksum = seddipChecksum;
	}

	
	public ServiceTypeMaster getServiceTypeMaster() {
		return serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public SlotsMaster getSlotMaster() {
		return slotMaster;
	}

	public void setSlotMaster(SlotsMaster slotMaster) {
		this.slotMaster = slotMaster;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SedDipSelectionProcess getSedDipSelectionProcess() {
		return this.sedDipSelectionProcess;
	}

	public void setSedDipSelectionProcess(SedDipSelectionProcess sedDipSelectionProcess) {
		this.sedDipSelectionProcess = sedDipSelectionProcess;
	}

}