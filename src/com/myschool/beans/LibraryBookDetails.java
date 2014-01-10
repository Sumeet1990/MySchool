package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="LIBRARY_BOOK_DETAILS")
public class LibraryBookDetails implements Serializable{

@Id
@Column(name="BOOK_DETAIL_ID")
Integer bookDetailId;

@Column(name="BOOK_CATEGORY_ID")
Integer bookCategoryId;

@Column(name="BOOK_CODE")
String bookCode;

@Column(name="BOOK_NAME")
String bookName;

@Column(name="AUTHOR_NAME")
String authorName;

@Column(name="PUBLISHER_NAME")
String publisherName;

@Column(name="NO_OF_PAGES")
Integer noOfPages;

@Column(name="BOOK_ACCESSORIES")
String bookAccessories;

@Column(name="PURCHASED_DATE")
String purchasedDate;

@Column(name="BOOK_PRICE")
String bookPrice;

@Column(name="BOOK_PRICE_MEASURE")
String bookPriceMeasure;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getBookDetailId(){
 return bookDetailId;
}
public void setBookDetailId(Integer bookDetailId){
 this.bookDetailId=bookDetailId;
}
public Integer getBookCategoryId(){
 return bookCategoryId;
}
public void setBookCategoryId(Integer bookCategoryId){
 this.bookCategoryId=bookCategoryId;
}
public String getBookCode(){
 return bookCode;
}
public void setBookCode(String bookCode){
 this.bookCode=bookCode;
}
public String getBookName(){
 return bookName;
}
public void setBookName(String bookName){
 this.bookName=bookName;
}
public String getAuthorName(){
 return authorName;
}
public void setAuthorName(String authorName){
 this.authorName=authorName;
}

public String getPublisherName() {
	return publisherName;
}
public void setPublisherName(String publisherName) {
	this.publisherName = publisherName;
}

public Integer getNoOfPages(){
 return noOfPages;
}
public void setNoOfPages(Integer noOfPages){
 this.noOfPages=noOfPages;
}
public String getBookAccessories(){
 return bookAccessories;
}
public void setBookAccessories(String bookAccessories){
 this.bookAccessories=bookAccessories;
}
public String getPurchasedDate(){
 return purchasedDate;
}
public void setPurchasedDate(String purchasedDate){
 this.purchasedDate=purchasedDate;
}
public String getBookPrice(){
 return bookPrice;
}
public void setBookPrice(String bookPrice){
 this.bookPrice=bookPrice;
}
public String getBookPriceMeasure(){
 return bookPriceMeasure;
}
public void setBookPriceMeasure(String bookPriceMeasure){
 this.bookPriceMeasure=bookPriceMeasure;
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