<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/formElementsStyle.css" type="text/css">
		
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.9.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/schoolCommon.js"></script>

		<script type="text/javascript">
			$(document).ready(function(){
			  $("input,textarea").focus(function () {
			         $(this).next("span").show("slow").css("display,inline");
			    });
			  $("input,textarea").focusout(function () {
			         $(this).next("span").hide("slow");
			    });
			});
		 </script>
	</head>	
	<body style="background-color:#555">
		
		<s:form action="verifyUser" method="POST">
			<table border="0" id="form_table">
				<caption><s:property value="getText('forgotPassword.changePassword')"/></caption>
				<s:if test="(validationStatus == true)">
					<tr>
				    	<th width="25%"><s:property value="getText('forgotPassword.newPassword')"/> :</th>
				    	<td>
				     		<s:password required="true" name="newPassword" autofocus="autofocus" theme="simple"  scope="page" tabindex="1"/>
					   	  	<span><s:property value="getText('forgotPassword.newPassword')"/></span>
				   	 	</td>
				 	 </tr>
				 	 <tr>
				    	<th width="25%"><s:property value="getText('forgotPassword.confirmNewPassword')"/> :</th>
				    	<td>
				     		<s:password required="true" cssClass="input password" name="confirmNewPassword" theme="simple"  scope="page" tabindex="2"/>
							<span><s:property value="getText('forgotPassword.confirmNewPassword')"/></span>
				   	 	</td>
				 	 </tr>
				 	 <tr>
						<th width="25%">
							<s:a style="color:aliceblue;" action="logout"><s:property value="getText('forgotPassword.logout')"/></s:a>
						</th>
			    		
			    		<td>
			    			<s:submit value="Reset password" action="resetPassword" ></s:submit>
			     			<s:reset name="reset"></s:reset>
						</td>
			 	 	</tr>
				</s:if>
				<s:else>
					<s:if test="#errorMesage!=''">
						<span style="color:red;font-size: 16px;"><s:property  value="errorMesage"/></span>
					</s:if>
					
					<s:if test="%{userDetailsDTO.userId != null}">
						<tr>
				    		<th width="25%"><s:property value="getText('forgotPassword.userName')"/> :</th>
				    		<td>
				     			<s:label cssClass="input username" value="%{userDetailsDTO.username}" readonly="true" theme="simple" scope="page" tabindex="2"/>
				   	 		</td>
				 	 	</tr>
				 	 	<tr>
				    		<th width="25%"><s:property value="getText('forgotPassword.securityQuestion')"/> :</th>
				    		<td>
				     			<s:label cssClass="input username" value="%{userDetailsDTO.securityQuestion}" readonly="true" theme="simple" scope="page" tabindex="2"/> 
				   	 		</td>
				 	 	</tr>
				 	 	<tr>
				    		<th width="25%"><s:property value="getText('forgotPassword.provideSecurityAnswer')"/> :</th>
				    		<td>
				     			<s:textfield required="true" cssClass="input username"  autofocus="autofocus" theme="simple" scope="page" name="securityAnswer" tabindex="3"/>
								<span><s:property value="getText('forgotPassword.provideSecurityAnswer')"/></span>
							</td>
				 	 	</tr>
				 	 	<tr>
				    		<th width="25%"><s:property value="getText('forgotPassword.dob')"/> :</th>
				    		<td>
				     			<s:textfield required="true" cssClass="input username" theme="simple" scope="page" name="userDOB" tabindex="3"/>
								<span><s:property value="getText('forgotPassword.dob')"/></span>
							</td>
				 	 	</tr>
				 	 	<tr>
				    		<th width="25%"><s:property value="getText('forgotPassword.personalContactNumber')"/> :</th>
				    		<td>
				     			<s:textfield required="true" cssClass="input username" theme="simple" scope="page" name="personalContactNo" tabindex="4"/>
								<span><s:property value="getText('forgotPassword.personalContactNumber')"/></span>
							</td>
				 	 	</tr>
				 	 	<tr>
							<th width="25%">
								<s:a style="color:aliceblue;" action="logout"><s:property value="getText('forgotPassword.logout')"/></s:a>
							</th>
				    		
				    		<td>
				    			<s:submit value="Reset password" action="validateSecurityAnswers"></s:submit>
				     			<s:reset name="reset"></s:reset>
							</td>
				 	 	</tr>
				 	</s:if>
					<s:else>
						<tr>
				    		<th width="25%"><s:property value="getText('forgotPassword.userName')"/> :</th>
				    		<td>
				     			<s:textfield required="true" cssClass="input username" autofocus="autofocus" theme="simple" scope="page" name="username" onkeyup="upperCaseThetext('username')" tabindex="1"/> 
								<span><s:property value="getText('forgotPassword.userName')"/></span>
							</td>
				 	 	</tr>
				 	 	<tr>
							<th width="25%">
								<s:a style="color:aliceblue;" action="logout"><s:property value="getText('forgotPassword.logout')"/></s:a>
							</th>
				    		
				    		<td>
				    			<s:submit value="Continue"></s:submit>
				     			<s:reset name="reset"></s:reset>
							</td>
				 	 	</tr>
					</s:else>
				</s:else>
			</table>
		</s:form>
	</body>
</html>