package com.ttd.common.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.ttd.common.model.SessionDetails;
import com.ttd.common.security.model.UserInformation;
import com.ttd.common.security.model.UserPriviliges;
import com.ttd.common.security.model.UserRole;

@RestController
public class MainController {

	Logger logger = Logger.getLogger(MainController.class);

	private String pilgrimTimeOut;
	private String adminTimeOut;
	private String mobilePilgrimTimeOut;

	@RequestMapping(value = "/sessionOut.json", method = RequestMethod.GET, produces = { "application/json" })
	public @ResponseBody
	String sessionOut() {

		logger.info("Session Out Controller");
		return "{\"sessionTimeout\":\"true\"}";

	}

	@RequestMapping(value = {"/user/getUserContext","mob/v1/user/context"}, method = RequestMethod.POST, produces = { "application/json" })
	public UserInformation getUserContext(HttpSession session, HttpServletRequest req) {

		logger.info("Start of getUserContext in MainController");
		UserInformation userDetails = (UserInformation) SecurityContextHolder
				.getContext().getAuthentication().getPrincipal();
		
		Collection<? extends GrantedAuthority> authorities = userDetails
				.getAuthorities();		
		
		String userRole = null;
		Date date = new Date();
		
		for (GrantedAuthority authority : authorities) {			
			userRole = authority.getAuthority();
			logger.info("User Role :::: " + userRole);			
		}
		
		if (userRole.equalsIgnoreCase("ROLE_ADMIN")
				|| userRole.equalsIgnoreCase("ROLE_SUPERADMIN")
				|| userRole.equalsIgnoreCase("ROLE_CALL_CENTER_SUPPORT")
				|| userRole.equalsIgnoreCase("ROLE_ITRPTS") 
				|| userRole.equalsIgnoreCase("ROLE_KMRPTS")
				|| userRole.equalsIgnoreCase("ROLE_SED_MASTER")
				|| userRole.equalsIgnoreCase("ROLE_DONOR_CEL_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_CHIEF_ACCOUNTANT_OFFICER")
				|| userRole.equalsIgnoreCase("ROLE_DMS_SUPERINTENDENT")
				|| userRole.equalsIgnoreCase("ROLE_CHECKER")
				|| userRole.equalsIgnoreCase("ROLE_TRUST_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_MTVAC_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_HUNDI_TRANSACTION_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_DONATION_TRANSACTION_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_SGMS_TRANSACTION_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_DMS_REPORTS")
				|| userRole.equalsIgnoreCase("ROLE_TRANSACTION_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_SGMS_TRANSACTION_ADMIN")
				|| userRole.equalsIgnoreCase("ROLE_DEPUTY_DONOR_CEL_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_INTERNAL_STATISTICS")
				|| userRole.equalsIgnoreCase("ROLE_PROFILE_UPDATION")
				|| userRole.equalsIgnoreCase("ROLE_QUOTA_UPDATE")
				|| userRole.equalsIgnoreCase("ROLE_ECOUNT_SERVICE_CANCEL")
				|| userRole.equalsIgnoreCase("ROLE_SERVICE_CANCEL_WORKFLOW")
				|| userRole.equalsIgnoreCase("ROLE_USSES_VVD")
				|| userRole.equalsIgnoreCase("ROLE_OPERATOR_USSES_VVD")
				|| userRole.equalsIgnoreCase("ROLE_USSES")
				|| userRole.equalsIgnoreCase("ROLE_VVD")
				|| userRole.equalsIgnoreCase("ROLE_JEO")
				|| userRole.equalsIgnoreCase("ROLE_OPERATOR_USSES_VVD")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_DELHI_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_MUMBAI_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_TIRUPATI_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_CHENNAI_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_VISHAKAPATNAM_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_VIJAYAWADA_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_BANGALORE_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_HYDERABAD_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_KM_MANAGER")
				|| userRole.equalsIgnoreCase("ROLE_DOLLAR_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_DOLLAR_ADMIN")) {
			userDetails.setTimeOutPeriod(getAdminTimeOut());
		} else if (userRole.equalsIgnoreCase("ROLE_PILGRIM")
				|| userRole.equalsIgnoreCase("ROLE_MINISTERS_AP")
				|| userRole.equalsIgnoreCase("ROLE_MP_MLA_MLC_AP")
				|| userRole.equalsIgnoreCase("ROLE_IAS_AP")
				|| userRole.equalsIgnoreCase("ROLE_MINISTERS_TS")
				|| userRole.equalsIgnoreCase("ROLE_MP_MLA_MLC_TS")
				|| userRole.equalsIgnoreCase("ROLE_IAS_TS")) {
			
			if(req.getRequestURI().contains("/mob")){
				userDetails.setTimeOutPeriod(getMobilePilgrimTimeOut());
			}else{
				userDetails.setTimeOutPeriod(getPilgrimTimeOut());
			}
		}		
		
		Timestamp timeStamp = new Timestamp(date.getTime());

		userDetails.setSessionStartTime(timeStamp.toString());
       userDetails.setPassword("");
		logger.info("session time out +++++++++++++"
				+ new Integer(userDetails.getTimeOutPeriod()));

		session.setMaxInactiveInterval(new Integer(userDetails
				.getTimeOutPeriod()));

		logger.info("End of getSessionTimeOut in MainController :: "
				+ session.getMaxInactiveInterval());
		
		logger.info("End of getUserContext in MainController");
		return userDetails;

	}

