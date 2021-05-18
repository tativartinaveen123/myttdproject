package com.ttd.eseva.dip.entity;

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
import com.ttd.eseva.entity.SevaMaster;

@Entity
@Table(name = "SEVA_DIP_REGISTRATIONS")
@NamedQuery(name = "SevaDipRegistrations.findAll", query = "SELECT e FROM SevaDipRegistrations e")
public class SevaDipRegistrations implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEVA_DIP_REGISTRATIONS_GENERATOR", sequenceName = "SEVA_DIP_REGISTRATION_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEVA_DIP_REGISTRATIONS_GENERATOR")
	@Column(name = "SEVA_DIP_REG_ID")
	private Long dipOptionsRegId;

	@Column(name = "SEVA_DIP_FORM_ID")
	private String sevaDipFormId;

	// bi-directional many-to-one association to SevaDipPiligrim
	@OneToMany(mappedBy = "sevaDipRegistrations", cascade = CascadeType.ALL)
	private List<SevaDipPilgrim> sevaDipPiligrims;

	// bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name = "SEVA_ID")
	private SevaMaster sevaMaster;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	@Column(name = "NO_OF_PERSONS")
	private BigDecimal noOfPersons;

	@Column(name = "NO_OF_TICKETS")
	private BigDecimal noOfTickets;

	@Column(name = "TICKET_PRICE")
	private BigDecimal ticketPrice;

	// bi-directional many-to-one association to EmailNotifcation
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "EMAIL_NOTIFICATION_ID")
	private EmailNotification emailNotifcation;

	// bi-directional many-to-one association to SmsNotification
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "SMS_NOTIFICATION_ID")
	private SmsNotification smsNotification;

	@ManyToOne
	@JoinColumn(name = "SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	// bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name = "CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	@Temporal(TemporalType.DATE)
	@Column(name = "SEVA_DATE")
	private Date sevaDate;

	@Column(name = "TICKET_AVAILABILITY_STATUS")
	private String ticketAvailabilityStatus;

	@Column(name = "BOOKING_ID")
	private String sevaBookingId;

	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;
	
	@Column(name = "SEVA_DIP_SCHEDULE_ID")
	private Long sevaDipScheduleId;

	public Long getDipOptionsRegId() {
		return dipOptionsRegId;
	}

	public void setDipOptionsRegId(Long dipOptionsRegId) {
		this.dipOptionsRegId = dipOptionsRegId;
	}

	public SevaMaster getSevaMaster() {
		return sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BigDecimal getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(BigDecimal noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public BigDecimal getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(BigDecimal noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
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

	public ChannelMaster getChannelMaster() {
		return channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
	}

	public Date getSevaDate() {
		return sevaDate;
	}

	public void setSevaDate(Date sevaDate) {
		this.sevaDate = sevaDate;
	}

	public String getTicketAvailabilityStatus() {
		return ticketAvailabilityStatus;
	}

	public void setTicketAvailabilityStatus(String ticketAvailabilityStatus) {
		this.ticketAvailabilityStatus = ticketAvailabilityStatus;
	}

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getSevaDipFormId() {
		return sevaDipFormId;
	}

	public void setSevaDipFormId(String sevaDipFormId) {
		this.sevaDipFormId = sevaDipFormId;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public String getSevaBookingId() {
		return sevaBookingId;
	}

	public void setSevaBookingId(String sevaBookingId) {
		this.sevaBookingId = sevaBookingId;
	}

	public List<SevaDipPilgrim> getSevaDipPiligrims() {
		return sevaDipPiligrims;
	}

	public void setSevaDipPiligrims(List<SevaDipPilgrim> sevaDipPiligrims) {
		this.sevaDipPiligrims = sevaDipPiligrims;
	}

	public Long getSevaDipScheduleId() {
		return sevaDipScheduleId;
	}

	public void setSevaDipScheduleId(Long sevaDipScheduleId) {
		this.sevaDipScheduleId = sevaDipScheduleId;
	}
}
