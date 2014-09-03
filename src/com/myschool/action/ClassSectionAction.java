package com.myschool.action;

import java.util.HashMap;
import java.util.Map;

import com.myschool.service.SchoolClassService;
import com.opensymphony.xwork2.ActionSupport;

public class ClassSectionAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String schoolClassName;
	private String section;
	private String actionType;
	private SchoolClassService schoolClassService;
	private Map<String,String> classTeacherMap;
	private Map<Integer, String> classesMap;

	public String performCreate() {
		classTeacherMap = new HashMap<String,String>();
		//classesMap = new HashMap<String,String>();
		classesMap = getSchoolClassService().getAllClasses();
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

	public Map<Integer, String> getClassesMap() {
		return classesMap;
	}

	public void setClassesMap(Map<Integer, String> classesMap) {
		this.classesMap = classesMap;
	}

	public SchoolClassService getSchoolClassService() {
		return schoolClassService;
	}

	public void setSchoolClassService(SchoolClassService schoolClassService) {
		this.schoolClassService = schoolClassService;
	}
}
