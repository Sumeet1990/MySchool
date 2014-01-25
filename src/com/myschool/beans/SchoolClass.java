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
Integer schoolClassId;

@Column(name="SCHOOL_CLASS_NAME")
String schoolClassName;

@Column(name="MIN_AGE_CRITERIA")
Integer minAgeCriteria;

@Column(name="MAX_AGE_CRITERIA")
Integer maxAgeCriteria;

@Column(name="PERIODS_PER_DAY")
Integer periodsPerDay;

@Column(name="PERIOD_MINUTES_DURATION")
Integer periodMinutesDuration;

@Column(name="TEACHER_PERIODS_PER_DAY")
Integer teacherPeriodsPerDay;

@Column(name="SUBJECT_CODES")
String subjectCodes;

@Column(name="CLASS_MAXIMUM_STRENGTH")
Integer classMaximumStrength;

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