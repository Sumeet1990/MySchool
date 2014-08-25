package com.myschool.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.dto.SchoolClassDTO;
import com.myschool.service.SchoolClassService;
import com.myschool.service.SchoolSubjectsService;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolClassAction extends ActionSupport  implements SessionAware{	
	private static final String FAILURE = "failure";
	private static Logger log = Logger.getLogger(SchoolClassAction.class);
	private SchoolClassService schoolClassService;
	private SchoolSubjectsService schoolSubjectsService;
	private List<String> availableSubjectList = new ArrayList<String>();
	private List<String> selectedSubjectList = new ArrayList<String>();
	private String availableSubject;
	private String selectedSubject;
	private SchoolClassDTO schoolClassDTO;
	private java.util.Map<String, Object> session;
	
	public String performCreate()
	{
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		schoolClassDTO = new SchoolClassDTO();
		getSchoolSubjectsService().getAllTheSubjectList(schoolClassDTO);
		availableSubjectList = schoolClassDTO.getAllSubjectList();
		if(availableSubjectList == null) {
			availableSubjectList = new ArrayList<String>();
		}
		schoolClassDTO.setErrorMessage(null);
		return SUCCESS;
	}
	public String performCreateO()
	{
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		schoolClassService.setSelectedSubjectCodes(schoolClassDTO,selectedSubject);
		getSchoolClassService().createClass(schoolClassDTO,sessionUtils.getUserId());
		schoolClassDTO.setErrorMessage(getText(schoolClassDTO.getErrorMessage()));
		if(schoolClassDTO.isClassOperationStatus()){
			return SUCCESS;
		}else
		{
			return FAILURE;
		}
	}
	
	
	public SchoolClassService getSchoolClassService() {
		return schoolClassService;
	}
	public void setSchoolClassService(SchoolClassService schoolClassService) {
		this.schoolClassService = schoolClassService;
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
	public SchoolSubjectsService getSchoolSubjectsService() {
		return schoolSubjectsService;
	}
	public void setSchoolSubjectsService(SchoolSubjectsService schoolSubjectsService) {
		this.schoolSubjectsService = schoolSubjectsService;
	}
	public List<String> getSelectedSubjectList() {
		return selectedSubjectList;
	}
	public void setSelectedSubjectList(List<String> selectedSubjectList) {
		this.selectedSubjectList = selectedSubjectList;
	}
	public String getSelectedSubject() {
		return selectedSubject;
	}
	public void setSelectedSubject(String selectedSubject) {
		this.selectedSubject = selectedSubject;
	}
	public List<String> getAvailableSubjectList() {
		return availableSubjectList;
	}
	public void setAvailableSubjectList(List<String> availableSubjectList) {
		this.availableSubjectList = availableSubjectList;
	}
	public String getAvailableSubject() {
		return availableSubject;
	}
	public void setAvailableSubject(String availableSubject) {
		this.availableSubject = availableSubject;
	}
}
