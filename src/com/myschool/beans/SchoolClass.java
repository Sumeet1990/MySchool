package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_CLASS")
public class SchoolClass implements Serializable{

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="SCHOOL_CLASS_NAME")
String schoolClassName;

@Column(name="PERIODS_PER_DAY")
Integer periodsPerDay;

@Column(name="PERIOD_DURATION")
Integer periodDuration;

@Column(name="TEACHER_PERIODS_PER_DAY")
Integer teacherPeriodsPerDay;

@Column(name="MIN_AGE_CRITERIA")
Integer minAgeCriteria;

@Column(name="MAX_AGE_CRITERIA")
Integer maxAgeCriteria;

@Column(name="AGE_CRITERIA_MEASURE")
String ageCriteriaMeasure;

@Column(name="SUBJECT_CODES")
String subjectCodes;

@Column(name="MAXIMUM_STRENGTH")
Integer maximumStrength;

@Column(name="CLASS_STATUS")
String classStatus;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


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
public Integer getPeriodsPerDay(){
 return periodsPerDay;
}
public void setPeriodsPerDay(Integer periodsPerDay){
 this.periodsPerDay=periodsPerDay;
}
public Integer getPeriodDuration(){
 return periodDuration;
}
public void setPeriodDuration(Integer periodDuration){
 this.periodDuration=periodDuration;
}
public Integer getTeacherPeriodsPerDay(){
 return teacherPeriodsPerDay;
}
public void setTeacherPeriodsPerDay(Integer teacherPeriodsPerDay){
 this.teacherPeriodsPerDay=teacherPeriodsPerDay;
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
public String getAgeCriteriaMeasure(){
 return ageCriteriaMeasure;
}
public void setAgeCriteriaMeasure(String ageCriteriaMeasure){
 this.ageCriteriaMeasure=ageCriteriaMeasure;
}
public String getSubjectCodes(){
 return subjectCodes;
}
public void setSubjectCodes(String subjectCodes){
 this.subjectCodes=subjectCodes;
}
public Integer getMaximumStrength(){
 return maximumStrength;
}
public void setMaximumStrength(Integer maximumStrength){
 this.maximumStrength=maximumStrength;
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
public String getCreatedDateAndTime(){
 return createdDateAndTime;
}
public void setCreatedDateAndTime(String createdDateAndTime){
 this.createdDateAndTime=createdDateAndTime;
}
public String getModifiedDateAndTime(){
 return modifiedDateAndTime;
}
public void setModifiedDateAndTime(String modifiedDateAndTime){
 this.modifiedDateAndTime=modifiedDateAndTime;
}
}