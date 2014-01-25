package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GENERAL_EVENTS")
public class GeneralEvents implements Serializable{

@Id
@Column(name="GENERAL_EVENT_ID")
Integer generalEventId;

@Column(name="GENERAL_EVENT_NAME")
String generalEventName;

@Column(name="GENERAL_EVENT_FROM")
String generalEventFrom;

@Column(name="GENERAL_EVENT_TO")
String generalEventTo;

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


public Integer getGeneralEventId(){
 return generalEventId;
}
public void setGeneralEventId(Integer generalEventId){
 this.generalEventId=generalEventId;
}
public String getGeneralEventName(){
 return generalEventName;
}
public void setGeneralEventName(String generalEventName){
 this.generalEventName=generalEventName;
}
public String getGeneralEventFrom(){
 return generalEventFrom;
}
public void setGeneralEventFrom(String generalEventFrom){
 this.generalEventFrom=generalEventFrom;
}
public String getGeneralEventTo(){
 return generalEventTo;
}
public void setGeneralEventTo(String generalEventTo){
 this.generalEventTo=generalEventTo;
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