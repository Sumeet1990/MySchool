package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEACHING_STAFF")
public class TeachingStaff implements Serializable{

@Id
@Column(name="TEACHING_STAFF_ID")
String teachingStaffId;

@Column(name="TEACHING_STAFF_TITLE")
String teachingStaffTitle;

@Column(name="TEACHING_STAFF_GIVEN_FULL_NAME")
String teachingStaffGivenFullName;

@Column(name="TEACHING_STAFF_SURNAME")
String teachingStaffSurname;

@Column(name="TEACHING_STAFF_DOB")
String teachingStaffDob;

@Column(name="TEACHING_STAFF_GENDER")
String teachingStaffGender;

@Column(name="TEACHING_STAFF_STATUS")
String teachingStaffStatus;

@Column(name="TEACHING_STAFF_QUALIFICATION")
String teachingStaffQualification;

@Column(name="TEACHING_STAFF_DESIGNATION")
String teachingStaffDesignation;

@Column(name="CLASS_TEACHER_FLAG")
String classTeacherFlag;

@Column(name="APPOINTMENT_TYPE")
String appointmentType;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;

public String getTeachingStaffId() {
	return teachingStaffId;
}

public void setTeachingStaffId(String teachingStaffId) {
	this.teachingStaffId = teachingStaffId;
}

public String getTeachingStaffTitle() {
	return teachingStaffTitle;
}

public void setTeachingStaffTitle(String teachingStaffTitle) {
	this.teachingStaffTitle = teachingStaffTitle;
}

public String getTeachingStaffGivenFullName() {
	return teachingStaffGivenFullName;
}

public void setTeachingStaffGivenFullName(String teachingStaffGivenFullName) {
	this.teachingStaffGivenFullName = teachingStaffGivenFullName;
}

public String getTeachingStaffSurname() {
	return teachingStaffSurname;
}

public void setTeachingStaffSurname(String teachingStaffSurname) {
	this.teachingStaffSurname = teachingStaffSurname;
}

public String getTeachingStaffDob() {
	return teachingStaffDob;
}

public void setTeachingStaffDob(String teachingStaffDob) {
	this.teachingStaffDob = teachingStaffDob;
}

public String getTeachingStaffGender() {
	return teachingStaffGender;
}

public void setTeachingStaffGender(String teachingStaffGender) {
	this.teachingStaffGender = teachingStaffGender;
}

public String getTeachingStaffStatus() {
	return teachingStaffStatus;
}

public void setTeachingStaffStatus(String teachingStaffStatus) {
	this.teachingStaffStatus = teachingStaffStatus;
}

public String getTeachingStaffQualification() {
	return teachingStaffQualification;
}

public void setTeachingStaffQualification(String teachingStaffQualification) {
	this.teachingStaffQualification = teachingStaffQualification;
}

public String getTeachingStaffDesignation() {
	return teachingStaffDesignation;
}

public void setTeachingStaffDesignation(String teachingStaffDesignation) {
	this.teachingStaffDesignation = teachingStaffDesignation;
}

public String getClassTeacherFlag() {
	return classTeacherFlag;
}

public void setClassTeacherFlag(String classTeacherFlag) {
	this.classTeacherFlag = classTeacherFlag;
}

public String getAppointmentType() {
	return appointmentType;
}

public void setAppointmentType(String appointmentType) {
	this.appointmentType = appointmentType;
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
