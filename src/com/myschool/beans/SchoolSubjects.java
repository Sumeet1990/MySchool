package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_SUBJECTS")
public class SchoolSubjects implements Serializable{

@Id
@Column(name="SCHOOL_SUBJECT_ID")
private Integer schoolSubjectId;

@Column(name="SUBJECT_CODE")
private String subjectCode;

@Column(name="SUBJECT_NAME")
private String subjectName;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


public Integer getSchoolSubjectId(){
 return schoolSubjectId;
}
public void setSchoolSubjectId(Integer schoolSubjectId){
 this.schoolSubjectId=schoolSubjectId;
}
public String getSubjectCode(){
 return subjectCode;
}
public void setSubjectCode(String subjectCode){
 this.subjectCode=subjectCode;
}
public String getSubjectName(){
 return subjectName;
}
public void setSubjectName(String subjectName){
 this.subjectName=subjectName;
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