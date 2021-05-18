package com.ttd.common.model;

import java.util.Comparator;

import com.ttd.common.entity.Country;

public class CountriesSort implements Comparator<Country> {
	public int compare(Country country1, Country country2) {
		return country1.getCountry_name().compareTo(country2.getCountry_name());
	}
}
