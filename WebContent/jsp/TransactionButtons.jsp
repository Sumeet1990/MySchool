<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>My School Login</title>

<link href="${pageContext.request.contextPath}/css/style.css"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- Buttons For Configurational Menu Transactions -->
	<s:submit value="Create" style="background-color: green"
		cssClass="buttonStyle" theme="simple" scope="page" onclick=""
		tabindex="1" />
	<s:submit value="Modify" style="background-color: orange"
		cssClass="buttonStyle" theme="simple" scope="page" onclick=""
		tabindex="2" />
	<s:submit value="Delete" style="background-color: red"
		cssClass="buttonStyle" theme="simple" scope="page" onclick=""
		tabindex="3" />
	<s:submit value="View" style="background-color: blue"
		cssClass="buttonStyle" theme="simple" scope="page" onclick=""
		tabindex="4" />

	<!-- Buttons For Functional Menu Transactions -->
	<s:submit value="Add" style="background-color: green" theme="simple"
		scope="page" cssClass="buttonStyle" onclick="" tabindex="1" />
	<s:submit value="Edit" style="background-color: orange" theme="simple"
		scope="page" onclick="" tabindex="2" cssClass="buttonStyle" />
	<s:submit value="Remove" style="background-color: red" theme="simple"
		scope="page" onclick="" tabindex="3" cssClass="buttonStyle" />
	<s:submit value="Show" style="background-color: blue" theme="simple"
		scope="page" onclick="" tabindex="4" cssClass="buttonStyle" />

	<!-- Button For Student Migration from one Class/Section to Another Class/Section -->
	<s:submit style="background-color: deeppink" value="Migrate"
		theme="simple" scope="page" onclick="" tabindex="5"
		cssClass="buttonStyle" />

	<!-- Button For Student Generate Student Attendance Report -->
	<s:submit style="background-color: blueviolet" value="Generate"
		theme="simple" scope="page" onclick="" tabindex="6"
		cssClass="buttonStyle" />
</body>
</html>