package com.myschool.service;

import java.util.List;
import java.util.Map;

import com.myschool.dto.SchoolClassDTO;
import com.myschool.dto.SchoolSubjectsDTO;

public interface SchoolClassService {

	SchoolClassDTO createClass(List<SchoolSubjectsDTO> schoolSubjectsDTOList, List<String> selectedSubjectList, 
			SchoolClassDTO schoolClassDTO, String userId);

	void setSelectedSubjectCodes(SchoolClassDTO schoolClassDTO, String selectedSubject);

	Map<String, String> getAllClassTeachers();

	List<SchoolClassDTO> getAllSchoolClasses();
}
