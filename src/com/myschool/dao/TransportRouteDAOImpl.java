package com.myschool.dao;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class TransportRouteDAOImpl extends HibernateDaoSupport implements DriverDAO {	
	private static Logger log = Logger.getLogger(TransportRouteDAOImpl.class);
}
