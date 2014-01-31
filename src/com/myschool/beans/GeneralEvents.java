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
private Integer generalEventId;

@Column(name="GENERAL_EVENT_NAME")
private String generalEventName;

@Column(name="GENERAL_EVENT_FROM")
private String generalEventFrom;

@Column(name="GENERAL_EVENT_TO")
private String generalEventTo;

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