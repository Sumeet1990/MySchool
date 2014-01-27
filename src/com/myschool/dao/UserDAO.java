package com.myschool.dao;

import com.myschool.dto.UserDetailsDTO;


public interface UserDAO {
   
	UserDetailsDTO getLoginCredentials(String username);

	void updateSuccessLoginDetails(UserDetailsDTO userDetailsDTO);

	void updateInvalidAttempts(UserDetailsDTO userDetailsDTO);

}

