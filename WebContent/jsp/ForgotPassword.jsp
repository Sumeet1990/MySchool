<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.9.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/schoolCommon.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap_common.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/formElementsStyle.css">
	</head>	
	<body>
		<div id="page-wrap">
			<div id="content">
				<div align="center">
					<h3><s:property value="getText('global.schoolName')"/></h3>
				</div>
				<form action="" method="post" id="elements-form">
	    			<h3><s:property value="getText('forgotPassword.changePassword')"/></h3>
				    <div id="form-content">
						<fieldset>
							<br/>
							<s:if test="(validationStatus == true)">
					            <div class="fieldgroup">
					            	<label><s:property value="getText('forgotPassword.newPassword')"/></label>
					                <s:password required="true" name="newPassword" autofocus="autofocus" scope="page" tabindex="1"/>
					            </div>
					            <div class="fieldgroup">  
					                <label><s:property value="getText('forgotPassword.confirmNewPassword')"/></label>
					                <s:password required="true" name="confirmNewPassword" scope="page" tabindex="2"/>
					            </div>
								<div class="fieldgroup">
				                	<s:submit value="Reset password" action="resetPassword"></s:submit>
				                	<s:reset name="reset"></s:reset>
				                	<s:a style="color:aliceblue;" action="logout"><s:property value="getText('forgotPassword.logout')"/></s:a>
				            	</div>	
				            </s:if>	
				            <s:else>
				            	<s:if test="#errorMesage!=''">
									<span style="color:red;font-size: 16px;"><s:property  value="errorMesage"/></span>
								</s:if>
								<s:if test="%{userDetailsDTO.userId != null}">
									 <div class="fieldgroup">  
						                <label><s:property value="getText('forgotPassword.userName')"/></label>
						                <s:label cssClass="input username" value="%{userDetailsDTO.username}" readonly="true" theme="simple" scope="page" tabindex="2"/>
					            	</div>
					            	<div class="fieldgroup">  
						                <label><s:property value="getText('forgotPassword.securityQuestion')"/></label>
						                <s:label cssClass="input username" value="%{userDetailsDTO.securityQuestion}" readonly="true" theme="simple" scope="page" tabindex="2"/> 
					            	</div>
					            	<div class="fieldgroup">  
						                <label><s:property value="getText('forgotPassword.provideSecurityAnswer')"/></label>
						                <s:textfield required="true" autofocus="autofocus" scope="page" name="securityAnswer" tabindex="3"/>
					            	</div>
					            	<div class="fieldgroup">  
						                <label><s:property value="getText('forgotPassword.dob')"/></label>
						                <s:textfield required="true" scope="page" name="userDOB" tabindex="3"/>
					            	</div>
					            	<div class="fieldgroup">  
						                <label><s:property value="getText('forgotPassword.personalContactNumber')"/></label>
						               <s:textfield required="true" scope="page" name="personalContactNo" tabindex="4"/>
					            	</div>
					            	<div class="fieldgroup">
				                		<s:submit value="Reset password" action="validateSecurityAnswers"></s:submit>
				                		<s:reset name="reset"></s:reset>
				                		<s:a style="color:aliceblue;" action="logout"><s:property value="getText('forgotPassword.logout')"/></s:a>
				            		</div>
								</s:if>
								<s:else>
									<div class="fieldgroup">  
						                <label><s:property value="getText('forgotPassword.userName')"/></label>
						                <s:textfield required="true" autofocus="autofocus" scope="page" name="username" onkeyup="upperCaseThetext('username')" tabindex="1"/>
					            	</div>
					            	<div class="fieldgroup">
				                		<s:submit value="Continue" action="verifyUser"></s:submit>
				                		<s:reset name="reset"></s:reset>
				                		<s:a style="color:aliceblue;" action="logout"><s:property value="getText('forgotPassword.logout')"/></s:a>
				            		</div>
								</s:else>
				            </s:else>
				        </fieldset>
				    </div>
				</form>
			</div>
		</div>
	</body>
</html>				
				