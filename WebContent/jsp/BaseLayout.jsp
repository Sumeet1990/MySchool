<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<link rel='stylesheet' id='magazine-pro-theme-css' href='css/common.css' type='text/css' media='all' />

		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.9.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/schoolCommon.js"></script>
	</head>

	<body class="home blog header-full-width content-sidebar magazine-home">
		<table style="height=900px width=900px">
			<tr style="height=200px">
				<td colspan="2"><tiles:insertAttribute name="header" /></td>
			</tr>
			<tr style="background-color:gray height=600px">
				<td><tiles:insertAttribute name="body" /></td>
			</tr>
			<tr style="height=100px">
				<td colspan="2"><tiles:insertAttribute name="footer"/></td>
			</tr>
		</table>
	</body>
</html>


