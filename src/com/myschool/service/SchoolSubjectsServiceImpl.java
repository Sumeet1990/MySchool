/**
 * 
 */
package com.myschool.service;

import java.util.List;
import java.util.Map;

import com.myschool.dao.SchoolSubjectDAO;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.dto.SchoolSubjectsDTO;

public class SchoolSubjectsServiceImpl implements SchoolSubjectsService {
	
	private SchoolSubjectDAO schoolSubjectDAO;
	
	/**
	 * 
	 */
	public List<SchoolSubjectsDTO> getAllAvailableSubjects() {
		 return getSchoolSubjectDAO().getAllAvailableSubjects();
	}
	
	/**
	 * 
	 */
	public List<SchoolSubjectsDTO> getAllActiveAvailableSubjects() {
		 return getSchoolSubjectDAO().getAllActiveAvailableSubjects();
	}
	
	/**
	 * 
	 */
	public boolean createSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		boolean subjectsExists = getSchoolSubjectDAO().getAvailableSubjects(schoolSubjectsDTO);
		if(subjectsExists) {
			return false;
		} else {
			 getSchoolSubjectDAO().createSubjects(schoolSubjectsDTO);
			 SchoolSubjectsDTO schoolSubjectsDTOTemp = new SchoolSubjectsDTO();
			 schoolSubjectsDTOTemp.setSchoolSubjectNames(schoolSubjectsDTO.getSchoolSubjectNames());
			 getSchoolSubjectDAO().getAvailableSubjects(schoolSubjectsDTOTemp);
			 schoolSubjectsDTO.setSubjectNameCodes(schoolSubjectsDTOTemp.getSubjectNameCodes());
			 return true;
		}
	}
	
	/**
	 * 
	 */
	public boolean updateSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		boolean subjectsExists = getSchoolSubjectDAO().getAvailableSubjects(schoolSubjectsDTO);
		if(subjectsExists) {
			return false;
		} else	{
			return true;
		}
	}
	
	public SchoolSubjectDAO getSchoolSubjectDAO() {
		return schoolSubjectDAO;
	}

	public void setSchoolSubjectDAO(SchoolSubjectDAO schoolSubjectDAO) {
		this.schoolSubjectDAO = schoolSubjectDAO;
	}
}
