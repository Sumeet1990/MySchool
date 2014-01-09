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
public class MasterMenuAction extends ActionSupport implements SessionAware {
	
	private static Logger log = Logger.getLogger(MasterMenuAction.class);	
	
	private String errorMesage;
	private String roleName;
		
	/*
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute() {		
		Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
        
		setRoleName((String) sessionAttributes.get(CommonConstants.USERROLE));			
			
		return SUCCESS;		 
	}

	public String getErrorMesage() {
		return errorMesage;
	}

	public void setErrorMesage(String errorMesage) {
		this.errorMesage = errorMesage;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	
	
}