	@RequestMapping(value = "/user/{userRole}", method = RequestMethod.POST, produces = { "application/json" })
	public SessionDetails getSessionTimeOut(@PathVariable String userRole,
			HttpSession session, HttpServletRequest req) {

		SessionDetails sessionDetails = new SessionDetails();

		Date date = new Date();
		Timestamp timeStamp = new Timestamp(date.getTime());

		sessionDetails.setSessionStartTime(timeStamp.toString());

		logger.info("Start of getSessionTimeOut in MainController");

		if (userRole.equalsIgnoreCase("ROLE_ADMIN")
				|| userRole.equalsIgnoreCase("ROLE_SUPERADMIN")
				|| userRole.equalsIgnoreCase("ROLE_CALL_CENTER_SUPPORT")
				|| userRole.equalsIgnoreCase("ROLE_ITRPTS") 
				|| userRole.equalsIgnoreCase("ROLE_KMRPTS")
				|| userRole.equalsIgnoreCase("ROLE_SED_MASTER")
				|| userRole.equalsIgnoreCase("ROLE_DONOR_CEL_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_CHIEF_ACCOUNTANT_OFFICER")
				|| userRole.equalsIgnoreCase("ROLE_DMS_SUPERINTENDENT")
				|| userRole.equalsIgnoreCase("ROLE_CHECKER")
				|| userRole.equalsIgnoreCase("ROLE_TRUST_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_MTVAC_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_HUNDI_TRANSACTION_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_DONATION_TRANSACTION_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_SGMS_TRANSACTION_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_DMS_REPORTS")
				|| userRole.equalsIgnoreCase("ROLE_TRANSACTION_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_SGMS_TRANSACTION_ADMIN")
				|| userRole.equalsIgnoreCase("ROLE_DEPUTY_DONOR_CEL_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_INTERNAL_STATISTICS")
				|| userRole.equalsIgnoreCase("ROLE_PROFILE_UPDATION")
				|| userRole.equalsIgnoreCase("ROLE_QUOTA_UPDATE")
				|| userRole.equalsIgnoreCase("ROLE_ECOUNT_SERVICE_CANCEL")
				|| userRole.equalsIgnoreCase("ROLE_SERVICE_CANCEL_WORKFLOW")
				|| userRole.equalsIgnoreCase("ROLE_USSES_VVD")
				|| userRole.equalsIgnoreCase("ROLE_OPERATOR_USSES_VVD")
				|| userRole.equalsIgnoreCase("ROLE_USSES")
				|| userRole.equalsIgnoreCase("ROLE_VVD")
				|| userRole.equalsIgnoreCase("ROLE_JEO")
				|| userRole.equalsIgnoreCase("ROLE_OPERATOR_USSES_VVD")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_DELHI_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_MUMBAI_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_TIRUPATI_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_CHENNAI_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_VISHAKAPATNAM_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_VIJAYAWADA_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_BANGALORE_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_PUBLICATIONS_HYDERABAD_RPTS")
				|| userRole.equalsIgnoreCase("ROLE_KM_MANAGER")
				|| userRole.equalsIgnoreCase("ROLE_DOLLAR_OPERATOR")
				|| userRole.equalsIgnoreCase("ROLE_DOLLAR_ADMIN")) {
			sessionDetails.setTimeOutPeriod(getAdminTimeOut());
		} else if (userRole.equalsIgnoreCase("ROLE_PILGRIM")
				| userRole.equalsIgnoreCase("ROLE_MINISTERS_AP")
				|| userRole.equalsIgnoreCase("ROLE_MP_MLA_MLC_AP")
				|| userRole.equalsIgnoreCase("ROLE_IAS_AP")
				|| userRole.equalsIgnoreCase("ROLE_MINISTERS_TS")
				|| userRole.equalsIgnoreCase("ROLE_MP_MLA_MLC_TS")
				|| userRole.equalsIgnoreCase("ROLE_IAS_TS")) {
			if(req.getRequestURI().contains("/mob")){
				sessionDetails.setTimeOutPeriod(getMobilePilgrimTimeOut());
			}else{
				sessionDetails.setTimeOutPeriod(getPilgrimTimeOut());
			}
		}

		logger.info("session time out +++++++++++++"
				+ new Integer(sessionDetails.getTimeOutPeriod()));

		session.setMaxInactiveInterval(new Integer(sessionDetails
				.getTimeOutPeriod()));

		logger.info("End of getSessionTimeOut in MainController :: "
				+ session.getMaxInactiveInterval());

		return sessionDetails;

	}

