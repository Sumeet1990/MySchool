package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_REGISTRATION")
public class StudentRegistration implements Serializable{

@Id
@Column(name="STUDENT_REG_DETAILS_ID")
private Integer studentRegDetailsId;

@Column(name="STUDENT_REGISTRATION_ID")
private Integer studentRegistrationId;

@Column(name="STUDENT_TITLE")
private String studentTitle;

@Column(name="STUDENT_GIVEN_FULL_NAME")
private String studentGivenFullName;

@Column(name="STUDENT_SURNAME")
private String studentSurname;

@Column(name="STUDENT_DOB")
private String studentDob;

@Column(name="STUDENT_GENDER")
private String studentGender;

@Column(name="MOTHER_TOUNGE")
private String motherTounge;

@Column(name="STUDENT_FATHER_NAME")
private String studentFatherName;

@Column(name="STUDENT_MOTHER_NAME")
private String studentMotherName;

@Column(name="STUDENT_GUARDIAN_NAME")
private String studentGuardianName;

@Column(name="ADMISSION_CLASS")
private String admissionClass;

@Column(name="ADMISSION_SECTION")
private String admissionSection;

@Column(name="STUDENT_CLASS_TEACHER")
private String studentClassTeacher;

@Column(name="STUDENT_STATUS")
private String studentStatus;

@Column(name="STUDENT_ADDRESS_ID")
private Integer studentAddressId;

@Column(name="ADMISSION_DATE")
private String admissionDate;

@Column(name="PHOTO")
private String photo;

@Column(name="TRANSPORTATION_REQUIRED")
private Integer transportationRequired;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public String getPhoto(){
 return photo;
}
public void setPhoto(String photo){
 this.photo=photo;
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