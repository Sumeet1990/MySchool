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
Integer schoolAchivenetsId;

@Column(name="EVENT")
String event;

@Column(name="ACHIEVEMENT_FOR")
String achievementFor;

@Column(name="STAFF_ID")
Integer staffId;

@Column(name="STUDENT_ROLL_NO")
Integer studentRollNo;

@Column(name="ACHIEVEMENT_DATE")
String achievementDate;

@Column(name="DOCUMENT")
String document;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_TIME")
String modifiedDateAndTime;


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