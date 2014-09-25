/**
 * 
 */
package com.myschool.service;

import java.util.Map;

import com.myschool.dto.StaffAppointmentTypeDTO;

public interface StaffAppointmentTypeService {
	Map<Integer,String> getApoinmentTypes();
	
	StaffAppointmentTypeDTO getAllAvailableAppointmentTypes();
	
	boolean createAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO);

	boolean updateAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO);
}
