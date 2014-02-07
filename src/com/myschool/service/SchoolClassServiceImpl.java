package com.myschool.service;

import com.myschool.dao.SchoolClassDAO;
import com.myschool.dao.SchoolSubjectDAO;

public class SchoolClassServiceImpl implements SchoolClassService{
	
	private SchoolClassDAO schoolClassDAO;
	private SchoolSubjectDAO schoolSubjectDAO;

	public SchoolClassDAO getSchoolClassDAO() {
		return schoolClassDAO;
	}

	public void setSchoolClassDAO(SchoolClassDAO schoolClassDAO) {
		this.schoolClassDAO = schoolClassDAO;
	}

	public SchoolSubjectDAO getSchoolSubjectDAO() {
		return schoolSubjectDAO;
	}

	public void setSchoolSubjectDAO(SchoolSubjectDAO schoolSubjectDAO) {
		this.schoolSubjectDAO = schoolSubjectDAO;
	} 

}
