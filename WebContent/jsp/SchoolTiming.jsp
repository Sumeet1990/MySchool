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
	    			<h3>School Timing</h3>
				    <div id="form-content">
						<fieldset>
							<br/>
							<div class="fieldgroup">
				                <label>Class Name</label>
				            	<%-- <s:select required="true" list="classesMap" name="staffAppType" theme="simple" tabindex="1"></s:select> --%>
				           </div>
				            <div class="fieldgroup">
				                <label>Academic Start date</label>
				                <input type="text" name=""/>
				           </div>
				            
				           <div class="fieldgroup">
				                <label>Academic End date</label>
				                <input type="text" name=""/>
				           </div>
				           
				           <div class="fieldgroup">
				                <label>School Start Time</label>
				                <input type="text" name=""/>
				           </div>
				            
				           <div class="fieldgroup">
				                <label>School Offset Time</label>
				                <input type="text" name=""/>
				           </div>
				            
				           <div class="fieldgroup">
				                <label>Offset Time Measure</label>
				                <input type="text" name=""/>
				           </div>
				            
				           <div class="fieldgroup">
				                <label>School End Time</label>
				                <input type="text" name=""/>
				            </div>
							<div class="fieldgroup">
				                <label>School Timing Duration From</label>
				                <input type="text" name=""/>
				            </div>
				            
				           <div class="fieldgroup">
				                <label>School Timing Duration Till</label>
				                <input type="text" name=""/>
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