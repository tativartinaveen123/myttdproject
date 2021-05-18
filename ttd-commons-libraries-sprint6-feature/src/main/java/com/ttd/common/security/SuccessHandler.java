package com.ttd.common.security;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.util.WebUtils;

import com.ttd.common.dao.CommonDAO;
import com.ttd.common.entity.LoginAudit;
import com.ttd.common.entity.User;
import com.ttd.common.model.GlobalProperties;
import com.ttd.common.model.LoginStatus;
import com.ttd.common.security.dao.SecurityDao;
import com.ttd.common.security.model.UserInformation;
import com.ttd.common.security.model.UserPriviliges;
import com.ttd.common.security.model.UserRole;
import com.ttd.common.util.CommonUtility;
import com.ttd.edarshan.dip.entity.SedDipSchedule;
import com.ttd.eseva.dip.entity.SevaDipSchedule;

public class SuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

	@Autowired
	CommonDAO commonDAO;

	public ResourceBundle getResource() {
		String techpgName = null;
		String targetEnvironment = System.getProperty("active.env");
		if (targetEnvironment == null) {
			techpgName = "techpg";
		} else {
			techpgName = "techpg_" + targetEnvironment;
		}
		ResourceBundle resource = ResourceBundle.getBundle(techpgName);
		return resource;
	}
	
	@Autowired
	private SessionFactory sessionFactoryBean;
	@Autowired
	private RedisOperations<String, Object> redisOps;
	private SecurityDao securityDao;
	private static final String REDIS_KEY_PREFIX = "spring:session:sessions:";
	Logger logger = Logger.getLogger(SuccessHandler.class);

	@Override
	@Transactional
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
			throws IOException, ServletException {
		ResourceBundle resource = getResource();
		// Start 27-03-2017 Session time out for mobile - VenkataSSS
		String headerFlag = request.getHeader("X-UA");

		if ((null != headerFlag && headerFlag.startsWith("mobile-"))
				&& request.getSession().getMaxInactiveInterval() == 1200) {
			// SR034270
			// String sessionTime =
			// (String)sessionFactoryBean.getCurrentSession().createSQLQuery("select
			// PROPERTY_VALUE from GLOBAL_PROP where GROUP_NAME='Mobile_Properties' and
			// PROPERTY_NAME='Session_Time'").uniqueResult();
			String sessionTime = "86400";
			request.getSession().setMaxInactiveInterval(Integer.parseInt(sessionTime));
		}
		// End 27-03-2017 Session time out for mobile - VenkataSSS
		LoginStatus status = new LoginStatus();
		ObjectMapper mapper = new ObjectMapper();

		// SR034270
		// status.setGlobalPropertyValue(commonDAO.getGlobalProp("landing","landingpage"));
		status.setGlobalPropertyValue("dip");
		logger.info("Start of onAuthenticationSuccess () in SuccessHandler");
		String disableLog="N";
		try
		{
		disableLog= resource.getString("disableLog");
		}
		catch(Exception e)
		{
			disableLog="N";
		}
		
		if(null==disableLog)
		{
			
			disableLog="N";
		}
		
		logger.info(disableLog +"logging");

		// setting new CSRF token to response after successful login

		CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
		if (csrf != null) {
			Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");
			String token = csrf.getToken();
			if (cookie == null || token != null && !token.equals(cookie.getValue())) {

				cookie = new Cookie("XSRF-TOKEN", token);
				cookie.setPath("/");

				response.addCookie(cookie);

				/*
				 * response.setHeader("XSRF-TOKEN", token); response.setHeader("x-xsrf-token",
				 * token);
				 */

			}
		}

		logger.info("User Successfully logged in ::::::::::::::::::::::::");

		UserInformation userDetails = (UserInformation) auth.getPrincipal();

		/*
		 * final String
		 * sessionId=RequestContextHolder.currentRequestAttributes().getSessionId();
		 * 
		 * 
		 * SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		 * 
		 * String[] att=
		 * RequestContextHolder.currentRequestAttributes().getAttributeNames(1);
		 * 
		 * for (int i = 0; i < att.length; i++) {
		 * 
		 * System.out.println("================="+sessionId+"===============");
		 * System.out.println(att[i]);
		 * 
		 * System.out.println("================================"); }
		 */

		status.setLoginSuccess(true);
		status.setUserId(userDetails.getUserId() + "");
		
		if(disableLog.equalsIgnoreCase("N")) {
			
					
		

		SevaDipSchedule dipSchedule = commonDAO.getSevaDipSchedule();
		if (dipSchedule != null) {
			Date date = new Date();

			if (dipSchedule.getRegStartDate().compareTo(date) == 1) {
				status.setDipStatus("Inactive");
			} else if (dipSchedule.getRegStartDate().compareTo(date) == -1
					&& dipSchedule.getRegEndDate().compareTo(date) == 1) {
				status.setDipStatus("Registration");
			} else if (dipSchedule.getStartPayDate().compareTo(date) == -1
					&& dipSchedule.getEndPayDate().compareTo(date) == 1) {
				status.setDipStatus("Payment");
			} else if (dipSchedule.getRegEndDate().compareTo(date) == -1
					&& dipSchedule.getStartPayDate().compareTo(date) == 1) {
				status.setDipStatus("DIP In Process");
			} else {
				status.setDipStatus("Inactive");
			}
		} else {
			status.setDipStatus("Inactive");
		}
		}
		else
		{
			status.setDipStatus("Inactive");
		}

		/**
		 * SR034270
		 */
		status.setDarshanDipStatus("Inactive");
		/*
		 * SedDipSchedule darshanDipSchedule = commonDAO.getDarshanDipSchedule(); if
		 * (darshanDipSchedule != null) { Date date = new Date();
		 * 
		 * if (darshanDipSchedule.getRegStartDate().compareTo(date) == 1) {
		 * status.setDarshanDipStatus("Inactive"); } else if
		 * (darshanDipSchedule.getRegStartDate().compareTo(date) == -1 &&
		 * darshanDipSchedule.getRegEndDate().compareTo(date) == 1) {
		 * status.setDarshanDipStatus("Registration"); } else if
		 * (darshanDipSchedule.getStartPayDate().compareTo(date) == -1 &&
		 * darshanDipSchedule.getEndPayDate().compareTo(date) == 1) {
		 * status.setDarshanDipStatus("Payment"); } else if
		 * (darshanDipSchedule.getRegEndDate().compareTo(date) == -1 &&
		 * darshanDipSchedule.getStartPayDate().compareTo(date) == 1) {
		 * status.setDarshanDipStatus("DIP In Process"); } else {
		 * status.setDarshanDipStatus("Inactive"); } } else {
		 * status.setDarshanDipStatus("Inactive"); }
		 */

//		status.setWatchListFlag(userDetails.getWatchListFlag());

		logger.info("userName ===== " + userDetails.getUsername());
		User user = securityDao.loadUser(userDetails.getUsername());
		Date lastLogInDate = user.getLastLoginTime();

		// long userLongIn=user.getIsUserLoggedIn();

		/********************* Start of code for concurrent login ***************/
		BigDecimal pilgrimRole=new BigDecimal("100001");
		
		
		  try {
			  if((pilgrimRole.compareTo(user.getRoleId())==0) && disableLog.equalsIgnoreCase("N"))
			  {
			
		  
		  String sessionId=user.getSessionId();
		  
		  if(null!=sessionId) {
			  
		  logger.info("userName session deletion ===== " + userDetails.getUsername());
		  String key =REDIS_KEY_PREFIX+sessionId; logger.error("key to be deleted :"+
		  key); 
		  
		  redisOps.delete(key.trim());
		 
		   }
		  //********************* End of code for concurrent login
			  }
		  } catch(Exception e) { logger. error("Exception in concurrent login ===== " +
		  userDetails.getUsername()); }
		 
		 
		// user.setIsUserLoggedIn(1);

	//	logger.error("disableLog time "+ disableLog+ "watches"+ user.getWatchListFlag());
		if((!user.getWatchListFlag().equalsIgnoreCase("Y")))
		{
			
			user.setWatchListFlag("Y");
			//user.setLastLoginTime(new Date());
			
		securityDao.updateUser(user);
		
		
		}
		/*
		 * if (!user.getWatchListFlag().equalsIgnoreCase("Y")) {
		 * user.setWatchListFlag("Y"); user.setSessionId(request.getSession().getId());
		 * user.setLastLoginTime(new Date()); securityDao.updateUser(user); }
		 */
		//status.setWatchListFlag(user.getWatchListFlag());
		status.setWatchListFlag("Y"); //bypassing update on user table 18-dec-2020
		logger.info("last log in time" + lastLogInDate);
		// status.setIsUserLoggedIn(Long.toString(userLongIn));
		if (lastLogInDate != null)
			status.setLastLogin(CommonUtility.dateformatSQL(lastLogInDate));
		else
			status.setLastLogin(" ");
		LoginAudit loginAudit = new LoginAudit();
		//loginAudit.setUser(user);
		loginAudit.setUserId(user.getUserId());
		loginAudit.setLoginStatus("Success");
		loginAudit.setLoginTime(new Date());
		loginAudit.setIsUserLoggedIn("Y");
		loginAudit.setSessionId(request.getSession().getId());
		loginAudit.setRequestChannel(request.getHeader("x-ua"));
		// set session id - 10-02-2017 VenkataSSS
		loginAudit.setSessionId(request.getSession().getId());
		
			
		//securityDao.setLoginAudit(loginAudit);
		
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();

		List<String> roles = new ArrayList<String>();

		for (GrantedAuthority authority : authorities) {

			UserRole uRole = (UserRole) authority;
			for (UserPriviliges priviliges : uRole.getPermList()) {
				logger.info("User Role  Priviliges :::::::::::::::::::: " + priviliges.getName());
			}

			roles.add(authority.getAuthority());
			logger.info("User Role :::: " + authority.getAuthority());
		}

		logger.info("User Role :: " + roles.get(0));

		status.setUserRole(roles.get(0));

		String jsonInString = mapper.writeValueAsString(status);

		response.getWriter().print(jsonInString);
		response.getWriter().flush();

		logger.info("Ens of onAuthenticationSuccess () in SuccessHandler :: " + status.getUserRole());
	}

	public SecurityDao getSecurityDao() {
		return securityDao;
	}

	public void setSecurityDao(SecurityDao securityDao) {
		this.securityDao = securityDao;
	}

}
