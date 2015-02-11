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
		<s:if test="%{schoolSubjectsDTO.currentOperation == 'create'}">
			<div id="page-wrap">
				<div id="content">
					<s:form action="schoolSubjectCreateAction" method="post" theme="simple" id="elements-form">
						<br/>
						<s:if test="schoolSubjectsDTO.errorMessage != null" >
							<h3 style="color:red"><s:property value="schoolSubjectsDTO.errodisplayMessage"/></h3>
						</s:if>
						
						<s:property value="getText('subject.subjects')"/>
	               		<br/>
						
						<input type="button" value="Add Row" onclick="addRow('dataTable','divGroup')"/>
						<input type="button" value="Delete Row" onclick="deleteRow('dataTable')"/><br/><br/>
				    	
				    	<fieldset id="divGroup">
				            <div class="fieldgroupForCheckBox" id="dataTable0">
								<label>Subject</label>
				            	<s:textfield name="schoolSubjectsDTO.schoolSubjectNames" key="subject.subjectName" id="defaultText" style="text-transform:uppercase;" value=""/>
								<s:checkbox name="checkBox"/>
				        	</div>
						</fieldset>
						<fieldset>
							<div>	
	                			<s:submit value="Create Subjects"/>
	                		</div>
	                	</fieldset>
		            </s:form>
		        </div>
	        </div>
		</s:if>
		
		<s:if test="%{schoolSubjectsDTO.currentOperation == 'modify'}">
			<div class="form-style-10">		
				<s:form action="schoolSubjectModifyAction" method="post" theme="simple" id="elements-form">
					<div class="section"><span></span><s:property value="getText('subject.subjects')" /></div>
					<br/>
					<span class="required"></span>Click the check box and modify the subject<br/>
					<br/>
					<s:property value="errorMessage" />
					<br/>
					<s:iterator value="schoolSubjectsDTOList">
						<s:textfield name="schoolSubjectsDTO.schoolSubjectNames" key="subject.subjectName" style="text-transform:uppercase;" value="%{subjectName}" theme="simple"/>
						<s:checkbox name="checkBox" theme="simple"/>
						<s:hidden name="schoolSubjectsDTO.schoolSubjectCodes" value="%{subjectCode"/>
					</s:iterator>
					<div class="button-section">
						<s:submit value="Modify" id="submitButton" action="schoolSubjectModifyAction"/>
					</div>
				</s:form>
			</div>
		</s:if>
		
		<s:if test="%{schoolSubjectsDTO.currentOperation == 'delete'}">
			<div class="form-style-10">	
				<s:form action="schoolSubjectDeleteAction" method="post" theme="simple" id="elements-form">
					<div class="section"><span></span><s:property value="getText('subject.subjects')" /></div>
					<br/>
					<span class="required"></span>Click the check box and delete the subject<br/>
					<br/>
					<s:property value="errorMessage" />
						<s:iterator value="schoolSubjectsDTO.existsSubjectList" var="element">
							<s:textfield disabled="true" name="schoolSubjectsDTO.subjectName" key="subject.subjectName" style="text-transform:uppercase;" value="%{#element.subjectName}" theme="simple"/>
							<s:checkbox name="checkBox" theme="simple"/>
							<s:hidden name="schoolSubjectsDTO.subjectCodes" value="%{schoolSubjectsDTO.subjectNameCodes.get(#element)}"/>
						</s:iterator>
						<s:submit value="Delete" id="submitButton" action="schoolSubjectDeleteAction" theme="simple"/>
				</s:form>
			</div>
		</s:if>
		
		<s:if test="%{schoolSubjectsDTO.currentOperation == 'view'}">
			<s:if test="schoolSubjectsDTO.errorMessage != null" >
				<h3 style="color:red"><s:property value="schoolSubjectsDTO.displayMessage"/></h3>
			</s:if>
			<div class="form-style-10">
				<h4><s:property value="getText('subjects.availableSubjects')"/></h4>
				<table border='1' width="50%">
					<tr>
					    <td style="text-align:center" width="10%">So No</td>
					    <td style="text-align:center" width="20%">Subject Name</td>
					    <td style="text-align:center" width="20%">Subject Status</td>
					</tr>
					
					<s:iterator value="schoolSubjectsDTOList" status="rowstatus">
						<tr class="<s:if test="#rowstatus.odd == true ">odd</s:if><s:else>even</s:else>">
						    <td style="text-align:center" width="10%"><s:property value="#rowstatus.count"/></td>
						    <td style="text-align:center" width="20%"><s:property value="subjectName"/></td>
						    <td style="text-align:center" width="20%"><s:property value="subjectStatus"/></td>
						</tr>
					</s:iterator>
				</table>
			</div>
		</s:if>
	</body>
</html>
