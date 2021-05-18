package com.ttd.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TTD_currency_master")
public class Currency {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "currency_seq")
	@SequenceGenerator(name = "currency_seq", sequenceName = "currency_seq", allocationSize = 1, initialValue = 1)
	@Column(name = "currency_id")
	int currency_id;

	@Column(name = "country_name")
	String country_name;

	@Column(name = "currency_name")
	String currency_name;

	@Column(name = "row_status")
	int row_status;

	@Column(name = "created_by")
	int created_by;

	@Column(name = "created_time")
	Date created_time;

	@Column(name = "updated_by")
	int updated_by;

	@Column(name = "updated_time")
	Date updated_time;

	public int getCurrency_id() {
		return currency_id;
	}

	public void setCurrency_id(int currency_id) {
		this.currency_id = currency_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public int getRow_status() {
		return row_status;
	}

	public void setRow_status(int row_status) {
		this.row_status = row_status;
	}

	public int getCreated_by() {
		return created_by;
	}

	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public int getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}

	public Date getUpdated_time() {
		return updated_time;
	}

	public void setUpdated_time(Date updated_time) {
		this.updated_time = updated_time;
	}

	public String getCurrency_name() {
		return currency_name;
	}

	public void setCurrency_name(String currency_name) {
		this.currency_name = currency_name;
	}

	public String toString() {
		return currency_id + " " + country_name + " " + created_time;
	}
}
