
	
function styleChange() {
	var r_border = document.getElementById("redBorder").value;
	var g_border = document.getElementById("greenBorder").value;
	var b_border = document.getElementById("blueBorder").value;
	
	var w_border = document.getElementById("widthBorder").value;
	var color_border = rgb(r_border, g_border, b_border);
	
	var r_background = document.getElementById("redBackground").value;
	var g_background = document.getElementById("greenBackground").value;
	var b_background = document.getElementById("blueBackground").value;
	
	var color_background = rgb(r_background, g_background, b_background);
	
	var p = document.getElementById("text");
	
	p.style.backgroundColor = 'rgb('+r_background+','+g_background+','+b_background+')';
	p.style.borderColor = 'rgb('+r_border+','+g_border+','+b_border+')';
	p.style.borderWidth = w_border + 'px';
}

