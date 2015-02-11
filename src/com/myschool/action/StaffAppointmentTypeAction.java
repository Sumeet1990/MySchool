package com.myschool.action;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;
import com.myschool.beans.StaffAppointment;
import com.myschool.dto.ClassSectionDTO;
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
	private StaffAppointmentTypeDTO staffAppointmentTypeDTO;
	private Map<String,String> classSectionsMap;
	private Map<String,String> classesMap;
	private java.util.Map<String, Object> session;
	private List<StaffAppointmentTypeDTO> availableStaffAppointmentTypeList;
	
	/**
	 * 
	 * @return
	 */
	public String performCeateload() {
		staffAppointmentTypeDTO = new StaffAppointmentTypeDTO();
		staffAppointmentTypeDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_CREATE);
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		
		//staffAppointmentTypeDTO = getStaffAppointmentTypeService().getAllAvailableAppointmentTypes();
		staffAppointmentTypeDTO.setUserId(sessionUtils.getUserId());
		
		return SUCCESS;
	}
	
	/**
	 * 
	 * @return
	 */
	public String performCreate() {
		staffAppointmentTypeDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_CREATE);
		
		StaffAppointmentTypeDTO returnedSaffAppointmentTypeDTO = getStaffAppointmentTypeService().createAppointmentType(staffAppointmentTypeDTO);
		
		if(returnedSaffAppointmentTypeDTO.getMessageMap().containsKey("SUCCESS")) {
			staffAppointmentTypeDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_VIEW);

			String returnString = performView();
			
			return returnString;
		} else {
			staffAppointmentTypeDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_CREATE);
			
			String displayMessage = getText(CommonConstants.SUBJECT_ALREADY_EXISTS);
			displayMessage = displayMessage.replace("*", staffAppointmentTypeDTO.getAppointmentTypes().toString());
			staffAppointmentTypeDTO.setDisplayMessage(displayMessage);		
			
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
			//staffAppointmentTypeDTO.setCurrentOperationStatus(CommonConstants.STAFF_APOINTMENT_TYPE_MODIFY);
			//setErrorMessage(getText(CommonConstants.STAFF_APOINTMENT_TYPE_SUCCESSFULLY_MODIFIED));
			return SUCCESS;
		} else {
			//setErrorMessage(getText(CommonConstants.SUBJECTS_ALREADY_EXISTS));
			//staffAppointmentTypeDTO.setCurrentOperationStatus(CommonConstants.SUBJECTS_MODIFY_FAIL);
			return FAILURE;
		}		
	}
	
	public String performView() {
		staffAppointmentTypeDTO = new StaffAppointmentTypeDTO();
		staffAppointmentTypeDTO.setCurrentOperation(CommonConstants.CURRENT_OPERATION_VIEW);
		
		availableStaffAppointmentTypeList = getStaffAppointmentTypeService().getAvailableAppointmentTypeList();
		
		if(availableStaffAppointmentTypeList == null && availableStaffAppointmentTypeList.size() == 0) {
			staffAppointmentTypeDTO.setDisplayMessage("Appointment types does not exists");	
		}
		return SUCCESS;
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

	/**
	 * @return the availableStaffAppointmentTypeList
	 */
	public List<StaffAppointmentTypeDTO> getAvailableStaffAppointmentTypeList() {
		return availableStaffAppointmentTypeList;
	}

	/**
	 * @param availableStaffAppointmentTypeList the availableStaffAppointmentTypeList to set
	 */
	public void setAvailableStaffAppointmentTypeList(
			List<StaffAppointmentTypeDTO> availableStaffAppointmentTypeList) {
		this.availableStaffAppointmentTypeList = availableStaffAppointmentTypeList;
	}
}
