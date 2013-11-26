package com.myschool.user.service;

import org.apache.commons.lang.xwork.StringUtils;

import com.myschool.user.dao.UserDAO;
import com.myschool.user.dto.UserDetailsDTO;



public class UserServiceImpl implements UserService {
	   
	UserDAO userDAO;
		public boolean verifyLoginCredentials(String username, String password)
		{
			UserDetailsDTO userDetailsDTO = userDAO.getLoginCredentials(username) ;
			
			if(userDetailsDTO != null && StringUtils.isNotBlank(userDetailsDTO.getPassword()) )
			{
				if(userDetailsDTO.getPassword().equals(password))
					{
					return true;
					}
				else
				{
					return false;
				}
			}
			
			return false;
			
		}
		public UserDAO getUserDAO() {
			return userDAO;
		}
		public void setUserDAO(UserDAO userDAO) {
			this.userDAO = userDAO;
		}

	}


