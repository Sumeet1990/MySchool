<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Done</title>
</head>
<body>
<h1>Class got created !</h1>

<s:iterator value="schoolClassLst">
Class Name: <s:property value="className"/><br>
Section: <s:property value="section"/><br>
<s:set value="teachingStaffId" name="teachingId" />
Class teacher: <s:property value="%{classTeacherMap.get(#teachingId)}" /><br>
</s:iterator>
</body>
</html>