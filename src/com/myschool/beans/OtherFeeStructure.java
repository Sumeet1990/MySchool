package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OTHER_FEE_STRUCTURE")
public class OtherFeeStructure implements Serializable{

@Column(name="OTHER_FEE_STRUCTURE_ID")
Integer otherFeeStructureId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="OTHER_FEE_NAME")
String otherFeeName;

@Column(name="OTHER_FEE_AMOUNT")
Integer otherFeeAmount;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getOtherFeeStructureId(){
 return otherFeeStructureId;
}
public void setOtherFeeStructureId(Integer otherFeeStructureId){
 this.otherFeeStructureId=otherFeeStructureId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public String getOtherFeeName(){
 return otherFeeName;
}
public void setOtherFeeName(String otherFeeName){
 this.otherFeeName=otherFeeName;
}
public Integer getOtherFeeAmount(){
 return otherFeeAmount;
}
public void setOtherFeeAmount(Integer otherFeeAmount){
 this.otherFeeAmount=otherFeeAmount;
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