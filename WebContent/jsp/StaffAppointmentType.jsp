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
		<s:if test="staffAppointmentTypeDTO.currentOperationStatus=='staffAppointmentTypeCreateFail' || staffAppointmentTypeDTO.currentOperationStatus=='staffAppointmentTypeModifyFail'">
			<s:property value="staffAppointmentTypeDTO.existsAppointmentTypeList" />
			<s:property value="errorMessage" />
		</s:if>
		
		<s:if test="%{staffAppointmentTypeDTO.currentOperationStatus == 'staffAppointmentTypeCreateSuccess' || staffAppointmentTypeDTO.currentOperationStatus == 'staffAppointmentTypeModify'}">
			<div id="page-wrap">
				<div id="content">
					<s:form action="" onsubmit="" method="post" theme="simple" id="elements-form">
						<h3>Appointment</h3>
						<s:property value="errorMessage" />
							<s:iterator value="staffAppointmentTypeDTO.subjectName" var="element">
								<fieldset id="divGroup">
									<div class="fieldgroup" style="width: 400px;">
										<label>Appointment Type</label>
										<s:textfield disabled="true"  name="staffAppointmentTypeDTO.appointmentType" onkeyup="upperCaseThetextById(this)" value="%{#element}" theme="simple" />
										<s:if test="staffAppointmentTypeDTO.currentOperationStatus == 'staffAppointmentTypeCreateSuccess'">
											 <s:checkbox name="checkBox" theme="simple" />
											 <s:hidden name="staffAppointmentTypeDTO.appointmentTypeCodes" value="%{staffAppointmentTypeDTO.appointmentTypeNameCodes.get(#element)}"/>
										</s:if>
									</div>
								</fieldset>
							</s:iterator>
							<s:if test="staffAppointmentTypeDTO.currentOperationStatus != 'staffAppointmentTypeModify'">
								<s:submit value="Modify" id="submitButton" action="staffAppointmentModifyAction" theme="simple" />
							</s:if>
					</s:form>
				</div>
            </div>
		</s:if>
		<s:if test="%{staffAppointmentTypeDTO.currentOperationStatus=='staffAppointmentTypeCreate' 
			|| staffAppointmentTypeDTO.currentOperationStatus=='staffAppointmentTypeCreateFail' 
				|| staffAppointmentTypeDTO.currentOperationStatus=='staffAppointmentTypeModifyFail'}">
			<div id="page-wrap">
				<div id="content">
					<s:form action="" method="post" theme="simple" id="elements-form">
						<h3>Appointment</h3>
						<input type="button" value="Add Row" onclick="addRow('dataTable','divGroup')"/>
						<input type="button" value="Delete Row" onclick="deleteRow('dataTable')"/>
				    	<div id="form-content">
							<s:if test="staffAppointmentTypeDTO.appointmentType.length != 0">
								<s:iterator value="staffAppointmentTypeDTO.appointmentType"  var="element">
									<fieldset id="divGroup">
							            <div class="fieldgroup" style="width: 400px;">
							            	<label>Appointment Type</label>
							                <s:textfield name="staffAppointmentTypeDTO.appointmentType" theme="simple" id="defaultText" onkeyup="upperCaseThetextById(this)" value="%{#element}"/>
							                <s:checkbox name="checkBox" theme="simple"/>
							            </div>
						            </fieldset>
					            </s:iterator>
					        </s:if>
					        <s:else>
					        	<fieldset id="divGroup">
						            <div class="fieldgroupForCheckBox" id="dataTable0">
						            	<label>Appointment Type</label>
						                <s:textfield name="staffAppointmentTypeDTO.appointmentType" id="defaultText" onkeyup="upperCaseThetextById(this)" value=""/>
										<s:checkbox name="checkBox" />
						            </div>
					            </fieldset>
							</s:else>
							<fieldset>
								<div>
				                	<s:submit value="Create Appointment" action="staffAppointmentCreateAction"/>
				            	</div>				           	
				        	</fieldset>
			            </div>
		            </s:form>
	            </div>
            </div>
		</s:if>
	</body>
</html>
