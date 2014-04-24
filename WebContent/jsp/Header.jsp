<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<head>
<title></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/textBox_button.css"
	type="text/css">
</head>
<body>
	<div class="site-container">
		<nav class="nav-primary">
			<div class="wrap">
				<ul id="menu-menu" class="menu genesis-nav-menu menu-primary">
					<li id="menu-item-400"
						class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-400">
						<a href=""><s:property value="getText('global.schoolName')" /></a>
					</li>
					<br />
					<li id="menu-item-165"
						class="menu-item menu-item-type-post_type menu-item-object-page menu-item-165">
						<a href=""><s:property
								value="getText('header.lastlogin.datetime')" /> : <s:property
								value="#session.sessionUtils.lastLogedinDateTime" /></a>
					</li>
					<br />
					<li id="menu-item-791"
						class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-791">
						<a href=""><s:property
								value="getText('header.current.datetime')" /> : <span
							class="textColor" id="timeDisplay"></a>
					</li>

					<li id="menu-item-791"
						class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-791"
						style="float: right"><s:a action="logout">Log out</s:a></li>
					<li id="menu-item-791"
						class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-791"
						style="float: right"><s:a href="%{helpAction}"> Help</s:a></li>
					<li id="menu-item-791"
						class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-791"
						style="float: right"><a href=""><s:property
								value="getText('header.welcome')" /> <s:property
								value='#session.sessionUtils.userGivenFullName' /> <s:property
								value='#session.sessionUtils.userSurname' />, &nbsp;<s:property
								value="getText('header.role')" />&nbsp;<s:property
								value='#session.sessionUtils.userRolesName' /></a></li>
				</ul>
			</div>
		</nav>
	</div>
</body>
<script type="text/javascript">
	startTime();
</script>
</html>
