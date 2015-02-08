package com.myschool.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.SchoolClass;
import com.myschool.beans.StaffDetails;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.util.CommonUtility;

public class SchoolClassDAOImpl extends HibernateDaoSupport implements SchoolClassDAO {
	private SchoolSubjectDAO schoolSubjectDAO;
	
	/**
	 * 
	 */
	public List<SchoolClassDTO> getAllSchoolClasses() {
		SchoolClassDTO schoolClassDTO;
		List<SchoolClassDTO>  allSchoolClassList = new ArrayList<SchoolClassDTO>();
		SchoolClassDTO returnSchoolClassDTO = new SchoolClassDTO();
		
		List<SchoolClass> schoolClassesList = getHibernateTemplate().find("from SchoolClass");
		
		if (schoolClassesList != null && schoolClassesList.size() > 0) {
			for(SchoolClass schoolClass: schoolClassesList) {
				schoolClassDTO = new SchoolClassDTO();
				CommonUtility.copyProperties(schoolClass, schoolClassDTO, 
						"schoolClassName schoolClassName",
						"minAgeCriteriaInMonths minAgeCriteriaInMonths",
						"maxAgeCriteriaInMonths maxAgeCriteriaInMonths",
						"periodsPerDay periodsPerDay",
						"periodDurationInMin periodDurationInMin",
						"teacherPeriodsPerDay teacherPeriodsPerDay",
						"classMaxStrength classMaxStrength",
						"classStatus classStatus");
				
				schoolClassDTO.setSchoolClassId(String.valueOf(schoolClass.getSchoolClassId()));
				if(StringUtils.isNotBlank(schoolClass.getSubjectCodesList())) {
					schoolClassDTO.setCalssSubjects(schoolSubjectDAO.getSubjectsFromSubjectCodes(schoolClass.getSubjectCodesList()));
				}
				
				allSchoolClassList.add(schoolClassDTO);
			}
		}
		
		return allSchoolClassList;
	}
	
	/**
	 * 
	 */
	public boolean verifyClassExists(SchoolClassDTO schoolClassDTO) {
		boolean classAlreadyExists = false;
		List<SchoolClass> schoolClasses = getHibernateTemplate().find("from SchoolClass where schoolClassName = ?", schoolClassDTO.getSchoolClassName());
		
		if (schoolClasses != null && schoolClasses.size() > 0) {
			classAlreadyExists = true;
		}
		
		return classAlreadyExists;
	}
	
	/**
	 * 
	 */
	public void createSchoolClass(SchoolClassDTO schoolClassDTO, String userId) {
		SchoolClass schoolClass = new SchoolClass();
		CommonUtility.copyProperties(schoolClassDTO, schoolClass, 
				"schoolClassName schoolClassName",
				"minAgeCriteriaInMonths minAgeCriteriaInMonths",
				"maxAgeCriteriaInMonths maxAgeCriteriaInMonths",
				"periodsPerDay periodsPerDay",
				"selectedSubjectCodes subjectCodesList",
				"periodDurationInMin periodDurationInMin",
				"teacherPeriodsPerDay teacherPeriodsPerDay",
				"classMaxStrength classMaxStrength",
				"classStatus classStatus");
		
		schoolClass.setCreatedDateTime(CommonUtility.dateToString(new Date()));
		schoolClass.setCreatedUserId(userId);

		getHibernateTemplate().save(schoolClass);
	}
	
	/**
	 * 
	 */
	public Map<String, String> getClassTeacherMap() {
		List<StaffDetails> staffDetails = getHibernateTemplate().find("from StaffDetails where classTeacherFlag='YES' and teacherStaffFlag='YES' " +
				"and staffStatus='ACTIVE'");
		HashMap<String, String> classTeacherMap = new HashMap<>();
		
		if (staffDetails != null && staffDetails.size() > 0) {
			for(StaffDetails staffDetailsObj: staffDetails) {
				classTeacherMap.put(String.valueOf(staffDetailsObj.getStaffId()), 
					staffDetailsObj.getStaffGivenFullName()+" "+staffDetailsObj.getStaffSurname());
			}
		}
		return classTeacherMap;
	}

	/**
	 * @return the schoolSubjectDAO
	 */
	public SchoolSubjectDAO getSchoolSubjectDAO() {
		return schoolSubjectDAO;
	}

	/**
	 * @param schoolSubjectDAO the schoolSubjectDAO to set
	 */
	public void setSchoolSubjectDAO(SchoolSubjectDAO schoolSubjectDAO) {
		this.schoolSubjectDAO = schoolSubjectDAO;
	}
	
	
}
