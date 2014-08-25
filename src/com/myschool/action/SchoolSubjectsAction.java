package com.myschool.action;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.beans.SchoolSubjects;
import com.myschool.dto.SchoolSubjectsDTO;
import com.myschool.service.SchoolSubjectsService;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolSubjectsAction extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(SchoolSubjectsAction.class);	
	
	private static final String FAILURE = "failure";
	private SchoolSubjectsService schoolSubjectsService;
	private String errorMessage;
	private String actionType;
	private SchoolSubjectsDTO schoolSubjectsDTO;
	private java.util.Map<String, Object> session;
	
	public String performInitlize() {
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		schoolSubjectsDTO = new SchoolSubjectsDTO();
		schoolSubjectsDTO = getSchoolSubjectsService().getAllAvailableSubjects();
		schoolSubjectsDTO.setUserId(sessionUtils.getUserId());
		schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_CREATE);
		return SUCCESS;
	}
	public String performCreate() {
		
		boolean status = getSchoolSubjectsService().createSubjects(schoolSubjectsDTO);
		if(status) {
			setErrorMessage(getText(CommonConstants.SUBJECTS_SUCCESSFULLY_CREATED));
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_CREATE_SUCCESS);	
			return SUCCESS;
		} else {
			setErrorMessage(getText(CommonConstants.SUBJECTS_ALREADY_EXISTS));
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_CREATE_FAIL);			
			return FAILURE;
		}
	}
	
	public String performModify() {
		boolean  status = getSchoolSubjectsService().updateSubjects(schoolSubjectsDTO);		
		if(status) {
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_MODIFY);
			setErrorMessage(getText(CommonConstants.SUBJECTS_SUCCESSFULLY_MODIFIED));
			return SUCCESS;
		} else {
			setErrorMessage(getText(CommonConstants.SUBJECTS_ALREADY_EXISTS));
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_MODIFY_FAIL);
			return FAILURE;
		}		
	}
	
	public SchoolSubjectsService getSchoolSubjectsService() {
		return schoolSubjectsService;
	}
	public void setSchoolSubjectsService(SchoolSubjectsService schoolSubjectsService) {
		this.schoolSubjectsService = schoolSubjectsService;
	}
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public SchoolSubjectsDTO getSchoolSubjectsDTO() {
		return schoolSubjectsDTO;
	}

	public void setSchoolSubjectsDTO(SchoolSubjectsDTO schoolSubjectsDTO) {
		this.schoolSubjectsDTO = schoolSubjectsDTO;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public void setSession(Map<String, Object> session) {		
		this.session = session;
	}

}
