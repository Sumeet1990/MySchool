package com.myschool.dao;

import java.util.List;
import java.util.Map;

import com.myschool.dto.SchoolSubjectsDTO;

public interface SchoolSubjectDAO {

	List<SchoolSubjectsDTO> getAllAvailableSubjects();
	
	List<SchoolSubjectsDTO> getAllActiveAvailableSubjects();
	
	boolean getAvailableSubjects(SchoolSubjectsDTO schoolSubjectsDTO);
	
	void createSubjects(SchoolSubjectsDTO schoolSubjectsDTO);

	boolean updateSubjects(SchoolSubjectsDTO schoolSubjectsDTO);
	
	String getSubjectsFromSubjectCodes(String subjectCodes);
}
