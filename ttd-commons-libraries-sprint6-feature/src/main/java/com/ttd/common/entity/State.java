package com.ttd.common.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TTD_STATES_LIST")
public class State{

	/**
	 * 
	 */
	

	public State() {

	}

	public State(int id, String state_name) {
		super();
		this.id = id;
		this.state_name = state_name;
	}

	@Id
	@Column(name = "STATE_ID")
	private int id;

	@Column(name = "STATE_NAME")
	private String state_name;

	@ManyToOne
	@JoinColumn(name = "COUNTRY_ID", nullable = true)
	@JsonIgnore
	private Country country;

	public int getId() {
		return id;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String country) {
		this.state_name = country;
	}

	@Override
	public String toString() {
		return "id=" + id + ", STATE=" + state_name;
	}
}
