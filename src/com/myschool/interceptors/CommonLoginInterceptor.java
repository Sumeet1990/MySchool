package com.myschool.interceptors;
 
import java.util.Map;

import org.apache.commons.lang.xwork.StringUtils;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
 
public class CommonLoginInterceptor implements Interceptor {
 
 
    @Override
    public void destroy() {
    }
 
    @Override
    public void init() {
    }
 
    @Override
    public String intercept(ActionInvocation actionInvocation)
            throws Exception {
        System.out.println("login interceptor....");
        Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
         
        String userName = (String) sessionAttributes.get("userName");
         
        if(StringUtils.isBlank(userName)) {
            return "userError";
        } else {
            return actionInvocation.invoke();
        }
    }
}
