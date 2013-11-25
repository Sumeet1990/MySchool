<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login</title>
</head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/loginStylesheet.css"
	type="text/css">
	<script type="text/javascript"
	src="${pageContext.request.contextPath}/javascript/jQuery1.9.js"></script>

<body>
	<s:form id="login" action="user" method="GET">
		<h1>MY SCHOOL</h1>
			<s:textfield id="inputs" name="username" label="User name"/> 
			<s:textfield id="inputs" name="password" label="Password"/>
			<s:submit  id="actions" label="Log in"/>
	</s:form>
</body>
</html>
