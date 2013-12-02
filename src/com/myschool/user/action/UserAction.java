package com.myschool.user.action;

import com.myschool.user.dto.UserDetailsDTO;
import com.myschool.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
    private String username;
    private String password;
    private String errorMesage;
    private String userRoleName;

    private UserService userService;
    
    public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() {
		UserDetailsDTO userDetailsDTO = new   UserDetailsDTO();
		boolean valid = userService.verifyLoginCredentials(username, password, userDetailsDTO);
		if(valid)
		{
			setErrorMesage("");
			setUserRoleName(userService.getUserRoleName(userDetailsDTO.getUserRoleId()));
			return "success";
		}
		else
		{
			setErrorMesage("Invalid credentials please try again");
			return "failure";
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

	public String getUserRoleName() {
		return userRoleName;
	}

	public void setUserRoleName(String userRoleName) {
		this.userRoleName = userRoleName;
	}
}

