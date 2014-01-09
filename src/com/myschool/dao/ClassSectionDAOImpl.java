package com.myschool.dao;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.ClassSection;
import com.myschool.util.CommonUtility;


public class ClassSectionDAOImpl extends HibernateDaoSupport implements ClassSectionDAO{

	AnnotationSessionFactoryBean sessionUtill;
	
	public  List<ClassSection> getSchoolClass( final String schoolClassName, final String sectionName) {

		 List<ClassSection> schoolClassesLst = getHibernateTemplate().find("from SchoolClass where className = ? and section=?", new Object[]{schoolClassName,sectionName});
		 return schoolClassesLst;
	}

	@Override
	public void createSchoolClass(String className, String sectionName,
			String classTeacherId) throws ParseException {
		
		ClassSection schoolClass = new ClassSection();
		schoolClass.setClassName(className);
		schoolClass.setSection(sectionName);
		schoolClass.setTeachingStaffId(Long.valueOf(classTeacherId));
		schoolClass.setCreatedDateAndTime(CommonUtility.dateToString(new Date()));
		schoolClass.setCreatedUserId("1");
		getHibernateTemplate().save(schoolClass);
	}
	@Override
	public List<ClassSection> getClassSectionFromClassName(String schoolClassName) {
		List<ClassSection> schoolClassesLst = getHibernateTemplate().find("from SchoolClass where className=?", new Object[]{schoolClassName});
		 return schoolClassesLst;
	}

}
