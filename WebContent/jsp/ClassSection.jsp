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
			 body {background: #eee;  font-family: Arial;  font-size: 16px;} 
			 a { text-decoration: none;  }  
		</style>
	</head>
	
	<body>
		<s:if test="classSectionDTO.currentOperation == 'create'">
			<div class="form-style-10">
				<h1>Section</h1>
				<br/>
				<s:if test="classSectionDTO.displayMessage != null" >
					<h3 style="color:red"><s:property value="classSectionDTO.displayMessage"/></h3>
				</s:if>
				<br/>
				<s:form action="" method="post" focusElement="cName">
					<div class="section"><span></span>Create Class Section</div>
					<br/><span class="required">* </span>are Mandatory fields<br/><br/>
		        
	                <s:select required="true" label="Class Name" id="cName" list="classesMap" name="classSectionDTO.schoolClassId" tabindex="1"></s:select>
	        
	                <s:textfield label="Section Name" name="classSectionDTO.section"></s:textfield>
	        
	                <s:select label="Class Teacher Name" required="true" list="classTeacherMap" name="classSectionDTO.staffId" tabindex="1"></s:select>
	        
	                <s:textfield label="Maximum Section Strength" name="classSectionDTO.sectionMaximumStrength"/>
	        
	                <s:select label="Section Status" required="true" list="staffStatusBean" name="classSectionDTO.sectionStatus" tabindex="1"></s:select>
	        
	        		<div class="button-section">
	                	<s:submit value="Create" action="classSectionCreateAction"/>
					</div>
				</s:form>
			</div>
		</s:if>
		<s:if test="classSectionDTO.currentOperation == 'view'">
			<div class="form-style-10" style="width:1050px">
				<h4>Available Sections</h4>
				<table border='1' width="100%">
					<tr>
					    <td style="text-align:center" width="5%">So No</td>
					    <td style="text-align:center" width="10%">Class Name</td>
					    <td style="text-align:center" width="10%">Section</td>
					    <td style="text-align:center" width="25%">Class Teacher</td>
					    <td style="text-align:center" width="10%">Section Maximum Strength</td>
					    <td style="text-align:center" width="10%">Section Status</td>
					    <td style="text-align:center" width="20%">Inactive Reason</td>
					    <td style="text-align:center" width="10%">Inactive Date & Time</td>
					</tr>
				
					<s:iterator value="availableClassSectionsList" status="rowstatus">
						<tr class="<s:if test="#rowstatus.odd == true ">odd</s:if><s:else>even</s:else>">
						    <td style="text-align:center" width="5%"><s:property value="#rowstatus.count"/></td>
						    <td style="text-align:center" width="10%"><s:property value="schoolClassName"/></td>
						    <td style="text-align:center" width="10%"><s:property value="section"/></td>
						    <td style="text-align:center" width="25%" ><s:property value="classTeacherName"/></td>
						    <td style="text-align:center" width="10%"><s:property value="sectionMaximumStrength"/></td>
						    <td style="text-align:center" width="10%"><s:property value="sectionStatus"/></td>
						    <td style="text-align:center" width="20%"><s:property value="sectionInactiveReason"/></td>
						    <td style="text-align:center" width="10%"></td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</s:if>
	</body>
</html>