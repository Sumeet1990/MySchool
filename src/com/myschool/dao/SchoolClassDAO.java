package com.myschool.dao;

import java.util.List;
import java.util.Map;

import com.myschool.dto.SchoolClassDTO;

public interface SchoolClassDAO {

	public List<SchoolClassDTO> getAllSchoolClasses();
	
	boolean verifyClassExists(SchoolClassDTO schoolClassDTO);

	void createSchoolClass(SchoolClassDTO schoolClassDTO, String userId);

	Map<String, String> getClassTeacherMap();
}
