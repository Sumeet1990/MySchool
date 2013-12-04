package com.myschool.user.action;

import java.util.Map;


import org.apache.commons.lang.xwork.StringUtils;
import org.apache.struts2.interceptor.SessionAware;
import com.myschool.user.dto.UserDetailsDTO;
import com.myschool.user.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String errorMesage;
	private String userRoleName;
	private Map<String, Object> session;
	private LoginService loginService;

	public String execute() {
		UserDetailsDTO userDetailsDTO = new UserDetailsDTO();

			boolean valid = loginService.verifyLoginCredentials(username,
					password, userDetailsDTO);
			if (valid) {
				setErrorMesage("");
				setUserRoleName(loginService.getUserRoleName(userDetailsDTO
						.getUserRoleId()));

				session.put("userName", getUsername());
				session.put("userRole", getUserRoleName());
				return "success";
			} else {
				session.remove("userName");
				session.remove("userRole");
				setMessage("Invalid credentials please try again");
				
				return "failure";
			}
	}

	private void setMessage(final String msg) {
		if(getErrorMesage().isEmpty())
		{
			setErrorMesage( msg);
		}
		else
		{
			setErrorMesage("");
		}
	}

	public String home() {
			if (StringUtils.isNotBlank((String) session.get("userName"))) {
				setErrorMesage("");
				username = (String) session.get("userName");
				userRoleName = (String) session.get("userRole");
				return "success";
			} else {
				session.remove("userName");
				session.remove("userRole");
				
				setMessage("Invalid credentials please try again");
				return "failure";
			}		
	}

	public String logout() {		
			session.remove("userName");
			session.remove("userRole");
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

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
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
