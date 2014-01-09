package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_DETAILS")
public class StaffDetails implements Serializable{

@Column(name="STAFF_ID")
Integer staffId;

@Column(name="STAFF_REGISTRATION_ID")
Integer staffRegistrationId;

@Column(name="STAFF_TITLE")
String staffTitle;

@Column(name="STAFF_GIVEN_FULL_NAME")
String staffGivenFullName;

@Column(name="STAFF_SURNAME")
String staffSurname;

@Column(name="STAFF_DOB")
String staffDob;

@Column(name="STAFF_GENDER")
String staffGender;

@Column(name="STAFF_STATUS")
String staffStatus;

@Column(name="STAFF_QUALIFICATION")
String staffQualification;

@Column(name="STAFF_DESIGNATION")
String staffDesignation;

@Column(name="TEACHER_STAFF_FLAG")
String teacherStaffFlag;

@Column(name="CLASS_TEACHER_FLAG")
String classTeacherFlag;

@Column(name="SUBJECT_CODES")
String subjectCodes;

@Column(name="APPOINTMENT_TYPE_ID")
Integer appointmentTypeId;

@Column(name="PHOTO")
String photo;

@Column(name="STAFF_ADDRESS_ID")
Integer staffAddressId;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
}
public Integer getStaffRegistrationId(){
 return staffRegistrationId;
}
public void setStaffRegistrationId(Integer staffRegistrationId){
 this.staffRegistrationId=staffRegistrationId;
}
public String getStaffTitle(){
 return staffTitle;
}
public void setStaffTitle(String staffTitle){
 this.staffTitle=staffTitle;
}
public String getStaffGivenFullName(){
 return staffGivenFullName;
}
public void setStaffGivenFullName(String staffGivenFullName){
 this.staffGivenFullName=staffGivenFullName;
}
public String getStaffSurname(){
 return staffSurname;
}
public void setStaffSurname(String staffSurname){
 this.staffSurname=staffSurname;
}
public String getStaffDob(){
 return staffDob;
}
public void setStaffDob(String staffDob){
 this.staffDob=staffDob;
}
public String getStaffGender(){
 return staffGender;
}
public void setStaffGender(String staffGender){
 this.staffGender=staffGender;
}
public String getStaffStatus(){
 return staffStatus;
}
public void setStaffStatus(String staffStatus){
 this.staffStatus=staffStatus;
}
public String getStaffQualification(){
 return staffQualification;
}
public void setStaffQualification(String staffQualification){
 this.staffQualification=staffQualification;
}
public String getStaffDesignation(){
 return staffDesignation;
}
public void setStaffDesignation(String staffDesignation){
 this.staffDesignation=staffDesignation;
}
public String getTeacherStaffFlag(){
 return teacherStaffFlag;
}
public void setTeacherStaffFlag(String teacherStaffFlag){
 this.teacherStaffFlag=teacherStaffFlag;
}
public String getClassTeacherFlag(){
 return classTeacherFlag;
}
public void setClassTeacherFlag(String classTeacherFlag){
 this.classTeacherFlag=classTeacherFlag;
}
public String getSubjectCodes(){
 return subjectCodes;
}
public void setSubjectCodes(String subjectCodes){
 this.subjectCodes=subjectCodes;
}
public Integer getAppointmentTypeId(){
 return appointmentTypeId;
}
public void setAppointmentTypeId(Integer appointmentTypeId){
 this.appointmentTypeId=appointmentTypeId;
}
public String getPhoto(){
 return photo;
}
public void setPhoto(String photo){
 this.photo=photo;
}
public Integer getStaffAddressId(){
 return staffAddressId;
}
public void setStaffAddressId(Integer staffAddressId){
 this.staffAddressId=staffAddressId;
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