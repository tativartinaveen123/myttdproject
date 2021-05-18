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
@Table(name = "KM_DISTRICT_MASTER")
public class District {

	
	@Id
	@Column(name = "KM_DISTRICT_ID")
	private int id;

	@Column(name = "KM_DISTRICT_NAME")
	private String district_name;
	
	@Column(name = "STATE_ID")
	private int stateId;
	
	@Column(name = "COUNTRY_ID")
	private int countryId;
	

	
	@OneToMany(mappedBy = "district", fetch = FetchType.EAGER)
	private List<Locations> locations;

	
	public District() {

	}

	public String getDistrict_name() {
		return district_name;
	}

	public void setDistrict_name(String district_name) {
		this.district_name = district_name;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	
	public List<Locations> getLocations() {
		return locations;
	}

	public void setLocations(List<Locations> locations) {
		this.locations = locations;
	}

	public District(int id, String district_name, List<Locations> locations) {
		super();
		this.id = id;
		this.district_name = district_name;
		this.locations = locations;
	}


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	@Override
	public String toString() {
		return "id=" + id + ", ditrict=" + district_name;
	}

	

	

	
	
}
