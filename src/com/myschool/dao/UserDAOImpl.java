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

	public void getLoginCredentials(String username, UserDetailsDTO userDetailsDTO) {

		List<UserDetails> lstuserDetails = getHibernateTemplate().find("from UserDetails where userName = ?",username);
		if(lstuserDetails != null && lstuserDetails.size() > 0) {
			for( UserDetails userDetails : lstuserDetails)
			{
				userDetailsDTO.setPassword(userDetails.getPassword());
				userDetailsDTO.setUserId(userDetails.getUserId());
				userDetailsDTO.setUserRoleId(userDetails.getUserRolesId());
				userDetailsDTO.setLocked(false);
			}
			
			System.out.println("Verify credentials --------------");
		}
	}

	@Override
	public void updateLoginTimeDetails(UserDetailsDTO userDetailsDTO) {
		
		UserDetails user = (UserDetails)getHibernateTemplate().get(UserDetails.class, userDetailsDTO.getUserId());
		user.setLastLogedinDateTime(CommonUtility.dateToString(new Date()));
		userDetailsDTO.setLastLoginDetails(user.getLastLogedinDateTime());
		getHibernateTemplate().update(user);
		
	}

	@Override
	public void updateInvalidAttempts(UserDetailsDTO userDetailsDTO) {
		
		UserDetails user = (UserDetails)getHibernateTemplate().get(UserDetails.class, userDetailsDTO.getUserId());
		if(user.getInvalidAttempts() <= 3)
		{
			user.setInvalidAttempts(user.getInvalidAttempts() + 1);
			getHibernateTemplate().update(user);
			userDetailsDTO.setLocked(false);
		}else
		{
			userDetailsDTO.setLocked(true);
		}
	}
}


