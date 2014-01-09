package com.myschool.service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

import com.myschool.beans.ClassSection;



public interface ClassSectionService {

	Map<Long, String> getClassTeachersList();

	List<ClassSection> createClassSection( final String className,final String sectionName, final String classTeacher) throws ParseException;

	List<ClassSection> getSchoolFrmClassOrSection(String schoolClassName,
			String section);
   

}

