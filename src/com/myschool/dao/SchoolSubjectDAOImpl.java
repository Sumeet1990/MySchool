package com.myschool.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.SchoolSubjects;
import com.myschool.dto.SchoolSubjectsDTO;
import com.myschool.util.CommonUtility;

public class SchoolSubjectDAOImpl  extends HibernateDaoSupport implements SchoolSubjectDAO {

	private static final String SUBJECT_STATUS_ACTIVE = "ACTIVE";

	@Override
	public boolean getAvailableSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
		
		List<SchoolSubjects> schoolSubjectsLst = getHibernateTemplate().find("from SchoolSubjects where subjectName in ("+schoolSubjectsDTO.toDatabaseSubjectNameString()+")");
		
		if(schoolSubjectsLst != null && schoolSubjectsLst.size() > 0)
		{
			schoolSubjectsDTO.setExistsSubjectList(new ArrayList<String>());
			schoolSubjectsDTO.setSubjectNameCodes(new HashMap<String,String>());
			for(SchoolSubjects schoolSubjects : schoolSubjectsLst)
			{
				schoolSubjectsDTO.getExistsSubjectList().add(schoolSubjects.getSubjectName());
				schoolSubjectsDTO.getSubjectNameCodes().put(schoolSubjects.getSubjectName(), String.valueOf(schoolSubjects.getSubjectCode()));
			}
			return true;
		}else
		{
			return false;
		}
	}

	@Override
	public void createSubjects(SchoolSubjectsDTO schoolSubjectsDTO) {
	
		for (String subject : schoolSubjectsDTO.getSubjectName()) {
		
			SchoolSubjects schoolSubject = new SchoolSubjects();
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
