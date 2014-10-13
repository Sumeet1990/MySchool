package com.myschool.dao;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.SchoolClass;
import com.myschool.beans.StaffAddress;
import com.myschool.beans.StaffDetails;
import com.myschool.dto.StaffDTO;
import com.myschool.util.CommonUtility;


public class StaffDAOImpl extends HibernateDaoSupport implements StaffDAO {	
	private static Logger log = Logger.getLogger(StaffDAOImpl.class);


	public List<StaffDTO> getClassTeachers() {
		// TODO Auto-generated method stub
		return null;
	}


	public boolean checkStaffNameAlreadyExists(String staffGivenFullName,
			String staffSurname) {
		List<StaffDetails> staffDetails = getHibernateTemplate().find("from StaffDetails where staffGivenFullName = ? and staffSurname = ? ",new String[]{staffGivenFullName,staffSurname});
		
		if (staffDetails != null && staffDetails.size() > 0) {
			return true;
		}
		return false;
	}


	public boolean addNewStaffMember(StaffDTO staffDTO) {
		StaffDetails staffDetails = new StaffDetails();
		StaffAddress staffAddress = new StaffAddress();
		
		CommonUtility.copyProperties(staffDTO, staffAddress, "addressLine1 addressLine1",
				"staffTownDistrict townDistrict",
				"staffDistrictCity districtCity",
				"staffAreaPin pincode",
				"staffState state",
				"staffCountry country",
				"staffPCNumber personalContactNumber",
				"staffECNumber emergencyContactNumber",
				"staffEmailId emailId",
				"createdUserId createdUserId");
		staffDetails.setStaffAddress(staffAddress);
		CommonUtility.copyProperties(staffDTO, staffDetails, "staffTitle staffTitle",
				"staffGivenFullName staffGivenFullName",
				"staffSurname staffSurname",
				"staffDob staffDob",
				"staffGender staffGender",
				"staffQualification staffQualification",
				"staffDesignation staffDesignation",
				"teacherStaffFlag teacherStaffFlag",
				"classTeacherFlag classTeacherFlag",
				"subjectCodesList subjectCodesList",
				"appointmentTypeId appointmentTypeId",
				"staffAddressId staffAddressId",
				"photo photo",
				"staffStatus staffStatus",
				"staffInactiveReason staffInactiveReason",
				"createdUserId",
				"modifiedUserId");
		staffDetails.setCreatedDateTime(CommonUtility.dateToString(new Date()));
		getHibernateTemplate().save(staffDetails);
		return true;
	}
}
