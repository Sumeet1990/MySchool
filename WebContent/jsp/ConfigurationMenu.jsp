<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
	
	<body>
		<s:form  method="POST">
				<s:submit value="Subject create" action="subjectAction"></s:submit>
				<s:submit value="View Section Class" action="schoolClassAction"></s:submit>
				<s:submit value="Delete Section Class"></s:submit>
				<s:submit value="Modify Section Class"></s:submit>
		</s:form>
	</body>
</html>