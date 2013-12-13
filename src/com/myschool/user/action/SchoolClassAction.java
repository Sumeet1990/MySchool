package com.myschool.user.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myschool.user.service.TeachingStaffService;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolClassAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String schoolClassName;
	private String section;
	private String actionType;
	private Map<String,String> classTeacherMap;
	@Autowired
	TeachingStaffService classteacherService;
	
	public String execute()
	{
		try{
		classTeacherMap = getClassteacherService().getClassTeachersList();
		System.out.println("-------End of class teacher");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public TeachingStaffService getClassteacherService() {
		return classteacherService;
	}

	public void setClassteacherService(TeachingStaffService classteacherService) {
		this.classteacherService = classteacherService;
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
}
