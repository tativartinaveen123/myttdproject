package com.ttd.common.security;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class BaseFilter implements Filter {

	
	private FilterConfig gConfig;

	
	public void init(FilterConfig config) throws ServletException {
		gConfig = config;
		
		
	}
	

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
	 
		Enumeration initParameters = gConfig.getInitParameterNames();
				
		String requestUrl = ((HttpServletRequest)request).getRequestURI();
		
		
		//Start 26-04-2017 Session timeout issue fix - Venkatasurya SS
		
		while(initParameters.hasMoreElements()){
			String ccUrl = initParameters.nextElement().toString();
			
			if(requestUrl.contains(ccUrl)){
			
				String ccValue = gConfig.getInitParameter(ccUrl);
				((HttpServletResponse)response).addHeader("Cache-Control",ccValue);
				
			}
			
		
		}
		
		//End 26-04-2017 Session timeout issue fix - Venkatasurya SS		
		
		
		chain.doFilter(request, response);
	}


	public void destroy() {
		
		
	}	
	

}
