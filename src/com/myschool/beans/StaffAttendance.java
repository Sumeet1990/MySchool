package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_ATTENDANCE")
public class StaffAttendance implements Serializable{

@Id
@Column(name="STAFFT_ATTENDANCE_ID")
Integer stafftAttendanceId;

@Column(name="STAFF_ID")
Integer staffId;

@Column(name="STAFFT_LEAVES_ID")
Integer stafftLeavesId;

@Column(name="REASON")
String reason;

@Column(name="LEAVE_FROM")
String leaveFrom;

@Column(name="LEAVE_TO")
String leaveTo;

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


public Integer getStafftAttendanceId(){
 return stafftAttendanceId;
}
public void setStafftAttendanceId(Integer stafftAttendanceId){
 this.stafftAttendanceId=stafftAttendanceId;
}
public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
}
public Integer getStafftLeavesId(){
 return stafftLeavesId;
}
public void setStafftLeavesId(Integer stafftLeavesId){
 this.stafftLeavesId=stafftLeavesId;
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
public String getLeaveTo(){
 return leaveTo;
}
public void setLeaveTo(String leaveTo){
 this.leaveTo=leaveTo;
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