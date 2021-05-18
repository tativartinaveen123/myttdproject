package com.ttd.common.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.WebUtils;

public class CsrfHeaderFilter extends OncePerRequestFilter {

	Logger logger = Logger.getLogger(CsrfHeaderFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		logger.info("Start of doFilterInternal in CsrfHeaderFilter");
		logger.info("****************************************************************");
		
		
		CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
		if (csrf != null) {
			Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");
			String token = csrf.getToken();
			if (cookie == null || token != null
					&& !token.equals(cookie.getValue())) {
				cookie = new Cookie("XSRF-TOKEN", token);
				cookie.setPath("/");
				response.addCookie(cookie);
			}
		}
		
	
		
		filterChain.doFilter(request, response);
		
		
		
		
		
		/*CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
		String csrfheaderToken = request.getHeader("XSRF-TOKEN");
				String token = null;
		
		
		if (csrf != null) {
			Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");			
			token = csrf.getToken();
			if ( cookie == null  || token != null && !token.equals(cookie.getValue()) ) {
				cookie = new Cookie("XSRF-TOKEN", token);
				cookie.setPath("/");
								
				response.setHeader("XSRF-TOKEN", token);
				response.setHeader("x-xsrf-token", token);
				response.addCookie(cookie);
			}
			
		}
		
		
		if (csrf != null) {
			
			if (csrfheaderToken == null || token != null &&  !token.equals(csrfheaderToken)) {
				
				if(csrfheaderToken==null){
				
				Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");	
				cookie = new Cookie("XSRF-TOKEN", token);
				cookie.setPath("/");
				
				response.addCookie(cookie);
				response.setHeader("XSRF-TOKEN", token);
				response.setHeader("x-xsrf-token", token);
				
				}else{
					
					Cookie cookie = WebUtils.getCookie(request, "XSRF-TOKEN");	
					cookie = new Cookie("XSRF-TOKEN", csrfheaderToken);
					cookie.setPath("/");
					
					response.addCookie(cookie);
					response.setHeader("XSRF-TOKEN", token);
					response.setHeader("x-xsrf-token", csrfheaderToken);
					
				}
			}
			
		}
	
		
		filterChain.doFilter(request, response);*/
	}
}
