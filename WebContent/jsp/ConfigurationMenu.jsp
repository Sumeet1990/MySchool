<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title></title>
	
		<meta name = "keywords" content = "" />
		<meta name = "description" content = "" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, minimum-scale=1 user-scalable=no">
		
		<link href="${pageContext.request.contextPath}/css/demo.css" rel="stylesheet" type="text/css">
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js"></script>	
		<script type="text/javascript" 	src="${pageContext.request.contextPath}/js/jquery.smint.js"></script>
	
		<script type="text/javascript">
			$(document).ready( function() {
	    		$('.subMenu').smint({
	    			'scrollSpeed' : 1000
	    		});
			});
		</script>
	</head>
	
	<body>

		<div class="wrap">
		 	<div class="subMenu" >
			 	<div class="inner">
			 		<s:a href="#" id="sTop" cssClass="subNavBtn" ><s:property value="getText('leftmenu.cm.administrator')"/></s:a> 
					<s:a href="#" id="s1" cssClass="subNavBtn" ><s:property value="getText('leftmenu.cm.staff')"/></s:a>
					<s:a href="#" id="s2" cssClass="subNavBtn" ><s:property value="getText('leftmenu.cm.calendar')"/></s:a>
					<s:a href="#" id="s3" cssClass="subNavBtn" ><s:property value="getText('leftmenu.cm.transport')"/></s:a>
					<s:a href="#" id="s4" cssClass="subNavBtn" ><s:property value="getText('leftmenu.cm.finance')"/></s:a>
					<s:a href="#" id="s5" cssClass="subNavBtn end" ><s:property value="getText('leftmenu.cm.library')"/></s:a>
				</div>				
			</div>
		
			<div class="section sTop">
				</br></br>
				<div class="inner">
					<h1><s:property value="getText('leftmenu.cm.administrator')"/></h1>
		
				</div>
				<br class="clear">
			</div>
		
			<div class="section s1">		
				<div class="inner">
					<s:property value="getText('leftmenu.cm.staff')"/>
					<s:form  method="POST">
						<s:submit value="Subject create"></s:submit>
						<s:submit value="School Class" action="schoolClassCreateAction"></s:submit>
						<s:submit value="Delete Section Class"></s:submit>
						<s:submit value="Modify Section Class"></s:submit>
					</s:form>
				</div>
			</div>
		
			<div class="section s2">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.cm.calendar')"/></h1>
				</div>
			</div>
		
			<div class="section s3">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.cm.transport')"/></h1>
				</div>
			</div>
		
			<div class="section s4">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.cm.finance')"/></h1>
				</div>
			</div>
			<div class="section s5">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.cm.library')"/></h1>
				</div>
			</div>
		</div>
	
	</body>
</html>
	
