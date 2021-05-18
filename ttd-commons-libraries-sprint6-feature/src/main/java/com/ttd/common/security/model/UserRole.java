package com.ttd.common.security.model;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class UserRole implements GrantedAuthority {
	
	private static final long serialVersionUID = 1L;
	
	private String roleId;
	private String roleName;
	private List<UserPriviliges> permList;

	public String getAuthority() {
		return roleName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<UserPriviliges> getPermList() {
		return permList;
	}

	public void setPermList(List<UserPriviliges> permList) {
		this.permList = permList;
	}

}