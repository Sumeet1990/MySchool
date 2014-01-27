package com.myschool.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.UserDetails;
import com.myschool.dto.UserDetailsDTO;
import com.myschool.util.CommonConstants;
import com.myschool.util.CommonUtility;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	private static Logger log = Logger.getLogger(UserDAOImpl.class);	
	private Map schoolConfigurationMap;
	private static final String USER_STATUS = "'ACTIVE'";
	
	public UserDetailsDTO getLoginCredentials(String username) {
		UserDetailsDTO userDetailsDTO = null;
		
		//TODO ADD userStatus as ACTIVE in the where clause
		List<UserDetails> userDetailsList = getHibernateTemplate().find("from UserDetails where userName = ? and userStatus="+USER_STATUS, username);
		if(userDetailsList != null && userDetailsList.size() > 0) {
			userDetailsDTO = new UserDetailsDTO();
			for(UserDetails userDetails : userDetailsList) {
				userDetailsDTO.setPassword(userDetails.getPassword());
				userDetailsDTO.setUserId(userDetails.getUserId());
				userDetailsDTO.setUserRoleId(userDetails.getUserRolesId());		
				userDetailsDTO.setLastLoginDetails(userDetails.getLastLogedinDateTime());
				userDetailsDTO.setInvalidAttempts(userDetails.getInvalidAttempts());
			}			
		}
		return userDetailsDTO;
	}

	@Override
	public void updateSuccessLoginDetails(UserDetailsDTO userDetailsDTO) {		
		UserDetails userDetails = (UserDetails)getHibernateTemplate().get(UserDetails.class, userDetailsDTO.getUserId());
		userDetails.setLastLogedinDateTime(CommonUtility.dateToString(new Date()));
		userDetails.setModifiedUserId(userDetailsDTO.getUserId().toString());
		userDetails.setModifiedDateAndTime(userDetails.getLastLogedinDateTime());
		userDetails.setInvalidAttempts(0);
		getHibernateTemplate().update(userDetails);		
	}

	@Override
	public void updateInvalidAttempts(UserDetailsDTO userDetailsDTO) {		
		UserDetails userDetails = (UserDetails)getHibernateTemplate().get(UserDetails.class, userDetailsDTO.getUserId());
		if(userDetails.getInvalidAttempts() < Integer.valueOf((String)schoolConfigurationMap.get(CommonConstants.MAX_INVALID_LOGIN_ATTEMPTS))) {
			userDetails.setInvalidAttempts(userDetails.getInvalidAttempts() + 1);
			userDetails.setModifiedUserId(userDetailsDTO.getUserId().toString());
			userDetails.setModifiedDateAndTime(CommonUtility.dateToString(new Date()));
			getHibernateTemplate().update(userDetails);
			userDetailsDTO.setLocked(false);
		} else {
			userDetailsDTO.setLocked(true);
		}
	}

	public Map getSchoolConfigurationMap() {
		return schoolConfigurationMap;
	}

	public void setSchoolConfigurationMap(Map schoolConfigurationMap) {
		this.schoolConfigurationMap = schoolConfigurationMap;
	}	
}
