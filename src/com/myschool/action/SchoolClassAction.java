package com.myschool.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.dto.SchoolClassDTO;
import com.myschool.service.SchoolClassService;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolClassAction extends ActionSupport  implements SessionAware{	
	private static Logger log = Logger.getLogger(SchoolClassAction.class);
	private SchoolClassService schoolClassService;
	private List<String> subjectList;
	private SchoolClassDTO schoolClassDTO;
	private java.util.Map<String, Object> session;
	
	public String performCreate()
	{
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		subjectList =  new ArrayList<>();
		subjectList.add("Subject 1");
		subjectList.add("Subject 2");
		subjectList.add("Subject 3");
		subjectList.add("Subject 4");
		schoolClassDTO.setSelectedSubjectLst(new ArrayList<String>());
		//getSchoolClassService().createClass(schoolClassDTO,sessionUtils.getUserId());
		return SUCCESS;
	}
	public String performCreateO()
	{
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		getSchoolClassService().createClass(schoolClassDTO,sessionUtils.getUserId());
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
		
		if(subjectList == null)
		{
			subjectList = new ArrayList<>();
			subjectList.add("a");
			subjectList.add("a0");
			subjectList.add("a1");
			subjectList.add("a2");
			subjectList.add("a3");
		}
		this.subjectList = subjectList;
	}


	public SchoolClassDTO getSchoolClassDTO() {
		return schoolClassDTO;
	}


	public void setSchoolClassDTO(SchoolClassDTO schoolClassDTO) {
		this.schoolClassDTO = schoolClassDTO;
	}
	@Override
	public void setSession(java.util.Map<String, Object> session) {
		this.session = session;
		
	}
}
