package com.myschool.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


/*
 * 
 */
public class OtherFeeStructureAction extends ActionSupport implements SessionAware {
	
	private static Logger log = Logger.getLogger(OtherFeeStructureAction.class);	
	
	private String schoolClassName;
	private String section;
	private String actionType;
	private Map<String,String> classSectionsMap;
	private Map<String,String> classesMap;

	public String performCreate() {
		classesMap = new HashMap<String,String>();
		classSectionsMap = new HashMap<String,String>();
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

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
