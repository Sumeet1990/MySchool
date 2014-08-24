package com.myschool.service;

import com.myschool.dto.SchoolClassDTO;

public interface SchoolClassService {

	void createClass(SchoolClassDTO schoolClassDTO, String userId);

	void setSelectedSubjectCodes(SchoolClassDTO schoolClassDTO,
			String selectedSubject);

}
