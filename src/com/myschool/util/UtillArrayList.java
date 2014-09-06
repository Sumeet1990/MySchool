package com.myschool.util;

import java.util.ArrayList;

public class UtillArrayList extends ArrayList<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UtillArrayList(String multipleValues) {
		String[] values = {""};
		if(multipleValues!=null){
			values = multipleValues.split(",");
		}
		for (int i = 0; i < values.length; i++) {
			this.add(values[i]);
		}
	}

}
