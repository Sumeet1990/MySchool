package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TUTION_FEE_PAYMENT")
public class TuitionFeePayment implements Serializable{

@Id
@Column(name="STUDNT_TUTIN_FEE_PYNT_ID")
private String studntTutinFeePyntId;

@Column(name="STUDENT_ROLL_NO")
private String studentRollNo;

@Column(name="TUTION_FEE_STRUCTURE_ID")
private Integer tutionFeeStructureId;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="TUTION_FEE_PAID_RCPT_NO")
private Integer tutionFeePaidRcptNo;

@Column(name="FEE_PAID")
private Integer feePaid;

@Column(name="INSTALMENT_NUMBER")
private Integer instalmentNumber;

@Column(name="BALANCE_TUTION_FEE")
private Integer balanceTutionFee;

@Column(name="PAYMENT_MODE")
private String paymentMode;

@Column(name="PAYMENT_DATE_TIME")
private String paymentDateTime;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public Integer getTutionFeePaidRcptNo(){
 return tutionFeePaidRcptNo;
}
public void setTutionFeePaidRcptNo(Integer tutionFeePaidRcptNo){
 this.tutionFeePaidRcptNo=tutionFeePaidRcptNo;
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
public String getPaymentMode(){
 return paymentMode;
}
public void setPaymentMode(String paymentMode){
 this.paymentMode=paymentMode;
}
public String getPaymentDateTime(){
 return paymentDateTime;
}
public void setPaymentDateTime(String paymentDateTime){
 this.paymentDateTime=paymentDateTime;
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