package com.myschool.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.myschool.dto.StaffDTO;
import com.myschool.service.SchoolSubjectsService;
import com.myschool.service.StaffAppointmentTypeService;
import com.myschool.service.StaffService;
import com.myschool.util.CommonConstants;
import com.myschool.util.SessionUtils;
import com.opensymphony.xwork2.ActionSupport;

public class StaffAction extends ActionSupport implements SessionAware{
	private static Logger log = Logger.getLogger(StaffAction.class);	
	
	private String schoolClassName;
	private String actionType;
	private Map<String,String> subjectListMap;
	private Map<Integer,String> staffAppointmentTypes;
	private SchoolSubjectsService schoolSubjectsService;
	private ArrayList<String> tilesBeanStaff,genderBean,staffStatusBean,commonYesOrNo;
	private StaffAppointmentTypeService staffAppointmentTypeService;
	private StaffService staffService;
	private StaffDTO staffDTO;
	private java.util.Map<String, Object> session;

	public String performInit()
	{
		staffDTO = new StaffDTO();
		staffAppointmentTypes = getStaffAppointmentTypeService().getApoinmentTypes();
		subjectListMap = getSchoolSubjectsService().getAllSubjectsMap();
		return SUCCESS;
	}
	
	public String performAdd()
	{   
		SessionUtils sessionUtils = (SessionUtils) session.get(CommonConstants.SESSION_UTILS);
		staffDTO.setCreatedUserId(sessionUtils.getUserId());
		getStaffService().createStaffMember(staffDTO);
		return SUCCESS;
	}

	public String getSchoolClassName() {
		return schoolClassName;
	}

	public void setSchoolClassName(String schoolClassName) {
		this.schoolClassName = schoolClassName;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}


	public ArrayList<String> getTilesBeanStaff() {
		return tilesBeanStaff;
	}

	public void setTilesBeanStaff(ArrayList<String> tilesBeanStaff) {
		this.tilesBeanStaff = tilesBeanStaff;
	}

	public ArrayList<String> getGenderBean() {
		return genderBean;
	}

	public void setGenderBean(ArrayList<String> genderBean) {
		this.genderBean = genderBean;
	}

	public ArrayList<String> getStaffStatusBean() {
		return staffStatusBean;
	}

	public void setStaffStatusBean(ArrayList<String> staffStatusBean) {
		this.staffStatusBean = staffStatusBean;
	}

	public StaffAppointmentTypeService getStaffAppointmentTypeService() {
		return staffAppointmentTypeService;
	}

	public void setStaffAppointmentTypeService(
			StaffAppointmentTypeService staffAppointmentTypeService) {
		this.staffAppointmentTypeService = staffAppointmentTypeService;
	}

	public Map<Integer,String> getStaffAppointmentTypes() {
		return staffAppointmentTypes;
	}

	public void setStaffAppointmentTypes(Map<Integer,String> staffAppointmentTypes) {
		this.staffAppointmentTypes = staffAppointmentTypes;
	}

	public ArrayList<String> getCommonYesOrNo() {
		return commonYesOrNo;
	}

	public void setCommonYesOrNo(ArrayList<String> commonYesOrNo) {
		this.commonYesOrNo = commonYesOrNo;
	}

	public SchoolSubjectsService getSchoolSubjectsService() {
		return schoolSubjectsService;
	}

	public void setSchoolSubjectsService(SchoolSubjectsService schoolSubjectsService) {
		this.schoolSubjectsService = schoolSubjectsService;
	}

	public Map<String,String> getSubjectListMap() {
		return subjectListMap;
	}

	public void setSubjectListMap(Map<String,String> subjectListMap) {
		this.subjectListMap = subjectListMap;
	}

	public StaffService getStaffService() {
		return staffService;
	}

	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}

	@Override
	public void setSession(java.util.Map<String, Object> session) {
		this.session = session;
		
	}

	public StaffDTO getStaffDTO() {
		return staffDTO;
	}

	public void setStaffDTO(StaffDTO staffDTO) {
		this.staffDTO = staffDTO;
	}
	
}
