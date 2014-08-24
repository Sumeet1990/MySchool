package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_LEAVES")
public class StaffLeaves implements Serializable{

@Id
@Column(name="STAFFT_LEAVES_ID")
private Integer stafftLeavesId;

@Column(name="STAFF_ID")
private Integer staffId;

@Column(name="STAFFT_LEAVES_STRUCTURE_ID")
private Integer stafftLeavesStructureId;

@Column(name="REASON")
private String reason;

@Column(name="LEAVE_FROM")
private String leaveFrom;

@Column(name="LEAVE_TO")
private String leaveTo;

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


public Integer getStafftLeavesId(){
 return stafftLeavesId;
}
public void setStafftLeavesId(Integer stafftLeavesId){
 this.stafftLeavesId=stafftLeavesId;
}
public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
}
public Integer getStafftLeavesStructureId() {
	return stafftLeavesStructureId;
}
public void setStafftLeavesStructureId(Integer stafftLeavesStructureId) {
	this.stafftLeavesStructureId = stafftLeavesStructureId;
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