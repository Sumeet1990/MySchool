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
private Integer studentCurrentDetailsId;

@Column(name="STUDENT_REGISTRATION_ID")
private Integer studentRegistrationId;

@Column(name="STUDENT_ROLL_NO")
private Integer studentRollNo;

@Column(name="CLASS_SECTION_ID")
private Integer classSectionId;

@Column(name="FINAL_EXAM_RESULT")
private String finalExamResult;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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