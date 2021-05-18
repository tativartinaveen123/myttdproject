package com.ttd.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "TTD_Payment_Gateway_Master")
public class Bank {
	
	@Id
	@GeneratedValue
	@Column(name="Payment_Gateway_ID")
	 private int PaymentGatewayID;
	@Column(name="Payment_Gateway_Name")
	 private String PaymentGatewayName;
	@Column(name="Description")
	 private String Description;
	@Column(name="row_status")
	 private int rowstatus;
	@Column(name="created_by")
	 private int createdby;
	@Column(name="created_time")
	 private Date createdtime;
	@Column(name="updated_by")
	 private int updatedby;
	@Column(name="updated_time")
	 private Date updatedtime;
	public int getPaymentGatewayID() {
		return PaymentGatewayID;
	}
	public void setPaymentGatewayID(int paymentGatewayID) {
		PaymentGatewayID = paymentGatewayID;
	}
	public String getPaymentGatewayName() {
		return PaymentGatewayName;
	}
	public void setPaymentGatewayName(String paymentGatewayName) {
		PaymentGatewayName = paymentGatewayName;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getRowstatus() {
		return rowstatus;
	}
	public void setRowstatus(int rowstatus) {
		this.rowstatus = rowstatus;
	}
	public int getCreatedby() {
		return createdby;
	}
	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}
	public Date getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}
	public int getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(int updatedby) {
		this.updatedby = updatedby;
	}
	public Date getUpdatedtime() {
		return updatedtime;
	}
	public void setUpdatedtime(Date updatedtime) {
		this.updatedtime = updatedtime;
	}
	

}