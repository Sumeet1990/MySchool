package com.myschool.service;

import com.myschool.dao.SchoolClassDAO;
import com.myschool.dao.SchoolSubjectDAO;
import com.myschool.dto.SchoolClassDTO;

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

	@Override
	public void createClass(SchoolClassDTO schoolClassDTO, String userId) {

		schoolClassDTO.setClassOperationStatus(true);
		getSchoolClassDAO().verifyClassExists(schoolClassDTO);

		if(schoolClassDTO.isClassOperationStatus())
		{
			getSchoolClassDAO().createSchoolClass(schoolClassDTO,userId);
		}
	}

	@Override
	public void setSelectedSubjectCodes(SchoolClassDTO schoolClassDTO,
			String selectedSubject) {
		String[] selectedSubjects = selectedSubject.split(","); 
		String subjectCodes ="";
		for(String subject : selectedSubjects){
			subjectCodes = subjectCodes + schoolClassDTO.getAllSubjectMap().get(subject.replace(" ", ""))+",";
		}
		if(subjectCodes.length()>0){
			schoolClassDTO.setSelectedSubjectCodes(subjectCodes.substring(0,subjectCodes.length()-1));
		}else{
			schoolClassDTO.setSelectedSubjectCodes(subjectCodes);
		}
	} 

}
