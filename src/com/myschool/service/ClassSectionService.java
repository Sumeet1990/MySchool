package com.myschool.service;

import java.util.List;

import com.myschool.dto.ClassSectionDTO;

public interface ClassSectionService {
	ClassSectionDTO createClassSection(ClassSectionDTO classSectionDTO);	
	
	List<ClassSectionDTO> getAllClassSections();
}

