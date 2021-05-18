package com.ttd.common.security;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.session.data.redis.RedisOperationsSessionRepository;
import org.springframework.transaction.annotation.Transactional;

import com.ttd.common.entity.User;
import com.ttd.common.security.dao.SecurityDao;
import com.ttd.common.security.model.UserInformation;


@Transactional
public class CustomLogoutHandler extends SimpleUrlLogoutSuccessHandler {
	
	// Start Delete Session key from redis 08-03-2017 VenkataSSS
	@Autowired
	private RedisOperations<String, Object> redisOps;
	
	@Autowired
	private RedisOperationsSessionRepository sessionRepo;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	private static final String REDIS_KEY_PREFIX = "spring:session:sessions:";
	// End Delete Session key from redis 08-03-2017 VenkataSSS
	
	private SecurityDao securityDao;

	Logger logger = Logger.getLogger(CustomLogoutHandler.class);

	public void onLogoutSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {

		logger.info("Start of onLogoutSuccess () in CustomLogoutHandler");
		try {
			//Start 26-04-2017 Session timeout issue findings - Venkatasurya SS
			
			if(authentication!=null){
			UserInformation userDetails = (UserInformation) authentication
					.getPrincipal();
			logger.info("User Details :: :: :: "+ userDetails.getUserId());
			//set session id - 10-02-2017 VenkataSSS
			securityDao.getUserByLoginTime(userDetails.getUserId(),request.getSession().getId());
			//update last login time in Users table VA
			/*User user = securityDao.loadUser(userDetails.getUsername());
			long value=0;
			user.setIsUserLoggedIn(value);
		    securityDao.updateUser(user);*/
			}
			else{
				logger.error("@ com.ttd.common.security.onLogoutSuccess, Authentication object not avilable.");	
			}
		} catch (Exception e) {
			
			logger.error(" Exception while recording gracefull logout @ com.ttd.common.security.onLogoutSuccess.",e);	

			//End 26-04-2017 Session timeout issue - Venkatasurya SS
			
		}
		
		// Delete Session key from redis 08-03-2017 VenkataSSS
		String key = REDIS_KEY_PREFIX+request.getSession().getId(); 
		redisOps.delete(key);
		
		response.getWriter().print("{\"logout\":\"true\"}");

		response.getWriter().flush();

	}

	public SecurityDao getSecurityDao() {
		return securityDao;
	}

	public void setSecurityDao(SecurityDao securityDao) {
		this.securityDao = securityDao;
	}

}
