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
		  	<div class="subMenu">
			 	<div class="inner">
			 		<s:a href="#" id="sTop" cssClass="subNavBtnFm"><s:property value="getText('leftmenu.fm.administrator')"/></s:a> 
					<s:a href="#" id="s1" cssClass="subNavBtnFm"><s:property value="getText('leftmenu.fm.leave')"/></s:a>
					<s:a href="#" id="s2" cssClass="subNavBtnFm"><s:property value="getText('leftmenu.fm.communication')"/></s:a>
					<s:a href="#" id="s3" cssClass="subNavBtnFm"><s:property value="getText('leftmenu.fm.transportation')"/></s:a>
					<s:a href="#" id="s4" cssClass="subNavBtnFm"><s:property value="getText('leftmenu.fm.finance')"/></s:a>
					<s:a href="#" id="s5" cssClass="subNavBtnFm"><s:property value="getText('leftmenu.fm.library')"/></s:a>
					<s:a href="#" id="s6" cssClass="subNavBtnFm"><s:property value="getText('leftmenu.fm.reports')"/></s:a>
					<s:a href="#" id="s7" cssClass="subNavBtnFm end"><s:property value="getText('leftmenu.fm.availability')"/></s:a>
				</div>				
			</div>
		
			<div class="section sTop">
				</br></br>
				<div class="inner">
					<h1><s:property value="getText('leftmenu.fm.administrator')"/></h1>
				</div>
				<br class="clear">
			</div>
	
			<div class="section s1">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.fm.leave')"/></h1>
				</div>
			</div>
	
			<div class="section s2">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.fm.communication')"/></h1>
				</div>
			</div>
	
			<div class="section s3">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.fm.transportation')"/></h1>
				</div>
			</div>
	
			<div class="section s4">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.fm.finance')"/></h1>
				</div>
			</div>
	
			<div class="section s5">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.fm.library')"/></h1>
				</div>
			</div>
		
			<div class="section s6">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.fm.reports')"/></h1>
				</div>
			</div>
			
			<div class="section s7">
				<div class="inner">
					<h1><s:property value="getText('leftmenu.fm.availability')"/></h1>
				</div>
			</div>
		</div>
	</body>
</html>
	
