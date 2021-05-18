package com.ttd.eseva.dip.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SEVA_DIP_SCHEDULE")
@NamedQuery(name = "SevaDipSchedule.findAll", query = "SELECT s FROM SevaDipSchedule s")
public class SevaDipSchedule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SEVA_DIP_SCHEDULE_ID")
	private Long dipScheduleId;

	@Column(name = "NAME")
	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DIP_RESULT_DATE")
	private Date dipResultDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_DATE")
	private Date startDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_DATE")
	private Date endDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REG_START_DATE")
	private Date regStartDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "REG_END_DATE")
	private Date regEndDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_PAY_DATE")
	private Date startPayDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_PAY_DATE")
	private Date endPayDate;

	@Column(name = "MAX_NO_PERSONS_ALLOWED")
	private BigDecimal maxPersons;

	@Column(name = "MAX_OPTIONS_ALLOWED")
	private BigDecimal maxOptionsAllowed;

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

	// bi-directional many-to-one association to SevaDip
	@OneToMany(mappedBy = "sevaDipSchedule")
	private List<SevaDip> sevaDips;

	public Long getDipScheduleId() {
		return dipScheduleId;
	}

	public void setDipScheduleId(Long dipScheduleId) {
		this.dipScheduleId = dipScheduleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getRegStartDate() {
		return regStartDate;
	}

	public void setRegStartDate(Date regStartDate) {
		this.regStartDate = regStartDate;
	}

	public Date getRegEndDate() {
		return regEndDate;
	}

	public void setRegEndDate(Date regEndDate) {
		this.regEndDate = regEndDate;
	}

	public Date getStartPayDate() {
		return startPayDate;
	}

	public void setStartPayDate(Date startPayDate) {
		this.startPayDate = startPayDate;
	}

	public Date getEndPayDate() {
		return endPayDate;
	}

	public void setEndPayDate(Date endPayDate) {
		this.endPayDate = endPayDate;
	}

	public BigDecimal getMaxPersons() {
		return maxPersons;
	}

	public void setMaxPersons(BigDecimal maxPersons) {
		this.maxPersons = maxPersons;
	}

	public BigDecimal getMaxOptionsAllowed() {
		return maxOptionsAllowed;
	}

	public void setMaxOptionsAllowed(BigDecimal maxOptionsAllowed) {
		this.maxOptionsAllowed = maxOptionsAllowed;
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

	public List<SevaDip> getSevaDips() {
		return sevaDips;
	}

	public void setSevaDips(List<SevaDip> sevaDips) {
		this.sevaDips = sevaDips;
	}

	public Date getDipResultDate() {
		return dipResultDate;
	}

	public void setDipResultDate(Date dipResultDate) {
		this.dipResultDate = dipResultDate;
	}

}
