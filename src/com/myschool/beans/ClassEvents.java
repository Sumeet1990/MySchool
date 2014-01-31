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
private Integer classEventId;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="CLASS_EVENT_NAME")
private String classEventName;

@Column(name="CLASS_EVENT_FROM")
private String classEventFrom;

@Column(name="CLASS_EVENT_TO")
private String classEventTo;

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