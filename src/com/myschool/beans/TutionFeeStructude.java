package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TUTION_FEE_STRUCTUDE")
public class TutionFeeStructude implements Serializable{

@Id
@Column(name="TUTION_FEE_STRUCTUDE_ID")
String tutionFeeStructudeId;

@Column(name="CLASS_NAME")
String className;

@Column(name="INSTALMENT_AMOUNT")
Integer instalmentAmount;

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

public String getTutionFeeStructudeId() {
	return tutionFeeStructudeId;
}

public void setTutionFeeStructudeId(String tutionFeeStructudeId) {
	this.tutionFeeStructudeId = tutionFeeStructudeId;
}

public String getClassName() {
	return className;
}

public void setClassName(String className) {
	this.className = className;
}

public Integer getInstalmentAmount() {
	return instalmentAmount;
}

public void setInstalmentAmount(Integer instalmentAmount) {
	this.instalmentAmount = instalmentAmount;
}

public Integer getNumberOfInstalments() {
	return numberOfInstalments;
}

public void setNumberOfInstalments(Integer numberOfInstalments) {
	this.numberOfInstalments = numberOfInstalments;
}

public Integer getTotalTutionFee() {
	return totalTutionFee;
}

public void setTotalTutionFee(Integer totalTutionFee) {
	this.totalTutionFee = totalTutionFee;
}

public String getCreatedUserId() {
	return createdUserId;
}

public void setCreatedUserId(String createdUserId) {
	this.createdUserId = createdUserId;
}

public String getModifiedUserId() {
	return modifiedUserId;
}

public void setModifiedUserId(String modifiedUserId) {
	this.modifiedUserId = modifiedUserId;
}

public String getCreatedDateAndTime() {
	return createdDateAndTime;
}

public void setCreatedDateAndTime(String createdDateAndTime) {
	this.createdDateAndTime = createdDateAndTime;
}

public String getModifiedDateAndTime() {
	return modifiedDateAndTime;
}

public void setModifiedDateAndTime(String modifiedDateAndTime) {
	this.modifiedDateAndTime = modifiedDateAndTime;
}

}
