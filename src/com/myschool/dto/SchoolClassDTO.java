package com.myschool.dto;

import java.util.List;
import java.util.Map;

import com.myschool.beans.SchoolClass;
import com.myschool.beans.SchoolSubjects;

public class SchoolClassDTO {
	private Map<String,String> allSubjectMap;
	private List<SchoolSubjects>  allSubjectList;
	private List<SchoolClass>  allSchoolClassList;
	Map<Integer,String> schoolClassMap;
	private String selectedSubjectCodes;
	private String schoolClassName;
	private String minAgeCriteriaInMin;
	private String maxAgeCriteriaInMin;
	private String teacherPeriodsPerDay;
	private String periodMinutesDurationInMin;
	private String maxStrengthOfClass;
	private String statusClass;
	private String schoolClassId;
	private String errorMessage;
	private boolean classOperationStatus;
	private String periodsPerDay;
	private String classCurrentOperation;
	private String classStatus;
	
	public String getSchoolClassId() {
		return schoolClassId;
	}
	
	public void setSchoolClassId(String schoolClassId) {
		this.schoolClassId = schoolClassId;
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
	 * @return the minAgeCriteriaInMin
	 */
	public String getMinAgeCriteriaInMin() {
		return minAgeCriteriaInMin;
	}

	/**
	 * @param minAgeCriteriaInMin the minAgeCriteriaInMin to set
	 */
	public void setMinAgeCriteriaInMin(String minAgeCriteriaInMin) {
		this.minAgeCriteriaInMin = minAgeCriteriaInMin;
	}

	/**
	 * @return the maxAgeCriteriaInMin
	 */
	public String getMaxAgeCriteriaInMin() {
		return maxAgeCriteriaInMin;
	}

	/**
	 * @param maxAgeCriteriaInMin the maxAgeCriteriaInMin to set
	 */
	public void setMaxAgeCriteriaInMin(String maxAgeCriteriaInMin) {
		this.maxAgeCriteriaInMin = maxAgeCriteriaInMin;
	}

	/**
	 * @return the periodMinutesDurationInMin
	 */
	public String getPeriodMinutesDurationInMin() {
		return periodMinutesDurationInMin;
	}

	/**
	 * @param periodMinutesDurationInMin the periodMinutesDurationInMin to set
	 */
	public void setPeriodMinutesDurationInMin(String periodMinutesDurationInMin) {
		this.periodMinutesDurationInMin = periodMinutesDurationInMin;
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

	public Map<String,String> getAllSubjectMap() {
		return allSubjectMap;
	}
	
	public void setAllSubjectMap(Map<String,String> allSubjectMap) {
		this.allSubjectMap = allSubjectMap;
	}
	
	public List<SchoolSubjects> getAllSubjectList() {
		return allSubjectList;
	}
	
	public void setAllSubjectList(List<SchoolSubjects> allSubjectList) {
		this.allSubjectList = allSubjectList;
	}
	
	public String getSelectedSubjectCodes() {
		return selectedSubjectCodes;
	}
	
	public void setSelectedSubjectCodes(String selectedSubjectCodes) {
		this.selectedSubjectCodes = selectedSubjectCodes;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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
}
