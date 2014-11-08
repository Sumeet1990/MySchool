<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<link rel='stylesheet' id='magazine-pro-theme-css' href='css/common.css'
			type='text/css' media='all' />
		<link href="${pageContext.request.contextPath}/css/fmstyle.css"
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
			<ul id="menu-category-menu" class="menu genesis-nav-menu menu-secondary">
				<s:if test="schoolAccess.functionalManagement.fmAdministrator.cmAdministratorAccess">
					<li id="menu-item-417" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-417">
						<s:a href="#" id="sTop" cssClass="subNavBtn" onclick="goToHeight(this)">
							<s:property value="getText('fm.administrator')" />&nbsp;|&nbsp;
						</s:a>
					</li>
				</s:if>
				<s:if test="schoolAccess.functionalManagement.fmLeaves.fmLeavesAccess">
					<li id="menu-item-418" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-418">
						<s:a href="#" id="s1" onclick="goToHeight(this)" cssClass="subNavBtn">
							<s:property value="getText('fm.leaves')" />&nbsp;|&nbsp;
						</s:a>
					</li>
				</s:if>
				<s:if test="schoolAccess.functionalManagement.fmCommunication.fmCommunicationAccess">
					<li id="menu-item-419" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-419">
						<s:a href="#" id="s2" onclick="goToHeight(this)" cssClass="subNavBtn">
							<s:property value="getText('fm.communication')" />&nbsp;|&nbsp;
						</s:a>
					</li>
				</s:if>
				<s:if test="schoolAccess.functionalManagement.fmTransportation.fmTransportationAccess">
					<li id="menu-item-420" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-420">
						<s:a href="#" id="s3" onclick="goToHeight(this)" cssClass="subNavBtn">
							<s:property value="getText('fm.transportation')" />&nbsp;|&nbsp;
						</s:a>
					</li>
				</s:if>
				<s:if test="schoolAccess.functionalManagement.fmFinance.fmFinanceAccess">
					<li id="menu-item-428" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-428">
						<s:a href="#" id="s4" onclick="goToHeight(this)" cssClass="subNavBtn">
							<s:property value="getText('fm.finance')" />&nbsp;|&nbsp;
						</s:a>
					</li>
				</s:if>
				<s:if test="schoolAccess.functionalManagement.fmLibrary.fmLibraryAccess">
					<li id="menu-item-421" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-421">
						<s:a href="#" id="s5" onclick="goToHeight(this)" cssClass="subNavBtn end">
							<s:property value="getText('fm.library')" />&nbsp;|&nbsp;
						</s:a>
					</li>
				</s:if>
				<s:if test="schoolAccess.functionalManagement.fmReports.fmReportsAccess">
					<li id="menu-item-421" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-421">
						<s:a href="#" id="s6" onclick="goToHeight(this)" cssClass="subNavBtn end">
							<s:property value="getText('fm.reports')" />&nbsp;|&nbsp;
						</s:a>
					</li>
				</s:if>
				<s:if test="schoolAccess.functionalManagement.fmAvailability.fmAvailabilityAccess">
					<li id="menu-item-421" class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-421">
						<s:a href="#" id="s7" onclick="goToHeight(this)" cssClass="subNavBtn end">
							<s:property value="getText('fm.availability')" />&nbsp;|&nbsp;
						</s:a>
					</li>
				</s:if>
			</ul>
		</div>
	
		<s:form  method="POST">
			<div class="sTop">
				<br/>
				<div class="inner">
					<h1><s:property value="getText('fm.administrator')"/></h1>
					<div id="slide">
						<br/>
						<div style="clear:both"></div>
						<s:if test="schoolAccess.functionalManagement.fmAdministrator.fmUser">
							<div class="column">
								<div class='button user'><s:property value="getText('fm.user')"/></div>
								<div style="" class="user_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmUser.add">
										<s:a action="userInitializeAction">
												<s:property value="getText('fm.add')" />
											</s:a> 
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmUser.edit">
										<a href="#"><s:property value="getText('fm.edit')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmUser.remove">
										<a href="#"><s:property value="getText('fm.remove')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmUser.show">
										<a href="#"><s:property value="getText('fm.show')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmAdministrator.fmStaff">
							<div class="column">
								<div class='button staff'><s:property value="getText('fm.staff')"/></div>
								<div style="" class="staff_grad slider">
									<s:if test="userAccessAsSchool|| userLevelAccess.functionalManagement.fmAdministrator.fmStaff.add">
										<s:a action="staffInitAction"><s:property value="getText('fm.add')"/></s:a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmStaff.edit">
										<a href="#"><s:property value="getText('fm.edit')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmStaff.remove">
										<a href="#"><s:property value="getText('fm.remove')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmStaff.show">
										<a href="#"><s:property value="getText('fm.show')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmAdministrator.fmStudent">
							<div class="column">
								<div class='button student'><s:property value="getText('fm.student')"/></div>
								<div style="" class="student_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmStudent.assignClass">
										<s:a action="studentRegistrationAddAction"><s:property value="getText('fm.registration')"/></s:a>
										<a href="#"><s:property value="getText('fm.assignClass')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmStudent.edit">
										<a href="#"><s:property value="getText('fm.edit')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmStudent.remove">
										<a href="#"><s:property value="getText('fm.remove')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmStudent.show">
										<a href="#"><s:property value="getText('fm.show')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmStudent.migrate">
										<a href="#"><s:property value="getText('fm.migrate')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmAdministrator.fmRollNumber">						
							<div class="column">
								<div class='button rollNumber'><s:property value="getText('fm.rollNumber')"/></div>
								<div style="" class="rollNumber_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmRollNumber.generateForSingleStudent">
										<a href="#"><s:property value="getText('fm.generateForSingleStudent')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAdministrator.fmRollNumber.generateForTotalClass">
										<a href="#"><s:property value="getText('fm.generateForTotalClass')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
					</div>
				</div>
				<br class="clear">
			</div>
		
			<div class="s1" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('fm.leaves')"/></h1>
					<div id="slide">
						<br/>
						<div style="clear:both"></div>
						<s:if test="schoolAccess.functionalManagement.fmLeaves.fmStudentLeaves">
							<div class="column">
								<div class='button studentLeaves'><s:property value="getText('fm.studentLeaves')"/></div>
								<div style="" class="studentLeaves_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLeaves.fmStudentLeaves.add">
										<s:a action="studentLeavesAddAction"><s:property value="getText('fm.add')"/></s:a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLeaves.fmStudentLeaves.edit">
										<a href="#"><s:property value="getText('fm.edit')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLeaves.fmStudentLeaves.remove">
										<a href="#"><s:property value="getText('fm.remove')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLeaves.fmStudentLeaves.show">
										<a href="#"><s:property value="getText('fm.show')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmLeaves.fmStaffLeaves">
							<div class="column">
								<div class='button staffLeaves'><s:property value="getText('fm.staffLeaves')"/></div>
								<div style="" class="staffLeaves_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLeaves.fmStaffLeaves.add">
										<s:a action="staffLeavesAddAction"><s:property value="getText('fm.add')"/></s:a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLeaves.fmStaffLeaves.edit">
										<a href="#"><s:property value="getText('fm.edit')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLeaves.fmStaffLeaves.remove">
										<a href="#"><s:property value="getText('fm.remove')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLeaves.fmStaffLeaves.show">
										<a href="#"><s:property value="getText('fm.show')"/></a>
									</s:if>
								</div>
							</div>	
						</s:if>				
					</div>
				</div>
			</div>
	
			<div class="s2" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('fm.communication')"/></h1>
					<div id="slide">
						<br/>
						<div style="clear:both"></div>
						<s:if test="schoolAccess.functionalManagement.fmCommunication.fmSchedule">
							<div class="column">
								<div class='button mailrs'><s:property value="getText('fm.mail.report.schedule')"/></div>
								<div style="" class="mailrs_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmCommunication.fmSchedule.examSchedule">
										<a href="#"><s:property value="getText('fm.examSchedule')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmCommunication.fmHolidays">
							<div class="column">
								<div class='button maileh'><s:property value="getText('fm.mail.events.holidays')"/></div>
								<div style="" class="maileh_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmCommunication.fmHolidays.schoolHolidaysList">
										<a href="#"><s:property value="getText('fm.schoolHolidaysList')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmCommunication.fmHolidays.classHolidaysList">
										<a href="#"><s:property value="getText('fm.classHolidaysList')"/></a>		
									</s:if>							
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmCommunication.fmSms">
							<div class="column">
								<div class='button sms'><s:property value="getText('fm.sms')"/></div>
								<div style="" class="sms_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmCommunication.fmSms.textMessage">
										<a href="#"><s:property value="getText('fm.textMessage')"/></a>
									</s:if>
								</div>
							</div>		
						</s:if>			
					</div>
				</div>
			</div>
		
			<div class="s3" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('fm.transportation')"/></h1>
					<div id="slide">
						<br/>
						<div style="clear:both"></div>
						<s:if test="schoolAccess.functionalManagement.fmTransportation.fmTransportationRoute">
							<div class="column">
								<div class='button transportationRoute'><s:property value="getText('fm.transportationRoute')"/></div>
								<div style="" class="transportationRoute_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmTransportation.fmTransportationRoute.allocation">
										<s:a action="transportationRouteAllocationAction"><s:property value="getText('fm.allocation')"/></s:a>
									</s:if>
								</div>
							</div>		
						</s:if>			
					</div>
				</div>
			</div>
		
			<div class="s4" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('fm.finance')"/></h1>
					<div id="slide">
						<br/>
						<div style="clear:both"></div>
						<s:if test="schoolAccess.functionalManagement.fmFinance.fmTuitionFee">
							<div class="column">
								<div class='button tuitionFee'><s:property value="getText('fm.tuitionFee')"/></div>
								<div style="" class="tuitionFee_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmFinance.fmTuitionFee.collection">
										<s:a action="tutionfeeCollectionAction"><s:property value="getText('fm.collection')"/></s:a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmFinance.fmOtherFee">
							<div class="column">
								<div class='button otherFee'><s:property value="getText('fm.otherFee')"/></div>
								<div style="" class="otherFee_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmFinance.fmOtherFee.collection">
										<s:a action="otherfeeCollectionAction"><s:property value="getText('fm.collection')"/></s:a>
									</s:if>
								</div>
							</div>	
						</s:if>					
					</div>
				</div>
			</div>
		
			<div class="s5" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('fm.library')"/></h1>
					<div id="slide">
						<br/>
						<div style="clear:both"></div>
						<s:if test="schoolAccess.functionalManagement.fmLibrary.fmBooks">
							<div class="column">
								<div class='button books'><s:property value="getText('fm.books')"/></div>
								<div style="" class="books_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLibrary.fmBooks.assignBooks">
										<a href="#"><s:property value="getText('fm.assignBooks')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLibrary.fmBooks.collectBooks">
										<a href="#"><s:property value="getText('fm.collectBooks')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmLibrary.fmBooks.viewAssignedBooks">
										<a href="#"><s:property value="getText('fm.viewAssignedBooks')"/></a>
									</s:if>
								</div>
							</div>			
						</s:if>								
					</div>
				</div>
			</div>
			
			<div class="s6" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('fm.reports')"/></h1>
						<div id="slide">
						<br/>
						<div style="clear:both"></div>
						<s:if test="schoolAccess.functionalManagement.fmReports.fmStudentReports">
							<div class="column">
								<div class='button studentReports'><s:property value="getText('fm.studentReports')"/></div>
								<div style="" class="studentReports_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmStudentReports.attendanceReport">
										<a href="#"><s:property value="getText('fm.attendanceReport')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmStudentReports.progressReport">
										<a href="#"><s:property value="getText('fm.progressReport')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmStudentReports.performanceReport">
										<a href="#"><s:property value="getText('fm.performanceReport')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmReports.fmStaffReports">
							<div class="column">
								<div class='button staffReports'><s:property value="getText('fm.staffReports')"/></div>
								<div style="" class="staffReports_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmStaffReports.attendanceReport">
										<a href="#"><s:property value="getText('fm.attendanceReport')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmStaffReports.performanceReport">
										<a href="#"><s:property value="getText('fm.performanceReport')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmReports.fmClassReports">
							<div class="column">
								<div class='button classReports'><s:property value="getText('fm.classReports')"/></div>
								<div style="" class="classReports_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmClassReports.attendanceReport">
										<a href="#"><s:property value="getText('fm.attendanceReport')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmClassReports.performanceReport">
										<a href="#"><s:property value="getText('fm.performanceReport')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
						<s:if test="schoolAccess.functionalManagement.fmReports.fmSchoolReports">
							<div class="column">
								<div class='button schoolReports'><s:property value="getText('fm.schoolReports')"/></div>
								<div style="" class="schoolReports_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmSchoolReports.admissionsReport">
										<a href="#"><s:property value="getText('fm.admissionsReport')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmReports.fmSchoolReports.performanceReport">
										<a href="#"><s:property value="getText('fm.performanceReport')"/></a>
									</s:if>
								</div>
							</div>		
						</s:if>	
					</div>
				</div>
			</div>
				
			<div class="s7" style="display: none">
				<div class="inner">
					<br/>
					<h1><s:property value="getText('fm.availability')"/></h1>
					<div id="slide">
						<br/>
						<div style="clear:both"></div>
						<s:if test="schoolAccess.functionalManagement.fmAvailability.fmAvailabilityCheck">
							<div class="column">
								<div class='button availabilityCheck'><s:property value="getText('fm.availabilityCheck')"/></div>
								<div style="" class="availabilityCheck_grad slider">
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAvailability.fmAvailabilityCheck.admissionsAvailability">
										<a href="#"><s:property value="getText('fm.admissionsAvailability')"/></a>
									</s:if>
									<s:if test="userAccessAsSchool || userLevelAccess.functionalManagement.fmAvailability.fmAvailabilityCheck.transportAvailability">
										<a href="#"><s:property value="getText('fm.transportAvailability')"/></a>
									</s:if>
								</div>
							</div>
						</s:if>
					</div>
				</div>
			</div>
		</s:form>
	</body>
</html>

