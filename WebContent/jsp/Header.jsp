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
	<h3 class="textColor" align="left">
		<s:property value="getText('header.welcome')" />
		<s:property value='#session.sessionUtils.userGivenFullName' /> <s:property value='#session.sessionUtils.userSurname' />
		,
		<s:property value="getText('header.role')" /> <s:property value='#session.sessionUtils.userRolesName' />
	</h3>
	<h3 class="textColor" align="left">
		<s:property value="getText('header.lastlogin.datetime')" />
		:
		<s:property value="#session.sessionUtils.lastLogedinDateTime" />
	</h3>
	<h3 align="left">
		<s:property value="getText('header.current.datetime')" />
		: <span class="textColor" id="timeDisplay" />
	</h3>
	<div class="toolTip" id="tooltipId"></div>

	<s:a style="color:aliceblue;" href="%{helpAction}">
		<img id="Icon" style="right: 60px" src="images/Help and support.png"
			onmouseout="hideToolTip()" onmouseover="showToolTip('Help','60px')">
	</s:a>
	<s:a style="color:aliceblue;" action="logout">
		<img id="Icon" style="right: 10px"
			src="images/gnome-session-logout.png" onmouseout="hideToolTip()"
			onmouseover="showToolTip('Logout','10px')">
	</s:a>
</body>
<script type="text/javascript">
startTime();
</script>
</html>
