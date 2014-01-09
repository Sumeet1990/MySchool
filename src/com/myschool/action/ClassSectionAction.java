package com.myschool.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.myschool.beans.ClassSection;
import com.myschool.service.ClassSectionService;
import com.opensymphony.xwork2.ActionSupport;

public class ClassSectionAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String classSectionName;
	private String section;
	private String actionTypeValue;
	private String classTeacher;
	private String errorMessageAlreadyExts;
	List<ClassSection> classSectionLst;

	private Map<Long,String> classTeacherMap;
	
	private ClassSectionService classSectionService;
	
	public String execute()
	{
		try {
			classTeacherMap = getClassteacherService().getClassTeachersList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	public String performCreate()
	{
		try {
			setclassSectionLst(getClassSectionService().createClassSection(getSchoolClassName(), getSection(), getClassTeacher()));
		
			if(getSchoolClassLst() != null) {
				setErrorMessageAlreadyExts(StringUtils.EMPTY);
				return SUCCESS;
			 } else {
				 setErrorMessageAlreadyExts(getSchoolClassName()+" already exist's, Please choose some other name!");
				 return FAILURE;
			 }		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return FAILURE;
	}
	
	public String performView()
	{
		try {
			schoolClassLst = getClassSectionService().getSchoolFrmClassOrSection(getSchoolClassName(),getSection());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}
	
	public String performModify()
	{
		try{
			classTeacherMap = getClassSectionService().getClassTeachersList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return SUCCESS;
	}

	public String getClassSectionName() {
		return classSectionName;
	}

	public void setClassSectionName(String classSectionName) {
		this.classSectionName = classSectionName;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getActionTypeValue() {
		return actionTypeValue;
	}

	public void setActionTypeValue(String actionTypeValue) {
		this.actionTypeValue = actionTypeValue;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public String getErrorMessageAlreadyExts() {
		return errorMessageAlreadyExts;
	}

	public void setErrorMessageAlreadyExts(String errorMessageAlreadyExts) {
		this.errorMessageAlreadyExts = errorMessageAlreadyExts;
	}

	public List<ClassSection> getClassSectionLst() {
		return classSectionLst;
	}

	public void setClassSectionLst(List<ClassSection> classSectionLst) {
		this.classSectionLst = classSectionLst;
	}

	public Map<Long, String> getClassTeacherMap() {
		return classTeacherMap;
	}

	public void setClassTeacherMap(Map<Long, String> classTeacherMap) {
		this.classTeacherMap = classTeacherMap;
	}

	public ClassSectionService getClassSectionService() {
		return classSectionService;
	}

	public void setClassSectionService(ClassSectionService classSectionService) {
		this.classSectionService = classSectionService;
	}

	

}
