package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_ADDRESS")
public class StaffAddress implements Serializable{

@Id
@Column(name="STAFF_ADDRESS_ID")
private Integer staffAddressId;

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

@Column(name="EMERGENCY_CONTACT_NUMBER")
private String emergencyContactNumber;

@Column(name="EMAIL_ID")
private String emailId;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


public Integer getStaffAddressId(){
 return staffAddressId;
}
public void setStaffAddressId(Integer staffAddressId){
 this.staffAddressId=staffAddressId;
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
public String getEmergencyContactNumber(){
 return emergencyContactNumber;
}
public void setEmergencyContactNumber(String emergencyContactNumber){
 this.emergencyContactNumber=emergencyContactNumber;
}
public String getEmailId(){
 return emailId;
}
public void setEmailId(String emailId){
 this.emailId=emailId;
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