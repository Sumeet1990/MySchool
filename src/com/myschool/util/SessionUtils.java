package com.myschool.util;

public class SessionUtils {
	private String userId;
	private String userRolesName;
	private String userName;
	private String userGivenFullName;
	private String userSurname;
	private String lastLogedinDateTime;
	private boolean userAccessAsSchool;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserRolesName() {
		return userRolesName;
	}
	
	public void setUserRolesName(String userRolesName) {
		this.userRolesName = userRolesName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
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
	
	public String getLastLogedinDateTime() {
		return lastLogedinDateTime;
	}
	
	public void setLastLogedinDateTime(String lastLogedinDateTime) {
		this.lastLogedinDateTime = lastLogedinDateTime;
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
}
