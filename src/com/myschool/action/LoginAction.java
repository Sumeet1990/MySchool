package com.myschool.action;

import java.util.Map;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

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
	private java.util.Map<String, Object> session;
	private LoginService loginService;
	private UserDetailsDTO userDetailsDTO;
	private Map schoolConfigurationMap;

	/*
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute() {
		log.debug("################# login Execute");
		boolean valid = false;
		if(StringUtils.isNotBlank(username) && StringUtils.isNotBlank(password)) {
			userDetailsDTO = loginService.retrieveLoginCredentials(username, password);
			
			log.debug("################## valid :"+valid);
			if(userDetailsDTO != null && !userDetailsDTO.isLocked() && userDetailsDTO.isVerificationStatus()) {
				System.out.println("!!!!! last login : "+userDetailsDTO.getLastLoginDetails());
				log.debug("!!!!! last login : "+userDetailsDTO.getLastLoginDetails());
				
				setErrorMesage(StringUtils.EMPTY);
				session.put(CommonConstants.USERNAME, getUsername());
				
				//TODO set Role name in session
				return SUCCESS;
			} else {
				if(session.containsKey(CommonConstants.USERNAME)) {
					session.remove(CommonConstants.USERNAME);	
					//TODO remove Role name in session
				} 
				
				if(userDetailsDTO ==null)
				{
					setErrorMesage(getText(CommonConstants.LOGIN_FAIL_INVALIDUSE));
				}
				else if( userDetailsDTO.isLocked()) {
					setErrorMesage(getText(CommonConstants.LOGIN_FAIL_LOCKED));
				} else {
					setErrorMesage(getText(CommonConstants.LOGIN_FAIL_INVALIDCREDENTIALS));
					setErrorMesage(getErrorMesage()+schoolConfigurationMap.get(CommonConstants.MAX_INVALID_LOGIN_ATTEMPTS));
					
				}
				
				return "failure";
			}
		} else {
			setErrorMesage(getText(CommonConstants.LOGIN_FAIL_INVALIDUSER));
			return "failure";
		}
	}
	
	/*
	 * 
	 */
	public String home() {
		if (StringUtils.isNotBlank((String) session.get(CommonConstants.USERNAME))) {
			setErrorMesage(StringUtils.EMPTY);
			username = (String) session.get(CommonConstants.USERNAME);
			
			return SUCCESS;
		} else {
			if(session.containsKey(CommonConstants.USERNAME)) {
				session.remove(CommonConstants.USERNAME);
				//TODO remove Role name in session
			}
			
			setErrorMesage(getText(CommonConstants.LOGIN_FAIL_INVALIDCREDENTIALS));				
			return "failure";
		}		
	}
	
	/*
	 * 
	 */
	public String logout() {		
		if(session.containsKey(CommonConstants.USERNAME)) {
			session.remove(CommonConstants.USERNAME);
			//TODO remove Role name in session
		}
		
		setErrorMesage(getText(CommonConstants.LOGIN_SUCCESS_LOGOUT));
		return "failure";
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

	public UserDetailsDTO getUserDetailsDTO() {
		return userDetailsDTO;
	}

	public void setUserDetailsDTO(UserDetailsDTO userDetailsDTO) {
		this.userDetailsDTO = userDetailsDTO;
	}
	
	@Override
	public void setSession(java.util.Map<String, Object> session) {
		this.session = session;
		
	}
	public Map getSchoolConfigurationMap() {
		return schoolConfigurationMap;
	}

	public void setSchoolConfigurationMap(Map schoolConfigurationMap) {
		this.schoolConfigurationMap = schoolConfigurationMap;
	}	
}
