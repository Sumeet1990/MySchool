/**
 * 
 */
package com.myschool.service;

import java.util.Map;

import com.myschool.dao.StaffAppointmentTypeDAO;


public class StaffAppointmentTypeServiceImpl implements StaffAppointmentTypeService{

	private StaffAppointmentTypeDAO staffAppointmentTypeDAO; 
	
	@Override
	public Map<Integer, String> getApoinmentTypes() {
		return getStaffAppointmentTypeDAO().getApoinmentTypesFromDB();
	}

	public StaffAppointmentTypeDAO getStaffAppointmentTypeDAO() {
		return staffAppointmentTypeDAO;
	}

	public void setStaffAppointmentTypeDAO(StaffAppointmentTypeDAO staffAppointmentTypeDAO) {
		this.staffAppointmentTypeDAO = staffAppointmentTypeDAO;
	}
}
