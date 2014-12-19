function startTime() {
	var today = new Date();

	var curr_year = today.toDateString();
	var h = today.getHours();
	var m = today.getMinutes();
	var s = today.getSeconds();
	// add a zero in front of numbers<10
	m = checkTime(m);
	s = checkTime(s);
	document.getElementById('timeDisplay').innerHTML = curr_year + "  " + "   "
			+ h + ":" + m + ":" + s;
	t = setTimeout(function() {
		startTime();
	}, 500);
}

function checkTime(i) {
	if (i < 10) {
		i = "0" + i;
	}
	return i;
}

function showToolTip(desc,righPosition) {
	document.getElementById("tooltipId").innerHTML= desc;
	document.getElementById("tooltipId").style.right=righPosition;
	document.getElementById("tooltipId").style.display="block";
}

function hideToolTip() {
	document.getElementById("tooltipId").style.display="none";
}

function showTransparentScreen() {
	document.getElementById("pleaseWaitScreen").style.display="block";
}

function hideTransparentScreen() {
	document.getElementById("pleaseWaitScreen").style.display="none";
}

function upperCaseThetext(nameTextBx) {
	var value = $("[name='"+nameTextBx+"']").val();
	$("[name='"+nameTextBx+"']").val(value.toUpperCase());
}

function upperCaseThetextById(thisObj) {
	thisObj.value = thisObj.value.toUpperCase();
}

function onlyNumbers(evt) {
    var e = (window.event) ? event : evt; // for cross browser compatibility
    var charCode = e.which || e.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57)){
        return false;
    }
    return true;
}