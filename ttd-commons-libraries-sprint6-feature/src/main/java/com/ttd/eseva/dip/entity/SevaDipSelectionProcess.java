package com.ttd.eseva.dip.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.common.entity.User;
import com.ttd.eseva.entity.RequestWorkflow;
import com.ttd.eseva.entity.SevaMaster;

@Entity
@Table(name = "SEVA_DIP_SELECTION_PROCESS")
@NamedQuery(name = "SevaDipSelectionProcess.findAll", query = "SELECT e FROM SevaDipSelectionProcess e")
public class SevaDipSelectionProcess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "SEVA_DIP_SELECTION_PROCESS_SEQ_GENERATOR", sequenceName = "SEVA_DIP_SELECTION_PROCESS_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEVA_DIP_SELECTION_PROCESS_SEQ_GENERATOR")
	@Column(name = "SEVADIP_SELECT_PROCESS_ID")
	private Long sevaDipProcessId;

	@OneToOne
	@JoinColumn(name = "SEVA_DIP_REG_ID")
	private SevaDipRegistrations sevaDipRegistrations;

	// bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	// bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name = "SEVA_ID")
	private SevaMaster sevaMaster;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "SEVA_DATE")
	private Date sevaDate;
	
	@Column(name = "NO_OF_TICKETS")
	private BigDecimal noOfTickets;
	
	@Column(name="IS_SELECTED", length=3, columnDefinition="CHAR")
	private String isSelected;
	
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
	
	@Column(name = "SEVA_DIP_FORM_ID")
	private String sevaDipFormId;
	
	@Column(name = "NO_OF_PERSONS")
	private BigDecimal noOfPersons;

	@Column(name = "TICKET_PRICE")
	private BigDecimal ticketPrice;
	
	@ManyToOne
	@JoinColumn(name = "SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	// bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name = "CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;
	
	@Column(name = "SEVA_DIP_SCHEDULE_ID")
	private Long sevaDipScheduleId;

	public Long getSevaDipProcessId() {
		return sevaDipProcessId;
	}

	public void setSevaDipProcessId(Long sevaDipProcessId) {
		this.sevaDipProcessId = sevaDipProcessId;
	}

	public SevaDipRegistrations getSevaDipRegistrations() {
		return sevaDipRegistrations;
	}

	public void setSevaDipRegistrations(SevaDipRegistrations sevaDipRegistrations) {
		this.sevaDipRegistrations = sevaDipRegistrations;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public SevaMaster getSevaMaster() {
		return sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

	public Date getSevaDate() {
		return sevaDate;
	}

	public void setSevaDate(Date sevaDate) {
		this.sevaDate = sevaDate;
	}

	public BigDecimal getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(BigDecimal noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public String getIsSelected() {
		return isSelected;
	}

	public void setIsSelected(String isSelected) {
		this.isSelected = isSelected;
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

	public BigDecimal getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(BigDecimal noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public BigDecimal getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(BigDecimal ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public ServiceTypeMaster getServiceTypeMaster() {
		return serviceTypeMaster;
	}

	public void setServiceTypeMaster(ServiceTypeMaster serviceTypeMaster) {
		this.serviceTypeMaster = serviceTypeMaster;
	}

	public ChannelMaster getChannelMaster() {
		return channelMaster;
	}

	public void setChannelMaster(ChannelMaster channelMaster) {
		this.channelMaster = channelMaster;
	}

	public Long getSevaDipScheduleId() {
		return sevaDipScheduleId;
	}

	public void setSevaDipScheduleId(Long sevaDipScheduleId) {
		this.sevaDipScheduleId = sevaDipScheduleId;
	}

	
}