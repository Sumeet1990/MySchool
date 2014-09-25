package com.myschool.dao;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class StudentLeavesDAOImpl extends HibernateDaoSupport implements StudentLeavesDAO {	
	private static Logger log = Logger.getLogger(StudentLeavesDAOImpl.class);
}
