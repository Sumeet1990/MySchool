<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		
		<title>My School Login</title>
    	
    	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
    	<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
    	<meta name="description" content="My School Form"/>
    	<meta name="keywords" content="My School Form"/>
    	<meta name="author" content="Ishan"/>
    		
		<link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css" />
		<link href="${pageContext.request.contextPath}/fonts/pacifico/stylesheet.css" rel="stylesheet" type="text/css" />
			
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/schoolCommon.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.9.js"></script>
		<script type="text/javascript" src="../js/jquery.min.js"></script>
		
		<!--Sliding icons-->
		<script type="text/javascript">
			$(document).ready(function() {
				$(".username").focus(function() {
					$(".user-icon").css("left","-48px");
				});
				
				$(".username").blur(function() {
					$(".user-icon").css("left","0px");
				});
		
				$(".password").focus(function() {
					$(".pass-icon").css("left","-48px");
				});
				
				$(".password").blur(function() {
					$(".pass-icon").css("left","0px");
				});
			});
		</script>
	</head>
	
	<body>
		<div class="heading">
    		<s:property value="getText('global.schoolname')"/>
    	</div>
    
		<div id="wrapper">
			<!--Sliding icons-->
    		<div class="user-icon"></div>
    		<div class="pass-icon"></div>
    		<!--END Sliding icons-->
			
			<s:form name="login-form" id="login-form" action="login" method="post">
    			<div class="header">
    				<h1><s:property value="getText('login')"/></h1>
     				<s:if test="#errorMesage!=''">
    					<span style="color:red;font-size: 16px;"><s:property  value="errorMesage"/></span>
					</s:if>
    			</div>    			
    			<div class="content">
    				<s:textfield cssClass="input username" placeholder="%{getText('login.username')}"  autofocus="autofocus" theme="simple" scope="page" name="username" onkeyup="upperCaseThetext('username')" tabindex="1"/> 
					<s:password cssClass="input password" placeholder="%{getText('login.password')}" name="password" theme="simple"  scope="page" tabindex="2"/>
				</div>
    
    			<div class="footer">
    				<s:submit  id="button" value="%{getText('login.submit.login')}" theme="simple"  scope="page" onclick="showTransparentScreen()" tabindex="3"/>
    				<!--Register button-->
    				<input type="submit" name="submit" value="<s:property  value="getText('login.forgotpassword')"/>" class="register" />
    			</div>
			</s:form>
		</div>

		<!--bg gradient-->
		<div class="gradient"></div>
		<!--END bg gradient-->
	</body>
</html>