package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_ADDRESS")
public class StudentAddress implements Serializable{

@Id
@Column(name="STUDENT_ADDRESS_ID")
Integer studentAddressId;

@Column(name="CAREOFF_NAME")
String careoffName;

@Column(name="ADDRESS_LINE_1")
String addressLine1;

@Column(name="ADDRESS_LINE_2")
String addressLine2;

@Column(name="ADDRESS_LINE_3")
String addressLine3;

@Column(name="ADDRESS_LINE_4")
String addressLine4;

@Column(name="ADDRESS_LINE_5")
String addressLine5;

@Column(name="ADDRESS_LINE_6")
String addressLine6;

@Column(name="PINCODE")
Integer pincode;

@Column(name="STATE")
String state;

@Column(name="COUNTRY")
String country;

@Column(name="FATHER_CONTACT_NUMBER")
String fatherContactNumber;

@Column(name="MOTHER_CONTACT_NUMBER")
String motherContactNumber;

@Column(name="GUARDAIN_CONTACT_NUMBER")
String guardainContactNumber;

@Column(name="FATHER_WORK_NUMBER")
String fatherWorkNumber;

@Column(name="MOTHER_WORK_NUMBER")
String motherWorkNumber;

@Column(name="GUARDAIN_WORK_NUMBER")
String guardainWorkNumber;

@Column(name="FATHER_EMAIL_ID")
String fatherEmailId;

@Column(name="SEND_MAIL_TO_FATHER")
String sendMailToFather;

@Column(name="MOTHER_EMAIL_ID")
String motherEmailId;

@Column(name="SEND_MAIL_TO_MOTHER")
String sendMailToMother;

@Column(name="GUARDAIN_EMAIL_ID")
String guardainEmailId;

@Column(name="SEND_MAIL_TO_GUARDAIN")
String sendMailToGuardain;

@Column(name="FATHER_OCCUPATION")
String fatherOccupation;

@Column(name="MOTHER_OCCUPATION")
String motherOccupation;

@Column(name="GUARDAIN_OCCUPATION")
String guardainOccupation;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getStudentAddressId(){
 return studentAddressId;
}
public void setStudentAddressId(Integer studentAddressId){
 this.studentAddressId=studentAddressId;
}
public String getCareoffName(){
 return careoffName;
}
public void setCareoffName(String careoffName){
 this.careoffName=careoffName;
}
public String getAddressLine1(){
 return addressLine1;
}
public void setAddressLine1(String addressLine1){
 this.addressLine1=addressLine1;
}
public String getAddressLine2(){
 return addressLine2;
}
public void setAddressLine2(String addressLine2){
 this.addressLine2=addressLine2;
}
public String getAddressLine3(){
 return addressLine3;
}
public void setAddressLine3(String addressLine3){
 this.addressLine3=addressLine3;
}
public String getAddressLine4(){
 return addressLine4;
}
public void setAddressLine4(String addressLine4){
 this.addressLine4=addressLine4;
}
public String getAddressLine5(){
 return addressLine5;
}
public void setAddressLine5(String addressLine5){
 this.addressLine5=addressLine5;
}
public String getAddressLine6(){
 return addressLine6;
}
public void setAddressLine6(String addressLine6){
 this.addressLine6=addressLine6;
}
public Integer getPincode(){
 return pincode;
}
public void setPincode(Integer pincode){
 this.pincode=pincode;
}
public String getState(){
 return state;
}
public void setState(String state){
 this.state=state;
}
public String getCountry(){
 return country;
}
public void setCountry(String country){
 this.country=country;
}
public String getFatherContactNumber(){
 return fatherContactNumber;
}
public void setFatherContactNumber(String fatherContactNumber){
 this.fatherContactNumber=fatherContactNumber;
}
public String getMotherContactNumber(){
 return motherContactNumber;
}
public void setMotherContactNumber(String motherContactNumber){
 this.motherContactNumber=motherContactNumber;
}
public String getGuardainContactNumber(){
 return guardainContactNumber;
}
public void setGuardainContactNumber(String guardainContactNumber){
 this.guardainContactNumber=guardainContactNumber;
}
public String getFatherWorkNumber(){
 return fatherWorkNumber;
}
public void setFatherWorkNumber(String fatherWorkNumber){
 this.fatherWorkNumber=fatherWorkNumber;
}
public String getMotherWorkNumber(){
 return motherWorkNumber;
}
public void setMotherWorkNumber(String motherWorkNumber){
 this.motherWorkNumber=motherWorkNumber;
}
public String getGuardainWorkNumber(){
 return guardainWorkNumber;
}
public void setGuardainWorkNumber(String guardainWorkNumber){
 this.guardainWorkNumber=guardainWorkNumber;
}
public String getFatherEmailId(){
 return fatherEmailId;
}
public void setFatherEmailId(String fatherEmailId){
 this.fatherEmailId=fatherEmailId;
}
public String getSendMailToFather(){
 return sendMailToFather;
}
public void setSendMailToFather(String sendMailToFather){
 this.sendMailToFather=sendMailToFather;
}
public String getMotherEmailId(){
 return motherEmailId;
}
public void setMotherEmailId(String motherEmailId){
 this.motherEmailId=motherEmailId;
}
public String getSendMailToMother(){
 return sendMailToMother;
}
public void setSendMailToMother(String sendMailToMother){
 this.sendMailToMother=sendMailToMother;
}
public String getGuardainEmailId(){
 return guardainEmailId;
}
public void setGuardainEmailId(String guardainEmailId){
 this.guardainEmailId=guardainEmailId;
}
public String getSendMailToGuardain(){
 return sendMailToGuardain;
}
public void setSendMailToGuardain(String sendMailToGuardain){
 this.sendMailToGuardain=sendMailToGuardain;
}
public String getFatherOccupation(){
 return fatherOccupation;
}
public void setFatherOccupation(String fatherOccupation){
 this.fatherOccupation=fatherOccupation;
}
public String getMotherOccupation(){
 return motherOccupation;
}
public void setMotherOccupation(String motherOccupation){
 this.motherOccupation=motherOccupation;
}
public String getGuardainOccupation(){
 return guardainOccupation;
}
public void setGuardainOccupation(String guardainOccupation){
 this.guardainOccupation=guardainOccupation;
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