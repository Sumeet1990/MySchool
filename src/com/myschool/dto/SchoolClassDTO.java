package com.myschool.dto;

import java.util.List;
import java.util.Map;

import com.myschool.beans.SchoolClass;
import com.myschool.beans.SchoolSubjects;

public class SchoolClassDTO {
	
	private String schoolClassId;
	private String schoolClassName;
	private String minAgeCriteriaInMonths;
	private String maxAgeCriteriaInMonths;
	private String periodsPerDay;
	private String periodDurationInMin;
	private String teacherPeriodsPerDay;
	private String classMaxStrength;
	private String classStatus;
	private String classInactiveReason;
	
	private Map<String,String> allSubjectMap;
	private List<SchoolSubjects> allSubjectList;
	private List<SchoolClass>  allSchoolClassList;
	Map<Integer,String> schoolClassMap;
	private String selectedSubjectCodes;
	private String classSubjects;
	private String displayMessage;
	private boolean classOperationStatus;
	private String currentOperation;
	private Map MessageMap;
	
	/**
	 * @return the schoolClassId
	 */
	public String getSchoolClassId() {
		return schoolClassId;
	}
	/**
	 * @param schoolClassId the schoolClassId to set
	 */
	public void setSchoolClassId(String schoolClassId) {
		this.schoolClassId = schoolClassId;
	}
	/**
	 * @return the schoolClassName
	 */
	public String getSchoolClassName() {
		return schoolClassName;
	}
	/**
	 * @param schoolClassName the schoolClassName to set
	 */
	public void setSchoolClassName(String schoolClassName) {
		this.schoolClassName = schoolClassName;
	}
	/**
	 * @return the minAgeCriteriaInMonths
	 */
	public String getMinAgeCriteriaInMonths() {
		return minAgeCriteriaInMonths;
	}
	/**
	 * @param minAgeCriteriaInMonths the minAgeCriteriaInMonths to set
	 */
	public void setMinAgeCriteriaInMonths(String minAgeCriteriaInMonths) {
		this.minAgeCriteriaInMonths = minAgeCriteriaInMonths;
	}
	/**
	 * @return the maxAgeCriteriaInMonths
	 */
	public String getMaxAgeCriteriaInMonths() {
		return maxAgeCriteriaInMonths;
	}
	/**
	 * @param maxAgeCriteriaInMonths the maxAgeCriteriaInMonths to set
	 */
	public void setMaxAgeCriteriaInMonths(String maxAgeCriteriaInMonths) {
		this.maxAgeCriteriaInMonths = maxAgeCriteriaInMonths;
	}
	/**
	 * @return the periodsPerDay
	 */
	public String getPeriodsPerDay() {
		return periodsPerDay;
	}
	/**
	 * @param periodsPerDay the periodsPerDay to set
	 */
	public void setPeriodsPerDay(String periodsPerDay) {
		this.periodsPerDay = periodsPerDay;
	}
	/**
	 * @return the periodDurationInMin
	 */
	public String getPeriodDurationInMin() {
		return periodDurationInMin;
	}
	/**
	 * @param periodDurationInMin the periodDurationInMin to set
	 */
	public void setPeriodDurationInMin(String periodDurationInMin) {
		this.periodDurationInMin = periodDurationInMin;
	}
	/**
	 * @return the teacherPeriodsPerDay
	 */
	public String getTeacherPeriodsPerDay() {
		return teacherPeriodsPerDay;
	}
	/**
	 * @param teacherPeriodsPerDay the teacherPeriodsPerDay to set
	 */
	public void setTeacherPeriodsPerDay(String teacherPeriodsPerDay) {
		this.teacherPeriodsPerDay = teacherPeriodsPerDay;
	}
	/**
	 * @return the classMaxStrength
	 */
	public String getClassMaxStrength() {
		return classMaxStrength;
	}
	/**
	 * @param classMaxStrength the classMaxStrength to set
	 */
	public void setClassMaxStrength(String classMaxStrength) {
		this.classMaxStrength = classMaxStrength;
	}
	/**
	 * @return the classStatus
	 */
	public String getClassStatus() {
		return classStatus;
	}
	/**
	 * @param classStatus the classStatus to set
	 */
	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}
	
	/**
	 * @return the classInactiveReason
	 */
	public String getClassInactiveReason() {
		return classInactiveReason;
	}
	/**
	 * @param classInactiveReason the classInactiveReason to set
	 */
	public void setClassInactiveReason(String classInactiveReason) {
		this.classInactiveReason = classInactiveReason;
	}
	/**
	 * @return the allSubjectMap
	 */
	public Map<String, String> getAllSubjectMap() {
		return allSubjectMap;
	}
	/**
	 * @param allSubjectMap the allSubjectMap to set
	 */
	public void setAllSubjectMap(Map<String, String> allSubjectMap) {
		this.allSubjectMap = allSubjectMap;
	}
	/**
	 * @return the allSubjectList
	 */
	public List<SchoolSubjects> getAllSubjectList() {
		return allSubjectList;
	}
	/**
	 * @param allSubjectList the allSubjectList to set
	 */
	public void setAllSubjectList(List<SchoolSubjects> allSubjectList) {
		this.allSubjectList = allSubjectList;
	}
	/**
	 * @return the allSchoolClassList
	 */
	public List<SchoolClass> getAllSchoolClassList() {
		return allSchoolClassList;
	}
	/**
	 * @param allSchoolClassList the allSchoolClassList to set
	 */
	public void setAllSchoolClassList(List<SchoolClass> allSchoolClassList) {
		this.allSchoolClassList = allSchoolClassList;
	}
	/**
	 * @return the schoolClassMap
	 */
	public Map<Integer, String> getSchoolClassMap() {
		return schoolClassMap;
	}
	/**
	 * @param schoolClassMap the schoolClassMap to set
	 */
	public void setSchoolClassMap(Map<Integer, String> schoolClassMap) {
		this.schoolClassMap = schoolClassMap;
	}
	/**
	 * @return the selectedSubjectCodes
	 */
	public String getSelectedSubjectCodes() {
		return selectedSubjectCodes;
	}
	/**
	 * @param selectedSubjectCodes the selectedSubjectCodes to set
	 */
	public void setSelectedSubjectCodes(String selectedSubjectCodes) {
		this.selectedSubjectCodes = selectedSubjectCodes;
	}
	
	/**
	 * @return the calssSubjects
	 */
	public String getClassSubjects() {
		return classSubjects;
	}
	/**
	 * @param calssSubjects the calssSubjects to set
	 */
	public void setClassSubjects(String classSubjects) {
		this.classSubjects = classSubjects;
	}
	
	/**
	 * @return the displayMessage
	 */
	public String getDisplayMessage() {
		return displayMessage;
	}
	/**
	 * @param displayMessage the displayMessage to set
	 */
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}
	/**
	 * @return the classOperationStatus
	 */
	public boolean isClassOperationStatus() {
		return classOperationStatus;
	}
	/**
	 * @param classOperationStatus the classOperationStatus to set
	 */
	public void setClassOperationStatus(boolean classOperationStatus) {
		this.classOperationStatus = classOperationStatus;
	}
	
	/**
	 * @return the currentOperation
	 */
	public String getCurrentOperation() {
		return currentOperation;
	}
	/**
	 * @param currentOperation the currentOperation to set
	 */
	public void setCurrentOperation(String currentOperation) {
		this.currentOperation = currentOperation;
	}
	/**
	 * @return the messageMap
	 */
	public Map getMessageMap() {
		return MessageMap;
	}
	/**
	 * @param messageMap the messageMap to set
	 */
	public void setMessageMap(Map messageMap) {
		MessageMap = messageMap;
	}
}
