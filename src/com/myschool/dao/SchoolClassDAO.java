package com.myschool.dao;

import com.myschool.dto.SchoolClassDTO;

public interface SchoolClassDAO {

	void verifyClassExists(SchoolClassDTO schoolClassDTO);

	void createSchoolClass(SchoolClassDTO schoolClassDTO, String userId);

}
