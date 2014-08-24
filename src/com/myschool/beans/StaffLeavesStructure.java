package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_LEAVES_STRUCTURE")
public class StaffLeavesStructure implements Serializable{

@Id
@Column(name="STAFF_LEAVES_STRUCTURE_ID")
private Integer stafftLeavesStructureId;

@Column(name="STAFF_LEAVE_TYPE")
private String staffLeaveType;

@Column(name="APPOINTMENT_TYPE_ID")
private Integer appointmentTypeId;

@Column(name="MAX_LEAVE_DAYS")
private Integer maxLeaveDays;

@Column(name="MAX_CONSECUTIVE_LEAVE_DAYS")
private String maxConsecutiveLeaveDays;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;

public Integer getStafftLeavesStructureId() {
	return stafftLeavesStructureId;
}
public void setStafftLeavesStructureId(Integer stafftLeavesStructureId) {
	this.stafftLeavesStructureId = stafftLeavesStructureId;
}
public String getStaffLeaveType(){
 return staffLeaveType;
}
public void setStaffLeaveType(String staffLeaveType){
 this.staffLeaveType=staffLeaveType;
}

public Integer getAppointmentTypeId() {
	return appointmentTypeId;
}
public void setAppointmentTypeId(Integer appointmentTypeId) {
	this.appointmentTypeId = appointmentTypeId;
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