package com.ttd.km.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the KM_EXTENSION_MASTER database table.
 * 
 */
@Entity
@Table(name="KM_EXTENSION_MASTER")
@NamedQuery(name="KmExtensionMaster.findAll", query="SELECT k FROM KmExtensionMaster k")
public class KmExtensionMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="EXTENSION_HOURS")
	private BigDecimal extensionHours;

	@Id
	@Column(name="EXTENSION_MASTER_ID")
	private BigDecimal extensionMasterId;

	@Column(name="EXTENSION_PERSENTAGE_RENT")
	private BigDecimal extensionPersentageRent;

	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	public KmExtensionMaster() {
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

	public BigDecimal getExtensionHours() {
		return this.extensionHours;
	}

	public void setExtensionHours(BigDecimal extensionHours) {
		this.extensionHours = extensionHours;
	}

	public BigDecimal getExtensionMasterId() {
		return this.extensionMasterId;
	}

	public void setExtensionMasterId(BigDecimal extensionMasterId) {
		this.extensionMasterId = extensionMasterId;
	}

	public BigDecimal getExtensionPersentageRent() {
		return this.extensionPersentageRent;
	}

	public void setExtensionPersentageRent(BigDecimal extensionPersentageRent) {
		this.extensionPersentageRent = extensionPersentageRent;
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

}