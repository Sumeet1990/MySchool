package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLASS_SECTION")
public class ClassSection implements Serializable{

@Id
@Column(name="CLASS_SECTION_ID")
Integer classSectionId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="SECTION")
String section;

@Column(name="STAFF_ID")
Integer staffId;

@Column(name="MAXIMUM_STRENGTH")
Integer maximumStrength;

@Column(name="MIGRATION_STATUS")
Integer migrationStatus;

@Column(name="SECTION_STATUS")
String sectionStatus;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getClassSectionId(){
 return classSectionId;
}
public void setClassSectionId(Integer classSectionId){
 this.classSectionId=classSectionId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public String getSection(){
 return section;
}
public void setSection(String section){
 this.section=section;
}
public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
}
public Integer getMaximumStrength(){
 return maximumStrength;
}
public void setMaximumStrength(Integer maximumStrength){
 this.maximumStrength=maximumStrength;
}
public Integer getMigrationStatus(){
 return migrationStatus;
}
public void setMigrationStatus(Integer migrationStatus){
 this.migrationStatus=migrationStatus;
}
public String getSectionStatus(){
 return sectionStatus;
}
public void setSectionStatus(String sectionStatus){
 this.sectionStatus=sectionStatus;
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