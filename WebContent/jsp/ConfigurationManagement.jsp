<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title></title>
	
		<meta name = "keywords" content = "" />
		<meta name = "description" content = "" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, minimum-scale=1 user-scalable=no">
		
		<link href="${pageContext.request.contextPath}/css/demo.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath}/css/cmstyle.css" rel="stylesheet" type="text/css">
	
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.1.min.js"></script>	
		<script type="text/javascript" 	src="${pageContext.request.contextPath}/js/jquery.smint.js"></script>
	
		<script type="text/javascript">
			$(document).ready( function() {
	    		$('.subMenu').smint({
	    			'scrollSpeed' : 1000
	    		});
			});
		
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
		 	<div class="subMenu" >
			 	<div class="inner">
			 		<s:a href="#" id="sTop" cssClass="subNavBtn" ><s:property value="getText('cm.administrator')"/>&nbsp;|&nbsp;</s:a> 
					<s:a href="#" id="s1" cssClass="subNavBtn" ><s:property value="getText('cm.staff')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s2" cssClass="subNavBtn" ><s:property value="getText('cm.calendar')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s3" cssClass="subNavBtn" ><s:property value="getText('cm.transport')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s4" cssClass="subNavBtn" ><s:property value="getText('cm.finance')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s5" cssClass="subNavBtn end" ><s:property value="getText('cm.library')"/>&nbsp;|&nbsp;</s:a>
				</div>				
			</div>
			<s:form  method="POST">
				<div class="section sTop">
					<br/><br/>
					<div class="inner">
						<h1><s:property value="getText('administrator')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button user'><s:property value="getText('cm.user')"/></div>
								<div style="" class="user_grad slider">
									<a href="#"><s:property value="getText('cm.create')"/></a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>
	
							<div class="column">
								<div class='button schoolClass'><s:property value="getText('cm.class')"/></div>
								<div style="" class="schoolClass_grad slider">
									<s:a action="schoolClassCreateAction"><s:property value="getText('cm.create')"/></s:a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>
							
							<div class="column">
								<div class='button section'><s:property value="getText('cm.section')"/></div>
								<div style="" class="section_grad slider">
									<s:a action="classSectionCreateAction"><s:property value="getText('cm.create')"/></s:a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>
													
							<div class="column">
								<div class='button subject'><s:property value="getText('cm.subjects')"/></div>
								<div style="" class="subject_grad slider">
									<s:a action="subjectAction"><s:property value="getText('cm.create')"/></s:a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>
						</div>
					</div>				
					<br class="clear">
				</div>
			
				<div class="section s1">		
					<div class="inner">
						<s:property value="getText('cm.staff')"/>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button appointmentType'><s:property value="getText('cm.appointmentType')"/></div>
								<div style="" class="appointmentType_grad slider">
									<a href="#"><s:property value="getText('cm.create')"/></a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>
							<div class="column">
								<div class='button leaveSructure'><s:property value="getText('cm.leaveStructure')"/></div>
								<div style="" class="leaveSructure_grad slider">
									<a href="#"><s:property value="getText('cm.create')"/></a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>						
						</div>
						
							<s:submit value="Subject create"></s:submit>
							
							<s:submit value="Delete Section Class"></s:submit>
							<s:submit value="Modify Section Class"></s:submit>
						
					</div>
				</div>
			
				<div class="section s2">
					<div class="inner">
						<h1><s:property value="getText('cm.calendar')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button schoolCalendar'><s:property value="getText('cm.schoolCalendar')"/></div>
								<div style="" class="schoolCalendar_grad slider">
									<a href="#"><s:property value="getText('cm.timing')"/></a>
									<a href="#"><s:property value="getText('cm.holidays')"/></a>
									<a href="#"><s:property value="getText('cm.events')"/></a>
								</div>
							</div>
							<div class="column">
								<div class='button classCalendar'><s:property value="getText('cm.classCalendar')"/></div>
								<div style="" class="classCalendar_grad slider">
									<a href="#"><s:property value="getText('cm.timeTable')"/></a>
									<a href="#"><s:property value="getText('cm.holidays')"/></a>
									<a href="#"><s:property value="getText('cm.events')"/></a>
								</div>
							</div>						
						</div>
					</div>
				</div>
			
				<div class="section s3">
					<div class="inner">
						<h1><s:property value="getText('cm.transport')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button driver'><s:property value="getText('cm.driver')"/></div>
								<div style="" class="driver_grad slider">
									<a href="#"><s:property value="getText('cm.create')"/></a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>
							<div class="column">
								<div class='button vehicle'><s:property value="getText('cm.vehicle')"/></div>
								<div style="" class="vehicle_grad slider">
									<a href="#"><s:property value="getText('cm.create')"/></a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>	
							<div class="column">
								<div class='button route'><s:property value="getText('cm.route')"/></div>
								<div style="" class="route_grad slider">
									<a href="#"><s:property value="getText('cm.create')"/></a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>					
						</div>
					</div>
				</div>
			
				<div class="section s4">
					<div class="inner">
						<h1><s:property value="getText('cm.finance')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button tutionFeeStructure'><s:property value="getText('cm.tuitionFeeStructure')"/></div>
								<div style="" class="tutionFeeStructure_grad slider">
									<a href="#"><s:property value="getText('cm.create')"/></a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>
							<div class="column">
								<div class='button otherFeeStructure'><s:property value="getText('cm.otherFeeStructure')"/></div>
								<div style="" class="otherFeeStructure_grad slider">
									<a href="#"><s:property value="getText('cm.create')"/></a>
									<a href="#"><s:property value="getText('cm.modify')"/></a>
									<a href="#"><s:property value="getText('cm.delete')"/></a>
									<a href="#"><s:property value="getText('cm.view')"/></a>
								</div>
							</div>										
						</div>
					</div>
				</div>
				<div class="section s5">
					<div class="inner">
						<h1><s:property value="getText('cm.library')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button books'><s:property value="getText('cm.books')"/></div>
								<div style="" class="books_grad slider">
									<a href="#"><s:property value="getText('cm.createEntry')"/></a>
									<a href="#"><s:property value="getText('cm.modifyEntry')"/></a>
									<a href="#"><s:property value="getText('cm.deleteEntry')"/></a>
									<a href="#"><s:property value="getText('cm.viewEntry')"/></a>
								</div>
							</div>														
						</div>					
					</div>
				</div>
			</s:form>
		</div>	
	</body>
</html>
	
