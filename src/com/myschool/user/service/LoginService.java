package com.myschool.user.service;

import com.myschool.user.dto.UserDetailsDTO;


public interface LoginService {
   
	boolean verifyLoginCredentials(String username, String password, UserDetailsDTO userDetailsDTO);

	String getUserRoleName(Integer integer);

}

