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
import com.myschool.util.CommonUtility;

public class SchoolSubjectDAOImpl  extends HibernateDaoSupport implements SchoolSubjectDAO {

	private static final String SUBJECT_STATUS_ACTIVE = "ACTIVE";
	
	public SchoolSubjectsDTO getAllAvailableSubjects() {
		SchoolSubjectsDTO schoolSubjectsDTO = new SchoolSubjectsDTO();
		List<SchoolSubjects> allSchoolSubjectsLst = getHibernateTemplate().find("from SchoolSubjects where subjectStatus=?", SUBJECT_STATUS_ACTIVE);
		if(allSchoolSubjectsLst != null && allSchoolSubjectsLst.size() > 0) {
			schoolSubjectsDTO.setExistsSubjectList(new ArrayList<String>());
			schoolSubjectsDTO.setSubjectNameCodes(new HashMap<String,String>());
			for(SchoolSubjects schoolSubjects : allSchoolSubjectsLst) {
				schoolSubjectsDTO.getExistsSubjectList().add(schoolSubjects.getSubjectName());
				schoolSubjectsDTO.getSubjectNameCodes().put(schoolSubjects.getSubjectName(), String.valueOf(schoolSubjects.getSubjectCode()));
			}
		}
		
		return schoolSubjectsDTO;
	}
	
	public Map<String,String> getAllAvailableSubjectsMap() {
		Map<String,String> subjetMap = new HashMap<>();
		List<SchoolSubjects> allSchoolSubjectsLst = getHibernateTemplate().find("from SchoolSubjects where subjectStatus=?", SUBJECT_STATUS_ACTIVE);
		if(allSchoolSubjectsLst != null && allSchoolSubjectsLst.size() > 0) {
			for(SchoolSubjects schoolSubjects : allSchoolSubjectsLst) {
				subjetMap.put(String.valueOf(schoolSubjects.getSubjectCode()),schoolSubjects.getSubjectName());
			}
		}
		
		return subjetMap;
	}
	
	public boolean getAvailableSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		if(StringUtils.isNotBlank(schoolSubjectsDTO.toDatabaseSubjectNameString())) {
			List<SchoolSubjects> schoolSubjectsLst = getHibernateTemplate().find("from SchoolSubjects where subjectName in ("+schoolSubjectsDTO.toDatabaseSubjectNameString()+")");
			if(schoolSubjectsLst != null && schoolSubjectsLst.size() > 0) {
				schoolSubjectsDTO.setExistsSubjectList(new ArrayList<String>());
				schoolSubjectsDTO.setSubjectNameCodes(new HashMap<String,String>());
				for(SchoolSubjects schoolSubjects : schoolSubjectsLst) {
					schoolSubjectsDTO.getExistsSubjectList().add(schoolSubjects.getSubjectName());
					schoolSubjectsDTO.getSubjectNameCodes().put(schoolSubjects.getSubjectName(), String.valueOf(schoolSubjects.getSubjectCode()));
				}
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public void createSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		SchoolSubjects schoolSubject;
		for (String subject : schoolSubjectsDTO.getSubjectName()) {
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
		for (int j = 0; j < schoolSubjectsDTO.getSubjectCodes().length; j++) {	
			SchoolSubjects schoolSubjects = (SchoolSubjects) getHibernateTemplate().get(SchoolSubjects.class, Integer.valueOf(schoolSubjectsDTO.getSubjectCodes()[j]));
			schoolSubjects.setSubjectName( schoolSubjectsDTO.getSubjectName()[j]);
			getHibernateTemplate().save(schoolSubjects);
		}
		return true;
	}
}
