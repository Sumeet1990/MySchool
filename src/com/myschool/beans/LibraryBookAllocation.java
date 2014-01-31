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
private Integer libraryBookAlocId;

@Column(name="STUDENT_ROLL_NO")
private Integer studentRollNo;

@Column(name="STAFF_ID")
private Integer staffId;

@Column(name="BOOK_CODE")
private String bookCode;

@Column(name="BOOK_ALLOCATED_DATE_TIME")
private String bookAllocatedDateTime;

@Column(name="BOOK_DUE_DATE")
private String bookDueDate;

@Column(name="BOOK_RETURNED_DATE_TIME")
private String bookReturnedDateTime;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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
public String getBookAllocatedDateTime(){
 return bookAllocatedDateTime;
}
public void setBookAllocatedDateTime(String bookAllocatedDateTime){
 this.bookAllocatedDateTime=bookAllocatedDateTime;
}
public String getBookDueDate(){
 return bookDueDate;
}
public void setBookDueDate(String bookDueDate){
 this.bookDueDate=bookDueDate;
}
public String getBookReturnedDateTime(){
 return bookReturnedDateTime;
}
public void setBookReturnedDateTime(String bookReturnedDateTime){
 this.bookReturnedDateTime=bookReturnedDateTime;
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