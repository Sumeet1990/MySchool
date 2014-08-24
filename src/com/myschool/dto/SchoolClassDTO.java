package com.myschool.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SchoolClassDTO {
	private Map<String,String> allSubjectMap;
	private List<String>  allSubjectList;
	private String selectedSubjectCodes;
	private String schoolClassName;
	private String minimumStudAge;
	private String maximumStudAge;
	private String periodsPerDay;
	private String durationOfPeriod;
	private String maxStrengthOfClass;
	private String statusClass;
	private String schoolClaassId;
	private boolean classOperationStatus;
	private String maxPeriodsPerteacher;
	
	
	public String getSchoolClaassId() {
		return schoolClaassId;
	}
	public void setSchoolClaassId(String schoolClaassId) {
		this.schoolClaassId = schoolClaassId;
	}
	public boolean isClassOperationStatus() {
		return classOperationStatus;
	}
	public void setClassOperationStatus(boolean classOperationStatus) {
		this.classOperationStatus = classOperationStatus;
	}
	
	public String getSchoolClassName() {
		return schoolClassName;
	}
	public void setSchoolClassName(String schoolClassName) {
		this.schoolClassName = schoolClassName;
	}
	public String getMinimumStudAge() {
		return minimumStudAge;
	}
	public void setMinimumStudAge(String minimumStudAge) {
		this.minimumStudAge = minimumStudAge;
	}
	public String getMaximumStudAge() {
		return maximumStudAge;
	}
	public void setMaximumStudAge(String maximumStudAge) {
		this.maximumStudAge = maximumStudAge;
	}
	public String getPeriodsPerDay() {
		return periodsPerDay;
	}
	public void setPeriodsPerDay(String periodsPerDay) {
		this.periodsPerDay = periodsPerDay;
	}
	public String getDurationOfPeriod() {
		return durationOfPeriod;
	}
	public void setDurationOfPeriod(String durationOfPeriod) {
		this.durationOfPeriod = durationOfPeriod;
	}
	public String getMaxStrengthOfClass() {
		return maxStrengthOfClass;
	}
	public void setMaxStrengthOfClass(String maxStrengthOfClass) {
		this.maxStrengthOfClass = maxStrengthOfClass;
	}
	public String getStatusClass() {
		return statusClass;
	}
	public void setStatusClass(String statusClass) {
		this.statusClass = statusClass;
	}
	public String getMaxPeriodsPerteacher() {
		return maxPeriodsPerteacher;
	}
	public void setMaxPeriodsPerteacher(String maxPeriodsPerteacher) {
		this.maxPeriodsPerteacher = maxPeriodsPerteacher;
	}
	public Map<String,String> getAllSubjectMap() {
		return allSubjectMap;
	}
	public void setAllSubjectMap(Map<String,String> allSubjectMap) {
		this.allSubjectMap = allSubjectMap;
	}
	public List<String> getAllSubjectList() {
		return allSubjectList;
	}
	public void setAllSubjectList(List<String> allSubjectList) {
		this.allSubjectList = allSubjectList;
	}
	public String getSelectedSubjectCodes() {
		return selectedSubjectCodes;
	}
	public void setSelectedSubjectCodes(String selectedSubjectCodes) {
		this.selectedSubjectCodes = selectedSubjectCodes;
	}
	
}
