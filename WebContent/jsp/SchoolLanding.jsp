<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/textBox_button.css" type="text/css">
	</head>
	
	<body>
	<s:set value="%{display}" name="displayValue"/>
	<s:if test="#displayValue == 'configurationalContent'">
		<div id="configurationalContent" >
			<%@ include file="ConfigurationMenu.jsp" %>
		</div>
		</s:if>
	<s:elseif test="#displayValue == 'functionalContent'">
		<div id="functionalContent">
			<%@ include file="FunctionalMenu.jsp" %>
		</div>
	</s:elseif>
	<s:else>
	<div id="paraCotent">
			<p class="paraContentStyle">
				<s:property value="getText('school.para1')"/></br></br>
				<s:property value="getText('school.quot1')"/></br></br>
				<s:property value="getText('school.quot2')"/></br></br>
			</p>
		</div>
		</s:else>
		
	</body>
</html>
