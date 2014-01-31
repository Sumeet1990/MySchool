package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE_DETAILS")
public class VehicleDetails implements Serializable{

@Id
@Column(name="VEHICLE_DETAILS_ID")
private Integer vehicleDetailsId;

@Column(name="VEHICLE_REG_NO")
private String vehicleRegNo;

@Column(name="VEHICLE_RC_NO")
private String vehicleRcNo;

@Column(name="POLUTION_DUE_DATE")
private String polutionDueDate;

@Column(name="INSURANCE_DUE_DATE")
private String insuranceDueDate;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="SEATION_CAPACITY_EXC_DRIVER")
private String seationCapacityExcDriver;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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