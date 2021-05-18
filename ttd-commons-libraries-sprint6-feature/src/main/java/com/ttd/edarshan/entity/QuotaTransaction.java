package com.ttd.edarshan.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.PgMaster;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
/**
 * The persistent class for the QUOTA_TRANSACTION database table.
 * 
 */
@Entity
@Table(name="QUOTA_TRANSACTION")
@NamedQuery(name="QuotaTransaction.findAll", query="SELECT p FROM QuotaTransaction p")
public class QuotaTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="QUOTA_TRANSACTION_SEQ_GENERATOR", sequenceName="QUOTA_TRANSACTION_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="QUOTA_TRANSACTION_SEQ_GENERATOR")
	@Column(name="QUOTA_TRANSACTION_ID")
	private long quotaTransactionId;

	@Column(name = "REQUEST_ID")
	private long requestId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TRANSMIT_TIME")
	private Date transmitTime;
	
	@Column(name="CONSUMER_APPROVAL")
	private String consumerApproval;
	
	@Column(name="TRANSACTION_TOKEN")
	private String transactionToken;
	
	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME",insertable = false,updatable = false)
	private Date createdTime;

	@Column(name="ROW_STATUS", insertable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public QuotaTransaction() {
	}

	public long getQuotaTransactionId() {
		return quotaTransactionId;
	}

	public void setQuotaTransactionId(long quotaTransactionId) {
		this.quotaTransactionId = quotaTransactionId;
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

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public String getConsumerApproval() {
		return consumerApproval;
	}

	public void setConsumerApproval(String consumerApproval) {
		this.consumerApproval = consumerApproval;
	}

	public String getTransactionToken() {
		return transactionToken;
	}

	public void setTransactionToken(String transactionToken) {
		this.transactionToken = transactionToken;
	}

	public Date getTransmitTime() {
		return transmitTime;
	}

	public void setTransmitTime(Date transmitTime) {
		this.transmitTime = transmitTime;
	}

	

}


	

