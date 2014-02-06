package com.myschool.action;

import com.opensymphony.xwork2.ActionSupport;

public class ForwardAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String display;

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String execute()
	{
		return SUCCESS;
	}
}
