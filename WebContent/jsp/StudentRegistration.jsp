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
			 body {background: #eee;  font-family: Arial;  font-size: 16px;} 
			 a { text-decoration: none;  }  
		</style>
	</head>
	
	<body>
		<div id="page-wrap">
			<div id="content">
				<form action="" method="post" id="elements-form">
	    			<h3>Student Registration</h3>
				    <div id="form-content">
				        <fieldset>
				            <div class="fieldgroup">
				                <label>Class Name</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
							<div class="fieldgroup">
				                <label>Class Section</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
						</fieldset>
						<fieldset>
							<br/>
							<h4>Personal Details</h4>
							<br/>
				            <div class="fieldgroup">
				            	<label>Title</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				             </div>  
				            
				             <div class="fieldgroup"> 
				                <label>Given Full Name</label>
				                <input type="text" name="studentGivenName"/>
				             </div>
				            
				             <div class="fieldgroup">   
				                <label>Surname</label>
				                <input type="text" name="studentSurname"/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Date Of Birth</label>
				                <input type="text" name="studentDOB"/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Gender</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
							
							<div class="fieldgroup">
				                <label>Father Full Name</label>
				                <input type="text" name="studentFatherFullName"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Mother Full Name</label>
				                <input type="text" name="studentMotherFullName"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Guardian Full Name</label>
				                <input type="text" name="studentGurdianFullName"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Class Teacher Name</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Student Status</label>
				               	<s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
						</fieldset>
						<fieldset>
							<br/>
							<h4>Contact & Communication Details</h4>
							<div class="fieldgroup">
				                <label>C/O</label>
				                <input type="text" name="studentCareOff"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Address</label>
				                <!-- Add Text Area -->
				                 <%-- <s:textarea required="true" name="studentAddress" onkeyup="upperCaseThetext('studentAddress')" tabindex="9"></s:textarea> --%>
				             </div>
				            
				            <div class="fieldgroup">
				                <label>Town OR District</label>
				                <input type="text" name="studentTownDistrict"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>District OR City</label>
				                <input type="text" name="studentDistrictCity"/>
				            </div>
				            <div class="fieldgroup">
				                <label>PIN</label>
				                <input type="text" name="studentAreaPin"/>
				            </div>
				            <div class="fieldgroup">
				                <label>State</label>
				                <input type="text" name="studentState"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Country</label>
				                <input type="text" name="studentCountry"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Father Contact Number</label>
				                <input type="text" name="studentFPCNumber"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Mother Contact Number</label>
				                <input type="text" name="studentMPCNumber"/>
				            </div>
				             <div class="fieldgroup">
				                <label>Guardian Contact Number</label>
				                <input type="text" name="studentGPCNumber"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Father Occupation</label>
				                <input type="text" name="studentFOccupation"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Mother Occupation</label>
				                <input type="text" name="studentMOccupation"/>
				            </div>
				             <div class="fieldgroup">
				                <label>Guardian Occupation</label>
				                <input type="text" name="studentGOccupation"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Father Work Number</label>
				                <input type="text" name="studentFWCNumber"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Mother Work Number</label>
				                <input type="text" name="studentMWCNumber"/>
				            </div>
				             <div class="fieldgroup">
				                <label>Guardian Work Number</label>
				                <input type="text" name="studentGWCNumber"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Father Email Id</label>
				                <input type="text" name="studentFEmailId"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Mother Email Id</label>
				                <input type="text" name="studentMEmailId"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Guardian Email Id</label>
				                <input type="text" name="studentGEmailId"/>
				            </div>
				        </fieldset>
				        <fieldset>
							<div class="fieldgroup">
				                <input type="submit" value="Register" class="submit"/>
				            </div>				           	
				        </fieldset>
				    </div>
				</form>
			</div>
		</div>
	</body>
</html>