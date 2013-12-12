package com.myschool.user.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLASS_SUBJECTS")
public class ClassSubjects implements Serializable{

@Id
@Column(name="SUBJECT_ID")
String subjectId;

@Column(name="CLASS_NAME")
String className;

@Column(name="SUBJECT_CODES")
String subjectCodes;

@Column(name="TOTAL SUBJECTS")
Integer totalSubjects;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;

public String getSubjectId() {
	return subjectId;
}

public void setSubjectId(String subjectId) {
	this.subjectId = subjectId;
}

public String getClassName() {
	return className;
}

public void setClassName(String className) {
	this.className = className;
}

public String getSubjectCodes() {
	return subjectCodes;
}

public void setSubjectCodes(String subjectCodes) {
	this.subjectCodes = subjectCodes;
}

public Integer getTotalSubjects() {
	return totalSubjects;
}

public void setTotalSubjects(Integer totalSubjects) {
	this.totalSubjects = totalSubjects;
}

public String getCreatedUserId() {
	return createdUserId;
}

public void setCreatedUserId(String createdUserId) {
	this.createdUserId = createdUserId;
}

public String getModifiedUserId() {
	return modifiedUserId;
}

public void setModifiedUserId(String modifiedUserId) {
	this.modifiedUserId = modifiedUserId;
}

public String getCreatedDateAndTime() {
	return createdDateAndTime;
}

public void setCreatedDateAndTime(String createdDateAndTime) {
	this.createdDateAndTime = createdDateAndTime;
}

public String getModifiedDateAndTime() {
	return modifiedDateAndTime;
}

public void setModifiedDateAndTime(String modifiedDateAndTime) {
	this.modifiedDateAndTime = modifiedDateAndTime;
}

}
