package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_DETAILS")
public class StaffDetails implements Serializable{

@Id
@Column(name="STAFF_ID")
private Integer staffId;

@Column(name="STAFF_TITLE")
private String staffTitle;

@Column(name="STAFF_GIVEN_FULL_NAME")
private String staffGivenFullName;

@Column(name="STAFF_SURNAME")
private String staffSurname;

@Column(name="STAFF_DOB")
private String staffDob;

@Column(name="STAFF_GENDER")
private String staffGender;

@Column(name="STAFF_QUALIFICATION")
private String staffQualification;

@Column(name="STAFF_DESIGNATION")
private String staffDesignation;

@Column(name="TEACHER_STAFF_FLAG")
private String teacherStaffFlag;

@Column(name="CLASS_TEACHER_FLAG")
private String classTeacherFlag;

@Column(name="SUBJECT_CODES_LIST")
private String subjectCodesList;

@Column(name="APPOINTMENT_TYPE_ID")
private Integer appointmentTypeId;

@Column(name="STAFF_ADDRESS_ID")
private Integer staffAddressId;

@Column(name="PHOTO")
private String photo;

@Column(name="STAFF_STATUS")
private String staffStatus;

@Column(name="STAFF_INACTIVE_REASON")
private String staffInactiveReason;

@Column(name="STAFF_INACTIVE_DATE_TIME")
private String staffInactiveDateTime;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
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
public String getSubjectCodesList(){
 return subjectCodesList;
}
public void setSubjectCodesList(String subjectCodesList){
 this.subjectCodesList=subjectCodesList;
}
public Integer getAppointmentTypeId(){
 return appointmentTypeId;
}
public void setAppointmentTypeId(Integer appointmentTypeId){
 this.appointmentTypeId=appointmentTypeId;
}
public Integer getStaffAddressId(){
 return staffAddressId;
}
public void setStaffAddressId(Integer staffAddressId){
 this.staffAddressId=staffAddressId;
}
public String getPhoto(){
 return photo;
}
public void setPhoto(String photo){
 this.photo=photo;
}
public String getStaffStatus(){
 return staffStatus;
}
public void setStaffStatus(String staffStatus){
 this.staffStatus=staffStatus;
}
public String getStaffInactiveReason(){
 return staffInactiveReason;
}
public void setStaffInactiveReason(String staffInactiveReason){
 this.staffInactiveReason=staffInactiveReason;
}
public String getStaffInactiveDateTime(){
 return staffInactiveDateTime;
}
public void setStaffInactiveDateTime(String staffInactiveDateTime){
 this.staffInactiveDateTime=staffInactiveDateTime;
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