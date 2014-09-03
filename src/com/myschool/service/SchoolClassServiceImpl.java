package com.myschool.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.myschool.beans.SchoolClass;
import com.myschool.dao.SchoolClassDAO;
import com.myschool.dao.SchoolSubjectDAO;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.util.CommonConstants;

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
			try{
				getSchoolClassDAO().createSchoolClass(schoolClassDTO,userId);
				schoolClassDTO.setErrorMessage(CommonConstants.CLASS_SUCCESSFULLY_CREATED);
			}catch(Exception e){
				schoolClassDTO.setErrorMessage(CommonConstants.CLASS_ERROR_OCCURED);
			}
		}else{
			schoolClassDTO.setErrorMessage(CommonConstants.CLASS_ALREADY_EXISTS);
		}
	}
	
	@Override
	public Map<Integer,String> getAllClasses() {
		Map<Integer,String> schoolClassMap = new HashMap<>();
		List<SchoolClass> classes = getSchoolClassDAO().getAllClassesList();
		if(classes != null){
			for(SchoolClass classObj : classes){
				schoolClassMap.put(classObj.getSchoolClassId(), classObj.getSchoolClassName());
			}
		}
		return schoolClassMap;

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
