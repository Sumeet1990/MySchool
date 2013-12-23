package com.myschool.service;

import java.util.Map;

import org.apache.commons.lang.xwork.StringUtils;

import com.myschool.dao.UserDAO;
import com.myschool.dto.UserDetailsDTO;

public class LoginServiceImpl implements LoginService {

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

	public String getUserRoleName(Integer userRoleId) {
		return "Management";
	}
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
