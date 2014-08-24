<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jQuery1.9.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/add_removerow.js"></script>

</head>
<BODY>
<s:property value="schoolSubjectsDTO.currentOperationStatus"/>

	<s:if test="schoolSubjectsDTO.currentOperationStatus=='subjectCreateFail' || schoolSubjectsDTO.currentOperationStatus=='subjectModifyFail'">
		<s:property value="schoolSubjectsDTO.existsSubjectList" />
		<s:property value="errorMessage" />
	</s:if>
	<s:if test="%{schoolSubjectsDTO.currentOperationStatus == 'subjectCreate' || schoolSubjectsDTO.currentOperationStatus == 'subjectModify'}">
	<s:form action="schoolSubjectModifyAction" onsubmit="return keepSubjectsToModify('dataTableModfiy','submitButton')">
		<s:property value="errorMessage" />
		<table id="dataTableModfiy">
			<s:iterator value="schoolSubjectsDTO.subjectName" var="element">
				<tr>
					<td><s:label value="Subject Name" theme="simple"></s:label></td>
					<td><s:textfield disabled="true"  name="schoolSubjectsDTO.subjectName" onkeyup="upperCaseThetextById(this)" value="%{#element}" theme="simple" /></td>
					<s:if test="schoolSubjectsDTO.currentOperationStatus != 'subjectModify'">
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
	<s:if
		test="%{schoolSubjectsDTO==null || schoolSubjectsDTO.currentOperationStatus=='subjectCreateFail' || schoolSubjectsDTO.currentOperationStatus=='subjectModifyFail'}">
		<s:form method="post" action="schoolSubjectCreateAction"
			theme="simple">
			<INPUT type="button" value="Add Row" onclick="addRow('dataTable')" />
			<INPUT type="button" value="Delete Row"
				onclick="deleteRow('dataTable')" />
			<table id="dataTable" border="1">
				<s:if test="schoolSubjectsDTO.subjectName.length != 0">
					<s:iterator value="schoolSubjectsDTO.subjectName" var="element">
						<tr>
							<td><s:label value="Subject Name" theme="simple"></s:label>
							</td>
							<td><s:textfield name="schoolSubjectsDTO.subjectName" theme="simple"
								id="defaultText" onkeyup="upperCaseThetextById(this)" value="%{#element}" /></td>
							<td><s:checkbox name="checkBox" /></td>
						</tr>
					</s:iterator>
				</s:if>
				<s:else>

					<tr>
						<td><s:label value="Subject Name: " /></td>
						<td><s:textfield name="schoolSubjectsDTO.subjectName"
								id="defaultText" onkeyup="upperCaseThetextById(this)" value="" /></td>
						<td><s:checkbox name="checkBox" /></td>
					</tr>
				</s:else>
			</table>
			<s:submit value="Add Subjects" />
		</s:form>
	</s:if>
</BODY>
</html>
