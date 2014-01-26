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
	private String lastLoginDetails;
	private String errorMesage;
	private java.util.Map<String, Object> session;
	private LoginService loginService;
	private UserDetailsDTO userDetailsDTO;


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
				lastLoginDetails = userDetailsDTO.getLastLoginDetails(); 
				System.out.println("@@@@@@@ lastLoginDateTIme : "+lastLoginDetails);
				log.debug("@@@@@@@ lastLoginDateTIme : "+lastLoginDetails);
				setErrorMesage(StringUtils.EMPTY);
				session.put(CommonConstants.USERNAME, getUsername());
				session.put(CommonConstants.LAST_LOGIN_DETAILS, lastLoginDetails);
				//TODO set Role name in session
				return SUCCESS;
			} else {
				if(session.containsKey(CommonConstants.USERNAME)) {
					session.remove(CommonConstants.USERNAME);	
					session.remove(CommonConstants.LAST_LOGIN_DETAILS);
					//TODO remove Role name in session
				} 
				
				if(userDetailsDTO.isLocked()) {
					setMessage("Your account has been locked!");
				} else {
					setMessage("Invalid credentials please try again");
				}
				
				return "failure";
			}
		} else {
			setMessage("Please enter username and password");
			return "failure";
		}
	}
	
	/*
	 * 
	 */
	private void setMessage(final String msg) {
		if(getErrorMesage() == null || getErrorMesage().isEmpty()) {
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
			setErrorMesage(StringUtils.EMPTY);
			username = (String) session.get(CommonConstants.USERNAME);
			lastLoginDetails = (String) session.get(CommonConstants.LAST_LOGIN_DETAILS);
			
			return SUCCESS;
		} else {
			if(session.containsKey(CommonConstants.USERNAME)) {
				session.remove(CommonConstants.USERNAME);
				session.remove(CommonConstants.LAST_LOGIN_DETAILS);
				//TODO remove Role name in session
			}
			
			setMessage("Invalid credentials please try again");				
			return "failure";
		}		
	}
	
	/*
	 * 
	 */
	public String logout() {		
		if(session.containsKey(CommonConstants.USERNAME)) {
			session.remove(CommonConstants.USERNAME);
			session.remove(CommonConstants.LAST_LOGIN_DETAILS);
			//TODO remove Role name in session
		}
		
		setMessage("You are successfully logged out !");
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

	public String getLastLoginDetails() {
		return lastLoginDetails;
	}

	public void setLastLoginDetails(String lastLoginDetails) {
		this.lastLoginDetails = lastLoginDetails;
	}	
}
