<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<style type="text/css">
			* {margin: 0; padding: 0;}
	
			body {
				background: #4EB889;
				font-family: Nunito, arial, verdana;
			}
		</style>
	</head>
	
	<body>
		<table height="100%" width="100%"border=1>
			<tr height="15%">
        		<td colspan="2" align="center" ><font color="white"><tiles:insertAttribute name="header"/></font></td>
    		</tr>	
    		<tr height="75%">
        		<td width="20%">
					<tiles:insertAttribute name="leftMenu" />
				</td>
				<td width="80%"><pre><tiles:insertAttribute name="body"/></pre></td>
    		</tr>
    		<tr height="10%" style="bottom: 0;">
        		<td colspan="2" align="center" style="width:100%;">
        			<font color="white"><tiles:insertAttribute name="footer"/></font>
        		</td>
    		</tr>
		</table>
	</body>
</html>


