package com.myschool.dao;

import java.util.Map;

import com.myschool.dto.SchoolSubjectsDTO;
import com.myschool.dto.StaffAppointmentTypeDTO;

public interface StaffAppointmentTypeDAO {
	
	Map<Integer, String> getApoinmentTypesFromDB();
	
	StaffAppointmentTypeDTO getAllAvailableAppointmentTypes();
	
	boolean getAvailableAppointmentTypes(StaffAppointmentTypeDTO staffAppointmentTypeDTO);
	
	void createAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO);

	boolean updateAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO);
}
