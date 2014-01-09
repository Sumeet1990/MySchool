package com.myschool.dao;

import java.text.ParseException;
import java.util.List;

import com.myschool.beans.ClassSection;

public interface ClassSectionDAO {

	List<ClassSection> ClassSection( final String schoolClassName, final String sectionName);

	void createSchoolClass(final String className, final String sectionName,
			final String classTeacherId) throws ParseException;

	List<ClassSection> getClassSectionFromClassName(final String schoolClassName); 
}
