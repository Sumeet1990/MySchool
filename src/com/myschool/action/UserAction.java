package com.myschool.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements SessionAware{
	private static Logger log = Logger.getLogger(UserAction.class);	
	
	private Map<String,String> classSectionsMap;
	private Map<String,String> classesMap;
	private java.util.Map<String, Object> session;
	
	public String performInitialize() {
		classesMap = new HashMap<String,String>();
		classSectionsMap = new HashMap<String,String>();
		return SUCCESS;
	}
	
	/**
	 * @return the classSectionsMap
	 */
	public Map<String, String> getClassSectionsMap() {
		return classSectionsMap;
	}

	/**
	 * @param classSectionsMap the classSectionsMap to set
	 */
	public void setClassSectionsMap(Map<String, String> classSectionsMap) {
		this.classSectionsMap = classSectionsMap;
	}

	/**
	 * @return the classesMap
	 */
	public Map<String, String> getClassesMap() {
		return classesMap;
	}

	/**
	 * @param classesMap the classesMap to set
	 */
	public void setClassesMap(Map<String, String> classesMap) {
		this.classesMap = classesMap;
	}

	@Override
	public void setSession(java.util.Map<String, Object> session) {
		this.session = session;
	}
}
