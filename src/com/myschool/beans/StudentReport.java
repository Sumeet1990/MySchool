package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_REPORT")
public class StudentReport implements Serializable{

@Id
@Column(name="STUDENT_REPORT_ID")
String studentReportId;

@Column(name="STUDENT_REGISTRATION_ID")
Integer studentRegistrationId;

@Column(name="STUDENT_ROLL_NO")
String studentRollNo;

@Column(name="SCHOOL_CLASS_NAME")
String schoolClassName;

@Column(name="SECTION")
String section;

@Column(name="TEST_NAME")
String testName;

@Column(name="SUBJECT_CODES_MARKS")
String subjectCodesMarks;

@Column(name="SUBJECTS_FAILED")
Integer subjectsFailed;

@Column(name="TOTAL_MARKS")
Integer totalMarks;

@Column(name="PERCENTAGE_OF_MARKS")
Integer percentageOfMarks;

@Column(name="RANK")
Integer rank;

@Column(name="GRADE")
String grade;

@Column(name="TOTAL_PRESENT_DAYS")
Integer totalPresentDays;

@Column(name="EXAM_RESULT")
String examResult;

@Column(name="TOTAL_WORKING_DAYS")
Integer totalWorkingDays;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public String getStudentReportId(){
 return studentReportId;
}
public void setStudentReportId(String studentReportId){
 this.studentReportId=studentReportId;
}
public Integer getStudentRegistrationId(){
 return studentRegistrationId;
}
public void setStudentRegistrationId(Integer studentRegistrationId){
 this.studentRegistrationId=studentRegistrationId;
}
public String getStudentRollNo(){
 return studentRollNo;
}
public void setStudentRollNo(String studentRollNo){
 this.studentRollNo=studentRollNo;
}
public String getSchoolClassName(){
 return schoolClassName;
}
public void setSchoolClassName(String schoolClassName){
 this.schoolClassName=schoolClassName;
}
public String getSection(){
 return section;
}
public void setSection(String section){
 this.section=section;
}
public String getTestName(){
 return testName;
}
public void setTestName(String testName){
 this.testName=testName;
}
public String getSubjectCodesMarks(){
 return subjectCodesMarks;
}
public void setSubjectCodesMarks(String subjectCodesMarks){
 this.subjectCodesMarks=subjectCodesMarks;
}
public Integer getSubjectsFailed(){
 return subjectsFailed;
}
public void setSubjectsFailed(Integer subjectsFailed){
 this.subjectsFailed=subjectsFailed;
}
public Integer getTotalMarks(){
 return totalMarks;
}
public void setTotalMarks(Integer totalMarks){
 this.totalMarks=totalMarks;
}
public Integer getPercentageOfMarks(){
 return percentageOfMarks;
}
public void setPercentageOfMarks(Integer percentageOfMarks){
 this.percentageOfMarks=percentageOfMarks;
}
public Integer getRank(){
 return rank;
}
public void setRank(Integer rank){
 this.rank=rank;
}
public String getGrade(){
 return grade;
}
public void setGrade(String grade){
 this.grade=grade;
}
public Integer getTotalPresentDays(){
 return totalPresentDays;
}
public void setTotalPresentDays(Integer totalPresentDays){
 this.totalPresentDays=totalPresentDays;
}
public String getExamResult(){
 return examResult;
}
public void setExamResult(String examResult){
 this.examResult=examResult;
}
public Integer getTotalWorkingDays(){
 return totalWorkingDays;
}
public void setTotalWorkingDays(Integer totalWorkingDays){
 this.totalWorkingDays=totalWorkingDays;
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