package com.ttd.common.security.dao;

import java.util.List;

import com.ttd.common.entity.LoginAudit;
import com.ttd.common.entity.User;
import com.ttd.common.security.model.UserInformation;

public interface SecurityDao {
	
	public void setLoginAudit(LoginAudit loginAudit);

	public UserInformation getUserDetails(String userName);

	public User loadUser(String userName);
	//set session id - 10-02-2017 VenkataSSS
	public void getUserByLoginTime(long userId,String sessionID);
	
	public void updateUser(User user);
	
	public List<User> getUserByMobile(String mobileNumber);

}
