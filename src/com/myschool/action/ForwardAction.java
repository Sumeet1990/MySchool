package com.myschool.action;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.dto.UserRoleDTO;
import com.myschool.schoolAccess.SchoolAccess;
import com.myschool.service.UserRoleService;
import com.myschool.userLevelAccess.UserLevelAccess;
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
	private SchoolAccess schoolAccess;
	private UserLevelAccess userLevelAccess;
	
	private UserRoleService userRoleService;
	
	/**
	 * 
	 */
	public String execute() {
		try {
			SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
			
			 //Enabling School Level Menu and Modules
			 String schoolAccessConfigurationXml = "C:/Users/dam/git/MySchool/WebContent/WEB-INF/"+CommonConstants.SCHOOL_ACCESS +"_"+schoolCode+".xml";
			 JAXBContext schoolAccessAsSchoolJC = JAXBContext.newInstance(SchoolAccess.class);
			 javax.xml.bind.Unmarshaller schoolAccessAsSchoolUnmarshaller = schoolAccessAsSchoolJC.createUnmarshaller();
			 schoolAccess = (SchoolAccess) schoolAccessAsSchoolUnmarshaller.unmarshal(new File(schoolAccessConfigurationXml));
			 
			 userAccessAsSchool = sessionUtils.isUserAccessAsSchool();
			 
			 if(!userAccessAsSchool) {
				 UserRoleDTO userRoleDTO = new UserRoleDTO();
				 userRoleDTO.setUserRoleName(sessionUtils.getUserRolesName());
				 String userLevelAccessConfigurationXml = userRoleService.getUserRoleAccessDetails(userRoleDTO);
				 
				 JAXBContext userLevelAccessAsSchoolJC = JAXBContext.newInstance(UserLevelAccess.class);
				 javax.xml.bind.Unmarshaller userLevelAccessAsSchoolUnmarshaller = userLevelAccessAsSchoolJC.createUnmarshaller();
				 StringReader reader = new StringReader(userLevelAccessConfigurationXml);
				 userLevelAccess = (UserLevelAccess) userLevelAccessAsSchoolUnmarshaller.unmarshal(reader);
			 }
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
	 * @return the schoolAccess
	 */
	public SchoolAccess getSchoolAccess() {
		return schoolAccess;
	}

	/**
	 * @param schoolAccess the schoolAccess to set
	 */
	public void setSchoolAccess(SchoolAccess schoolAccess) {
		this.schoolAccess = schoolAccess;
	}
	
	/**
	 * @return the userLevelAccess
	 */
	public UserLevelAccess getUserLevelAccess() {
		return userLevelAccess;
	}

	/**
	 * @param userLevelAccess the userLevelAccess to set
	 */
	public void setUserLevelAccess(UserLevelAccess userLevelAccess) {
		this.userLevelAccess = userLevelAccess;
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
	
	
	
	/**
	 * @return the userRoleService
	 */
	public UserRoleService getUserRoleService() {
		return userRoleService;
	}

	/**
	 * @param userRoleService the userRoleService to set
	 */
	public void setUserRoleService(UserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}

	@Override
	public void setSession(java.util.Map<String, Object> session) {
		this.session = session;
		
	}
}