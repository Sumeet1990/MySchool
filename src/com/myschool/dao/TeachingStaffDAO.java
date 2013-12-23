package com.myschool.dao;

import java.util.List;

import com.myschool.dto.TeachingStaffDTO;


public interface TeachingStaffDAO{

	List<TeachingStaffDTO> getClassTeachers();
}
