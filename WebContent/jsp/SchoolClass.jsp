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
			<s:if test="schoolClassDTO.classOperationStatus == false">
				<s:form action="" method="post" id="elements-form">
	    			<h3>Create Class</h3>
				    <s:if test="schoolClassDTO.classOperationStatus == false && schoolClassDTO.errorMessage != null" >
						<h3 style="color:red"><s:property value="schoolClassDTO.errorMessage"/></h3>
					</s:if>
				    <div id="form-content">
						<fieldset>
							<br/>
				            <div class="fieldgroup">
				                <label>Class Name</label>
				                 <input type="text" name="schoolClassDTO.schoolClassName"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Minimum Student age</label>
				                <input type="text" name="schoolClassDTO.minimumStudAge"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Maximum Student age</label>
				                <input type="text" name="schoolClassDTO.maximumStudAge"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Periods per Day</label>
				                <input type="text" name="schoolClassDTO.periodsPerDay"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Duration of each Period</label>
				                <input type="text" name="schoolClassDTO.durationOfPeriod"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Max Periods per Teacher</label>
				                <input type="text" name="schoolClassDTO.maxPeriodsPerteacher"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Maximum Strength of class including all sections</label>
				                <input type="text" name="schoolClassDTO.maxStrengthOfClass"/>
				            </div>
				        </fieldset>
						
									<s:optiontransferselect
									     name="availableSubject"
									     leftTitle="Left Antivirus Title"
									     rightTitle="Right Antivirus Title"
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

						<fieldset>
							<div class="fieldgroup">
				                <s:submit action="schoolClassCreateOAction" value="Create Class"></s:submit>
				            </div>				           	
				        </fieldset>
		 			</div>
				</s:form>
				</s:if>
				<s:else>
					<h3 style="color:green"><s:property value="schoolClassDTO.errorMessage"/></h3>
				</s:else>
			</div>
		</div>
	</body>
</html>


