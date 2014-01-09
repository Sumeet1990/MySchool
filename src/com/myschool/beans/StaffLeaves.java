package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_LEAVES")
public class StaffLeaves implements Serializable{

@Column(name="STAFFT_LEAVES_ID")
Integer stafftLeavesId;

@Column(name="STAFF_LEAVE_TYPE")
String staffLeaveType;

@Column(name="MAX_LEAVE_DAYS")
Integer maxLeaveDays;

@Column(name="MAX_CONSECUTIVE_LEAVE_DAYS")
String maxConsecutiveLeaveDays;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getStafftLeavesId(){
 return stafftLeavesId;
}
public void setStafftLeavesId(Integer stafftLeavesId){
 this.stafftLeavesId=stafftLeavesId;
}
public String getStaffLeaveType(){
 return staffLeaveType;
}
public void setStaffLeaveType(String staffLeaveType){
 this.staffLeaveType=staffLeaveType;
}
public Integer getMaxLeaveDays(){
 return maxLeaveDays;
}
public void setMaxLeaveDays(Integer maxLeaveDays){
 this.maxLeaveDays=maxLeaveDays;
}
public String getMaxConsecutiveLeaveDays(){
 return maxConsecutiveLeaveDays;
}
public void setMaxConsecutiveLeaveDays(String maxConsecutiveLeaveDays){
 this.maxConsecutiveLeaveDays=maxConsecutiveLeaveDays;
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