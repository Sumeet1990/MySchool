package com.myschool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TRANSPORT_ROUT_DETAILS")
public class TransportRoutDetails implements Serializable{

@Id
@Column(name="TRANSPORTATION_ID")
Integer transportationId;

@Column(name="ROUT_NO")
String routNo;

@Column(name="VEHICLE_REG_NO")
String vehicleRegNo;

@Column(name="STARTING_POINT")
String startingPoint;

@Column(name="END_POINT")
String endPoint;

@Column(name="STOPS")
String stops;

@Column(name="TOTAL_STOPS")
String totalStops;

@Column(name="STARTING_TIME")
String startingTime;

@Column(name="REACHING_TIME")
String reachingTime;

@Column(name="SEATES_LEFT")
String seatesLeft;

@Column(name="CREATED_USER_ID")
String createdUserId;

@Column(name="MODIFIED_USER_ID")
String modifiedUserId;

@Column(name="CREATED_DATE_AND_TIME")
String createdDateAndTime;

@Column(name="MODIFIED_DATE_AND_TIME")
String modifiedDateAndTime;


public Integer getTransportationId(){
 return transportationId;
}
public void setTransportationId(Integer transportationId){
 this.transportationId=transportationId;
}
public String getRoutNo(){
 return routNo;
}
public void setRoutNo(String routNo){
 this.routNo=routNo;
}
public String getVehicleRegNo(){
 return vehicleRegNo;
}
public void setVehicleRegNo(String vehicleRegNo){
 this.vehicleRegNo=vehicleRegNo;
}
public String getStartingPoint(){
 return startingPoint;
}
public void setStartingPoint(String startingPoint){
 this.startingPoint=startingPoint;
}
public String getEndPoint(){
 return endPoint;
}
public void setEndPoint(String endPoint){
 this.endPoint=endPoint;
}
public String getStops(){
 return stops;
}
public void setStops(String stops){
 this.stops=stops;
}
public String getTotalStops(){
 return totalStops;
}
public void setTotalStops(String totalStops){
 this.totalStops=totalStops;
}
public String getStartingTime(){
 return startingTime;
}
public void setStartingTime(String startingTime){
 this.startingTime=startingTime;
}
public String getReachingTime(){
 return reachingTime;
}
public void setReachingTime(String reachingTime){
 this.reachingTime=reachingTime;
}
public String getSeatesLeft(){
 return seatesLeft;
}
public void setSeatesLeft(String seatesLeft){
 this.seatesLeft=seatesLeft;
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