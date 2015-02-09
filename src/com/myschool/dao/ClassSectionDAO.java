package com.myschool.dao;

import java.util.List;

import com.myschool.dto.ClassSectionDTO;

public interface ClassSectionDAO {
	boolean verifyClassSectionExists(ClassSectionDTO classSectionDTO);
	
	boolean createClassSection(ClassSectionDTO classSectionDTO);	
	
	List<ClassSectionDTO> getAllClassSections();
	
}
