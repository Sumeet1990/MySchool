package com.myschool.dto;

import javax.persistence.Column;


public class ClassSectionDTO {
	private Integer classSectionId;
	
	private Integer schoolClassId;

	private String section;

	private Integer staffId;

	private Integer sectionMaximumStrength;

	private Integer migrationStatus;

	private String sectionStatus;

	private String sectionInactiveReason;

	private String sectionInactiveDateTime;

	private String createdUserId;

	private String modifiedUserId;

	private String createdDateTime;

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
