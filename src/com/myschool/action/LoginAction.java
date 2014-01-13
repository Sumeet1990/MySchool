package com.myschool.action;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.mapping.Map;

import com.myschool.dto.UserDetailsDTO;
import com.myschool.service.LoginService;
import com.myschool.util.CommonConstants;
import com.opensymphony.xwork2.ActionSupport;


/*
 * 
 */
public class LoginAction extends ActionSupport implements SessionAware {
	
	private static Logger log = Logger.getLogger(LoginAction.class);
	
	private String username;
	private String password;
	private String errorMesage;
	private Map<String, Object> session;
	private LoginService loginService;
		
	/*
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute() {
		UserDetailsDTO userDetailsDTO = new UserDetailsDTO();
		
		log.debug("################# login Execute");
		
		boolean valid = loginService.getLoginCredentials(username,
				password, userDetailsDTO);
		log.debug("################## valid :"+valid);
		
		if(valid) {
			setErrorMesage(StringUtils.EMPTY);
			
			session.put(CommonConstants.USERNAME, getUsername());			
			return SUCCESS;
		} else {
			if(session.containsKey(CommonConstants.USERNAME)) {
				session.remove(CommonConstants.USERNAME);				
			}
			
			setMessage("Invalid credentials please try again");
			
			return FAILURE;
		}
	}
	
	/*
	 * 
	 */
	private void setMessage(final String msg) {
		if(getErrorMesage().isEmpty()) {
			setErrorMesage( msg);
		}
		else {
			setErrorMesage(StringUtils.EMPTY);
		}
	}
	
	/*
	 * 
	 */
	public String home() {
			if (StringUtils.isNotBlank((String) session.get(CommonConstants.USERNAME))) {
				setErrorMesage("");
				username = (String) session.get(CommonConstants.USERNAME);
				
				return SUCCESS;
			} else {
				if(session.containsKey(CommonConstants.USERNAME)) {
					session.remove(CommonConstants.USERNAME);
				}
				
				setMessage("Invalid credentials please try again");
				
				return FAILURE;
			}		
	}
	
	/*
	 * 
	 */
	public String logout() {		
		if(session.containsKey(CommonConstants.USERNAME)) {
			session.remove(CommonConstants.USERNAME);
		}
		
		setMessage("You are successfully logged out !");
		return FAILURE;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getErrorMesage() {
		return errorMesage;
	}

	public void setErrorMesage(String errorMesage) {
		this.errorMesage = errorMesage;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> map) {
		this.session = map;

	}
}
