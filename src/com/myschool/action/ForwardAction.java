package com.myschool.action;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.schoolAccess.SchoolLevelAccessRequest;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class ForwardAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(ForwardAction.class);
	
	private String display;
	private String schoolCode;
	private boolean userAccessAsSchool;
	private java.util.Map<String, Object> session;
	private SchoolLevelAccessRequest schoolLevelAccessRequest;
	
	/**
	 * 
	 */
	public String execute() {
		try {
			 SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
			 userAccessAsSchool = sessionUtils.isUserAccessAsSchool();
			 //Enabling School Level Menu and Sub Menus
			 String schoolLevelAccessConfigurationXml = "C:/Users/dam/git/MySchool/WebContent/WEB-INF/"+CommonConstants.SCHOOL_ACCESS +"_"+schoolCode+".xml";
			 JAXBContext jc = JAXBContext.newInstance(SchoolLevelAccessRequest.class);
			 javax.xml.bind.Unmarshaller unmarshaller = jc.createUnmarshaller();
			 schoolLevelAccessRequest = (SchoolLevelAccessRequest) unmarshaller.unmarshal(new File(schoolLevelAccessConfigurationXml));
			 
			 //TODO Enabling Logged-in User Modules
		} catch (JAXBException e) {
			e.printStackTrace();
			return "FAILURE";
		}
		
		return SUCCESS;
	}
	
	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}
	
	/**
	 * @return the schoolCode
	 */
	public String getSchoolCode() {
		return schoolCode;
	}

	/**
	 * @param schoolCode the schoolCode to set
	 */
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	
	/**
	 * @return the schoolLevelAccessRequest
	 */
	public SchoolLevelAccessRequest getSchoolLevelAccessRequest() {
		return schoolLevelAccessRequest;
	}

	/**
	 * @param schoolLevelAccessRequest the schoolLevelAccessRequest to set
	 */
	public void setSchoolLevelAccessRequest(
			SchoolLevelAccessRequest schoolLevelAccessRequest) {
		this.schoolLevelAccessRequest = schoolLevelAccessRequest;
	}
	
	/**
	 * @return the userAccessAsSchool
	 */
	public boolean isUserAccessAsSchool() {
		return userAccessAsSchool;
	}

	/**
	 * @param userAccessAsSchool the userAccessAsSchool to set
	 */
	public void setUserAccessAsSchool(boolean userAccessAsSchool) {
		this.userAccessAsSchool = userAccessAsSchool;
	}

	@Override
	public void setSession(java.util.Map<String, Object> session) {
		this.session = session;
		
	}
}