package com.myschool.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.action.Logger;
import com.myschool.beans.ClassSection;
import com.myschool.beans.TeachingStaff;
import com.myschool.dto.TeachingStaffDTO;


public class StaffDAOImpl extends HibernateDaoSupport implements StaffDAO {	
	private static Logger log = Logger.getLogger(StaffDAOImpl.class);
}
