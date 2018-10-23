$(document).ready(function(){
	
	var fullname = $.trim($('#regfullname').val());
	var email = $.trim($('#regemail').val());
	var username = $.trim($('#regusername').val());
	var password = $.trim($('#regpassword').val());
	var conpass = $.trim($('#regconpass').val());
	
	var passwordlength = password.length;

	
	function checkfullname(){

		if(fullname == ""){
			$('#regfullname').addClass("invalid");
			$('#regfullname').removeClass("valid");
			$('#erfullname').text("Full Name Must not empty");
			return false;
		}else {
			$('#regfullname').addClass("valid");
			$('#regfullname').removeClass("invalid");
            $("#eremail").text("");
			return true;
		}	
	}
	
	function checkemail(){
		var pattern = /^\b[A-Z0-9._%-]+@[A-Z0-9.-]+\.[A-Z]{2,4}\b$/i;
		if(email == ""){
			$('#regemail').addClass("invalid");
			$('#regemail').removeClass("valid");
            $('#eremail').text("Email Must not empty");
			return false;
		}else if(!pattern.test(email)){
            $('#regemail').addClass("invalid");
            $('#regemail').removeClass("valid");
			$("#eremail").text("Invalid Email format");
			return false;
		}else {
			$('#regemail').addClass("valid");
			$('#regemail').removeClass("invalid");
			$("#eremail").text("");
			return true;
		}
		
	}
	
	
	function checkusername(){
		
		if(username == ""){
			$('#regusername').addClass("invalid");
			$('#regusername').removeClass("valid");
            $("#erusername").text("Username Must Not empty");
			return false;
		}else {
			$('#regusername').addClass("valid");
			$('#regusername').removeClass("invalid");
            $("#erusername").text("");
			return true;
		}		
	}
	
	
	function checkpassword(){
		if(password == ""){
			$('#regpassword').addClass("invalid");
			$('#regpassword').removeClass("valid");
            $("#erparent").text("Password Must Not Empty");
			return false;
		}else if(passwordlength <5){
            $('#regpassword').addClass("invalid");
            $('#regpassword').removeClass("valid");
			$('#erpassword').text("password should be at least 5 digit");
			return false;
		}else {
			$('#regpassword').addClass("valid");
			$('#regpassword').removeClass("invalid");
            $("#erpassword").text("");
			return true;
		}		
	}
	
	function checkconpass(){
		if(conpass !== password){
			$('#regconpass').addClass("valid");
			$('#regconpass').removeClass("invalid");
			$('#erconpass').text("confirm password should be matched with password");
			return false;
		}else {
			$('#regconpass').addClass("valid");
			$('#regconpass').removeClass("invalid");
            $('#erconpass').text("");
			return true;
		}
	}
	
	
	function validation (){
		
		if(!checkfullname()){
			return false;
		}
		
		if(!checkemail()){
			return false;
		}
		
		if(!checkusername()){
			return false;
		}
		
		if(!checkpassword()){
			return false;
		}

        if(!checkconpass()){
            return false;
        }
		
		return true;
	}
	
	$('#registration').click(function(event){
		event.preventDefault();

		
		if(validation()){
			alert("Registered Successfully");
		}else {
			alert("Registered Failed!");
		}
		
	});


});