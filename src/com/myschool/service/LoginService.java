package com.myschool.service;

import java.util.Map;

import com.myschool.dto.UserDetailsDTO;


public interface LoginService {
   
	boolean getLoginCredentials(String username, String password, UserDetailsDTO userDetailsDTO);
}

