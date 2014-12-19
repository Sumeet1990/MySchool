<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	
		<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap_common.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/formElementsStyle.css">
		
		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>

		<s:head/>
	</head>
	<body>
		<div id="page-wrap">
			<div id="content">
				<s:if test="schoolClassDTO.ClassCurrentOperation == 'classCreate'">
					<s:form action="" method="post" id="elements-form" autocomplete="off">
	    				<h3><s:property value="getText('class.createClass')"/></h3>
				    	<s:if test="schoolClassDTO.errorMessage != null" >
							<h3 style="color:red"><s:property value="schoolClassDTO.errorMessage"/></h3>
						</s:if>
				    	<div id="form-content">
							<fieldset>
								<br/>
				            	<div class="fieldgroup">
				                	<label><s:property value="getText('class.className')"/></label>
				                 	<input type="text" name="schoolClassDTO.schoolClassName" onkeyup="upperCaseThetextById(this)" autofocus required/>
				            	</div>
				            	<div class="fieldgroup">
				                	<label><s:property value="getText('class.minStudentAgeInMonths')"/></label>
				                	<input type="text" name="schoolClassDTO.minAgeCriteriaInMin" maxlength="3" onKeyPress="return onlyNumbers(event)" required/>
				            	</div>
				            	<div class="fieldgroup">
				                	<label><s:property value="getText('class.maxStudentAgeInMonths')"/></label>
				                	<input type="text" name="schoolClassDTO.maxAgeCriteriaInMin" maxlength="3" onKeyPress="return onlyNumbers(event)" required/>
				            	</div>
				            	<div class="fieldgroup">
				                	<label><s:property value="getText('class.periodsPerDay')"/></label>
				                	<input type="text" name="schoolClassDTO.periodsPerDay" maxlength="2" onKeyPress="return onlyNumbers(event)"/>
				            	</div>
				            	<div class="fieldgroup">
				                	<label><s:property value="getText('class.periodDurationInMin')"/></label>
				                	<input type="text" name="schoolClassDTO.periodMinutesDurationInMin" maxlength="3" onKeyPress="return onlyNumbers(event)" required/>
				            	</div>
				            	<div class="fieldgroup">
				                	<label><s:property value="getText('class.maxTeacherPeriods')"/></label>
				                	<input type="text" name="schoolClassDTO.teacherPeriodsPerDay" maxlength="2" onKeyPress="return onlyNumbers(event)"/>
				            	</div>
				            	<div class="fieldgroup">
				                	<label><s:property value="getText('class.maxStrength')"/></label>
				                	<input type="text" name="schoolClassDTO.maxStrengthOfClass" maxlength="3" onKeyPress="return onlyNumbers(event)" required/>
				            	</div>
				            	<div class="fieldgroup">
				                	<label>Section Status</label>
				                	<s:select list="classStatusBean" name="schoolClassDTO.classStatus"  theme="simple"></s:select>
				            	</div>
				        	</fieldset>
					        <fieldset>
								<div class="fieldgroup">
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
								</div>
							</fieldset>
							<fieldset>
								<div class="fieldgroup">
					                <s:submit action="schoolClassCreateAction" value="Create Class"></s:submit>
					            </div>				           	
					        </fieldset>
			 			</div>
					</s:form>
				</s:if>
				<s:if test="schoolClassDTO.ClassCurrentOperation == 'classView'">
					<s:property value="getText('calss.availableClasses')"/>
					<s:iterator value="availableClassList">
						<s:property value="schoolClassName"/> - <s:property value="minAgeCriteriaInMin"/> - <s:property value="maxAgeCriteriaInMin"/> 
							- <s:property value="periodsPerDay"/> - <s:property value="periodMinutesDurationInMin"/> - <s:property value="teacherPeriodsPerDay"/>
							- <s:property value="classMaximumStrength"/> - <s:property value="subjectCodesList"/> - <s:property value="classStatus"/>
				
					</s:iterator>
				</s:if>
			</div>
		</div>
	</body>
</html>


