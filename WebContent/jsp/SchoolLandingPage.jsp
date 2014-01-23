<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/textBox_button.css"
	type="text/css">
	</head>
	<body>
	<div id="paraCotent">
						<p class="paraContentStyle">
							<s:property value="getText('school.para1')"/><br><br>
							<s:property value="getText('school.para2')"/><br><br>
							<s:property value="getText('school.para3')"/><br><br>
						</p>
		</div >
		<div id="configurationalContent" style="display: none">
		<%@ include file="ConfigurationMenuPage.jsp" %>
		</div>
		<div id="functionalContent" style="display: none">
		<%@ include file="FunctionalMenuPage.jsp" %>
		</div>
	</body>
</html>
