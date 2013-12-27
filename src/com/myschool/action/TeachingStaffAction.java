package com.myschool.action;

import com.myschool.service.TeachingStaffService;
import com.opensymphony.xwork2.ActionSupport;

public class TeachingStaffAction extends ActionSupport{
	
	private String errorMessageTeachingStaff;
	private TeachingStaffService teachingStaffService;
	private String teachingStaffActionType;
	
	
	private void performTeachingStaffCreate() {


	}
	
	private void performTeachingStaffModify() {
		// TODO Auto-generated method stub

	}
	
	private void performTeachingStaffView() {
		// TODO Auto-generated method stub

	}
	
	public String getErrorMessageTeachingStaff() {
		return errorMessageTeachingStaff;
	}

	public void setErrorMessageTeachingStaff(String errorMessageTeachingStaff) {
		this.errorMessageTeachingStaff = errorMessageTeachingStaff;
	}

	public TeachingStaffService getTeachingStaffService() {
		return teachingStaffService;
	}

	public void setTeachingStaffService(TeachingStaffService teachingStaffService) {
		this.teachingStaffService = teachingStaffService;
	}

	public String getTeachingStaffActionType() {
		return teachingStaffActionType;
	}

	public void setTeachingStaffActionType(String teachingStaffActionType) {
		this.teachingStaffActionType = teachingStaffActionType;
	}

}
