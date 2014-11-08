package com.myschool.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.SchoolClass;
import com.myschool.beans.StaffDetails;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.util.CommonUtility;

public class SchoolClassDAOImpl extends HibernateDaoSupport implements SchoolClassDAO {

	@Override
	public void verifyClassExists(SchoolClassDTO schoolClassDTO) {
		List<SchoolClass> schoolClasses = getHibernateTemplate().find("from SchoolClass where schoolClassName = ?",schoolClassDTO.getSchoolClassName());
		
		if (schoolClasses != null && schoolClasses.size() > 0) {
			schoolClassDTO.setClassOperationStatus(false);
		}
	}
	
	@Override
	public List<SchoolClass> getAllClassesList() {
		List<SchoolClass> schoolClasses = getHibernateTemplate().find("from SchoolClass");
		//TODO do not return pojo, set to DTO and return
		return schoolClasses;
	}

	@Override
	public void createSchoolClass(SchoolClassDTO schoolClassDTO, String userId) {
		SchoolClass schoolClass = new SchoolClass();
		CommonUtility.copyProperties(schoolClassDTO, schoolClass, "schoolClaassId schoolClassId",
				"schoolClassName schoolClassName",
				"minimumStudAge minAgeCriteria",
				"maximumStudAge maxAgeCriteria",
				"periodsPerDay periodsPerDay",
				"durationOfPeriod periodMinutesDuration",
				"maxPeriodsPerteacher teacherPeriodsPerDay",
				"statusClass classStatus",
				"schoolClassName schoolClassName");
		schoolClass.setSubjectCodesList(schoolClassDTO.getSelectedSubjectCodes());
		schoolClass.setCreatedDateTime(CommonUtility.dateToString(new Date()));
		schoolClass.setCreatedUserId(userId);

		getHibernateTemplate().save(schoolClass);
	}

	@Override
	public Map<String, String> getClassTeacherMap() {
		List<StaffDetails> staffDetails = getHibernateTemplate().find("from StaffDetails where classTeacherFlag='YES' and teacherStaffFlag='YES' and staffStatus='ACTIVE'");
		HashMap<String, String> classTeacherMap = new HashMap<>();
		
		if (staffDetails != null && staffDetails.size() > 0) {
			for(StaffDetails staffDetailsObj: staffDetails)
			classTeacherMap.put(String.valueOf(staffDetailsObj.getStaffId()), staffDetailsObj.getStaffGivenFullName()+" "+staffDetailsObj.getStaffSurname());
		}
		return classTeacherMap;
	}
}
