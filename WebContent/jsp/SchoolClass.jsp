<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

function moveTo(object,selectBoxName) {
	
	if(selectBoxName == 'subjectListName')
		{
		var selectBox = document.getElementsByName(selectBoxName);
		selectBox[0].removeChild(object);
		}else
			{
			var selectBox = document.getElementsByName('selectedSubjectLstName');
			selectBox[0].appendChild(object);
			}
	
}


</script>
</head>
<body>
	<s:form theme="simple">
		<s:textfield name="schoolClassName"></s:textfield>
		<s:textfield name="minimumStudAge"></s:textfield>
		<s:textfield name="maximumStudAge"></s:textfield>
		<s:textfield name="periodsPerDay"></s:textfield>
		<s:textfield name="durationOfPeriod"></s:textfield>
		<s:select multiple="multiple" size="10" list="subjectList"  name="subjectListName" onclick="moveTo(this,'subjectList')" theme="simple">
		</s:select>
		<s:select multiple="multiple" size="10" list="selectedSubjectLst" name="selectedSubjectLstName" onselect="moveTo(this,'selectedSubjectLstName')" theme="simple">
		</s:select>
		<br>

	</s:form>

</body>
</html>