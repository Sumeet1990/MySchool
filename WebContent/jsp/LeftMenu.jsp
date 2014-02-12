 <%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/styles.css' />
	<script type="text/javascript" 	src="${pageContext.request.contextPath}/js/menu_jquery.js"></script>
		
</head>
<body>
<div id='cssmenu'>
<ul>
   <li class='active'><s:a  action="home"><span ><img src="images/home.png" style="width: 10%; float: left;">Home</span></s:a>
			</li>
   <li class='has-sub'> <s:a  action="configurationalContent"><span ><s:property value="getText('leftmenu.configurationmanagement')"/></span></s:a>
					  </li>
   <li class='has-sub'><s:a action="functionalContent"><span ><s:property value="getText('leftmenu.functionalmanagement')"/></span></s:a>

   </li>
</ul>
</div>
</body>
</html>