<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title></title>

		<meta name = "keywords" content = "" />
		<meta name = "description" content = "" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1, minimum-scale=1 user-scalable=no">
		
		<link href="${pageContext.request.contextPath}/css/demo.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath}/css/fmstyle.css" rel="stylesheet" type="text/css">
		
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
		  	<div class="subMenu">
			 	<div class="inner">
			 		<s:a href="#" id="sTop" cssClass="subNavBtnFm"><s:property value="getText('fm.administrator')"/>&nbsp;|&nbsp;</s:a> 
					<s:a href="#" id="s1" cssClass="subNavBtnFm"><s:property value="getText('fm.leaves')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s2" cssClass="subNavBtnFm"><s:property value="getText('fm.communication')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s3" cssClass="subNavBtnFm"><s:property value="getText('fm.transportation')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s4" cssClass="subNavBtnFm"><s:property value="getText('fm.finance')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s5" cssClass="subNavBtnFm"><s:property value="getText('fm.library')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s6" cssClass="subNavBtnFm"><s:property value="getText('fm.reports')"/>&nbsp;|&nbsp;</s:a>
					<s:a href="#" id="s7" cssClass="subNavBtnFm end"><s:property value="getText('fm.availability')"/>&nbsp;|&nbsp;</s:a>
				</div>				
			</div>
			<s:form  method="POST">
				<div class="section sTop">
					<br/><br/>
					<div class="inner">
						<h1><s:property value="getText('fm.administrator')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button user'><s:property value="getText('fm.user')"/></div>
								<div style="" class="user_grad slider">
									<a href="#"><s:property value="getText('fm.add')"/></a>
									<a href="#"><s:property value="getText('fm.edit')"/></a>
									<a href="#"><s:property value="getText('fm.remove')"/></a>
									<a href="#"><s:property value="getText('fm.show')"/></a>
								</div>
							</div>
	
							<div class="column">
								<div class='button staff'><s:property value="getText('fm.staff')"/></div>
								<div style="" class="staff_grad slider">
									<a href="#"><s:property value="getText('fm.add')"/></a>
									<a href="#"><s:property value="getText('fm.edit')"/></a>
									<a href="#"><s:property value="getText('fm.remove')"/></a>
									<a href="#"><s:property value="getText('fm.show')"/></a>
								</div>
							</div>
							
							<div class="column">
								<div class='button student'><s:property value="getText('fm.student')"/></div>
								<div style="" class="student_grad slider">
									<s:a action="studentRegistrationCreateAction"><s:property value="getText('fm.registration')"/></s:a>
									<a href="#"><s:property value="getText('fm.assignClass')"/></a>
									<a href="#"><s:property value="getText('fm.edit')"/></a>
									<a href="#"><s:property value="getText('fm.remove')"/></a>
									<a href="#"><s:property value="getText('fm.show')"/></a>
									<a href="#"><s:property value="getText('fm.migrate')"/></a>
								</div>
							</div>
													
							<div class="column">
								<div class='button rollNumber'><s:property value="getText('fm.rollNumber')"/></div>
								<div style="" class="rollNumber_grad slider">
									<a href="#"><s:property value="getText('fm.generateForSingleStudent')"/></a>
									<a href="#"><s:property value="getText('fm.generateForTotalClass')"/></a>
								</div>
							</div>
						</div>
					</div>
					<br class="clear">
				</div>
		
				<div class="section s1">
					<div class="inner">
						<h1><s:property value="getText('fm.leaves')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button studentLeaves'><s:property value="getText('fm.studentLeaves')"/></div>
								<div style="" class=" studentLeaves_grad slider">
									<a href="#"><s:property value="getText('fm.add')"/></a>
									<a href="#"><s:property value="getText('fm.edit')"/></a>
									<a href="#"><s:property value="getText('fm.remove')"/></a>
									<a href="#"><s:property value="getText('fm.show')"/></a>
								</div>
							</div>
	
							<div class="column">
								<div class='button staffLeaves'><s:property value="getText('fm.staffLeaves')"/></div>
								<div style="" class="staffLeaves_grad slider">
									<a href="#"><s:property value="getText('fm.add')"/></a>
									<a href="#"><s:property value="getText('fm.edit')"/></a>
									<a href="#"><s:property value="getText('fm.remove')"/></a>
									<a href="#"><s:property value="getText('fm.show')"/></a>
								</div>
							</div>					
						</div>
					</div>
				</div>
		
				<div class="section s2">
					<div class="inner">
						<h1><s:property value="getText('fm.communication')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button mail'><s:property value="getText('fm.mail')"/></div>
								<div style="" class="mail_grad slider">
									<a href="#"><s:property value="getText('fm.studentPogressReport')"/></a>
									<a href="#"><s:property value="getText('fm.studentAttendanceReport')"/></a>
									<a href="#"><s:property value="getText('fm.mailAlert')"/></a>
									<a href="#"><s:property value="getText('fm.examSchedule')"/></a>
									<a href="#"><s:property value="getText('fm.schoolHolidaysList')"/></a>
									<a href="#"><s:property value="getText('fm.classHolidaysList')"/></a>
									<a href="#"><s:property value="getText('fm.schoolEvents')"/></a>
									<a href="#"><s:property value="getText('fm.classEvents')"/></a>
								</div>
							</div>
	
							<div class="column">
								<div class='button sms'><s:property value="getText('fm.sms')"/></div>
								<div style="" class="sms_grad slider">
									<a href="#"><s:property value="getText('fm.textMessage')"/></a>
								</div>
							</div>					
						</div>
					</div>
				</div>
		
				<div class="section s3">
					<div class="inner">
						<h1><s:property value="getText('fm.transportation')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
							<div class="column">
								<div class='button transportationRoute'><s:property value="getText('fm.transportationRoute')"/></div>
								<div style="" class="transportationRoute_grad slider">
									<a href="#"><s:property value="getText('fm.allocation')"/></a>
								</div>
							</div>					
						</div>
					</div>
				</div>
		
				<div class="section s4">
					<div class="inner">
						<h1><s:property value="getText('fm.finance')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button tuitionFee'><s:property value="getText('fm.tuitionFee')"/></div>
								<div style="" class="tuitionFee_grad slider">
									<a href="#"><s:property value="getText('fm.collection')"/></a>
									<a href="#"><s:property value="getText('fm.dueEnquiry')"/></a>
								</div>
							</div>
							<div class="column">
								<div class='button otherFee'><s:property value="getText('fm.otherFee')"/></div>
								<div style="" class="otherFee_grad slider">
									<a href="#"><s:property value="getText('fm.collection')"/></a>
									<a href="#"><s:property value="getText('fm.dueEnquiry')"/></a>
								</div>
							</div>						
						</div>
					</div>
				</div>
		
				<div class="section s5">
					<div class="inner">
						<h1><s:property value="getText('fm.library')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
							<div class="column">
								<div class='button books'><s:property value="getText('fm.books')"/></div>
								<div style="" class="books_grad slider">
									<a href="#"><s:property value="getText('fm.assignBooks')"/></a>
									<a href="#"><s:property value="getText('fm.collectBooks')"/></a>
									<a href="#"><s:property value="getText('fm.viewAssignedBooks')"/></a>
								</div>
							</div>											
						</div>
					</div>
				</div>
			
				<div class="section s6">
					<div class="inner">
						<h1><s:property value="getText('fm.reports')"/></h1>
							<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button studentReports'><s:property value="getText('fm.studentReports')"/></div>
								<div style="" class="studentReports_grad slider">
									<a href="#"><s:property value="getText('fm.attendanceReport')"/></a>
									<a href="#"><s:property value="getText('fm.progressReport')"/></a>
									<a href="#"><s:property value="getText('fm.performanceReport')"/></a>
								</div>
							</div>
	
							<div class="column">
								<div class='button staffReports'><s:property value="getText('fm.staffReports')"/></div>
								<div style="" class="staffReports_grad slider">
									<a href="#"><s:property value="getText('fm.attendanceReport')"/></a>
									<a href="#"><s:property value="getText('fm.performanceReport')"/></a>
								</div>
							</div>
							
							<div class="column">
								<div class='button schoolReports'><s:property value="getText('fm.schoolReports')"/></div>
								<div style="" class="schoolReports_grad slider">
									<a href="#"><s:property value="getText('fm.admissionsReport')"/></a>
									<a href="#"><s:property value="getText('fm.performanceReport')"/></a>
								</div>
							</div>			
						</div>
					</div>
				</div>
				
				<div class="section s7">
					<div class="inner">
						<h1><s:property value="getText('fm.availability')"/></h1>
						<div id="slide">
							<br/><br/>
							<div style="clear:both"></div>
	
							<div class="column">
								<div class='button availabilityCheck'><s:property value="getText('fm.availabilityCheck')"/></div>
								<div style="" class="availabilityCheck_grad slider">
									<a href="#"><s:property value="getText('fm.admissionsAvailability')"/></a>
									<a href="#"><s:property value="getText('fm.transportAvailability')"/></a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</s:form>
		</div>
	</body>
</html>
	
