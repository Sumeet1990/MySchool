<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/loginStylesheet.css"
	type="text/css">
</head>
<body>
	<s:form id="login" action="user" method="POST">
		<h1>MY SCHOOL</h1>
			<s:textfield id="inputs" name="username" label="User name"/> 
			<s:password id="inputs" name="password" label="Password"/>
			<s:submit  id="actions" value="Log in"/>

			<s:if test="#errorMesage!=''">
			<h3 style="color:red;"><s:property  value="errorMesage"/></h3>
			</s:if>
	</s:form>
</body>
</html>
