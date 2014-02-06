package com.myschool.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myschool.service.ClassSectionService;
import com.myschool.service.StaffService;
import com.opensymphony.xwork2.ActionSupport;

public class ClassSectionAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String schoolClassName;
	private String section;
	private String actionType;
	private Map<String,String> classTeacherMap;
	ClassSectionService classSectionService;
	StaffService staffService;

	public String execute()
	{
		try{
			classTeacherMap = getStaffService().getClassTeachersList();
		System.out.println("-------End of class teacher");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getSchoolClassName() {
		return schoolClassName;
	}

	public void setSchoolClassName(String schoolClassName) {
		this.schoolClassName = schoolClassName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Map<String,String> getClassTeacherMap() {
		return classTeacherMap;
	}

	public void setClassTeacherMap(Map<String,String> classTeacherMap) {
		this.classTeacherMap = classTeacherMap;
	}
	public ClassSectionService getClassSectionService() {
		return classSectionService;
	}

	public void setClassSectionService(ClassSectionService classSectionService) {
		this.classSectionService = classSectionService;
	}

	public StaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
}
