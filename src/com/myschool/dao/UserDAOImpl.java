package com.myschool.dao;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.UserDetails;
import com.myschool.dto.UserDetailsDTO;
import com.myschool.util.CommonUtility;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	private static Logger log = Logger.getLogger(UserDAOImpl.class);	

	public UserDetailsDTO getLoginCredentials(String username) {
		UserDetailsDTO userDetailsDTO = null;
		//TODO ADD userStatus as ACTIVE in the where clause
		List<UserDetails> userDetailsList = getHibernateTemplate().find("from UserDetails where userName = ?", username);
		if(userDetailsList != null && userDetailsList.size() > 0) {
			userDetailsDTO = new UserDetailsDTO();
			for(UserDetails userDetails : userDetailsList) {
				userDetailsDTO.setPassword(userDetails.getPassword());
				userDetailsDTO.setUserId(userDetails.getUserId());
				userDetailsDTO.setUserRoleId(userDetails.getUserRolesId());		
				userDetailsDTO.setLastLoginDetails(userDetails.getLastLogedinDateTime());
				userDetailsDTO.setInvalidAttempts(userDetails.getInvalidAttempts());
			}
			
			System.out.println("Verify credentials --------------");
		}
		return userDetailsDTO;
	}

	@Override
	public void updateLoginTimeDetails(UserDetailsDTO userDetailsDTO) {		
		UserDetails userDetails = (UserDetails)getHibernateTemplate().get(UserDetails.class, userDetailsDTO.getUserId());
		userDetails.setLastLogedinDateTime(CommonUtility.dateToString(new Date()));
		userDetails.setModifiedUserId(userDetailsDTO.getUserId().toString());
		userDetails.setModifiedDateAndTime(userDetails.getLastLogedinDateTime());
		getHibernateTemplate().update(userDetails);		
	}

	@Override
	public void updateInvalidAttempts(UserDetailsDTO userDetailsDTO) {		
		UserDetails userDetails = (UserDetails)getHibernateTemplate().get(UserDetails.class, userDetailsDTO.getUserId());
		if(userDetails.getInvalidAttempts() < 3) {
			userDetails.setInvalidAttempts(userDetails.getInvalidAttempts() + 1);
			userDetails.setModifiedUserId(userDetailsDTO.getUserId().toString());
			userDetails.setModifiedDateAndTime(CommonUtility.dateToString(new Date()));
			getHibernateTemplate().update(userDetails);
			userDetailsDTO.setLocked(false);
		} else {
			userDetailsDTO.setLocked(true);
		}
	}
}
