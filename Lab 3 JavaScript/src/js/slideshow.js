
	var imageArray = ["../assets/cat1.jpg", "../assets/cat2.jpg", "../assets/cat3.jpg", "../assets/cat4.jpg", "../assets/cat5.jpg" ];
	var index = 0;
	
function previous() {
		if(index == 0) {
				index = imageArray.length - 1;
		}
		else {
				index--;
		}
		document.getElementById("image").src = imageArray[index];
}	

function next() {
		if(index == imageArray.length - 1) {
				index = 0;
		}
		else {
				index++;
		}
		document.getElementById("image").src = imageArray[index];
}	

	/* var img = document.getElementById("test");
	alert (img);
	 for (i=0; i<imageArray.length; i++) {
		if (img == imageArray[i]) {
			img.innerHTML = imageArray[i-1];
		}
		
	} 
	if(img == '../assets/cat1.jpg') {
		alert ("Hi");
	} */


