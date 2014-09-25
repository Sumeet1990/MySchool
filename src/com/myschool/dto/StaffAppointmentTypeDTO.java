package com.myschool.dto;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

public class StaffAppointmentTypeDTO {
	private String[] appointmentType;
	private String[] appointmentTypeCodes;
	private HashMap<String, String> appointmentTypeNameCodes;
	private ArrayList<String> existsAppointmentTypeList;
	private String currentOperationStatus;
	private String userId;

	public String toDatabaseSubjectNameString() {
		if(getAppointmentType() != null) {
			String returnResult = "";
			for (int i = 0; i < getAppointmentType().length; i++) {
				returnResult = returnResult +"'"+getAppointmentType()[i].trim().toString()+"'";
				if(i < getAppointmentType().length -1)
					returnResult =  returnResult +",";
			}
			return returnResult;
		} else {
			return StringUtils.EMPTY;
		}
	}
	
	public String[] getAppointmentType() {
		return appointmentType;
	}

	public void setAppointmentType(String[] appointmentType) {
		this.appointmentType = appointmentType;
	}

	public ArrayList<String> getExistsAppointmentTypeList() {
		return existsAppointmentTypeList;
	}

	public void setExistsAppointmentTypeList(
			ArrayList<String> existsAppointmentTypeList) {
		this.existsAppointmentTypeList = existsAppointmentTypeList;
	}
	
	public String[] getAppointmentTypeCodes() {
		return appointmentTypeCodes;
	}

	public void setAppointmentTypeCodes(String[] appointmentTypeCodes) {
		this.appointmentTypeCodes = appointmentTypeCodes;
	}

	public HashMap<String, String> getAppointmentTypeNameCodes() {
		return appointmentTypeNameCodes;
	}

	public void setAppointmentTypeNameCodes(
			HashMap<String, String> appointmentTypeNameCodes) {
		this.appointmentTypeNameCodes = appointmentTypeNameCodes;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getCurrentOperationStatus() {
		return currentOperationStatus;
	}

	public void setCurrentOperationStatus(String currentOperationStatus) {
		this.currentOperationStatus = currentOperationStatus;
	}
}
