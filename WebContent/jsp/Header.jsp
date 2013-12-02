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
<h1 class="textColor" > My School</h1>
<h3 class="textColor" align="right" > <s:property value="username"  /> Logged in as  <s:property value="userRoleName"/></h3>
<h4  class="textColor" id="timeDisplay" align="right" ></h4>
</body>
</html>
