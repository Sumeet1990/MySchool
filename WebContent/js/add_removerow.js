/*function addRow(tableID) {

	var table = document.getElementById(tableID);
	var rowCount = table.rows.length;
	var row = table.insertRow(rowCount);
	var colCount = table.rows[0].cells.length;

	for ( var i = 0; i < colCount; i++) {
		var newcell = row.insertCell(i);
		newcell.innerHTML = table.rows[0].cells[i].innerHTML;
		//alert(newcell.childNodes);
		switch (newcell.childNodes[0].type) {
		case "label":
			newcell.childNodes[0].value = table.rows[0].cell[0].value;
			break;
		case "text":
			newcell.childNodes[0].value = "";
			break;
		case "checkbox":
			newcell.childNodes[0].checked = false;
			break;
		}
	}
}*/

var noofSubjects=0;

function addRow(tableID,mainID) {
	  var count=0;
	  var newdiv = document.createElement('div');
	  var niold = document.getElementById(tableID+count);
	  var mainIDObj = document.getElementById(mainID);
	  var ni = niold;
		while (typeof(ni) != 'undefined' && ni != null) {
			try{
				niold = ni;
				count++;
				ni = document.getElementById(tableID+count);
				newdiv.setAttribute('id',tableID+count);
			}catch (e) {
				alert(e);
				}
			}
	  newdiv.setAttribute('class','fieldgroupForCheckBox');
	  newdiv.innerHTML = niold.innerHTML;
	  mainIDObj.appendChild(newdiv);
	  if(noofSubjects < count){
		  noofSubjects = count; 
	  }
}
function deleteRow(tableID) {
	 var count=0;
		var ni = document.getElementById(tableID+count);
		while ((typeof(ni) != 'undefined' && ni != null) || noofSubjects>=count) {
			try{
				if((typeof(ni) != 'undefined' && ni != null) && (ni.childNodes[5].checked)){
					if(count!=0){
						$("#"+tableID+count).remove();
					}else{
						alert("Can't delete default row");
					}
				}
				count++;
				ni = document.getElementById(tableID+count);
			}catch (e) {
				alert(e);
				}
			}
}
/*function deleteRow(tableID) {
	try {
		var table = document.getElementById(tableID);
		var rowCount = table.rows.length;
		var count = 0;
		for ( var i = 0; i < rowCount; i++) {
			var row = table.rows[i];
			var chkbox = row.cells[2].childNodes[0];
			if (null != chkbox && true == chkbox.checked) {
				count++;
				if (rowCount <= 1) {
					alert("Cannot delete all the rows.");
					break;
				}
				table.deleteRow(i);
				rowCount--;
				i--;
			}
		}
		if (count == 0) {
			alert("Please select the rows to be deleted !");
		}
	} catch (e) {
		alert(e);
	}
}*/

function keepSubjectsToModify(Id, buttonObj) {
	try {
		if(document.getElementById(buttonObj).value=="Update")
		{
		return true;
		}else
			{
		var table = document.getElementById(Id);
		var rowCount = table.rows.length;
		var count = 0;
		for ( var i = 0; i < rowCount; i++) {
			var row = table.rows[i];
			var chkbox = row.cells[2].childNodes[0];
			if (null != chkbox && true == chkbox.checked) {
				count++;
				row.cells[1].childNodes[0].removeAttribute("disabled");
				row.removeChild(row.cells[2]);
				document.getElementById(buttonObj).value = "Update";
			}else
				{
					table.deleteRow(i);
					rowCount--;
					i--;
				}
		}
		return false;
	} 
	}catch (e) {
		alert(e);
		return false;
	}
	
}