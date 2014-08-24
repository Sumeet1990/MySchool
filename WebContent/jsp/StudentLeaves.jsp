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
				<form action="" method="post" id="elements-form">
	    			<h3>Student Leaves</h3>
				    <div id="form-content">
						<fieldset>
							<br/>
				            <div class="fieldgroup">
				                <label>Student Roll Number</label>
				               <input type="text" name="maxLeaves"/>
				            </div>
							
							<div class="fieldgroup">
				                <label>Student Class</label>
				                <s:select required="true" list="classesMap" name="staffLeaveType" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Student Section</label>
				                <s:select required="true" list="classesMap" name="staffLeaveType" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Student Full Name</label>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Reason Of Leave Or Absent</label>
				               <s:select required="true" list="classesMap" name="staffLeaveType" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Leave Or Absent From Date</label>
				               <s:select required="true" list="classesMap" name="staffLeaveType" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Leave Or Absent To Date</label>
				               <s:select required="true" list="classesMap" name="staffLeaveType" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               <label>Total No of Leave Or Absent Days</label>
				            </div>
						</fieldset>
				        <fieldset>
							<div class="fieldgroup">
				                <input type="submit" value="Submit" class="submit"/>
				            </div>				           	
				        </fieldset>
				    </div>
				</form>
			</div>
		</div>
	</body>
</html>