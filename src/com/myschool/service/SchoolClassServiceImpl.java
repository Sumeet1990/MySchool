package com.myschool.service;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.myschool.dao.SchoolClassDAO;
import com.myschool.dao.SchoolSubjectDAO;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.dto.SchoolSubjectsDTO;
import com.myschool.util.CommonConstants;

public class SchoolClassServiceImpl implements SchoolClassService {
	
	private SchoolClassDAO schoolClassDAO;
	private SchoolSubjectDAO schoolSubjectDAO;
	
	public List<SchoolClassDTO> getAllSchoolClasses() {
		List<SchoolClassDTO> schoolClassDTOList = schoolClassDAO.getAllSchoolClasses();
		
		return schoolClassDTOList;
	}
	
	/**
	 * 
	 */
	public SchoolClassDTO createClass(List<SchoolSubjectsDTO> schoolSubjectsDTOList, List<String> selectedSubjectList, 
			SchoolClassDTO schoolClassDTO, String userId) {
		boolean classAlreadyExists = getSchoolClassDAO().verifyClassExists(schoolClassDTO);

		if(!classAlreadyExists) {
			StringBuilder sculoolSubjectodes = new StringBuilder();
			for(SchoolSubjectsDTO schoolSubjectsDTO : schoolSubjectsDTOList) {
				for(String schoolSubject : selectedSubjectList) {
					if(StringUtils.equalsIgnoreCase(schoolSubject, schoolSubjectsDTO.getSubjectName())) {
						sculoolSubjectodes.append(schoolSubjectsDTO.getSubjectCode()).append(CommonConstants.COMMA);
					}
				}
			}
			
			if(sculoolSubjectodes.length() > 0) {
				schoolClassDTO.setSelectedSubjectCodes(sculoolSubjectodes.toString());
			}
			
			getSchoolClassDAO().createSchoolClass(schoolClassDTO, userId);
			schoolClassDTO.setErrorMessage(CommonConstants.CLASS_SUCCESSFULLY_CREATED);
		} else {
			schoolClassDTO.setErrorMessage(CommonConstants.CLASS_ALREADY_EXISTS);
		}
		
		return schoolClassDTO;
	}

	/**
	 * 
	 */
	public void setSelectedSubjectCodes(SchoolClassDTO schoolClassDTO,
			String selectedSubject) {
		String[] selectedSubjects = selectedSubject.split(CommonConstants.COMMA); 
		String subjectCodes = StringUtils.EMPTY;
		for(String subject : selectedSubjects) {
			subjectCodes = subjectCodes + schoolClassDTO.getAllSubjectMap().get(subject.replace(" ", ""))+CommonConstants.COMMA;
		}
		if(subjectCodes.length()>0){
			schoolClassDTO.setSelectedSubjectCodes(subjectCodes.substring(0,subjectCodes.length()-1));
		}else{
			schoolClassDTO.setSelectedSubjectCodes(subjectCodes);
		}
	}

	/**
	 * 
	 */
	public Map<String, String> getAllClassTeachers() {
		return getSchoolClassDAO().getClassTeacherMap();
	} 
	
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
