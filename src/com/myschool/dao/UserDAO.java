package com.myschool.dao;

import com.myschool.dto.UserDetailsDTO;


public interface UserDAO {
   
	void getLoginCredentials(String username, UserDetailsDTO userDetailsDTO);

	void updateLoginTimeDetails(UserDetailsDTO userDetailsDTO);

	void updateInvalidAttempts(UserDetailsDTO userDetailsDTO);

}

