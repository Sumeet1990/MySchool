<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-US">
	<head>
		<title></title>
		<meta charset="UTF-8" />
		<link rel='stylesheet' id='magazine-pro-theme-css' href='css/common.css' type='text/css' media='all' />

		<style type="text/css" media="screen">
			.simple-social-icons ul li a,.simple-social-icons ul li a:hover {
				background-color: #fff !important;
				border-radius: 0px;
				color: #222 !important;
				font-size: 42px;
				padding: 21px;
			}
		
			.simple-social-icons ul li a:hover {
				background-color: #fff !important;
				color: #15ad9f !important;
			}
		</style>
	</head>
	<body class="home blog header-full-width content-sidebar magazine-home">
		<s:set value="%{display}" name="displayValue" />
		<s:if test="#displayValue == 'configurationalContent'">
			<div id="configurationalContent">
				<%@ include file="ConfigurationManagement.jsp"%>
			</div>
		</s:if>
		<s:elseif test="#displayValue == 'functionalContent'">
			<div id="functionalContent">
				<%@ include file="FunctionalManagement.jsp"%>
			</div>
		</s:elseif>
		<s:else>
			<div id="paraCotent">
				<p class="paraContentStyle">
					<s:property value="getText('school.para1')" />
					<br/> <br/>
					<s:property value="getText('school.quot1')" />
					<br/> <br/>
					<s:property value="getText('school.quot2')" />
					<br/>
				</p>
			</div>
		</s:else>
	</body>
</html>
