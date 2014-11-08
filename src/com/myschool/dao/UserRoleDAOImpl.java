package com.myschool.dao;

import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;
import javax.xml.bind.DatatypeConverter;

import com.myschool.beans.UserRole;
import com.myschool.dto.UserRoleDTO;
import com.myschool.util.CommonUtility;

public class UserRoleDAOImpl extends HibernateDaoSupport implements UserRoleDAO {

	/**
	 * 
	 * @param userRoleDTO
	 * @return
	 */
	public UserRoleDTO getUserRoleDetails(UserRoleDTO userRoleDTO) {
		List<UserRole> availableUserName = (List<UserRole>) getHibernateTemplate().find("from UserRole where userRoleName = ?", 
				userRoleDTO.getUserRoleName());
		UserRoleDTO availableUserRoleDTO = null;
		if (availableUserName != null && availableUserName.size() > 0) {
			availableUserRoleDTO = new UserRoleDTO(); 
			UserRole userRole = availableUserName.get(0); 
			availableUserRoleDTO.setUserRoleName(userRole.getUserRoleName());
			availableUserRoleDTO.setUserAccessAsSchool(getBoleanForNumber(userRole.getUserAccessAsSchool()));
			availableUserRoleDTO.setUserRoleAccess(new String(Base64.decodeBase64(userRole.getUserRoleAccess())));
		}
		return availableUserRoleDTO;
	}
	
	/**
	 * 
	 */
	public void createUserRole(UserRoleDTO userRoleDTO) {
		try {

		UserRole userRole = new UserRole();
		userRole.setUserRolesId(100003);
		userRole.setUserRoleName(userRoleDTO.getUserRoleName());
		userRole.setUserAccessAsSchool(getNumberValueForBolean(userRoleDTO.isUserAccessAsSchool()));
		 
		userRole.setUserRoleAccess(Base64.encodeBase64(userRoleDTO.getUserRoleAccess().getBytes());
		
		userRole.setCreatedDateTime(CommonUtility.dateToString(new Date()));
		userRole.setCreatedUserId(userRoleDTO.getUserId());
		getHibernateTemplate().save(userRole);
		 } catch (Exception e) {
		        System.out.println(" Exception " + e.getMessage());
		    }

	}
	
	/**
	 * 
	 * @param inputString
	 * @return
	 */
	private Integer getNumberValueForBolean(boolean inputString) {
		return inputString ? 1 : 0; 
	}
	
	/**
	 * 
	 * @param inputString
	 * @return
	 */
	private boolean getBoleanForNumber(Integer inputString) {
		return inputString == null || inputString == 0 ? false : true; 
	}
}
