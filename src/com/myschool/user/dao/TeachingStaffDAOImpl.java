package com.myschool.user.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.user.beans.TeachingStaff;
import com.myschool.user.dto.TeachingStaffDTO;


public class TeachingStaffDAOImpl extends HibernateDaoSupport implements TeachingStaffDAO{

	AnnotationSessionFactoryBean sessionUtill;

	public List<TeachingStaffDTO> getClassTeachers() {

		List<TeachingStaffDTO> teachingStaffDTOLst = new ArrayList<TeachingStaffDTO>();
		List<TeachingStaff> teachingStaffsLst =  getHibernateTemplate().find("from TeachingStaff where classTeacherFlag='YES'");
		if(teachingStaffsLst != null && teachingStaffsLst.size() > 0) {
			TeachingStaff teachingStaff = teachingStaffsLst.get(0);
			TeachingStaffDTO teachingStaffDTO = new TeachingStaffDTO();
			teachingStaffDTO.setTeachingStaffId(teachingStaff.getTeachingStaffId());
			teachingStaffDTO.setTeachingStaffGivenFullName(teachingStaff.getTeachingStaffGivenFullName());
			teachingStaffDTOLst.add(teachingStaffDTO);
			System.out.println("Verify credentials --------------");
		}
		return teachingStaffDTOLst;
	}

}
