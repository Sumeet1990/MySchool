package com.myschool.action;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.log4j.Logger;

import com.myschool.dto.UserDetailsDTO;
import com.myschool.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;

public class ForgotPasswordAction extends ActionSupport {	
	private static final String FAILURE = "failure";

	private static Logger log = Logger.getLogger(ForgotPasswordAction.class);
	
	private String username;
	private String password;
	private String errorMesage;
	private LoginService loginService;
	private UserDetailsDTO userDetailsDTO = null;
	private String securityAnswer;
	private String userDOB;
	private String personalContactNo;
	private boolean validationStatus;
	private String newPassword;
	private String confirmNewPassword;
	
	/*
	 * (non-Javadoc)
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	public String execute() {
		userDetailsDTO = new UserDetailsDTO();
		userDetailsDTO.setUserName(username);
		int valid = getLoginService().getUserDetails(userDetailsDTO);
		
		if (valid == -1) {
			setErrorMesage("User Name is Invalid!");
			return FAILURE;
		} else {
			return SUCCESS;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public String validateSecurityAnswers() {
		if(StringUtils.equalsIgnoreCase(userDetailsDTO.getSecurityAnswer(), securityAnswer) 
				&& StringUtils.equalsIgnoreCase(userDetailsDTO.getUserDob(), userDOB)
				&& StringUtils.equalsIgnoreCase(userDetailsDTO.getPersonalContactNumber(),personalContactNo)) {
			setValidationStatus(true);
			return SUCCESS;
		} else {
			setErrorMesage("Entered Details are Invalid!");
			setValidationStatus(false);
			return FAILURE;
		}		
	}
	
	public String resetPassword()
	{
		userDetailsDTO.setPassword(newPassword);
		boolean resetStatus = getLoginService().resetPassword(userDetailsDTO);
		if(resetStatus)
		{
			setErrorMesage("Your password has changed successfully !");
			return SUCCESS;	
		}else
		{
			setErrorMesage("Could not reset password. Please check with SYSTEM ADMINISTRATOR !");
			return FAILURE;
		}
		
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


	public String getSecurityAnswer() {
		return securityAnswer;
	}


	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}


	public String getUserDOB() {
		return userDOB;
	}


	public void setUserDOB(String userDOB) {
		this.userDOB = userDOB;
	}


	public String getPersonalContactNo() {
		return personalContactNo;
	}


	public void setPersonalContactNo(String personalContactNo) {
		this.personalContactNo = personalContactNo;
	}

	public boolean isValidationStatus() {
		return validationStatus;
	}

	public void setValidationStatus(boolean validationStatus) {
		this.validationStatus = validationStatus;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}	
}
