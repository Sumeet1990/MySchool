<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<link rel='stylesheet' id='magazine-pro-theme-css' href='css/common.css'
	type='text/css' media='all' />
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jQuery1.9.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/schoolCommon.js"></script>
</head>

<body class="home blog header-full-width content-sidebar magazine-home">
	<table cellpadding="2" cellspacing="2" width="100%">
		<tr style="background-color: white">
			<td height="20%" colspan="2"><tiles:insertAttribute
					name="header" /></td>
		</tr>
		<tr>
			<td style="background-color: white"><tiles:insertAttribute
					name="body" /></td>
		</tr>
		<tr>
			<td height="20%" colspan="2"><tiles:insertAttribute
					name="footer" /></td>
		</tr>
	</table>
</body>
</html>


