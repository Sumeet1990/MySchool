package com.myschool.service;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.log4j.Logger;

import com.myschool.dao.UserDAO;
import com.myschool.dto.UserDetailsDTO;

public class LoginServiceImpl implements LoginService {
	private static Logger log = Logger.getLogger(LoginServiceImpl.class);
	UserDAO userDAO;
	
	public boolean getLoginCredentials(String username, String password,
			UserDetailsDTO userDetailsDTO) {
		userDetailsDTO = userDAO.getLoginCredentials(username);

		if (userDetailsDTO != null &&
				StringUtils.equals(userDetailsDTO.getPassword(), password)) {
			return true;
		} else {
			return false;
		}
	}

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	
}
