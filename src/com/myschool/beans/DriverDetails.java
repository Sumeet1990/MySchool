package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DRIVER_DETAILS")
public class DriverDetails implements Serializable{

@Column(name="DRIVER_DETAILS_ID")
Integer driverDetailsId;

@Column(name="DRIVER_TITLE")
String driverTitle;

@Column(name="DRIVER_GIVEN_FULL_NAME")
String driverGivenFullName;

@Column(name="DRIVER_SURNAME")
String driverSurname;

@Column(name="DRIVER_DOB")
String driverDob;

@Column(name="DRIVER_GENDER")
String driverGender;

@Column(name="DRIVER_STATUS")
String driverStatus;

@Column(name="DRIVER_QUALIFICATION")
String driverQualification;

@Column(name="PHOTO")
String photo;

@Column(name="DRIVER_LICENSE_NO")
String driverLicenseNo;

@Column(name="LICENSE_EXP_DATE")
String licenseExpDate;

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

@Column(name="PERSONAL_CONTACT_NUMBER")
String personalContactNumber;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getDriverDetailsId(){
 return driverDetailsId;
}
public void setDriverDetailsId(Integer driverDetailsId){
 this.driverDetailsId=driverDetailsId;
}
public String getDriverTitle(){
 return driverTitle;
}
public void setDriverTitle(String driverTitle){
 this.driverTitle=driverTitle;
}
public String getDriverGivenFullName(){
 return driverGivenFullName;
}
public void setDriverGivenFullName(String driverGivenFullName){
 this.driverGivenFullName=driverGivenFullName;
}
public String getDriverSurname(){
 return driverSurname;
}
public void setDriverSurname(String driverSurname){
 this.driverSurname=driverSurname;
}
public String getDriverDob(){
 return driverDob;
}
public void setDriverDob(String driverDob){
 this.driverDob=driverDob;
}
public String getDriverGender(){
 return driverGender;
}
public void setDriverGender(String driverGender){
 this.driverGender=driverGender;
}
public String getDriverStatus(){
 return driverStatus;
}
public void setDriverStatus(String driverStatus){
 this.driverStatus=driverStatus;
}
public String getDriverQualification(){
 return driverQualification;
}
public void setDriverQualification(String driverQualification){
 this.driverQualification=driverQualification;
}
public String getPhoto(){
 return photo;
}
public void setPhoto(String photo){
 this.photo=photo;
}
public String getDriverLicenseNo(){
 return driverLicenseNo;
}
public void setDriverLicenseNo(String driverLicenseNo){
 this.driverLicenseNo=driverLicenseNo;
}
public String getLicenseExpDate(){
 return licenseExpDate;
}
public void setLicenseExpDate(String licenseExpDate){
 this.licenseExpDate=licenseExpDate;
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
public String getPersonalContactNumber(){
 return personalContactNumber;
}
public void setPersonalContactNumber(String personalContactNumber){
 this.personalContactNumber=personalContactNumber;
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