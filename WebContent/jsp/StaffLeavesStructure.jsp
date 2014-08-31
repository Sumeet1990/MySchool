<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<title></title>
	
		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap_common.css">
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/formElementsStyle.css">
		
		<style>
			* { margin: 0; padding: 0; } 
			 body {background: #eee;  font-family: Arial;  font-size: 16px;} 
			 a { text-decoration: none;  }  
		</style>
	</head>
	
	<body>
		<div id="page-wrap">
			<div id="content">
				<s:form action="" method="post" id="elements-form">
	    			<h3>Staff Leaves Structure</h3>
				    <div id="form-content">
						<fieldset>
							<br/>
				            <div class="fieldgroup">
				                <label>Staff Appointment Type</label>
				                <s:select required="true" list="classesMap" name="staffAppType" theme="simple" tabindex="1"></s:select>
				            </div>
							
							<div class="fieldgroup">
				                <label>Leave Type</label>
				                <s:select required="true" list="classesMap" name="staffLeaveType" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Maximum Number of Leaves</label>
				                <input type="text" name="maxLeaves"/>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Maximum Number Of Consecutive Leaves Allowed</label>
				               <input type="text" name="concMaxLeaves"/>
				            </div>
						</fieldset>
				        <fieldset>
							<div class="fieldgroup">
				                <s:submit value="Sumbit"/>
				            </div>				           	
				        </fieldset>
				    </div>
				</s:form>
			</div>
		</div>
	</body>
</html>