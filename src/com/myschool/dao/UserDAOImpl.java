package com.myschool.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.UserDetails;
import com.myschool.dto.UserDetailsDTO;


public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	private static Logger log = Logger.getLogger(UserDAOImpl.class);	

	public UserDetailsDTO getLoginCredentials(String username) {
		UserDetailsDTO userDetailsDTO = new UserDetailsDTO();

		List<UserDetails> lstuserDetails = getHibernateTemplate().find("from UserDetails where userName = ?",username);
		if(lstuserDetails != null && lstuserDetails.size() > 0) {
			for( UserDetails userDetails : lstuserDetails)
			{
				userDetailsDTO.setPassword(userDetails.getPassword());
			}
			
			System.out.println("Verify credentials --------------");
		}

		return userDetailsDTO;
	}
}


