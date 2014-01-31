package com.myschool.dto;

public class UserDetailsDTO {
    private String username;
    private String password; 
    private String userGivenFullName;
    private String userSurname;
    private Integer userId;
    private Integer userRoleId;
    private String lastLogedinDateTime;
    private boolean locked;
    private Integer invalidAttempts;
    private boolean verificationStatus;
    private String securityQuestion;
    private String securityAnswer;
    private String userRolesName;
    private String personalContactNumber;
    private String userDob;
    
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}



	public String getLastLogedinDateTime() {
		return lastLogedinDateTime;
	}

	public void setLastLogedinDateTime(String lastLogedinDateTime) {
		this.lastLogedinDateTime = lastLogedinDateTime;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public Integer getInvalidAttempts() {
		return invalidAttempts;
	}

	public void setInvalidAttempts(Integer invalidAttempts) {
		this.invalidAttempts = invalidAttempts;
	}

	public boolean isVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(boolean verificationStatus) {
		this.verificationStatus = verificationStatus;
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

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public String getUserGivenFullName() {
		return userGivenFullName;
	}

	public void setUserGivenFullName(String userGivenFullName) {
		this.userGivenFullName = userGivenFullName;
	}

	public String getPersonalContactNumber() {
		return personalContactNumber;
	}

	public void setPersonalContactNumber(String personalContactNumber) {
		this.personalContactNumber = personalContactNumber;
	}

	public String getUserRolesName() {
		return userRolesName;
	}

	public void setUserRolesName(String userRolesName) {
		this.userRolesName = userRolesName;
	}

	public String getUserDob() {
		return userDob;
	}

	public void setUserDob(String userDob) {
		this.userDob = userDob;
	}	
}

