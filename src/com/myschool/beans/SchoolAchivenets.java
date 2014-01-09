package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_ACHIVENETS")
public class SchoolAchivenets implements Serializable{

@Column(name="SCHOOL_ACHIVENETS_ID")
Integer schoolAchivenetsId;

@Column(name="EVENT")
String event;

@Column(name="ACHIEVEMENT_FOR")
String achievementFor;

@Column(name="STAFF_ID")
Integer staffId;

@Column(name="STUDENT_ROLL_NUMBER")
Integer studentRollNumber;

@Column(name="ACHIEVEMENT_DATE")
String achievementDate;

@Column(name="DOCUMENT")document;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
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
public Integer getStudentRollNumber(){
 return studentRollNumber;
}
public void setStudentRollNumber(Integer studentRollNumber){
 this.studentRollNumber=studentRollNumber;
}
public String getAchievementDate(){
 return achievementDate;
}
public void setAchievementDate(String achievementDate){
 this.achievementDate=achievementDate;
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