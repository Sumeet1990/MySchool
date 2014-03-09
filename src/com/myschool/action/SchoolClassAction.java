package com.myschool.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.myschool.service.SchoolClassService;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolClassAction extends ActionSupport {	
	private static Logger log = Logger.getLogger(SchoolClassAction.class);
	private SchoolClassService schoolClassService;
	private List<String> subjectList;
	private List<String> selectedSubjectLst;
	
	public String performCreate()
	{
		subjectList = new ArrayList<String>();
		subjectList.add("a");
		subjectList.add("a0");
		subjectList.add("a1");
		subjectList.add("a2");
		subjectList.add("a3");
		selectedSubjectLst = new ArrayList<String>();
		return SUCCESS;
	}
	
	
	public SchoolClassService getSchoolClassService() {
		return schoolClassService;
	}
	public void setSchoolClassService(SchoolClassService schoolClassService) {
		this.schoolClassService = schoolClassService;
	}


	public List<String> getSubjectList() {
		return subjectList;
	}


	public void setSubjectList(List<String> subjectList) {
		this.subjectList = subjectList;
	}

	public List<String> getSelectedSubjectLst() {
		return selectedSubjectLst;
	}


	public void setSelectedSubjectLst(List<String> selectedSubjectLst) {
		this.selectedSubjectLst = selectedSubjectLst;
	}
}
