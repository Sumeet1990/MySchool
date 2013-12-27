package com.myschool.dao;

import java.text.ParseException;
import java.util.List;

import com.myschool.beans.SchoolClass;

public interface SchoolClassDAO {

	List<SchoolClass> getSchoolClass( final String schoolClassName, final String sectionName);

	void createSchoolClass(final String className, final String sectionName,
			final String classTeacherId) throws ParseException;

	List<SchoolClass> getSchoolClassFromClassName(final String schoolClassName); 
}
