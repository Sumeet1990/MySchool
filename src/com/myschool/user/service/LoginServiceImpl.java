package com.myschool.user.service;

import org.apache.commons.lang.xwork.StringUtils;

import com.myschool.user.dao.UserDAO;
import com.myschool.user.dto.UserDetailsDTO;

public class LoginServiceImpl implements LoginService {

	UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public boolean getLoginCredentials(String username, String password,
			UserDetailsDTO userDetailsDTO) {
		userDetailsDTO = userDAO.getLoginCredentials(username);

		if (userDetailsDTO != null
				&& StringUtils.isNotBlank(userDetailsDTO.getPassword())) {
			if (userDetailsDTO.getPassword().equals(password)) {
				return true;
			} else {
				return false;
			}
		}

		return false;

	}

	public String getUserRoleName(Integer userRoleId) {

		return "Management";
	}

}
