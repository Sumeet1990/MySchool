package com.myschool.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.myschool.beans.SchoolClass;



public interface SchoolClassService {

	Map<Long, String> getClassTeachersList();

	List<SchoolClass> createSchoolClass( final String className,final String sectionName, final String classTeacher) throws ParseException;

	List<SchoolClass> getSchoolFrmClassOrSection(String schoolClassName,
			String section);
   

}

