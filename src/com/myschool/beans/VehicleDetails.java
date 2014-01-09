package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_DETAILS")
public class VehicleDetails implements Serializable{

@Column(name="VEHICLE_DETAILS_ID")
Integer vehicleDetailsId;

@Column(name="VEHICLE_REG_NO")
String vehicleRegNo;

@Column(name="VEHICLE_RC_NO")
String vehicleRcNo;

@Column(name="POLUTION_DUE_DATE")
String polutionDueDate;

@Column(name="INSURANCE_DUE_DATE")
String insuranceDueDate;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="SEATION_CAPACITY_EXC_DRIVER")
String seationCapacityExcDriver;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getVehicleDetailsId(){
 return vehicleDetailsId;
}
public void setVehicleDetailsId(Integer vehicleDetailsId){
 this.vehicleDetailsId=vehicleDetailsId;
}
public String getVehicleRegNo(){
 return vehicleRegNo;
}
public void setVehicleRegNo(String vehicleRegNo){
 this.vehicleRegNo=vehicleRegNo;
}
public String getVehicleRcNo(){
 return vehicleRcNo;
}
public void setVehicleRcNo(String vehicleRcNo){
 this.vehicleRcNo=vehicleRcNo;
}
public String getPolutionDueDate(){
 return polutionDueDate;
}
public void setPolutionDueDate(String polutionDueDate){
 this.polutionDueDate=polutionDueDate;
}
public String getInsuranceDueDate(){
 return insuranceDueDate;
}
public void setInsuranceDueDate(String insuranceDueDate){
 this.insuranceDueDate=insuranceDueDate;
}
public String getCreatedUserId(){
 return createdUserId;
}
public void setCreatedUserId(String createdUserId){
 this.createdUserId=createdUserId;
}
public String getSeationCapacityExcDriver(){
 return seationCapacityExcDriver;
}
public void setSeationCapacityExcDriver(String seationCapacityExcDriver){
 this.seationCapacityExcDriver=seationCapacityExcDriver;
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