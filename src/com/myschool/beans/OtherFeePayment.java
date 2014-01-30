package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OTHER_FEE_PAYMENT")
public class OtherFeePayment implements Serializable{

@Id
@Column(name="OTHER_FEE_PYNT_ID")
Integer otherFeePyntId;

@Column(name="STUDENT_ROLL_NO")
String studentRollNo;

@Column(name="OTHER_FEE_STRUCTURE_ID")
Integer otherFeeStructureId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="OTHER_FEE_NAME")
String otherFeeName;

@Column(name="OTHER_FEE_AMOUNT_PAID")
Integer otherFeeAmountPaid;

@Column(name="OTHER_FEE_AMOUNT_BALANCE")
Integer otherFeeAmountBalance;

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


public Integer getOtherFeePyntId(){
 return otherFeePyntId;
}
public void setOtherFeePyntId(Integer otherFeePyntId){
 this.otherFeePyntId=otherFeePyntId;
}
public String getStudentRollNo(){
 return studentRollNo;
}
public void setStudentRollNo(String studentRollNo){
 this.studentRollNo=studentRollNo;
}
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
public Integer getOtherFeeAmountPaid(){
 return otherFeeAmountPaid;
}
public void setOtherFeeAmountPaid(Integer otherFeeAmountPaid){
 this.otherFeeAmountPaid=otherFeeAmountPaid;
}
public Integer getOtherFeeAmountBalance(){
 return otherFeeAmountBalance;
}
public void setOtherFeeAmountBalance(Integer otherFeeAmountBalance){
 this.otherFeeAmountBalance=otherFeeAmountBalance;
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