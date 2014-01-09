package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="GENERAL_HOLIDAY_LIST")
public class GeneralHolidayList implements Serializable{

@Column(name="GENERAL_HOLIDAY_ID")
Integer generalHolidayId;

@Column(name="GENERAL_HOLIDAY_FOR")
String generalHolidayFor;

@Column(name="GENERAL_HOLIDAY_FROM")
String generalHolidayFrom;

@Column(name="GENERAL_HOLIDAY_TO")
String generalHolidayTo;

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


public Integer getGeneralHolidayId(){
 return generalHolidayId;
}
public void setGeneralHolidayId(Integer generalHolidayId){
 this.generalHolidayId=generalHolidayId;
}
public String getGeneralHolidayFor(){
 return generalHolidayFor;
}
public void setGeneralHolidayFor(String generalHolidayFor){
 this.generalHolidayFor=generalHolidayFor;
}
public String getGeneralHolidayFrom(){
 return generalHolidayFrom;
}
public void setGeneralHolidayFrom(String generalHolidayFrom){
 this.generalHolidayFrom=generalHolidayFrom;
}
public String getGeneralHolidayTo(){
 return generalHolidayTo;
}
public void setGeneralHolidayTo(String generalHolidayTo){
 this.generalHolidayTo=generalHolidayTo;
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