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
	    			<h3>Create Class Section</h3>
				    <div id="form-content">
				        <fieldset>
				            <div class="fieldgroup">
				                <label>Class Name</label>
				                <s:select required="true" list="classesMap" name="classSectionDTO.schoolClassId" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
						    <div class="fieldgroup"> 
				                <label>Section Name</label>
				                <input type="text" name="classSectionDTO.section"/>
				             </div>
				             <div class="fieldgroup">   
				                <label>Class Teacher Name</label>
				                <s:select required="true" list="classTeacherMap" name="classSectionDTO.staffId" autofocus="autofocus" theme="simple" tabindex="1"></s:select>
				            </div>
				            <div class="fieldgroup">
				                <label>Maximum Section Strength</label>
				                <input type="text" name="classSectionDTO.sectionMaximumStrength"/>
				            </div>
				            <div class="fieldgroup">
				                <label>Section Status</label>
				                <s:select required="true" list="staffStatusBean" name="classSectionDTO.sectionStatus"  theme="simple" tabindex="1"></s:select>
				            </div>
						</fieldset>
				        <fieldset>
							<div class="fieldgroup">
				                <s:submit value="Create" action="classSectionCreateAction"/>
				            </div>				           	
				        </fieldset>
				    </div>
				</s:form>
			</div>
		</div>
	</body>
</html>