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
private String studentReportId;

@Column(name="STUDENT_REGISTRATION_ID")
private Integer studentRegistrationId;

@Column(name="STUDENT_ROLL_NO")
private String studentRollNo;

@Column(name="SCHOOL_CLASS_NAME")
private String schoolClassName;

@Column(name="SECTION")
private String section;

@Column(name="TEST_NAME")
private String testName;

@Column(name="SUBJECT_CODES_MARKS")
private String subjectCodesMarks;

@Column(name="SUBJECTS_FAILED")
private Integer subjectsFailed;

@Column(name="TOTAL_MARKS")
private Integer totalMarks;

@Column(name="PERCENTAGE_OF_MARKS")
private Integer percentageOfMarks;

@Column(name="RANK")
private Integer rank;

@Column(name="GRADE")
private String grade;

@Column(name="EXAM_RESULT")
private String examResult;

@Column(name="TOTAL_PRESENT_DAYS")
private Integer totalPresentDays;

@Column(name="TOTAL_LEAVE_DAYS")
private Integer totalLeaveDays;

@Column(name="TOTAL_ABSENT_DAYS")
private Integer totalAbsentDays;

@Column(name="TOTAL_WORKING_DAYS")
private Integer totalWorkingDays;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public String getExamResult(){
 return examResult;
}
public void setExamResult(String examResult){
 this.examResult=examResult;
}
public Integer getTotalPresentDays(){
 return totalPresentDays;
}
public void setTotalPresentDays(Integer totalPresentDays){
 this.totalPresentDays=totalPresentDays;
}
public Integer getTotalLeaveDays(){
 return totalLeaveDays;
}
public void setTotalLeaveDays(Integer totalLeaveDays){
 this.totalLeaveDays=totalLeaveDays;
}
public Integer getTotalAbsentDays(){
 return totalAbsentDays;
}
public void setTotalAbsentDays(Integer totalAbsentDays){
 this.totalAbsentDays=totalAbsentDays;
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