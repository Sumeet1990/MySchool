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
	
	public boolean retrieveLoginCredentials(UserDetailsDTO userDetailsDTO, final String password) {
		boolean retFlag = true;
		userDAO.retrieveLoginCredentials(userDetailsDTO);
		
		if (StringUtils.equals(userDetailsDTO.getPassword(), password)) {
			if(userDetailsDTO.getInvalidAttempts() < Integer.valueOf(schoolConfigurationMap
					.get(CommonConstants.MAX_INVALID_LOGIN_ATTEMPTS).toString())) {				
				userDAO.updateSuccessLoginDetails(userDetailsDTO);
				//TODO get role name
				
				userDetailsDTO.setVerificationStatus(true);
				userDetailsDTO.setLocked(false);
			} else {
				userDetailsDTO.setVerificationStatus(false);
				userDetailsDTO.setLocked(true);
				
				retFlag = false;
			}			
		} else {			
			if(userDetailsDTO.getUserId() != null) {
				boolean updateFlag = userDAO.updateInvalidAttempts(userDetailsDTO);		
				if(updateFlag) {
					userDetailsDTO.setLocked(false);
				} else {
					userDetailsDTO.setLocked(true);
				}
			} 
			
			userDetailsDTO.setVerificationStatus(false);
			retFlag = false;
		}
		
		return retFlag;
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
