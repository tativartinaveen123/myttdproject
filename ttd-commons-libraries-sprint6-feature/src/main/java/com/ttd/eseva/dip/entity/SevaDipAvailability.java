package com.ttd.eseva.dip.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.entity.ChannelMaster;
import com.ttd.common.entity.ServiceTypeMaster;
import com.ttd.eseva.entity.SevaMaster;

@Entity
@Table(name = "SEVA_DIP_AVAILABILITY")
@NamedQuery(name = "SevaDipAvailability.findAll", query = "SELECT e FROM SevaDipAvailability e")
public class SevaDipAvailability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SEVA_DIP_AVAILABILITY_ID")
	private Long sevaDipAvailId;

	// bi-directional many-to-one association to SevaDip
	@ManyToOne
	@JoinColumn(name = "SEVA_DIP_ID", insertable=false, updatable=false)
	private SevaDip sevaDip;

	// bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name = "SEVA_ID")
	private SevaMaster sevaMaster;

	@Temporal(TemporalType.DATE)
	@Column(name = "SEVA_DATE")
	private Date sevaDate;
	
	@Column(name = "NO_OF_SEVAS")
	private BigDecimal noOfSevas;
	
	@Column(name = "SEVA_NAME")
	private String sevaName;
	
	@ManyToOne
	@JoinColumn(name="SERVICE_TYPE_ID")
	private ServiceTypeMaster serviceTypeMaster;

	@ManyToOne
	@JoinColumn(name = "CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;
	
	@Column(name = "STATUS")
	private Long status;
	
	@Column(name = "CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;
	
	@Column(name = "SEVA_DIP_SCHEDULE_ID")
	private Long sevaDipScheduleId;

	public Long getSevaDipAvailId() {
		return sevaDipAvailId;
	}

	public void setSevaDipAvailId(Long sevaDipAvailId) {
		this.sevaDipAvailId = sevaDipAvailId;
	}

	public SevaDip getSevaDip() {
		return sevaDip;
	}

	public void setSevaDip(SevaDip sevaDip) {
		this.sevaDip = sevaDip;
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

	public BigDecimal getNoOfSevas() {
		return noOfSevas;
	}

	public void setNoOfSevas(BigDecimal noOfSevas) {
		this.noOfSevas = noOfSevas;
	}

	public String getSevaName() {
		return sevaName;
	}

	public void setSevaName(String sevaName) {
		this.sevaName = sevaName;
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

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
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

	@Column(name = "ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name = "UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPDATED_TIME")
	private Date updatedTime;

	public Long getSevaDipScheduleId() {
		return sevaDipScheduleId;
	}

	public void setSevaDipScheduleId(Long sevaDipScheduleId) {
		this.sevaDipScheduleId = sevaDipScheduleId;
	}
	
	
}
