package com.myschool.service;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.xwork.StringUtils;

import com.myschool.beans.ClassSection;
import com.myschool.dao.ClassSectionDAO;
import com.myschool.dao.StaffDAO;
import com.myschool.dto.TeachingStaffDTO;

public class ClassSectionServiceImpl implements ClassSectionService {

	private StaffDAO teachingStaffDAO;
	private ClassSectionDAO classSectionDAO; 
	
	public Map<Long, String> getClassTeachersList() {		
		List<TeachingStaffDTO> teachingStaffDTOLst = getTeachingStaffDAO().getClassTeachers();
		Map<Long, String> teacherStaffMap = new HashMap<Long, String>();
		
		for(TeachingStaffDTO teachingStaffDTO : teachingStaffDTOLst) {
			teacherStaffMap.put(teachingStaffDTO.getTeachingStaffId(), teachingStaffDTO.getTeachingStaffGivenFullName());
		}
		
		return teacherStaffMap;
		
	}
	
	/**
	 * 
	 * @param className
	 * @param sectionName
	 * @param classTeacherId
	 * @return
	 * @throws ParseException
	 */
	public List<ClassSection> createClassSection( final String className,final String sectionName, final String classTeacherId) throws ParseException {
		
		List<ClassSection> classSectionLst = getClassSectionDAO().getClassSections(className, sectionName);
		
		if(classSectionLst.isEmpty()) {
			getClassSectionDAO().createClassSection(className,sectionName,classTeacherId);		
			return getClassSectionDAO().getClassSection(className, sectionName);
		} else {
			return null;
		}
	}
	
	@Override
	public List<ClassSection> getSchoolFrmClassOrSection(String schoolClassName,
			String section) {
		List<ClassSection> schoolClassLst = null;
		
		if(!StringUtils.isBlank(section)) {
			schoolClassLst = getSchoolClassDAO().getSchoolClass(schoolClassName, section);
		} else {
			schoolClassLst = getSchoolClassDAO().getClassSectionFromClassName(schoolClassName);
		}
		
		return schoolClassLst;
	}
	
	public StaffDAO getTeachingStaffDAO() {
		return teachingStaffDAO;
	}
	public void setTeachingStaffDAO(StaffDAO teachingStaffDAO) {
		this.teachingStaffDAO = teachingStaffDAO;
	}

	public ClassSectionDAO getClassSectionDAO() {
		return classSectionDAO;
	}

	public void setClassSectionDAO(ClassSectionDAO classSectionDAO) {
		this.classSectionDAO = classSectionDAO;
	}	
}
