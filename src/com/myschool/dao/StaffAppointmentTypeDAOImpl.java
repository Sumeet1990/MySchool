package com.myschool.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.StaffAppointment;
import com.myschool.dto.StaffAppointmentTypeDTO;
import com.myschool.util.CommonUtility;


public class StaffAppointmentTypeDAOImpl  extends HibernateDaoSupport implements StaffAppointmentTypeDAO {
	
	/**
	 * 
	 */
	public Map<Integer, String> getApoinmentTypesFromDB() {
		Map<Integer, String> staffAppMap = new HashMap<Integer, String>();
		List<StaffAppointment> staffAppointment = getHibernateTemplate().find("from StaffAppointment");
		if(staffAppointment !=null){
			for(StaffAppointment appointment : staffAppointment){
				staffAppMap.put(appointment.getAppointmentTypeId(), appointment.getAppointmentType());
			}
		}
		
		return staffAppMap;
	}
	
	/**
	 * 
	 */
	public StaffAppointmentTypeDTO getAllAvailableAppointmentTypes() {
		StaffAppointmentTypeDTO staffAppointmentTypeDTO = new StaffAppointmentTypeDTO();
		List<StaffAppointment> allSchoolStaffAppointmentsList = getHibernateTemplate().find("from StaffAppointment");
		if(allSchoolStaffAppointmentsList != null && allSchoolStaffAppointmentsList.size() > 0) {
			staffAppointmentTypeDTO.setExistsAppointmentTypeList(new ArrayList<String>());
			staffAppointmentTypeDTO.setAppointmentTypeNameCodes(new HashMap<String,String>());
			for(StaffAppointment staffAppointment : allSchoolStaffAppointmentsList) {
				staffAppointmentTypeDTO.getExistsAppointmentTypeList().add(staffAppointment.getAppointmentType());
				staffAppointmentTypeDTO.getAppointmentTypeNameCodes().put(staffAppointment.getAppointmentType(), String.valueOf(staffAppointment.getAppointmentTypeId()));
			}
		}
		
		return staffAppointmentTypeDTO;
	}
	
	public boolean getAvailableAppointmentTypes(StaffAppointmentTypeDTO staffAppointmentTypeDTO) {
		if(StringUtils.isNotBlank(staffAppointmentTypeDTO.toDatabaseSubjectNameString())) {
			List<StaffAppointment> allSchoolStaffAppointmentsList = getHibernateTemplate().find("from StaffAppointment where appointmentType in ("+staffAppointmentTypeDTO.toDatabaseSubjectNameString()+")");
			if(allSchoolStaffAppointmentsList != null && allSchoolStaffAppointmentsList.size() > 0) {
				staffAppointmentTypeDTO.setExistsAppointmentTypeList(new ArrayList<String>());
				staffAppointmentTypeDTO.setAppointmentTypeNameCodes(new HashMap<String,String>());
				for(StaffAppointment staffAppointment : allSchoolStaffAppointmentsList) {
					staffAppointmentTypeDTO.getExistsAppointmentTypeList().add(staffAppointment.getAppointmentType());
					staffAppointmentTypeDTO.getAppointmentTypeNameCodes().put(staffAppointment.getAppointmentType(), String.valueOf(staffAppointment.getAppointmentTypeId()));
				}
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void createAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO) {
		StaffAppointment staffAppointment;
		for (String appointmentType : staffAppointmentTypeDTO.getAppointmentType()) {
			staffAppointment = new StaffAppointment();
			staffAppointment.setAppointmentType(appointmentType.trim());
			staffAppointment.setCreatedUserId(staffAppointmentTypeDTO.getUserId());
			staffAppointment.setCreatedDateTime(CommonUtility.dateToString(new Date()));
			getHibernateTemplate().save(staffAppointment);
		}
	}

	public boolean updateAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO) {
		for (int j = 0; j < staffAppointmentTypeDTO.getAppointmentTypeCodes().length; j++) {	
			StaffAppointment staffAppointment = (StaffAppointment) getHibernateTemplate().get(StaffAppointment.class, Integer.valueOf(staffAppointmentTypeDTO.getAppointmentTypeCodes()[j]));
			staffAppointment.setAppointmentType( staffAppointmentTypeDTO.getAppointmentType()[j]);
			getHibernateTemplate().save(staffAppointment);
		}
		return true;
	}
	
}
