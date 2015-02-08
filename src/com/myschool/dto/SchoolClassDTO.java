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
	
	private Map<String,String> allSubjectMap;
	private List<SchoolSubjects> allSubjectList;
	private List<SchoolClass>  allSchoolClassList;
	Map<Integer,String> schoolClassMap;
	private String selectedSubjectCodes;
	private String calssSubjects;
	private String errorMessage;
	private boolean classOperationStatus;
	private String classCurrentOperation;
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
	public String getCalssSubjects() {
		return calssSubjects;
	}
	/**
	 * @param calssSubjects the calssSubjects to set
	 */
	public void setCalssSubjects(String calssSubjects) {
		this.calssSubjects = calssSubjects;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
	 * @return the classCurrentOperation
	 */
	public String getClassCurrentOperation() {
		return classCurrentOperation;
	}
	/**
	 * @param classCurrentOperation the classCurrentOperation to set
	 */
	public void setClassCurrentOperation(String classCurrentOperation) {
		this.classCurrentOperation = classCurrentOperation;
	}
}
