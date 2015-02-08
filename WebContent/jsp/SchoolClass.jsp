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

		<s:head/>
	</head>
	<body>
		<s:if test="schoolClassDTO.ClassCurrentOperation == 'classCreate'">
			<div class="form-style-10">
				<s:form action="" method="post" id="elements-form" focusElement="cName">
			    	<s:if test="schoolClassDTO.errorMessage != null" >
						<h3 style="color:red"><s:property value="schoolClassDTO.errorMessage"/></h3>
					</s:if>
					<br/>
	               	<div class="section"><span></span><s:property value="getText('class.createClass')"/></div>
	               		<br/><span class="required">* </span>are Mandatory fields<br/>
	               		<br/>
		                <s:textfield name="schoolClassDTO.schoolClassName" id="cName" key="class.className" style="text-transform:uppercase;" required="true"/>
		               	
		               	<s:textfield name="schoolClassDTO.minAgeCriteriaInMonths" maxlength="3" key="class.minStudentAgeInMonths" onKeyPress="return onlyNumbers(event)" required="true"/>
		               	
		               	<s:textfield name="schoolClassDTO.maxAgeCriteriaInMonths" maxlength="3" key="class.maxStudentAgeInMonths" onKeyPress="return onlyNumbers(event)" required="true"/>
		               	
		               	<s:textfield name="schoolClassDTO.periodsPerDay" maxlength="2" key="class.periodsPerDay" onKeyPress="return onlyNumbers(event)" required="true"/>
		               	
		               	<s:textfield name="schoolClassDTO.periodDurationInMin" key="class.periodDurationInMin" maxlength="3" onKeyPress="return onlyNumbers(event)" required="true"/>
		               	
		               	<s:textfield name="schoolClassDTO.teacherPeriodsPerDay" key="class.maxTeacherPeriods" maxlength="2" onKeyPress="return onlyNumbers(event)"/>
		               	
		               	<s:textfield name="schoolClassDTO.classMaxStrength" key="class.maxStrength" maxlength="3" onKeyPress="return onlyNumbers(event)" required="true"/>
		               	
		               	<s:select list="classStatusBean" name="schoolClassDTO.classStatus" key="class.maxStrength"></s:select>
					
						<s:optiontransferselect 
							name="availableSubject"
						    leftTitle="Avaliable subjects"
						    rightTitle="Selected Subjects"
						    list="availableSubjectList"
						    multiple="true"
						    headerKey="-1"
						    cssClass="form-control"
						    allowAddToLeft="true"
						    allowAddToRight="true"
						    allowUpDownOnLeft="false"
						    allowUpDownOnRight="false"
						    allowSelectAll="false"
						    labelposition="centre"
						    doubleCssClass="form-control"
						    doubleList="selectedSubjectList"
						    doubleName="selectedSubject"
						    doubleHeaderKey="-1"
						/>
					<div class="button-section">
	                	<s:submit action="schoolClassCreateAction" value="Create Class"></s:submit>
	                </div>
				</s:form>
			</div>
		</s:if>
		<s:if test="schoolClassDTO.ClassCurrentOperation == 'classView'">
		<div class="form-style-10">
			<h4><s:property value="getText('calss.availableClasses')"/></h4>
			<table border='1' width="50%">
				<tr>
				    <td style="text-align:center" width="5%">So No</td>
				    <td style="text-align:center" width="5%">Class Name</td>
				    <td style="text-align:center" width="5%">Min Age Criteria</td>
				    <td style="text-align:center" width="5%">Max Age Criteria</td>
				    <td style="text-align:center" width="5%">Periods Per Day</td>
				    <td style="text-align:center" width="5%">Period Duration in Min</td>
				    <td style="text-align:center" width="5%">Teacher Periods Per Day</td>
				    <td style="text-align:center" width="5%">Class Max Strength</td>
				    <td style="text-align:center" width="5%">Class Subjects</td>
				    <td style="text-align:center" width="5%">Class Status</td>
				</tr>
				
				<s:iterator value="availableClassList" status="rowstatus">
					<tr class="<s:if test="#rowstatus.odd == true ">odd</s:if><s:else>even</s:else>">
					    <td style="text-align:center" width="5%"><s:property value="#rowstatus.count"/></td>
					    <td style="text-align:center" width="5%"><s:property value="schoolClassName"/></td>
					    <td style="text-align:center" width="5%" ><s:property value="minAgeCriteriaInMonths"/></td>
					    <td style="text-align:center" width="5%"><s:property value="maxAgeCriteriaInMonths"/></td>
					    <td style="text-align:center" width="5%"><s:property value="periodsPerDay"/></td>
					    <td style="text-align:center" width="5%"><s:property value="periodDurationInMin"/></td>
					    <td style="text-align:center" width="5%"><s:property value="teacherPeriodsPerDay"/></td>
					    <td style="text-align:center" width="5%" ><s:property value="classMaxStrength"/></td>
					    <td style="text-align:center" width="5%"><s:property value="calssSubjects"/></td>
					    <td style="text-align:center" width="5%"><s:property value="classStatus"/></td>
					</tr>
				</s:iterator>
			</table>
			</div>
		</s:if>
	</body>
</html>


