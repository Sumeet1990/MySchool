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
				<form action="" method="post" id="elements-form">
	    			<h3>Create Driver</h3>
				    <div id="form-content">
						<h4>Vehicle Details</h4>
						<br/>
							<fieldset>
				            <div class="fieldgroup">
				            	<label>Make</label>
				                <input type="text" name="staffGivenName"/>&nbsp;
				            </div>    
				
				            <div class="fieldgroup">
				            	<label>Model</label>
				                <input type="text" name="staffGivenName"/>&nbsp;
				            </div>
				
				            <div class="fieldgroup">
				            	<label>Color</label>
				                <input type="text" name="staffGivenName"/>&nbsp;
				            </div>
							
							<div class="fieldgroup">
				            	<label>Registration Number</label>
				                <input type="text" name="staffGivenName"/>&nbsp;
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Pollution Check Due Date</label>
				                <input type="text" name="staffDOB"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Insurance Expire Date</label>
				                <input type="text" name="staffDOB"/>
				            </div>
							
							<div class="fieldgroup">
				               	<label>Vehicle Condition</label>
				               	<s:select required="true" list="classesMap" name="className"  theme="simple" tabindex="1"></s:select>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Vehicle Status</label>
				               	<s:select required="true" list="classesMap" name="className"  theme="simple" tabindex="1"></s:select>
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