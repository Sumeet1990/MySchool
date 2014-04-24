package com.myschool.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.SchoolClass;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.util.CommonUtility;

public class SchoolClassDAOImpl extends HibernateDaoSupport implements SchoolClassDAO{

	@Override
	public void verifyClassExists(SchoolClassDTO schoolClassDTO) {
		
		List<SchoolClass> schoolClasses = getHibernateTemplate().find("from SchoolClass where schoolClassName = ?",schoolClassDTO.getSchoolClassName());
		
		if (schoolClasses != null && schoolClasses.size() > 0) {
			schoolClassDTO.setClassOperationStatus(false);
		}
	}

	@Override
	public void createSchoolClass(SchoolClassDTO schoolClassDTO, String userId) {

		SchoolClass schoolClass = new SchoolClass();
		CommonUtility.copyProperties(schoolClassDTO, schoolClass, "maxStrengthOfClass classMaximumStrength" +
				"maxPeriodsPerteacher teacherPeriodsPerDay" +
				"durationOfPeriod periodMinutesDuration" +
				"periodsPerDay periodsPerDay" +
				"maximumStudAge maxAgeCriteria" +
				"minimumStudAge minAgeCriteria" +
				"schoolClassName schoolClassName");
		
		schoolClass.setCreatedDateTime(CommonUtility.dateToString(new Date()));
		schoolClass.setCreatedUserId(userId);
		
	}

}
