<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login</title>
</head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/loginStylesheet.css"
	type="text/css">
<body>
	<s:form id="login" action="user" method="POST">
		<h1>MY SCHOOL</h1>
			<s:textfield id="inputs" name="username" label="User name"/> 
			<s:password id="inputs" name="password" label="Password"/>
			<s:submit  id="actions" value="Log in"/>

			<s:if test="%{#parameters.message!=''}">
			<h3 style="color:red;"> ${request.message}</h3>
			</s:if>
	</s:form>
</body>
</html>
