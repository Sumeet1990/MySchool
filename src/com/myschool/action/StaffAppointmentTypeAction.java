package com.myschool.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import com.myschool.dto.StaffAppointmentTypeDTO;
import com.myschool.service.StaffAppointmentTypeService;

public class StaffAppointmentTypeAction extends ActionSupport implements SessionAware{
	
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(StaffAppointmentTypeAction.class);	
	
	private StaffAppointmentTypeService staffAppointmentService;
	private String errorMessage;
	private String actionType;
	private StaffAppointmentTypeDTO staffAppointmentDTO = new StaffAppointmentTypeDTO();
	private Map<String,String> classSectionsMap;
	private Map<String,String> classesMap;
				  	
	public String performCreate() {
		classesMap = new HashMap<String,String>();
		classSectionsMap = new HashMap<String,String>();			
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

	public StaffAppointmentTypeService getStaffAppointmentService() {
		return staffAppointmentService;
	}

	public void setStaffAppointmentService(
			StaffAppointmentTypeService staffAppointmentService) {
		this.staffAppointmentService = staffAppointmentService;
	}

	public StaffAppointmentTypeDTO getStaffAppointmentDTO() {
		return staffAppointmentDTO;
	}

	public void setStaffAppointmentDTO(StaffAppointmentTypeDTO staffAppointmentDTO) {
		this.staffAppointmentDTO = staffAppointmentDTO;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
}
