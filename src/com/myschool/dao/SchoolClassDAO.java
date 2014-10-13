package com.myschool.dao;

import java.util.List;
import java.util.Map;

import com.myschool.beans.SchoolClass;
import com.myschool.dto.SchoolClassDTO;

public interface SchoolClassDAO {

	void verifyClassExists(SchoolClassDTO schoolClassDTO);

	void createSchoolClass(SchoolClassDTO schoolClassDTO, String userId);

	List<SchoolClass> getAllClassesList();

	Map<String, String> getClassTeacherMap();
}
