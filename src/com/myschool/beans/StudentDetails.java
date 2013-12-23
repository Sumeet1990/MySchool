package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DETAILS")
public class StudentDetails implements Serializable{

@Id
@Column(name="STUDENT_ROLL_NO")
String studentRollNo;

@Column(name="STUDENT_TITLE")
String studentTitle;

@Column(name="STUDENT_GIVEN_FULL_NAME")
String studentGivenFullName;

@Column(name="STUDENT_SURNAME")
String studentSurname;

@Column(name="STUDENT_DOB")
String studentDob;

@Column(name="STUDENT_GENDER")
String studentGender;

@Column(name="STUDENT_FATHER_NAME")
String studentFatherName;

@Column(name="STUDENT_MOTHER_NAME")
String studentMotherName;

@Column(name="STUDENT_GUARDIAN_NAME")
String studentGuardianName;

@Column(name="STUDENT_CLASS")
String studentClass;

@Column(name="STUDENT_SECTION")
String studentSection;

@Column(name="STUDENT_CLASS_TEACHER")
String studentClassTeacher;

@Column(name="STUDENT_STATUS")
String studentStatus;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;

public String getStudentRollNo() {
	return studentRollNo;
}

public void setStudentRollNo(String studentRollNo) {
	this.studentRollNo = studentRollNo;
}

public String getStudentTitle() {
	return studentTitle;
}

public void setStudentTitle(String studentTitle) {
	this.studentTitle = studentTitle;
}

public String getStudentGivenFullName() {
	return studentGivenFullName;
}

public void setStudentGivenFullName(String studentGivenFullName) {
	this.studentGivenFullName = studentGivenFullName;
}

public String getStudentSurname() {
	return studentSurname;
}

public void setStudentSurname(String studentSurname) {
	this.studentSurname = studentSurname;
}

public String getStudentDob() {
	return studentDob;
}

public void setStudentDob(String studentDob) {
	this.studentDob = studentDob;
}

public String getStudentGender() {
	return studentGender;
}

public void setStudentGender(String studentGender) {
	this.studentGender = studentGender;
}

public String getStudentFatherName() {
	return studentFatherName;
}

public void setStudentFatherName(String studentFatherName) {
	this.studentFatherName = studentFatherName;
}

public String getStudentMotherName() {
	return studentMotherName;
}

public void setStudentMotherName(String studentMotherName) {
	this.studentMotherName = studentMotherName;
}

public String getStudentGuardianName() {
	return studentGuardianName;
}

public void setStudentGuardianName(String studentGuardianName) {
	this.studentGuardianName = studentGuardianName;
}

public String getStudentClass() {
	return studentClass;
}

public void setStudentClass(String studentClass) {
	this.studentClass = studentClass;
}

public String getStudentSection() {
	return studentSection;
}

public void setStudentSection(String studentSection) {
	this.studentSection = studentSection;
}

public String getStudentClassTeacher() {
	return studentClassTeacher;
}

public void setStudentClassTeacher(String studentClassTeacher) {
	this.studentClassTeacher = studentClassTeacher;
}

public String getStudentStatus() {
	return studentStatus;
}

public void setStudentStatus(String studentStatus) {
	this.studentStatus = studentStatus;
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
