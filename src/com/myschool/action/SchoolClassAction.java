package com.myschool.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.beans.SchoolSubjects;
import com.myschool.dto.SchoolClassDTO;
import com.myschool.service.SchoolClassService;
import com.myschool.service.SchoolSubjectsService;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolClassAction extends ActionSupport  implements SessionAware {	
	private static Logger log = Logger.getLogger(SchoolClassAction.class);
	
	private static final String FAILURE = "failure";
	
	private SchoolClassService schoolClassService;
	private SchoolSubjectsService schoolSubjectsService;
	
	private List<SchoolClassDTO> availableClassList;
	private List<String> availableSubjectList;
	private List<String> selectedSubjectList;
	private List<String> classStatusBean;
	
	private String availableSubject;
	private String selectedSubject;
	
	private SchoolClassDTO schoolClassDTO;
	private java.util.Map<String, Object> session;
	
	/**
	 * 
	 * @return
	 */
	public String performCreateload() {
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		
		schoolClassDTO = new SchoolClassDTO();
		selectedSubjectList = new ArrayList<String>();
		
		classStatusBean = new ArrayList<String>();
		classStatusBean.add("ACTIVE");
		classStatusBean.add("INACTIVE");
		
		schoolClassDTO.setClassCurrentOperation(CommonConstants.CLASS_CREATE);
		
		getSchoolSubjectsService().getAllTheSubjectList(schoolClassDTO);
		List<SchoolSubjects> allSchoolSubjectsList = schoolClassDTO.getAllSubjectList();
		
		availableSubjectList = new ArrayList<String>();
		if(allSchoolSubjectsList != null) {
			for(SchoolSubjects schoolSubjects : allSchoolSubjectsList) {
				availableSubjectList.add(schoolSubjects.getSubjectName());
			}
		} 
		
		schoolClassDTO.setErrorMessage(null);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String performCreate() {
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		
		schoolClassService.setSelectedSubjectCodes(schoolClassDTO, selectedSubject);
		SchoolClassDTO returnSchoolClassDTO = getSchoolClassService().createClass(schoolClassDTO, sessionUtils.getUserId());
		
		if(StringUtils.equalsIgnoreCase(returnSchoolClassDTO.getErrorMessage(), 
				CommonConstants.CLASS_SUCCESSFULLY_CREATED)) {
			schoolClassDTO.setClassCurrentOperation(CommonConstants.CLASS_VIEW);
			
			String returnString = performView(); 
			return returnString;
		} else {
			schoolClassDTO.setClassCurrentOperation(CommonConstants.CLASS_CREATE);
			return FAILURE;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String performView() {
		schoolClassDTO = new SchoolClassDTO();
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		schoolClassDTO.setClassCurrentOperation(CommonConstants.CLASS_VIEW);
		
		availableClassList = schoolClassService.getAllSchoolClasses();
		
		if(availableClassList == null || availableClassList.size() == 0) {
			schoolClassDTO.setErrorMessage("Classes Not Available");
		}
		
		return SUCCESS;
	}
	
	@Override
	public void setSession(java.util.Map<String, Object> session) {
		this.session = session;
	}
	
	public SchoolClassService getSchoolClassService() {
		return schoolClassService;
	}
	
	public void setSchoolClassService(SchoolClassService schoolClassService) {
		this.schoolClassService = schoolClassService;
	}

	public SchoolClassDTO getSchoolClassDTO() {
		return schoolClassDTO;
	}

	public void setSchoolClassDTO(SchoolClassDTO schoolClassDTO) {
		this.schoolClassDTO = schoolClassDTO;
	}
	
	public SchoolSubjectsService getSchoolSubjectsService() {
		return schoolSubjectsService;
	}
	
	public void setSchoolSubjectsService(SchoolSubjectsService schoolSubjectsService) {
		this.schoolSubjectsService = schoolSubjectsService;
	}
	
	public List<String> getSelectedSubjectList() {
		return selectedSubjectList;
	}
	
	public void setSelectedSubjectList(List<String> selectedSubjectList) {
		this.selectedSubjectList = selectedSubjectList;
	}
	
	public String getSelectedSubject() {
		return selectedSubject;
	}
	
	public void setSelectedSubject(String selectedSubject) {
		this.selectedSubject = selectedSubject;
	}
	
	public List<String> getAvailableSubjectList() {
		return availableSubjectList;
	}
	
	public void setAvailableSubjectList(List<String> availableSubjectList) {
		this.availableSubjectList = availableSubjectList;
	}
	
	public String getAvailableSubject() {
		return availableSubject;
	}
	
	public void setAvailableSubject(String availableSubject) {
		this.availableSubject = availableSubject;
	}

	/**
	 * @return the classStatusBean
	 */
	public List<String> getClassStatusBean() {
		return classStatusBean;
	}

	/**
	 * @param classStatusBean the classStatusBean to set
	 */
	public void setClassStatusBean(List<String> classStatusBean) {
		this.classStatusBean = classStatusBean;
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
}
