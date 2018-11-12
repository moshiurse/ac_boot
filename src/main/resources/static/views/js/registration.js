$(document).ready(function(){

    function validation (){

        var fullname = $.trim($('#regfullname').val());
        var email = $.trim($('#regemail').val());
        var username = $.trim($('#regusername').val());
        var password = $.trim($('#regpassword').val());
        var conpass = $.trim($('#regconpass').val());
        var passwordlength = password.length;
        var pattern = /^\b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b$/i;

        if(fullname == "") {
            $('#regfullname').addClass("invalid");
            $('#regfullname').removeClass("valid");
            $("#errormsg").text("Please input your Full Name!");
            return false;
        }else if(email == ""){
            $('#regemail').addClass("invalid");
            $('#regemail').removeClass("valid");
            $("#errormsg").text("Please input your Email !");
            return false;
        }else if(!pattern.test(email)){
            $('#regemail').addClass("invalid");
            $('#regemail').removeClass("valid");
            $("#errormsg").text("Invalid Email format");
            return false;
        }else if(password == ""){
            $('#regpassword').addClass("invalid");
            $('#regpassword').removeClass("valid");
            $("#errormsg").text("Please input Password !");
            return false;
        }else if(passwordlength <5){
            $('#regpassword').addClass("invalid");
            $('#regpassword').removeClass("valid");
            $('#errormsg').text("password should be at least 5 digit");
            return false;
        }else if(conpass !== password){
            $('#regconpass').addClass("valid");
            $('#regconpass').removeClass("invalid");
            $('#errormsg').text("confirm password should be matched with password");
            return false;
        }else
			alert("executed");
        	$('#errormsg').text("");
        	return true;

        }

	$('#registration').click(function(event){
		event.preventDefault();

		if(validation()){

			$.ajax({
				type: "POST",
				url: "user/save",
				data: JSON.stringify(data),
				contentType: "application/json; charset=utf-8",
				success: function () {
					alert("Registered Successfully");
                },
				error: function () {
                    alert("Registration Failed");
                }
			});

		}else {
			alert("Registered Failed!");
		}
		
	});


});