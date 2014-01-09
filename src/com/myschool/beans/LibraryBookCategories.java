package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="LIBRARY_BOOK_CATEGORIES")
public class LibraryBookCategories implements Serializable{

@Column(name="BOOK_CATEGORY_ID")
Integer bookCategoryId;

@Column(name="CATEGORY_NAME")
String categoryName;

@Column(name="CATEGORIES_ID")
String categoriesId;

@Column(name="TOTAL_AVAILABLE_BOOKS")
Integer totalAvailableBooks;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getBookCategoryId(){
 return bookCategoryId;
}
public void setBookCategoryId(Integer bookCategoryId){
 this.bookCategoryId=bookCategoryId;
}
public String getCategoryName(){
 return categoryName;
}
public void setCategoryName(String categoryName){
 this.categoryName=categoryName;
}
public String getCategoriesId(){
 return categoriesId;
}
public void setCategoriesId(String categoriesId){
 this.categoriesId=categoriesId;
}
public Integer getTotalAvailableBooks(){
 return totalAvailableBooks;
}
public void setTotalAvailableBooks(Integer totalAvailableBooks){
 this.totalAvailableBooks=totalAvailableBooks;
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