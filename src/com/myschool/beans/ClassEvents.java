package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLASS_EVENTS")
public class ClassEvents implements Serializable{

@Id
@Column(name="CLASS_EVENT_ID")
Integer classEventId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="CLASS_EVENT_NAME")
String classEventName;

@Column(name="CLASS_EVENT_FROM")
String classEventFrom;

@Column(name="CLASS_EVENT_TO")
String classEventTo;

@Column(name="NO_OF_DAYS")
Integer noOfDays;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_TIME")
String modifiedDateAndTime;


public Integer getClassEventId(){
 return classEventId;
}
public void setClassEventId(Integer classEventId){
 this.classEventId=classEventId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public String getClassEventName(){
 return classEventName;
}
public void setClassEventName(String classEventName){
 this.classEventName=classEventName;
}
public String getClassEventFrom(){
 return classEventFrom;
}
public void setClassEventFrom(String classEventFrom){
 this.classEventFrom=classEventFrom;
}
public String getClassEventTo(){
 return classEventTo;
}
public void setClassEventTo(String classEventTo){
 this.classEventTo=classEventTo;
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