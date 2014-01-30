package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_ATTENDANCE")
public class StudentAttendance implements Serializable{

@Id
@Column(name="STUDENT_ATTENDANCE_ID")
Integer studentAttendanceId;

@Column(name="STUDENT_ROLL_NO")
String studentRollNo;

@Column(name="CLASS_SECTION_ID")
Integer classSectionId;

@Column(name="LEAVE_ABSENT")
String leaveAbsent;

@Column(name="REASON")
String reason;

@Column(name="LEAVE_ABSENT_FROM")
String leaveAbsentFrom;

@Column(name="LEAVE_ABSENT_TO")
String leaveAbsentTo;

@Column(name="NO_OF_DAYS")
Integer noOfDays;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_TIME")
String modifiedDateAndTime;


public Integer getStudentAttendanceId(){
 return studentAttendanceId;
}
public void setStudentAttendanceId(Integer studentAttendanceId){
 this.studentAttendanceId=studentAttendanceId;
}
public String getStudentRollNo(){
 return studentRollNo;
}
public void setStudentRollNo(String studentRollNo){
 this.studentRollNo=studentRollNo;
}
public Integer getClassSectionId(){
 return classSectionId;
}
public void setClassSectionId(Integer classSectionId){
 this.classSectionId=classSectionId;
}
public String getLeaveAbsent(){
 return leaveAbsent;
}
public void setLeaveAbsent(String leaveAbsent){
 this.leaveAbsent=leaveAbsent;
}
public String getReason(){
 return reason;
}
public void setReason(String reason){
 this.reason=reason;
}
public String getLeaveAbsentFrom(){
 return leaveAbsentFrom;
}
public void setLeaveAbsentFrom(String leaveAbsentFrom){
 this.leaveAbsentFrom=leaveAbsentFrom;
}
public String getLeaveAbsentTo(){
 return leaveAbsentTo;
}
public void setLeaveAbsentTo(String leaveAbsentTo){
 this.leaveAbsentTo=leaveAbsentTo;
}
public Integer getNoOfDays(){
 return noOfDays;
}
public void setNoOfDays(Integer noOfDays){
 this.noOfDays=noOfDays;
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