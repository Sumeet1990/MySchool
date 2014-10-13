package com.myschool.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.myschool.dao.StaffDAO;
import com.myschool.dto.StaffDTO;

public class StaffServiceImpl implements StaffService {
	StaffDAO staffDAO;
	@Override
	public Map<String, String> getClassTeachersList() {
		
		List<StaffDTO> staffDTOLst = getStaffDAO().getClassTeachers();
		Map<String, String> teacherStaffMap = new HashMap<String, String>();
		for(StaffDTO staffDTO : staffDTOLst)
		{
			//teacherStaffMap.put(staffDTO.getTeachingStaffId(), staffDTO.getTeachingStaffGivenFullName());
		}
		
		return teacherStaffMap;
		
	}
	public StaffDAO getStaffDAO() {
		return staffDAO;
	}
	public void setStaffDAO(StaffDAO staffDAO) {
		this.staffDAO = staffDAO;
	}
	@Override
	public boolean createStaffMember(StaffDTO staffDTO) {
		try{
		boolean exists = getStaffDAO().checkStaffNameAlreadyExists(staffDTO.getStaffGivenFullName(),staffDTO.getStaffSurname());
		
		if(!exists){
			getStaffDAO().addNewStaffMember(staffDTO);
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return false;
	}
	
}
