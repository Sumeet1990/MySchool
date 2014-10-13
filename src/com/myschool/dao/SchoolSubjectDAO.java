package com.myschool.dao;

import java.util.Map;

import com.myschool.dto.SchoolSubjectsDTO;

public interface SchoolSubjectDAO {

	SchoolSubjectsDTO getAllAvailableSubjects();
	
	boolean getAvailableSubjects(SchoolSubjectsDTO schoolSubjectsDTO);
	
	void createSubjects(SchoolSubjectsDTO schoolSubjectsDTO);

	boolean updateSubjects(SchoolSubjectsDTO schoolSubjectsDTO);

	Map<String,String> getAllAvailableSubjectsMap();

}
