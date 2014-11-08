/**
 * 
 */
package com.myschool.service;

import com.myschool.dto.UserRoleDTO;

public interface UserRoleService {
	UserRoleDTO createUserRole(UserRoleDTO userRoleDTO);
	
	String getUserRoleAccessDetails(UserRoleDTO userRoleDTO);
}
