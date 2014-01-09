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
Integer classHolidayId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="LASS_HOLIDAY_FOR")
String lassHolidayFor;

@Column(name="LASS_HOLIDAY_FROM")
String lassHolidayFrom;

@Column(name="LASS_HOLIDAY_TO")
String lassHolidayTo;

@Column(name="NO_OF_DAYS")
Integer noOfDays;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


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