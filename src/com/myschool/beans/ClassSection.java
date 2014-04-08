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
private Integer classSectionId;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="SECTION")
private String section;

@Column(name="STAFF_ID")
private Integer staffId;

@Column(name="SECTION_MAXIMUM_STRENGTH")
private Integer sectionMaximumStrength;

@Column(name="MIGRATION_STATUS")
private Integer migrationStatus;

@Column(name="SECTION_STATUS")
private String sectionStatus;

@Column(name="SECTION_INACTIVE_REASON")
private String sectionInactiveReason;

@Column(name="SECTION_INACTIVE_DATE_TIME")
private String sectionInactiveDateTime;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public Integer getSectionMaximumStrength(){
 return sectionMaximumStrength;
}
public void setSectionMaximumStrength(Integer sectionMaximumStrength){
 this.sectionMaximumStrength=sectionMaximumStrength;
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
public String getSectionInactiveReason(){
 return sectionInactiveReason;
}
public void setSectionInactiveReason(String sectionInactiveReason){
 this.sectionInactiveReason=sectionInactiveReason;
}
public String getSectionInactiveDateTime(){
 return sectionInactiveDateTime;
}
public void setSectionInactiveDateTime(String sectionInactiveDateTime){
 this.sectionInactiveDateTime=sectionInactiveDateTime;
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