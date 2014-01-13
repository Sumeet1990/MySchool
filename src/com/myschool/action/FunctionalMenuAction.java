package com.myschool.action;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.mapping.Map;

import com.myschool.dto.UserDetailsDTO;
import com.myschool.interceptors.Object;
import com.myschool.interceptors.String;
import com.myschool.service.LoginService;
import com.myschool.util.CommonConstants;
import com.opensymphony.xwork2.ActionSupport;


/*
 * 
 */
public class FunctionalMenuAction extends ActionSupport implements SessionAware {
	
	private static Logger log = Logger.getLogger(FunctionalMenuAction.class);	
	
}
