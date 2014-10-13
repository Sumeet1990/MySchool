package com.myschool.service;

import org.apache.log4j.Logger;

import com.myschool.dao.ClassSectionDAO;
import com.myschool.dao.StaffDAO;
import com.myschool.dto.ClassSectionDTO;

public class ClassSectionServiceImpl implements ClassSectionService { 
	private static Logger log = Logger.getLogger(ClassSectionServiceImpl.class);
	private StaffDAO staffDAO;
	private ClassSectionDAO classSectionDAO;


	public boolean createClassSection( ClassSectionDTO classSectionDTO) {
		return getClassSectionDAO().createClassSection(classSectionDTO);		
	}
	public StaffDAO getStaffDAO() {
		return staffDAO;
	}
	public void setStaffDAO(StaffDAO staffDAO) {
		this.staffDAO = staffDAO;
	}
	public ClassSectionDAO getClassSectionDAO() {
		return classSectionDAO;
	}
	public void setClassSectionDAO(ClassSectionDAO classSectionDAO) {
		this.classSectionDAO = classSectionDAO;
	}	
	
}
