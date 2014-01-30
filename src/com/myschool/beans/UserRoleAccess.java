package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_ROLE_ACCESS")
public class UserRoleAccess implements Serializable{

@Id
@Column(name="USER_ROLE_ACCESS_ID")
Integer userRolesAccessId;
	
@Column(name="USER_ROLES_ID")
Integer userRolesId;

@Column(name="MENU_CATEGORY")
String menuCategory;

@Column(name="MENU_SUB_CATEGORY")
String menuSubCategory;

@Column(name="CREATE_ADD")
String createAdd;

@Column(name="MODIFY_EDIT")
String modifyEdit;

@Column(name="DELETE_REMOVE")
String deleteRemove;

@Column(name="VIEW_SHOW")
String viewShow;

@Column(name="MIGRATE")
String migrate;

@Column(name="GENERATE")
String generate;

@Column(name="SMS")
String sms;

@Column(name="EMAIL")
String email;

@Column(name="COLLECT")
String collect;

@Column(name="ASSIGN")
String assign;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_TIME")
String modifiedDateAndTime;

public Integer getUserRolesAccessId() {
	return userRolesAccessId;
}
public void setUserRolesAccessId(Integer userRolesAccessId) {
	this.userRolesAccessId = userRolesAccessId;
}
public Integer getUserRolesId(){
 return userRolesId;
}
public void setUserRolesId(Integer userRolesId){
 this.userRolesId=userRolesId;
}
public String getMenuCategory(){
 return menuCategory;
}
public void setMenuCategory(String menuCategory){
 this.menuCategory=menuCategory;
}
public String getMenuSubCategory(){
 return menuSubCategory;
}
public void setMenuSubCategory(String menuSubCategory){
 this.menuSubCategory=menuSubCategory;
}
public String getCreateAdd(){
 return createAdd;
}
public void setCreateAdd(String createAdd){
 this.createAdd=createAdd;
}
public String getModifyEdit(){
 return modifyEdit;
}
public void setModifyEdit(String modifyEdit){
 this.modifyEdit=modifyEdit;
}
public String getDeleteRemove(){
 return deleteRemove;
}
public void setDeleteRemove(String deleteRemove){
 this.deleteRemove=deleteRemove;
}
public String getViewShow(){
 return viewShow;
}
public void setViewShow(String viewShow){
 this.viewShow=viewShow;
}
public String getMigrate(){
 return migrate;
}
public void setMigrate(String migrate){
 this.migrate=migrate;
}
public String getGenerate(){
 return generate;
}
public void setGenerate(String generate){
 this.generate=generate;
}
public String getSms(){
 return sms;
}
public void setSms(String sms){
 this.sms=sms;
}
public String getEmail(){
 return email;
}
public void setEmail(String email){
 this.email=email;
}
public String getCollect(){
 return collect;
}
public void setCollect(String collect){
 this.collect=collect;
}
public String getAssign(){
 return assign;
}
public void setAssign(String assign){
 this.assign=assign;
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