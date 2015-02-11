package com.myschool.dao;

import java.util.List;
import java.util.Map;

import com.myschool.dto.SchoolSubjectsDTO;
import com.myschool.dto.StaffAppointmentTypeDTO;

public interface StaffAppointmentTypeDAO {
	
	Map<Integer, String> getApoinmentTypesFromDB();
	
	boolean verifyAppointmentTypes(StaffAppointmentTypeDTO staffAppointmentTypeDTO);
	
	StaffAppointmentTypeDTO getAllAvailableAppointmentTypes();
	
	boolean getAvailableAppointmentTypes(StaffAppointmentTypeDTO staffAppointmentTypeDTO);
	
	void createAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO);
	
	List<StaffAppointmentTypeDTO> getAvailableAppointmentTypeList();
	
	boolean updateAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO);
}
