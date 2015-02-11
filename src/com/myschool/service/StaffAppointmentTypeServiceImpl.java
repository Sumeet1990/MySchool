/**
 * 
 */
package com.myschool.service;

import java.util.HashMap;
import java.util.List;
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
	
	public StaffAppointmentTypeDTO createAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO) {
		Map<String, String> messageMap = new HashMap<String, String>();
		
		boolean subjectsExists = getStaffAppointmentTypeDAO().verifyAppointmentTypes(staffAppointmentTypeDTO);
		
		if(subjectsExists) {
			messageMap.put("FAILURE", "APPOINTMENT_TYPE_ALREADY_EXISTS");
		} else {
			getStaffAppointmentTypeDAO().createAppointmentType(staffAppointmentTypeDTO);

			/*StaffAppointmentTypeDTO staffAppointmentTypeDTOTemp = new StaffAppointmentTypeDTO();
			staffAppointmentTypeDTOTemp.setAppointmentType(staffAppointmentTypeDTO.getAppointmentType());
			getStaffAppointmentTypeDAO().getAvailableAppointmentTypes(staffAppointmentTypeDTOTemp);
			staffAppointmentTypeDTO.setAppointmentTypeCodes(staffAppointmentTypeDTOTemp.getAppointmentTypeCodes());
			return true;*/
			
			messageMap.put("SUCCESS", "APPOINTMENT_TYPE_CREATE_SUCCESS");
		}
		
		staffAppointmentTypeDTO.setMessageMap(messageMap);
		
		return staffAppointmentTypeDTO;
	}
	
	public List<StaffAppointmentTypeDTO> getAvailableAppointmentTypeList() {
		return getStaffAppointmentTypeDAO().getAvailableAppointmentTypeList();
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
