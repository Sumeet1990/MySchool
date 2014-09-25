package com.myschool.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.myschool.dto.StaffAppointmentTypeDTO;
import com.myschool.service.StaffAppointmentTypeService;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;

public class StaffAppointmentTypeAction extends ActionSupport implements SessionAware{
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(StaffAppointmentTypeAction.class);	
	
	private static final String FAILURE = "FAILURE";
	private StaffAppointmentTypeService staffAppointmentTypeService;
	private String errorMessage;
	private String actionType;
	private StaffAppointmentTypeDTO staffAppointmentTypeDTO = new StaffAppointmentTypeDTO();
	private Map<String,String> classSectionsMap;
	private Map<String,String> classesMap;
	private java.util.Map<String, Object> session;
	
	/**
	 * 
	 * @return
	 */
	public String performInitlize() {
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		staffAppointmentTypeDTO = new StaffAppointmentTypeDTO();
		staffAppointmentTypeDTO = getStaffAppointmentTypeService().getAllAvailableAppointmentTypes();
		staffAppointmentTypeDTO.setUserId(sessionUtils.getUserId());
		staffAppointmentTypeDTO.setCurrentOperationStatus(CommonConstants.STAFF_APOINTMENT_TYPE_CREATE);
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String performCreate() {
		boolean status = getStaffAppointmentTypeService().createAppointmentType(staffAppointmentTypeDTO);
		if(status) {
			setErrorMessage(getText(CommonConstants.STAFF_APOINTMENT_TYPE_SUCCESSFULLY_CREATED));
			staffAppointmentTypeDTO.setCurrentOperationStatus(CommonConstants.STAFF_APOINTMENT_TYPE_CREATE_SUCCESS);	
			return SUCCESS;
		} else {
			setErrorMessage(getText(CommonConstants.STAFF_APOINTMENT_TYPE_ALREADY_EXISTS));
			staffAppointmentTypeDTO.setCurrentOperationStatus(CommonConstants.STAFF_APOINTMENT_TYPE_CREATE_FAIL);			
			return FAILURE;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String performModify() {
		boolean  status = getStaffAppointmentTypeService().updateAppointmentType(staffAppointmentTypeDTO);		
		if(status) {
			staffAppointmentTypeDTO.setCurrentOperationStatus(CommonConstants.STAFF_APOINTMENT_TYPE_MODIFY);
			setErrorMessage(getText(CommonConstants.STAFF_APOINTMENT_TYPE_SUCCESSFULLY_MODIFIED));
			return SUCCESS;
		} else {
			setErrorMessage(getText(CommonConstants.SUBJECTS_ALREADY_EXISTS));
			staffAppointmentTypeDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_MODIFY_FAIL);
			return FAILURE;
		}		
	}
	
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Map<String, String> getClassesMap() {
		return classesMap;
	}

	public void setClassesMap(Map<String, String> classesMap) {
		this.classesMap = classesMap;
	}

	public Map<String, String> getClassSectionsMap() {
		return classSectionsMap;
	}

	public void setClassSectionsMap(Map<String, String> classSectionsMap) {
		this.classSectionsMap = classSectionsMap;
	}

	public StaffAppointmentTypeService getStaffAppointmentTypeService() {
		return staffAppointmentTypeService;
	}

	public void setStaffAppointmentTypeService(
			StaffAppointmentTypeService staffAppointmentTypeService) {
		this.staffAppointmentTypeService = staffAppointmentTypeService;
	}

	

	public StaffAppointmentTypeDTO getStaffAppointmentTypeDTO() {
		return staffAppointmentTypeDTO;
	}

	public void setStaffAppointmentTypeDTO(
			StaffAppointmentTypeDTO staffAppointmentTypeDTO) {
		this.staffAppointmentTypeDTO = staffAppointmentTypeDTO;
	}

	public void setSession(Map<String, Object> session) {		
		this.session = session;
	}
}
