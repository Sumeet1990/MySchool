package com.myschool.dao;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.action.Logger;
import com.myschool.beans.ClassSection;
import com.myschool.util.CommonUtility;


public class ClassSectionDAOImpl extends HibernateDaoSupport implements ClassSectionDAO {	
	private static Logger log = Logger.getLogger(ClassSectionDAOImpl.class);
}
