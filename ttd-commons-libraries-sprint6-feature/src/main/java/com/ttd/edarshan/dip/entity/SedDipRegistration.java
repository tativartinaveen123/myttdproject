package com.ttd.edarshan.dip.entity;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.eseva.dip.entity.SevaDipPilgrim;
import com.ttd.edarshan.entity.SlotsMaster;


/**
 * The persistent class for the SED_DIP_REGISTRATIONS database table.
 * 
 */
@Entity
@Table(name="SED_DIP_REGISTRATIONS")
@NamedQuery(name="SedDipRegistration.findAll", query="SELECT s FROM SedDipRegistration s")
public class SedDipRegistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SED_DIP_REGISTRATIONS_GENERATOR", sequenceName = "SED_DIP_REGISTRATIONS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SED_DIP_REGISTRATIONS_GENERATOR")
	@Column(name="SED_DIP_REG_ID")
	private long sedDipRegId;

	@Column(name="BOOKING_ID")
	private String bookingId;
	
	@OneToMany(mappedBy = "sedDipRegistration", cascade = CascadeType.ALL)
	private List<SedDipPilgrim> sedDipPilgrims;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;

	// bi-directional many-to-one association to SmsNotification
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;

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

	@ManyToOne
	@JoinColumn(name="SLOT_ID")
	private SlotsMaster slotsMaster;

	@Column(name="TICKET_AVAILABILITY_STATUS")
	private String ticketAvailabilityStatus;

	@Column(name="TICKET_PRICE")
	private BigDecimal ticketPrice;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	//bi-directional many-to-one association to ServiceTypeMaster
	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;

	//bi-directional many-to-one association to SedDipSelectionProcess
	@OneToMany(mappedBy="sedDipRegistration")
	private List<SedDipSelectionProcess> sedDipSelectionProcesses;

	public SedDipRegistration() {
	}

	public long getSedDipRegId() {
		return this.sedDipRegId;
	}

	public void setSedDipRegId(long sedDipRegId) {
		this.sedDipRegId = sedDipRegId;
	}

	public String getBookingId() {
		return this.bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
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

	public BigDecimal getSedDipScheduleId() {
		return this.sedDipScheduleId;
	}

	public void setSedDipScheduleId(BigDecimal sedDipScheduleId) {
		this.sedDipScheduleId = sedDipScheduleId;
	}

	
	public SlotsMaster getSlotsMaster() {
		return slotsMaster;
	}

	public void setSlotsMaster(SlotsMaster slotsMaster) {
		this.slotsMaster = slotsMaster;
	}

	public String getTicketAvailabilityStatus() {
		return this.ticketAvailabilityStatus;
	}

	public void setTicketAvailabilityStatus(String ticketAvailabilityStatus) {
		this.ticketAvailabilityStatus = ticketAvailabilityStatus;
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

	public ChannelMaster getChannelMaster() {
		return this.channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return this.serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<SedDipSelectionProcess> getSedDipSelectionProcesses() {
		return this.sedDipSelectionProcesses;
	}

	public void setSedDipSelectionProcesses(List<SedDipSelectionProcess> sedDipSelectionProcesses) {
		this.sedDipSelectionProcesses = sedDipSelectionProcesses;
	}

	public SedDipSelectionProcess addSedDipSelectionProcess(SedDipSelectionProcess sedDipSelectionProcess) {
		getSedDipSelectionProcesses().add(sedDipSelectionProcess);
		sedDipSelectionProcess.setSedDipRegistration(this);

		return sedDipSelectionProcess;
	}

	public SedDipSelectionProcess removeSedDipSelectionProcess(SedDipSelectionProcess sedDipSelectionProcess) {
		getSedDipSelectionProcesses().remove(sedDipSelectionProcess);
		sedDipSelectionProcess.setSedDipRegistration(null);

		return sedDipSelectionProcess;
	}

	public List<SedDipPilgrim> getSedDipPilgrims() {
		return sedDipPilgrims;
	}

	public void setSedDipPilgrims(List<SedDipPilgrim> sedDipPilgrims) {
		this.sedDipPilgrims = sedDipPilgrims;
	}

	public EmailNotification getEmailNotifcation() {
		return emailNotifcation;
	}

	public void setEmailNotifcation(EmailNotification emailNotifcation) {
		this.emailNotifcation = emailNotifcation;
	}

	public SmsNotification getSmsNotification() {
		return smsNotification;
	}

	public void setSmsNotification(SmsNotification smsNotification) {
		this.smsNotification = smsNotification;
	}
	
}