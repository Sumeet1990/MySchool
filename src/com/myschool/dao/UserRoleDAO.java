package com.myschool.dao;

import com.myschool.dto.UserRoleDTO;


public interface UserRoleDAO {
	UserRoleDTO getUserRoleDetails(UserRoleDTO userRoleDTO);
	
	void createUserRole(UserRoleDTO userRoleDTO);
}
