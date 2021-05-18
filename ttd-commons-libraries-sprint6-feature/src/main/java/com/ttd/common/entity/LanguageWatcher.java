package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the LANGUAGE_WATCHER database table.
 * 
 */
@Entity
@Table(name="LANGUAGE_WATCHER")
@NamedQuery(name="LanguageWatcher.findAll", query="SELECT l FROM LanguageWatcher l")
public class LanguageWatcher implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LANGUAGE_WATCHER_SEQ_GENERATOR", sequenceName="LANGUAGE_WATCHER_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LANGUAGE_WATCHER_SEQ_GENERATOR")
	@Column(name="LANGUAGE_WATCHER_ID")
	private long languageWatcherId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;

	@Column(name="LANGUAGE_NAME")
	private String languageName;

	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="WATCHER_COUNT")
	private long watcherCount;

	@Temporal(TemporalType.DATE)
	@Column(name="WATCHER_DATE")
	private Date watcherDate;

	public LanguageWatcher() {
	}

	public long getLanguageWatcherId() {
		return this.languageWatcherId;
	}

	public void setLanguageWatcherId(long languageWatcherId) {
		this.languageWatcherId = languageWatcherId;
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

	public String getLanguageName() {
		return this.languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
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

	public long getWatcherCount() {
		return this.watcherCount;
	}

	public void setWatcherCount(long watcherCount) {
		this.watcherCount = watcherCount;
	}

	public Date getWatcherDate() {
		return this.watcherDate;
	}

	public void setWatcherDate(Date watcherDate) {
		this.watcherDate = watcherDate;
	}

}