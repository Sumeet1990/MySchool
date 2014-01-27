package com.myschool.service;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.log4j.Logger;
import java.util.Map;

import com.myschool.dao.UserDAO;
import com.myschool.dto.UserDetailsDTO;
import com.myschool.util.CommonConstants;

public class LoginServiceImpl implements LoginService {
	private static Logger log = Logger.getLogger(LoginServiceImpl.class);
	private UserDAO userDAO;
	private Map<String,String> schoolConfigurationMap;
	
	public UserDetailsDTO retrieveLoginCredentials(String username, String password) {
		UserDetailsDTO userDetailsDTO = userDAO.getLoginCredentials(username);
		if (userDetailsDTO != null &&
				StringUtils.equals(userDetailsDTO.getPassword(), password)) {
			if(userDetailsDTO.getInvalidAttempts() < Integer.valueOf(schoolConfigurationMap.get(CommonConstants.MAX_INVALID_LOGIN_ATTEMPTS).toString())) {	
				userDetailsDTO.setVerificationStatus(true);
				userDetailsDTO.setLocked(false);
				userDAO.updateSuccessLoginDetails(userDetailsDTO);
				//TODO get role name
			} else {
				userDetailsDTO.setVerificationStatus(false);
				userDetailsDTO.setLocked(true);
			}			
		} else {			
			if(userDetailsDTO == null) {
				//TODO SET MESSGE as INVALID USER NAME
			} else {	
				userDetailsDTO.setVerificationStatus(false);
				userDAO.updateInvalidAttempts(userDetailsDTO);
				//TODO SET MESSGE as INVALID PASSWORD
			}			
		}
		
		return userDetailsDTO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public Map getSchoolConfigurationMap() {
		return schoolConfigurationMap;
	}

	public void setSchoolConfigurationMap(Map schoolConfigurationMap) {
		this.schoolConfigurationMap = schoolConfigurationMap;
	}		
	
}
