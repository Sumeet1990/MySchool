package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TUTION_FEE_STRUCTURE")
public class TuitionFeeStructure implements Serializable{

@Id
@Column(name="TUTION_FEE_STRUCTURE_ID")
private Integer tutionFeeStructureId;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="AMOUNT_PER_INSTALMENT")
private Integer amountPerInstalment;

@Column(name="NUMBER_OF_INSTALMENTS")
private Integer numberOfInstalments;

@Column(name="TOTAL_TUTION_FEE")
private Integer totalTutionFee;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


public Integer getTutionFeeStructureId(){
 return tutionFeeStructureId;
}
public void setTutionFeeStructureId(Integer tutionFeeStructureId){
 this.tutionFeeStructureId=tutionFeeStructureId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public Integer getAmountPerInstalment(){
 return amountPerInstalment;
}
public void setAmountPerInstalment(Integer amountPerInstalment){
 this.amountPerInstalment=amountPerInstalment;
}
public Integer getNumberOfInstalments(){
 return numberOfInstalments;
}
public void setNumberOfInstalments(Integer numberOfInstalments){
 this.numberOfInstalments=numberOfInstalments;
}
public Integer getTotalTutionFee(){
 return totalTutionFee;
}
public void setTotalTutionFee(Integer totalTutionFee){
 this.totalTutionFee=totalTutionFee;
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