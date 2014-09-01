<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/add_removerow.js"></script>
		
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
		<s:if test="schoolSubjectsDTO.currentOperationStatus=='subjectCreateFail' || schoolSubjectsDTO.currentOperationStatus=='subjectModifyFail'">
			<s:property value="schoolSubjectsDTO.existsSubjectList" />
			<s:property value="errorMessage" />
		</s:if>
		
		<s:if test="%{schoolSubjectsDTO.currentOperationStatus == 'subjectCreateSuccess' || schoolSubjectsDTO.currentOperationStatus == 'subjectModify'}">
			<s:form action="schoolSubjectModifyAction" onsubmit="return keepSubjectsToModify('dataTableModfiy','submitButton')">
				<s:property value="errorMessage" />
				<table id="dataTableModfiy">
					<s:iterator value="schoolSubjectsDTO.subjectName" var="element">
						<tr>
							<td><s:label value="Subject Name" theme="simple"></s:label></td>
							<td><s:textfield disabled="true"  name="schoolSubjectsDTO.subjectName" onkeyup="upperCaseThetextById(this)" value="%{#element}" theme="simple" /></td>
							<s:if test="schoolSubjectsDTO.currentOperationStatus == 'subjectCreateSuccess'">
								<td><s:checkbox name="checkBox" theme="simple"/></td>
								<td><s:hidden name="schoolSubjectsDTO.subjectCodes" value="%{schoolSubjectsDTO.subjectNameCodes.get(#element)}"/></td>
							</s:if>
						</tr>
					</s:iterator>
				</table>
				<s:if test="schoolSubjectsDTO.currentOperationStatus != 'subjectModify'">
					<s:submit value="Modify" id="submitButton" action="schoolSubjectModifyAction" theme="simple" />
				</s:if>
			</s:form>
		</s:if>
		
		<s:if test="%{schoolSubjectsDTO.currentOperationStatus=='subjectCreate' || schoolSubjectsDTO.currentOperationStatus=='subjectCreateFail' || schoolSubjectsDTO.currentOperationStatus=='subjectModifyFail'}">
			<div id="page-wrap">
				<div id="content">
					<s:form action="schoolSubjectCreateAction" method="post" theme="simple" id="elements-form">
						<h3>Subject</h3>
						<input type="button" value="Add Row" onclick="addRow('dataTable','divGroup')" />
						<input type="button" value="Delete Row" onclick="deleteRow('dataTable')" />
				    	<div id="form-content">
							<s:if test="schoolSubjectsDTO.subjectName.length != 0">
								<s:iterator value="schoolSubjectsDTO.subjectName"  var="element">
									<fieldset>
							            <div class="fieldgroup" style="width: 400px;">
							            	<label>Subject Name</label>
							                <s:textfield name="schoolSubjectsDTO.subjectName" theme="simple" id="defaultText" onkeyup="upperCaseThetextById(this)" value="%{#element}" />
							                <s:checkbox name="checkBox" theme="simple" />
							            </div>
						            </fieldset>
					            </s:iterator>
					        </s:if>
					        <s:else>
					        	<fieldset id="divGroup">
							            <div class="fieldgroupForCheckBox" id="dataTable0">
							            	<label>Subject Name</label>
							                <s:textfield name="schoolSubjectsDTO.subjectName" id="defaultText" onkeyup="upperCaseThetextById(this)" value="" />
											<s:checkbox name="checkBox" />
							            </div>
						            </fieldset>
							</s:else>
							<fieldset>
								<div>
				                	<s:submit value="Add Subjects"/>
				            	</div>				           	
				        	</fieldset>
			            </div>
		            </s:form>
	            </div>
            </div>
		</s:if>
	</body>
</html>
