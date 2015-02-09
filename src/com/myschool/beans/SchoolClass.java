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
	private Integer minAgeCriteriaInMonths;
	
	@Column(name="MAX_AGE_CRITERIA_IN_MONTHS")
	private Integer maxAgeCriteriaInMonths;
	
	@Column(name="PERIODS_PER_DAY")
	private Integer periodsPerDay;
	
	@Column(name="PERIOD_DURATION_IN_MINUTES")
	private Integer periodDurationInMin;
	
	@Column(name="TEACHER_PERIODS_PER_DAY")
	private Integer teacherPeriodsPerDay;
	
	@Column(name="SUBJECT_CODES_LIST")
	private String subjectCodesList;
	
	@Column(name="CLASS_MAXIMUM_STRENGTH")
	private Integer classMaxStrength;
	
	@Column(name="CLASS_STATUS")
	private String classStatus;
	
	@Column(name="CLASS_INACTIVE_REASON")
	private String classInactiveReason;
	
	@Column(name="CREATED_USER_ID")
	private String createdUserId;
	
	@Column(name="MODIFIED_USER_ID")
	private String modifiedUserId;
	
	@Column(name="CREATED_DATE_TIME")
	private String createdDateTime;
	
	@Column(name="MODIFIED_DATE_TIME")
	private String modifiedDateTime;

	/**
	 * @return the schoolClassId
	 */
	public Integer getSchoolClassId() {
		return schoolClassId;
	}

	/**
	 * @param schoolClassId the schoolClassId to set
	 */
	public void setSchoolClassId(Integer schoolClassId) {
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
	public Integer getMinAgeCriteriaInMonths() {
		return minAgeCriteriaInMonths;
	}

	/**
	 * @param minAgeCriteriaInMonths the minAgeCriteriaInMonths to set
	 */
	public void setMinAgeCriteriaInMonths(Integer minAgeCriteriaInMonths) {
		this.minAgeCriteriaInMonths = minAgeCriteriaInMonths;
	}

	/**
	 * @return the maxAgeCriteriaInMonths
	 */
	public Integer getMaxAgeCriteriaInMonths() {
		return maxAgeCriteriaInMonths;
	}

	/**
	 * @param maxAgeCriteriaInMonths the maxAgeCriteriaInMonths to set
	 */
	public void setMaxAgeCriteriaInMonths(Integer maxAgeCriteriaInMonths) {
		this.maxAgeCriteriaInMonths = maxAgeCriteriaInMonths;
	}

	/**
	 * @return the periodsPerDay
	 */
	public Integer getPeriodsPerDay() {
		return periodsPerDay;
	}

	/**
	 * @param periodsPerDay the periodsPerDay to set
	 */
	public void setPeriodsPerDay(Integer periodsPerDay) {
		this.periodsPerDay = periodsPerDay;
	}

	/**
	 * @return the periodDurationInMin
	 */
	public Integer getPeriodDurationInMin() {
		return periodDurationInMin;
	}

	/**
	 * @param periodDurationInMin the periodDurationInMin to set
	 */
	public void setPeriodDurationInMin(Integer periodDurationInMin) {
		this.periodDurationInMin = periodDurationInMin;
	}

	/**
	 * @return the teacherPeriodsPerDay
	 */
	public Integer getTeacherPeriodsPerDay() {
		return teacherPeriodsPerDay;
	}

	/**
	 * @param teacherPeriodsPerDay the teacherPeriodsPerDay to set
	 */
	public void setTeacherPeriodsPerDay(Integer teacherPeriodsPerDay) {
		this.teacherPeriodsPerDay = teacherPeriodsPerDay;
	}

	/**
	 * @return the subjectCodesList
	 */
	public String getSubjectCodesList() {
		return subjectCodesList;
	}

	/**
	 * @param subjectCodesList the subjectCodesList to set
	 */
	public void setSubjectCodesList(String subjectCodesList) {
		this.subjectCodesList = subjectCodesList;
	}

	/**
	 * @return the classMaxStrength
	 */
	public Integer getClassMaxStrength() {
		return classMaxStrength;
	}

	/**
	 * @param classMaxStrength the classMaxStrength to set
	 */
	public void setClassMaxStrength(Integer classMaxStrength) {
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
	 * @return the createdUserId
	 */
	public String getCreatedUserId() {
		return createdUserId;
	}

	/**
	 * @param createdUserId the createdUserId to set
	 */
	public void setCreatedUserId(String createdUserId) {
		this.createdUserId = createdUserId;
	}

	/**
	 * @return the modifiedUserId
	 */
	public String getModifiedUserId() {
		return modifiedUserId;
	}

	/**
	 * @param modifiedUserId the modifiedUserId to set
	 */
	public void setModifiedUserId(String modifiedUserId) {
		this.modifiedUserId = modifiedUserId;
	}

	/**
	 * @return the createdDateTime
	 */
	public String getCreatedDateTime() {
		return createdDateTime;
	}

	/**
	 * @param createdDateTime the createdDateTime to set
	 */
	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	/**
	 * @return the modifiedDateTime
	 */
	public String getModifiedDateTime() {
		return modifiedDateTime;
	}

	/**
	 * @param modifiedDateTime the modifiedDateTime to set
	 */
	public void setModifiedDateTime(String modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}
}