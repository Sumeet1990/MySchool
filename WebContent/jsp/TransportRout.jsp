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
	    			<h3>Create Rout</h3>
				    <div id="form-content">
							<h4>Transport Rout Details</h4>
							<br/>
							<fieldset>
				            <div class="fieldgroup">
				            	<label>Rout Number</label>
				                <input type="text" name="staffGivenName"/>&nbsp;
							</div>          
							<div class="fieldgroup">
				            	<label>Rout Type</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
							</div>  
							<div class="fieldgroup">
				                <label>Vehicle Registration Number</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				            <div class="fieldgroup">
				                <label>Starting Point</label>
				                <input type="text" name="staffSurname"/>
				            </div>
							<div class="fieldgroup">
				                <label>Ending Point</label>
				                <input type="text" name="staffSurname"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Stops</label>
				                <input type="text" name="staffDOB"/>
				            </div>
				
				            <div class="fieldgroup">
				                <label>Total Stops</label>
				                <input type="text" name="staffDOB"/>
				            </div>
							
							<div class="fieldgroup">
				                <label>Starting Time</label>
				                <input type="text" name="staffQualification"/>
				            </div>
				           
				           	<div class="fieldgroup">
				                <label>Reaching Time</label>
				                 <input type="text" name="staffQualification"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Total Seats (Excluding Driver and Helper)</label>
				                <input type="text" name="staffDOB"/>
				            </div>
				            
				            <div class="fieldgroup">
				                <label>Seats Left (Excluding Driver and Helper)</label>
				                <input type="text" name="staffDOB"/>
				            </div>
				            
				            <div class="fieldgroup">
				               	<label>Rout Status</label>
				               	<s:select required="true" list="classesMap" name="className"  theme="simple" tabindex="1"></s:select>
				            </div>
				            
				          	<div class="fieldgroup">
				               	<label>Rout Inactive Reason</label>
				               	<s:select required="true" list="classesMap" name="className"  theme="simple" tabindex="1"></s:select>
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