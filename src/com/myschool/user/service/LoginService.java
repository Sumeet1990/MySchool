package com.myschool.user.service;

import java.util.Map;

import com.myschool.user.dto.UserDetailsDTO;


public interface LoginService {
   
	boolean getLoginCredentials(String username, String password, UserDetailsDTO userDetailsDTO);

	String getUserRoleName(Integer integer);

}

