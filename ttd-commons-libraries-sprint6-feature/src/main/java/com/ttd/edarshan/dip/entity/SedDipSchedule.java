package com.ttd.edarshan.dip.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the SED_DIP_SCHEDULE database table.
 * 
 */
@Entity
@Table(name="SED_DIP_SCHEDULE")
@NamedQuery(name="SedDipSchedule.findAll", query="SELECT s FROM SedDipSchedule s")
public class SedDipSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SED_DIP_SCHEDULE_ID")
	private long sedDipScheduleId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="CRON_EXPRESSION")
	private String cronExpression;

	@Column(name="CRON_FLAG")
	private BigDecimal cronFlag;

	@Column(name="CRON_JOB_ID")
	private String cronJobId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DIP_RESULT_DATE")
	private Date dipResultDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_DATE")
	private Date endDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="END_PAY_DATE")
	private Date endPayDate;

	@Column(name="MAX_NO_PERSONS_ALLOWED")
	private BigDecimal maxNoPersonsAllowed;

	@Column(name="MAX_OPTIONS_ALLOWED")
	private BigDecimal maxOptionsAllowed;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REG_END_DATE")
	private Date regEndDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="REG_START_DATE")
	private Date regStartDate;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_DATE")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="START_PAY_DATE")
	private Date startPayDate;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@OneToMany(mappedBy = "sedDipSchedule")
	private List<SedDip> sedDips;

	public SedDipSchedule() {
	}

	public long getSedDipScheduleId() {
		return this.sedDipScheduleId;
	}

	public void setSedDipScheduleId(long sedDipScheduleId) {
		this.sedDipScheduleId = sedDipScheduleId;
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

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public BigDecimal getCronFlag() {
		return this.cronFlag;
	}

	public void setCronFlag(BigDecimal cronFlag) {
		this.cronFlag = cronFlag;
	}

	public String getCronJobId() {
		return this.cronJobId;
	}

	public void setCronJobId(String cronJobId) {
		this.cronJobId = cronJobId;
	}

	public Date getDipResultDate() {
		return this.dipResultDate;
	}

	public void setDipResultDate(Date dipResultDate) {
		this.dipResultDate = dipResultDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndPayDate() {
		return this.endPayDate;
	}

	public void setEndPayDate(Date endPayDate) {
		this.endPayDate = endPayDate;
	}

	public BigDecimal getMaxNoPersonsAllowed() {
		return this.maxNoPersonsAllowed;
	}

	public void setMaxNoPersonsAllowed(BigDecimal maxNoPersonsAllowed) {
		this.maxNoPersonsAllowed = maxNoPersonsAllowed;
	}

	public BigDecimal getMaxOptionsAllowed() {
		return this.maxOptionsAllowed;
	}

	public void setMaxOptionsAllowed(BigDecimal maxOptionsAllowed) {
		this.maxOptionsAllowed = maxOptionsAllowed;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegEndDate() {
		return this.regEndDate;
	}

	public void setRegEndDate(Date regEndDate) {
		this.regEndDate = regEndDate;
	}

	public Date getRegStartDate() {
		return this.regStartDate;
	}

	public void setRegStartDate(Date regStartDate) {
		this.regStartDate = regStartDate;
	}

	public BigDecimal getRowStatus() {
		return this.rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartPayDate() {
		return this.startPayDate;
	}

	public void setStartPayDate(Date startPayDate) {
		this.startPayDate = startPayDate;
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

	public List<SedDip> getSedDips() {
		return sedDips;
	}

	public void setSedDips(List<SedDip> sedDips) {
		this.sedDips = sedDips;
	}

}