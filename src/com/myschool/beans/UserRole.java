package com.myschool.beans;

import java.io.Serializable;
import java.sql.Clob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_ROLE")
public class UserRole implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USER_ROLES_ID")
	private Integer userRolesId;
	
	@Column(name="USER_ROLE_NAME")
	private String userRoleName;
	
	@Column(name="USER_ACCESS_AS_SCHOOL")
	private Integer userAccessAsSchool;	
	
	@Column(name="USER_ROLE_ACCESS")
	private byte[] userRoleAccess;	
	
	@Column(name="CREATED_USER_ID")
	private String createdUserId;
	
	@Column(name="MODIFIED_USER_ID")
	private String modifiedUserId;
	
	@Column(name="CREATED_DATE_TIME")
	private String createdDateTime;
	
	@Column(name="MODIFIED_DATE_TIME")
	private String modifiedDateTime;
	
	
	public Integer getUserRolesId(){
	 return userRolesId;
	}
	
	public void setUserRolesId(Integer userRolesId){
	 this.userRolesId=userRolesId;
	}
	
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
	 * @return the userRoleAccess
	 */
	public  byte[] getUserRoleAccess() {
		return userRoleAccess;
	}

	/**
	 * @param userRoleAccess the userRoleAccess to set
	 */
	public void setUserRoleAccess(byte[] userRoleAccess) {
		this.userRoleAccess = userRoleAccess;
	}

	/**
	 * @return the userAccessAsSchool
	 */
	public Integer getUserAccessAsSchool() {
		return userAccessAsSchool;
	}
	
	/**
	 * @param userAccessAsSchool the userAccessAsSchool to set
	 */
	public void setUserAccessAsSchool(Integer userAccessAsSchool) {
		this.userAccessAsSchool = userAccessAsSchool;
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