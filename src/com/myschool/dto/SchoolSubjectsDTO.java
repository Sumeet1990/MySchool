package com.myschool.dto;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang.StringUtils;

public class SchoolSubjectsDTO {

	private String[] subjectName;
	private String[] subjectCodes;
	private HashMap<String, String> subjectNameCodes;
	private ArrayList<String> existsSubjectList;
	private String currentOperationStatus;
	private String userId;

	public String[] getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String[] subjectName) {
		this.subjectName = subjectName;
	}

	public ArrayList<String> getExistsSubjectList() {
		return existsSubjectList;
	}

	public void setExistsSubjectList(ArrayList<String> existsSubjectList) {
		this.existsSubjectList = existsSubjectList;
	}

	public String toDatabaseSubjectNameString() {
		if(getSubjectName() != null) {
			String returnResult = "";
			for (int i = 0; i < getSubjectName().length; i++) {
				returnResult = returnResult +"'"+getSubjectName()[i].trim().toString()+"'";
				if(i < getSubjectName().length -1)
					returnResult =  returnResult +",";
			}
			return returnResult;
		} else {
			return StringUtils.EMPTY;
		}
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

	public String[] getSubjectCodes() {
		return subjectCodes;
	}

	public void setSubjectCodes(String[] subjectCodes) {
		this.subjectCodes = subjectCodes;
	}

	public String getCurrentOperationStatus() {
		return currentOperationStatus;
	}

	public void setCurrentOperationStatus(String currentOperationStatus) {
		this.currentOperationStatus = currentOperationStatus;
	}
	
}
