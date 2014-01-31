<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Forgot Password</title>
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.9.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/schoolCommon.js"></script>
	</head>
	
	<body>
		<s:form action="verifyUser" method="GET">
		<s:if test="(validationStatus == true)">
			<s:password cssClass="input password" placeholder="%{getText('login.password')}" name="newPassword" theme="simple"  scope="page" tabindex="1"/>
			<s:password cssClass="input password" placeholder="Confirm password" name="confirmNewPassword" theme="simple"  scope="page" tabindex="2"/>
			<s:submit value="Reset password" action="resetPassword" ></s:submit>
		</s:if>
		<s:else>
			<s:if test="#errorMesage!=''">
				<span style="color:red;font-size: 16px;"><s:property  value="errorMesage"/></span>
			</s:if>
			
			<s:if test="%{userDetailsDTO.userId != null}">
				User Name : <s:label cssClass="input username" value="%{userDetailsDTO.username}" readonly="true" theme="simple" scope="page" tabindex="2"/> <br/>
				Your security question is : <s:label cssClass="input username" value="%{userDetailsDTO.securityQuestion}" readonly="true" theme="simple" scope="page" tabindex="2"/> <br/>
                <s:textfield cssClass="input username" placeholder="Please provide security answer"  theme="simple" scope="page" name="securityAnswer" tabindex="3"/> <br/>
				<s:textfield cssClass="input username" placeholder="Date of birth"  theme="simple" scope="page" name="userDOB" tabindex="3"/> <br/>
				<s:textfield cssClass="input username" placeholder="Contact Number"  theme="simple" scope="page" name="personalContactNo" tabindex="4"/><br/> 
				<s:submit value="Reset password" action="validateSecurityAnswers"></s:submit>
			</s:if>
			<s:else>
				<s:textfield cssClass="input username" placeholder="%{getText('login.username')}"  autofocus="autofocus" theme="simple" scope="page" name="username" onkeyup="upperCaseThetext('username')" tabindex="1"/> 
				<s:submit value="Continue"></s:submit>
			</s:else>
		</s:else>
		</s:form>
	</body>
</html>