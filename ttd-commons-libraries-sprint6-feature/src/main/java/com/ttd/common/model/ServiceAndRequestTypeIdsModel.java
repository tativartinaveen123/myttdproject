package com.ttd.common.model;


import java.util.HashMap;

public class ServiceAndRequestTypeIdsModel{
	
	private HashMap<Long, String> serviceTypeIds;
	private HashMap<Long, HashMap<Long, String>> requestTypeIds;
	private HashMap<Long, HashMap<String, String>> serviceNotes;
	
	public HashMap<Long, HashMap<String, String>> getServiceNotes() {
		return serviceNotes;
	}
	public void setServiceNotes(HashMap<Long, HashMap<String, String>> serviceNotes) {
		this.serviceNotes = serviceNotes;
	}
	public HashMap<Long, String> getServiceTypeIds() {
		return serviceTypeIds;
	}
	public void setServiceTypeIds(HashMap<Long, String> serviceTypeIds) {
		this.serviceTypeIds = serviceTypeIds;
	}
	public HashMap<Long, HashMap<Long, String>> getRequestTypeIds() {
		return requestTypeIds;
	}
	public void setRequestTypeIds(HashMap<Long, HashMap<Long, String>> requestTypeIds) {
		this.requestTypeIds = requestTypeIds;
	}
	
}
