package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EXAM_SUBJECT_SCHEDULE")
public class ExamSubjectSchedule implements Serializable{

@Column(name="EXAM_SUBJECT_SCHEDULE_ID")
Integer examSubjectScheduleId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="EXAM_NAME")
String examName;

@Column(name="SUBJECT_NAME")
String subjectName;

@Column(name="SUBJECT_EXAM_DATE")
String subjectExamDate;

@Column(name="SYLLABUS")
String syllabus;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getExamSubjectScheduleId(){
 return examSubjectScheduleId;
}
public void setExamSubjectScheduleId(Integer examSubjectScheduleId){
 this.examSubjectScheduleId=examSubjectScheduleId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public String getExamName(){
 return examName;
}
public void setExamName(String examName){
 this.examName=examName;
}
public String getSubjectName(){
 return subjectName;
}
public void setSubjectName(String subjectName){
 this.subjectName=subjectName;
}
public String getSubjectExamDate(){
 return subjectExamDate;
}
public void setSubjectExamDate(String subjectExamDate){
 this.subjectExamDate=subjectExamDate;
}
public String getSyllabus(){
 return syllabus;
}
public void setSyllabus(String syllabus){
 this.syllabus=syllabus;
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