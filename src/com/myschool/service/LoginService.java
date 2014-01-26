package com.myschool.service;

import com.myschool.dto.UserDetailsDTO;


public interface LoginService {
   
	UserDetailsDTO retrieveLoginCredentials(String username, String password);
}

