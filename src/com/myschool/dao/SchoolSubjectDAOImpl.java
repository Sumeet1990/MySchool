package com.myschool.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.SchoolSubjects;
import com.myschool.dto.SchoolSubjectsDTO;
import com.myschool.util.CommonConstants;
import com.myschool.util.CommonUtility;

public class SchoolSubjectDAOImpl  extends HibernateDaoSupport implements SchoolSubjectDAO {

	private static final String SUBJECT_STATUS_ACTIVE = "ACTIVE";
	
	/**
	 * 
	 */
	public List<SchoolSubjectsDTO> getAllAvailableSubjects() {
		List<SchoolSubjectsDTO> schoolSubjectsDTOList = new ArrayList<SchoolSubjectsDTO>();
		SchoolSubjectsDTO schoolSubjectsDTO;
		
		List<SchoolSubjects> allSchoolSubjectsLst = getHibernateTemplate().find("from SchoolSubjects");
		if(allSchoolSubjectsLst != null && allSchoolSubjectsLst.size() > 0) {
			for(SchoolSubjects schoolSubjects : allSchoolSubjectsLst) {
				schoolSubjectsDTO = new SchoolSubjectsDTO();
				CommonUtility.copyProperties(schoolSubjects, schoolSubjectsDTO, 
					"subjectName subjectName",
					"subjectStatus subjectStatus",
					"subjectInactiveReason subjectInactiveReason",
					"subjectInactiveDateTime subjectInactiveDateTime");
				
				schoolSubjectsDTOList.add(schoolSubjectsDTO);
			}
		}
		
		return schoolSubjectsDTOList;
	}
	
	/**
	 * 
	 */
	public List<SchoolSubjectsDTO> getAllActiveAvailableSubjects() {
		List<SchoolSubjectsDTO> schoolSubjectsDTOList = new ArrayList<SchoolSubjectsDTO>();
		SchoolSubjectsDTO schoolSubjectsDTO;
		
		List<SchoolSubjects> allSchoolSubjectsLst = getHibernateTemplate().find("from SchoolSubjects where subjectStatus = ?", SUBJECT_STATUS_ACTIVE);
		if(allSchoolSubjectsLst != null && allSchoolSubjectsLst.size() > 0) {
			for(SchoolSubjects schoolSubjects : allSchoolSubjectsLst) {
				schoolSubjectsDTO = new SchoolSubjectsDTO();
				CommonUtility.copyProperties(schoolSubjects, schoolSubjectsDTO, 
					"subjectCode subjectCode",
					"subjectName subjectName",
					"subjectStatus subjectStatus",
					"subjectInactiveReason subjectInactiveReason",
					"subjectInactiveDateTime subjectInactiveDateTime");
				
				schoolSubjectsDTOList.add(schoolSubjectsDTO);
			}
		}
		
		return schoolSubjectsDTOList;
	}
	
	/**
	 * 
	 * @param schoolSubjectsDTO
	 * @return
	 */
	public boolean getAvailableSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		if(StringUtils.isNotBlank(schoolSubjectsDTO.toDatabaseSubjectNameString())) {
			List<SchoolSubjects> schoolSubjectsLst = getHibernateTemplate().find("from SchoolSubjects where subjectName in ("+schoolSubjectsDTO.toDatabaseSubjectNameString()+")");
			if(schoolSubjectsLst != null && schoolSubjectsLst.size() > 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param schoolSubjectsDTO
	 * @return
	 */
	public String getSubjectsFromSubjectCodes(String subjectCodes) {
		StringBuilder subjectBuilder = new StringBuilder();
		if(StringUtils.isNotBlank(subjectCodes)) {
			List<SchoolSubjects> schoolSubjectsLst = getHibernateTemplate().find("from SchoolSubjects where subjectCode in ("+subjectCodes+")");

			if(schoolSubjectsLst != null && schoolSubjectsLst.size() > 0) {
				for(SchoolSubjects schoolSubjects : schoolSubjectsLst) {
					subjectBuilder.append(schoolSubjects.getSubjectName()).append(CommonConstants.COMMA_WITH_BACK_SPACE);
				}
			} 
		} 
		
		if(subjectBuilder.length() > 0) {
			subjectBuilder = new StringBuilder(subjectBuilder.substring(0, subjectBuilder.lastIndexOf(CommonConstants.COMMA)));
		}
		
		return subjectBuilder.toString();
	}
	
	@Override
	public void createSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		SchoolSubjects schoolSubject;
		for (String subject : schoolSubjectsDTO.getSchoolSubjectNames()) {
			 schoolSubject = new SchoolSubjects();
			schoolSubject.setSubjectName(subject.trim());
			schoolSubject.setSubjectStatus(SUBJECT_STATUS_ACTIVE);
			schoolSubject.setCreatedUserId(schoolSubjectsDTO.getUserId());
			schoolSubject.setCreatedDateTime(CommonUtility.dateToString(new Date()));
			getHibernateTemplate().save(schoolSubject);
		}
	}

	@Override
	public boolean updateSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		for (int j = 0; j < schoolSubjectsDTO.getSchoolSubjectCodes().length; j++) {	
			SchoolSubjects schoolSubjects = (SchoolSubjects) getHibernateTemplate().get(SchoolSubjects.class, 
					Integer.valueOf(schoolSubjectsDTO.getSchoolSubjectCodes()[j]));
			schoolSubjects.setSubjectName( schoolSubjectsDTO.getSchoolSubjectNames()[j]);
			getHibernateTemplate().save(schoolSubjects);
		}
		return true;
	}
}
