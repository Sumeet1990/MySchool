package com.myschool.action;

import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class SchoolGeneralHolidaysAction extends ActionSupport implements SessionAware {
	
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(SchoolGeneralHolidaysAction.class);	
	
	private String errorMessage;
	private String actionType;
	
	public String performCreate() {
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

	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
}
