<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head></head>
	<body>
	<div id="paraCotent">
						<p style="color: brown;font-style: italic; font-weight: 900;">
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
