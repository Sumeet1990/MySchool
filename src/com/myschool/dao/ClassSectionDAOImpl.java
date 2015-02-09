package com.myschool.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.myschool.beans.ClassSection;
import com.myschool.beans.SchoolClass;
import com.myschool.dto.ClassSectionDTO;
import com.myschool.util.CommonConstants;
import com.myschool.util.CommonUtility;


public class ClassSectionDAOImpl extends HibernateDaoSupport implements ClassSectionDAO {	
	private static Logger log = Logger.getLogger(ClassSectionDAOImpl.class);
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean createClassSection(ClassSectionDTO classSectionDTO) {
		ClassSection classSection =  new ClassSection();
		CommonUtility.copyProperties(classSectionDTO, classSection, "schoolClassId schoolClassId",
				"section section",
				"staffId staffId",
				"sectionMaximumStrength sectionMaximumStrength",
				"sectionStatus sectionStatus",
				"createdUserId createdUserId");
		
		getHibernateTemplate().save(classSection);
		return true;
		
	}
	
	@Override
	public boolean verifyClassSectionExists(final ClassSectionDTO classSectionDTO) {
		Object[] params = new Object[]{Integer.valueOf(classSectionDTO.getSchoolClassId()), classSectionDTO.getSection()};
		
		List<ClassSection> classSectionList = getHibernateTemplate().find("from ClassSection where schoolClassId = ? AND section = ?", params);
		
		if(classSectionList != null && classSectionList.size() > 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public List<ClassSectionDTO> getAllClassSections() {
		List<ClassSectionDTO> classSectionDTOList = new ArrayList<ClassSectionDTO>();
		ClassSectionDTO classSectionDTO;
		ClassSection classSection;
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		List<Map<String, Object>> rows = jdbcTemplate.queryForList("select sc.school_class_name, cs.section, cs.SECTION_MAXIMUM_STRENGTH, cs.SECTION_INACTIVE_REASON, cs.section_status, sd.STAFF_TITLE, sd.STAFF_GIVEN_FULL_NAME, sd.STAFF_SURNAME from class_section cs, school_class sc, staff_details sd where cs.school_class_id = sc.school_class_id and cs.staff_id = sd.staff_id");
		for(Map row : rows) {
			classSectionDTO = new ClassSectionDTO();
			classSectionDTO.setSchoolClassName((String) row.get("school_class_name"));
			classSectionDTO.setSection((String) row.get("section"));
			classSectionDTO.setSectionStatus((String) row.get("section_status"));
			classSectionDTO.setSectionMaximumStrength(Integer.valueOf((row.get("SECTION_MAXIMUM_STRENGTH").toString())));
			classSectionDTO.setSectionInactiveReason((String) row.get("SECTION_INACTIVE_REASON"));
			classSectionDTO.setClassTeacherName((String) row.get("STAFF_TITLE")+CommonConstants.DOT + CommonConstants.SINGLE_BLANK_SPAACE + (String) row.get("STAFF_GIVEN_FULL_NAME") + CommonConstants.SINGLE_BLANK_SPAACE +(String) row.get("STAFF_SURNAME"));

			classSectionDTOList.add(classSectionDTO);
		}
		
		return classSectionDTOList;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
