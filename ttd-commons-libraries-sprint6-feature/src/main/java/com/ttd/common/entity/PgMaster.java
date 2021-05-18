package com.ttd.common.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ttd.ehundi.entity.PgTransaction;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the PG_MASTER database table.
 * 
 */
@Entity
@Table(name="PG_MASTER")
@NamedQuery(name="PgMaster.findAll", query="SELECT p FROM PgMaster p")
public class PgMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PG_MASTER_PGID_GENERATOR", sequenceName="PG_MASTER_PG_ID_SEQ", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PG_MASTER_PGID_GENERATOR")
	@Column(name="PG_ID")
	private long pgId;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="PAYMENT_GATEWAY_NAME")
	private String paymentGatewayName;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="PG_ORDER")
	private BigDecimal pgOrder;
	
	@Column(name="SUCCESS_RATE")
	private String successRate;
	
	public String getSuccessRate() {
		return successRate;
	}

	public void setSuccessRate(String successRate) {
		this.successRate = successRate;
	}

	//bi-directional many-to-one association to PgTransaction
	@OneToMany(mappedBy="pgMaster")
	@JsonIgnore
	private List<PgTransaction> pgTransactions;

	public PgMaster() {
	}

	public BigDecimal getPgOrder() {
		return pgOrder;
	}

	public void setPgOrder(BigDecimal pgOrder) {
		this.pgOrder = pgOrder;
	}

	public long getPgId() {
		return this.pgId;
	}

	public void setPgId(long pgId) {
		this.pgId = pgId;
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

	public String getPaymentGatewayName() {
		return this.paymentGatewayName;
	}

	public void setPaymentGatewayName(String paymentGatewayName) {
		this.paymentGatewayName = paymentGatewayName;
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

	public List<PgTransaction> getPgTransactions() {
		return this.pgTransactions;
	}

	public void setPgTransactions(List<PgTransaction> pgTransactions) {
		this.pgTransactions = pgTransactions;
	}

	public PgTransaction addPgTransaction(PgTransaction pgTransaction) {
		getPgTransactions().add(pgTransaction);
		pgTransaction.setPgMaster(this);

		return pgTransaction;
	}

	public PgTransaction removePgTransaction(PgTransaction pgTransaction) {
		getPgTransactions().remove(pgTransaction);
		pgTransaction.setPgMaster(null);

		return pgTransaction;
	}

}