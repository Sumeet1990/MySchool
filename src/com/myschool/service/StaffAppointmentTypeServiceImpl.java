/**
 * 
 */
package com.myschool.service;

import java.util.Map;

import com.myschool.dao.SchoolSubjectDAO;
import com.myschool.dao.StaffAppointmentTypeDAO;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.dto.SchoolSubjectsDTO;
import com.myschool.dto.StaffAppointmentTypeDTO;


public class StaffAppointmentTypeServiceImpl implements StaffAppointmentTypeService {

	private StaffAppointmentTypeDAO staffAppointmentTypeDAO;
	
	@Override
	public Map<Integer, String> getApoinmentTypes() {
		return getStaffAppointmentTypeDAO().getApoinmentTypesFromDB();
	}
	
	public StaffAppointmentTypeDTO getAllAvailableAppointmentTypes() {
		 return getStaffAppointmentTypeDAO().getAllAvailableAppointmentTypes();
	}
	
	public boolean createAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO) {
		boolean subjectsExists = getStaffAppointmentTypeDAO().getAvailableAppointmentTypes(staffAppointmentTypeDTO);
		if(subjectsExists) {
			return false;
		} else {
			getStaffAppointmentTypeDAO().createAppointmentType(staffAppointmentTypeDTO);
			StaffAppointmentTypeDTO staffAppointmentTypeDTOTemp = new StaffAppointmentTypeDTO();
			staffAppointmentTypeDTOTemp.setAppointmentType(staffAppointmentTypeDTO.getAppointmentType());
			getStaffAppointmentTypeDAO().getAvailableAppointmentTypes(staffAppointmentTypeDTOTemp);
			staffAppointmentTypeDTO.setAppointmentTypeCodes(staffAppointmentTypeDTOTemp.getAppointmentTypeCodes());
			return true;
		}
	}
	
	public StaffAppointmentTypeDAO getStaffAppointmentTypeDAO() {
		return staffAppointmentTypeDAO;
	}

	public void setStaffAppointmentTypeDAO(StaffAppointmentTypeDAO staffAppointmentTypeDAO) {
		this.staffAppointmentTypeDAO = staffAppointmentTypeDAO;
	}

	@Override
	public boolean updateAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO) {
		boolean subjectsExists = getStaffAppointmentTypeDAO().getAvailableAppointmentTypes(staffAppointmentTypeDTO);
		if(subjectsExists) {
			return false;
		} else {
			boolean status = getStaffAppointmentTypeDAO().updateAppointmentType(staffAppointmentTypeDTO);
			return true;
		}
	}
}
