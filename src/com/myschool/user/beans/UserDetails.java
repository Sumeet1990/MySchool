package com.myschool.user.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails implements Serializable{

@Id
@Column(name="USER_DETAILS_ID")
String userDetailsId;

@Column(name="USER_NAME")
String userName;

@Column(name="PASSWORD")
String password;

@Column(name="USER_ROLE_ID")
Integer userRoleId;

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

@Column(name="USER_MAIL_ID")
String userMailId;

@Column(name="CHANGE_PASSWORD_QUESTION")
String changePasswordQuestion;

@Column(name="CHANGE_PASSWORD_ANSWER")
String changePasswordAnswer;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;

public String getUserDetailsId() {
	return userDetailsId;
}

public void setUserDetailsId(String userDetailsId) {
	this.userDetailsId = userDetailsId;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Integer getUserRoleId() {
	return userRoleId;
}

public void setUserRoleId(Integer userRoleId) {
	this.userRoleId = userRoleId;
}

public String getUserGivenFullName() {
	return userGivenFullName;
}

public void setUserGivenFullName(String userGivenFullName) {
	this.userGivenFullName = userGivenFullName;
}

public String getUserSurname() {
	return userSurname;
}

public void setUserSurname(String userSurname) {
	this.userSurname = userSurname;
}

public String getUserDob() {
	return userDob;
}

public void setUserDob(String userDob) {
	this.userDob = userDob;
}

public String getUserGender() {
	return userGender;
}

public void setUserGender(String userGender) {
	this.userGender = userGender;
}

public String getUserStatus() {
	return userStatus;
}

public void setUserStatus(String userStatus) {
	this.userStatus = userStatus;
}

public String getUserMailId() {
	return userMailId;
}

public void setUserMailId(String userMailId) {
	this.userMailId = userMailId;
}

public String getChangePasswordQuestion() {
	return changePasswordQuestion;
}

public void setChangePasswordQuestion(String changePasswordQuestion) {
	this.changePasswordQuestion = changePasswordQuestion;
}

public String getChangePasswordAnswer() {
	return changePasswordAnswer;
}

public void setChangePasswordAnswer(String changePasswordAnswer) {
	this.changePasswordAnswer = changePasswordAnswer;
}

public String getCreatedUserId() {
	return createdUserId;
}

public void setCreatedUserId(String createdUserId) {
	this.createdUserId = createdUserId;
}

public String getModifiedUserId() {
	return modifiedUserId;
}

public void setModifiedUserId(String modifiedUserId) {
	this.modifiedUserId = modifiedUserId;
}

public String getCreatedDateAndTime() {
	return createdDateAndTime;
}

public void setCreatedDateAndTime(String createdDateAndTime) {
	this.createdDateAndTime = createdDateAndTime;
}

public String getModifiedDateAndTime() {
	return modifiedDateAndTime;
}

public void setModifiedDateAndTime(String modifiedDateAndTime) {
	this.modifiedDateAndTime = modifiedDateAndTime;
}

}
