<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head></head>
	<body>
		
		<s:url action="MasterMenuAction.action" var="mastermenuaction"/>
		<s:url action="TeachingStaffAddAction.action" var="teachingstaffaddaction"/>
		<s:url action="TeachingStaffEditAction.action" var="teachingstaffeditaction"/>
		<s:url action="TeachingStaffViewAction.action" var="teachingstaffviewaction"/>
		
		<s:set name="role" value="roleName"/>		
		
		<table>
			<tr>
				<td width="40%">
					<div id='flyout_menu'>
						<ul>
							<li><s:a id="imageTag" href='%{mastermenuaction}'><span>Master Menu</span></s:a></li>
							
							<li><span>Student</span></li>
								<li><s:a id="imageTag" href='#'><span>Student</span></s:a>
	      							<ul>
	         							<li><s:a href=''><span>Add</span></s:a></li>
	         							<li><s:a href=''><span>Edit</span></s:a></li>
	         							<li><s:a href=''><span>Remove</span></s:a></li>
	         							<li><s:a href=''><span>Migrate</span></s:a></li>
	         							<li><s:a href=''><span>View</span></s:a></li>
	      							</ul>
	   							</li>
	   							<li><s:a id="imageTag" href='#'><span>Report</span></s:a>
	      							<ul>
	         							<li><s:a href=''><span>Create</span></s:a></li>
	         							<li><s:a href=''><span>Generate</span></s:a></li>
	         							<li><s:a href=''><span>View</span></s:a></li>
	      							</ul>
	   							</li>
   							
   							<li><span>Staff</span></li>
   								<s:if test="%{#role=='MANAGEMENT'}">
		   							<li><s:a id="imageTag" href='#'><span>Users</span></s:a>
		      							<ul>
		         							<li><s:a href=''><span>Add</span></s:a></li>
		         							<li><s:a href=''><span>Edit</span></s:a></li>
		         							<li><s:a href=''><span>Remove</span></s:a></li>
		         							<li><s:a href=''><span>View</span></s:a></li>
		      							</ul>
		   							</li>  							
   								</s:if>
   								
	   							<li><s:a id="imageTag" href='#'><span>Teaching Staff</span></s:a>
	      							<ul>
	         							<li><s:a href='%{teachingstaffaddaction}'><span>Add</span></s:a></li>
	         							<li><s:a href='%{teachingstaffeditaction}'><span>Edit</span></s:a></li>
	         							<li><s:a href=''><span>Remove</span></s:a></li>
	         							<li><s:a href='%{teachingstaffviewaction}'><span>View</span></s:a></li>
	      							</ul>
	   							</li>
								
   							<li><span>Other</span></li>
	   							<li><s:a id="imageTag" href='#'><span>Trigger Mail</span></s:a>
	      							<ul>
	         							<li><s:a href=''><span>Mail Alert</span></s:a></li>         							
	         							<li><s:a href=''><span>Mail report</span></s:a></li>
	      							</ul>
	   							</li>							
	   						
	   						<s:if test="%{#role=='MANAGEMENT'}">	   							
		   						<li><span>Financial</span></li>
		   							<li><s:a id="imageTag" href='#'><span>Tuition Fee Payment</span></s:a>
		      							<ul>
		         							<li><s:a href=''><span>Receive</span></s:a></li>         							
		         							<li><s:a href='on}'><span>View</span></s:a></li>
		      							</ul>
		   							</li>
		   							<li><s:a id="imageTag" href='#'><span>Other Fee Payment</span></s:a>
		      							<ul>
		         							<li><s:a href='}'><span>Receive</span></s:a></li>         							
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
							<s:property value="getText('school.para2')"/><br><br>
						</p>
					</div>
				</td>
			</tr>
		</table>
	</body>
</html>
