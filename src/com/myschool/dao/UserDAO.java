package com.myschool.dao;

import com.myschool.dto.UserDetailsDTO;


public interface UserDAO {
   
	void retrieveLoginCredentials(UserDetailsDTO userDetailsDTO);

	void updateSuccessLoginDetails(UserDetailsDTO userDetailsDTO);

	boolean updateInvalidAttempts(UserDetailsDTO userDetailsDTO);

	boolean resetPasswordAndInvalidAttempts(UserDetailsDTO userDetailsDTO);

}

