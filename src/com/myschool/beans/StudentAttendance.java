package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_ATTENDANCE")
public class StudentAttendance implements Serializable{

@Column(name="STUDENT_ATTENDANCE_ID")
Integer studentAttendanceId;

@Column(name="STUDENT_ROLL_NO")
String studentRollNo;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="STUDENT_LEAVES_ID")
Integer studentLeavesId;

@Column(name="REASON")
String reason;

@Column(name="LEAVE_FROM")
String leaveFrom;

@Column(name="LEAVE_TO		")
String leaveTo		;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
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
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public Integer getStudentLeavesId(){
 return studentLeavesId;
}
public void setStudentLeavesId(Integer studentLeavesId){
 this.studentLeavesId=studentLeavesId;
}
public String getReason(){
 return reason;
}
public void setReason(String reason){
 this.reason=reason;
}
public String getLeaveFrom(){
 return leaveFrom;
}
public void setLeaveFrom(String leaveFrom){
 this.leaveFrom=leaveFrom;
}
public String getLeaveTo		(){
 return leaveTo		;
}
public void setLeaveTo		(String leaveTo		){
 this.leaveTo		=leaveTo		;
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