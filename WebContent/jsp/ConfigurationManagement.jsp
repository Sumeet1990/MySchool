<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel='stylesheet' id='magazine-pro-theme-css' href='css/common.css'
			type='text/css' media='all' />
		<link href="${pageContext.request.contextPath}/css/cmstyle.css"
			rel="stylesheet" type="text/css">
		
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js"></script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/js/jquery.smint.js"></script>
			<script type="text/javascript">
			$(document).ready(function(){
				$(".button").toggle(
				function(){
					var clas  = $(this).attr("class");
					$("."+clas.replace('button ','')+"_grad").animate({opacity:'1',top:'50px'}, 500 )
				},
				function(){
					var clas  = $(this).attr("class");
					$("."+clas.replace('button ','')+"_grad").animate({opacity:'0',top:'-300px'}, 500 );
				});		
			});
		</script>
	</head>
	<body>
		<div class="wrap">
			<ul id="menu-category-menu"
				class="menu genesis-nav-menu menu-secondary">
				<li id="menu-item-417"
					class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-417"><s:a
						href="#" id="sTop" cssClass="subNavBtn" onclick="goToHeight(this)">
						<s:property value="getText('cm.administrator')" />&nbsp;|&nbsp;</s:a></li>
				<li id="menu-item-418"
					class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-418"><s:a
						href="#" id="s1" onclick="goToHeight(this)" cssClass="subNavBtn">
						<s:property value="getText('cm.staff')" />&nbsp;|&nbsp;</s:a></li>
				<li id="menu-item-419"
					class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-419"><s:a
						href="#" id="s2" onclick="goToHeight(this)" cssClass="subNavBtn">
						<s:property value="getText('cm.calendar')" />&nbsp;|&nbsp;</s:a></li>
				<li id="menu-item-420"
					class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-420"><s:a
						href="#" id="s3" onclick="goToHeight(this)" cssClass="subNavBtn">
						<s:property value="getText('cm.transport')" />&nbsp;|&nbsp;</s:a></li>
				<li id="menu-item-428"
					class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-428"><s:a
						href="#" id="s4" onclick="goToHeight(this)" cssClass="subNavBtn">
						<s:property value="getText('cm.finance')" />&nbsp;|&nbsp;</s:a></li>
				<li id="menu-item-421"
					class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-421"><s:a
						href="#" id="s5" onclick="goToHeight(this)" cssClass="subNavBtn end">
						<s:property value="getText('cm.library')" />&nbsp;|&nbsp;</s:a></li>
			</ul>
		</div>
	
		<s:form method="POST">
			<div class="sTop">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('cm.administrator')" /></h1>
					<div id="slide">
						<br/>
						<div style="clear: both"></div>
	
						<div class="column">
							<div class='button user'>
								<s:property value="getText('cm.user')" />
							</div>
							<div style="" class="user_grad slider">
								<a href="#"><s:property value="getText('cm.create')" /></a> <a
									href="#"><s:property value="getText('cm.modify')" /></a> <a
									href="#"><s:property value="getText('cm.delete')" /></a> <a
									href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
						<div class="column">
							<div class='button schoolClass'>
								<s:property value="getText('cm.class')" />
							</div>
							<div style="" class="schoolClass_grad slider">
								<s:a action="schoolClassCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a>
								<a href="#"><s:property value="getText('cm.modify')" /></a> <a
									href="#"><s:property value="getText('cm.delete')" /></a> <a
									href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
	
						<div class="column">
							<div class='button classSection'>
								<s:property value="getText('cm.section')" />
							</div>
							<div style="" class="classSection_grad slider">
								<s:a action="classSectionCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a>
								<a href="#"><s:property value="getText('cm.modify')" /></a> <a
									href="#"><s:property value="getText('cm.delete')" /></a> <a
									href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
	
						<div class="column">
							<div class='button subject'>
								<s:property value="getText('cm.subjects')" />
							</div>
							<div style="" class="subject_grad slider">
								<s:a action="schoolSubjectCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a>
								<a href="#"><s:property value="getText('cm.modify')" /></a> <a
									href="#"><s:property value="getText('cm.delete')" /></a> <a
									href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
					</div>
				</div>
				<br class="clear">
			</div>
	
			<div class="s1" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('cm.staff')" /></h1>
					<div id="slide">
						<br/>
						<div style="clear: both"></div>
						<div class="column">
							<div class='button appointmentType'>
								<s:property value="getText('cm.appointmentType')" />
							</div>
							<div style="" class="appointmentType_grad slider">
								<s:a action="staffAppointmentCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a>
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
						<div class="column">
							<div class='button leaveSructure'>
								<s:property value="getText('cm.leaveStructure')" />
							</div>
							<div style="" class="leaveSructure_grad slider">
								<s:a action="staffLeavesStructureCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a>
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
					</div>
	
				</div>
			</div>
	
			<div class="s2" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('cm.calendar')" /></h1>
					<div id="slide">
						<br/>
						<div style="clear: both"></div>
						<div class="column">
							<div class='button schoolCalendar'>
								<s:property value="getText('cm.schoolCalendar')" />
							</div>
							<div style="" class="schoolCalendar_grad slider">
								<s:a action="schoolTimingCreateAction">
									<s:property value="getText('cm.timing')" />
								</s:a>
								<s:a action="schoolGeneralHolidaysCreateAction">
									<s:property value="getText('cm.holidays')" />
								</s:a>
								<s:a action="schoolGeneralEventsCreateAction">
									<s:property value="getText('cm.events')" />
								</s:a>
							</div>
						</div>
						<div class="column">
							<div class='button classCalendar'>
								<s:property value="getText('cm.classCalendar')" />
							</div>
							<div style="" class="classCalendar_grad slider">
								<a href="#"><s:property value="getText('cm.timeTable')" /></a> 
								<s:a action="classHolidaysCreateAction">
									<s:property value="getText('cm.holidays')" />
								</s:a>
								<s:a action="classEventsCreateAction">
									<s:property value="getText('cm.events')" />
								</s:a>
							</div>
						</div>
					</div>
				</div>
			</div>
	
			<div class="s3" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('cm.transport')" /></h1>
					<div id="slide">
						<br/>
						<div style="clear: both"></div>
						<div class="column">
							<div class='button driver'>
								<s:property value="getText('cm.driver')" />
							</div>
							<div style="" class="driver_grad slider">
								<s:a action="driverCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a> 
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
						<div class="column">
							<div class='button vehicle'>
								<s:property value="getText('cm.vehicle')" />
							</div>
							<div style="" class="vehicle_grad slider">
								<s:a action="driverCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a> 
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
						<div class="column">
							<div class='button route'>
								<s:property value="getText('cm.route')" />
							</div>
							<div style="" class="route_grad slider">
								<s:a action="transportRoutCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a> 
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
					</div>
				</div>
			</div>
	
			<div class="s4" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('cm.finance')"/></h1>
					<div id="slide">
						<br/>
						<div style="clear: both"></div>
						<div class="column">
							<div class='button tuitionFeeStructure'>
								<s:property value="getText('cm.tuitionFeeStructure')" />
							</div>
							<div style="" class="tuitionFeeStructure_grad slider">
								<s:a action="tuitionFeeStructureCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a> 
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
						<div class="column">
							<div class='button otherFeeStructure'>
								<s:property value="getText('cm.otherFeeStructure')" />
							</div>
							<div style="" class="otherFeeStructure_grad slider">
								<s:a action="otherFeeStructureCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a> 
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="s5" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('cm.library')" /></h1>
					<div id="slide">
						<br/>
						<div style="clear: both"></div>
						<div class="column">
							<div class='button libraryBooksCategory'>
								<s:property value="getText('cm.libraryBooksCategory')" />
							</div>
							<div style="" class="libraryBooksCategory_grad slider">
								<a href="#"><s:property value="getText('cm.create')" /></a> 
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
						<div class="column">
							<div class='button libraryBooksEntry'>
								<s:property value="getText('cm.libraryBooksEntry')" />
							</div>
							<div style="" class="libraryBooksEntry_grad slider">
								<s:a action="libraryBooksCreateAction">
									<s:property value="getText('cm.create')" />
								</s:a> 
								<a href="#"><s:property value="getText('cm.modify')" /></a> 
								<a href="#"><s:property value="getText('cm.delete')" /></a> 
								<a href="#"><s:property value="getText('cm.view')" /></a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</s:form>
	</body>
</html>

