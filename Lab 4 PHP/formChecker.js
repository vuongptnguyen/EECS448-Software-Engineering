


function validate() { 

    var email = document.getElementById("username").value;   
	var pass = document.getElementById("password").value;
	
	if (!emailCheck(email)) {
        console.log("Please enter valid e-mail address.");
		document.getElementById("email_warning").innerHTML= " <br> Enter a valid email.";
        return false;
    } 
	if (pass == "") {
		document.getElementById("pass_warning").innerHTML=" <br> Enter the password.";
		return false;
	}
	if(!shippingCheck()) {
		alert("A shipping method must be selected.");
		return false;
	}
	console.log("valid");
	return true;
}
				
function emailCheck(email) {
	var re = /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
    return re.test(email);		
}

function shippingCheck()
{
  if(document.getElementById("shipOption0").checked || document.getElementById("shipOption1").checked || document.getElementById("shipOption2").checked) {
		return true;
  } else {
		
		return false;
  }
} 


function reset()
{
  document.getElementById('item1').value = 0;
  document.getElementById('item2').value = 0;
  document.getElementById('item3').value = 0;
  return false;
}	