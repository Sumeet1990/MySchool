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
			body {background: #eee; /* font-family: Arial; */ font-size: 16px;}
			a { text-decoration: none;  }
		</style>
	</head>
	
	<body>
		<div id="page-wrap">
			<div id="content">
				<s:form action="" method="post" id="elements-form">
	    			<h3>Add User</h3>
				    <div id="form-content">
				    	<fieldset>
				    		<div class="fieldgroup">
				            	<label>User Role</label>
				               	<s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				    	</fieldset>
				    	<fieldset>
				    		<div class="fieldgroup">
				                <label>User Name</label>
				                <input type="text" name=""/>
				            </div>
				            <div class="fieldgroup">
				                <label>Password</label>
				                <input type="password" name=""/>
				            </div>
				            <div class="fieldgroup">
				                <label>Confirm Password</label>
				                <input type="password" name=""/>
				            </div>
				             <div class="fieldgroup">
				                <label>text Question</label>
				                <input type="password" name=""/>
				            </div>
				            <div class="fieldgroup">
				                <label>Security Answer</label>
				                <input type="text" name=""/>
				            </div>
				    	</fieldset>
						<fieldset>
							<br/>
							<h4>Personal Details</h4>
							<br/>
				            <div class="fieldgroup">
				            	<div class="fieldgroup">
				                	<label>Staff Id If User is A Staff</label>
				                	<input type="text" name=""/>
				            	</div>
				            
				            	<label>Title</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>

				                <label>Given Full Name</label>
				                <input type="text" name=""/>&nbsp;
				                
				                <label>Surname</label>
				                <input type="text" name=""/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Date Of Birth</label>
				                <input type="text" name=""/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Gender</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
							
							<div class="fieldgroup">
				                <label>Qualification</label>
				                <input type="text" name=""/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Designation</label>
				                <input type="text" name=""/>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>User Status</label>
				               	<s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Appointment Type</label>
				               <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Photo</label>
				            </div>
						</fieldset>
						<fieldset>
							<br/>
							<h4>Contact & Communication Details</h4>
				            <div class="fieldgroup">
				                <label>Address</label>
				                <!-- Add Text Area -->
				                 <s:textarea required="true" name="" 
				                 onkeyup="" theme="simple" tabindex="9"></s:textarea>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Town OR District</label>
				                <input type="text" name=""/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>District OR City</label>
				                <input type="text" name=""/>
				            </div>
				            <div class="fieldgroup">
				                <label>PIN</label>
				                <input type="text" name=""/>
				            </div>
				            <div class="fieldgroup">
				                <label>State</label>
				                <input type="text" name=""/>
				            </div>
				            <div class="fieldgroup">
				                <label>Country</label>
				                <input type="text" name=""/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Personal Contact Number</label>
				                <input type="text" name=""/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Personal Contact Number</label>
				                <input type="text" name=""/>
				            </div>
				            
				             <div class="fieldgroup">
				                <label>Email Id</label>
				                <input type="text" name=""/>
				            </div>
				        </fieldset>
				        <fieldset>
							<div class="fieldgroup">
				                <s:submit value="Sumbit" action=""/>
				            </div>				           	
				        </fieldset>
				    </div>
				</s:form>
			</div>
		</div>
	</body>
</html>