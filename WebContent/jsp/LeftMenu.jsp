<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
		
		<style type="text/css">
			/*custom font for text*/
			@import url(http://fonts.googleapis.com/css?family=Nunito);
		
			/*CSS file for fontawesome - an iconfont we will be using. This CSS file imported contains the font-face declaration. More info: http://fortawesome.github.io/Font-Awesome/ */
			@import url(http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);
		
			/*Basic reset*/
			* {margin: 0; padding: 0;}
		
			body {
				background: #4EB889;
				font-family: Nunito, arial, verdana;
			}
			
			#accordian {
				background: #004050;
				width: 250px;
				color: white;
				position:fixed;
				top:105px;
    			left:10px;
				/*Some cool shadow and glow effect*/
				box-shadow: 
					0 5px 15px 1px rgba(0, 0, 0, 0.6), 
					0 0 200px 1px rgba(255, 255, 255, 0.5);
			}
			
			/*heading styles*/
			#accordian h3 {
				font-size: 12px;
				line-height: 34px;
				padding: 0 10px;
				cursor: pointer;
				/*fallback for browsers not supporting gradients*/
				background: #003040; 
				background: linear-gradient(#003040, #002535);
			}
			
			/*heading hover effect*/
			#accordian h3:hover {
				text-shadow: 0 0 1px rgba(255, 255, 255, 0.7);
			}
			
			/*iconfont styles*/
			#accordian h3 span {
				font-size: 16px;
				margin-right: 10px;
			}
		
			/*list items*/
			#accordian li {
				list-style-type: none;
			}
			
			/*links*/
			#accordian ul ul li a {
				color: white;
				text-decoration: none;
				font-size: 11px;
				line-height: 27px;
				display: block;
				padding: 0 15px;
				/*transition for smooth hover animation*/
				transition: all 0.15s;
			}
		
			/*hover effect on links*/
			#accordian ul ul li a:hover {
				background: #003545;
				border-left: 5px solid lightgreen;
			}
			
			/*Lets hide the non active LIs by default*/
			#accordian ul ul {
				display: none;
			}
		
			#accordian li.active ul {
				display: block;
			}
		</style>
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
<s:url var="loadBodyConfig" action="loadActionConfig.action" ></s:url>
<s:url var="loadBodyFunctional" action="loadActionFunctional.action"></s:url>
	<body>		
		<div id="accordian">
			<ul>
				<li>
					<h3 id="cm"><span class="icon-dashboard"></span><s:a href="%{loadBodyConfig}">Configuration Management</s:a></h3>
					<ul id="1">
						<li><a href="#">Administrator</a></li>
						<li><a href="#">Finance</a></li>
						<li><a href="#">Staff</a></li>
						<li><a href="#">Calendar</a></li>
						<li><a href="#">Transportation</a></li>
					</ul>
				</li>				
				<li>
					<h3 id="fm"><span class="icon-tasks"></span><s:a href="%{loadBodyFunctional}">Functional Management</s:a></h3>
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
