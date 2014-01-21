<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Login</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/textBox_button.css"
	type="text/css">
	</head>
<body>
<h1 class="textColor" style="margin-top: 0;"><s:property value="getText('global.schoolname')"/>l</h1>
<s:url action="home.action" var="homeAction" />
<s:url action="" var="helpAction" />
<s:url action="logout.action" var="logoutAction" />

<h3 class="textColor" align="right" > 
Welcome <s:property value='#session.userName'/></h3>
<h4  class="textColor" id="timeDisplay" align="right" ></h4>
<div class="toolTip" id="tooltipId"> </div>
<s:a style="color:aliceblue;" href="%{homeAction}" > <img id="Icon" style="width: 3%; top:110px; right:10px" src="images/home.png" onmouseout="hideToolTip()" onmouseover="showToolTip('Home','20px','50px')"></s:a>
<s:a style="color:aliceblue;" href="%{helpAction}" > <img id="Icon" style="width: 3%; top:110px; left:60px" src="images/Help and support.png" onmouseout="hideToolTip()" onmouseover="showToolTip('Help','90px','50px')"></s:a> 
<s:a style="color:aliceblue;" href="%{logoutAction}" > <img id="Icon" style="width: 3%; right:10px" src="images/gnome-session-logout.png" onmouseout="hideToolTip()" onmouseover="showToolTip('Logout','1205px','130px')"></s:a>
</body>
<script type="text/javascript">
startTime();
</script>
</html>
