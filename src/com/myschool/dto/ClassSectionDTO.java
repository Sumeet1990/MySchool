package com.myschool.dto;

import java.util.Map;

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
	
	private String currentOperation;
	
	private String schoolClassName;
	
	private String classTeacherName;
	
	private Map messageMap;
	
	private String displayMessage;
	

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
	
	/**
	 * @return the currentOperation
	 */
	public String getCurrentOperation() {
		return currentOperation;
	}
	/**
	 * @param currentOperation the currentOperation to set
	 */
	public void setCurrentOperation(String currentOperation) {
		this.currentOperation = currentOperation;
	}
	/**
	 * @return the messageMap
	 */
	public Map getMessageMap() {
		return messageMap;
	}
	/**
	 * @param messageMap the messageMap to set
	 */
	public void setMessageMap(Map messageMap) {
		this.messageMap = messageMap;
	}
	
	/**
	 * @return the schoolClassName
	 */
	public String getSchoolClassName() {
		return schoolClassName;
	}
	
	/**
	 * @param schoolClassName the schoolClassName to set
	 */
	public void setSchoolClassName(String schoolClassName) {
		this.schoolClassName = schoolClassName;
	}
	
	/**
	 * @return the classTeacherName
	 */
	public String getClassTeacherName() {
		return classTeacherName;
	}
	
	/**
	 * @param classTeacherName the classTeacherName to set
	 */
	public void setClassTeacherName(String classTeacherName) {
		this.classTeacherName = classTeacherName;
	}
	/**
	 * @return the displayMessage
	 */
	public String getDisplayMessage() {
		return displayMessage;
	}
	/**
	 * @param displayMessage the displayMessage to set
	 */
	public void setDisplayMessage(String displayMessage) {
		this.displayMessage = displayMessage;
	}
}
