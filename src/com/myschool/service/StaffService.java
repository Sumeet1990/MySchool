package com.myschool.service;

import java.util.Map;

import com.myschool.dto.StaffDTO;



public interface StaffService {

	Map<String,String> getClassTeachersList();

	boolean createStaffMember(StaffDTO staffDTO);

}

