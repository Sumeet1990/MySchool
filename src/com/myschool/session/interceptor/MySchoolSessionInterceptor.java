package com.myschool.session.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 
 * @author
 *
 */
public class MySchoolSessionInterceptor extends AbstractInterceptor implements StrutsStatics {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		final ActionContext context = invocation.getInvocationContext();
		HttpServletRequest request = (HttpServletRequest) context.get(HTTP_REQUEST);
		
		HttpSession session = request.getSession(false);
		if (session == null) {
			return "sessionTimeout";
		} else {
			return invocation.invoke();
		}
	}
}
