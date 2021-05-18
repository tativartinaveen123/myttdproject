
package com.ttd.common.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.transaction.annotation.Transactional;

import com.ttd.common.entity.LoginAudit;
import com.ttd.common.entity.User;
import com.ttd.common.model.LoginStatus;
import com.ttd.common.security.dao.SecurityDao;

public class FailureHandler extends SimpleUrlAuthenticationFailureHandler {

	Logger logger = Logger.getLogger(FailureHandler.class);

	private SecurityDao securityDao;
	private String maxFailureAttempts;

	@Override
	@Transactional
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException authException)
			throws IOException, ServletException {
			boolean watchListFlag = false;
			LoginStatus status = new LoginStatus();
			ObjectMapper mapper = new ObjectMapper();
			logger.info("Start of onAuthenticationFailure in FailureHandler");
			User user = securityDao.loadUser(request.getParameter("username").toLowerCase());
			if( user!=null){
			watchListFlag = user.getWatchListFlag().matches("[0-9]+");
			}
			List<String> myList = new ArrayList<String>();
			
			for(int i=0;i<Integer.parseInt(getMaxFailureAttempts()) ; i++)
			{
				myList.add(String.valueOf(i));
				
			}
			
			if (user != null) {
				LoginAudit loginAudit = new LoginAudit();
				//loginAudit.setUser(user);
				loginAudit.setUserId(user.getUserId());
				loginAudit.setLoginStatus("Failed");
				loginAudit.setSessionId(request.getSession().getId());
				loginAudit.setRequestChannel(request.getHeader("x-ua"));
				loginAudit.setLoginTime(new Date());
				securityDao.setLoginAudit(loginAudit);

				if (authException.getClass().isAssignableFrom(
						DisabledException.class)) {
					logger.info("Failed due to User status");
					if (user.getSmsVerification().equalsIgnoreCase("false")) {

						status.setLoginSuccess(false);
						status.setSmsVerfyFailed(true);
						
						String trimMobile=user.getMobileNumber();
						
						 int lenMobile=trimMobile.length();
						 String firstHalfMobile=trimMobile.substring(0,lenMobile-4);
						 String secondHalfMobile=trimMobile.substring(lenMobile-4,lenMobile);
						 
						 String replacedMobile=firstHalfMobile.replaceAll("[0-9]","X");
						 status.setMobileNumber(replacedMobile+secondHalfMobile);
						//status.setMobileNumber(trimMobile.substring(0,2)+"XXXXXX"+trimMobile.substring(7,12));
						// status.setWatchListFlag(user.getWatchListFlag());

					} else if (user.getEmailVerification()
							.equalsIgnoreCase("false")) {

						status.setLoginSuccess(false);
						status.setEmailVerfyFailed(true);
						// status.setWatchListFlag(user.getWatchListFlag());
					}
					status.setUserId(user.getUserId() + "");
					if(myList.contains(user.getWatchListFlag()) || user.getWatchListFlag().equalsIgnoreCase("Y"))
					{
					status.setWatchListFlag("Y");
					}
					else
					{
						status.setWatchListFlag(user.getWatchListFlag());	
					}
					
				} else if (user.getWatchListFlag().equalsIgnoreCase("Y")) {
					user.setWatchListFlag("1");
					status.setLoginSuccess(false);
					status.setWatchListFlag(user.getWatchListFlag());
					Long uid = user.getUserId();
					status.setUserId(uid.toString());
					status.setMobileNumber("");
					logger.info("User Id"+ status.getUserId());
					securityDao.updateUser(user);
					
				} else if (user.getWatchListFlag() != "N"
						&& user.getWatchListFlag() != "locked" && watchListFlag && Integer.parseInt(user.getWatchListFlag()) < Integer
						.parseInt(getMaxFailureAttempts()) - 1){
					user.setWatchListFlag(String.valueOf(Integer.parseInt(user
							.getWatchListFlag()) + 1));
					securityDao.updateUser(user);
					status.setLoginSuccess(false);
					status.setWatchListFlag(user.getWatchListFlag());
					Long uid = user.getUserId();
					status.setUserId(uid.toString());
					status.setMobileNumber("");
					logger.info("User Id"+ status.getUserId());
				} else if(watchListFlag && Integer.parseInt(user.getWatchListFlag()) == Integer
						.parseInt(getMaxFailureAttempts()) - 1) {
					user.setWatchListFlag("locked");
					user.setSmsVerification("false");
					user.setEmailVerification("false");
					user.setUserStatus("false");
					status.setAccountStatus("locked");
					securityDao.updateUser(user);
					status.setLoginSuccess(false);
					status.setWatchListFlag(user.getWatchListFlag());
					Long uid = user.getUserId();
					status.setUserId(uid.toString());
					status.setMobileNumber("");
					logger.info("User Id"+ status.getUserId());

				} else {
					status.setWatchListFlag(user.getWatchListFlag());
					status.setLoginSuccess(false);
					Long uid = user.getUserId();
					status.setUserId(uid.toString());
					status.setMobileNumber("");
					logger.info("User Id"+ status.getUserId());
				}

				List<User> userList=securityDao.getUserByMobile(user.getMobileNumber());
			
				
			if (userList.size() > 1) {

				status.setMobilCheck("N");

			}
				else{
					status.setMobilCheck("Y");
				}
				
			}
			
			
			
			
			
			if(status.isLoginSuccess()==false && user!=null){
				if(user.getEmailVerification().equalsIgnoreCase("false") && user.getUserStatus().equalsIgnoreCase("false")){
				status.setEmailVerfyFailed(true);					
				}
				if(user.getSmsVerification().equalsIgnoreCase("false") && user.getUserStatus().equalsIgnoreCase("false")){
				status.setSmsVerfyFailed(true);
				}
				if(user.getWatchListFlag().equalsIgnoreCase("N") && user.getEmailVerification().equalsIgnoreCase("true") && user.getSmsVerification().equalsIgnoreCase("true") && user.getUserStatus().equalsIgnoreCase("true")){
				user.setWatchListFlag("1");
				status.setLoginSuccess(false);
				status.setWatchListFlag(user.getWatchListFlag());
				Long uid = user.getUserId();
				status.setUserId(uid.toString());
				status.setMobileNumber("");
				logger.info("User Id"+ status.getUserId());
				securityDao.updateUser(user);
				}
			}
			
			String jsonInString = mapper.writeValueAsString(status);

			response.getWriter().print(jsonInString); // "{\"Error Message \":\"" +
														// authException.getMessage()
														// + "\"}"
			response.getWriter().flush();

			logger.info("End of onAuthenticationFailure in FailureHandler :: "
					+ jsonInString);
	}

	public SecurityDao getSecurityDao() {
		return securityDao;
	}

	public void setSecurityDao(SecurityDao securityDao) {
		this.securityDao = securityDao;
	}

	public String getMaxFailureAttempts() {
		return maxFailureAttempts;
	}
	
	public void setMaxFailureAttempts(String maxFailureAttempts) {
		this.maxFailureAttempts = maxFailureAttempts;
	}
}
