/**
 * 
 */
package com.myschool.service;

import com.myschool.dao.SchoolSubjectDAO;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.dto.SchoolSubjectsDTO;

public class SchoolSubjectsServiceImpl implements SchoolSubjectsService {
	
	private SchoolSubjectDAO schoolSubjectDAO;
	
	public SchoolSubjectsDTO getAllAvailableSubjects() {
		 return getSchoolSubjectDAO().getAllAvailableSubjects();
	}
	
	public boolean createSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		boolean subjectsExists = getSchoolSubjectDAO().getAvailableSubjects(schoolSubjectsDTO);
		if(subjectsExists) {
			return false;
		} else {
			 getSchoolSubjectDAO().createSubjects(schoolSubjectsDTO);
			 SchoolSubjectsDTO schoolSubjectsDTOTemp = new SchoolSubjectsDTO();
			 schoolSubjectsDTOTemp.setSubjectName(schoolSubjectsDTO.getSubjectName());
			 getSchoolSubjectDAO().getAvailableSubjects(schoolSubjectsDTOTemp);
			 schoolSubjectsDTO.setSubjectNameCodes(schoolSubjectsDTOTemp.getSubjectNameCodes());
			 return true;
		}
	}
	
	public SchoolSubjectDAO getSchoolSubjectDAO() {
		return schoolSubjectDAO;
	}

	public void setSchoolSubjectDAO(SchoolSubjectDAO schoolSubjectDAO) {
		this.schoolSubjectDAO = schoolSubjectDAO;
	}
	@Override
	public boolean updateSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		boolean subjectsExists = getSchoolSubjectDAO().getAvailableSubjects(schoolSubjectsDTO);
		if(subjectsExists)
		{
			return false;
		}else
		{
		boolean status = getSchoolSubjectDAO().updateSubjects(schoolSubjectsDTO);
			return true;
		}
	}

	@Override
	public void getAllTheSubjectList(SchoolClassDTO schoolClassDTO) {
		SchoolSubjectsDTO dto = getAllAvailableSubjects();
		schoolClassDTO.setAllSubjectMap(dto.getSubjectNameCodes());
		schoolClassDTO.setAllSubjectList(dto.getExistsSubjectList());
	}
}
