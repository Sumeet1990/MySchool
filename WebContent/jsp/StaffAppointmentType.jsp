<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap_common.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/formElementsStyle.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/pageElements.css">

		<script type="text/javascript" src="${pageContext.request.contextPath}/js/add_removerow.js"></script>
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
		<s:if test="%{staffAppointmentTypeDTO.currentOperation=='create'}">
			<div id="page-wrap">
				<div id="content">
					<s:form action="staffAppointmentCreateAction" method="post" theme="simple" id="elements-form">
						<br/>
						<s:if test="staffAppointmentTypeDTO.displayMessage != null" >
							<h3 style="color:red"><s:property value="schoolSubjectsDTO.displayMessage"/></h3>
						</s:if>
						
						<h3>Appointment</h3>
						<br/>
						
						<input type="button" value="Add Row" onclick="addRow('dataTable','divGroup')"/>
						<input type="button" value="Delete Row" onclick="deleteRow('dataTable')"/>
						
						<fieldset id="divGroup">
				            <div class="fieldgroupForCheckBox" id="dataTable0">
				            	<label>Appointment Type</label>
				                <s:textfield name="staffAppointmentTypeDTO.appointmentTypes" theme="simple" id="defaultText" style="text-transform:uppercase;" value="%{#element}"/>
				                <s:checkbox name="checkBox"/>
				            </div>
			            </fieldset>
			            <fieldset>
							<div>	
                				<s:submit value="Create Appointment"/>
                			</div>
                		</fieldset>
		            </s:form>
	            </div>
            </div>
		</s:if>
		<s:if test="%{staffAppointmentTypeDTO.currentOperation=='view'}">
			<s:if test="staffAppointmentTypeDTO.displayMessage != null" >
				<h3 style="color:red"><s:property value="schoolSubjectsDTO.displayMessage"/></h3>
			</s:if>
			<div class="form-style-10">
				<h4><s:property value="getText('staff.appointmentType.availableAppointmentTypes)"/></h4>
				<table border='1' width="100%">
					<tr>
					    <td style="text-align:center" width="20%">So No</td>
					    <td style="text-align:center" width="20%">Appointment Type</td>
					    <td style="text-align:center" width="20%">Appointment Status</td>
					    <td style="text-align:center" width="20%">Inactive Reason</td>
					    <td style="text-align:center" width="20%">Inactive Date & Time</td>
					</tr>
					
					<s:iterator value="availableStaffAppointmentTypeList" status="rowstatus">
						<tr class="<s:if test="#rowstatus.odd == true ">odd</s:if><s:else>even</s:else>">
						    <td style="text-align:center" width="20%"><s:property value="#rowstatus.count"/></td>
						    <td style="text-align:center" width="20%"><s:property value="appointmentType"/></td>
						    <td style="text-align:center" width="20%"></td>
						    <td style="text-align:center" width="20%"></td>
						    <td style="text-align:center" width="20%"></td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</s:if>
	</body>
</html>
