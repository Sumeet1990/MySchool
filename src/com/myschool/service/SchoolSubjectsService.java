/**
 * 
 */
package com.myschool.service;

import java.util.List;
import java.util.Map;

import com.myschool.dto.SchoolClassDTO;
import com.myschool.dto.SchoolSubjectsDTO;

public interface SchoolSubjectsService {
	List<SchoolSubjectsDTO> getAllAvailableSubjects();
	
	List<SchoolSubjectsDTO> getAllActiveAvailableSubjects();
	
	boolean createSubjects(SchoolSubjectsDTO schoolSubjectsDTO);

	boolean updateSubjects(SchoolSubjectsDTO schoolSubjectsDTO);
}
