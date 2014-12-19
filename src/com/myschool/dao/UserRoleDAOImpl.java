package com.myschool.dao;

import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
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
		UserRoleDTO availableUserRoleDTO = null;
		try {
			List<UserRole> availableUserName = (List<UserRole>) getHibernateTemplate().find("from UserRole where userRoleName = ?", 
					userRoleDTO.getUserRoleName());
			
			if (availableUserName != null && availableUserName.size() > 0) {
				availableUserRoleDTO = new UserRoleDTO(); 
				UserRole userRole = availableUserName.get(0); 
				availableUserRoleDTO.setUserRoleName(userRole.getUserRoleName());
				availableUserRoleDTO.setUserAccessAsSchool(getBoleanForNumber(userRole.getUserAccessAsSchool()));
				availableUserRoleDTO.setUserRoleAccess(new String(Base64.decodeBase64(userRole.getUserRoleAccess())));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return availableUserRoleDTO;
	}
	
	/**
	 * 
	 */
	public void createUserRole(UserRoleDTO userRoleDTO) {
		try {
			System.out.println("@@@@@@@@@@@ createUserRole 111111111111 : "+userRoleDTO.toString());
			UserRole userRole = new UserRole();
			userRole.setUserRolesId(100005);
			userRole.setUserRoleName(userRoleDTO.getUserRoleName());
			userRole.setUserAccessAsSchool(getNumberValueForBolean(userRoleDTO.isUserAccessAsSchool()));
			System.out.println("@@@@@@@@@@@ createUserRole 4444444444444:");
			userRole.setUserRoleAccess(Base64.encodeBase64(userRoleDTO.getUserRoleAccess().getBytes()));
			System.out.println("@@@@@@@@@@@ createUserRole 555555555555:");
			userRole.setCreatedDateTime(CommonUtility.dateToString(new Date()));
			userRole.setCreatedUserId(userRoleDTO.getUserId());
			System.out.println("@@@@@@@@@@@ createUserRole 66666666666666666:");
			getHibernateTemplate().save(userRole);
			System.out.println("@@@@@@@@@@@ createUserRole 777777777777:");
		 } catch (Exception e) {
			 e.printStackTrace();
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
