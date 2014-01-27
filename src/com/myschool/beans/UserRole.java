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

}