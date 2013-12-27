package com.myschool.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myschool.beans.SchoolClass;
import com.myschool.service.SchoolClassService;
import com.opensymphony.xwork2.ActionSupport;

public class SchoolClassAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String schoolClassName;
	private String section;
	private String actionTypeValue;
	private String classTeacher;
	private String errorMessageAlreadyExts;
	List<SchoolClass> schoolClassLst;

	private Map<Long,String> classTeacherMap;
	@Autowired
	SchoolClassService classteacherService;
	
	public String execute()
	{
		try{
		classTeacherMap = getClassteacherService().getClassTeachersList();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String performCreate()
	{
		try{
		 setSchoolClassLst(getClassteacherService().createSchoolClass(getSchoolClassName(), getSection(), getClassTeacher()));
		
		 if(getSchoolClassLst() != null)
		 {
			 setErrorMessageAlreadyExts("");
			 return SUCCESS;
		 }else
		 {
			 setErrorMessageAlreadyExts(getSchoolClassName()+" already exist's, Please choose some other name !");
			 return "failure";
		 }
		
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return "failure";
	}
	
	public String performView()
	{
		try{
			schoolClassLst = getClassteacherService().getSchoolFrmClassOrSection(getSchoolClassName(),getSection());
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String performModify()
	{
		try{
		classTeacherMap = getClassteacherService().getClassTeachersList();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public SchoolClassService getClassteacherService() {
		return classteacherService;
	}

	public void setClassteacherService(SchoolClassService classteacherService) {
		this.classteacherService = classteacherService;
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

	public Map<Long,String> getClassTeacherMap() {
		return classTeacherMap;
	}

	public void setClassTeacherMap(Map<Long,String> classTeacherMap) {
		this.classTeacherMap = classTeacherMap;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}
	public List<SchoolClass> getSchoolClassLst() {
		return schoolClassLst;
	}

	public void setSchoolClassLst(List<SchoolClass> schoolClassLst) {
		this.schoolClassLst = schoolClassLst;
	}

	public String getActionTypeValue() {
		return actionTypeValue;
	}

	public void setActionTypeValue(String actionTypeValue) {
		this.actionTypeValue = actionTypeValue;
	}

	public String getErrorMessageAlreadyExts() {
		return errorMessageAlreadyExts;
	}

	public void setErrorMessageAlreadyExts(String errorMessageAlreadyExts) {
		this.errorMessageAlreadyExts = errorMessageAlreadyExts;
	}

}
