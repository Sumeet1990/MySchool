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
	    			<h3>Other Fee</h3>
				    <div id="form-content">
						<h4>Collection</h4>
						<br/>
						<fieldset>
							<div class="fieldgroup">
								<label>Other Fee For</label>
				            	<s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				            <div class="fieldgroup">    
				                <label>Amount Payable</label>
				            </div>
				        </fieldset>
				        <fieldset>
				        	<div class="fieldgroup">
				            	<label>Student Role Number</label>
				               	<input type="text" name="staffGivenName"/>&nbsp;
				            </div>
				            <div class="fieldgroup">
				            	<label>Class</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				            <div class="fieldgroup">
				            	<label>Section</label>
				                <s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				             <div class="fieldgroup">
				            	<label>Student Full Name</label>
				            </div>
				            <div class="fieldgroup">    
				                <label>Amount Payed</label>
				            </div>
				        </fieldset>				           	
				    </div>
				</form>
			</div>
		</div>
	</body>
</html>