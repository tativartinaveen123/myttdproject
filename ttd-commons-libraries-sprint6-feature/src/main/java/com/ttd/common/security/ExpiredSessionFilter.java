package com.ttd.common.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.filter.GenericFilterBean;

public class ExpiredSessionFilter extends GenericFilterBean {

	Logger logger = Logger.getLogger(ExpiredSessionFilter.class);
	static final String FILTER_APPLIED = "__spring_security_expired_session_filter_applied";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		logger.info("Start of doFilter in ExpiredSessionFilter");
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        if (request.getAttribute(FILTER_APPLIED) != null) {
            chain.doFilter(req, res);
            return;
        }

        request.setAttribute(FILTER_APPLIED, Boolean.TRUE);
        if (req.getRequestedSessionId() != null && !req.isRequestedSessionIdValid()) {               
        	logger.info("Inside if block in doFilter");
        	res.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "SESSION_TIMED_OUT");
            return;
        }

        chain.doFilter(request, response);
	}

}
