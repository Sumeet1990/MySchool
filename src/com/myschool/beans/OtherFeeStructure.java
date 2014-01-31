package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="OTHER_FEE_STRUCTURE")
public class OtherFeeStructure implements Serializable{

@Id
@Column(name="OTHER_FEE_STRUCTURE_ID")
private Integer otherFeeStructureId;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="OTHER_FEE_NAME")
private String otherFeeName;

@Column(name="OTHER_FEE_AMOUNT")
private Integer otherFeeAmount;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


public Integer getOtherFeeStructureId(){
 return otherFeeStructureId;
}
public void setOtherFeeStructureId(Integer otherFeeStructureId){
 this.otherFeeStructureId=otherFeeStructureId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public String getOtherFeeName(){
 return otherFeeName;
}
public void setOtherFeeName(String otherFeeName){
 this.otherFeeName=otherFeeName;
}
public Integer getOtherFeeAmount(){
 return otherFeeAmount;
}
public void setOtherFeeAmount(Integer otherFeeAmount){
 this.otherFeeAmount=otherFeeAmount;
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