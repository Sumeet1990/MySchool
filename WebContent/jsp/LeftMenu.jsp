<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
	
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome1.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/leftmenu.css">
		
		<script src="${pageContext.request.contextPath}/js/prefixfree-1.0.7.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/js/leftmenu.js" type="text/javascript"></script>			
	</head>
	<body>	
		<div id="accordian">
			<ul>
				<li >
					<s:a cssStyle="text-decoration: none;"  action="configurationalContent"><h3  id="cm" ><span class="icon-dashboard"></span><s:property value="getText('leftmenu.configurationmanagement')"/></h3></s:a>
					<ul id="1">
						<li><a href="#"><s:property value="getText('leftmenu.cm.administrator')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.cm.staff')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.cm.calendar')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.cm.transport')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.cm.finance')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.cm.library')"/></a></li>						
					</ul>
				</li>				
				<li>
					<s:a cssStyle="text-decoration: none;" action="functionalContent"><h3 id="fm"><span class="icon-tasks"></span><s:property value="getText('leftmenu.functionalmanagement')"/></h3></s:a>
					<ul id="2">
						<li><a href="#"><s:property value="getText('leftmenu.fm.administrator')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.fm.leave')"/></a></li>			
						<li><a href="#"><s:property value="getText('leftmenu.fm.communication')"/></a></li>			
						<li><a href="#"><s:property value="getText('leftmenu.fm.transportation')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.fm.finance')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.fm.library')"/></a></li>						
						<li><a href="#"><s:property value="getText('leftmenu.fm.reports')"/></a></li>
						<li><a href="#"><s:property value="getText('leftmenu.fm.availability')"/></a></li>
					</ul>
				</li>
				<li>
					<h3 id="se"><s:property value="getText('leftmenu.school.events')"/></h3>					
				</li>
				<li>
					<h3 id="sh"><s:property value="getText('leftmenu.school.holidays')"/></h3>					
				</li>
			</ul>	
		</div>
	</body>
</html>
