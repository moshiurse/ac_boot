$(document).ready(function(){
	
	var fullname = $.trim($('#regfullname').val());
	var email = $.trim($('#regemail').val());
	var username = $.trim($('#regusername').val());
	var password = $.trim($('#regpassword').val());
	var conpass = $.trim($('#regconpass').val());
	
	var passwordlength = password.length;
	var conpasslength = conpass.length;
	
	function checkfullname(){
		if(fullname == ""){
			$('#regfullname').addClass("invalid");
			$('#regfullname').removeClass("valid");
			return false;
		}else {
			$('#regemail').addClass("valid");
			$('#regemail').removeClass("invalid");
			
			return true;
		}	
	}
	
	function checkemail(){
		
		if(email == ""){
			$('#regemail').addClass("invalid");
			$('#regemail').removeClass("valid");
			return false;
		}else {
			$('#regemail').addClass("valid");
			$('#regemail').removeClass("invalid");
			return true;
		}
		
	}
	
	
	function checkusername(){
		
		if(username == ""){
			$('#regusername').addClass("invalid");
			$('#regusername').removeClass("valid");
			return false;
		}else {
			$('#regusername').addClass("valid");
			$('#regusername').removeClass("invalid");
			return true;
		}		
	}
	
	
	function checkpassword(){
		if(password == ""){
			$('#regpassword').addClass("invalid");
			$('#regpassword').removeClass("valid");
			return false;
		}else if(passwordlength <5){
			$('#erpassword').text("password should be at least 5 digit");
			return false;
		}else {
			$('#regpassword').addClass("valid");
			$('#regpassword').removeClass("invalid");
			return true;
		}		
	}
	
	function checkconpass(){
		if(conpassword !== password){
			$('#regconpass').addClass("valid");
			$('#regconpass').removeClass("invalid");
			$('#erconpass').html("confirm password should be matched with password");
			return false;
		}else {
			$('#regconpass').addClass("valid");
			$('#regconpass').removeClass("invalid");
			return true;
		}
	}
	
	
	function validation (){
		if(checkfullname() && checkemail() && checkusername() && checkpassword() && checkconpass()){
			return true;
		}
	}
	
	$('#registration').click(function(event){
		
		if(validation()){
			alert("Registered Successfully");
		}else {
			alert("Registered Failed!");
		}
		
	});
	
	
});