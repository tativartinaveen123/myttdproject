package com.ttd.common.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
	
	@Entity
	@Table(name="PG_SESSION_INFO")	
	public class SessionInfo implements Serializable {
		private static final long serialVersionUID = 1L;

		@Id
		@Column(name="OFFERING_ID")
		private String offeringId;

		@Column(name="CREATED_BY")
		private BigDecimal createdBy;

		@Temporal(TemporalType.DATE)
		@Column(name="CREATED_TIME", insertable = false, updatable = false)
		private Date createdTime;

		@Column(name="SESSION_VALUE")
		private String sessionValue;
		
		@Column(name="UPDATED_BY")
		private BigDecimal updatedBy;

		@Temporal(TemporalType.DATE)
		@Column(name="UPDATED_TIME")
		private Date updatedTime;

		public SessionInfo() {}

		public String getOfferingId() {
			return offeringId;
		}

		public void setOfferingId(String offeringId) {
			this.offeringId = offeringId;
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

		public String getSessionValue() {
			return sessionValue;
		}

		public void setSessionValue(String sessionValue) {
			this.sessionValue = sessionValue;
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

	}

