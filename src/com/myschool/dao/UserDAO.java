package com.myschool.dao;

import com.myschool.dto.UserDetailsDTO;


public interface UserDAO {
   
	UserDetailsDTO getLoginCredentials(String username);

}

