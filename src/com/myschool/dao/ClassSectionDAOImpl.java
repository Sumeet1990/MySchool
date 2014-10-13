package com.myschool.dao;

import org.apache.log4j.Logger;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.ClassSection;
import com.myschool.dto.ClassSectionDTO;
import com.myschool.util.CommonUtility;


public class ClassSectionDAOImpl extends HibernateDaoSupport implements ClassSectionDAO {	
	private static Logger log = Logger.getLogger(ClassSectionDAOImpl.class);

	@Override
	public boolean createClassSection(ClassSectionDTO classSectionDTO) {
		ClassSection classSection =  new ClassSection();
		CommonUtility.copyProperties(classSectionDTO, classSection, "schoolClassId schoolClassId",
				"section section",
				"staffId staffId",
				"sectionMaximumStrength sectionMaximumStrength",
				"sectionStatus sectionStatus",
				"createdUserId createdUserId");
		getHibernateTemplate().save(classSection);
		return true;
		
	}
}
