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
		<s:if test="%{schoolSubjectsDTO.currentOperationStatus == 'subjectCreate'}">
			<div id="page-wrap">
				<div id="content">
					<s:form action="schoolSubjectCreateAction" method="post" theme="simple" id="elements-form">
						<h3><s:property value="getText('subject.subjects')"/></h3>
						<br/>
						<s:if test="schoolSubjectsDTO.errorMessage != null" >
							<h3 style="color:red"><s:property value="schoolSubjectsDTO.errorMessage"/></h3>
						</s:if>
						
						<input type="button" value="Add Row" onclick="addRow('dataTable','divGroup')"/>
						<input type="button" value="Delete Row" onclick="deleteRow('dataTable')"/><br/><br/>
				    	<div id="form-content">
					    	<fieldset id="divGroup">
						    	<div class="fieldgroupForCheckBox" id="dataTable0">
						        	<label><s:property value="getText('subject.subjectName')"/></label>
						            <s:textfield name="schoolSubjectsDTO.schoolSubjectNames" id="defaultText" onkeyup="upperCaseThetextById(this)" value=""/>
									<s:checkbox name="checkBox"/>
						        </div>
					       	</fieldset>
							<fieldset>
								<br/>	
								<div>
				                	<s:submit value="Create Subjects"/>
				            	</div>				           	
				        	</fieldset>
			            </div>
		            </s:form>
	            </div>
            </div>
		</s:if>
		
		<s:if test="%{schoolSubjectsDTO.currentOperationStatus == 'subjectModify'}">
			<div id="page-wrap">
				<div id="content">
					<s:form action="schoolSubjectModifyAction" method="post" theme="simple" id="elements-form">
						<h3><s:property value="getText('subject.subjects')" /></h3>
						<br/>
						Click the check box and modify the subject
						<br/>
						<s:property value="errorMessage" />
							<s:iterator value="schoolSubjectsDTOList">
								<fieldset id="divGroup">
									<div class="fieldgroup" style="width:400px;">
										<label><s:property value="getText('subject.subjectName')"/></label>
										<s:textfield name="schoolSubjectsDTO.schoolSubjectNames" onkeyup="upperCaseThetextById(this)" value="%{subjectName}" theme="simple"/>
										<s:checkbox name="checkBox" theme="simple"/>
										<s:hidden name="schoolSubjectsDTO.schoolSubjectCodes" value="%{subjectCode"/>
									</div>
								</fieldset>
							</s:iterator>
							<s:submit value="Modify" id="submitButton" action="schoolSubjectModifyAction" theme="simple"/>
					</s:form>
				</div>
            </div>
		</s:if>
		
		<s:if test="%{schoolSubjectsDTO.currentOperationStatus == 'subjectDelete'}">
			<div id="page-wrap">
				<div id="content">
					<s:form action="schoolSubjectDeleteAction" method="post" theme="simple" id="elements-form">
						<h3><s:property value="getText('subject.subjects')" /></h3>
						Click the check box to delete the subject
						<br/>
						<s:property value="errorMessage" />
							<s:iterator value="schoolSubjectsDTO.existsSubjectList" var="element">
								<fieldset id="divGroup">
									<div class="fieldgroup" style="width:400px;">
										<label><s:property value="getText('subject.subjectName')"/></label>
										<s:textfield disabled="true" name="schoolSubjectsDTO.subjectName" onkeyup="upperCaseThetextById(this)" value="%{#element.subjectName}" theme="simple"/>
										<s:checkbox name="checkBox" theme="simple"/>
										<s:hidden name="schoolSubjectsDTO.subjectCodes" value="%{schoolSubjectsDTO.subjectNameCodes.get(#element)}"/>
									</div>
								</fieldset>
							</s:iterator>
							<s:submit value="Delete" id="submitButton" action="schoolSubjectDeleteAction" theme="simple"/>
					</s:form>
				</div>
            </div>
		</s:if>
		
		<s:if test="%{schoolSubjectsDTO.currentOperationStatus == 'subjectsView'}">
			<s:property value="getText('subjects.availableSubjects')"/>
			<s:iterator value="schoolSubjectsDTOList">
				<div id="form-content">
					<s:property value="subjectName"/> - <s:property value="subjectStatus"/>
				</div>
			</s:iterator>
		</s:if>
	</body>
</html>
