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
private Integer studentAddressId;

@Column(name="CAREOFF_NAME")
private String careoffName;

@Column(name="ADDRESS_LINE_1")
private String addressLine1;

@Column(name="TOWN_DISTRICT")
private String townDistrict;

@Column(name="DISTRICT_CITY")
private String districtCity;

@Column(name="PINCODE")
private Integer pincode;

@Column(name="STATE")
private String state;

@Column(name="COUNTRY")
private String country;

@Column(name="FATHER_CONTACT_NUMBER")
private String fatherContactNumber;

@Column(name="MOTHER_CONTACT_NUMBER")
private String motherContactNumber;

@Column(name="GUARDAIN_CONTACT_NUMBER")
private String guardainContactNumber;

@Column(name="FATHER_WORK_NUMBER")
private String fatherWorkNumber;

@Column(name="MOTHER_WORK_NUMBER")
private String motherWorkNumber;

@Column(name="GUARDAIN_WORK_NUMBER")
private String guardainWorkNumber;

@Column(name="FATHER_EMAIL_ID")
private String fatherEmailId;

@Column(name="SEND_MAIL_TO_FATHER")
private String sendMailToFather;

@Column(name="MOTHER_EMAIL_ID")
private String motherEmailId;

@Column(name="SEND_MAIL_TO_MOTHER")
private String sendMailToMother;

@Column(name="GUARDAIN_EMAIL_ID")
private String guardainEmailId;

@Column(name="SEND_MAIL_TO_GUARDAIN")
private String sendMailToGuardain;

@Column(name="FATHER_OCCUPATION")
private String fatherOccupation;

@Column(name="MOTHER_OCCUPATION")
private String motherOccupation;

@Column(name="GUARDAIN_OCCUPATION")
private String guardainOccupation;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public String getTownDistrict(){
 return townDistrict;
}
public void setTownDistrict(String townDistrict){
 this.townDistrict=townDistrict;
}
public String getDistrictCity(){
 return districtCity;
}
public void setDistrictCity(String districtCity){
 this.districtCity=districtCity;
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