package com.myschool.user.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class SchoolClassAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String schoolClassName;
	private String section;
	private String actionType;
	private List<String> classTeacherList;
	
	public String execute()
	{
		ArrayList<String>classTeacherLista = new ArrayList<>();
		classTeacherLista.add("A");
		classTeacherLista.add("B");
		classTeacherLista.add("C");
		setClassTeacherList(classTeacherLista);
		System.out.println("---------------------------------------"+getActionType());
		return "success";
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

	public List<String> getClassTeacherList() {
		return classTeacherList;
	}

	public void setClassTeacherList(List<String> classTeacherList) {
		this.classTeacherList = classTeacherList;
	}

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
}
