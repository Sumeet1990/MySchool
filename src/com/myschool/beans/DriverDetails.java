package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DRIVER_DETAILS")
public class DriverDetails implements Serializable{

@Id
@Column(name="DRIVER_DETAILS_ID")
private Integer driverDetailsId;

@Column(name="DRIVER_TITLE")
private String driverTitle;

@Column(name="DRIVER_GIVEN_FULL_NAME")
private String driverGivenFullName;

@Column(name="DRIVER_SURNAME")
private String driverSurname;

@Column(name="DRIVER_DOB")
private String driverDob;

@Column(name="DRIVER_GENDER")
private String driverGender;

@Column(name="DRIVER_QUALIFICATION")
private String driverQualification;

@Column(name="PHOTO")
private String photo;

@Column(name="DRIVER_LICENSE_NO")
private String driverLicenseNo;

@Column(name="LICENSE_EXP_DATE")
private String licenseExpDate;

@Column(name="DRIVER_STATUS")
private String driverStatus;

@Column(name="DRIVER_INACTIVE_REASON")
private String driverInactiveReason;

@Column(name="DRIVER_INACTIVE_DATE_TIME")
private String driverInactiveDateTime;

@Column(name="ADDRESS_LINE_1")
private String addressLine1;

@Column(name="ADDRESS_LINE_2")
private String addressLine2;

@Column(name="ADDRESS_LINE_3")
private String addressLine3;

@Column(name="ADDRESS_LINE_4")
private String addressLine4;

@Column(name="ADDRESS_LINE_5")
private String addressLine5;

@Column(name="ADDRESS_LINE_6")
private String addressLine6;

@Column(name="PINCODE")
private Integer pincode;

@Column(name="STATE")
private String state;

@Column(name="COUNTRY")
private String country;

@Column(name="PERSONAL_CONTACT_NUMBER")
private String personalContactNumber;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public String getDriverStatus(){
 return driverStatus;
}
public void setDriverStatus(String driverStatus){
 this.driverStatus=driverStatus;
}
public String getDriverInactiveReason(){
 return driverInactiveReason;
}
public void setDriverInactiveReason(String driverInactiveReason){
 this.driverInactiveReason=driverInactiveReason;
}
public String getDriverInactiveDateTime(){
 return driverInactiveDateTime;
}
public void setDriverInactiveDateTime(String driverInactiveDateTime){
 this.driverInactiveDateTime=driverInactiveDateTime;
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