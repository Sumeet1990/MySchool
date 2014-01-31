package com.myschool.service;

import com.myschool.dto.UserDetailsDTO;


public interface LoginService {
   
	boolean retrieveLoginCredentials(UserDetailsDTO userDetailsDTO, final String password);

	int getUserDetails(UserDetailsDTO userDetailsDTO);

	boolean resetPassword(UserDetailsDTO userDetailsDTO);
}

