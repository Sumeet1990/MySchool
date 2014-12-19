<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap_common.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/formElementsStyle.css">
		
		<style>
			* { margin: 0; padding: 0; }
			body {background: #eee; /* font-family: Arial; */ font-size: 16px;}
			a { text-decoration: none;  }
		</style>
		<style>
			
		</style>

	</head>
	<body>
		<div id="page-wrap">
			<div id="content">
				<s:form action="userRoleCreateAction" method="post" id="elements-form-ug">
	    			<h3>Create User Role</h3><br/>
				    <div id="form-content">
				    	<div id="horizonal"></div>
				    	<fieldset>
				            <div class="fieldgroup">
				            	<label>Available Roles : </label>
							</div>
							<br/>
							<div class="fieldgroup">
				            	<label>New Role</label>
				            	<input type="text" name="userRoleName"/>&nbsp;
							</div>
							<br/>			                
							<div class="fieldgroup">
			                	<label>Is Role Access Same As School Access</label>
			                 	<s:checkbox name="roleAccessAsSchool" theme="simple" />
				             </div>		                
						</fieldset>
						<div id="horizonal"></div><div id="horizonal"></div>
						<fieldset>
							<br/>
				            <h4><I>Configuration Access</I></h4>
				            <br/>
							<div id="horizonal"></div>
				         	<s:if test="schoolAccess.configurationManagement.cmAdministrator.cmUserRole">
								<h4>User Role</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmUser.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmUser.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmUser.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmUser.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							
							<s:if test="schoolAccess.configurationManagement.cmAdministrator.cmClass">
								<h4>Class</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmClass.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmClass.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmClass.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmClass.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							
							<s:if test="schoolAccess.configurationManagement.cmAdministrator.cmSection">
								<h4>Section</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmSection.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmSection.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmSection.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmSection.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							
							<s:if test="schoolAccess.configurationManagement.cmAdministrator.cmSubjects">
								<h4>Subjects</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmSubjects.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmSubjects.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmSubjects.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmAdministrator.cmSubjects.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							
							<s:if test="schoolAccess.configurationManagement.cmStaff.cmAppointmentType">
								<h4>Appointment Type</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmStaff.cmAppointmentType.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmStaff.cmAppointmentType.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmStaff.cmAppointmentType.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmStaff.cmAppointmentType.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmStaff.cmLeaveStructure">
								<h4>Leaves Structure</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmStaff.cmLeaveStructure.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmStaff.cmLeaveStructure.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmStaff.cmLeaveStructure.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmStaff.cmLeaveStructure.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmCalendar.cmSchoolCalendar">
								<h4>School Calendar</h4><br/>
								<div class="fieldgroupug">
				                	<label>Timing</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmCalendar.cmSchoolCalendar.timing" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Holidays</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmCalendar.cmSchoolCalendar.holidays" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Events</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmCalendar.cmSchoolCalendar.events" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmCalendar.cmClassCalendar">
								<h4>Class Calendar</h4><br/>
								<div class="fieldgroupug">
				                	<label>Time Table</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmCalendar.cmClassCalendar.timeTable" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Holidays</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmCalendar.cmClassCalendar.holidays" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Events</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmCalendar.cmClassCalendar.events" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmTransport.cmDriver">
								<h4>Driver</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmDriver.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmDriver.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmDriver.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmDriver.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmTransport.cmVehicle">
								<h4>Vehicle</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmVehicle.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmVehicle.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmVehicle.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmVehicle.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmTransport.cmRoute">
								<h4>Route</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmRoute.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmRoute.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmRoute.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmTransport.cmRoute.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmFinance.cmTuitionFeeStructure">
								<h4>Tuition Fee Structure</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmFinance.cmTuitionFeeStructure.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmFinance.cmTuitionFeeStructure.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmFinance.cmTuitionFeeStructure.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmFinance.cmTuitionFeeStructure.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmFinance.cmOtherFeeStructure">
								<h4>Other Fee Structure</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmFinance.cmOtherFeeStructure.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmFinance.cmOtherFeeStructure.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmFinance.cmOtherFeeStructure.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmFinance.cmOtherFeeStructure.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmLibrary.cmLibraryBooksCategory">
								<h4>Library Books Category</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmLibrary.cmLibraryBooksCategory.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmLibrary.cmLibraryBooksCategory.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmLibrary.cmLibraryBooksCategory.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmLibrary.cmLibraryBooksCategory.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.configurationManagement.cmLibrary.cmLibraryBooksEntry">
								<h4>Library Books Entry</h4><br/>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmLibrary.cmLibraryBooksEntry.create" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmLibrary.cmLibraryBooksEntry.modify" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmLibrary.cmLibraryBooksEntry.delete" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="userLevelAccess.configurationManagement.cmLibrary.cmLibraryBooksEntry.view" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<div id="horizonal"></div>
				        </fieldset>
				        <fieldset>
				        	<br/>
							<h4><I><B>Functional Access</B></I></h4>
				            <br/>
							<div id="horizonal"></div>
							<s:if test="schoolAccess.functionalManagement.fmAdministrator.fmUser">
								<h4>User</h4><br/>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmUser.add" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmUser.edit" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmUser.remove" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmUser.show" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmAdministrator.fmStaff">
								<h4>Staff</h4><br/>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStaff.add" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStaff.edit" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStaff.remove" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStaff.show" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmAdministrator.fmStudent">
								<h4>Student</h4><br/>
								<div class="fieldgroupug">
				                	<label>Assign Class</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStudent.assignClass" theme="simple" />
				                </div>
								<div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStudent.edit" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStudent.remove" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStudent.show" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Migrate</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmStudent.migrate" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmAdministrator.fmRollNumber">						
								<h4>Roll Number</h4><br/>
								<div class="fieldgroupug">
				                	<label>Generate For Single Student</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmRollNumber.generateForSingleStudent" theme="simple" />
				                </div>
								<div class="fieldgroupug">
				                	<label>Generate For Total Class</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAdministrator.fmRollNumber.generateForTotalClass" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmLeaves.fmStudentLeaves">
								<h4>Student Leaves</h4><br/>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLeaves.fmStudentLeaves.add" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLeaves.fmStudentLeaves.edit" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLeaves.fmStudentLeaves.remove" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLeaves.fmStudentLeaves.show" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmLeaves.fmStaffLeaves">
								<h4>Staff Leaves</h4><br/>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLeaves.fmStaffLeaves.add" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLeaves.fmStaffLeaves.edit" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLeaves.fmStaffLeaves.remove" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLeaves.fmStaffLeaves.show" theme="simple" />
				                </div>
				                <div id="horizonal"></div>
							</s:if>				
							<s:if test="schoolAccess.functionalManagement.fmCommunication.fmSchedule">
								<h4>Schedule</h4><br/>
								<div class="fieldgroupug">
				                	<label>Exam Schedule</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmCommunication.fmSchedule.examSchedule" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmCommunication.fmHolidays">
								<h4>Holidays</h4><br/>
								<div class="fieldgroupug">
				                	<label>School Holidays List</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmCommunication.fmHolidays.schoolHolidaysList" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Class Holidays List</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmCommunication.fmHolidays.classHolidaysList" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmCommunication.fmSms">
								<h4>SMS</h4><br/>
								<div class="fieldgroupug">
				                	<label>Text Message</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmCommunication.fmSms.textMessage" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>			
							<s:if test="schoolAccess.functionalManagement.fmTransportation.fmTransportationRoute">
								<h4>Transportation Route</h4><br/>
								<div class="fieldgroupug">
				                	<label>Alocation</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmTransportation.fmTransportationRoute.allocation" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>			
							<s:if test="schoolAccess.functionalManagement.fmFinance.fmTuitionFee">
								<h4>Tuition Fee</h4><br/>
								<div class="fieldgroupug">
				                	<label>Collection</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmFinance.fmTuitionFee.collection" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmFinance.fmOtherFee">
								<h4>Other Fee</h4><br/>
								<div class="fieldgroupug">
				                	<label>Collection</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmFinance.fmOtherFee.collection" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>					
							<s:if test="schoolAccess.functionalManagement.fmLibrary.fmBooks">
								<h4>Books</h4><br/>
								<div class="fieldgroupug">
				                	<label>Assign Books</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLibrary.fmBooks.assignBooks" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Collect Books</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLibrary.fmBooks.collectBooks" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View Assigned Books</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmLibrary.fmBooks.viewAssignedBooks" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>						
							<s:if test="schoolAccess.functionalManagement.fmReports.fmStudentReports">
								<br/>
								<h4>Student Reports</h4><br/>
								<div class="fieldgroupug">
				                	<label>Attendance Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmStudentReports.attendanceReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Progress Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmStudentReports.progressReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Performance Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmStudentReports.performanceReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmReports.fmStaffReports">
								<h4>Staff Reports</h4><br/>
								<div class="fieldgroupug">
				                	<label>Attendance Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmStaffReports.attendanceReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Performance Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmStaffReports.performanceReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmReports.fmClassReports">
								<br/>
								<h4>Class Reports</h4><br/>
								<div class="fieldgroupug">
				                	<label>Attendance Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmClassReports.attendanceReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Performance Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmClassReports.performanceReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
							<s:if test="schoolAccess.functionalManagement.fmReports.fmSchoolReports">
								<h4>School Reports</h4><br/>
								<div class="fieldgroupug">
				                	<label>Attendance Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmSchoolReports.admissionsReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Performance Report</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmReports.fmSchoolReports.performanceReport" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>	
							<s:if test="schoolAccess.functionalManagement.fmAvailability.fmAvailabilityCheck">
								<h4>Avalability Check</h4><br/>
								<div class="fieldgroupug">
				                	<label>Admissions Availability</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAvailability.fmAvailabilityCheck.admissionsAvailability" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Transport Availability</label>
				                 	<s:checkbox name="userLevelAccess.functionalManagement.fmAvailability.fmAvailabilityCheck.transportAvailability" theme="simple" />
				                </div>
				                <div class="fieldgroupug"></div>
				                <div class="fieldgroupug"></div>
				                <div id="horizonal"></div>
							</s:if>
				        </fieldset>
				        <fieldset>
							<div class="fieldgroupug">
				                <s:submit value="Sumbit"/>
				            </div>				           	
				        </fieldset>
				    </div>
				</s:form>	
			</div>
		</div>
	</body>
</html>

