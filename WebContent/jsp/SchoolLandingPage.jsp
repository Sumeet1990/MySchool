<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
</head>
<body>
<s:url action="SchoolClassCreateAction.action" var="classcreateaction">
</s:url>
<s:url action="SchoolClassViewAction.action" var="classviewaction">
</s:url>
<s:url action="SchoolClassModifyAction.action" var="classmodifyaction">
</s:url>
<div id='flyout_menu'>
<ul >
   <li ><s:a id="imageTag" href='#'><span>Class</span></s:a>
    <ul id="subTag">
         <li><s:a href='%{classcreateaction}'><span>Create</span></s:a>
           
         </li>
         <li><s:a href='%{classmodifyaction}'><span>Modify</span></s:a>
           
         </li>
         <li><s:a href='%{classviewaction}'><span>View</span></s:a>
           
         </li>
      </ul>
      </li>
   <li><s:a id="imageTag" href='#'><span>Teaching Staff</span></s:a>
      <ul>
         <li><s:a href='#'><span>Create</span></s:a>
           
         </li>
         <li><s:a href='#'><span>Modify</span></s:a>
           
         </li>
         <li><s:a href='#'><span>View</span></s:a>
           
         </li>
      </ul>
   </li>
   <li><s:a id="imageTag" href='#'><span>Student</span></s:a>
    <ul >
         <li><s:a href='#'><span>Create</span></s:a>
           
         </li>
         <li><s:a href='#'><span>Modify</span></s:a>
           
         </li>
         <li><s:a href='#'><span>View</span></s:a>
           
         </li>
      </ul>
      </li>
    <li><s:a  id="imageTag" href='#'><span>Subjects</span></s:a>
     <ul >
         <li><s:a href='#'><span>Create</span></s:a>
           
         </li>
         <li><s:a href='#'><span>Modify</span></s:a>
           
         </li>
         <li><s:a href='#'><span>View</span></s:a>
           
         </li>
      </ul>
      </li>
    <li ><s:a id="imageTag" href='#'><span>Tution Fee</span></s:a>
     <ul >
         <li><s:a href='#'><span>Create Fee Structure</span></s:a>
           
         </li>
         <li><s:a href='#'><span>Collect Fee</span></s:a>
           
         </li>
         <li><s:a href='#'><span>Balance View</span></s:a>
           
         </li>
      </ul>
      </li>
   <li><s:a id="imageTag" href='#'><span>Report</span></s:a>
    <ul >
         <li><s:a href='#'><span>Create</span></s:a>
           
         </li>
         <li><s:a href='#'><span>Generate</span></s:a>
           
         </li>
         <li><s:a href='#'><span>View</span></s:a>
           
         </li>
      </ul>
      </li>
</ul>
</div>
</body>
</html>
