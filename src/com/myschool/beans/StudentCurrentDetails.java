package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_CURRENT_DETAILS")
public class StudentCurrentDetails implements Serializable{

@Id
@Column(name="STUDENT_CURRENT_DETAILS_ID")
Integer studentCurrentDetailsId;

@Column(name="STUDENT_REGISTRATION_ID")
Integer studentRegistrationId;

@Column(name="STUDENT_ROLL_NO")
Integer studentRollNo;

@Column(name="CLASS_SECTION_ID")
Integer classSectionId;

@Column(name="FINAL_EXAM_RESULT")
String finalExamResult;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_TIME")
String modifiedDateAndTime;


public Integer getStudentCurrentDetailsId(){
 return studentCurrentDetailsId;
}
public void setStudentCurrentDetailsId(Integer studentCurrentDetailsId){
 this.studentCurrentDetailsId=studentCurrentDetailsId;
}
public Integer getStudentRegistrationId(){
 return studentRegistrationId;
}
public void setStudentRegistrationId(Integer studentRegistrationId){
 this.studentRegistrationId=studentRegistrationId;
}
public Integer getStudentRollNo(){
 return studentRollNo;
}
public void setStudentRollNo(Integer studentRollNo){
 this.studentRollNo=studentRollNo;
}
public Integer getClassSectionId(){
 return classSectionId;
}
public void setClassSectionId(Integer classSectionId){
 this.classSectionId=classSectionId;
}
public String getFinalExamResult(){
 return finalExamResult;
}
public void setFinalExamResult(String finalExamResult){
 this.finalExamResult=finalExamResult;
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