package com.myschool.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.myschool.dao.ClassSectionDAO;
import com.myschool.dao.StaffDAO;
import com.myschool.dto.ClassSectionDTO;

public class ClassSectionServiceImpl implements ClassSectionService { 
	private static Logger log = Logger.getLogger(ClassSectionServiceImpl.class);
	
	private StaffDAO staffDAO;
	private ClassSectionDAO classSectionDAO;

	/**
	 * 
	 */
	public ClassSectionDTO createClassSection(ClassSectionDTO classSectionDTO) {
		Map<String, String> messageMap = new HashMap<String, String>();
		boolean sectionExists = getClassSectionDAO().verifyClassSectionExists(classSectionDTO);
		
		if(sectionExists) {
			messageMap.put("FAILURE", "SECTION_ALREADY_EXISTS");
		} else {
			getClassSectionDAO().createClassSection(classSectionDTO);

			messageMap.put("SUCCESS", "SECTION_CREATE_SUCCESS");
		}
		
		classSectionDTO.setMessageMap(messageMap);
		
		return classSectionDTO;
	}
	
	public List<ClassSectionDTO> getAllClassSections() {
		return classSectionDAO.getAllClassSections();
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
