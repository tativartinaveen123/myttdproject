package com.ttd.common.entity;


import java.math.BigDecimal;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.ttd.common.model.StateSort;


@Entity
@Table(name = "TTD_COUNTRIES_LIST")
public class Country{

	
	

	public Country() {

	}

	public Country(int id, String country_name, List<State> states) {
		super();
		this.id = id;
		this.country_name = country_name;
		this.states = states;
	}

	@Id
	@Column(name = "COUNTRY_ID")
	private int id;

	@Column(name = "COUNTRY_NAME")
	private String country_name;
	
	@Column(name = "COUNTRY_ISD_CODE")
	private BigDecimal countryIsdCode;
	
	@Column(name = "COUNTRY_SHORT_CODE")
	private String country2DigitCode;
	
	@Column(name = "COUNTRY_SHORT_CODE_3")
	private String country3DigitCode;
	
	@Column(name="CREATED_BY")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_TIME", insertable=false, updatable=false)
	private Date createdTime;
	
	@Column(name="ROW_STATUS", insertable=false, updatable=false)
	private BigDecimal rowStatus;

	@Column(name="UPDATED_BY")
	private BigDecimal updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATED_TIME")
	private Date updatedTime;
	
	@OneToMany(mappedBy = "country", fetch = FetchType.EAGER)
	private List<State> states;

	public List<State> getStates() {
		return this.states;
	}

	public void setStates(List<State> states) {
		Collections.sort(states, new StateSort());
		this.states = states;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry_name() {
		return country_name;
	}

	@Override
	public String toString() {
		return "id=" + id + ", country=" + country_name;
	}

	public BigDecimal getCountryIsdCode() {
		return countryIsdCode;
	}

	public void setCountryIsdCode(BigDecimal countryIsdCode) {
		this.countryIsdCode = countryIsdCode;
	}

	public String getCountry2DigitCode() {
		return country2DigitCode;
	}

	public void setCountry2DigitCode(String country2DigitCode) {
		this.country2DigitCode = country2DigitCode;
	}

	public String getCountry3DigitCode() {
		return country3DigitCode;
	}

	public void setCountry3DigitCode(String country3DigitCode) {
		this.country3DigitCode = country3DigitCode;
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
	
	
}
