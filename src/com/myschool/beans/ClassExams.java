package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLASS_EXAMS")
public class ClassExams implements Serializable{

@Id
@Column(name="CLASS_EXAMS_ID")
String classExamsId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="EXAM_NAME")
String examName;

@Column(name="EXAM_START_DATE")
String examStartDate;

@Column(name="EXAM_END_DATE")
String examEndDate;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_TIME")
String modifiedDateAndTime;


public String getClassExamsId(){
 return classExamsId;
}
public void setClassExamsId(String classExamsId){
 this.classExamsId=classExamsId;
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
public String getExamStartDate(){
 return examStartDate;
}
public void setExamStartDate(String examStartDate){
 this.examStartDate=examStartDate;
}
public String getExamEndDate(){
 return examEndDate;
}
public void setExamEndDate(String examEndDate){
 this.examEndDate=examEndDate;
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