package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCHOOL_TIMINGS")
public class SchoolTimings implements Serializable{

@Id
@Column(name="SCHOOL_TIMINGS_ID")
Integer schoolTimingsId;

@Column(name="SCHOOL_CLASS_ID")
Integer schoolClassId;

@Column(name="ACADEMIC_OPENING_DAY")
String academicOpeningDay;

@Column(name="ACADEMIC_CLOSING_DAY")
String academicClosingDay;

@Column(name="SCHOOL_START_TIME")
String schoolStartTime;

@Column(name="START_OFFSET_TIME")
String startOffsetTime;

@Column(name="OFFSET_TIME_MEASURE")
String offsetTimeMeasure;

@Column(name="SCHOOL_FINISH_TIME")
String schoolFinishTime;

@Column(name="TIMING_DURATION_FROM")
String timingDurationFrom;

@Column(name="TIMING_DURATION_TO")
String timingDurationTo;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getSchoolTimingsId(){
 return schoolTimingsId;
}
public void setSchoolTimingsId(Integer schoolTimingsId){
 this.schoolTimingsId=schoolTimingsId;
}
public Integer getSchoolClassId(){
 return schoolClassId;
}
public void setSchoolClassId(Integer schoolClassId){
 this.schoolClassId=schoolClassId;
}
public String getAcademicOpeningDay(){
 return academicOpeningDay;
}
public void setAcademicOpeningDay(String academicOpeningDay){
 this.academicOpeningDay=academicOpeningDay;
}
public String getAcademicClosingDay(){
 return academicClosingDay;
}
public void setAcademicClosingDay(String academicClosingDay){
 this.academicClosingDay=academicClosingDay;
}
public String getSchoolStartTime(){
 return schoolStartTime;
}
public void setSchoolStartTime(String schoolStartTime){
 this.schoolStartTime=schoolStartTime;
}
public String getStartOffsetTime(){
 return startOffsetTime;
}
public void setStartOffsetTime(String startOffsetTime){
 this.startOffsetTime=startOffsetTime;
}
public String getOffsetTimeMeasure(){
 return offsetTimeMeasure;
}
public void setOffsetTimeMeasure(String offsetTimeMeasure){
 this.offsetTimeMeasure=offsetTimeMeasure;
}
public String getSchoolFinishTime(){
 return schoolFinishTime;
}
public void setSchoolFinishTime(String schoolFinishTime){
 this.schoolFinishTime=schoolFinishTime;
}
public String getTimingDurationFrom(){
 return timingDurationFrom;
}
public void setTimingDurationFrom(String timingDurationFrom){
 this.timingDurationFrom=timingDurationFrom;
}
public String getTimingDurationTo(){
 return timingDurationTo;
}
public void setTimingDurationTo(String timingDurationTo){
 this.timingDurationTo=timingDurationTo;
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