package com.myschool.dao;

import java.util.List;

import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.UserDetails;
import com.myschool.dto.UserDetailsDTO;


public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {
	   
	AnnotationSessionFactoryBean sessionUtill;

		public UserDetailsDTO getLoginCredentials(String username)
		{
			UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
			List<UserDetails> userDetailsList =  getHibernateTemplate().find("from UserDetails where userName=?",username);
			if(userDetailsList != null && userDetailsList.size() > 0) {
				UserDetails userDetails = userDetailsList.get(0);
				userDetailsDTO.setPassword(userDetails.getPassword());
				userDetailsDTO.setUserRoleId(userDetails.getUserRoleId());
				System.out.println("Verify credentials --------------");
			}
			return userDetailsDTO;
			
		}

	}


