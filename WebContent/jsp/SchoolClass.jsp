<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.Date" %>
<html>
<head>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/textBox_button.css"
	type="text/css">
	</head>
<body>
<h2 align="center"><s:property value="actionType"/> Class</h2>
<h3 >Enter the below mandatory details to <s:property value="actionType"/> class</h3>
<s:form action="ClassOperationAction">
<s:textfield id="inputs" name="schoolClassName" required="true"  label="Class Name"></s:textfield>
<s:if test="%{actionType=='View'}">
<s:textfield id="inputs" name="section" label="Section"></s:textfield>
</s:if>
<s:else>
<s:textfield id="inputs" name="section"  required="true" label="Section"></s:textfield>
<s:select style="width: 400px;" id="inputs" list="classTeacherMap" name="classTeacher" label="Class Teacher"></s:select>
</s:else>
<s:submit id="actions" value="%{actionType}"></s:submit>
</s:form>
</body>
</html>
