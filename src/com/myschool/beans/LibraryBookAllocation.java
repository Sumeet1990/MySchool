package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIBRARY_BOOK_ALLOCATION")
public class LibraryBookAllocation implements Serializable{

@Id
@Column(name="LIBRARY_BOOK_ALOC_ID")
Integer libraryBookAlocId;

@Column(name="STUDENT_ROLL_NO")
Integer studentRollNo;

@Column(name="STAFF_ID")
Integer staffId;

@Column(name="BOOK_CODE")
String bookCode;

@Column(name="BOOK_ALLOCATED_DATE")
String bookAllocatedDate;

@Column(name="BOOK_DUE_DATE")
String bookDueDate;


@Column(name="BOOK_RETURNED_DATE_TIME")
String bookReturnedDateTime;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_TIME")
String modifiedDateAndTime;


public Integer getLibraryBookAlocId(){
 return libraryBookAlocId;
}
public void setLibraryBookAlocId(Integer libraryBookAlocId){
 this.libraryBookAlocId=libraryBookAlocId;
}
public Integer getStudentRollNo(){
 return studentRollNo;
}
public void setStudentRollNo(Integer studentRollNo){
 this.studentRollNo=studentRollNo;
}
public Integer getStaffId(){
 return staffId;
}
public void setStaffId(Integer staffId){
 this.staffId=staffId;
}
public String getBookCode(){
 return bookCode;
}
public void setBookCode(String bookCode){
 this.bookCode=bookCode;
}
public String getBookAllocatedDate(){
 return bookAllocatedDate;
}
public void setBookAllocatedDate(String bookAllocatedDate){
 this.bookAllocatedDate=bookAllocatedDate;
}
public String getBookDueDate(){
 return bookDueDate;
}
public void setBookDueDate(String bookDueDate){
 this.bookDueDate=bookDueDate;
}
public String getBookReturnedDateTime() {
	return bookReturnedDateTime;
}
public void setBookReturnedDateTime(String bookReturnedDateTime) {
	this.bookReturnedDateTime = bookReturnedDateTime;
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