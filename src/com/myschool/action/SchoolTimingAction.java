package com.myschool.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SchoolTimingAction extends ActionSupport implements SessionAware {
	private static Logger log = Logger.getLogger(SchoolTimingAction.class);	
	
	private static final long serialVersionUID = 1L;
	
	private String errorMessage;
	private String actionType;
	private Map<String,String> classesMap;
	
	public String performCreate() {
		classesMap = new HashMap<String,String>();
		return SUCCESS;
	}
	
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Map<String, String> getClassesMap() {
		return classesMap;
	}

	public void setClassesMap(Map<String, String> classesMap) {
		this.classesMap = classesMap;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
}
