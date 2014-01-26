package com.myschool.service;

import com.myschool.dto.UserDetailsDTO;


public interface LoginService {
   
	boolean getLoginCredentials(String username, String password, UserDetailsDTO userDetailsDTO);
}

