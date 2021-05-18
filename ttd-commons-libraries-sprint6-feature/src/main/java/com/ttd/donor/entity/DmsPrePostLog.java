package com.ttd.donor.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


	/**
	 * The persistent class for the DMS_PRE_POST_LOG database table.
	 * 
	 */
	@Entity
	@Table(name="DMS_PRE_POST_LOG")
	@NamedQuery(name="DmsPrePostLog.findAll", query="SELECT e FROM DmsPrePostLog e")
	public class DmsPrePostLog implements Serializable {
		private static final long serialVersionUID = 1L;
		
		@Id
		@SequenceGenerator(name = "DMS_PRE_POST_LOG_ID", sequenceName = "DMS_PRE_POST_LOG_SEQ", allocationSize=1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DMS_PRE_POST_LOG_ID")
		@Column(name="DMS_PRE_POST_LOG_ID")
		private long dmsPrePostLogId;

		@Column(name="OFFERING_ID")
		private String offeringId;
		
		@Column(name="OLD_AVAILING_DATE")
		private String oldAvailingDate;
		
		@Column(name="NEW_AVAILING_DATE")
		private String newAvailingDate;
		
		@Column(name="COMMENTS")
		private String comments;
		
		@Column(name="PRIV_REDEEM_ID")
		private String privRedeemId;
		
		@Column(name="CREATED_BY")
		private BigDecimal createdBy;

		@Temporal(TemporalType.DATE)
		@Column(name="CREATED_TIME", insertable = false, updatable = false)
		private Date createdTime;

		@Column(name="ROW_STATUS", insertable = false)
		private BigDecimal rowStatus;

		@Column(name="UPDATED_BY")
		private BigDecimal updatedBy;

		@Temporal(TemporalType.DATE)
		@Column(name="UPDATED_TIME")
		private Date updatedTime;

		@Column(name="USER_ID")
		private BigDecimal userId;
		
		@Column(name="PRE_POST_BY")
		private String prePostBy;

		public DmsPrePostLog() {
		}

		public long getDmsPrePostLogId() {
			return dmsPrePostLogId;
		}

		public void setDmsPrePostLogId(long dmsPrePostLogId) {
			this.dmsPrePostLogId = dmsPrePostLogId;
		}

		public String getOfferingId() {
			return offeringId;
		}

		public void setOfferingId(String offeringId) {
			this.offeringId = offeringId;
		}

		public String getOldAvailingDate() {
			return oldAvailingDate;
		}

		public void setOldAvailingDate(String oldAvailingDate) {
			this.oldAvailingDate = oldAvailingDate;
		}

		public String getNewAvailingDate() {
			return newAvailingDate;
		}

		public void setNewAvailingDate(String newAvailingDate) {
			this.newAvailingDate = newAvailingDate;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}

		public String getPrivRedeemId() {
			return privRedeemId;
		}

		public void setPrivRedeemId(String privRedeemId) {
			this.privRedeemId = privRedeemId;
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

		public BigDecimal getUserId() {
			return userId;
		}

		public void setUserId(BigDecimal userId) {
			this.userId = userId;
		}

		public String getPrePostBy() {
			return prePostBy;
		}

		public void setPrePostBy(String prePostBy) {
			this.prePostBy = prePostBy;
		}
		
}
