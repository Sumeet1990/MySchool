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
private Integer schoolTimingsId;

@Column(name="SCHOOL_CLASS_ID")
private Integer schoolClassId;

@Column(name="ACADEMIC_OPENING_DAY")
private String academicOpeningDay;

@Column(name="ACADEMIC_CLOSING_DAY")
private String academicClosingDay;

@Column(name="TIMING_DURATION_FROM")
private String timingDurationFrom;

@Column(name="TIMING_DURATION_TO")
private String timingDurationTo;

@Column(name="WEEK_DAY")
private String weekDay;

@Column(name="SCHOOL_START_TIME")
private String schoolStartTime;

@Column(name="START_OFFSET_TIME")
private String startOffsetTime;

@Column(name="OFFSET_TIME_MEASURE")
private String offsetTimeMeasure;

@Column(name="SCHOOL_FINISH_TIME")
private String schoolFinishTime;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public String getWeekDay(){
 return weekDay;
}
public void setWeekDay(String weekDay){
 this.weekDay=weekDay;
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