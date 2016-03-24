$(document).ready(function(){
        $("button").click(function(e){
            e.preventDefault();

        if($(this).html() == "Submit") {

                if($("#username-div").find("input").val() == "") {
                    $("#username-div").find("span").html("Enter user name:");
                $("#username-div").find("span").css("color","red");
            }
            else if ($("#password-div").find("input").val() != $("#password2-div").find("input").val() ) {
                    $("#password2-div").find("span").html("Password doesn't match");
                $("#password2-div").find("span").css("color","red");
            } else if( $("#password-div").find("input").val() == "" || $("#password2-div").find("input").val() == "") {
                    $("#password-div").find("span").html("Enter the password");
            }
            else {
                $("#container").find("p").html("Accepted");
            }

        }
    })

});
