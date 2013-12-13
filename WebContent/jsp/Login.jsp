<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><s:property value="getText('login.title')"/></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/loginStylesheet.css"
	type="text/css">
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/textBox_button.css"
	type="text/css">
</head>
<body background="${pageContext.request.contextPath}/images/school_main.jpg">
	<s:form id="login" action="login" method="post">
		<h1><s:property value="getText('global.schoolname')"/></h1>
			<s:textfield id="inputs" key="login.username" name="username"/> 
			<s:password id="inputs" key="login.password" name="password"/>
			<s:submit  id="actions" value="Log in"/>

			<s:if test="#errorMesage!=''">
			<h3 style="color:red;"><s:property  value="errorMesage"/></h3>
			</s:if>
	</s:form>
</body>
</html>
