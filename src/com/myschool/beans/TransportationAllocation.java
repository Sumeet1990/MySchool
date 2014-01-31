package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSPORTATION_ALLOCATION")
public class TransportationAllocation implements Serializable{

@Id
@Column(name="TRANSPORTATION_ALLOCATION_ID")
private Integer transportationAllocationId;

@Column(name="STUDENT_ROLL_NO")
private Integer studentRollNo;

@Column(name="STAFF_ID")
private Integer staffId;

@Column(name="ROUT_NO")
private String routNo;

@Column(name="TRANSPORT_START_DATE")
private String transportStartDate;

@Column(name="TRANSPORT_END_DATE")
private String transportEndDate;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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