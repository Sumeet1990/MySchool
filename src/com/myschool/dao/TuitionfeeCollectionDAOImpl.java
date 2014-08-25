package com.myschool.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.dto.StaffDTO;


public class TuitionfeeCollectionDAOImpl extends HibernateDaoSupport implements TuitionfeeCollectionDAO {	
	private static Logger log = Logger.getLogger(TuitionfeeCollectionDAOImpl.class);
}
