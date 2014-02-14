<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


<link href="${pageContext.request.contextPath}/css/bootstrap.css"
	rel="stylesheet" type="text/css" media="all">

	<script>
var optionObjeHiddenSubject = new Array();	
var optionObjeHiddenSelectet = new Array();	

function handleChange(valueObj, selectBox){
	
	 var optionSelected;
	 if(selectBox == 'subjectListId')
		{
	    optionSelected = $('#subjectListId').find("option:selected");
	    var selectedOption = '<option value="'+optionSelected.val()+'">'+optionSelected.val()+'</option>';
	    optionSelected.remove();
		document.getElementById('selectedSubjectListId').innerHTML = document.getElementById('selectedSubjectListId').innerHTML+selectedOption;
		}
	else
		{
	    optionSelected = $('#selectedSubjectListId').find("option:selected");
	    var selectedOption = '<option value="'+optionSelected.val()+'">'+optionSelected.val()+'</option>';
	    optionSelected.remove();
		document.getElementById('subjectListId').innerHTML = document.getElementById('subjectListId').innerHTML+selectedOption;
		}
	 var sb = $('#'+selectBox);

		sb.append(sb.find('option').sort(function(a, b){
		    return (
		        a = $(a).text(),
		        b = $(b).text(),
		        a == 'NA' ? 1 : b == 'NA' ? -1 : 0|a > b
		    );
		}));
	
}

function updateSetelctBox(inputObject, selectBox)
{
	if(selectBox == 'subjectListId')
		{
		var count = 0;
		var total = 0;
		$.each(optionObjeHiddenSubject, function(index, value) {   
		     $("#"+selectBox)
		         .append($("<option></option>")
		         .attr("value",value)
		         .text(value)); 
		});
		optionObjeHiddenSubject = new Array();
		if($('#'+inputObject).val().trim() == '')
			{
				$(".info-container1").text('Showing all');
			}else
				{
					 $("#"+selectBox+" > option").each(function() {
						 total++;
						     if( $(this).val().indexOf($('#'+inputObject).val()) != -1)
						    	 {}
						     else{
						    	 optionObjeHiddenSubject[count] = $(this).val();
						    	 	$(this).remove();
						    	 	count++;
						    	 }
						    
						});
					 $(".info-container1").text('Showing '+(total-count)+' of '+total);
				}
		
		}
	else
		{
		var count = 0;
		var total = 0;
		$.each(optionObjeHiddenSelectet, function(index, value) {   
		     $("#"+selectBox)
		         .append($("<option></option>")
		         .attr("value",value)
		         .text(value)); 
		});
		optionObjeHiddenSelectet = new Array();
		if($('#'+inputObject).val().trim() == '')
			{
			$(".info-container2").text('Showing all');
			}else
				{
					 $("#"+selectBox+" > option").each(function() {
						 total++;
						     if( !($(this).val().indexOf($('#'+inputObject).val()) != -1))
						    	 {
						    	 	optionObjeHiddenSelectet[count] = $(this).val();
						    	 	$(this).remove();
						    	 	count++;
						    	 }
						    
						});
				$(".info-container2").text('Showing '+(total-count)+' of '+total);
				}
		
		}
	
	
	var sb = $('#'+selectBox);

	sb.append(sb.find('option').sort(function(a, b){
	    return (
	        a = $(a).text(),
	        b = $(b).text(),
	        a == 'NA' ? 1 : b == 'NA' ? -1 : 0|a > b
	    );
	}));
	}

</script>
</head>
<body>

	<!---->
	<div class="container" style="max-width: 920px; margin: 0 auto;">
		<div class="row">


			<div class="row">
				<div class="col-md-12">

					<s:form theme="simple">
						<s:textfield name="schoolClassName"></s:textfield>
						<s:textfield name="minimumStudAge"></s:textfield>
						<s:textfield name="maximumStudAge"></s:textfield>
						<s:textfield name="periodsPerDay"></s:textfield>
						<s:textfield name="durationOfPeriod"></s:textfield>
						
						
						<div id="dummyText" class="row bootstrap-duallistbox-container">
		<div class="col-md-6 box1">
			<span class="info-container1"><span class="info"> &nbsp;</span>
				</span>
					<input  id="subjectLstInput"  onkeyup="updateSetelctBox('subjectLstInput','subjectListId')"
				placeholder="Filter" class="filter form-control" type="text">
			<div class="btn-group buttons">
			</div>
			<s:select theme="simple" multiple="multiple"  id="subjectListId" onchange="handleChange(this,'subjectListId')" cssClass="form-control"
				size="10" list="subjectList" data-duallistbox_generated="true"></s:select>
		</div>
		<div class="col-md-6 box2">
			<span class="info-container2"><span class="info">&nbsp;</span>
				</span>
					<input id="selectedLstInput" onkeyup="updateSetelctBox('selectedLstInput','selectedSubjectListId')"
				placeholder="Filter" class="filter form-control" type="text">
			<div class="btn-group buttons">
			</div>
			<s:select  id="selectedSubjectListId" onchange="handleChange(this,'selectedSubjectListId')" theme="simple" multiple="multiple" cssClass="form-control"
				size="10" list="selectedSubjectLst"
				data-duallistbox_generated="true"></s:select>
		</div>
	</div>
						
						<br>

					</s:form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>


