package com.ttd.common.security.model;

import org.springframework.security.core.GrantedAuthority;

public class UserPriviliges implements GrantedAuthority {

	private static final long serialVersionUID = 1L;
	
	private String Id;
	private String name;
	
	public String getAuthority() {		
		return name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
