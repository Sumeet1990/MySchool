package com.myschool.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.myschool.beans.SchoolSubjects;

public class SchoolSubjectsDTO {
	
	private String subjectName;
	private String subjectCode;
	private String subjectStatus;
	private String subjectInactiveReason;
	private String subjectInactiveDateTime;
	private String[] schoolSubjectNames;
	private String[] schoolSubjectCodes;
	private HashMap<String, String> subjectNameCodes;
	private ArrayList<SchoolSubjects> existsSubjectList;
	private String currentOperation;
	private Map MessageMap;
	private String userId;
	private String displayMessage;

	public String toDatabaseSubjectNameString() {
		if(getSchoolSubjectNames() != null) {
			String returnResult = "";
			for (int i = 0; i < getSchoolSubjectNames().length; i++) {
				returnResult = returnResult +"'"+getSchoolSubjectNames()[i].trim().toString()+"'";
				if(i < getSchoolSubjectNames().length -1)
					returnResult =  returnResult +",";
			}
			return returnResult;
		} else {
			return StringUtils.EMPTY;
		}
	}
	
	/**
	 * @return the schoolSubjectNames
	 */
	public String[] getSchoolSubjectNames() {
		return schoolSubjectNames;
	}

	/**
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * @return the subjectCode
	 */
	public String getSubjectCode() {
		return subjectCode;
	}

	/**
	 * @return the subjectStatus
	 */
	public String getSubjectStatus() {
		return subjectStatus;
	}

	/**
	 * @param subjectStatus the subjectStatus to set
	 */
	public void setSubjectStatus(String subjectStatus) {
		this.subjectStatus = subjectStatus;
	}

	/**
	 * @return the subjectInactiveReason
	 */
	public String getSubjectInactiveReason() {
		return subjectInactiveReason;
	}

	/**
	 * @param subjectInactiveReason the subjectInactiveReason to set
	 */
	public void setSubjectInactiveReason(String subjectInactiveReason) {
		this.subjectInactiveReason = subjectInactiveReason;
	}

	/**
	 * @return the subjectInactiveDateTime
	 */
	public String getSubjectInactiveDateTime() {
		return subjectInactiveDateTime;
	}

	/**
	 * @param subjectInactiveDateTime the subjectInactiveDateTime to set
	 */
	public void setSubjectInactiveDateTime(String subjectInactiveDateTime) {
		this.subjectInactiveDateTime = subjectInactiveDateTime;
	}

	/**
	 * @param subjectCode the subjectCode to set
	 */
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	/**
	 * @param schoolSubjectNames the schoolSubjectNames to set
	 */
	public void setSchoolSubjectNames(String[] schoolSubjectNames) {
		this.schoolSubjectNames = schoolSubjectNames;
	}



	/**
	 * @return the schoolSubjectCodes
	 */
	public String[] getSchoolSubjectCodes() {
		return schoolSubjectCodes;
	}



	/**
	 * @param schoolSubjectCodes the schoolSubjectCodes to set
	 */
	public void setSchoolSubjectCodes(String[] schoolSubjectCodes) {
		this.schoolSubjectCodes = schoolSubjectCodes;
	}



	public ArrayList<SchoolSubjects> getExistsSubjectList() {
		return existsSubjectList;
	}

	public void setExistsSubjectList(ArrayList<SchoolSubjects> existsSubjectList) {
		this.existsSubjectList = existsSubjectList;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public HashMap<String, String> getSubjectNameCodes() {
		return subjectNameCodes;
	}

	public void setSubjectNameCodes(HashMap<String, String> subjectNameCodes) {
		this.subjectNameCodes = subjectNameCodes;
	}

	/**
	 * @return the displayMessage
	 */
	public String getDisplayMessage() {
		return displayMessage;
	}

	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
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
}
