package com.myschool.dao;

import java.util.List;
import java.util.Map;

import com.myschool.dto.SchoolClassDTO;

public interface SchoolClassDAO {

	List<SchoolClassDTO> getAllSchoolClasses();
	
	List<SchoolClassDTO> getAllActiveSchoolClasses(); 
	
	boolean verifyClassExists(SchoolClassDTO schoolClassDTO);

	void createSchoolClass(SchoolClassDTO schoolClassDTO, String userId);

	Map<String, String> getClassTeacherMap();
}
