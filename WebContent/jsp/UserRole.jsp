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
	</head>
	<body>
			<div id="page-wrap">
				<div id="content">
					<s:form action="" method="post" id="elements-form-ug">
	    			<h3>Create User Role</h3>
				    <div id="form-content">
						<fieldset>
				            <div class="fieldgroupug">
				            	<label>Available Roles : </label>
							</div>
							<div class="fieldgroupug">
				            	<label>New Role</label>
				            	<input type="text" name=""/>&nbsp;
							</div>			                
						</fieldset>
						<fieldset>
							<div class="fieldgroupug">
				            	<label>Is User Access Same As School</label>
				            	<s:checkbox name="checkBox" theme="simple" />
							</div>
							<br/>
							<h4>Configuration Access</h4>
				         	<s:if test="schoolLevelAccessRequest.configurationManagment.cmAdministrator.cmUserRole">
								<br/>
								<h4>User Role</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmAdministrator.cmUser">
								<br/>
								<h4>User</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmAdministrator.cmClass">
								<br/>
								<h4>Class</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmAdministrator.cmSection">
								<br/>
								<h4>Section</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmAdministrator.cmSubjects">
								<br/>
								<h4>Subjects</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmStaff.cmAppointmentType">
								<br/>
								<h4>Appointment Type</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmStaff.cmLeaveStructure">
								<br/>
								<h4>Leaves Structure</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmCalendar.cmSchoolCalendar">
								<br/>
								<h4>School Calendar</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmCalendar.cmClassCalendar">
								<br/>
								<h4>Class Calendar</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmTransport.cmDriver">
								<br/>
								<h4>Driver</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmTransport.cmVehicle">
								<br/>
								<h4>Vehicle</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmTransport.cmRoute">
								<br/>
								<h4>Route</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmFinance.cmTuitionFeeStructure">
								<br/>
								<h4>Tuition Fee Structure</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmFinance.cmOtherFeeStructure">
								<br/>
								<h4>Other Fee Structure</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmLibrary.cmLibraryBooksCategory">
								<br/>
								<h4>Library Books Category</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.configurationManagment.cmLibrary.cmLibraryBooksEntry">
								<br/>
								<h4>Library Books Entry</h4>
								<div class="fieldgroupug">
				                	<label>Create</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Modify</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Delete</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>View</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
				        </fieldset>
				        <fieldset>
				        	<br/>
							<h4>Functional Access</h4>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmAdministrator.fmUser">
								<br/>
								<h4>User</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmAdministrator.fmStaff">
								<br/>
								<h4>Staff</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmAdministrator.fmStudent">
								<br/>
								<h4>Student</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmAdministrator.fmRollNumber">						
								<br/>
								<h4>Roll Number</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmLeaves.fmStudentLeaves">
								<br/>
								<h4>Student Leaves</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmLeaves.fmStaffLeaves">
								<br/>
								<h4>Staff Leaves</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>				
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmCommunication.fmSchedule">
								<br/>
								<h4>Schedule</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmCommunication.fmHolidays">
								<br/>
								<h4>Holidays</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmCommunication.fmSms">
								<br/>
								<h4>SMS</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>			
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmTransportation.fmTransportationRoute">
								<br/>
								<h4>Transportation Route</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>			
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmFinance.fmTuitionFee">
								<br/>
								<h4>Tuition Fee</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmFinance.fmOtherFee">
								<br/>
								<h4>Other Fee</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>					
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmLibrary.fmBooks">
								<br/>
								<h4>Books</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>								
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmReports.fmStudentReports">
								<br/>
								<h4>Student Reports</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmReports.fmStaffReports">
								<br/>
								<h4>Staff Reports</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmReports.fmClassReports">
								<br/>
								<h4>Class Reports</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmReports.fmSchoolReports">
								<br/>
								<h4>School Reports</h4>
								<div class="fieldgroupug">
				                	<label>Add</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Edit</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Remove</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
				                <div class="fieldgroupug">
				                	<label>Show</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
							</s:if>	
							<s:if test="schoolLevelAccessRequest.functionalManagement.fmAvailability.fmAvailabilityCheck">
								<div class="fieldgroupug">
				                	<label>Address</label>
				                 	<s:checkbox name="checkBox" theme="simple" />
				                </div>
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

