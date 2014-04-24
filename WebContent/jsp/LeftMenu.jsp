<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/styles.css' />
		
		<script type="text/javascript" 	src="${pageContext.request.contextPath}/js/menu_jquery.js"></script>
	<body>
		<div id='cssmenu'>
			<ul>
			   	<li class='active'>
				   	<s:a action="home"><span><img src="images/home.png" style="width:8%;border:0;">&nbsp;&nbsp;<s:property value="getText('leftMenu.home')"/></s:a>
				</li>
			   	<li class='has-sub'>
			   		<s:a action="configurationalContent"><span><img src="images/Configuration-Settings.png" style="width:9%;border:0">&nbsp;&nbsp;<s:property value="getText('leftMenu.configurationmanagement')"/></span></s:a>
				</li>
			   	<li class='has-sub'>
			   		<s:a action="functionalContent"><span><img src="images/Configuration-Settings.png" style="width:9%;border:0">&nbsp;&nbsp;<s:property value="getText('leftMenu.functionalmanagement')"/></span></s:a>
			   	</li>
			</ul>
		</div>
	</body>
</html>