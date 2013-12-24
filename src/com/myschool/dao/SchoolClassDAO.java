package com.myschool.dao;

import java.text.ParseException;
import java.util.List;

import com.myschool.beans.SchoolClass;

public interface SchoolClassDAO {

	List<SchoolClass> getSchoolClass( final String schoolClassName, final String sectionName);

	void createSchoolClass(String className, String sectionName,
			String classTeacherId) throws ParseException; 
}
