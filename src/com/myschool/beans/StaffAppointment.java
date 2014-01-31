package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_APPOINTMENT")
public class StaffAppointment implements Serializable{

@Id
@Column(name="APPOINTMENT_TYPE_ID")
private Integer appointmentTypeId;

@Column(name="APPOINTMENT_TYPE")
private String appointmentType;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


public Integer getAppointmentTypeId(){
 return appointmentTypeId;
}
public void setAppointmentTypeId(Integer appointmentTypeId){
 this.appointmentTypeId=appointmentTypeId;
}
public String getAppointmentType(){
 return appointmentType;
}
public void setAppointmentType(String appointmentType){
 this.appointmentType=appointmentType;
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