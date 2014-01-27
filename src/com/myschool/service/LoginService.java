package com.myschool.service;

import com.myschool.dto.UserDetailsDTO;


public interface LoginService {
   
	boolean retrieveLoginCredentials(UserDetailsDTO userDetailsDTO, final String password);
}

