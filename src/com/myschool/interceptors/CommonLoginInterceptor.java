package com.myschool.interceptors;
 
import java.util.Map;

import org.apache.commons.lang.xwork.StringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
 
public class CommonLoginInterceptor implements Interceptor {
 
	private static Logger log = Logger.getLogger(CommonLoginInterceptor.class);
	
    @Override
    public void destroy() {
    }
 
    @Override
    public void init() {
    }
 
    @Override
    public String intercept(ActionInvocation actionInvocation)
            throws Exception {
    	//DOMConfigurator.configure("log4j.xml");
    	log.debug("###################### login interceptor....");
        Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
         
        String userName = (String) sessionAttributes.get("userName");
         
        if(StringUtils.isBlank(userName)) {
            return "userError";
        } else {
            return actionInvocation.invoke();
        }
    }
}
