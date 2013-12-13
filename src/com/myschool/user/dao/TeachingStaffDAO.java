package com.myschool.user.dao;

import java.util.List;

import com.myschool.user.dto.TeachingStaffDTO;


public interface TeachingStaffDAO{

	List<TeachingStaffDTO> getClassTeachers();
}
