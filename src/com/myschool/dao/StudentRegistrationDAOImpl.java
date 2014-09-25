package com.myschool.dao;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class StudentRegistrationDAOImpl extends HibernateDaoSupport implements StudentRegistrationDAO {	
	private static Logger log = Logger.getLogger(StudentRegistrationDAOImpl.class);
}
