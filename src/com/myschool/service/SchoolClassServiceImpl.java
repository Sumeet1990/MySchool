package com.myschool.service;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myschool.beans.SchoolClass;
import com.myschool.dao.SchoolClassDAO;
import com.myschool.dao.TeachingStaffDAO;
import com.myschool.dto.TeachingStaffDTO;

public class SchoolClassServiceImpl implements SchoolClassService {

	private TeachingStaffDAO teachingStaffDAO;
	private SchoolClassDAO schoolClassDAO; 
	@Override
	public Map<Long, String> getClassTeachersList() {
		
		List<TeachingStaffDTO> teachingStaffDTOLst = getTeachingStaffDAO().getClassTeachers();
		Map<Long, String> teacherStaffMap = new HashMap<Long, String>();
		for(TeachingStaffDTO teachingStaffDTO : teachingStaffDTOLst)
		{
			teacherStaffMap.put(teachingStaffDTO.getTeachingStaffId(), teachingStaffDTO.getTeachingStaffGivenFullName());
		}
		
		return teacherStaffMap;
		
	}
	@Override
	public List<SchoolClass> createSchoolClass( final String className,final String sectionName, final String classTeacherId) throws ParseException {
		
		List<SchoolClass> schoolClassesLst = getSchoolClassDAO().getSchoolClass(className, sectionName);
		if(schoolClassesLst.isEmpty())
		{
			getSchoolClassDAO().createSchoolClass(className,sectionName,classTeacherId);		
			return getSchoolClassDAO().getSchoolClass(className, sectionName);
		}else
		{
			return null;
		}
	}
	
	public TeachingStaffDAO getTeachingStaffDAO() {
		return teachingStaffDAO;
	}
	public void setTeachingStaffDAO(TeachingStaffDAO teachingStaffDAO) {
		this.teachingStaffDAO = teachingStaffDAO;
	}
	public SchoolClassDAO getSchoolClassDAO() {
		return schoolClassDAO;
	}
	public void setSchoolClassDAO(SchoolClassDAO schoolClassDAO) {
		this.schoolClassDAO = schoolClassDAO;
	}
}
