package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="STAFF_ADDRESS")
public class StaffAddress implements Serializable{

@SequenceGenerator (name="seqSchoolClass", sequenceName="SEQ_STAFF_ADDRESS", allocationSize=1)
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seqSchoolClass")
@Column(name="STAFF_ADDRESS_ID")
private Integer staffAddressId;

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