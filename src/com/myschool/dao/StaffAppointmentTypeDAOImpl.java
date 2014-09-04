package com.myschool.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.StaffAppointment;


public class StaffAppointmentTypeDAOImpl  extends HibernateDaoSupport implements StaffAppointmentTypeDAO {

	@Override
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
	
}
