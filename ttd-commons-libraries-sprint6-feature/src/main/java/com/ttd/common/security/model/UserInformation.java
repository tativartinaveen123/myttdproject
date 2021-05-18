package com.ttd.common.security.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class UserInformation implements UserDetails {

	private static final long serialVersionUID = 2799687919326226178L;

	public String userName;

	private String password;

	private long userId;

	private boolean isUserAvtive;

	private boolean isSmsVerified;

	private boolean isEmailVerified;

	private Date lastLoginDate;

	private boolean isAccountNonExpired;

	private boolean isAccountNonLocked;

	private boolean isCredentialsNonExpired;

	private boolean isEnabled;
	
	private String watchListFlag;

	private List<GrantedAuthority> authorities;
	
	private List<String> permissionList;
	
	private String sessionStartTime;
	
	private String timeOutPeriod;
	private String isDonor;

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public boolean isUserAvtive() {
		return isUserAvtive;
	}

	public void setUserAvtive(boolean isUserAvtive) {
		this.isUserAvtive = isUserAvtive;
	}

	public boolean getIsSmsVerified() {
		return isSmsVerified;
	}

	public void setSmsVerified(boolean isSmsVerified) {
		this.isSmsVerified = isSmsVerified;
	}

	public boolean getIsEmailVerified() {
		return isEmailVerified;
	}

	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	
	public boolean isAccountNonExpired() {
		return isAccountNonExpired;
	}

	public void setAccountNonExpired(boolean isAccountNonExpired) {
		this.isAccountNonExpired = isAccountNonExpired;
	}

	
	public boolean isAccountNonLocked() {
		return isAccountNonLocked;
	}

	public void setAccountNonLocked(boolean isAccountNonLocked) {
		this.isAccountNonLocked = isAccountNonLocked;
	}

	
	public boolean isCredentialsNonExpired() {
		return isCredentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
		this.isCredentialsNonExpired = isCredentialsNonExpired;
	}

	
	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}

	
	public String getUsername() {
		return userName;
	}

	
	public boolean equals(Object o) {
		if (o instanceof UserInformation) {
			return userName.equals(((UserInformation) o).userName);
		}
		return false;
	}

	
	
	public int hashCode() {
		return userName.hashCode();
	}

	public List<String> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<String> permissionList) {
		this.permissionList = permissionList;
	}

	public String getWatchListFlag() {
		return watchListFlag;
	}

	public void setWatchListFlag(String watchListFlag) {
		this.watchListFlag = watchListFlag;
	}

	public String getSessionStartTime() {
		return sessionStartTime;
	}

	public void setSessionStartTime(String sessionStartTime) {
		this.sessionStartTime = sessionStartTime;
	}

	public String getTimeOutPeriod() {
		return timeOutPeriod;
	}

	public void setTimeOutPeriod(String timeOutPeriod) {
		this.timeOutPeriod = timeOutPeriod;
	}

	public String getIsDonor() {
		return isDonor;
	}

	public void setIsDonor(String isDonor) {
		this.isDonor = isDonor;
	}
}
