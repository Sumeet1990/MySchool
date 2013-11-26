package com.myschool.user.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.myschool.user.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport {
    private String username;
    private String password;

    private UserService userService;
    
    public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() {
           
		boolean valid = userService.verifyLoginCredentials(username, password);
		HttpServletRequest reqeust = ServletActionContext.getRequest();
		if(valid)
			return "success";
		else
		{
			reqeust.setAttribute("message", "Invalid credentials please try again");
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
}

