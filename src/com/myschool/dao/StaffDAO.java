package com.myschool.dao;

import java.util.List;

import com.myschool.dto.StaffDTO;


public interface StaffDAO {

	List<StaffDTO> getClassTeachers();

	boolean checkStaffNameAlreadyExists(String staffGivenFullName,
			String staffSurname);

	boolean addNewStaffMember(StaffDTO staffDTO);
	
}
