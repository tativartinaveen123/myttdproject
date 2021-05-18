package com.ttd.common.security;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

import com.ttd.common.security.model.UserInformation;

public class BasePermissionEvaluator implements PermissionEvaluator {

	Logger logger = Logger.getLogger(BasePermissionEvaluator.class);

	
	public boolean hasPermission(Authentication authentication,
			Object targetObject, Object permission) {
		boolean hasPermission = false;

		logger.info("Start of hasPermission in BasePermissionEvaluator");

		logger.info("Authentication :: " + authentication);
		if (authentication != null && permission instanceof String) {
			
			UserInformation user = (UserInformation)authentication.getPrincipal();
			
			List<String> permissionList = user.getPermissionList();
			
			if(permissionList.contains(permission)){
				hasPermission = true;
			}
		
		} else {
			hasPermission = false;
		}
		return hasPermission;
	}

	
	public boolean hasPermission(Authentication authentication,
			Serializable arg1, String arg2, Object arg3) {
		return false;
	}

}
