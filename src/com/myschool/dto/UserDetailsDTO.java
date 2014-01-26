package com.myschool.dto;

public class UserDetailsDTO {
    private String username;
    private String password; 
    private Integer userId;
    private Integer userRoleId;
    private String lastLoginDetails;
    private boolean locked;
    private Integer invalidAttempts;
    private boolean verificationStatus;
    
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

	public String getLastLoginDetails() {
		return lastLoginDetails;
	}

	public void setLastLoginDetails(String lastLoginDetails) {
		this.lastLoginDetails = lastLoginDetails;
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
}

