<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.Date" %>
<html>
	<head>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/textBox_button.css" type="text/css">
	</head>
	<body>
		<h2 align="center"><s:property value="teachingStaffActionType"/> Teacher</h2>
		<h3>Enter the below mandatory details to <s:property value="actionTypeValue"/> teacher</h3>
 		<s:if test="#errorMessageAlreadyExts!=''">
    		<span style="color:red;font-size: 16px;"><s:property  value="errorMessageAlreadyExts"/></span>
		</s:if>
		<s:form action="ClassOperation%{teachingStaffActionType}Action">
			<s:textfield id="inputs" name="schoolClassName" required="true"  onkeyup="upperCaseThetext('schoolClassName')" label="Class Name"  autofocus="autofocus" tabindex="1"></s:textfield>
			<s:if test="%{teachingStaffActionType=='View'}">
				<s:textfield id="inputs" name="section" label="Section" onkeyup="upperCaseThetext('section')" tabindex="2"></s:textfield>
			</s:if>
			<s:else>
				<s:textfield id="inputs" name="section" onkeyup="upperCaseThetext('section')" required="true" label="Section" tabindex="3"></s:textfield>
				<s:select style="width: 400px;" id="inputs" list="classTeacherMap" name="classTeacher" label="Class Teacher" tabindex="4"></s:select>
			</s:else>
			<s:submit id="actions" value="%{teachingStaffActionType}" tabindex="5"></s:submit>
		</s:form>
	</body>
</html>
