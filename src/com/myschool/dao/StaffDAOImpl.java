package com.myschool.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.ClassSection;
import com.myschool.beans.TeachingStaff;
import com.myschool.dto.TeachingStaffDTO;


public class StaffDAOImpl extends HibernateDaoSupport implements StaffDAO{

	AnnotationSessionFactoryBean sessionUtill;

	public List<TeachingStaffDTO> getClassTeachers() {

		List<TeachingStaffDTO> teachingStaffDTOLst = new ArrayList<TeachingStaffDTO>();
		List<TeachingStaff> teachingStaffsLst =  getHibernateTemplate().find("from TeachingStaff where classTeacherFlag = 'YES' and teachingStaffStatus='ACTIVE'");
		
		if(teachingStaffsLst != null && teachingStaffsLst.size() > 0) {
			for (TeachingStaff teachingStaffObj : teachingStaffsLst ) {
				ClassSection schoolClass = 	teachingStaffObj.getSchoolClass();
				if(schoolClass == null || (schoolClass != null && schoolClass.getTeachingStaffId() == null)) {
					TeachingStaffDTO teachingStaffDTO = new TeachingStaffDTO();
					teachingStaffDTO.setTeachingStaffId(teachingStaffObj.getTeachingStaffId());
					teachingStaffDTO.setTeachingStaffGivenFullName(teachingStaffObj.getTeachingStaffGivenFullName());
					teachingStaffDTOLst.add(teachingStaffDTO);
				}
			}
		}
		return teachingStaffDTOLst;
	}

}
