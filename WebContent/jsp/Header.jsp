<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.Date" %>
<html>
<head>
<title>Login</title>
<script type="text/javascript">
function startTime() {
	var today = new Date();

	var curr_year = today.toDateString();
	var h = today.getHours();
	var m = today.getMinutes();
	var s = today.getSeconds();
	// add a zero in front of numbers<10
	m = checkTime(m);
	s = checkTime(s);
	document.getElementById('timeDisplay').innerHTML = curr_year + "  " + "   "
			+ h + ":" + m + ":" + s;
	t = setTimeout(function() {
		startTime();
	}, 500);
}
function checkTime(i) {
	if (i < 10) {
		i = "0" + i;
	}
	return i;
}

</script>
	</head>
<body onload="startTime()">
<h1 class="textColor" style="margin-top: 0;"> My School</h1>
<s:url action="home.action" var="homeAction" />
<s:url action="" var="helpAction" />
<s:url action="logout.action" var="logoutAction" />

<h3 class="textColor" align="right" > 
<s:property value='#session.userName'/> Logged in as  <s:property value="#session.userRole"/></h3>
<h4  class="textColor" id="timeDisplay" align="right" ></h4>
<s:a style="color:aliceblue;" href="%{homeAction}" > Home</s:a>
<s:a style="color:aliceblue;" href="%{helpAction}" > Help</s:a> 
<s:a style="color:aliceblue;" href="%{logoutAction}" > Logout</s:a>
</body>
</html>
