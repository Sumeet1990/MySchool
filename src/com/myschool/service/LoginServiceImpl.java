package com.myschool.service;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.log4j.Logger;

import com.myschool.dao.UserDAO;
import com.myschool.dto.UserDetailsDTO;

public class LoginServiceImpl implements LoginService {
	private static Logger log = Logger.getLogger(LoginServiceImpl.class);
	UserDAO userDAO;
	
	public UserDetailsDTO retrieveLoginCredentials(String username, String password) {
		UserDetailsDTO userDetailsDTO = userDAO.getLoginCredentials(username);
		if (userDetailsDTO != null &&
				StringUtils.equals(userDetailsDTO.getPassword(), password)) {
			if(userDetailsDTO.getInvalidAttempts() < 3) {
				userDetailsDTO.setLocked(false);
				System.out.println("#################");
				userDAO.updateLoginTimeDetails(userDetailsDTO);
				//TODO get role name
			} else {
				userDetailsDTO.setLocked(true);
			}
			userDetailsDTO.setVerificationStatus(true);
		} else {
			userDetailsDTO.setVerificationStatus(false);
			userDAO.updateInvalidAttempts(userDetailsDTO);
		}
		
		return userDetailsDTO;
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
}
