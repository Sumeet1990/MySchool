package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GENERAL_HOLIDAY_LIST")
public class GeneralHolidayList implements Serializable{

@Id
@Column(name="GENERAL_HOLIDAY_ID")
private Integer generalHolidayId;

@Column(name="GENERAL_HOLIDAY_FOR")
private String generalHolidayFor;

@Column(name="GENERAL_HOLIDAY_FROM")
private String generalHolidayFrom;

@Column(name="GENERAL_HOLIDAY_TO")
private String generalHolidayTo;

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