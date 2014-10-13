<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title></title>
	
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
				<s:form action="" method="post" id="elements-form">
	    			<h3>Add Staff</h3>
				    <div id="form-content">
						<fieldset>
							<br/>
							<h4>Personal Details</h4>
							<br/>
				            <div class="fieldgroup">
				            	<label>Title</label>
				                <s:select required="true" list="tilesBeanStaff" name="staffDTO.staffTitle" autofocus="autofocus" theme="simple" tabindex="1"></s:select>&nbsp;
				                
				                <label>Given Full Name</label>
				                <input type="text" name="staffDTO.staffGivenFullName"/>&nbsp;
				                
				                <label>Surname</label>
				                <input type="text" name="staffDTO.staffSurname"/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Date Of Birth</label>
				                <input type="text" name="staffDTO.staffDob"/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Gender</label>
				                <s:select required="true" list="genderBean" name="staffDTO.staffGender"  theme="simple" tabindex="1"></s:select>
				            </div>
							
							<div class="fieldgroup">
				                <label>Qualification</label>
				                <input type="text" name="staffDTO.staffQualification"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Designation</label>
				                <input type="text" name="staffDTO.staffDesignation"/>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Staff Status</label>
				               	<s:select required="true" list="staffStatusBean" name="staffDTO.staffStatus"  theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Teaching Staff</label>
				               	<s:select required="true" list="commonYesOrNo" name="staffDTO.teacherStaffFlag"  theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Is Staff Class Teacher</label>
				               	<s:select required="true" list="commonYesOrNo" name="staffDTO.classTeacherFlag"  theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Teaching Subjects</label>
				               	<!-- Add Multi select text area -->
				                <s:select  cssStyle="height:30%" required="true" list="subjectListMap" name="staffDTO.subjectCodesList"  theme="simple" tabindex="1" multiple="true"></s:select>
				               <%--  <s:checkboxlist  list="subjectListMap" name="className" theme="simple" tabindex="1"></s:checkboxlist> --%>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Appointment Type</label>
				               	<s:select required="true" list="staffAppointmentTypes" name="staffDTO.appointmentTypeId"  theme="simple" tabindex="1"></s:select>
				            </div>
						</fieldset>
						<fieldset>
							<br/>
							<h4>Contact & Communication Details</h4>
				            <div class="fieldgroup">
				                <label>Address</label>
				                <!-- Add Text Area -->
				                 <s:textarea required="true" name="staffDTO.addressLine1" 
				                 onkeyup="upperCaseThetext('staffAddress')" theme="simple" tabindex="9"></s:textarea>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Town OR District</label>
				                <input type="text" name="staffDTO.staffTownDistrict"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>District OR City</label>
				                <input type="text" name="staffDTO.staffDistrictCity"/>
				            </div>
				            <div class="fieldgroup">
				                <label>PIN</label>
				                <input type="text" name="staffDTO.staffAreaPin"/>
				            </div>
				            <div class="fieldgroup">
				                <label>State</label>
				                <input type="text" name="staffDTO.staffState"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Country</label>
				                <input type="text" name="staffDTO.staffCountry"/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Personal Contact Number</label>
				                <input type="text" name="staffDTO.staffPCNumber"/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Personal Contact Number</label>
				                <input type="text" name="staffDTO.staffECNumber"/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Email Id</label>
				                <input type="text" name="staffDTO.staffEmailId"/>
				            </div>
				        </fieldset>
				        <fieldset>
							<div class="fieldgroup">
				                <s:submit value="Sumbit" action="staffAddAction"/>
				            </div>				           	
				        </fieldset>
				    </div>
				</s:form>
			</div>
		</div>
	</body>
</html>