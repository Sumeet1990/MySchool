package com.myschool.service;

import org.apache.commons.lang3.StringUtils;

import com.myschool.dto.UserRoleDTO;
import com.myschool.dao.UserRoleDAO;
public class UserRoleServiceImpl implements UserRoleService {
	private UserRoleDAO userRoleDAO; 
	
	public UserRoleDTO createUserRole(UserRoleDTO userRoleDTO) {
		UserRoleDTO availableUserNameDTO = userRoleDAO.getUserRoleDetails(userRoleDTO);
		if(availableUserNameDTO == null || (availableUserNameDTO != null && 
				!StringUtils.equalsIgnoreCase(availableUserNameDTO.getUserRoleName(), userRoleDTO.getUserRoleName()))) {
			userRoleDAO.createUserRole(userRoleDTO);
		} else {
			//TODO return message to UI saying that USER ROLE ALREADY EXISTS
		}
		
		return userRoleDTO;
	}
	
	public String getUserRoleAccessDetails(UserRoleDTO userRoleDTO) {
		userRoleDTO = userRoleDAO.getUserRoleDetails(userRoleDTO);
		if(userRoleDTO != null) {
			return userRoleDTO.getUserRoleAccess();
		} else {
			return StringUtils.EMPTY;
		}
	}

	/**
	 * @return the userRoleDAO
	 */
	public UserRoleDAO getUserRoleDAO() {
		return userRoleDAO;
	}

	/**
	 * @param userRoleDAO the userRoleDAO to set
	 */
	public void setUserRoleDAO(UserRoleDAO userRoleDAO) {
		this.userRoleDAO = userRoleDAO;
	}
}
