package com.myschool.dto;

public class UserRoleDTO {
	private String userRoleName;
	private boolean userAccessAsSchool;
    private String userRoleAccess;
    private String userId;
    
	/**
	 * @return the userRoleName
	 */
	public String getUserRoleName() {
		return userRoleName;
	}
	/**
	 * @param userRoleName the userRoleName to set
	 */
	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
	/**
	 * @return the userAccessAsSchool
	 */
	public boolean isUserAccessAsSchool() {
		return userAccessAsSchool;
	}
	/**
	 * @param userAccessAsSchool the userAccessAsSchool to set
	 */
	public void setUserAccessAsSchool(boolean userAccessAsSchool) {
		this.userAccessAsSchool = userAccessAsSchool;
	}
	/**
	 * @return the userRoleAccess
	 */
	public String getUserRoleAccess() {
		return userRoleAccess;
	}
	/**
	 * @param userRoleAccess the userRoleAccess to set
	 */
	public void setUserRoleAccess(String userRoleAccess) {
		this.userRoleAccess = userRoleAccess;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	} 
}

