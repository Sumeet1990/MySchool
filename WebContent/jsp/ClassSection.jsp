<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title></title>
		
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/formElementsStyle.css" type="text/css">
	
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/jQuery1.9.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/js/schoolCommon.js"></script>

		<script type="text/javascript">
			$(document).ready(function(){
			  $("input,textarea").focus(function () {
			         $(this).next("span").show("slow").css("display,inline");
			    });
			  $("input,textarea").focusout(function () {
			         $(this).next("span").hide("slow");
			    });
			});
		 </script>
	</head>	
	<body style="background-color:#555">
		<s:form action="" method="POST">
			<table border="0" id="form_table">
				<caption>Create Section</caption>
			  	<tr>
			    	<th width="25%">Class Name :</th>
			    	<td>
			    		<s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				   	  	<span>Select Class to create section</span>
			   	 	</td>
				</tr>
			  	<tr>
			    	<th width="25%">Section Name :</th>
			    	<td>
			    		<s:textfield required="true" name="section" onkeyup="upperCaseThetext('section')" tabindex="2"></s:textfield>
						<span>Section Name</span>
			   	 	</td>
				</tr>
				<tr>
			    	<th width="25%">Class Teacher Name :</th>
			    	<td>
			    		<s:select list="classTeacherMap" name="classTeacher" tabindex="3"></s:select>
						<span>Map class teacher to section</span>
			   	 	</td>
				</tr>
				<tr>
			    	<th width="25%">Maximum Section Strength :</th>
			    	<td>
			    		<s:textfield name="mxSectionStrength" required="true" tabindex="4"></s:textfield>
						<span>Enter max section strength</span>
			   	 	</td>
				</tr>	
				<tr>
			    	<th width="25%">Section Status :</th>
			    	<td>
			    		
			   	 	</td>
				</tr>		
			  	<tr>
			    	<th> </th>
			    	<td>
			    		<input type="submit" name="submit" value="Submit Form">
			    		<input type="reset" name="reset">
			    	</td>
			  	</tr>
			</table>
		</s:form>
	</body>
</html>