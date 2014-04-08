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
private Integer studentAttendanceId;

@Column(name="STUDENT_ROLL_NO")
private String studentRollNo;

@Column(name="CLASS_SECTION_ID")
private Integer classSectionId;

@Column(name="LEAVE_ABSENT")
private String leaveAbsent;

@Column(name="LEAVE_ABESNT_REASON")
private String leaveAbesntReason;

@Column(name="LEAVE_ABSENT_FROM")
private String leaveAbsentFrom;

@Column(name="LEAVE_ABSENT_TO")
private String leaveAbsentTo;

@Column(name="NO_OF_DAYS")
private Integer noOfDays;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public String getLeaveAbesntReason(){
 return leaveAbesntReason;
}
public void setLeaveAbesntReason(String leaveAbesntReason){
 this.leaveAbesntReason=leaveAbesntReason;
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