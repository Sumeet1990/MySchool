package com.myschool.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myschool.dao.TeachingStaffDAO;
import com.myschool.dto.TeachingStaffDTO;

public class TeachingStaffServiceImpl implements TeachingStaffService {

	TeachingStaffDAO teachingStaffDAO;
	@Override
	public Map<String, String> getClassTeachersList() {
		
		List<TeachingStaffDTO> teachingStaffDTOLst = getTeachingStaffDAO().getClassTeachers();
		Map<String, String> teacherStaffMap = new HashMap<String, String>();
		for(TeachingStaffDTO teachingStaffDTO : teachingStaffDTOLst)
		{
			teacherStaffMap.put(teachingStaffDTO.getTeachingStaffId(), teachingStaffDTO.getTeachingStaffGivenFullName());
		}
		
		return teacherStaffMap;
		
	}
	public TeachingStaffDAO getTeachingStaffDAO() {
		return teachingStaffDAO;
	}
	public void setTeachingStaffDAO(TeachingStaffDAO teachingStaffDAO) {
		this.teachingStaffDAO = teachingStaffDAO;
	}

	
}
