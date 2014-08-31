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
	    			<h3>Create Driver</h3>
				    <div id="form-content">
							<h4>Personal Details</h4>
							<br/>
							<fieldset>
				            <div class="fieldgroup">
				            	<label>Title</label>
				                 <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				                
				                <label>Given Full Name</label>
				                <input type="text" name="staffGivenName"/>&nbsp;
				                
				                <label>Surname</label>
				                <input type="text" name="staffSurname"/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Date Of Birth</label>
				                <input type="text" name="staffDOB"/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Gender</label>
				                 <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
							
							<div class="fieldgroup">
				                <label>Qualification</label>
				                <input type="text" name="staffQualification"/>
				            </div>
				           
				           	<div class="fieldgroup">
				                <label>Photo</label>
				                 <input type="text" name="staffQualification"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>License Number</label>
				                <input type="text" name="staffDOB"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>License Expire Date</label>
				                <input type="text" name="staffDOB"/>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Driver Status</label>
				               	<s:select required="true" list="classesMap" name="className"  theme="simple" tabindex="1"></s:select>
				            </div>
				          	
				          	<div class="fieldgroup">
				               	<label>Driver Inactive Date & Time</label>
				               	<s:select required="true" list="classesMap" name="className"  theme="simple" tabindex="1"></s:select>
				            </div>
				            
				          	<div class="fieldgroup">
				               	<label>Driver Inactive Reason</label>
				               	<s:select required="true" list="classesMap" name="className"  theme="simple" tabindex="1"></s:select>
				            </div>
				            			            
				            <div class="fieldgroup">
				               	<label>Appointment Type</label>
				               	<s:select required="true" list="classesMap" name="className"  theme="simple" tabindex="1"></s:select>
				            </div>
						</fieldset>
						<fieldset>
							<br/>
							<h4>Contact & Communication Details</h4>
				            <div class="fieldgroup">
				                <label>Address</label>
				                <!-- Add Text Area -->
				                 <s:textarea required="true" name="staffAddress" 
				                 onkeyup="upperCaseThetext('staffAddress')" theme="simple" tabindex="9"></s:textarea>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Town OR District</label>
				                <input type="text" name="staffTownDistrict"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>District OR City</label>
				                <input type="text" name="staffDistrictCity"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Pin</label>
				                <input type="text" name="staffAreaPin"/>
				            </div>
				            <div class="fieldgroup">
				                <label>State</label>
				                <input type="text" name="staffState"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Country</label>
				                <input type="text" name="staffCountry"/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Personal Contact Number</label>
				                <input type="text" name="staffPCNumber"/>
				            </div>
				        </fieldset>
				        <fieldset>
							<div class="fieldgroup">
				                <s:submit value="Sumbit"/>
				            </div>				           	
				        </fieldset>
				    </div>
				</s:form>
			</div>
		</div>
	</body>
</html>