<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
<meta charset="UTF-8" />

<title></title>

<link rel='stylesheet' id='magazine-pro-theme-css' href='css/common.css'
	type='text/css' media='all' />



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
<body class="home blog header-full-width content-sidebar magazine-home"
	s>
	<!-- BuySellAds Ad Code -->
	<div class="site-container">
		<header class="site-header" role="banner" itemscope="itemscope"
			itemtype="">
			<div class="wrap">
				<div class="title-area">
					<h1 class="site-title" itemprop="headline">
						<s:a action="home">
							<s:property value="getText('leftMenu.home')" />
						</s:a>
							|
						<s:a action="configurationalContent">
							<s:property value="getText('leftMenu.configurationmanagement')" />
						</s:a>
							|
						<s:a action="functionalContent">
							<s:property value="getText('leftMenu.functionalmanagement')" />
						</s:a>
							| <a href="">Student Search |</a>
					</h1>
				</div>
			</div>
		</header>
	</div>

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
				</br> </br>
				<s:property value="getText('school.quot1')" />
				</br> </br>
				<s:property value="getText('school.quot2')" />
				</br> </br>
			</p>
		</div>
	</s:else>

</body>
</html>
