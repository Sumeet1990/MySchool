package com.myschool.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

public class StaffAppointmentTypeDTO {
	private String appointmentTypeId;
	private String appointmentType;

	private String[] appointmentTypeIds;
	private String[] appointmentTypes;
	
	private HashMap<String, String> appointmentTypeNameCodes;
	private ArrayList<String> existsAppointmentTypeList;
	private String userId;

	private String currentOperation;
	private Map MessageMap;
	private String displayMessage;
	
	public String toDatabaseAppointmentTypeString() {
		if(getAppointmentTypes() != null) {
			String returnResult = "";
			for (int i = 0; i < getAppointmentTypes().length; i++) {
				returnResult = returnResult +"'"+getAppointmentTypes()[i].trim().toString()+"'";
				if(i < getAppointmentTypes().length -1)
					returnResult =  returnResult +",";
			}
			return returnResult;
		} else {
			return StringUtils.EMPTY;
		}
	}
	
	/**
	 * @return the appointmentTypeId
	 */
	public String getAppointmentTypeId() {
		return appointmentTypeId;
	}

	/**
	 * @param appointmentTypeId the appointmentTypeId to set
	 */
	public void setAppointmentTypeId(String appointmentTypeId) {
		this.appointmentTypeId = appointmentTypeId;
	}

	/**
	 * @return the appointmentType
	 */
	public String getAppointmentType() {
		return appointmentType;
	}

	/**
	 * @param appointmentType the appointmentType to set
	 */
	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}

	/**
	 * @return the appointmentTypeIds
	 */
	public String[] getAppointmentTypeIds() {
		return appointmentTypeIds;
	}

	/**
	 * @param appointmentTypeIds the appointmentTypeIds to set
	 */
	public void setAppointmentTypeIds(String[] appointmentTypeIds) {
		this.appointmentTypeIds = appointmentTypeIds;
	}

	/**
	 * @return the appointmentTypes
	 */
	public String[] getAppointmentTypes() {
		return appointmentTypes;
	}

	/**
	 * @param appointmentTypes the appointmentTypes to set
	 */
	public void setAppointmentTypes(String[] appointmentTypes) {
		this.appointmentTypes = appointmentTypes;
	}

	public ArrayList<String> getExistsAppointmentTypeList() {
		return existsAppointmentTypeList;
	}

	public void setExistsAppointmentTypeList(
			ArrayList<String> existsAppointmentTypeList) {
		this.existsAppointmentTypeList = existsAppointmentTypeList;
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

	/**
	 * @return the currentOperation
	 */
	public String getCurrentOperation() {
		return currentOperation;
	}

	/**
	 * @param currentOperation the currentOperation to set
	 */
	public void setCurrentOperation(String currentOperation) {
		this.currentOperation = currentOperation;
	}

	/**
	 * @return the messageMap
	 */
	public Map getMessageMap() {
		return MessageMap;
	}

	/**
	 * @param messageMap the messageMap to set
	 */
	public void setMessageMap(Map messageMap) {
		MessageMap = messageMap;
	}

	/**
	 * @return the displayMessage
	 */
	public String getDisplayMessage() {
		return displayMessage;
	}

	/**
	 * @param displayMessage the displayMessage to set
	 */
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}
}
