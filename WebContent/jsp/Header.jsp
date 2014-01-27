<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<head>
<title>Login</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/textBox_button.css"
	type="text/css">
</head>
<body>
	<h1 class="textColor" align="center" style="margin-top: 0;">
		<s:property value="getText('global.schoolname')" />
	</h1>
	<s:url action="home.action" var="homeAction" />
	<s:url action="" var="helpAction" />
	<s:url action="logout.action" var="logoutAction" />

	<h3 class="textColor" align="left">
		<s:property value="getText('header.welcome')" />
		<s:property value='#session.userName' />
		,
		<s:property value="getText('header.role')" />
	</h3>
	<h3 class="textColor" align="left">
		<s:property value="getText('header.lastlogin.datetime')" />
		:
		<s:property value="%{userDetailsDTO.lastLoginDetails}" />
	</h3>
	<h3 align="left">
		<s:property value="getText('header.current.datetime')" />
		: <span class="textColor" id="timeDisplay" />
	</h3>
	<div class="toolTip" id="tooltipId"></div>
	<s:a style="color:aliceblue;" href="%{homeAction}">
		<img id="Icon" style="right: 110px" src="images/home.png"
			onmouseout="hideToolTip()" onmouseover="showToolTip('Home','110px')">
	</s:a>
	<s:a style="color:aliceblue;" href="%{helpAction}">
		<img id="Icon" style="right: 60px" src="images/Help and support.png"
			onmouseout="hideToolTip()" onmouseover="showToolTip('Help','60px')">
	</s:a>
	<s:a style="color:aliceblue;" href="%{logoutAction}">
		<img id="Icon" style="right: 10px"
			src="images/gnome-session-logout.png" onmouseout="hideToolTip()"
			onmouseover="showToolTip('Logout','10px')">
	</s:a>
</body>
<script type="text/javascript">
startTime();
</script>
</html>
