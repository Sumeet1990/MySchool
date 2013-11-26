package com.myschool.user.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@Column(name="USER_DETAILS_ID")
	Integer userDetailsId;
	
	@Id
	@Column(name="USER_NAME")
	String userName; 
	
	@Column(name="PASSWORD")
	String password;
	
	@Column(name="USER_ROLE_ID")
	Integer userRoleId;
	
	@Column(name="USER_FIRST_NAME")
	String userFirstName ; 
	
	@Column(name="USER_MIDDLE_NAME")
	String userMiddleName;
	
	@Column(name="USER_LAST_NAME")
	String userLastName;
	
	@Column(name="USER_DOB")
	String userDOB ;
	
	@Column(name="USER_GENDER")
	String userGender ;
	
	@Column(name="USER_STATUS")
	String userStatus ;
	
	@Column(name="CHANGE_PASSWORD_QUESTION")
	String changePasswordQuestion;
	
	@Column(name="CHANGE_PASSWORD_ANSWER")
	String changePasswordAnswer;
	
	@Column(name="CREATED_USER_ID")
	String createdUserId;
	
	@Column(name="MODIFIED_USER_ID")
	String ModifiedUserId ;
	
	@Column(name="CREATED_DATE_AND_TIME")
	String createdDateAndTime;
	
	@Column(name="MODIFIED_DATE_AND_TIME")
	String modifiedAndTime ;

	public Integer getUserId() {
		return userDetailsId;
	}
	public void setUserDetailsId(Integer userDetailsId) {
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
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserMiddleName() {
		return userMiddleName;
	}
	public void setUserMiddleName(String userMiddleName) {
		this.userMiddleName = userMiddleName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserDOB() {
		return userDOB;
	}
	public void setUserDOB(String userDOB) {
		this.userDOB = userDOB;
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
		return ModifiedUserId;
	}
	public void setModifiedUserId(String modifiedUserId) {
		ModifiedUserId = modifiedUserId;
	}
	public String getCreatedDateAndTime() {
		return createdDateAndTime;
	}
	public void setCreatedDateAndTime(String createdDateAndTime) {
		this.createdDateAndTime = createdDateAndTime;
	}
	public String getModifiedAndTime() {
		return modifiedAndTime;
	}
	public void setModifiedAndTime(String modifiedAndTime) {
		this.modifiedAndTime = modifiedAndTime;
	}

}

