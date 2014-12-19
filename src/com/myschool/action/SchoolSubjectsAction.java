package com.myschool.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

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
	
	/**
	 * 
	 * @return
	 */
	public String performCreateload() {
		if(log.isDebugEnabled()) {
			log.debug("Entered performInitlize method of SchoolSubjectsAction");
		}
		
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		
		schoolSubjectsDTO = new SchoolSubjectsDTO();
		schoolSubjectsDTO = getSchoolSubjectsService().getAllAvailableSubjects();
		schoolSubjectsDTO.setUserId(sessionUtils.getUserId());
		schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_CREATE);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String performCreate() {
		schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_CREATE);
		if(log.isDebugEnabled()) {
			log.debug("Entered performCreate method of SchoolSubjectsAction");
		}
		
		boolean status = getSchoolSubjectsService().createSubjects(schoolSubjectsDTO);
		if(log.isDebugEnabled()) {
			log.debug("@@@@@@ status : "+status);
		}
		
		if(status) {
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_VIEW);	
			String returnString = performView();
			
			return returnString;
		} else {
			setErrorMessage(getText(CommonConstants.SUBJECTS_ALREADY_EXISTS));
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_CREATE_FAIL);			
			
			return FAILURE;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String performModifyload() {
		schoolSubjectsDTO = new SchoolSubjectsDTO();
		schoolSubjectsDTO = getSchoolSubjectsService().getAllAvailableSubjects();
		schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_MODIFY);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String performModify() {
		boolean  status = getSchoolSubjectsService().updateSubjects(schoolSubjectsDTO);		
		if(status) {
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_VIEW);	
			String returnString = performView();
			
			return returnString;
		} else {
			setErrorMessage(getText(CommonConstants.SUBJECTS_ALREADY_EXISTS));
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_MODIFY_FAIL);
			
			return FAILURE;
		}	
	}
	
	/**
	 * 
	 * @return
	 */
	public String performDeleteload() {
		schoolSubjectsDTO = new SchoolSubjectsDTO();
		schoolSubjectsDTO = getSchoolSubjectsService().getAllAvailableSubjects();
		schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_DELETE);
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String performDelete() {
		/*boolean  status = getSchoolSubjectsService().deleteSubjects(schoolSubjectsDTO);		
		if(status) {
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_VIEW);	
			String returnString = performView();
			
			return returnString;
		} else {
			setErrorMessage(getText(CommonConstants.SUBJECTS_ALREADY_EXISTS));
			schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_DELETE_FAIL);
			
			return FAILURE;
		}*/	
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String performView() {
		schoolSubjectsDTO = new SchoolSubjectsDTO();
		schoolSubjectsDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_VIEW);
		
		schoolSubjectsDTO = getSchoolSubjectsService().getAllAvailableSubjects();
		
		if(schoolSubjectsDTO == null || schoolSubjectsDTO.getExistsSubjectList() == null && schoolSubjectsDTO.getExistsSubjectList().size() == 0) {
			schoolSubjectsDTO.setErrorMessage("Subjects Not Available");
		}
		
		return SUCCESS;
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
