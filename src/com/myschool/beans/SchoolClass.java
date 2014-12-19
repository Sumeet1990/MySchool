package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_CLASS")
public class SchoolClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@SequenceGenerator (name="seqSchoolClass", sequenceName="SEQ_SCHOOL_CLASS", allocationSize=1)
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqSchoolClass")
	@Column(name="SCHOOL_CLASS_ID")
	private Integer schoolClassId;
	
	@Column(name="SCHOOL_CLASS_NAME")
	private String schoolClassName;
	
	@Column(name="MIN_AGE_CRITERIA_IN_MONTHS")
	private Integer minAgeCriteriaInMin;
	
	@Column(name="MAX_AGE_CRITERIA_IN_MONTHS")
	private Integer maxAgeCriteriaInMin;
	
	@Column(name="PERIODS_PER_DAY")
	private Integer periodsPerDay;
	
	@Column(name="PERIOD_DURATION_IN_MINUTES")
	private Integer periodMinutesDurationInMin;
	
	@Column(name="TEACHER_PERIODS_PER_DAY")
	private Integer teacherPeriodsPerDay;
	
	@Column(name="SUBJECT_CODES_LIST")
	private String subjectCodesList;
	
	@Column(name="CLASS_MAXIMUM_STRENGTH")
	private Integer classMaximumStrength;
	
	@Column(name="CLASS_STATUS")
	private String classStatus;
	
	@Column(name="CREATED_USER_ID")
	private String createdUserId;
	
	@Column(name="MODIFIED_USER_ID")
	private String modifiedUserId;
	
	@Column(name="CREATED_DATE_TIME")
	private String createdDateTime;
	
	@Column(name="MODIFIED_DATE_TIME")
	private String modifiedDateTime;
	
	public Integer getSchoolClassId(){
	 return schoolClassId;
	}
	
	public void setSchoolClassId(Integer schoolClassId){
	 this.schoolClassId=schoolClassId;
	}
	
	public String getSchoolClassName(){
	 return schoolClassName;
	}
	
	public void setSchoolClassName(String schoolClassName){
	 this.schoolClassName=schoolClassName;
	}
	
	/**
	 * @return the minAgeCriteriaInMin
	 */
	public Integer getMinAgeCriteriaInMin() {
		return minAgeCriteriaInMin;
	}

	/**
	 * @param minAgeCriteriaInMin the minAgeCriteriaInMin to set
	 */
	public void setMinAgeCriteriaInMin(Integer minAgeCriteriaInMin) {
		this.minAgeCriteriaInMin = minAgeCriteriaInMin;
	}

	/**
	 * @return the maxAgeCriteriaInMin
	 */
	public Integer getMaxAgeCriteriaInMin() {
		return maxAgeCriteriaInMin;
	}

	/**
	 * @param maxAgeCriteriaInMin the maxAgeCriteriaInMin to set
	 */
	public void setMaxAgeCriteriaInMin(Integer maxAgeCriteriaInMin) {
		this.maxAgeCriteriaInMin = maxAgeCriteriaInMin;
	}

	public Integer getPeriodsPerDay(){
	 return periodsPerDay;
	}
	
	public void setPeriodsPerDay(Integer periodsPerDay){
	 this.periodsPerDay=periodsPerDay;
	}
	
	/**
	 * @return the periodMinutesDurationInMin
	 */
	public Integer getPeriodMinutesDurationInMin() {
		return periodMinutesDurationInMin;
	}

	/**
	 * @param periodMinutesDurationInMin the periodMinutesDurationInMin to set
	 */
	public void setPeriodMinutesDurationInMin(Integer periodMinutesDurationInMin) {
		this.periodMinutesDurationInMin = periodMinutesDurationInMin;
	}

	public Integer getTeacherPeriodsPerDay(){
	 return teacherPeriodsPerDay;
	}
	
	public void setTeacherPeriodsPerDay(Integer teacherPeriodsPerDay){
	 this.teacherPeriodsPerDay = teacherPeriodsPerDay;
	}
	
	public String getSubjectCodesList(){
	 return subjectCodesList;
	}
	
	public void setSubjectCodesList(String subjectCodesList){
	 this.subjectCodesList=subjectCodesList;
	}
	
	public Integer getClassMaximumStrength(){
	 return classMaximumStrength;
	}
	
	public void setClassMaximumStrength(Integer classMaximumStrength){
	 this.classMaximumStrength=classMaximumStrength;
	}
	
	public String getClassStatus(){
	 return classStatus;
	}
	
	public void setClassStatus(String classStatus){
	 this.classStatus=classStatus;
	}
	
	public String getCreatedUserId(){
	 return createdUserId;
	}
	
	public void setCreatedUserId(String createdUserId){
	 this.createdUserId=createdUserId;
	}
	
	public String getModifiedUserId(){
	 return modifiedUserId;
	}
	
	public void setModifiedUserId(String modifiedUserId){
	 this.modifiedUserId=modifiedUserId;
	}
	
	public String getCreatedDateTime(){
	 return createdDateTime;
	}
	
	public void setCreatedDateTime(String createdDateTime){
	 this.createdDateTime=createdDateTime;
	}
	
	public String getModifiedDateTime(){
	 return modifiedDateTime;
	}
	
	public void setModifiedDateTime(String modifiedDateTime){
	 this.modifiedDateTime=modifiedDateTime;
	}
}