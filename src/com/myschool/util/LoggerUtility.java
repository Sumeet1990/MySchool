package com.myschool.util;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggerUtility {

	@Before("execution(* com.myschool.user.dao..*(..))")
	public void beforeMethod(JoinPoint joinPoint)
	{
		Logger methodLogger = Logger.getLogger(joinPoint.getTarget().getClass().getName());
		methodLogger.info("-----------------------------------------------------");
		methodLogger.info("Start of method "+joinPoint.getSignature().getName());
	}
	@After("execution(* com.myschool.user.dao..*(..))")
	public void afterMethod(JoinPoint joinPoint)
	{
		Logger methodLogger = Logger.getLogger(joinPoint.getTarget().getClass().getName());
		methodLogger.info("-----------------------------------------------------");
		methodLogger.info("End of method "+joinPoint.getSignature().getName());

	}
	
	@AfterThrowing(pointcut = "execution(* com.myschool.user.dao..*(..))", throwing = "ex")
	public void afterThrowingAdvice(JoinPoint jp, Exception ex) {
		Logger excepLogger = Logger.getLogger(jp.getTarget().getClass().getName());
		excepLogger.error("Exception : After throwing " + jp.getSignature().getName()
	            + "()");
		excepLogger.error("********* " + ex.getMessage()
	            + " Exception occured during " + jp.toShortString());
	    System.out.println("********* " + ex.getMessage()
	            + " Exception occured during " + jp.toShortString());

	}
}
