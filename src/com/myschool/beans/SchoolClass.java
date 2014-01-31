package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_CLASS")
public class SchoolClass implements Serializable{

@Id
@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="SCHOOL_CLASS_NAME")
private String schoolClassName;

@Column(name="MIN_AGE_CRITERIA")
private Integer minAgeCriteria;

@Column(name="MAX_AGE_CRITERIA")
private Integer maxAgeCriteria;

@Column(name="PERIODS_PER_DAY")
private Integer periodsPerDay;

@Column(name="PERIOD_MINUTES_DURATION")
private Integer periodMinutesDuration;

@Column(name="TEACHER_PERIODS_PER_DAY")
private Integer teacherPeriodsPerDay;

@Column(name="SUBJECT_CODES")
private String subjectCodes;

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
public Integer getMinAgeCriteria(){
 return minAgeCriteria;
}
public void setMinAgeCriteria(Integer minAgeCriteria){
 this.minAgeCriteria=minAgeCriteria;
}
public Integer getMaxAgeCriteria(){
 return maxAgeCriteria;
}
public void setMaxAgeCriteria(Integer maxAgeCriteria){
 this.maxAgeCriteria=maxAgeCriteria;
}
public Integer getPeriodsPerDay(){
 return periodsPerDay;
}
public void setPeriodsPerDay(Integer periodsPerDay){
 this.periodsPerDay=periodsPerDay;
}
public Integer getPeriodMinutesDuration(){
 return periodMinutesDuration;
}
public void setPeriodMinutesDuration(Integer periodMinutesDuration){
 this.periodMinutesDuration=periodMinutesDuration;
}
public Integer getTeacherPeriodsPerDay(){
 return teacherPeriodsPerDay;
}
public void setTeacherPeriodsPerDay(Integer teacherPeriodsPerDay){
 this.teacherPeriodsPerDay=teacherPeriodsPerDay;
}
public String getSubjectCodes(){
 return subjectCodes;
}
public void setSubjectCodes(String subjectCodes){
 this.subjectCodes=subjectCodes;
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