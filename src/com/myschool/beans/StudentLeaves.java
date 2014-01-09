package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_LEAVES")
public class StudentLeaves implements Serializable{

@Column(name="STUDENT_LEAVES_ID")
Integer studentLeavesId;

@Column(name="STUDENT_LEAVE_TYPE")
String studentLeaveType;

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


public Integer getStudentLeavesId(){
 return studentLeavesId;
}
public void setStudentLeavesId(Integer studentLeavesId){
 this.studentLeavesId=studentLeavesId;
}
public String getStudentLeaveType(){
 return studentLeaveType;
}
public void setStudentLeaveType(String studentLeaveType){
 this.studentLeaveType=studentLeaveType;
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