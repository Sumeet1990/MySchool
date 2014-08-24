package com.myschool.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.dto.StaffDTO;


public class DriverDAOImpl extends HibernateDaoSupport implements DriverDAO {	
	private static Logger log = Logger.getLogger(DriverDAOImpl.class);
}
