<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/pageElements.css">
	
		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
		
		<style>
			* { margin: 0; padding: 0; }
			body {background: #eee; /* font-family: Arial; */ font-size: 16px;}
			a { text-decoration: none;  }
		</style>
	</head>
	
	<body>
		<div class="form-style-10">
				<s:form action="" method="post">
					<h3>Create Driver</h3>
					<br/>
					<span class="required">* </span>are Mandatory fields<br/>
					<br/>
					<div class="section"><span></span>Personal Details</div>
	               	<br/>
	                <s:select required="true" list="classesMap" label="Title" name="className" autofocus="autofocus" tabindex="1"></s:select>
	                
	                <s:textfield label="Given Full Name" name="staffGivenName"/>
	                
	                <s:textfield label="Surname" name="staffSurname"/>
	
	                <s:textfield label="Date Of Birth" name="staffDOB"/>
	
	                 <s:select required="true" label="Gender" list="classesMap" name="className" tabindex="1"></s:select>
				
	                <s:textfield label="Qualification" name="staffQualification"/>
	           
	                 <s:textfield label="Photo" name="staffQualification"/>
	            
	                <s:textfield label="License Number" name="staffDOB"/>
	            
	                <s:textfield label="License Expire Date" name="staffDOB"/>
	            
	               	<s:select required="true" label="Driver Status" list="classesMap" name="className"  tabindex="1"></s:select>
	          	
	               	<s:select required="true" label="Driver Inactive Date & Time" list="classesMap" name="className" tabindex="1"></s:select>
	            
	               	<s:select required="true" label="Driver Inactive Reason" list="classesMap" name="className" tabindex="1"></s:select>
	            			            
	               	<s:select required="true" label="Appointment Type" list="classesMap" name="className" tabindex="1"></s:select>
					
					<div class="section"><span></span>Contact & Communication Details</div>
	               	<br/>
	                <s:textarea required="true" label="Appointment Type" name="staffAddress" onkeyup="upperCaseThetext('staffAddress')" tabindex="9"></s:textarea>
	            
	                <s:textfield label="Town OR District" name="staffTownDistrict"/>
	            
	                <s:textfield label="District OR City" name="staffDistrictCity"/>
	                
	               	<s:textfield label="Pin" name="staffAreaPin"/>
	                
	                <s:textfield label="State" name="staffState"/>
	                
	                <s:textfield label="State" name="staffCountry"/>
	            
	                <s:textfield label="Personal Contact Number" name="staffPCNumber"/>
	                
	                <div class="button-section">
	                	<s:submit value="Sumbit"/>
	                </div>
				</s:form>
			</div>
	</body>
</html>