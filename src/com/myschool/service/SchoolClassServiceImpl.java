package com.myschool.service;

import java.util.HashMap;
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
	
	/**
	 * 
	 * @return
	 */
	public List<SchoolClassDTO> getAllSchoolClasses() {
		List<SchoolClassDTO> schoolClassDTOList = schoolClassDAO.getAllSchoolClasses();
		
		return schoolClassDTOList;
	}
	
	/**
	 * 
	 */
	public List<SchoolClassDTO> getAllActiveSchoolClasses() {
		List<SchoolClassDTO> schoolClassDTOList = schoolClassDAO.getAllActiveSchoolClasses();
		
		return schoolClassDTOList;
	}
	
	/**
	 * 
	 */
	public SchoolClassDTO createSchoolClass(List<SchoolSubjectsDTO> schoolSubjectsDTOList, String selectedSubject, 
			SchoolClassDTO schoolClassDTO, String userId) {
		Map<String, String> messageMap = new HashMap<String, String>();
		boolean classAlreadyExists = getSchoolClassDAO().verifyClassExists(schoolClassDTO);

		if(!classAlreadyExists) {
			StringBuilder sculoolSubjectodes = new StringBuilder();
			String[] selectdSubjectsList = selectedSubject.split(CommonConstants.COMMA_WITH_BACK_SPACE);
			for(SchoolSubjectsDTO schoolSubjectsDTO : schoolSubjectsDTOList) {
				for(int i=0; i<selectdSubjectsList.length; i++) {
					if(StringUtils.equalsIgnoreCase(selectdSubjectsList[i], schoolSubjectsDTO.getSubjectName())) {
						sculoolSubjectodes.append(schoolSubjectsDTO.getSubjectCode()).append(CommonConstants.COMMA);
					}
				}
			}
			
			if(sculoolSubjectodes.length() > 0) {
				sculoolSubjectodes = new StringBuilder(sculoolSubjectodes.substring(0, sculoolSubjectodes.lastIndexOf(CommonConstants.COMMA)));
				
				schoolClassDTO.setSelectedSubjectCodes(sculoolSubjectodes.toString());
			}
			
			getSchoolClassDAO().createSchoolClass(schoolClassDTO, userId);
			
			messageMap.put("SUCCESS", "CLASS_CREATE_SUCCESS");
		} else {
			messageMap.put("FAILURE", "CLASS_ALREADY_EXISTS");
		}
		
		schoolClassDTO.setMessageMap(messageMap);
		
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
