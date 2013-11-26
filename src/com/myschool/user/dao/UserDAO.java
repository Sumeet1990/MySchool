package com.myschool.user.dao;

import com.myschool.user.dto.UserDetailsDTO;


public interface UserDAO {
   
	UserDetailsDTO getLoginCredentials(String username);

}

