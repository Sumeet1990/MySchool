/**
 * 
 */
package com.myschool.service;

import com.myschool.dto.SchoolSubjectsDTO;

/**
 * @author Sumeet
 *
 */
public interface SchoolSubjectsService {

	boolean createSubjects(SchoolSubjectsDTO schoolSubjectsDTO);

	boolean updateSubjects(SchoolSubjectsDTO schoolSubjectsDTO);

}
