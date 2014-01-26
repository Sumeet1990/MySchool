package com.myschool.dao;

import com.myschool.dto.UserDetailsDTO;


public interface UserDAO {
   
	UserDetailsDTO getLoginCredentials(String username);

	void updateLoginTimeDetails(UserDetailsDTO userDetailsDTO);

	void updateInvalidAttempts(UserDetailsDTO userDetailsDTO);

}

