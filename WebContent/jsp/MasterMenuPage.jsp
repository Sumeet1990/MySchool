<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head></head>
	<body>

		<s:url action="ClassSectionCreateAction.action" var="classsectioncreateaction"/>
		<s:url action="ClassSectionModifyAction.action" var="sectionmodifyaction"/>
		<s:url action="ClassSectionViewAction.action" var="sectionviewaction"/>		
		
		<s:set name="role" value="roleName"/>
		
		<table>
			<tr>
				<td width="40%">
					<div id='flyout_menu'>
						<ul>
							<li><span>Class</span></li>
			   					<li><s:a id="imageTag" href='#'><span>Class</span></s:a>
			    					<ul id="subTag">
			    						<li><s:a href=''><span>Create</span></s:a></li>
			         					<li><s:a href=''><span>Modify</span></s:a></li>
			         					<li><s:a href=''><span>Delete</span></s:a></li>
			         					<li><s:a href=''><span>View</span></s:a></li>			         					
			      					</ul>
			    				</li>
			    				<li><s:a id="imageTag" href='#'><span>Section</span></s:a>
			    					<ul id="subTag">
			         					<li><s:a href='%{classsectioncreateaction}'><span>Create</span></s:a></li>
			         					<li><s:a href='%{classsectionmodifyaction}'><span>Modify</span></s:a></li>
			         					<li><s:a href=''><span>Delete</span></s:a></li>
			         					<li><s:a href='%{classsectionviewaction}'><span>View</span></s:a></li>
			      					</ul>
			    				</li>
			    				<li><s:a id="imageTag" href='#'><span>Class Age Criteria</span></s:a>
			    					<ul id="subTag">
			         					<li><s:a href=''><span>Create</span></s:a></li>
			         					<li><s:a href=''><span>Modify</span></s:a></li>
			         					<li><s:a href=''><span>Delete</span></s:a></li>
			         					<li><s:a href=''><span>View</span></s:a></li>
			      					</ul>
			    				</li>
			   					<li><s:a id="imageTag" href='#'><span>Subject Codes</span></s:a>
			    					<ul id="subTag">
			         					<li><s:a href=''><span>Create</span></s:a></li>
			         					<li><s:a href=''><span>Modify</span></s:a></li>
			         					<li><s:a href=''><span>Delete</span></s:a></li>
			         					<li><s:a href=''><span>View</span></s:a></li>
			      					</ul>
			    				</li>
			   					<li><s:a id="imageTag" href='#'><span>Subjects</span></s:a>
			    					<ul id="subTag">
			         					<li><s:a href=''><span>Create</span></s:a></li>
			         					<li><s:a href=''><span>Modify</span></s:a></li>
			         					<li><s:a href=''><span>Delete</span></s:a></li>
			         					<li><s:a href=''><span>View</span></s:a></li>
			      					</ul>
			    				</li>
			   					<li><s:a id="imageTag" href='#'><span>Exams</span></s:a>
			    					<ul id="subTag">
			         					<li><s:a href=''><span>Create</span></s:a></li>
			         					<li><s:a href=''><span>Modify</span></s:a></li>
			         					<li><s:a href=''><span>Delete</span></s:a></li>
			         					<li><s:a href=''><span>View</span></s:a></li>
			      					</ul>
			    				</li>
		    				
		    				<li><span>Staff</span></li>	
		    					<s:if test="%{#role=='MANAGEMENT'}">
				   					<li><s:a id="imageTag" href='#'><span>User Role</span></s:a>
				    					<ul id="subTag">
				         					<li><s:a href=''><span>Create</span></s:a></li>
				         					<li><s:a href=''><span>Modify</span></s:a></li>
				         					<li><s:a href=''><span>Delete</span></s:a></li>
				         					<li><s:a href=''><span>View</span></s:a></li>
				      					</ul>
				    				</li>
			    				</s:if>
			    				    					
			    				<li><s:a id="imageTag" href='#'><span>Appointment Type</span></s:a>
			    					<ul id="subTag">
			         					<li><s:a href=''><span>Create</span></s:a></li>
			         					<li><s:a href=''><span>Modify</span></s:a></li>
			         					<li><s:a href=''><span>Delete</span></s:a></li>
			         					<li><s:a href=''><span>View</span></s:a></li>
			      					</ul>
			    				</li>
			    				
		    				<s:if test="%{#role=='MANAGEMENT'}">
			    				<li><span>Financial</span></li>
				   					<li><s:a id="imageTag" href='#'><span>Tuition Fee Structure</span></s:a>
				    					<ul id="subTag">
				         					<li><s:a href=''><span>Create</span></s:a></li>
				         					<li><s:a href=''><span>Modify</span></s:a></li>
				         					<li><s:a href=''><span>Delete</span></s:a></li>
				         					<li><s:a href=''><span>View</span></s:a></li>
				      					</ul>
				    				</li>
				    				<li><s:a id="imageTag" href='#'><span>Other Fee Structure</span></s:a>
				    					<ul id="subTag">
				         					<li><s:a href=''><span>Create</span></s:a></li>
				         					<li><s:a href=''><span>Modify</span></s:a></li>
				         					<li><s:a href=''><span>Delete</span></s:a></li>
				         					<li><s:a href=''><span>View</span></s:a></li>
				      					</ul>
				    				</li>
			    			</s:if>			
						</ul>
					</div>
				</td>
				<td width="60%">
					<div>
						<p style="color: brown;font-style: italic; font-weight: 900;">
							<s:property value="getText('school.para1')"/><br><br>
							<s:property value="getText('school.para3')"/><br><br>
						</p>
					</div>
				</td>
			</tr>
		</table>
	</body>
</html>
