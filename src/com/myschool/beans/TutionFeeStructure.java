package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TUTION_FEE_STRUCTURE")
public class TutionFeeStructure implements Serializable{

@Column(name="TUTION_FEE_STRUCTURE_ID")
Integer tutionFeeStructureId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="AMOUNT_PER_INSTALMENT")
Integer amountPerInstalment;

@Column(name="NUMBER_OF_INSTALMENTS")
Integer numberOfInstalments;

@Column(name="TOTAL_TUTION_FEE")
Integer totalTutionFee;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getTutionFeeStructureId(){
 return tutionFeeStructureId;
}
public void setTutionFeeStructureId(Integer tutionFeeStructureId){
 this.tutionFeeStructureId=tutionFeeStructureId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public Integer getAmountPerInstalment(){
 return amountPerInstalment;
}
public void setAmountPerInstalment(Integer amountPerInstalment){
 this.amountPerInstalment=amountPerInstalment;
}
public Integer getNumberOfInstalments(){
 return numberOfInstalments;
}
public void setNumberOfInstalments(Integer numberOfInstalments){
 this.numberOfInstalments=numberOfInstalments;
}
public Integer getTotalTutionFee(){
 return totalTutionFee;
}
public void setTotalTutionFee(Integer totalTutionFee){
 this.totalTutionFee=totalTutionFee;
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