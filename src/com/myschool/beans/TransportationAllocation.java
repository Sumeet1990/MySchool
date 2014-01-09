package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TRANSPORTATION_ALLOCATION")
public class TransportationAllocation implements Serializable{

@Column(name="TRANSPORTATION_ALLOCATION_ID")
Integer transportationAllocationId;

@Column(name="STUDENT_ROLL_NO")
Integer studentRollNo;

@Column(name="STAFF_ID")
Integer staffId;

@Column(name="ROUT_NO")
String routNo;

@Column(name="TRANSPORT_START_DATE")
String transportStartDate;

@Column(name="TRANSPORT_END_DATE")
String transportEndDate;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getTransportationAllocationId(){
 return transportationAllocationId;
}
public void setTransportationAllocationId(Integer transportationAllocationId){
 this.transportationAllocationId=transportationAllocationId;
}
public Integer getStudentRollNo(){
 return studentRollNo;
}
public void setStudentRollNo(Integer studentRollNo){
 this.studentRollNo=studentRollNo;
}
public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
}
public String getRoutNo(){
 return routNo;
}
public void setRoutNo(String routNo){
 this.routNo=routNo;
}
public String getTransportStartDate(){
 return transportStartDate;
}
public void setTransportStartDate(String transportStartDate){
 this.transportStartDate=transportStartDate;
}
public String getTransportEndDate(){
 return transportEndDate;
}
public void setTransportEndDate(String transportEndDate){
 this.transportEndDate=transportEndDate;
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