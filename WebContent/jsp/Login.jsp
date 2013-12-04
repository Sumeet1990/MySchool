<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/loginStylesheet.css"
	type="text/css">
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/textBox_button.css"
	type="text/css">
</head>
<body background="${pageContext.request.contextPath}/images/school_main.jpg">
	<s:form id="login" action="login" method="POST">
		<h1>MY SCHOOL</h1>
			<s:textfield id="inputs" key="username" name="username" label="User name" /> 
			<s:password id="inputs" key="password" name="password" label="Password" />
			<s:submit  id="actions" value="Log in"/>

			<s:if test="#errorMesage!=''">
			<h3 style="color:red;"><s:property  value="errorMesage"/></h3>
			</s:if>
	</s:form>
</body>
</html>
