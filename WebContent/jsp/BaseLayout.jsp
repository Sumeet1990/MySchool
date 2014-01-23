<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/schoolCommon.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/textBox_button.css"
	type="text/css">
</head>

<body>
	<table border="1" cellpadding="2" cellspacing="2" width="100%">

		<tr>

			<td height="20%" colspan="2"><tiles:insertAttribute
					name="header" /></td>

		</tr>

		<tr>

			<td width="20%" height="500"><tiles:insertAttribute
					name="leftMenu" /></td>

			<td><tiles:insertAttribute name="body" /></td>

		</tr>

		<tr>

			<td height="20%" colspan="2"><tiles:insertAttribute
					name="footer" /></td>

		</tr>

	</table>

</body>
</html>


