<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/schoolCommon.js"/>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.9.js"/>
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/cssverticalmenu.css"/>		
	</head>
	
	<body onload="hideTransparentScreen()">
		<table height="100%" width="100%">
    		<tr height="10%">
        		<td align="center" background="${pageContext.request.contextPath}/images/school_main.jpg" ><tiles:insertAttribute name="header"/></td>
        	</tr>
    		<tr height="80%">
        		<td width="25%"><tiles:insertAttribute name="leftMenu" /></td><td width="75%"><tiles:insertAttribute name="body" /></td>
    		</tr>
    		<tr height="10%" style="bottom: 0;">
        		<td style="width:100%; " background="${pageContext.request.contextPath}/images/school_main.jpg"><tiles:insertAttribute name="footer"/></td>
    		</tr>
		</table>
		<div id="pleaseWaitScreen"><h2><s:property value="getText('global.waitMessage')"/></h2></div>
	</body>
</html>