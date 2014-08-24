package com.myschool.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.dto.StaffDTO;


public class StudentRegistrationDAOImpl extends HibernateDaoSupport implements StudentRegistrationDAO {	
	private static Logger log = Logger.getLogger(StudentRegistrationDAOImpl.class);
}
