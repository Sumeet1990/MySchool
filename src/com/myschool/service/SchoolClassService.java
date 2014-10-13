package com.myschool.service;

import java.util.Map;

import com.myschool.dto.SchoolClassDTO;

public interface SchoolClassService {

	void createClass(SchoolClassDTO schoolClassDTO, String userId);

	void setSelectedSubjectCodes(SchoolClassDTO schoolClassDTO, String selectedSubject);

	Map<Integer, String> getAllClasses();

	Map<String, String> getAllClassTeachers();
}
