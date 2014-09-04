package com.myschool.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.myschool.service.StaffAppointmentTypeService;
import com.opensymphony.xwork2.ActionSupport;

public class StaffAction extends ActionSupport{
	private static Logger log = Logger.getLogger(StaffAction.class);	
	
	private String schoolClassName;
	private String section;
	private String actionType;
	private Map<String,String> classSectionsMap,classesMap;
	private Map<Integer,String> staffAppointmentTypes;
	private ArrayList<String> tilesBeanStaff,genderBean,staffStatusBean;
	private StaffAppointmentTypeService staffAppointmentTypeService;

	public String performAdd()
	{
		classesMap = new HashMap<String,String>();
		classSectionsMap = new HashMap<String,String>();
		staffAppointmentTypes = getStaffAppointmentTypeService().getApoinmentTypes();
		return SUCCESS;
	}

	public String getSchoolClassName() {
		return schoolClassName;
	}

	public void setSchoolClassName(String schoolClassName) {
		this.schoolClassName = schoolClassName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public Map<String, String> getClassesMap() {
		return classesMap;
	}

	public void setClassesMap(Map<String, String> classesMap) {
		this.classesMap = classesMap;
	}

	public Map<String, String> getClassSectionsMap() {
		return classSectionsMap;
	}

	public void setClassSectionsMap(Map<String, String> classSectionsMap) {
		this.classSectionsMap = classSectionsMap;
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
}
