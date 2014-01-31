package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_ACHIVENETS")
public class SchoolAchivenets implements Serializable{

@Id
@Column(name="SCHOOL_ACHIVENETS_ID")
private Integer schoolAchivenetsId;

@Column(name="EVENT")
private String event;

@Column(name="ACHIEVEMENT_FOR")
private String achievementFor;

@Column(name="STAFF_ID")
private Integer staffId;

@Column(name="STUDENT_ROLL_NO")
private Integer studentRollNo;

@Column(name="ACHIEVEMENT_DATE")
private String achievementDate;

@Column(name="DOCUMENT")
private String document;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


public Integer getSchoolAchivenetsId(){
 return schoolAchivenetsId;
}
public void setSchoolAchivenetsId(Integer schoolAchivenetsId){
 this.schoolAchivenetsId=schoolAchivenetsId;
}
public String getEvent(){
 return event;
}
public void setEvent(String event){
 this.event=event;
}
public String getAchievementFor(){
 return achievementFor;
}
public void setAchievementFor(String achievementFor){
 this.achievementFor=achievementFor;
}
public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
}
public Integer getStudentRollNo(){
 return studentRollNo;
}
public void setStudentRollNo(Integer studentRollNo){
 this.studentRollNo=studentRollNo;
}
public String getAchievementDate(){
 return achievementDate;
}
public void setAchievementDate(String achievementDate){
 this.achievementDate=achievementDate;
}
public String getDocument(){
 return document;
}
public void setDocument(String document){
 this.document=document;
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