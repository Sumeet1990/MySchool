package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLASS_HOLIDAY_LIST")
public class ClassHolidayList implements Serializable{

@Id
@Column(name="CLASS_HOLIDAY_ID")
private Integer classHolidayId;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="LASS_HOLIDAY_FOR")
private String lassHolidayFor;

@Column(name="LASS_HOLIDAY_FROM")
private String lassHolidayFrom;

@Column(name="LASS_HOLIDAY_TO")
private String lassHolidayTo;

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


public Integer getClassHolidayId(){
 return classHolidayId;
}
public void setClassHolidayId(Integer classHolidayId){
 this.classHolidayId=classHolidayId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public String getLassHolidayFor(){
 return lassHolidayFor;
}
public void setLassHolidayFor(String lassHolidayFor){
 this.lassHolidayFor=lassHolidayFor;
}
public String getLassHolidayFrom(){
 return lassHolidayFrom;
}
public void setLassHolidayFrom(String lassHolidayFrom){
 this.lassHolidayFrom=lassHolidayFrom;
}
public String getLassHolidayTo(){
 return lassHolidayTo;
}
public void setLassHolidayTo(String lassHolidayTo){
 this.lassHolidayTo=lassHolidayTo;
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