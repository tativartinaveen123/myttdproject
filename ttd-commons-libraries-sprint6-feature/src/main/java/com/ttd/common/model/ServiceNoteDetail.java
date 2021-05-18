package com.ttd.common.model;

public class ServiceNoteDetail {

	private long serviceType;
	
	private long serviceSubtype;
	
	private long noteType;
	
	private long ruleId;
	
	private String description;

	public long getServiceType() {
		return serviceType;
	}

	public void setServiceType(long serviceType) {
		this.serviceType = serviceType;
	}

	public long getServiceSubtype() {
		return serviceSubtype;
	}

	public void setServiceSubtype(long serviceSubtype) {
		this.serviceSubtype = serviceSubtype;
	}

	public long getNoteType() {
		return noteType;
	}

	public void setNoteType(long noteType) {
		this.noteType = noteType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getRuleId() {
		return ruleId;
	}

	public void setRuleId(long ruleId) {
		this.ruleId = ruleId;
	}
	
	
}
