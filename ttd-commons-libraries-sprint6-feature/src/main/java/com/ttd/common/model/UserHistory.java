package com.ttd.common.model;

import java.math.BigDecimal;

public class UserHistory {
	
	private String referenceNo;
	private String remarks;
	private BigDecimal amount;
	private String offeringDate;
	private String paymentReceipt; 
	private String hundiType;
	
	
	
	public String getHundiType() {
		return hundiType;
	}
	public void setHundiType(String hundiType) {
		this.hundiType = hundiType;
	}
	public String getOfferingDate() {
		return offeringDate;
	}
	public void setOfferingDate(String offeringDate) {
		this.offeringDate = offeringDate;
	}
	public String getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public String getPaymentReceipt() {
		return paymentReceipt;
	}
	public void setPaymentReceipt(String paymentReceipt) {
		this.paymentReceipt = paymentReceipt;
	}
	
	
}
