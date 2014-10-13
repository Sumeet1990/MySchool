/**
 * 
 */
package com.myschool.service;

import java.util.Map;

import com.myschool.dto.SchoolClassDTO;
import com.myschool.dto.SchoolSubjectsDTO;

public interface SchoolSubjectsService {
	
	SchoolSubjectsDTO getAllAvailableSubjects();
	
	boolean createSubjects(SchoolSubjectsDTO schoolSubjectsDTO);

	boolean updateSubjects(SchoolSubjectsDTO schoolSubjectsDTO);

	void getAllTheSubjectList(SchoolClassDTO schoolClassDTO);
	
	Map<String,String> getAllSubjectsMap();

}
