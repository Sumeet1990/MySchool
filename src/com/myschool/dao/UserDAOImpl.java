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

	public void retrieveLoginCredentials(UserDetailsDTO userDetailsDTO) {
		// TODO ADD userStatus as ACTIVE in the where clause
		List<UserDetails> userDetailsList = getHibernateTemplate().find(
				"from UserDetails where userName = ? and userStatus="
						+ USER_STATUS, userDetailsDTO.getUsername());
		if (userDetailsList != null && userDetailsList.size() > 0) {
			for (UserDetails userDetails : userDetailsList) {
				CommonUtility.copyProperties(userDetails, userDetailsDTO,
						"userId userId", "userName userName", "password",
						"userGivenFullName userGivenFullName",
						"userSurname userSurname", "userDob userDob",
						"invalidAttempts invalidAttempts",
						"securityQuestion securityQuestion",
						"securityAnswer securityAnswer",
						"lastLogedinDateTime lastLogedinDateTime");
				userDetailsDTO.setUserRolesName(userDetails.getUserRole()
						.getUserRolesName());
				userDetailsDTO.setPersonalContactNumber(userDetails
						.getStaffAddress().getPersonalContactNumber());
			}
		}

	}

	@Override
	public void updateSuccessLoginDetails(UserDetailsDTO userDetailsDTO) {
		UserDetails userDetails = (UserDetails) getHibernateTemplate().get(
				UserDetails.class, userDetailsDTO.getUserId());
		if (userDetails != null) {
			userDetails.setLastLogedinDateTime(CommonUtility
					.dateToString(new Date()));
			userDetails
					.setModifiedUserId(userDetailsDTO.getUserId().toString());
			userDetails.setModifiedDateTime(userDetails
					.getLastLogedinDateTime());
			userDetails.setInvalidAttempts(0);

			getHibernateTemplate().update(userDetails);
		}
	}

	@Override
	public boolean updateInvalidAttempts(UserDetailsDTO userDetailsDTO) {
		boolean updateFlag = true;
		UserDetails userDetails = (UserDetails) getHibernateTemplate().get(
				UserDetails.class, userDetailsDTO.getUserId());
		if (userDetails != null
				&& userDetails.getInvalidAttempts() < Integer
						.valueOf((String) schoolConfigurationMap
								.get(CommonConstants.MAX_INVALID_LOGIN_ATTEMPTS))) {
			userDetails
					.setInvalidAttempts(userDetails.getInvalidAttempts() + 1);
			userDetails
					.setModifiedUserId(userDetailsDTO.getUserId().toString());
			userDetails.setModifiedDateTime(CommonUtility
					.dateToString(new Date()));

			getHibernateTemplate().update(userDetails);
		} else {
			updateFlag = false;
		}

		return updateFlag;
	}

	public boolean resetPasswordAndInvalidAttempts(UserDetailsDTO userDetailsDTO) {
		UserDetails userDetails = (UserDetails) getHibernateTemplate().get(
				UserDetails.class, userDetailsDTO.getUserId());
		if (userDetails != null) {
			userDetails.setPassword(userDetailsDTO.getPassword());
			userDetails.setInvalidAttempts(0);
			getHibernateTemplate().update(userDetails);
			return true;
		}else
		{
			return false;
		}
	}

	public Map getSchoolConfigurationMap() {
		return schoolConfigurationMap;
	}

	public void setSchoolConfigurationMap(Map schoolConfigurationMap) {
		this.schoolConfigurationMap = schoolConfigurationMap;
	}
}
