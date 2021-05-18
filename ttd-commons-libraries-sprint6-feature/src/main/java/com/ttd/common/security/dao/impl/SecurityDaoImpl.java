package com.ttd.common.security.dao.impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.ttd.common.entity.LoginAudit;
import com.ttd.common.entity.RolesPrivilige;
import com.ttd.common.entity.User;
import com.ttd.common.security.dao.SecurityDao;
import com.ttd.common.security.model.UserInformation;
import com.ttd.common.security.model.UserPriviliges;
import com.ttd.common.security.model.UserRole;

@Repository
public class SecurityDaoImpl implements SecurityDao {

	Logger logger = Logger.getLogger(SecurityDaoImpl.class);

	
	private SessionFactory sessionFactory;

	public UserInformation getUserDetails(String userName) {

		logger.info("Start of getUserDetails ( " + userName
				+ " ) in SecurityDaoImpl");

		User user = loadUser(userName.toLowerCase());

		UserInformation userInfo = new UserInformation();

		userInfo.setUserId(user.getUserId());
		userInfo.setUsername(user.getUserName().toLowerCase());
		userInfo.setLastLoginDate(user.getLastLoginTime());
		userInfo.setUserAvtive(new Boolean(user.getUserStatus()));
		userInfo.setSmsVerified(new Boolean(user.getSmsVerification()));
		userInfo.setEmailVerified(new Boolean(user.getEmailVerification()));
		userInfo.setWatchListFlag(user.getWatchListFlag());
		userInfo.setIsDonor(user.getIsDonor());
		
		userInfo.setPassword(user.getUserPassword());
		logger.info("User Password1 :: :: " + user.getUserPassword());
		logger.info("User Password2 :: :: " + getMD5Password());
		userInfo.setAccountNonExpired(true);
		userInfo.setCredentialsNonExpired(true);
		userInfo.setAccountNonLocked(true);
		userInfo.setEnabled(new Boolean(new Boolean(user.getUserStatus())));

		UserRole role = new UserRole();
		List<UserPriviliges> permissionsList = new ArrayList<UserPriviliges>();
		List<String> priviligesList = new ArrayList<String>();

		role.setRoleId(user.getRolesMaster().getRoleId() + "");
		role.setRoleName(user.getRolesMaster().getRoleName());
		List<RolesPrivilige> rolePrivList = user.getRolesMaster()
				.getRolesPriviliges();

		for (RolesPrivilige rolePriv : rolePrivList) {
			UserPriviliges priviliges = new UserPriviliges();
			priviliges.setId(rolePriv.getPriviligesMaster().getPriviligeId()
					+ "");
			priviliges.setName(rolePriv.getPriviligesMaster()
					.getPriviligeName());
			priviligesList.add(rolePriv.getPriviligesMaster()
					.getPriviligeName());
			permissionsList.add(priviliges);
		}

		role.setPermList(permissionsList);

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(role);

		userInfo.setPermissionList(priviligesList);
		userInfo.setAuthorities(authorities);

		logger.info("End of getUserDetails ( ) in SecurityDaoImpl "
				+ userInfo.getUserId());

		return userInfo;
	}

	public User loadUser(String userName) {

		logger.info("User Name :: " + userName);

		User user = null;
		try {
			Query query = getSessionFactory().getCurrentSession().createQuery(
					"from User u where u.userName = :NAME");
			query.setString("NAME", userName);

			user = (User) query.uniqueResult();
			} catch (Exception exe) {
			exe.printStackTrace();
		}

		logger.info("USER :: " + user);
		//logger.info("User Id :: " + user.getUserId());

		return user;

	}

	public String getMD5Password() {
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		messageDigest.update("123456".getBytes(), 0, "123456".length());
		String hashedPass = new BigInteger(1, messageDigest.digest())
				.toString(16);
		if (hashedPass.length() < 32) {
			hashedPass = "0" + hashedPass;
		}

		System.out.println("Hashed password :::::: " + hashedPass);
		return hashedPass;
	}

	public String getHashPassword(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);

		System.out.println(hashedPassword);
		return hashedPassword;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void setLoginAudit(LoginAudit loginAudit){
		
		sessionFactory.getCurrentSession().saveOrUpdate(loginAudit);
	}
	
	public void getUserByLoginTime(long userId, String sessionID){
		
		logger.error("getUserByLogoutTime==============" +userId+"sessionID"+sessionID);
		
		/*logger.info("getUserByLoginTime==============" +userId);
	     
		//set session id - 10-02-2017 VenkataSSS
		//String sql = "update Login_Audit set LOGOUT_TIME = :LOGOUTTIME, is_user_logged_in = 'N'  where USER_ID = :USERID and LOGIN_TIME = (select Max(LOGIN_TIME) from Login_Audit where user_id = :USERID)";
		String sql = "update Login_Audit set LOGOUT_TIME = sysdate, is_user_logged_in = 'N'  where USER_ID = :USERID AND SESSION_ID=:SESSIONID" ;
		
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery(sql);
		
		query.setLong("USERID", userId);
//      commented new Date and used SYSDATE for getting timestamp -- adithya		
//		query.setDate("LOGOUTTIME",new Date());
		query.setString("SESSIONID", sessionID);
		query.executeUpdate();*/
		
	}
	
	public void updateUser(User user) {
		logger.info("Start of updateUser() in commonDAOImpl");
		sessionFactory.getCurrentSession().update(user);
		sessionFactory.getCurrentSession().flush();
		logger.info("End of updateUser() in commonDAOImpl");
	}

	public List<User> getUserByMobile(String mobileNumber) {
		logger.info("Start of getUserByMobile in UserRegistrationDAOImpl");
		Query query = sessionFactory.getCurrentSession().createQuery(
				" from User u where u.mobileNumber= :MOBILE ");
		query.setString("MOBILE", mobileNumber);
		User user = null;
		List<User> userList = (List<User>) query.list();
		
		/*if (userList.size() > 1) {

			for (User userObj : userList) {
				if (userObj.getWatchListFlag().equalsIgnoreCase("Y")) {
					user = userObj;
				}
			}
		} else if (userList != null && userList.size() > 0) {
			user = (User) userList.get(0);
		}*/
		return userList;
	}

}
