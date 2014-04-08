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
		<s:form action="a" method="POST">
			<table border="0" id="form_table">
				<caption>Student Registration</caption>
			  	<tr>
			    	<th width="25%">Class Name :</th>
			    	<td>
			    		<s:select required="true" list="classesMap" name="className" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
			   	 	</td>
				</tr>
			  	<tr>
			    	<th> </th>
			    	<td>
			    		<input type="submit" name="submit" value="Submit Form">
			    	</td>
			  	</tr>
			</table>
			<table border="0" id="form_table">
				<caption>General Information</caption>
			  	<tr>
			    	<th width="25%">Title :</th>
			    	<td>
			   	 	</td>
				</tr>
			  	<tr>
			    	<th width="25%">Given Full Name :</th>
			    	<td>
			    		<s:textfield required="true" name="studentGivenName" onkeyup="upperCaseThetext('studentGivenName')" tabindex="2"></s:textfield>
			   	 	</td>
				</tr>
				<tr>
			    	<th width="25%">Surname :</th>
			    	<td>
			    		<s:textfield name="studentSurname" onkeyup="upperCaseThetext('studentSurname')" tabindex="3"></s:textfield>
			   	 	</td>
				</tr>
				<tr>
		    		<th width="25%">Date Of Birth :</th>
		    		<td>
		     			<s:textfield required="true" theme="simple"  name="studentDOB" tabindex="5"/>
					</td>
		 	 	</tr>
		 	 	<tr>
			    	<th width="25%">Gender :</th>
			    	<td>
			   	 	</td>
				</tr>	
				<tr>
			    	<th width="25%">Father Full Name :</th>
			    	<td>
			    		<s:textfield name="fatherFullName" tabindex="6"></s:textfield>
			   	 	</td>
				</tr>	
				<tr>
			    	<th width="25%">Mother Full Name :</th>
			    	<td>
			    		<s:textfield name="motherFullName" required="true" tabindex="6"></s:textfield>
			   	 	</td>
				</tr>		
			  	<tr>
			    	<th width="25%">Guardian Full Name :</th>
			    	<td>
			    		<s:textfield name="guardianFullName" required="true" tabindex="6"></s:textfield>
			   	 	</td>
				</tr>
				<tr>
			    	<th width="25%">Class Section :</th>
			    	<td>
			    		<s:select list="classSectionsMap" name="sectionName" theme="simple" tabindex="7"></s:select>
			   	 	</td>
				</tr>
				<tr>
			    	<th width="25%">Class Teacher Name :</th>
			    	<td>			    		
			   	 	</td>
				</tr>
				<tr>
			    	<th width="25%">Student Status :</th>
			    	<td>			    		
			   	 	</td>
				</tr>	
			</table>
			<table border="0" id="form_table">
				<caption>Contact Information</caption>
			  	<tr>
			    	<th width="25%">C/O :</th>
			    	<td>
			    		<s:textfield required="true" name="studentCareOff" onkeyup="upperCaseThetext('studentCareOff')" tabindex="8"></s:textfield>
			   	 	</td>
				</tr>
			  	<tr>
			    	<th width="25%">Address :</th>
			    	<td>
			    		<s:textarea required="true" name="studentAddress" onkeyup="upperCaseThetext('studentAddress')" tabindex="9"></s:textarea>
			   	 	</td>
				</tr>
				<tr>
			    	<th width="25%">Town/District :</th>
			    	<td>
			    		<s:textarea required="true" name="StudentTownOrDistrict" onkeyup="upperCaseThetext('StudentTownOrDistrict')" tabindex="10"></s:textarea>
			   	 	</td>
				</tr>
				<tr>
			    	<th width="25%">District/City :</th>
			    	<td>
			    		<s:textarea required="true" name="StudentTownOrDistrict" onkeyup="upperCaseThetext('StudentTownOrDistrict')" tabindex="2"></s:textarea>
			   	 	</td>
				</tr>
		 	 	<tr>
			    	<th width="25%">State :</th>
			    	<td>
			   	 	</td>
				</tr>
				
				<tr>
			    	<th width="25%">PIN :</th>
			    	<td>
			    		<s:textfield name="postalCode" required="true" tabindex=""></s:textfield>
			   	 	</td>
				</tr>		
			  	<tr>
			    	<th width="25%">Country</th>
			    	<td>
			   	 	</td>
				</tr>
				<tr>
					<th>
					</th>
		    		<td>
		    			<s:submit value="Submit"></s:submit>
		     			<s:reset name="reset"></s:reset>
					</td>
		 	 	</tr>
			</table>
		</s:form>
	</body>
</html>