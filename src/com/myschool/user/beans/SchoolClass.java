package com.myschool.user.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_CLASS")
public class SchoolClass implements Serializable{

@Id
@Column(name="CLASS_ID")
String classId;

@Column(name="CLASS_NAME")
String className;

@Column(name="SECTION")
String section;

@Column(name="TEACHING_STAFF_ID")
String teachingStaffId;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;

public String getClassId() {
	return classId;
}

public void setClassId(String classId) {
	this.classId = classId;
}

public String getClassName() {
	return className;
}

public void setClassName(String className) {
	this.className = className;
}

public String getSection() {
	return section;
}

public void setSection(String section) {
	this.section = section;
}

public String getTeachingStaffId() {
	return teachingStaffId;
}

public void setTeachingStaffId(String teachingStaffId) {
	this.teachingStaffId = teachingStaffId;
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
