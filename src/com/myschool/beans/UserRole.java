package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="USER_ROLE")
	public class UserRole implements Serializable{
	
	@Id
	@Column(name="USER_ROLES_ID")
	Integer userRolesId;
	
	@Column(name="USER_ROLES_NAME")
	String userRolesName;
	
	@Column(name="CREATED_USER_ID")
	String createdUserId;

	@Column(name="MODIFIED_USER_ID")
	String modifiedUserId;

	@Column(name="CREATED_DATE_TIME")
	String createdDateAndTime;

	@Column(name="MODIFIED_DATE_TIME")
	String modifiedDateAndTime;
	
	public Integer getUserRolesId(){
		return userRolesId;
	}
	
	public void setUserRolesId(Integer userRolesId){
		this.userRolesId=userRolesId;
	}
	
	public String getUserRolesName(){
		return userRolesName;
	}
	
	public void setUserRolesName(String userRolesName){
		this.userRolesName=userRolesName;
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