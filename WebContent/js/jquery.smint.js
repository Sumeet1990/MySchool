
function goToHeight(thisObj){
	switch(thisObj.id)
	{
	case 'sTop':
		$('.sTop').show();
		$('.s1').hide();
		$('.s2').hide();
		$('.s3').hide();
		$('.s4').hide();
		$('.s5').hide();
		$('.s6').hide();
		$('.s7').hide();
		break;
	case 's1':
		$('.sTop').hide();
		$('.s1').show();
		$('.s2').hide();
		$('.s3').hide();
		$('.s4').hide();
		$('.s5').hide();
		$('.s6').hide();
		$('.s7').hide();
		break;
	case 's2':
		$('.sTop').hide();
		$('.s1').hide();
		$('.s2').show();
		$('.s3').hide();
		$('.s4').hide();
		$('.s5').hide();
		$('.s6').hide();
		$('.s7').hide();
		break;
	case 's3':
		$('.sTop').hide();
		$('.s1').hide();
		$('.s2').hide();
		$('.s3').show();
		$('.s4').hide();
		$('.s5').hide();
		$('.s6').hide();
		$('.s7').hide();
		break;
	case 's4':
		$('.sTop').hide();
		$('.s1').hide();
		$('.s2').hide();
		$('.s3').hide();
		$('.s4').show();
		$('.s5').hide();
		$('.s6').hide();
		$('.s7').hide();
		break;
	case 's5':
		$('.sTop').hide();
		$('.s1').hide();
		$('.s2').hide();
		$('.s3').hide();
		$('.s4').hide();
		$('.s5').show();
		$('.s6').hide();
		$('.s7').hide();
		break;
	case 's6':
		$('.sTop').hide();
		$('.s1').hide();
		$('.s2').hide();
		$('.s3').hide();
		$('.s4').hide();
		$('.s5').hide();
		$('.s6').show();
		$('.s7').hide();
		break;
	case 's7':
		$('.sTop').hide();
		$('.s1').hide();
		$('.s2').hide();
		$('.s3').hide();
		$('.s4').hide();
		$('.s5').hide();
		$('.s6').hide();
		$('.s7').show();
		break;
	}

}