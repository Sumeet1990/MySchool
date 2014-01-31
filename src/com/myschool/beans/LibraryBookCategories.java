package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIBRARY_BOOK_CATEGORIES")
public class LibraryBookCategories implements Serializable{

@Id
@Column(name="BOOK_CATEGORY_ID")
private Integer bookCategoryId;

@Column(name="CATEGORY_NAME")
private String categoryName;

@Column(name="CATEGORIES_ID")
private String categoriesId;

@Column(name="TOTAL_AVAILABLE_BOOKS")
private Integer totalAvailableBooks;

@Column(name="CREATED_USER_ID")
private String createdUserId;

@Column(name="MODIFIED_USER_ID")
private String modifiedUserId;

@Column(name="CREATED_DATE_TIME")
private String createdDateTime;

@Column(name="MODIFIED_DATE_TIME")
private String modifiedDateTime;


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