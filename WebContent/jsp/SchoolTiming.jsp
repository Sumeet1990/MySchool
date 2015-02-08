<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/pageElements.css">
	
		<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/script.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.validate.min.js"></script>
		<style>
			* { margin: 0; padding: 0; } 
			 body {background: #eee;  font-family: Arial;  font-size: 16px;} 
			 a { text-decoration: none;  }  
		</style>
	</head>
	
	<body>
		<div class="form-style-10">
			<s:form action="" method="post" id="elements-form">
				<div class="section"><span></span>School Timing</div>
               	<br/><span class="required">* </span>are Mandatory fields<br/>
               	<br/>
				<s:textfield name="" label="Class Name"/>
                
                <s:textfield name="" label="Academic Start date"/>
            
                <s:textfield name="" label="Academic End date"/>
           
                <s:textfield name="" label="School Start Time"/>
            
                <s:textfield name="" label="Class Name"/>
            
                <s:textfield name="" label="School Offset Time"/>
            
                <s:textfield name="" label="School End Time"/>
              
                <s:textfield name="" label="School Timing Duration From"/>
            
                <s:textfield name="" label="School Timing Duration Till"/>
              	
              	<div class="button-section">
                	<s:submit value="Sumbit"/>
				</div>
			</s:form>
		</div>
	</body>
</html>