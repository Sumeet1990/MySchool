package com.myschool.action;

import com.myschool.service.StaffService;
import com.opensymphony.xwork2.ActionSupport;

public class StaffAction extends ActionSupport{
	
	private String errorMessageStaff;
	private StaffService staffService;
	private String staffActionType;
	
	
	private void performStaffCreate() {


	}
	
	private void performStaffModify() {
		// TODO Auto-generated method stub

	}
	
	private void performStaffView() {
		// TODO Auto-generated method stub

	}
	
	public String getErrorMessageStaff() {
		return errorMessageStaff;
	}

	public void setErrorMessageStaff(String errorMessageStaff) {
		this.errorMessageStaff = errorMessageStaff;
	}

	public StaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(StaffService StaffService) {
		this.staffService = StaffService;
	}

	public String getStaffActionType() {
		return staffActionType;
	}

	public void setStaffActionType(String staffActionType) {
		this.staffActionType = staffActionType;
	}

}
