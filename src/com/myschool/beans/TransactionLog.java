package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSACTION_LOG")
public class TransactionLog implements Serializable{

@Id
@Column(name="TRANSACTION_LOG_ID")
private Integer transactionLogId;

@Column(name="USER_ID")
private Integer userId;

@Column(name="MENU_CATEGORY")
private String menuCategory;

@Column(name="MENU_SUB_CATEGORY")
private String menuSubCategory;

@Column(name="ACTION_TYPE")
private String actionType;

@Column(name="ACTION_PERFORMED_DATE_TIME")
private String actionPerformedDateTime;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


public Integer getTransactionLogId(){
 return transactionLogId;
}
public void setTransactionLogId(Integer transactionLogId){
 this.transactionLogId=transactionLogId;
}
public Integer getUserId(){
 return userId;
}
public void setUserId(Integer userId){
 this.userId=userId;
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
public String getActionType(){
 return actionType;
}
public void setActionType(String actionType){
 this.actionType=actionType;
}
public String getActionPerformedDateTime(){
 return actionPerformedDateTime;
}
public void setActionPerformedDateTime(String actionPerformedDateTime){
 this.actionPerformedDateTime=actionPerformedDateTime;
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