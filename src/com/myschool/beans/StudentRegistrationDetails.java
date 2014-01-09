package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_REGISTRATION_DETAILS")
public class StudentRegistrationDetails implements Serializable{

@Column(name="STUDENT_REG_DETAILS_ID")
Integer studentRegDetailsId;

@Column(name="STUDENT_REGISTRATION_ID")
Integer studentRegistrationId;

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

@Column(name="MOTHER_TOUNGE")
String motherTounge;

@Column(name="STUDENT_FATHER_NAME")
String studentFatherName;

@Column(name="STUDENT_MOTHER_NAME")
String studentMotherName;

@Column(name="STUDENT_GUARDIAN_NAME")
String studentGuardianName;

@Column(name="ADMISSION_CLASS")
String admissionClass;

@Column(name="ADMISSION_SECTION")
String admissionSection;

@Column(name="STUDENT_CLASS_TEACHER")
String studentClassTeacher;

@Column(name="STUDENT_STATUS")
String studentStatus;

@Column(name="STUDENT_ADDRESS_ID")
Integer studentAddressId;

@Column(name="ADMISSION_DATE")
String admissionDate;

@Column(name="PHOTO")photo;

@Column(name="TRANSPORTATION_REQUIRED")
Integer transportationRequired;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getStudentRegDetailsId(){
 return studentRegDetailsId;
}
public void setStudentRegDetailsId(Integer studentRegDetailsId){
 this.studentRegDetailsId=studentRegDetailsId;
}
public Integer getStudentRegistrationId(){
 return studentRegistrationId;
}
public void setStudentRegistrationId(Integer studentRegistrationId){
 this.studentRegistrationId=studentRegistrationId;
}
public String getStudentTitle(){
 return studentTitle;
}
public void setStudentTitle(String studentTitle){
 this.studentTitle=studentTitle;
}
public String getStudentGivenFullName(){
 return studentGivenFullName;
}
public void setStudentGivenFullName(String studentGivenFullName){
 this.studentGivenFullName=studentGivenFullName;
}
public String getStudentSurname(){
 return studentSurname;
}
public void setStudentSurname(String studentSurname){
 this.studentSurname=studentSurname;
}
public String getStudentDob(){
 return studentDob;
}
public void setStudentDob(String studentDob){
 this.studentDob=studentDob;
}
public String getStudentGender(){
 return studentGender;
}
public void setStudentGender(String studentGender){
 this.studentGender=studentGender;
}
public String getMotherTounge(){
 return motherTounge;
}
public void setMotherTounge(String motherTounge){
 this.motherTounge=motherTounge;
}
public String getStudentFatherName(){
 return studentFatherName;
}
public void setStudentFatherName(String studentFatherName){
 this.studentFatherName=studentFatherName;
}
public String getStudentMotherName(){
 return studentMotherName;
}
public void setStudentMotherName(String studentMotherName){
 this.studentMotherName=studentMotherName;
}
public String getStudentGuardianName(){
 return studentGuardianName;
}
public void setStudentGuardianName(String studentGuardianName){
 this.studentGuardianName=studentGuardianName;
}
public String getAdmissionClass(){
 return admissionClass;
}
public void setAdmissionClass(String admissionClass){
 this.admissionClass=admissionClass;
}
public String getAdmissionSection(){
 return admissionSection;
}
public void setAdmissionSection(String admissionSection){
 this.admissionSection=admissionSection;
}
public String getStudentClassTeacher(){
 return studentClassTeacher;
}
public void setStudentClassTeacher(String studentClassTeacher){
 this.studentClassTeacher=studentClassTeacher;
}
public String getStudentStatus(){
 return studentStatus;
}
public void setStudentStatus(String studentStatus){
 this.studentStatus=studentStatus;
}
public Integer getStudentAddressId(){
 return studentAddressId;
}
public void setStudentAddressId(Integer studentAddressId){
 this.studentAddressId=studentAddressId;
}
public String getAdmissionDate(){
 return admissionDate;
}
public void setAdmissionDate(String admissionDate){
 this.admissionDate=admissionDate;
}
public Integer getTransportationRequired(){
 return transportationRequired;
}
public void setTransportationRequired(Integer transportationRequired){
 this.transportationRequired=transportationRequired;
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