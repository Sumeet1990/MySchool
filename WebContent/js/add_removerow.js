function addRow(tableID) {

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
}
function deleteRow(tableID) {
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
}

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