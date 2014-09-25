package com.myschool.dao;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class StaffLeavesDAOImpl extends HibernateDaoSupport implements StudentLeavesDAO {	
	private static Logger log = Logger.getLogger(StaffLeavesDAOImpl.class);
}
