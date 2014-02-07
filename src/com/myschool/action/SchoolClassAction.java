package com.myschool.action;

import org.apache.log4j.Logger;

import com.myschool.service.SchoolClassService;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolClassAction extends ActionSupport {	
	private static Logger log = Logger.getLogger(SchoolClassAction.class);
	private SchoolClassService schoolClassService;
	
	
	
	public SchoolClassService getSchoolClassService() {
		return schoolClassService;
	}
	public void setSchoolClassService(SchoolClassService schoolClassService) {
		this.schoolClassService = schoolClassService;
	}
}
