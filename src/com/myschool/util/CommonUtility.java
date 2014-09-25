package com.myschool.util;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.myschool.util.CommonConstants;

import org.apache.commons.beanutils.BeanUtils;

public class CommonUtility {
	
	String dateTimeFormat;
	static SimpleDateFormat formater;
	
	/**
	 * 
	 * @param dateStr
	 * @return
	 */
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
	
	/**
	 * 
	 * @param src
	 * @param dest
	 * @param properties
	 */
	public static void copyProperties(Object src, Object dest, String... properties) {
	    for (String property : properties) {
            String[] arr = property.split(" ");
            String srcProperty;
            String destProperty;
            if (arr.length == 2) {
                    srcProperty = arr[0];
                    destProperty = arr[1];
            } else {
                    srcProperty = property;
                    destProperty = property;
            }
            
            try {
				BeanUtils.setProperty(dest, destProperty, BeanUtils.getProperty(
				                src, srcProperty));
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	}
	
	/**
	 * 
	 * @param date
	 * @return
	 */
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
