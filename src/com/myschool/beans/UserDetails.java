package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails implements Serializable {

	@ManyToOne
	@JoinColumn(name="USER_ROLES_ID")
	private UserRole userRole;
	
	@OneToOne
	@JoinColumn(name = "STAFF_ADDRESS_ID")
	private StaffAddress staffAddress;
	
	@Id
	@Column(name = "USER_ID")
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "USER_GIVEN_FULL_NAME")
	private String userGivenFullName;

	@Column(name = "USER_SURNAME")
	private String userSurname;

	@Column(name = "USER_DOB")
	private String userDob;

	@Column(name = "USER_GENDER")
	private String userGender;

	@Column(name = "USER_STATUS")
	private String userStatus;

	@Column(name = "INVALID_ATTEMPTS")
	private Integer invalidAttempts;

	@Column(name = "STAFF_ID")
	private Integer staffId;

	@Column(name = "SECURITY_QUESTION")
	private String securityQuestion;

	@Column(name = "SECURITY_ANSWER")
	private String securityAnswer;

	@Column(name = "LAST_LOGEDIN_DATE_TIME")
	private String lastLogedinDateTime;

	@Column(name = "CREATED_USER_ID")
	private String createdUserId;

	@Column(name = "MODIFIED_USER_ID")
	private String modifiedUserId;

	@Column(name = "CREATED_DATE_TIME")
	private String createdDateTime;

	@Column(name = "MODIFIED_DATE_TIME")
	private String modifiedDateTime;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getInvalidAttempts() {
		return invalidAttempts;
	}

	public void setInvalidAttempts(Integer invalidAttempts) {
		this.invalidAttempts = invalidAttempts;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public String getLastLogedinDateTime() {
		return lastLogedinDateTime;
	}

	public void setLastLogedinDateTime(String lastLogedinDateTime) {
		this.lastLogedinDateTime = lastLogedinDateTime;
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

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(String modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public StaffAddress getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(StaffAddress staffAddress) {
		this.staffAddress = staffAddress;
	}
}