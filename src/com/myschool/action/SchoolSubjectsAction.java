package com.myschool.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.dto.SchoolSubjectsDTO;
import com.myschool.service.SchoolSubjectsService;
import com.myschool.util.CommonConstants;
import com.myschool.util.CommonUtility;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolSubjectsAction extends ActionSupport implements SessionAware{
	private static final String FAILURE = "failure";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(SchoolSubjectsAction.class);	
	private SchoolSubjectsService schoolSubjectsService;
	private String errorMessage;
	private String actionType;
	private SchoolSubjectsDTO schoolSubjectsDTO = new SchoolSubjectsDTO();
	private java.util.Map<String, Object> session;
	
	public String performCreate()
	{
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		schoolSubjectsDTO.setUserId(sessionUtils.getUserId());
		boolean status = getSchoolSubjectsService().createSubjects(schoolSubjectsDTO);
		
		if(status)
		{
			setErrorMessage("");
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECT_CREATE);
			return SUCCESS;
		}else
		{
			setErrorMessage("Subjects already exist, Please create other subjects !");
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECT_CREATE_FAIL);
			return FAILURE;
		}
	}
	
	public String performModify()
	{
		boolean  status = getSchoolSubjectsService().updateSubjects(schoolSubjectsDTO);
		
		if(status)
		{
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECT_MODIFY);
			setErrorMessage("Successfully updated subjects");
			return SUCCESS;
		}else
		{
			setErrorMessage("Subjects already exist, Please create other subjects !");
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECT_MODIFY_FAIL);
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

	@Override
	public void setSession(Map<String, Object> session) {
		
		this.session = session;
	}

}
