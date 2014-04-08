<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/styles.css' />
		
		<script type="text/javascript" 	src="${pageContext.request.contextPath}/js/menu_jquery.js"></script>
	<body>
		<div id='cssmenu'>
			<ul>
			   	<li class='active'>
				   	<s:a  action="home"><span><img src="images/home.png" style="width: 11%; "><s:property value="getText('leftMenu.home')"/></span></s:a>
				</li>
			   	<li class='has-sub'>
			   		<s:a  action="configurationalContent"><span><img src="images/Configuration-Settings.png" style="width: 10%; "><s:property value="getText('leftMenu.configurationmanagement')"/></span></s:a>
				</li>
			   	<li class='has-sub'>
			   		<s:a action="functionalContent"><span ><s:property value="getText('leftMenu.functionalmanagement')"/></span></s:a>
			   	</li>
			</ul>
		</div>
	</body>
</html>