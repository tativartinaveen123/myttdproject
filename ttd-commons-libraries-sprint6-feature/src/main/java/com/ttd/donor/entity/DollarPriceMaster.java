package com.ttd.donor.entity;

import java.io.Serializable;

import javax.persistence.*;

import com.ttd.common.entity.EmailNotification;
import com.ttd.common.entity.SmsNotification;
import com.ttd.common.entity.User;
import com.ttd.ehundi.entity.PgTransaction;
import com.ttd.publications.entity.PublicationsBookingDtl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="DOLLAR_PRICE_MASTER")
@NamedQuery(name="DollarPriceMaster.findAll", query="SELECT d FROM DollarPriceMaster d")
public class DollarPriceMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "dollar_price_master_seq", sequenceName = "dollar_price_master_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "dollar_price_master_seq")
	@Column(name="ID")
	private BigDecimal id;

	@Column(name="DOLLAR_CATEGORY_ID")
	private String dollarCategoryId;

	@Column(name="DOLLAR_WEIGHT")
	private BigDecimal dollarWeight;

	@Column(name="DOLLAR_PRICE")
	private BigDecimal dollarPrice;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_TIME")
	private Date createdTime;

	@Column(name="DESCRIPTION")
	private String dollarDesc;


	@Column(name="ROW_STATUS")
	private BigDecimal rowStatus;

	
	@Column(name="TOTAL_PRICE")
	private BigDecimal totalPrice;

	@Column(name="DOLLAR_CODE")
	private String dollarCode;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	
	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;

	@Column(name="REMARKS")
	private String remarks;
	
	@Column(name="EFFECTIVE_START_DATE")
	private Date startDate;
	
	
	/*
	 * @Column(name="EFFECTIVE_END_DATE") private Date endDate;
	 */
	
	@Column(name="SGST_AMOUNT")
	private BigDecimal sgstAmount;
	
	@Column(name="CGST_AMOUNT")
	private BigDecimal cgstAmount;
	
	@Column(name="SGST_RATE")
	private BigDecimal sgstRate;
	
	@Column(name="CGST_RATE")
	private BigDecimal cgstRate;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getDollarCategoryId() {
		return dollarCategoryId;
	}

	public void setDollarCategoryId(String dollarCategoryId) {
		this.dollarCategoryId = dollarCategoryId;
	}

	public BigDecimal getDollarWeight() {
		return dollarWeight;
	}

	public void setDollarWeight(BigDecimal dollarWeight) {
		this.dollarWeight = dollarWeight;
	}

	public BigDecimal getDollarPrice() {
		return dollarPrice;
	}

	public void setDollarPrice(BigDecimal dollarPrice) {
		this.dollarPrice = dollarPrice;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDollarDesc() {
		return dollarDesc;
	}

	public void setDollarDesc(String dollarDesc) {
		this.dollarDesc = dollarDesc;
	}

	public BigDecimal getRowStatus() {
		return rowStatus;
	}

	public void setRowStatus(BigDecimal rowStatus) {
		this.rowStatus = rowStatus;
	}

	
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDollarCode() {
		return dollarCode;
	}

	public void setDollarCode(String dollarCode) {
		this.dollarCode = dollarCode;
	}

	public BigDecimal getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(BigDecimal updatedBy) {
		this.updatedBy = updatedBy;
	}

	public BigDecimal getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(BigDecimal createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/*
	 * public Date getEndDate() { return endDate; }
	 * 
	 * public void setEndDate(Date endDate) { this.endDate = endDate; }
	 */
	public BigDecimal getSgstAmount() {
		return sgstAmount;
	}

	public void setSgstAmount(BigDecimal sgstAmount) {
		this.sgstAmount = sgstAmount;
	}

	public BigDecimal getCgstAmount() {
		return cgstAmount;
	}

	public void setCgstAmount(BigDecimal cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	public BigDecimal getSgstRate() {
		return sgstRate;
	}

	public void setSgstRate(BigDecimal sgstRate) {
		this.sgstRate = sgstRate;
	}

	public BigDecimal getCgstRate() {
		return cgstRate;
	}

	public void setCgstRate(BigDecimal cgstRate) {
		this.cgstRate = cgstRate;
	}
	
	
	
	
	
	
}