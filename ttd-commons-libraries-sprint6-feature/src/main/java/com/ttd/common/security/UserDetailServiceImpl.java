package com.ttd.common.security;

import org.apache.log4j.Logger;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.ttd.common.security.model.UserInformation;
import com.ttd.common.security.dao.SecurityDao;

public class UserDetailServiceImpl implements UserDetailsService {

	private SecurityDao securityDao;

	Logger logger = Logger.getLogger(UserDetailServiceImpl.class);

	@Transactional
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {

		logger.info("Start of loadUserByUsername ( " + userName
				+ ") in UserDetailServiceImpl");

		UserInformation userInfo = null;
		try {

			userInfo = getSecurityDao().getUserDetails(userName);

			if (userInfo == null)
				throw new UsernameNotFoundException("user name not found");

		} catch (Exception e) {
			throw new UsernameNotFoundException("database error ");
		}
		
		logger.info("End of loadUserByUsername in UserDetailServiceImpl :: "
				+ userInfo.getUserId());
		
		return userInfo;
	}

	public SecurityDao getSecurityDao() {
		return securityDao;
	}

	public void setSecurityDao(SecurityDao securityDao) {
		this.securityDao = securityDao;
	}

}
