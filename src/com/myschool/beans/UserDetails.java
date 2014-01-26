package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails implements Serializable{

@Id
@Column(name="USER_ID")
Integer userId;

@Column(name="USER_NAME")
String userName;

@Column(name="USER_ROLES_ID")
Integer userRolesId;

@Column(name="PASSWORD")
String password;

@Column(name="USER_GIVEN_FULL_NAME")
String userGivenFullName;

@Column(name="USER_SURNAME")
String userSurname;

@Column(name="USER_DOB")
String userDob;

@Column(name="USER_GENDER")
String userGender;

@Column(name="USER_STATUS")
String userStatus;

@Column(name="INVALID_ATTEMPTS")
Integer invalidAttempts;

@Column(name="STAFF_ADDRESS_ID")
Integer staffAddressId;

@Column(name="STAFF_ID")
Integer staffId;

@Column(name="FORGOT_PASSWORD_QUESTION")
String forgotPasswordQuestion;

@Column(name="CHANGE_PASSWORD_ANSWER")
String changePasswordAnswer;

@Column(name="LAST_LOGEDIN_DATE_TIME")
String lastLogedinDateTime;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getUserId(){
 return userId;
}
public void setUserId(Integer userId){
 this.userId=userId;
}
public String getUserName(){
 return userName;
}
public void setUserName(String userName){
 this.userName=userName;
}
public Integer getUserRolesId(){
 return userRolesId;
}
public void setUserRolesId(Integer userRolesId){
 this.userRolesId=userRolesId;
}
public String getPassword(){
 return password;
}
public void setPassword(String password){
 this.password=password;
}
public String getUserGivenFullName(){
 return userGivenFullName;
}
public void setUserGivenFullName(String userGivenFullName){
 this.userGivenFullName=userGivenFullName;
}
public String getUserSurname(){
 return userSurname;
}
public void setUserSurname(String userSurname){
 this.userSurname=userSurname;
}
public String getUserDob(){
 return userDob;
}
public void setUserDob(String userDob){
 this.userDob=userDob;
}
public String getUserGender(){
 return userGender;
}
public void setUserGender(String userGender){
 this.userGender=userGender;
}
public String getUserStatus(){
 return userStatus;
}
public void setUserStatus(String userStatus){
 this.userStatus=userStatus;
}
public Integer getInvalidAttempts(){
 return invalidAttempts;
}
public void setInvalidAttempts(Integer invalidAttempts){
 this.invalidAttempts=invalidAttempts;
}
public Integer getStaffAddressId() {
	return staffAddressId;
}
public void setStaffAddressId(Integer staffAddressId) {
	this.staffAddressId = staffAddressId;
}
public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
}
public String getForgotPasswordQuestion(){
 return forgotPasswordQuestion;
}
public void setForgotPasswordQuestion(String forgotPasswordQuestion){
 this.forgotPasswordQuestion=forgotPasswordQuestion;
}
public String getChangePasswordAnswer(){
 return changePasswordAnswer;
}
public void setChangePasswordAnswer(String changePasswordAnswer){
 this.changePasswordAnswer=changePasswordAnswer;
}
public String getLastLogedinDateTime(){
 return lastLogedinDateTime;
}
public void setLastLogedinDateTime(String lastLogedinDateTime){
 this.lastLogedinDateTime=lastLogedinDateTime;
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