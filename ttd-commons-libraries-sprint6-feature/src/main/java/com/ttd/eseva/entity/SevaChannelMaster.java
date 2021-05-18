package com.ttd.eseva.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.ChannelMaster;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SEVA_CHANNEL_MASTER database table.
 * 
 */
@Entity
@Table(name="SEVA_CHANNEL_MASTER")
@NamedQuery(name="SevaChannelMaster.findAll", query="SELECT s FROM SevaChannelMaster s")
public class SevaChannelMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEVA_CHANNEL_MASTER_ID_GENERATOR", sequenceName="SEVA_CHANNEL_MASTER_ID", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEVA_CHANNEL_MASTER_ID_GENERATOR")  
	@Column(name="SEVA_CHANNEL_MASTER_ID")
	private long sevaChannelMasterId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable = false, updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable = false, updatable = false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	//bi-directional many-to-one association to ChannelMaster
	@ManyToOne
	@JoinColumn(name="CHANNEL_TYPE_ID")
	private ChannelMaster channelMaster;

	//bi-directional many-to-one association to RequestWorkflow
	@ManyToOne
	@JoinColumn(name="REQUEST_ID")
	private RequestWorkflow requestWorkflow;

	//bi-directional many-to-one association to SevaMaster
	@ManyToOne
	@JoinColumn(name="SEVA_ID")
	private SevaMaster sevaMaster;

	public SevaChannelMaster() {
	}

	public long getSevaChannelMasterId() {
		return this.sevaChannelMasterId;
	}

	public void setSevaChannelMasterId(long sevaChannelMasterId) {
		this.sevaChannelMasterId = sevaChannelMasterId;
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

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
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

	public RequestWorkflow getRequestWorkflow() {
		return this.requestWorkflow;
	}

	public void setRequestWorkflow(RequestWorkflow requestWorkflow) {
		this.requestWorkflow = requestWorkflow;
	}

	public SevaMaster getSevaMaster() {
		return this.sevaMaster;
	}

	public void setSevaMaster(SevaMaster sevaMaster) {
		this.sevaMaster = sevaMaster;
	}

}