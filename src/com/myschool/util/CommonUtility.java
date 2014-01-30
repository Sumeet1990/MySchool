package com.myschool.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtility {
	
	String dateTimeFormat;
	static SimpleDateFormat formater;
	
	public static Date stringToDate( String dateStr) {
		
		Date date = null;
		try {
			date = formater.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date;
	}
	public static String dateToString( Date date) {
		formater = new SimpleDateFormat(CommonConstants.DATE_TIME_FORMAT);
			String dateStr = formater.format(date);
			return dateStr;
		}
	public String getDateTimeFormat() {
		return dateTimeFormat;
	}
	public void setDateTimeFormat(String dateTimeFormat) {
		this.dateTimeFormat = dateTimeFormat;
	}
}
