<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/leftmenu.css">
		<script src="${pageContext.request.contextPath}/js/prefixfree-1.0.7.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js" type="text/javascript"></script>
		<script type="text/javascript">
			$(document).ready(function() {
				$("#cm").click(function() {
					//slide up all the link lists
					$("#1").slideToggle();
					//slide down the link list below the h3 clicked - only if its closed
				});
			});
			
			$(document).ready(function() {
				$("#fm").click(function() {
					//slide up all the link lists
					$("#2").slideToggle();
					//slide down the link list below the h3 clicked - only if its closed
				});
			});
		</script>	
	</head>
	<body>		
		<div id="accordian">
			<ul>
				<li >
					<h3 id="cm" onclick="manageDivForMenu('configurationalContent')"><span class="icon-dashboard" ></span>Configuration Management</h3>
					<ul id="1">
						<li><a href="#">Administrator</a></li>
						<li><a href="#">Finance</a></li>
						<li><a href="#">Staff</a></li>
						<li><a href="#">Calendar</a></li>
						<li><a href="#">Transportation</a></li>
					</ul>
				</li>				
				<li>
					<h3 id="fm"  onclick="manageDivForMenu('functionalContent')"><span class="icon-tasks"></span>Functional Management</h3>
					<ul id="2">
						<li><a href="#">Administrator</a></li>
						<li><a href="#">Leave</a></li>
						<li><a href="#">Finance</a></li>
						<li><a href="#">Transport</a></li>
						<li><a href="#">Library</a></li>
						<li><a href="#">Communication</a></li>
						<li><a href="#">Reports</a></li>
						<li><a href="#">Availability</a></li>
					</ul>
				</li>
				<li>
					<h3 id="se">School Events</h3>					
				</li>
				<li>
					<h3 id="sh">School Holidays</h3>					
				</li>
			</ul>	
		</div>
	</body>
</html>
