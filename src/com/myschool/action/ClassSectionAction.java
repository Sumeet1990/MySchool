package com.myschool.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.myschool.dto.ClassSectionDTO;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.service.ClassSectionService;
import com.myschool.service.SchoolClassService;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class ClassSectionAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = 1L;
	
	private static final String FAILURE = "failure";
	
	private String schoolClassName;
	private String section;
	private String actionType;
	private SchoolClassService schoolClassService;
	private ClassSectionService classSectionService;
	private Map<String,String> classTeacherMap;
	private Map<Integer, String> classesMap;
	private List<String> staffStatusBean;
	private ClassSectionDTO classSectionDTO;
	private java.util.Map<String, Object> session;
	private List<SchoolClassDTO> availableClassList;
	private List<ClassSectionDTO> availableClassSectionsList;
	
	/**
	 * 
	 */
	public String performCreateload() {
		classesMap = new HashMap<Integer, String>();
		classSectionDTO = new ClassSectionDTO();
		
		classSectionDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_CREATE);

		availableClassList = getSchoolClassService().getAllActiveSchoolClasses();
		classTeacherMap = getSchoolClassService().getAllClassTeachers();

		if(availableClassList != null && availableClassList.size() > 0) {
			for(SchoolClassDTO schoolClassDTOList : availableClassList) {
				classesMap.put(Integer.valueOf(schoolClassDTOList.getSchoolClassId()), schoolClassDTOList.getSchoolClassName());
			}
		}
		
		return SUCCESS;
	}
	
	public String performCreate() {
		classSectionDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_CREATE);
		classSectionDTO.setDisplayMessage(null);
		
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		
		classSectionDTO.setCreatedUserId(sessionUtils.getUserId());
		ClassSectionDTO returnClassSectionDTO = getClassSectionService().createClassSection(classSectionDTO);
		
		if(returnClassSectionDTO.getMessageMap().containsKey("SUCCESS")) {
			classSectionDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_VIEW);
			String returnString = performView();
			
			return returnString;
		} else {
			classSectionDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_CREATE);
			
			String displayMessage = getText(CommonConstants.SECTION_ALREADY_EXISTS);
			displayMessage = displayMessage.replace("*", classSectionDTO.getSection());
			classSectionDTO.setDisplayMessage(displayMessage);	
			
			return FAILURE;
		}
	}
	
	public String performView() {
		classSectionDTO = new ClassSectionDTO();
		
		classSectionDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_VIEW);
		availableClassSectionsList = getClassSectionService().getAllClassSections();
		
		if(availableClassSectionsList == null || availableClassSectionsList.size() == 0) {
			classSectionDTO.setDisplayMessage("Sections for any class does not exists");	
		}
		
		return SUCCESS;
	}

	public String getSchoolClassName() {
		return schoolClassName;
	}

	public void setSchoolClassName(String schoolClassName) {
		this.schoolClassName = schoolClassName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Map<String,String> getClassTeacherMap() {
		return classTeacherMap;
	}

	public void setClassTeacherMap(Map<String,String> classTeacherMap) {
		this.classTeacherMap = classTeacherMap;
	}

	public Map<Integer, String> getClassesMap() {
		return classesMap;
	}

	public void setClassesMap(Map<Integer, String> classesMap) {
		this.classesMap = classesMap;
	}

	public SchoolClassService getSchoolClassService() {
		return schoolClassService;
	}

	public void setSchoolClassService(SchoolClassService schoolClassService) {
		this.schoolClassService = schoolClassService;
	}

	public List<String> getStaffStatusBean() {
		return staffStatusBean;
	}

	public void setStaffStatusBean(List<String> staffStatusBean) {
		this.staffStatusBean = staffStatusBean;
	}

	public ClassSectionDTO getClassSectionDTO() {
		return classSectionDTO;
	}

	public void setClassSectionDTO(ClassSectionDTO classSectionDTO) {
		this.classSectionDTO = classSectionDTO;
	}

	public ClassSectionService getClassSectionService() {
		return classSectionService;
	}

	public void setClassSectionService(ClassSectionService classSectionService) {
		this.classSectionService = classSectionService;
	}
	
	/**
	 * @return the availableClassList
	 */
	public List<SchoolClassDTO> getAvailableClassList() {
		return availableClassList;
	}

	/**
	 * @param availableClassList the availableClassList to set
	 */
	public void setAvailableClassList(List<SchoolClassDTO> availableClassList) {
		this.availableClassList = availableClassList;
	}

	/**
	 * @return the availableClassSectionsList
	 */
	public List<ClassSectionDTO> getAvailableClassSectionsList() {
		return availableClassSectionsList;
	}

	/**
	 * @param availableClassSectionsList the availableClassSectionsList to set
	 */
	public void setAvailableClassSectionsList(
			List<ClassSectionDTO> availableClassSectionsList) {
		this.availableClassSectionsList = availableClassSectionsList;
	}

	@Override
	public void setSession(java.util.Map<String, Object> session) {
		this.session = session;
		
	}
}