	@RequestMapping(value = "/sessionTimeOut", method = RequestMethod.GET)
	public ModelAndView sessionTimeOut() {

		logger.info("Start of sessionOut in  MainController");

		ModelAndView model = new ModelAndView();

		logger.info("Session has experied *******************************************************************");

		model.setViewName("login");
		// model.setView(new RedirectView("/index.html#/login", true));
		return model;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login() {

		logger.info("First service  *******************************************************************");
		ModelAndView model = new ModelAndView();

		model.setView(new RedirectView("/index.html#/login", true));
		return model;

	}
	@RequestMapping(value = "/serverError", method = RequestMethod.GET)
	public ModelAndView serverError(HttpServletRequest request) {

		logger.info("error service serverError *******************************************************************");
		
		
		ModelAndView model = new ModelAndView();
		//String url = request.getHeader("Referer");
        //logger.info("Refer Header redirect to fnal *******************************************************************"+url);
		model.setView(new RedirectView("/index.html#/login",true));
        //model.setViewName("home");
        //model.setView(new RedirectView("final",true));
		//return "home";
        //return new ModelAndView("redirect:/final");
		//return new ModelAndView("forward:/final");
		return model;
	}
	@RequestMapping(value = "/final", method = RequestMethod.GET)
	public String serverErrorPost() {

		logger.info("error service serverErrorPOST print home *******************************************************************");
		//RedirectView view = new RedirectView("home");
		ModelAndView model = new ModelAndView();

		model.setView(new RedirectView("/index.html#/login", true));
		return "home";
	}


	public String getPilgrimTimeOut() {
		return pilgrimTimeOut;
	}

	public void setPilgrimTimeOut(String pilgrimTimeOut) {
		this.pilgrimTimeOut = pilgrimTimeOut;
	}

	public String getAdminTimeOut() {
		return adminTimeOut;
	}

	public void setAdminTimeOut(String adminTimeOut) {
		this.adminTimeOut = adminTimeOut;
	}

	public String getMobilePilgrimTimeOut() {
		return mobilePilgrimTimeOut;
	}

	public void setMobilePilgrimTimeOut(String mobilePilgrimTimeOut) {
		this.mobilePilgrimTimeOut = mobilePilgrimTimeOut;
	}

}