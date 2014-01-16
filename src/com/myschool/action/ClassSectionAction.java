package com.myschool.action;

import org.apache.log4j.Logger;

import com.myschool.service.ClassSectionService;
import com.opensymphony.xwork2.ActionSupport;

public class ClassSectionAction extends ActionSupport {	
	private static Logger log = Logger.getLogger(ClassSectionAction.class);
	private ClassSectionService classSectionService;
	public ClassSectionService getClassSectionService() {
		return classSectionService;
	}
	public void setClassSectionService(ClassSectionService classSectionService) {
		this.classSectionService = classSectionService;
	}
	
	
}
