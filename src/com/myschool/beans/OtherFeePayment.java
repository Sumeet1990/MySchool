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
private Integer otherFeePyntId;

@Column(name="STUDENT_ROLL_NO")
private String studentRollNo;

@Column(name="OTHER_FEE_STRUCTURE_ID")
private Integer otherFeeStructureId;

@Column(name="OTHER_FEE_PAID_RCPT_NO")
private Integer otherFeePaidRcptNo;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="OTHER_FEE_NAME")
private String otherFeeName;

@Column(name="OTHER_FEE_AMOUNT_PAID")
private Integer otherFeeAmountPaid;

@Column(name="OTHER_FEE_AMOUNT_BALANCE")
private Integer otherFeeAmountBalance;

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
public Integer getOtherFeePaidRcptNo(){
 return otherFeePaidRcptNo;
}
public void setOtherFeePaidRcptNo(Integer otherFeePaidRcptNo){
 this.otherFeePaidRcptNo=otherFeePaidRcptNo;
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