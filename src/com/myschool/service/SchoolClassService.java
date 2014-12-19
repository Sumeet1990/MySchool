package com.myschool.service;

import java.util.List;
import java.util.Map;

import com.myschool.dto.SchoolClassDTO;

public interface SchoolClassService {

	SchoolClassDTO createClass(SchoolClassDTO schoolClassDTO, String userId);

	void setSelectedSubjectCodes(SchoolClassDTO schoolClassDTO, String selectedSubject);

	Map<String, String> getAllClassTeachers();

	List<SchoolClassDTO> getAllSchoolClasses();
}
