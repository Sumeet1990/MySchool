package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TUTION_FEE_PAYMENT")
public class TutionFeePayment implements Serializable{

@Id
@Column(name="STUDNT_TUTIN_FEE_PYNT_ID")
String studntTutinFeePyntId;

@Column(name="STUDENT_ROLL_NO")
String studentRollNo;

@Column(name="TUTION_FEE_STRUCTURE_ID")
Integer tutionFeeStructureId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="FEE_PAID")
Integer feePaid;

@Column(name="INSTALMENT_NUMBER")
Integer instalmentNumber;

@Column(name="BALANCE_TUTION_FEE")
Integer balanceTutionFee;

@Column(name="PAYMENT_MODE")
String paymentMode;

@Column(name="PAYMENT_DATE_TIME")
String paymentDateTime;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_TIME")
String modifiedDateAndTime;


public String getStudntTutinFeePyntId(){
 return studntTutinFeePyntId;
}
public void setStudntTutinFeePyntId(String studntTutinFeePyntId){
 this.studntTutinFeePyntId=studntTutinFeePyntId;
}
public String getStudentRollNo(){
 return studentRollNo;
}
public void setStudentRollNo(String studentRollNo){
 this.studentRollNo=studentRollNo;
}
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
public Integer getFeePaid(){
 return feePaid;
}
public void setFeePaid(Integer feePaid){
 this.feePaid=feePaid;
}
public Integer getInstalmentNumber(){
 return instalmentNumber;
}
public void setInstalmentNumber(Integer instalmentNumber){
 this.instalmentNumber=instalmentNumber;
}
public Integer getBalanceTutionFee(){
 return balanceTutionFee;
}
public void setBalanceTutionFee(Integer balanceTutionFee){
 this.balanceTutionFee=balanceTutionFee;
}
public String getPaymentMode() {
	return paymentMode;
}
public void setPaymentMode(String paymentMode) {
	this.paymentMode = paymentMode;
}
public String getPaymentDateTime() {
	return paymentDateTime;
}
public void setPaymentDateTime(String paymentDateTime) {
	this.paymentDateTime = paymentDateTime;
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