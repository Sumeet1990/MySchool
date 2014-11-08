package com.myschool.action;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.dto.UserRoleDTO;
import com.myschool.schoolAccess.SchoolAccess;
import com.myschool.service.UserRoleService;
import com.myschool.userLevelAccess.UserLevelAccess;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmAdministrator;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmAdministrator.CmClass;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmAdministrator.CmSection;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmAdministrator.CmSubjects;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmAdministrator.CmUser;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmCalendar;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmCalendar.CmClassCalendar;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmCalendar.CmSchoolCalendar;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmFinance;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmFinance.CmOtherFeeStructure;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmFinance.CmTuitionFeeStructure;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmLibrary;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmLibrary.CmLibraryBooksCategory;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmLibrary.CmLibraryBooksEntry;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmStaff;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmStaff.CmAppointmentType;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmStaff.CmLeaveSructure;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmTransport;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmTransport.CmDriver;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmTransport.CmRoute;
import com.myschool.userLevelAccess.UserLevelAccess.ConfigurationManagement.CmTransport.CmVehicle;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmAdministrator;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmAdministrator.FmRollNumber;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmAdministrator.FmStaff;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmAdministrator.FmStudent;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmAdministrator.FmUser;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmAvailability;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmAvailability.FmAvailabilityCheck;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmCommunication;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmCommunication.FmHolidays;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmCommunication.FmSchedule;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmCommunication.FmSms;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmFinance;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmFinance.FmOtherFee;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmFinance.FmTuitionFee;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmLeaves;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmLeaves.FmStaffLeaves;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmLeaves.FmStudentLeaves;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmLibrary;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmLibrary.FmBooks;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmReports;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmReports.FmClassReports;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmReports.FmSchoolReports;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmReports.FmStaffReports;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmReports.FmStudentReports;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmTransportation;
import com.myschool.userLevelAccess.UserLevelAccess.FunctionalManagement.FmTransportation.FmTransportationRoute;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class UserRoleAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private static Logger log = Logger.getLogger(UserRoleAction.class);	
	
	private String schoolCode;
	private boolean userAccessAsSchool;
	private java.util.Map<String, Object> session;
	private SchoolAccess schoolAccess;
	
	private String userRoleName;
	private boolean roleAccessAsSchool;
	private UserLevelAccess userLevelAccess;
	
	private UserRoleService userRoleService;

	/**
	 * 
	 */
	public String performInitialize() {
		try {
			SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
			
			userLevelAccess = new UserLevelAccess();
			userLevelAccess.setConfigurationManagement(new ConfigurationManagement());
			userLevelAccess.setFunctionalManagement(new FunctionalManagement());
			
			userLevelAccess.getConfigurationManagement().setCmAdministrator(new CmAdministrator());
			userLevelAccess.getConfigurationManagement().setCmCalendar(new CmCalendar());
			userLevelAccess.getConfigurationManagement().setCmFinance(new CmFinance());
			userLevelAccess.getConfigurationManagement().setCmLibrary(new CmLibrary());
			userLevelAccess.getConfigurationManagement().setCmStaff(new CmStaff());
			userLevelAccess.getConfigurationManagement().setCmTransport(new CmTransport());
			
			userLevelAccess.getConfigurationManagement().getCmAdministrator().setCmUser(new CmUser());
			userLevelAccess.getConfigurationManagement().getCmAdministrator().setCmSubjects(new CmSubjects());
			userLevelAccess.getConfigurationManagement().getCmAdministrator().setCmSection(new CmSection());
			userLevelAccess.getConfigurationManagement().getCmAdministrator().setCmClass(new CmClass());
			
			userLevelAccess.getConfigurationManagement().getCmCalendar().setCmSchoolCalendar(new CmSchoolCalendar());
			userLevelAccess.getConfigurationManagement().getCmCalendar().setCmClassCalendar(new CmClassCalendar());
			
			userLevelAccess.getConfigurationManagement().getCmFinance().setCmOtherFeeStructure(new CmOtherFeeStructure());
			userLevelAccess.getConfigurationManagement().getCmFinance().setCmTuitionFeeStructure(new CmTuitionFeeStructure());
			
			userLevelAccess.getConfigurationManagement().getCmLibrary().setCmLibraryBooksCategory(new CmLibraryBooksCategory());
			userLevelAccess.getConfigurationManagement().getCmLibrary().setCmLibraryBooksEntry(new CmLibraryBooksEntry());
			
			userLevelAccess.getConfigurationManagement().getCmStaff().setCmAppointmentType(new CmAppointmentType());
			userLevelAccess.getConfigurationManagement().getCmStaff().setCmLeaveSructure(new CmLeaveSructure());
			
			userLevelAccess.getConfigurationManagement().getCmTransport().setCmDriver(new CmDriver());
			userLevelAccess.getConfigurationManagement().getCmTransport().setCmRoute(new CmRoute());
			userLevelAccess.getConfigurationManagement().getCmTransport().setCmVehicle(new CmVehicle());
			
			userLevelAccess.getFunctionalManagement().setFmAdministrator(new FmAdministrator());
			userLevelAccess.getFunctionalManagement().setFmAvailability(new FmAvailability());
			userLevelAccess.getFunctionalManagement().setFmCommunication(new FmCommunication());
			userLevelAccess.getFunctionalManagement().setFmFinance(new FmFinance());
			userLevelAccess.getFunctionalManagement().setFmLeaves(new FmLeaves());
			userLevelAccess.getFunctionalManagement().setFmLibrary(new FmLibrary());
			userLevelAccess.getFunctionalManagement().setFmReports(new FmReports());
			userLevelAccess.getFunctionalManagement().setFmTransportation(new FmTransportation());
			
			userLevelAccess.getFunctionalManagement().getFmAdministrator().setFmRollNumber(new FmRollNumber());
			userLevelAccess.getFunctionalManagement().getFmAdministrator().setFmStaff(new FmStaff());
			userLevelAccess.getFunctionalManagement().getFmAdministrator().setFmStudent(new FmStudent());
			userLevelAccess.getFunctionalManagement().getFmAdministrator().setFmUser(new FmUser());
			
			userLevelAccess.getFunctionalManagement().getFmAvailability().setFmAvailabilityCheck(new FmAvailabilityCheck());
			
			userLevelAccess.getFunctionalManagement().getFmCommunication().setFmHolidays(new FmHolidays());
			userLevelAccess.getFunctionalManagement().getFmCommunication().setFmSchedule(new FmSchedule());
			userLevelAccess.getFunctionalManagement().getFmCommunication().setFmSms(new FmSms());
			
			userLevelAccess.getFunctionalManagement().getFmFinance().setFmOtherFee(new FmOtherFee());
			userLevelAccess.getFunctionalManagement().getFmFinance().setFmTuitionFee(new FmTuitionFee());
			
			userLevelAccess.getFunctionalManagement().getFmLeaves().setFmStaffLeaves(new FmStaffLeaves());
			userLevelAccess.getFunctionalManagement().getFmLeaves().setFmStudentLeaves(new FmStudentLeaves());
			
			userLevelAccess.getFunctionalManagement().getFmLibrary().setFmBooks(new FmBooks());
			
			userLevelAccess.getFunctionalManagement().getFmReports().setFmClassReports(new FmClassReports());
			userLevelAccess.getFunctionalManagement().getFmReports().setFmSchoolReports(new FmSchoolReports());
			userLevelAccess.getFunctionalManagement().getFmReports().setFmStaffReports(new FmStaffReports());
			userLevelAccess.getFunctionalManagement().getFmReports().setFmStudentReports(new FmStudentReports());
			
			userLevelAccess.getFunctionalManagement().getFmTransportation().setFmTransportationRoute(new FmTransportationRoute());
						
			 //Enabling School Level Menu and Sub Menus
			 String schoolAccessConfigurationXml = "C:/Users/dam/git/MySchool/WebContent/WEB-INF/"+CommonConstants.SCHOOL_ACCESS +"_"+schoolCode+".xml";
			 JAXBContext jc = JAXBContext.newInstance(SchoolAccess.class);
			 javax.xml.bind.Unmarshaller unmarshaller = jc.createUnmarshaller();
			 schoolAccess = (SchoolAccess) unmarshaller.unmarshal(new File(schoolAccessConfigurationXml));
		} catch (JAXBException e) {
			e.printStackTrace();
			return "FAILURE";
		}
		
		return SUCCESS;
	}
	
	public String performCreate() {
		try {
			SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
			
			javax.xml.bind.JAXBContext jaxbContext = javax.xml.bind.JAXBContext.newInstance(UserLevelAccess.class);
			javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			java.io.StringWriter sw = new StringWriter();
			jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_SCHEMA_LOCATION, "C:/Users/dam/git/MySchool/resources/userLevelAccess_MS01.xsd");
	        
			jaxbMarshaller.marshal(userLevelAccess, sw);
			
			String userRoleAccess = sw.toString();
			System.out.println("@@@@@@@@@@@ userRoleAccess :"+userRoleAccess);
			
			//TODO : Insert the user role and the access to DB
			UserRoleDTO userRoleDTO = new UserRoleDTO();
			userRoleDTO.setUserRoleName(userRoleName);
			userRoleDTO.setUserAccessAsSchool(userAccessAsSchool);
			userRoleDTO.setUserRoleAccess(userRoleAccess);
			userRoleDTO.setUserId(sessionUtils.getUserId());
			userRoleDTO = userRoleService.createUserRole(userRoleDTO);
			
		} catch (JAXBException e) {
			e.printStackTrace();
			return "FAILURE";
		}
		 
		 
		return SUCCESS;
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

	/**
	 * @return the userRoleName
	 */
	public String getUserRoleName() {
		return userRoleName;
	}

	/**
	 * @param userRoleName the userRoleName to set
	 */
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
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
	 * @return the roleAccessAsSchool
	 */
	public boolean isRoleAccessAsSchool() {
		return roleAccessAsSchool;
	}

	/**
	 * @param roleAccessAsSchool the roleAccessAsSchool to set
	 */
	public void setRoleAccessAsSchool(boolean roleAccessAsSchool) {
		this.roleAccessAsSchool = roleAccessAsSchool;
	}
}
