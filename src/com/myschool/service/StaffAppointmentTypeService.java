/**
 * 
 */
package com.myschool.service;

import java.util.List;
import java.util.Map;

import com.myschool.dto.StaffAppointmentTypeDTO;

public interface StaffAppointmentTypeService {
	Map<Integer,String> getApoinmentTypes();
	
	StaffAppointmentTypeDTO getAllAvailableAppointmentTypes();
	
	StaffAppointmentTypeDTO createAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO);

	List<StaffAppointmentTypeDTO> getAvailableAppointmentTypeList();
	
	boolean updateAppointmentType(StaffAppointmentTypeDTO staffAppointmentTypeDTO);
}
