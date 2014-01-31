package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EXAM_SUBJECT_SCHEDULE")
public class ExamSubjectSchedule implements Serializable{

@Id
@Column(name="EXAM_SUBJECT_SCHEDULE_ID")
private Integer examSubjectScheduleId;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="EXAM_NAME")
private String examName;

@Column(name="SUBJECT_NAME")
private String subjectName;

@Column(name="SUBJECT_EXAM_DATE")
private String subjectExamDate;

@Column(name="SYLLABUS")
private String syllabus;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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