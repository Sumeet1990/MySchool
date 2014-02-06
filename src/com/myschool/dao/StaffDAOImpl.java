package com.myschool.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.dto.StaffDTO;


public class StaffDAOImpl extends HibernateDaoSupport implements StaffDAO {	
	private static Logger log = Logger.getLogger(StaffDAOImpl.class);

	@Override
	public List<StaffDTO> getClassTeachers() {
		// TODO Auto-generated method stub
		return null;
	}
}
