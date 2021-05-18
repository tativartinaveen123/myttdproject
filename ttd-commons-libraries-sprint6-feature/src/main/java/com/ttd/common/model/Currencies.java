package com.ttd.common.model;


import java.util.List;

import com.ttd.common.entity.CurrencyMaster;

public class Currencies{
	
	
	private List<CurrencyMaster> currencyList = null;

	public List<CurrencyMaster> getCurrencyList() {
		return currencyList;
	}

	public void setCurrencyList(List<CurrencyMaster> currencyList) {
		this.currencyList = currencyList;
	}
}
